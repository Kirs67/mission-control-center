/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kirs
 */
public class MakeCSV implements PacketParser.PacketAcceptor{
    FileWriter writer;
    
    float firstpress = 0;
    
    MakeCSV(){
        try {
            File file = new File("./GRANUM_telemetry.csv");
            if(!file.exists()) file.createNewFile();
            writer = new FileWriter(file, false);
        } catch (IOException ex) {
            Logger.getLogger(MakeCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void onDataPacket(DataPacket packet) {
        if(firstpress == 0) firstpress = (((packet.pressure * 5.0f / 1024.0f) / 5.0f ) - 0.04f)/0.009f;
        try {
            writer.write(Integer.toString(packet.number)+",");
            writer.write(Integer.toString(packet.time)+".");
            int millisec = packet.time_part*1000/31250;
            writer.write(Integer.toString(millisec)+",");
            writer.write(Float.toString(packet.temperature1/16.0f)+",");
            writer.write(Float.toString(packet.temperature2/10.0f)+",");
            float pressure = (((packet.pressure * 5.0f / 1024.0f) / 5.0f ) - 0.04f)/0.009f;
            writer.write(Float.toString(pressure)+",");
            int height = (int)(44330*(1.0 - (Math.pow((pressure/firstpress), 0.1903))));
            writer.write(Integer.toString(height)+",");
            writer.write(Float.toString(packet.humidity/10.0f)+",");
            writer.write(Float.toString((float)(1 - 1/Math.pow(Math.E,(packet.O2*5.0f/1024/151/100/0.2345))))+",");
            writer.write(Float.toString((float)Math.pow(10,((350 - packet.CO2/5000/1024/151)-27.55)/-160.61))+"\n");
            //writer.write(Integer.toString(packet.term)+",");
            //writer.write(Integer.toString(packet.seeds)+"\n");
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(MakeCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void onAccPacket(AccPacket packet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

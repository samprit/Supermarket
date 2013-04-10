/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author SampritBiswas
 */
public class WriteToServer {

    public void writeEmployee() {
        write("Employee.ser");
        /*System.out.println("Connecting");
        //String SFTPHOST = "10.20.30.40";
        String SFTPHOST = "cse.iitkgp.ac.in";
        int SFTPPORT = 22;
        String SFTPUSER = "sampritb";
        String SFTPPASS = "supermarket";
        String SFTPWORKINGDIR = "/public_html";

        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(SFTPWORKINGDIR);
            File f = new File("Employee.ser");
            channelSftp.put(new FileInputStream(f), f.getName());
            System.out.println("File transferred");
            return;
        } catch (Exception ex) {
            //ex.printStackTrace();
        }*/
    }

    public void writeStatistics() {
        write("Statistics.ser");
        
    }

    public void writeDataBase() {
        write("DataBase.ser");
        
    }

    //Extra------------------------------------------------
    public void writeItemType() {
        write("ItemType.ser");
        
    }
    
    public void writeManufacturer() {
        
        write("Manu.ser");
        
        
    }
    
    
    public void write(String filename) {
        System.out.println("Connecting");
        //String SFTPHOST = "10.20.30.40";
        String SFTPHOST = "cse.iitkgp.ac.in";
        int SFTPPORT = 22;
        String SFTPUSER = "sampritb";
        String SFTPPASS = "supermarket";
        String SFTPWORKINGDIR = "/public_html";

        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(SFTPWORKINGDIR);
            File f = new File(filename);
            channelSftp.put(new FileInputStream(f), f.getName());
            System.out.println("File transferred");

            return;
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }
}

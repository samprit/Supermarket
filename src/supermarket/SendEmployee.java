/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author SampritBiswas
 */
public class SendEmployee {
    
    /*ArrayList<Employee> emp = new ArrayList<>();
    
    public void send(){
        Socket s = null;
        ObjectOutputStream out = null;
        
        System.out.println("Connecting to Server ...");
        
        try {
            s = new Socket("localhost", 1401);
            
            out = new ObjectOutputStream(s.getOutputStream());
            
            ArrayList<Employee> list = new ArrayList<Employee>();
            
            /*for (int i = 0; i < 10; i++) {
                list.add("String" + i);
            }*/
            
       /*     list = emp;
            
            out.writeObject(list);
            out.flush();
            System.out.println("ArrayList sent to Server");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception ex) {
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (Exception ex) {
                }
            }
        }
    }*/
    
}

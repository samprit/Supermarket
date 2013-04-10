/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author SampritBiswas
 */
public class TempGUI extends JFrame{

    public TempGUI() throws HeadlessException {
        super("SuperMarket");
        setSize(780, 600);
        setLocation(350, 100);
        setLayout(new FlowLayout());
        JButton but = new JButton("",new ImageIcon("checkout1.gif"));
        but.setSize(40, 400);
        ImageIcon image = new ImageIcon("checkout1.jpg");
        but.setRolloverIcon(image);
        add(but);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        /*ImageIcon image = new ImageIcon("checkout1.jpg");
        g.drawImage(image.getImage(),0, 0, rootPane);
        Font f = new Font("Arial Bold", Font.BOLD, 35);
        g.setFont(f);
        g.setColor(Color.GREEN);
        g.drawString("WELCOME TO OUR SUPERMARKET", 100, 500);
        */
    }
    
    
    
    public static  void main(String[] args){
        TempGUI t = new TempGUI();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
    
}

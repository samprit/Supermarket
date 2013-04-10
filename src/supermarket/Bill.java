/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author SampritBiswas
 */
public class Bill implements Serializable {

    /**
     * Bill generated for the Array List of items bought by the customer
     */
    private ArrayList<Item> billItem;
    /**
     * Array List of bills (which is an Array List of Items + sellDate +
     * billNumber) stored in our statistics Database
     */
    private ArrayList<Bill> statistics;
    Date sellDate;
    int billNumber = 0;

    public Bill(ArrayList<Item> b) {

        billItem = b;
        sellDate = new Date();   
        getFromStatistics();
        printBill();
        addToFile();
    }

    public Bill() {
    }

    /**
     * Print the bill to a new GUI window
     */
    private void printBill() {
        //TODO print the bill use statistics
        PrintBillGUI print = new PrintBillGUI(billItem);
        print.setVisible(true);
        print.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        print.billText.setText("Bill : "+billNumber);
    }

    /**
     * Get the Array List of bills from our statistics Database and add the new
     * bill
     */
    private void getFromStatistics() {
        statistics = new ArrayList<>();
        statistics = new GetInfoFromFiles().getBills();
        if (billItem == null) {
            return;
        }
        int max = 0;
        for (Bill b : statistics) {
            if (b.billNumber > max) {
                max = b.billNumber;
            }
        }
        billNumber = max + 1;
        statistics.add(this);
    }

    /**
     * Add the Array List of bills to our Database
     */
    private void addToFile() {
        
        try {
            FileOutputStream fileStream = new FileOutputStream("Statistics.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(statistics);
            os.close();
        } catch (IOException ex) {
            System.out.println("\nFile Not Found!!!");
            ex.printStackTrace();
        }
        
        WriteToServer wr = new WriteToServer();
        wr.writeStatistics();
    }

    public ArrayList<Item> getBillItem() {
        return billItem;
    }
}

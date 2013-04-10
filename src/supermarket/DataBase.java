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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SampritBiswas
 */
public class DataBase implements Serializable{

    /**
     * ArrayList of items stored in our Database
     */
    private ArrayList<Item> dataBase;

    /**
     * Opens our Database
     */
    public DataBase() {

        dataBase = new ArrayList<>();

        openDataBase();
    }

    /**
     * Opens the database.ser file and copies the arraylist of items stored in
     * our Database into variable database
     */
    private void openDataBase() {

        dataBase = new GetInfoFromFiles().getItems();
    }

    /**
     * Add a new Item to our SuperMarket
     *
     * @param add Item to be added
     */
    public void addItem(Item add) {
        
        for(Item i : dataBase){
            
            if(i.getItemName().equalsIgnoreCase(add.getItemName()) && i.getManufacturer().equalsIgnoreCase(add.getManufacturer())){
                
                if(i.getPurchasePrice() == add.getPurchasePrice()){
                    if(i.getSellPrice() == add.getSellPrice()){
                        if(i.getWeight() == add.getWeight()){
                            if(i.getType().equalsIgnoreCase(add.getType())){
                                i.setNoOfItems(i.getNoOfItems()+add.getNoOfItems());
                                addToDataBase();
                                return;
                            }
                        }
                    }
                }
                
            }
            
        }
        
        dataBase.add(add);
        addToDataBase();
    }

    /**
     * Decrement an item from our Database after it has been sold to the
     * customer and bill has been generated
     *
     * @param del Item to be decremented
     * @param quantity number of items of the same type purchased by the
     * customer
     */
    public void decrementItem(Item del, int quantity) throws Exception {

        for (Item it : dataBase) {
            if (it.getID().equalsIgnoreCase(del.getID())) {
                it.setNoOfItems(it.getNoOfItems() - quantity);

                if (it.getNoOfItems() < 0) {
                    //TODO print an error

                    String message = "Error in DataBase";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error", JOptionPane.ERROR_MESSAGE);
                    throw (new Exception());
                } else if (it.getNoOfItems() == 0) {
                    dataBase.remove(it);
                }
                break;
            }
        }
    }

    /**
     * Updates our database, like updating the price of the items in our
     * database
     *
     * @param up Updated Item passed as argument here
     */
    public void updateItem(Item upIt) {

        for (Item it : dataBase) {
            if (it.getID().equalsIgnoreCase(upIt.getID())) {
                it = upIt;
                break;
            }
        }
        addToDataBase();
    }

    /**
     * Return our database containing arraylist of items
     *
     * @return ArrayList of Items
     */
    public ArrayList<Item> extractInfo() {
        return dataBase;
    }

    /**
     * Add the modified ArrayList of items to our Database
     */
    public void addToDataBase() {
        try {
            FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(dataBase);
            os.close();
        } catch (IOException ex) {
            System.out.println("\nFile Not Found!!!");
            ex.printStackTrace();
        }

        WriteToServer wr = new WriteToServer();
        wr.writeDataBase();
    }
}

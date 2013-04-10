/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SampritBiswas
 */
public class Test {
    
    public void getItemsFromCustomer() {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Item> arr = new ArrayList<>();
        Item it = new Item();
        System.out.println("\nEnter the Item ID : ");
        String ID = in.nextLine();
        it.setID(ID);
        System.out.println("\nEnter the number of items bought : ");
        int noOfItems = in.nextInt();
        in.nextLine();
        it.setItemsBought(noOfItems);
        it.setDateSold(new Date());
        
        arr.add(it);
        
        it = new Item();
        System.out.println("\nEnter the Item ID : ");
        ID = in.nextLine();
        it.setID(ID);
        System.out.println("\nEnter the number of items bought : ");
        noOfItems = in.nextInt();
        in.nextLine();
        it.setItemsBought(noOfItems);
        it.setDateSold(new Date());
        
        arr.add(it);
        try {
            MakeChangesToOurData make = new MakeChangesToOurData(arr);
        } catch (Exception ex) {
            
        }
    }
    
    public Item getNewItem() {
        Item add = new Item();
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter thr item detils : ");
        
        System.out.println("\nEnter thr item name and manufacturer : ");
        String itemName = in.nextLine(), manufacturer = in.nextLine();
        
        System.out.println("\nEnter thr product description : ");
        String productDescription = in.nextLine();
        
        System.out.println("\nEnter thr item type : ");
        String type = in.nextLine();
        
        System.out.println("\nEnter thr item prices : ");
        float sellPrice = in.nextFloat();
        in.nextLine();
        float purchasePrice = in.nextFloat();
        in.nextLine();
        
        System.out.println("\nEnter thr item weight : ");
        float weight = in.nextFloat();
        in.nextLine();
        
        System.out.println("\nEnter the number of items to be added : ");
        int noOfItems = in.nextInt();
        in.nextLine();
        
        add.setItemName(itemName);
        add.setManufacturer(manufacturer);
        add.setNoOfItems(noOfItems);
        add.setProductDescription(productDescription);
        add.setPurchasePrice(purchasePrice);
        add.setSellPrice(sellPrice);
        add.setType(type);
        add.setWeight(weight);
        add.generateID();
        return add;
    }
    
    public void addItemsToOurDatabase() {
        DataBase dat = new DataBase();
        dat.addItem(getNewItem());
    }
    
    public void extractDataFromDatabase() {
        DataBase dat = new DataBase();
        ArrayList<Item> arr = dat.extractInfo();
        
        int i = 0;
        for (Item it : arr) {
            System.out.println("\n\nItem number : " + i + "\n");
            it.printItemDetails();
            i++;
        }
    }
    
    public void viewStatistics() {
        ArrayList<Bill> bill = new GetInfoFromFiles().getBills();
        
        for (Bill b : bill) {
            
            System.out.println("\n\nBill number : " + b.billNumber + "\n");
            System.out.println("\n\nBill Date : " + b.sellDate + "\n");
            System.out.println("\nItems sold for this bill :");
            ArrayList<Item> it = b.getBillItem();
            int k = 1;
            for (Item i : it) {
                System.out.println("\nItem number : " + k + "\n");
                i.printItemDetails();
                k++;
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        Test t = new Test();
        t.addItemsToOurDatabase();
        t.addItemsToOurDatabase();
        t.addItemsToOurDatabase();
        
        
        System.out.println("\nExtracting items");
        t.extractDataFromDatabase();
        System.out.println("\nGet from users");
        t.getItemsFromCustomer();
        System.out.println("\nExtracting items");
        t.extractDataFromDatabase();
        t.viewStatistics();
        
    }
}

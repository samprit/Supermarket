/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Samprit Biswas Roll no : 11CS10038
 */
public class Item implements Comparable<Item>, Serializable {

    /**
     * 11 Bit Item ID
     */
    private String ID;
    private String itemName, manufacturer;
    private String productDescription;
    private String type;
    private float sellPrice, purchasePrice;
    private float weight;
    private int noOfItems;
    private int itemsBought = -1;
    private Date dateAdded = new Date(), dateSold;
    private Date avgDate;

    public void changePrice(float newSellPrice, float newPurchasePrice) {
        sellPrice = newSellPrice;
        purchasePrice = newPurchasePrice;
    }

    /**
     * Get the difference between the purchase date and sell date
     *
     * @return Date
     */
    public Date getAvgDate() {
        int seconds = (dateSold.getSeconds() - dateAdded.getSeconds());
        avgDate.setSeconds(seconds);
        int hrs = (dateSold.getHours() - dateAdded.getHours());
        avgDate.setHours(hrs);
        int mins = (dateSold.getMinutes() - dateAdded.getMinutes());
        avgDate.setMinutes(mins);
        int day = (dateSold.getDate() - dateAdded.getDate());
        avgDate.setDate(day);
        return avgDate;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public Date getDateSold() {
        return dateSold;
    }

    public int getItemsBought() {
        return itemsBought;
    }

    public String getID() {
        return ID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public String getType() {
        return type;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemsBought(int itemsBought) {
        this.itemsBought = itemsBought;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Generate a unique ID to our Items
     */
    public void generateID() {

        Manufacturer getManu = new Manufacturer();
        ItemType getItemID = new ItemType();

        ID = getItemID.getID(type);
        ID += "-" + getManu.getID(manufacturer);
        Random r = new Random();
        ID += "-" + r.nextInt(99999);
    }

    /**
     * Print the details of the items in console
     */
    public void printItemDetails() {
        System.out.println("\nItem ID : " + ID + "\n");
        System.out.println("\nItem Name : " + itemName + "\n");
        System.out.println("\nItem Type : " + type + "\n");
        System.out.println("\nItem description : " + productDescription + "\n");
        System.out.println("\nItem Manufacturer : " + manufacturer + "\n");
        System.out.println("\nNumber of Items : " + noOfItems + "\n");
        System.out.println("\nPurchase price : " + purchasePrice + "\n");
        System.out.println("\nSell price : " + sellPrice + "\n");
        System.out.println("\nDate added : " + dateAdded + "\n");
    }

    @Override
    public int compareTo(Item o) {
        if (ID.equalsIgnoreCase(o.ID)) {
            return 1;
        } else {
            return 0;
        }
        
    }
}

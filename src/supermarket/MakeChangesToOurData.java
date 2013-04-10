/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author SampritBiswas
 */
public class MakeChangesToOurData {

    ArrayList<Item> item;

    public MakeChangesToOurData(ArrayList<Item> i) throws Exception{
        item = i;
        
        /*
         * Inserting proper values to the fields of the Items in item
         */
        ArrayList<Item> getData = new GetInfoFromFiles().getItems();
        for(Item k : item){
            
            Date date = k.getDateSold();
            int number = k.getItemsBought();
            
            for(Item find : getData){
                if(find.getID().equalsIgnoreCase(k.getID())){
                    k=find;
                    break;
                }
            }          
            k.setDateSold(date);
            k.setItemsBought(number);
        }
        //TODO when two items are same
        Collections.sort(item);
        
        int size = item.size();
        int m=0;
        for(int j=0;j<size-1;j++){
            
            if(item.get(j).getID().equalsIgnoreCase(item.get(j+1).getID())){
                
                //TODO
                item.get(j).setItemsBought(item.get(j).getItemsBought()+item.get(j+1).getItemsBought());
                item.remove(j+1);
                j--;
                size=item.size();
            }
            
        }
        changeDataBase();        
        addBill();
        
    }

    /**
     * Add bill to our Database containing the previous bills
     * and print the bill
     */
    private void addBill() {
        Bill b = new Bill(item);
        
    }

    /**
     * Change the information of items bought by our customer in
     * our Database
     */
    private void changeDataBase() throws Exception{
        DataBase changeData = new DataBase();

        for (Item decre : item) {
            changeData.decrementItem(decre, decre.getItemsBought());
        }
        changeData.addToDataBase();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SampritBiswas
 */
public class ItemType implements Serializable {

    String[] tot = {"Grocerry", "Food", "etc"
    };
    String[] id = {"0", "1", "2"};
    String retID;
    
    
    public String typeName;
    public String typeId="0";

    public ItemType() {
        
    }

    public String getID(String s) {
        /*int i = 0;
        for (String find : tot) {
            if (find.equalsIgnoreCase(s)) {
                break;
            }
            i++;
        }
        retID = id[i];*/
        
        ArrayList<ItemType> itemType = new GetInfoFromFiles().getItemTypes();
        
        for(ItemType i : itemType){
            if(i.typeName.equalsIgnoreCase(s)){
                retID = i.typeId;
                break;
            }
        }
        
        return retID;
    }
}

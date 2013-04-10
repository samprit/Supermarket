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
public class Manufacturer implements Serializable {

    String[] tot = {"Amul", "Britannia", "Parle", "Kissan"
    };
    String[] id = {"12837", "43829", "56281", "64189"};
    String retID;
    String manuName;
    String manuId="0";

    public Manufacturer() {
    }

    public String getID(String s) {

        /*int i=0;
         for(String find : tot){
         if(find.equalsIgnoreCase(s)){
         break;
         }
         i++;
         }*/

        ArrayList<Manufacturer> manu = new GetInfoFromFiles().getManufacturer();
        retID="";
        
        for (Manufacturer i : manu) {
            if (i.manuName.equalsIgnoreCase(s)) {
                retID = i.manuId;
                return i.manuId;
            }
        }

        return retID;

    }
}

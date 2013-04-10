/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ProgressMonitorInputStream;

/**
 *
 * @author SampritBiswas
 */
public class GetInfoFromFiles {

    /**
     * Get the Array List of employees stored in our Database
     *
     * @return ArrayList of Employee
     */
    public ArrayList<Employee> getEmployeeInfo() {

        ArrayList<Employee> getEmp = new ArrayList<>();

        Http h = new Http();
        h.getEmployee();

        if (h.getEmp != null) {
            getEmp = h.getEmp;

            try {
                
                FileOutputStream fileStream = new FileOutputStream("Employee.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(getEmp);
                os.close();
            } catch (IOException e) {
            }

            return getEmp;
        } else {

            try {
                FileOutputStream fileStream = new FileOutputStream("Employee.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(getEmp);
                os.close();

                try {
                    WriteToServer wr = new WriteToServer();
                    wr.writeEmployee();
                } catch (Exception e) {
                }
                return getEmp;
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }
        }


        /*try {
         FileInputStream fileStream = new FileInputStream("Employee.ser");
         try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
         Object one = os.readObject();
         getEmp = (ArrayList<Employee>) one;
         }
         } catch (IOException ex) {
         try {
         FileOutputStream fileStream = new FileOutputStream("Employee.ser");
         ObjectOutputStream os = new ObjectOutputStream(fileStream);
         os.writeObject(getEmp);
         os.close();
         } catch (IOException ef) {
         System.out.println("\nFile Not Found!!!");
         ef.printStackTrace();
         }
         } catch (ClassNotFoundException ec) {
         System.out.println("\nClass Not Found!!!");
         ec.printStackTrace();
         }*/
        return getEmp;
    }

    /**
     * Get ArryList of bills form our Database
     *
     * @return ArrayList of bills
     */
    public ArrayList<Bill> getBills() {

        ArrayList<Bill> statistics = new ArrayList<>();

        Http h = new Http();
        h.getStatistics();
        if (h.statistics != null) {
            statistics = h.statistics;

            try {
                FileOutputStream fileStream = new FileOutputStream("Statistics.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(statistics);
                os.close();
            } catch (IOException e) {
            }

            return statistics;
        } else {

            try {
                FileOutputStream fileStream = new FileOutputStream("Statistics.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(statistics);
                os.close();

                WriteToServer wr = new WriteToServer();
                wr.writeStatistics();
                return statistics;
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }
        }

        /*try {
         FileInputStream fileStream = new FileInputStream("Statistics.ser");
         try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
         Object one = os.readObject();
         statistics = (ArrayList<Bill>) one;
         }
         } catch (IOException ex) {
         try {
         FileOutputStream fileStream = new FileOutputStream("Statistics.ser");
         ObjectOutputStream os = new ObjectOutputStream(fileStream);
         os.writeObject(statistics);
         os.close();
         } catch (IOException ef) {
         System.out.println("\nFile Not Found!!!");
         ef.printStackTrace();
         }
         } catch (ClassNotFoundException ec) {
         System.out.println("\nClass Not Found!!!");
         ec.printStackTrace();
         }*/
        return statistics;
    }

    /**
     * Return the items stored in our Database
     *
     * @return ArrayList of items
     */
    public ArrayList<Item> getItems() {

        ArrayList<Item> dataBase = new ArrayList<>();

        Http h = new Http();
        h.getItems();
        if (h.dataBase != null) {
            dataBase = h.dataBase;

            try {
                FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(dataBase);
                os.close();
            } catch (IOException e) {
            }

            return dataBase;
        } else {

            try {
                FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(dataBase);
                os.close();

                WriteToServer wr = new WriteToServer();
                wr.writeDataBase();
                return dataBase;
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }
        }
        /*try {
         FileInputStream fileStream = new FileInputStream("DataBase.ser");
         try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
         Object one = os.readObject();
         dataBase = (ArrayList<Item>) one;
         }
         } catch (IOException ex) {
         try {
         FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
         ObjectOutputStream os = new ObjectOutputStream(fileStream);
         os.writeObject(dataBase);
         os.close();
         } catch (IOException ef) {
         System.out.println("\nFile Not Found!!!");
         ef.printStackTrace();
         }
         } catch (ClassNotFoundException ec) {
         System.out.println("\nClass Not Found!!!");
         ec.printStackTrace();
         }*/
        return dataBase;
    }

    //Extra---------------------------------------------------
    public ArrayList<ItemType> getItemTypes() {

        ArrayList<ItemType> itemType = new ArrayList<>();

        Http h = new Http();
        h.getItemTypes();
        if (h.itemType != null) {
            itemType = h.itemType;

            try {
                FileOutputStream fileStream = new FileOutputStream("ItemType.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(itemType);
                os.close();
            } catch (IOException e) {
            }

            return itemType;
        } else {

            try {
                FileOutputStream fileStream = new FileOutputStream("ItemType.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(itemType);
                os.close();

                WriteToServer wr = new WriteToServer();
                wr.writeDataBase();
                return itemType;
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }
        }
        /*try {
         FileInputStream fileStream = new FileInputStream("DataBase.ser");
         try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
         Object one = os.readObject();
         dataBase = (ArrayList<Item>) one;
         }
         } catch (IOException ex) {
         try {
         FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
         ObjectOutputStream os = new ObjectOutputStream(fileStream);
         os.writeObject(dataBase);
         os.close();
         } catch (IOException ef) {
         System.out.println("\nFile Not Found!!!");
         ef.printStackTrace();
         }
         } catch (ClassNotFoundException ec) {
         System.out.println("\nClass Not Found!!!");
         ec.printStackTrace();
         }*/
        return itemType;
    }

    public ArrayList<Manufacturer> getManufacturer() {

        ArrayList<Manufacturer> manu = new ArrayList<>();

        Http h = new Http();
        h.getManufacturer();
        if (h.manu != null) {
            manu = h.manu;

            try {
                FileOutputStream fileStream = new FileOutputStream("Manu.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(manu);
                os.close();
            } catch (IOException e) {
            }

            return manu;
        } else {

            try {
                FileOutputStream fileStream = new FileOutputStream("Manu.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(manu);
                os.close();

                WriteToServer wr = new WriteToServer();
                wr.writeManufacturer();
                return manu;
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }
        }
        /*try {
         FileInputStream fileStream = new FileInputStream("DataBase.ser");
         try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
         Object one = os.readObject();
         dataBase = (ArrayList<Item>) one;
         }
         } catch (IOException ex) {
         try {
         FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
         ObjectOutputStream os = new ObjectOutputStream(fileStream);
         os.writeObject(dataBase);
         os.close();
         } catch (IOException ef) {
         System.out.println("\nFile Not Found!!!");
         ef.printStackTrace();
         }
         } catch (ClassNotFoundException ec) {
         System.out.println("\nClass Not Found!!!");
         ec.printStackTrace();
         }*/
        return manu;
    }
}

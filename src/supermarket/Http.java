/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 *
 * @author SampritBiswas
 */
public class Http {

    ArrayList<Employee> getEmp = null;
    ArrayList<Bill> statistics = null;
    ArrayList<Item> dataBase = null;

    void getEmployee() {
        try {
            URL url;
            URLConnection urlConn;
            DataInputStream dis;

            //url = new URL("http://localhost/WriteToServer/dist/Employee.ser");
            //url = new URL("http://localhost/Employee.ser");
            url = new URL("http://cse.iitkgp.ac.in/~sampritb/Employee.ser");

            System.out.println("Got data");

            urlConn = url.openConnection();
            System.out.println("Got connection");
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);

            getEmp = (ArrayList<Employee>) deserialize(urlConn.getInputStream());

            //Creating a local copy
            try {
                FileOutputStream fileStream = new FileOutputStream("Employee.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(getEmp);
                os.close();
            } catch (IOException ex) {
                System.out.println("\nFile Not Found!!!");
                ex.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Error in Connecting!!!");

            //If connection cannot be established do offline work
            try {
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
            }
        }
    }

    void getStatistics() {
        try {
            URL url;
            URLConnection urlConn;
            

            //url = new URL("http://localhost/Statistics.ser");
            url = new URL("http://cse.iitkgp.ac.in/~sampritb/Statistics.ser");

            urlConn = url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);

            statistics = (ArrayList<Bill>) deserialize(urlConn.getInputStream());

            //Create a local copy

            try {
                FileOutputStream fileStream = new FileOutputStream("Statistics.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(statistics);
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }

        } catch (Exception ioe) {
            System.out.println("Error in Connecting!!!");

            //If connection cannot be established do offline working
            try {
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
            }
        }
    }

    void getItems() {
        try {
            URL url;
            URLConnection urlConn;
            DataInputStream dis;

            //url = new URL("http://localhost/DataBase.ser");
            url = new URL("http://cse.iitkgp.ac.in/~sampritb/DataBase.ser");

            urlConn = url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);

            dataBase = (ArrayList<Item>) deserialize(urlConn.getInputStream());

            //Create a local copy
            try {
                FileOutputStream fileStream = new FileOutputStream("DataBase.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(dataBase);
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Error in Connecting!!!");

            //If connection cannot be established do offline working
            try {
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
            }
        }
    }

    public Object deserialize(InputStream is) {
        ObjectInputStream in;
        Object obj;
        try {
            in = new ObjectInputStream(is);
            obj = in.readObject();
            in.close();
            return obj;
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        Http h = new Http();
        h.getEmployee();
    }
    //Extra-----------------------------------------------
    public ArrayList<ItemType> itemType = null;
    public ArrayList<Manufacturer> manu = null;

    void getItemTypes() {
        try {
            URL url;
            URLConnection urlConn;
            DataInputStream dis;

            //url = new URL("http://localhost/DataBase.ser");
            url = new URL("http://cse.iitkgp.ac.in/~sampritb/ItemType.ser");

            urlConn = url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);

            itemType = (ArrayList<ItemType>) deserialize(urlConn.getInputStream());

            //Create a local copy
            try {
                FileOutputStream fileStream = new FileOutputStream("ItemType.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(itemType);
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Error in Connecting!!!");

            //If connection cannot be established do offline working
            try {
                FileInputStream fileStream = new FileInputStream("ItemType.ser");
                try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                    Object one = os.readObject();
                    itemType = (ArrayList<ItemType>) one;
                }
            } catch (IOException ex) {
                try {
                    FileOutputStream fileStream = new FileOutputStream("ItemType.ser");
                    ObjectOutputStream os = new ObjectOutputStream(fileStream);
                    os.writeObject(itemType);
                    os.close();
                } catch (IOException ef) {
                    System.out.println("\nFile Not Found!!!");
                    ef.printStackTrace();
                }
            } catch (ClassNotFoundException ec) {
                System.out.println("\nClass Not Found!!!");
                ec.printStackTrace();
            }
        }
    }

    void getManufacturer() {
        try {
            URL url;
            URLConnection urlConn;
            DataInputStream dis;

            //url = new URL("http://localhost/DataBase.ser");
            url = new URL("http://cse.iitkgp.ac.in/~sampritb/Manu.ser");

            urlConn = url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);

            manu = (ArrayList<Manufacturer>) deserialize(urlConn.getInputStream());

            //Create a local copy
            try {
                FileOutputStream fileStream = new FileOutputStream("Manu.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(manu);
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Error in Connecting!!!");

            //If connection cannot be established do offline working
            try {
                FileInputStream fileStream = new FileInputStream("Manu.ser");
                try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                    Object one = os.readObject();
                    manu = (ArrayList<Manufacturer>) one;
                }
            } catch (IOException ex) {
                try {
                    FileOutputStream fileStream = new FileOutputStream("Manu.ser");
                    ObjectOutputStream os = new ObjectOutputStream(fileStream);
                    os.writeObject(manu);
                    os.close();
                } catch (IOException ef) {
                    System.out.println("\nFile Not Found!!!");
                    ef.printStackTrace();
                }
            } catch (ClassNotFoundException ec) {
                System.out.println("\nClass Not Found!!!");
                ec.printStackTrace();
            }
        }
    }
}

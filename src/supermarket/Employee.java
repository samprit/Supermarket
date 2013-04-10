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

/**
 *
 * @author SampritBiswas
 */
public class Employee implements Serializable {

    private String name, address, username, password;
    /**
     * contact number to be displayed in the bill along with the name of the
     * sales clerk
     */
    private String contactNo;
    private int employeeId;
    /**
     * accessData = true if employee is a manager else false
     */
    private boolean accessData;
    /**
     * Array list of employees stored in our database
     */
    ArrayList<Employee> getEmp;
    public boolean allowWrite = false;

    public Employee() {
        accessData = false;
        getNewId();
        addToFile();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAccessData(boolean accessData) {
        this.accessData = accessData;
    }

    private void getNewId() {

        getEmp = new ArrayList<>();

        getEmp = new GetInfoFromFiles().getEmployeeInfo();

        int max = 0;
        for (Employee e : getEmp) {
            if (e.getEmployeeId() > max) {
                max = e.getEmployeeId();
            }
        }
        employeeId = max + 1;
    }

    /**
     * Add a new Employee to our SuperMarket
     */
    public void addNewEmployee() {
        getEmp.add(this);
        addToFile();
    }

    /**
     * Add the changes modified to our data about the employees
     */
    private void addToFile() {


        try {
            FileOutputStream fileStream = new FileOutputStream("Employee.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(getEmp);
            os.close();
        } catch (IOException ex) {
            System.out.println("\nFile Not Found!!!");
            ex.printStackTrace();
        }

        try {
            WriteToServer wr = new WriteToServer();
            wr.writeEmployee();
        } catch (Exception e) {
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Employee> getGetEmp() {
        return getEmp;
    }

    public boolean getAccessDate() {
        return accessData;
    }
}
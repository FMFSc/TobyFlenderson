/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresourcesprogram;

/**
 *
 * @author fellipescirea
 */
public class Employee 
{
    public int ID;
    public String employeeName;
    public double salary;

    
    //getters and setters, auto generated, no modifications.
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Constructor method for the Employee class
     * @param ID: Employee ID number
     * @param employeeName: Employee name
     * @param salary: Employee's monthly salary
     */
    public Employee(int ID, String employeeName, double salary) {
        this.ID = ID;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    
    @Override
    public String toString()
    {
        return ("Employee info: " + this.employeeName + ", has the employee ID: "  + this.ID  + ", and makes CA$ "  + this.salary + " per month.");
    }
    
    
        
}

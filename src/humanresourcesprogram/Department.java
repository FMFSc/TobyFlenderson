package humanresourcesprogram;

/**
 *
 * @author fellipescirea
 */
public class Department
{
    private String deptName;
    private Employee[] employees;
    
    
//Getter and Setter for the department name, deptName.
    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }
    
    /**
     * Constructor for the department name
     * @param deptName: String representing the department name.
     */
    public Department(String deptName)
    {
        this.deptName = deptName;
    }
    
    /**
     * @Override method, replacing the Object class method.
     * @return 
     */
    @Override
    public String toString()
    {
        return "Department name: " + deptName;        
    }
}

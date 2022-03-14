import java.util.*;
public class Employee
{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public static void main(String[]args)
    {
        List<Employee> list=new ArrayList<Employee>();
        Employee e1= new Employee(101,"harish",50000);
        Employee e2= new Employee(102,"vinay",50000);
        Employee e3= new Employee(103,"rudra",50000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        for(Employee e:list)
        {
            System.out.println(e.getId()+","+e.getName()+","+e.getSalary());
        }

    }
}

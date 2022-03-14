public class Student
{
    private int rno;
    private String name;
    private String branch;
    private int year;

    public Student(int rno,String name,String branch,int year)
    {
        this.rno=rno;
        this.name=name;
        this.branch=branch;
        this.year=year;
    }
    public void setRno(int rno)
    {
        this.rno=rno;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
     public int getRno()
     {
         return rno;
     }
    public String getName()
    {
        return name;
    }
    public String getBranch()
    {
        return branch;
    }
    public int getYear()
    {
        return year;
    }
}

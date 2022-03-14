import java.util.List;

public class Student1
{
    private int rno;
    private String name;
    private String branch;
    private int year;
    private List<StudentFee1> fees;
    private List<Subjects1> subjects;
    private List<StudentMarks1> marks;
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
    public void setFees(List<StudentFee1> fees) {
        this.fees = fees;
    }
    public void setSubjects(List<Subjects1> subjects) {
        this.subjects = subjects;
    }
    public void setMarks(List<StudentMarks1> marks)
    {
        this.marks=marks;
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
    public List<StudentFee1> getFees()
    {
        return fees;
    }
    public List<Subjects1> getSubjects()
    {
        return subjects;
    }
    public List<StudentMarks1> getMarks()
    {
        return marks;
    }
}

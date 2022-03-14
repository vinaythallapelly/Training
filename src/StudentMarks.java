import java.util.List;

public class StudentMarks
{
    private int rno;
    private int year;
    private int sno;
    private int marks;
    public StudentMarks(int rno,int year,int sno,int marks)
    {
        this.rno=rno;
        this.year=year;
        this.sno=sno;
        this.marks=marks;
    }
    public void setRno(int rno)
    {
        this.rno=rno;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void setSno(int sno)
    {
        this.sno=sno;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
    public int getRno()
    {
        return rno;
    }
    public int getYear()
    {
        return year;
    }
    public int getSno()
    {
        return sno;
    }
    public int getMarks()
    {
        return marks;
    }

}

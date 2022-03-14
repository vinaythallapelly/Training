public class Subjects
{
    private int sno;
    private String sname;
    public Subjects(int sno,String sname)
    {
        this.sno=sno;
        this.sname=sname;
    }
    public void setSno(int sno)
    {
        this.sno=sno;
    }
    public void setSname(String sname)
    {
        this.sname=sname;
    }
    public int getSno()
    {
        return sno;
    }
    public String getSname()
    {
        return sname;
    }

}

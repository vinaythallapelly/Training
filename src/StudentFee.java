public class StudentFee
{
    private int rno;
    private double amt;
    private String date;

    public StudentFee(int rno, double amt, String date)
    {
        this.rno = rno;
        this.amt = amt;
        this.date = date;
    }

    public void setRno(int rno)
    {
        this.rno = rno;

    }

    public void setAmt(double amt)
    {
        this.amt = amt;

    }

    public void setDate(String date)
    {
        this.date = date;

    }
    public int getRno()
    {
        return rno;
    }
    public double getAmt()
    {
        return amt;
    }
    public String getDate()
    {
        return date;
    }
}

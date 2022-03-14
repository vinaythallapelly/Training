public class Benefits
{
    private int bid;
    private String bname;
    private String descr;
    public Benefits(int bid,String bname,String descr)
    {
        this.bid=bid;
        this.bname=bname;
        this.descr=descr;
    }
    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public String getBname()
    {
        return bname;
    }

    public void setBname(String bname)
    {
        this.bname = bname;
    }

    public String getDescr()
    {
        return descr;
    }

    public void setDescr(String descr)
    {
        this.descr = descr;
    }
}

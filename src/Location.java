public class Location
{
    private int locid;
    private String locname;
    private String loccou;

    public Location(int locid,String locname,String loccou)
    {
        this.locid=locid;
        this.locname=locname;
        this.loccou=loccou;
    }

    public int getLocid()
    {
        return locid;
    }
    public void setLocid(int locid)
    {
        this.locid = locid;
    }

    public String getLocname()
    {
        return locname;
    }

    public void setLocname(String locname)
    {
        this.locname = locname;
    }

    public String getLoccou()
    {
        return loccou;
    }

    public void setLoccou(String loccou)
    {
        this.loccou = loccou;
    }
}

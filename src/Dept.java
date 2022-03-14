public class Dept
{
    private int deptid;
    private String deptname;
    public Dept(int id,String name)
    {
        this.deptid=id;
        this.deptname=name;
    }
    public void setDeptId(int id)
    {
        this.deptid=id;
    }
    public void setDeptName(String name)
    {
        this.deptname=name;
    }
    public int getDeptId()
    {
        return deptid;
    }
    public String getDeptName()
    {
        return deptname;
    }
}

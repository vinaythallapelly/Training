import java.util.List;

public class Employ
{
    private int eid;
    private String ename;
    private double salary;
    private List<Location> loc;
    private List<Dept> depts;
    private List<Benefits> benefits;

    public Employ(int eid,String ename,double salary,List<Location> loc,List<Dept> depts,List<Benefits> benefits)
    {
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
        this.loc=loc;
        this.depts=depts;
        this.benefits=benefits;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }



    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Location> getLoc() {
        return loc;
    }

    public void setLoc(List<Location> loc) {
        this.loc= loc;
    }

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }
    public List<Benefits> getBenefits() {
    return benefits;
}

    public void setBenefits(List<Benefits> benefits) {
        this.benefits =benefits;
    }
}

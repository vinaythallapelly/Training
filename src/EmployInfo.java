import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployInfo
{
    public static void main(String[] args)
    {
        List<Dept> list=new ArrayList<>();
        Dept dept1=new Dept(101,"healthcare");
        Dept dept2=new Dept(102,"finance");
        Dept dept3=new Dept(103,"admin");
        Dept dept4=new Dept(104,"fraud");
        list.add(dept1);
        list.add(dept2);
        list.add(dept3);
        list.add(dept4);
        List<Location> list1=new ArrayList<>();
        Location loc1=new Location(1,"hyderabad","india");
        Location loc2=new Location(2,"chennai","india");
        Location loc3=new Location(3,"london","united kingdom");
        list1.add(loc1);
        list1.add(loc2);
        list1.add(loc3);
        List<Benefits> list2=new ArrayList<>();
        Benefits ben1=new Benefits(1,"lifeinsurance","Upto5lakh");
        Benefits ben2=new Benefits(2,"healthinsurance","Upto3lakh");
        Benefits ben3=new Benefits(3,"travel","providing twoway");
        list2.add(ben1);
        list2.add(ben2);
        list2.add(ben3);
        List<Employ> list3=new ArrayList<>();
        Employ emp1=new Employ(11,"harish",50000, Arrays.asList(loc1),Arrays.asList(dept4),Arrays.asList(ben1,ben2,ben3));
        Employ emp2=new Employ(12,"vinay",50000,Arrays.asList(loc1),Arrays.asList(dept1),Arrays.asList(ben1,ben2));
        Employ emp3=new Employ(13,"rudra",40000,Arrays.asList(loc2),Arrays.asList(dept2),Arrays.asList(ben1,ben2,ben3));
        Employ emp4=new Employ(14,"ramu",45000,Arrays.asList(loc3),Arrays.asList(dept1),Arrays.asList(ben2,ben3));
        Employ emp5=new Employ(15,"mahesh",50000,Arrays.asList(loc2),Arrays.asList(dept3),Arrays.asList(ben1,ben2,ben3));
        list3.add(emp1);
        list3.add(emp2);
        list3.add(emp3);
        list3.add(emp4);
        list3.add(emp5);
        //Task 1:
        System.out.println("Task 1:");
        list3.forEach(e->{e.getLoc().stream()
                .filter(employeee->employeee.getLoccou().equals("india")).forEach(em->{
                    System.out.println(e.getEname());
                });
        });
        // Task 2:
        System.out.println("Task 2:");
        list3.forEach(e->{e.getLoc().stream()
                .filter(employeee->(employeee.getLocname().equals("chennai")|| employeee.getLocname().equals("hyderabad"))).forEach(em->{
                    System.out.println(e.getEname());
                });
        });
        // Task 3:
        System.out.println("Task 3:");
        list3.forEach(e->e.getBenefits().forEach(e1->System.out.println(e.getEid()+","+e.getEname()+","+e1.getBid()+","+e1.getBname()+","+e1.getDescr())));
        // Task 4:
        System.out.println("Task 4:");
        list3.forEach(e->e.getDepts()
                .forEach(e1->e.getLoc()
                        .forEach(e2->System.out.println(e.getEid()+","+e.getEname()+","+e.getSalary()+","+e1.getDeptName()+","+e2.getLocname()+","+e2.getLoccou()))));
        // Task 5:
        System.out.println("Task 5:");
        list3.forEach(e->{e.getLoc().stream()
                .filter(employeee->(employeee.getLocname().equals("chennai") && employeee.getLoccou().equals("india"))).forEach(em->{
                    System.out.println(e.getEname());
                });
        });

    }
}

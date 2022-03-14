 import java.util.*;
public class StudentInfo1
{
    public static void main(String[] args)
    {
        List<Student1> student =new ArrayList<Student1>() ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter noOf Students :");
        int noOf=scan.nextInt();
        for(int i=1;i<=noOf;i++)
        {
            Student1 si=new Student1();
            System.out.println("Enter rno");
             int rno=scan.nextInt();
            System.out.println("Enter year");
             int year=scan.nextInt();
            si.setRno(rno);
            System.out.println("Enter Name");
            si.setName(scan.next());
            System.out.println("Enter Branch");
            si.setBranch(scan.next());
            si.setYear(year);
            StudentFee1 fi=new StudentFee1();
            fi.setRno(rno);
            System.out.println("Enter fee");
            fi.setAmt(scan.nextDouble());
            System.out.println("Enter date");
            fi.setDate(scan.next());
            si.setFees(Arrays.asList(fi));
            System.out.println("Enter noOfS");
            int noOfS= scan.nextInt();
            Subjects1[] s =new Subjects1[noOfS];
            StudentMarks1[] m=new StudentMarks1[noOfS];
            for(int j=1;j<=noOfS;j++)
            {
            Subjects1 sbj=new Subjects1();
            System.out.println("Enter sno");
            int sno=scan.nextInt();
            sbj.setSno(sno);
            System.out.println("Enter sname");
            sbj.setSname(scan.next());
           s[j]=sbj;
            StudentMarks1 mj=new StudentMarks1();
            mj.setRno(rno);
            mj.setYear(year);
            mj.setSno(sno);
            System.out.println("Enter marks");
            mj.setMarks(scan.nextInt());
            m[j]=mj;
            }
            si.setSubjects(Arrays.asList(s));
            si.setMarks(Arrays.asList(m));
            student.add(si);

        }
        //Task 1:
        System.out.println("Task 1:");
        for(Student1 sd:student)
        {
            if(sd.getYear()==1)
            {
                System.out.println(sd.getRno()+","+sd.getName()+","+sd.getBranch());
            }
        }
        //Task 2:
        System.out.println("Task 2:");
        for(Student1 sd:student)
        {
            System.out.println(sd.getRno()+","+sd.getName()+","+sd.getBranch());
            for (StudentFee1 studentFee1: sd.getFees())
            {
                System.out.println(studentFee1.getAmt()+","+studentFee1.getDate());
            }
        }
        //Task 3:
        System.out.println("Task 3");
        for(Student1 sd:student)
        {
            for(StudentMarks1 marks:sd.getMarks())
            {
                if(sd.getRno()== marks.getRno())
                {
                    for(Subjects1 subject:sd.getSubjects())
                    {
                        if(marks.getSno()==subject.getSno())
                        {
                            System.out.println(sd.getRno()+","+sd.getName()+","+subject.getSname()+","+marks.getMarks());
                        }
                    }
                }
            }


        }

    }
}

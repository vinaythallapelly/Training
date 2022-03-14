import java.util.*;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();
        System.out.println("Enter NoOf Students");
        int noStudents=scan.nextInt();
        System.out.println("Enter student details :");
        for(int i=1;i<=noStudents;i++)
        {
            list.add(new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt()));
        }
        /*Student s1 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
        Student s2 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
        Student s3 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
        Student s4 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
        Student s5 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5); */
        //Task 1:
        System.out.println("Task 1");
        list.stream().filter(s->s.getYear()==1).forEach(s1->System.out.println(s1.getRno() + "," + s1.getName() + "," + s1.getBranch()));
       /* for (Student student : list) {
            if (student.getYear() == 1)
            {
                System.out.println(student.getRno() + "," + student.getName() + "," + student.getBranch());
            }
        } */


        //Task 2:
        System.out.println(("Task 2"));
        List<StudentFee> list1 = new ArrayList<StudentFee>();
        System.out.println("Enter Fee details :");
        for(int i=1;i<=noStudents;i++)
        {
            list1.add(new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next()));
        }
       /* StudentFee sf1 = new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next());
        StudentFee sf2 = new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next());
        StudentFee sf3 = new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next());
        StudentFee sf4 = new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next());
        StudentFee sf5 = new StudentFee(scan.nextInt(), scan.nextDouble(), scan.next());
        list1.add(sf1);
        list1.add(sf2);
        list1.add(sf3);
        list1.add(sf4);
        list1.add(sf5); */
        list.forEach(s->{list1.stream().filter(s1->s1.getRno()==s.getRno()).
                forEach(s2->System.out.println(s.getName()+","+s.getBranch()+","+s.getYear()+","+ s2.getAmt()+","+s2.getDate()));});
       /* for (Student student : list) {
            for (StudentFee fee : list1) {
                if (fee.getRno() == student.getRno()) {
                    System.out.println(student.getName() + "," + student.getBranch() + "," + student.getYear() + "," + fee.getAmt() + "," + fee.getDate());
                }
            }
        } */

        //Task 3:
        System.out.println("Task 3");
        List<Subjects> list2 = new ArrayList<Subjects>();
        System.out.println("Enter NoOf Subjects");
        int noSubjects=scan.nextInt();
        System.out.println("Enter subject details");
        for(int i=1;i<=noSubjects;i++)
        {
            list2.add(new Subjects(scan.nextInt(), scan.next()));
        }
        /*Subjects sub1 = new Subjects(scan.nextInt(), scan.next());
        Subjects sub2 = new Subjects(scan.nextInt(), scan.next());

        list2.add(sub1);
        list2.add(sub2);  */

        List<StudentMarks> list3 = new ArrayList<StudentMarks>();
        System.out.println("Enter marks details:");
        for (Student student : list)
        {
            for (Subjects subject : list2)
            {
                list3.add(new StudentMarks(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
            }
        }
        list.forEach(s->
                list3.stream().filter(s2->s.getRno()==s2.getRno()).forEach(s3->
                        list2.stream().filter(s4-> s4.getSno()== s3.getSno())
                        .forEach(s5->System.out.println(s.getRno()+","+s.getName()+","+s5.getSname()+","+ s3.getMarks()))));

       /* for (Student student : list)
        {
            for (StudentMarks marks : list3)
            {
                if (student.getRno() == marks.getRno())
                {
                    for (Subjects subject : list2)
                    {
                        if (marks.getSno() == subject.getSno())
                        {
                            System.out.println(student.getRno() + "," + student.getName() + "," + subject.getSname() + "," + marks.getMarks());
                        }
                    }
                }
            }


        } */
        //Task 4:
        System.out.println(("Task 4"));
        list.sort(
                new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                Integer I1= o1.getYear();
                Integer I2= o2.getYear();
                return(I1).compareTo(I2);
            }
        });
         list.forEach(s->
                list3.stream().filter(s2->s.getRno()==s2.getRno()).forEach(s3->
                        list2.stream().filter(s4-> s4.getSno()== s3.getSno())
                        .forEach(s5->System.out.println(s.getRno()+","+s.getName()+","+s5.getSname()+","+ s3.getMarks()))));
        /*for (Student student : list)
        {
            for (StudentMarks marks : list3)
            {
                if (student.getRno() == marks.getRno())
                {
                    for (Subjects subject : list2)
                    {
                        if (marks.getSno() == subject.getSno())
                        {
                            System.out.println(student.getRno() +","+ student.getYear()+ "," + student.getName() + "," + subject.getSname() + "," + marks.getMarks());
                        }
                    }
                }
            }
        } */
    }
}






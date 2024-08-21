
public class Main {

    public static void main(String[] args) {
        Project p1 = new Project("Internal Project", 10);
        Project p2 = new Project("External Project", 5);
        
        FullTime e1 = new FullTime("Robin", 30, 50000, "IT", p1);
        PartTime e2 = new PartTime("Umang", 25, 20000, "HR", p2, 6);
        SummerIntern e3 = new SummerIntern("Ayush", 22, 20000, "Digital", p2, EmployeementStatus.Pending);
        ProjectIntern e4 = new ProjectIntern("Rahul", 23, 20000, "Digital", p2, EmployeementStatus.Pending);



        e1.display();
        e2.display();
        e3.display();
        e4.display();


    }
}

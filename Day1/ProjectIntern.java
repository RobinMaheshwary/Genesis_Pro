
public class ProjectIntern extends Employee implements LeaveManagement, TaxManagement {
    public EmployeementStatus status;
    public ProjectIntern(String name, int age, double salary, String department, Project assignedProject, EmployeementStatus status) {
        super(name, age, salary, department, assignedProject);
        this.status = status;
    }
    
    @Override
    public boolean applyForLeave(int numberOfDays, boolean isPaid) {
        return isPaid;
    }
    
    @Override
    public double calculateTax() {
        return 0.05*getSalary();
    }

    @Override
    public void display() {
        System.err.println("\n=====================================================\n");
        System.out.println("Project Intern Details");
        System.out.println("\nName: " + getName());
        System.out.println("\nAge: " + getAge());
        System.out.println("\nSalary: " + getSalary());
        System.out.println("\nDepartment: " + getDepartment());
        System.out.println("\nAssigned Project: " + getAssignedProject());
        System.out.println("\nStatus: " + status);
        System.err.println("\nTDS: "+ calculateTax());
        System.err.println("\n=====================================================\n");
    }

}

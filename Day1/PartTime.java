public class PartTime extends Employee implements LeaveManagement, TaxManagement {
    int contractDuration;
    public PartTime(String name, int age, double salary, String department, Project assignedProject, int contractDuration) {
        super(name, age, salary, department, assignedProject);
        this.contractDuration = contractDuration;
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
        System.out.println("Part Time Employee Details");
        System.out.println("\nName: " + getName());
        System.out.println("\nAge: " + getAge());
        System.out.println("\nSalary: " + getSalary());
        System.out.println("\nDepartment: " + getDepartment());
        System.out.println("\nAssigned Project: " + getAssignedProject());
        System.out.println("\nContract Duration: " + contractDuration);
        System.err.println("\n=====================================================\n");
    }
}

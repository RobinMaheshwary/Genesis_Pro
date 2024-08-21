public class FullTime extends Employee implements LeaveManagement, TaxManagement {
    public FullTime(String name, int age, double salary, String department, Project assignedProject) {
        super(name, age, salary, department, assignedProject);
    }
    
    @Override
    public boolean applyForLeave(int numberOfDays, boolean isPaid) {
        if(isPaid) {
            return true;
        }
        return false;
    }
    
    @Override
    public double calculateTax() {
        if (getSalary() * 12 > 500000) {
            return getSalary() * 12 * 0.2;
        } else {
            return 0.0;
        }
    }

    @Override
    public void display() {
        System.err.println("\n=====================================================\n");
        System.out.println("Full Time Employee Details");
        System.out.println("\nName: " + Name);
        System.out.println("\nAge: " + Age);
        System.out.println("\nSalary: " + Salary);
        System.out.println("\nDepartment: " + Department);
        System.out.println("\nAssigned Project: " + AssignedProject);
        System.err.println("\nIncome Tax: "+ calculateTax());
        System.err.println("\n=====================================================\n");
    }
}

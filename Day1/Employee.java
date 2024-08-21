
abstract class Employee { 
    protected String Name;
    protected int Age;
    protected double Salary;
    protected String Department;
    protected Project AssignedProject;

    public Employee(String name, int age, double salary, String department, Project assignedProject) {
        Name = name;
        Age = age;
        Salary = salary;
        Department = department;
        AssignedProject = assignedProject;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Project getAssignedProject() {
        return AssignedProject;
    }

    public void setAssignedProject(Project assignedProject) {
        AssignedProject = assignedProject;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + Name + ", Age=" + Age + ", Salary=" + Salary + ", Department=" + Department
                + ", AssignedProject=" + AssignedProject + "]";
    }

    public abstract void display();

}
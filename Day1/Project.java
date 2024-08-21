public class Project {
    protected String Name;
    protected int TeamSize;
    
    public Project(String name, int teamSize) {
        Name = name;
        TeamSize = teamSize;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getTeamSize() {
        return TeamSize;
    }

    public void setTeamSize(int teamSize) {
        TeamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Project [Name=" + Name + ", TeamSize=" + TeamSize + "]";
    }
}

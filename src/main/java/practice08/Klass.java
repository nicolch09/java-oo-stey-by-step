package practice08;

public class Klass {
    private Integer number;
    private String leader;

    public Klass(Integer klass){
        this.number = klass;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        this.leader = student.getName();
        student.isLeader(true);
    }

    public String getLeader(){
        return leader;
    }
}

package practice08;

public class Klass {
    private Integer number = 0;
    private String leader;

    public Klass(Integer klass){
        this.number = klass;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        this.leader = student.getName();
    }

    public String getLeader(){
        return leader;
    }
}

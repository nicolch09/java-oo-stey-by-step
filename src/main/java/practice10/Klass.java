package practice10;

public class Klass {
    private Integer number = 0;
    private String leader;
    private Student student;

    public Klass(Integer klass){
        this.number = klass;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public Student assignLeader(Student student){
        if(student.getKlass().getNumber() != getNumber() ){
            System.out.print("It is not one of us.\n");
            return student;
        } else{
            this.leader = student.getName();
            return student;
        }
    }

    public Student appendMember(Student student) {
        this.student = student;
        return student;
    }

    public Student getLeader(){
        return this.student;
    }
}

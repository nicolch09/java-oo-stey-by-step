package practice11;

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
        if(this.student != null){
            this.leader = student.getName();
            System.out.print("I am Tom. I know "+student.getName()+" become Leader of Class "+this.getNumber()+".\n");
        } else{
            System.out.print("It is not one of us.\n");
        }
        return student;
    }

    public Student appendMember(Student student) {
        System.out.print("I am Tom. I know " + student.getName() +" has joined Class "+ this.getNumber() +".\n");
        this.student = student;
        return student;
    }

    public Student getLeader(){
        return this.student;
    }
}

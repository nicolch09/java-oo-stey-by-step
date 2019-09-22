package practice08;

public class Student extends Person{
    private Integer id;
    private String name;
    private Integer age;
    private Integer klass;
    private Boolean isLeader = false;

    public Student(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.name = name;
        this.age = age;
        this.klass = klass.getNumber();
    }

    public void isLeader(Boolean isLeader){
        this.isLeader = isLeader;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(!isLeader) {
            return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
        }
        return super.introduce() + " I am a Student. I am Leader of Class " + this.klass + ".";
    }
}

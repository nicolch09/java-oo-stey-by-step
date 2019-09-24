package practice02;

public class Student extends Person{
    private String name;
    private Integer age;
    private Integer klass;

    public Student(String name, Integer age, Integer klass){
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class " + this.klass + ".";
    }
}

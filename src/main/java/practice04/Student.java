package practice04;

public class Student extends Person{
    private String name;
    private Integer age;
    private Integer klass;

    public Student(String name, Integer age, Integer klass){
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }
}

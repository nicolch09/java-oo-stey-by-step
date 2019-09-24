package practice04;

public class Student extends Person{
    private Integer klass;

    public Student(String name, Integer age, Integer klass){
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }
}

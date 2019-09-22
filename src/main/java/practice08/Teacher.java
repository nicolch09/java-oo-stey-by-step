package practice08;

public class Teacher extends Person{
    private Integer id;
    private String name;
    private Integer age;
    private Integer klass;

    public Teacher(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.name = name;
        this.age = age;
        this.klass = klass.getNumber();
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
        this.name = name;
        this.age = age;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
    }

    public String introduceWith(Student student){
        if(student.getKlass() != this.klass){
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
    }
}

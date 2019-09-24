package practice09;

public class Teacher extends Person{
    private Integer id;
    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        if(student.getKlass() != this.klass){
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
    }
}

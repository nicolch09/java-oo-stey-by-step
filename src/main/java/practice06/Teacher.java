package practice06;

public class Teacher extends Person{
    private String name;
    private Integer age;
    private Integer klass;

    public Teacher(String name, Integer age, Integer klass){
        super(name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, Integer age){
        super(name, age);
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
}

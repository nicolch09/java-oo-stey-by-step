package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass.getLeader() != null) {
            return super.introduce() + " I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }
}

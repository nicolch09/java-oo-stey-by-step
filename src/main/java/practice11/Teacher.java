package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private Integer id;
    private Klass klass;
    LinkedList<Klass> linkedList;

    public Teacher(Integer id, String name, Integer age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> linkedList){
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String message = "";
        if(klass == null && linkedList == null){
            message =  super.introduce() + " I am a Teacher. I teach No Class.";
        } else if(linkedList != null && klass == null){
            message =  super.introduce() + " I am a Teacher. I teach Class ";
            for(int i = 0; i < linkedList.size(); i++){
                message +=  linkedList.get(i).getNumber();
                if(i != linkedList.size() - 1){
                    message += ", ";
                } else{
                    message += ".";
                }
            }
        } else{
            message =  super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
        }
        return message;
    }

    public String introduceWith(Student student){
        for(int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).getNumber() == student.getKlass().getNumber()){
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses(){
        return linkedList;
    }

    public Boolean isTeaching(Student student){
        for(int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).getNumber() == student.getKlass().getNumber()){
                return true;
            }
        }
        return false;
    }
}

package practice04;

public class Worker extends Person{
    private String name;
    private Integer age;

    public Worker(String name, Integer age){
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return super.introduce() + " I am a Worker. I have a job.";
    }
}

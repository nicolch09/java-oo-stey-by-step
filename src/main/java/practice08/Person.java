package practice08;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
        equals(Person.this);
    }

    public boolean equals(Object object2){
        Person person = (Person) object2;
        if(object2 instanceof Person)
        {
            return getId() == person.id;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}

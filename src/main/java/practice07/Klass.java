package practice07;

public class Klass {
    private Integer number = 0;

    public Klass(Integer klass){
        this.number = klass;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }
}

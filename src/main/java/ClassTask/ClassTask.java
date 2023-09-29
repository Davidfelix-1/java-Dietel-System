package ClassTask;
public class ClassTask{

    private String name;
    private int number;
    boolean isOn;


    public ClassTask(String name , int number ,boolean isOn){
        this.name = name;
        this.number = number;
        this.isOn = true;
    }

    public ClassTask() {

    }
    public void setName(String name) {
        this.name = name ;
    }
    public String getName(){
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public void isOn(boolean isOn) {
        this.isOn = isOn;
    }
}










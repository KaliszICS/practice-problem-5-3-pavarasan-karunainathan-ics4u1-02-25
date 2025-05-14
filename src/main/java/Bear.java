public class Bear extends Animal{
    public Bear(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    public String animalSound(){return "Roar";}
    public void move(){
        this.position++;
    }
}
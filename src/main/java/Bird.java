public class Bird extends Animal{
    public Bird(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    public String animalSound(){return "Chirp";}
    public void move(){
        this.position += 50;
    }
}
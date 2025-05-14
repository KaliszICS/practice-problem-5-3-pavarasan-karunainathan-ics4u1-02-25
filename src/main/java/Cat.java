public class Cat extends Animal{
    public Cat(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    public String animalSound(){return "Meow";}
    public void move(){
        this.position += 5;
    }
}
public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken:cock cock";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

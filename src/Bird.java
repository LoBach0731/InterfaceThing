public class Bird implements Animal{
    @Override
    public String move(){
        return "I am flying!";
    }

    @Override
    public String makeSound(){
        return "chirp!";
    }

}

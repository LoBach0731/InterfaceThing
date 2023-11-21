public class Dog implements Animal, Devilish{
    @Override
    public String move(){
        return "I'm running!";
    }

    @Override
    public String makeSound() {
        return "bark!";
    }

    @Override
    public String misbehave(String string){
        return "I chewed up your " + string + " lol!!!!!!!";
    }
}

public class WalkAnimalCommand implements Command{

    private Animal animalDog;

    public WalkAnimalCommand(Animal animalDog) {
        this.animalDog = animalDog;
    }

    @Override
    public void execute() {
        animalDog.walk();
    }
}

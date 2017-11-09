public class RunAnimalCommand implements Command{

    private Animal animalDog;

    public RunAnimalCommand(Animal animalDog) {
        this.animalDog = animalDog;
    }

    @Override
    public void execute() {
        animalDog.run();
    }
}

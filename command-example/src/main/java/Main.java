public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog",15.6);
        Command walk = new WalkAnimalCommand(animal);
        Command run = new RunAnimalCommand(animal);

        walk.execute();
        run.execute();
    }


}

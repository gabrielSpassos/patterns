public class Animal {

    private String species;
    private double weight;

    public Animal(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void walk(){
        double newWeight = weight - 0.1;
        System.out.println("Animal name: "+species+"\nWeight before walk: "+weight+"\nNew weight: "+newWeight);
        this.weight = newWeight;
    }

    public void run(){
        double newWeight = weight - 0.3;
        System.out.println("Animal name: "+species+"\nWeight before run: "+weight+"\nNew weight: "+newWeight);
        this.weight = newWeight;
    }


}

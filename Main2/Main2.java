public class Main2 {
    public static void main(String[] args){
        System.out.println("Welcome to Kapoor Farm - here are our animals!");
        Animal pig = new Animal("Percy Pig", 4, "Oink!", false);
        Animal sheep = new Animal("Sharon Sheep", 4, "Baa!", false);
        Animal cow = new Animal("Colin Cow", 4, "Moo!", false);
        Animal horse = new Animal("Harry Horse", 4, "Neigh!", false);

        System.out.println();
        System.out.println("One day later...");

        System.out.printf(pig.losesALeg(2) +"\n");
        System.out.printf(sheep.losesALeg(2) +"\n");
        System.out.printf(cow.losesALeg(2) +"\n");
        System.out.printf(horse.losesALeg(2) +"\n");

        System.out.println();
        System.out.println("One day later...");

        System.out.printf(pig.noiseChanged("bark") +"\n");
        System.out.printf(sheep.noiseChanged("meow") +"\n");
        System.out.printf(cow.noiseChanged("roar") +"\n");
        System.out.printf(horse.noiseChanged("crunch") +"\n");
    }

}

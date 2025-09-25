public class Animal {
    public String name;
    public int noOfLegs;
    private String noise;
    public boolean hasWings;

    public Animal(String name, int number, String sound, boolean wings){
        this.name = name;
        this.noOfLegs = number;
        this.noise = sound;
        this.hasWings = wings;

        System.out.printf("This is %s. This animal has %d legs. It goes %s. Does it have wings? %b \n",name,number,sound, wings);

        }

    public String getNoise(){
        return this.noise;
    }

    public String losesALeg(int newLegs){
        this.noOfLegs = newLegs;
        return this.name + "'s legs have been halved! They have " + this.noOfLegs + " now!";
    }

    public String noiseChanged(String newNoise){
        this.noise = newNoise;
        return this.name + "'s noise has been mutated! They go " + this.noise + " now!";
    }


}

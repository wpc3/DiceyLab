public class Simulation {
//Field
int numberOfDie;
int numberOfTosses;

//Constructor to initialize our field
public Simulation(int numberOfDie, int numberOfTosses){
    this.numberOfDie = numberOfDie;
    this.numberOfTosses = numberOfTosses;
}

public void runSimulator(){
   Dice dice = new Dice(numberOfDie);//Create dice object based on number of die
   Bins bin = new Bins(numberOfDie, numberOfDie*6);//create bins object with bins low to high based on number of die
   bin.createBin();//initialize bins in Bin objects
   for(int i =0; i < numberOfTosses; i++){
       int result = dice.tossNumbersSum();//Rolls dice and gets the sum of the dice rolls
       bin.incrementBin(result);//Increments corresponding bin for the dice roll results
   }

}

public void printResults(){
    Bins bin = new Bins(numberOfDie, numberOfDie*6);//create bins object with bins low to high based on number of die
    System.out.println("***");
    System.out.println("Simulation of " + numberOfDie + " dice tossed for " + numberOfTosses + " Times.");
    System.out.println("***");
    System.out.println();

    //Iterate through each key (i) in binMap which represents each possible outcome of dice rolls
    for(int i : bin.binMap.keySet()){//returns a set of keys (bin numbers) in the bin map
        float ratio = (bin.binMap.get(i)/(float)numberOfTosses);//Calculates the ratio of occurences of each bin to total tosses
        int starCount = (int) (ratio*100);;//Calculates the number of * to display based on the ratio
        String stars = "*".repeat(starCount);//Creates a string of * characters based on starCount
        System.out.format("%3d : %8d : %.2f %s %n", i, bin.binMap.get(i),ratio,stars );
        //3d formats bin numbers as a 3 digit integer. //8d formats occurence count as an 8 digit integer
        //2f formats ratio as a floating pint number with 2 decimal places. s formats star string. n prints a newline character
    }
}

public static void main(String[] args){
    Simulation simulation = new Simulation(2,1000000000);
    simulation.runSimulator();//Runs the simulation
    simulation.printResults();//Prints the results of the simulation
}


}

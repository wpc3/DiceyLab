public class Dice {

//Field
private int numberOfDie;

    //Constructor to create number of die
    public Dice(int numberOfDie) {
    this.numberOfDie = numberOfDie;
    }

    //Method to get max roll
    public int getMaxRoll(){

    return numberOfDie*6;
    }

    //Method to get min roll
public int getMinRoll(){
    return numberOfDie;
}

//The simulation of tossing die

public int tossNumbersSum() {
    int rollSum = 0;

    for (int i = 0; i < numberOfDie; i++) {
        rollSum += (int) (Math.random() * 6) + 1;
    }
return rollSum;

}

public static void main(String[] args){

    Dice dice = new Dice(2);//craps
    Dice dice2 = new Dice(5);//yatzee

    Integer toss1 = dice.tossNumbersSum();
    Integer toss2 = dice2.tossNumbersSum();

    System.out.println(toss1);
    System.out.println(toss2);


}





}



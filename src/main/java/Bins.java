import java.util.HashMap;

public class Bins {

//Field that will track what was rolled
int low = 0;
int high =0;


//Constructor to initialize high and low
public Bins(int low, int high){
    this.low = low;
    this.high = high;
}
//Creating our hash map that will store the rolls
static HashMap<Integer,Integer> binMap = new HashMap<>();

//initialize each bin in binMap with a count of zero
public void createBin(){
  for (int i = low; i <= high; i++){
      int temp = low++;//initialize temp to current value low and increments low by 1. creating bins 2 to 12
      binMap.put(temp,0);//gives each bin a value of zero
    }
}

//increments the count of the specified key (bin number) in binMap by 1.
public void incrementBin(int key){

    binMap.get(key);//retrieves current count of each bin
    binMap.put(key, binMap.get(key)+1);//Increments the count of the specified bin number by 1
}
//returns the count of rolls in the bin specified by key(bin number) from binMap
public int getBin(int key){
    return binMap.get(key);
}

public static void main(String[] args){


    Bins results = new Bins(2, 12); // for bins from 2..12
    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
    results.incrementBin(10); // should increment bin # 10
    System.out.println(numberOfTens);

}


}

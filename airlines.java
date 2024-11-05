/*
 * class header, creates airlines class with the arrays cancels and delayMinutes.
 */
public class airlines {
  
private String[] cancels;
private double[] delayMinutes;

/*
 * assigns the arrays cancels and delayMinutes the values in the cancelsFile and delaysFile using an argument.
 * the cancels.txt and delays.txt substitute the values in cancelsFile and delaysFile in the DataRunner.java.
 */ 
public airlines(String cancelsFile, String delaysFile) {
  cancels = FileReader.toStringArray(cancelsFile);
  delayMinutes =  FileReader.toDoubleArray(delaysFile);
}

/*
 * no argument constructor.
 */ 
  public airlines() {
    
  }

/*
 * toString that provides a header in the console log for the data that's presented through the methods.
 * It uses the length of delayMinutes to find the number of flights the data was extracted from.
 */ 
  public String toString() {
    return "Hello! Out of a set of " + delayMinutes.length + " flights, we've gathered the following data: " + "\n" + cancelsOutOfTotalFlights() + "\n" + "The average delay time in minutes: " + delayTimeAverage();
      }
  
/*
 * calculates the number of flights that were canceled by traversing through the list and picking out the trues.
 */ 
  
  public String cancelsOutOfTotalFlights() {
    int trues = 0;
    for(String cancel : cancels) {
      if(cancel.equals("true")) {
        trues++;
      }
    }
    return trues + " out of " + delayMinutes.length + " flights were cancelled.";
  }

/*
 * calculates the average delay time by adding all of the values in the delayMinutes array up under a
 * totalDelay double and then dividing by the length of the delayMinutes array.
 */ 
  
  public double delayTimeAverage() {
  double totalDelay = 0;
    
        for (double delay : delayMinutes) {
            totalDelay += delay;
        }
    
    return totalDelay / delayMinutes.length;
  }
  
}
import java.util.Scanner;
public class StopWatch{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter the StopWatch Programm");
System.out.println("------");
System.out.println("Plss Enter to start The Stoopwatch");
scanner.nextLine();
long startTime = System.currentTimeMillis();
System.out.println("Stopwatch Started!");
System.out.println("Press Enter to stop the stopWatch");
scanner.nextLine();
long stopTime = System.currentTimeMilis();
long elapsedtime = stopTime - startTime;
System.out.println("Stopwatch Stopped");
System.out.println("Elapsed time:" +elapsedTime+ "millklisecond");
}
}


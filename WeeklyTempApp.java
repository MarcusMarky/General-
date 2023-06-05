import java.util.Scanner;

public class WeeklyTempApp {
    public static void main(String[] args) {
        int [] weeklyTemp = {0, 0, 0, 0, 0, 0, 0};
        //HW2:
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter here 7 temperatures from your local area: ");

        for (int i = 0; i < 7; i++) {
            if(i == 0){
                System.out.println("Monday temperature is: ");
            } else if (i == 1) {
                System.out.println("Tuesday temperature is: ");
            } else if (i == 2) {
                System.out.println("Wednesday temperature is: ");
            } else if (i == 3) {
                System.out.println("Thursday temperature is: ");
            } else if (i == 4) {
                System.out.println("Friday temperature is: ");
            } else if (i == 5) {
                System.out.println("Saturday temperature is: ");
            } else if (i == 6) {
                System.out.println("Sunday temperature is: ");
            }  
            weeklyTemp[i] = in.nextInt();
        }
       
        System.out.println("Recorded  "+ weeklyTemp.length + " temperatures!");
        //HW1: 
        for (int i = 0; i < 5; i++) {
            weeklyTemp[i] = in.nextInt();
            System.out.println(weeklyTemp[i]);        
        }
    }
}

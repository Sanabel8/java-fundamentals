/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        
        System.out.println(Arrays.toString(roll(6)));

        int[] testArray = roll(3);
                System.out.println(Arrays.toString(testArray));

        System.out.println("if the array containes Duplicates : " + containsDuplicates(testArray));


        System.out.println("average of arrray : " + avergeOfArray(testArray));

        //arays of arrays
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("array of lawest avg : " + Arrays.toString(lowestAverge(weeklyMonthTemperatures)));


    }

    public String getGreeting() {
        return "Hello World!";
    }
//the first way to solve the problem.
    public static int[] roll(int n) {
        Random random = new Random();
        int []rollArray =new int[n];
        int sidesCount =6;
        for(int i=0 ; i <n ; i++){
       int randomNumber=random.nextInt(sidesCount) + 1;
       rollArray[i] = randomNumber;
         }
       return rollArray;
    }
    //seconde way to solve the problem
    public static int[] roll2(int n) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int []rollArray =new int[n];
        for(int i=0 ; i <n ; i++){
            int rand = (int) (Math.random() * range) + min;
            rollArray[i] = rand;
        }
        return rollArray;
    }

//the problem 2
    public static boolean containsDuplicates (int [] xArray){
        for (int i = 0; i < xArray.length ; i++) {
            for (int j = i+1; j < xArray.length ; j++) {
                if (xArray[i] == xArray[j]) {
                    return true;
                }

            }

        }
        return false;
    }
  public static float avergeOfArray(int[] arr){
        int sum=0;
//      for (int i: arr) { // i is element
//          sum =sum+i;
//      }
      for (int i = 0; i < arr.length; i++) {
          sum =sum+arr[i];    // i is conter (index)
      }
      return (float)  sum / arr.length;
   }

   public static int[] lowestAverge(int[][] arr){
    float[] avgOfArr= new float[arr.length];
       for (int i = 0; i < arr.length; i++) {
//           avgOfArr[i] = avergeOfArray(arr[i]);
           int n=arr[i].length;
           double sum = 0;
           for(int x=0 ; x<arr[i].length ; x++){
               sum+=arr[i][x];
           }
           avgOfArr[i]= (float) (sum/n);
           System.out.println("the average of array "+ i +" =>"+  avgOfArr[i]);
       }
       float copmare =avgOfArr[0];
       int index =0;
       for (int i = 0; i < avgOfArr.length; i++) {
           if (copmare >= avgOfArr[i]){
               copmare =avgOfArr[i];
               index=i;
           }

       }

return arr[index];


    }

}


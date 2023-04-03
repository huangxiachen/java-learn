import java.util.*;
import java.io.*;
public class Java_1 {
        //**********found**********
        static long sum = 0;
        public static void main(String[] args) {
                 //**********found**********
                 for (int counter = 0 ; counter <= 10; counter++){
                       System.out.printf("%d! = %d\n", counter, factorial(counter));
                       sum=sum+factorial(counter);
                 }
                 System.out.println("sum="+sum);
        }
        //**********found**********
        public static long factorial(long number ) {
                 if (number <= 1)
                       return 1;
                 else
                       return number * factorial(number - 1);
        }
}
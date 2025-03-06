import  java.util.*;
public class enhanced_for_loop {
              public static void main(String [ ] args){
                      Scanner sc=new Scanner(System.in);
                       int i=0;
                       System.out.println("enter the limit:");
                       int n=sc.nextInt( );
                       System.out.println("enter the marks:");
                       int marks [ ]=new int [n];
                       while (i<n){
                             marks [i] =sc.nextInt( );
                              i++; // incrementing index value 
                        }
                        System.out.println("the marks are:");
                        // impementing enhanced for loop
                         for (int nn:marks){
                                  System.out.println(nn);
                          }
                          sc.close( );
             }
}                  
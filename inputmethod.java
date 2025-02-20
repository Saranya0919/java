import java.util.Scanner;
public class inputmethod {
              public static void main (String[]args){
              Scanner scanner=new Scanner(System.in);
              System.out.println("Enter your name:");
              String name=scanner.next( );
              scanner.nextLine( );
              System.out.println("Enter your college name:");
              String college=scanner.nextLine( );
              System.out.println("Enter your roll number:");
              int rollnumber=scanner.nextInt( );
              System.out.println("Enter your 1st year marks percentage:");
              float marks=scanner.nextFloat( );
              scanner.close( );
              System.out.println("-------your details-------\n");
              System.out.println("name:"+name);
              System.out.println("\ncollege:"+college);
              System.out.println("\nroll no:"+rollnumber);
              System.out.println("\npercentage:"+marks);
              }
}
              
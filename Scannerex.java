import java.util.Scanner;
    class calculator {
        public static void main(String[ ] args) {
                 char operator;
                 Double number1,number2, result;
                Scanner scanner= new Scanner(System.in);
                System.out.print("enter operator (either +, -, * or /):");
                operator = scanner.next( ).charAt(0);
                System.out.print("enter number1 and number2:");
                number1= scanner.nextDouble( );
                number2= scanner.nextDouble( );
                switch (operator) {
                   case '+':
                        result=number1 +number2;
                        System.out.print(number1+"+" + number2 + "=" + result);
                        break;
                    case '-':
                        result=number1 -number2;
                        System.out.print(number1 +"-" + number2 + "=" + result);
                        break;
                     case '*':
                        result=number1 *number2;
                        System.out.print(number1 +"*" + number2 + "=" + result);
                        break;
                     case '/':
                        result=number1 /number2;
                        System.out.print(number1 +"/" + number2 + "=" + result);
                        break;
                    default:
                        System.out.print("Invalid operator!");
                        break;
                    }
}
}
      
      
                  
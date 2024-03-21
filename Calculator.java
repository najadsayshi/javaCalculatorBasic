import java.util.Scanner;

public class Calculator{
        public static void main (String args[])
        {
            int num1,num2;
            int operation;
            float result=0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number");
            num1 = scanner.nextInt();
            System.out.println("Enter the second number");
            num2 = scanner.nextInt();
            System.out.println("Enter the opertations\n1 to add\n2 to subtract\n3 to multiply\n4 to divide");
            operation = scanner.nextInt();

            if (operation==1)
            {
                result=num1+num2;       
            }
            else if (operation==2)
            {
                result=num1-num2;
            }
            else if (operation==3)
            {
                 result=(num1*num2);
            }
            else if (operation==4)
            {
                 result=(float) num1/num2;
            }
            else
            {
                System.out.println("Wrong input");
                return;
            }
            System.out.println(result);

        }

        
}
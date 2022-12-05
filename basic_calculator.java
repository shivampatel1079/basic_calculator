import java.util.Scanner;

public class basic_calculator {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    float num1,num2;
    System.out.println("Basic Calculator");

    while (true) {
        System.out.print("\nEnter First number  : ");
        num1=sc.nextFloat();
        System.out.print("Enter Second number : ");
        num2= sc.nextFloat();
        System.out.println("\n1=Addition\n2=Subtraction\n3=Multiplication\n4=Division\n5=exit");
        System.out.print("\nSelect your operation : ");
        float n = sc.nextFloat();

        if (n==1)
        {
            System.out.println("Addition is : "+(num1+num2));
        }
        else if (n==2)
        {
            System.out.println("Subtraction is : "+ (num1-num2));
        }
        else if (n==3)
        {
            System.out.println("Multiplication is : "+ (num1*num2));
        }
        else if (n==4)
        {
            System.out.println("Division is : "+(num1/num2));
        }
        else if (n==5)
        {
            break;
        }
        else
        {
            System.out.println("\nSelected Wrong operator...\nTry to select between 1 to 4");
        }

    }

}

}

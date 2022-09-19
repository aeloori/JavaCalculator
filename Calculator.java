
import java.util.Scanner;
class Calculator
{
    static int gate=0;

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Select and option to perfom operations");
            System.out.println("--------------------------------------");
            System.out.println();
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Mulitplication");
            System.out.println("Enter 4 for Division");
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.print("Your answer is : ");
            short opt=sc.nextShort();
            System.out.println();
            // using switch to select the operation
            switch(opt)
            {
                case 1:
                {
                    addition();
                    break;
                }
                case 2:
                {
                    subtraction();
                    break;
                }
                case 3:
                {
                    multiplication();
                    break;
                }
                case 4:
                {
                    division();
                }
            }
        }
        while(gate<=0);
    }

    // performing addition in this method

    public static void addition()
    {
        Scanner sc=new Scanner(System.in);
        int value =0;
        int number=0;
        do
        {
            System.out.print("Enter numbers for Addition : ");
            number=sc.nextInt();
            value+=number;
            System.out.println("Current total is : "+value);
        }
        while(number !=0);
        System.out.println();
        System.out.println("Grand total of the inputs is : "+value);
        System.out.println();
        System.out.println("Enter 1 to exit the calculator ");
        System.out.println("Enter 0 to Continue with the calculator");
        gate=sc.nextInt();
    }

    // performing subtraction in this method

    static void subtraction()
    {
        Scanner sc=new Scanner(System.in);
        // int value=0;
        int number=0;
        System.out.println("Cation : Enter the numbers from greater value to lower value & and to perform addition in b/w add - before");
        System.out.println();
        System.out.print("Enter numbers for subtracting : ");
        int value=sc.nextInt();
        do
        {
            if(value ==0)
            {
                break;
            }
            System.out.print("Enter numbers for subtracting : ");
            number=sc.nextInt();
            value-=number;
            System.out.println("Current value of subtraction is : " +value);
        }
        while(number!=0);
        System.out.println();
        System.out.println("Grand value after subtracting is : "+value);
        System.out.println();
        System.out.println("Enter 1 to exit the calculator ");
        System.out.println("Enter 0 to Continue with the calculator");
        gate=sc.nextInt();
    }

    // performing multiplication operation in this method

    static void multiplication()
    {
        Scanner sc=new Scanner(System.in);
        long value=1l;
        long number;
        do
        {
            System.out.print("Enter number for performing multiplication : ");
            number=sc.nextLong();
            if(number!=0)
            {
                value*=number;
            }
            System.out.println("Current value is : "+value);
        }
        while(number!=0);
        System.out.println();
        System.out.println("Grand value after performing multiplication is : "+value);        
        System.out.println("Enter 1 to exit the calculator ");
        System.out.println("Enter 0 to Continue with the calculator");
        gate=sc.nextInt();
    }
    static void division()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for numerator : ");
        Double num1=sc.nextDouble();
        System.out.println("Enter a number for denominator : ");
        Double num2=sc.nextDouble();
        System.out.println("Value is : "+(num1/num2));
        // System.out.println("reminder is : "+(num1%num2));
        System.out.println();       
        System.out.println("Enter 1 to exit the calculator ");
        System.out.println("Enter 0 to Continue with the calculator");
        gate=sc.nextInt();
    }
}
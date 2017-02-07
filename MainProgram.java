import java.util.Scanner;
public class MainProgram
{
    
    public static void main (String[] args)
    {
        System.out.println("Welcome to Simple Calculator");
        Scanner keyboard = new Scanner(System.in);
        Calculator casio = new Calculator();
        int userChoice = 0;                     //holds the choice of the user
        double input = 0;                       //holds th e number input to be passed to calculator object
        
        do
        {
        displayMenu();
        userChoice = keyboard.nextInt(); 

        switch(userChoice)
        {
            case 1: System.out.print("   Enter a number to add: ");
                    input = keyboard.nextDouble();
                    casio.add(input);
                    System.out.println("------------------------------------");
                    System.out.print(casio.getScreenValue() - input +" + "+ input +" = " + casio.getScreenValue() + "\n");
                    System.out.println("------------------------------------");
                break;
                
            case 2: System.out.print("   Enter a number to subtract: ");
                    input = keyboard.nextDouble();
                    casio.subtract(input);
                    System.out.println("------------------------------------");
                    System.out.print(casio.getScreenValue() + input +" - "+ input +" = " + casio.getScreenValue() + "\n");
                    System.out.println("------------------------------------");
                break;
            case 3: System.out.print("   Enter a number to Multiply by: ");
                    input = keyboard.nextDouble();
                    casio.multiply(input);
                    System.out.println("------------------------------------");
                    System.out.print(casio.getScreenValue() / input +" * "+ input +" = " + casio.getScreenValue() + "\n");
                    System.out.println("------------------------------------");
                break;
            case 4: System.out.print("   Enter a number to divide by: ");
                    input = keyboard.nextDouble();
                    casio.divide(input);
                    System.out.println("------------------------------------");
                    System.out.print(casio.getScreenValue() * input +" / "+ input +" = " + casio.getScreenValue() + "\n");
                    System.out.println("------------------------------------");
                break;
            case 5: casio.clear();
                    System.out.println("------------------------------------");
                    System.out.print("   Current value cleared\n");
                    System.out.println("------------------------------------");
                break;
                
            case 6: System.out.print("   Enter either 1, 2 or 3 to choose memory location: ");
                    userChoice = keyboard.nextInt();
                    if (!(userChoice >= 1 && userChoice <= 3))                    
                    do
                    {   
                         System.out.println("   Invalid input, Please enter either 1,2 or 3");
                           userChoice = keyboard.nextInt();
                    }
                    while(!(userChoice == 1 || userChoice == 2 || userChoice == 3));
                    
                    casio.store(userChoice);
                    System.out.println("   "+casio.getScreenValue() + " Has been stored to memory location " + userChoice);
                    userChoice = 6;
                break;
            case 7: System.out.print("   Enter either 1, 2 or 3 to choose memory location: ");
                    userChoice = keyboard.nextInt();
                    
                    if (!(userChoice >= 1 && userChoice <= 3))
                    do
                    {
                        System.out.println("   Memory address invalid, Please enter either 1,2 or 3 ");
                        userChoice = keyboard.nextInt();   
                    }
                    while(!(userChoice == 1 || userChoice == 2 || userChoice == 3));
                    
                    casio.retrieve(userChoice);
                    System.out.println("   Retrieved " + casio.getScreenValue() + " from memory location " + userChoice);
                    userChoice = 7;
                    
                break;
            case 8: System.out.println("------------------------------------");
                    System.out.print("   Sequence: ");
                    casio.sequence();
                    System.out.println("\n------------------------------------");
                break;
            case 9: System.out.println("   Closing calculator");
                    break;
            default: System.out.println("   Please enter only numbers shown in the menu");
        }
    }
    while(!(userChoice == 9));
}
    
    public static void displayMenu()
    {
        System.out.print("\n1) Addition \n2) Subtraction \n3) Multiplication \n4) Division \n5) Clear \n6) Store value memory \n7) Retrieve from memory" +
        "\n8) Display sequence \n9) Exit Calculator \n   Enter number to choose action: ");
    }
}
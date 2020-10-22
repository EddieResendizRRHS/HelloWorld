/*
 * Name:  
 */

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Which program would you like to run? ");
    int choice = input.nextInt(); 

    if(choice == 1)
      HelloWorld.main(args);
    else if(choice == 2)
      Message.main(args); 
    else if(choice == 3)
      HelloWorldInMessageDialogBox.main(args);
    else 
      System.out.println("Invalid Option"); 

    System.out.print("Would you like to run another program? Y/N: ");
    String answer = input.next(); 

    if(answer.equals("Y"))
      Main.main(args); 
  }
}

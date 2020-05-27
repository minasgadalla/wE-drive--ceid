/**
 * This is the main class which runs, destroys, creates -- its the God
 */
import java.util.Scanner;
public class wEdrive {
 static void main() {
  int user_f_action;
  System.out.println("Hello To wE-drive. Please select from below");
  // show the first menu -- login, register, exit
  user_f_action = menu_a();
  
  switch(user_f_action){
    case 1:
    // login
    case 2:
    //register
    }
  
 }
 
 static int menu_a() {

  Scanner in = new Scanner(System.in);

  // print menu
  System.out.println("0. Exit");
  System.out.println("1. Login");
  System.out.println("2. Register");
  // handle user commands
  boolean quit = false;
  int menuItem;
  do {
   System.out.print("Choose menu item: ");

   menuItem = in .nextInt();

   switch (menuItem) {
    case 1:
     System.out.println("You've chosen to Login");
     return 1;
     
     
    case 2:
     System.out.println("You've chosen to Register");
     return 2;

    case 0:
     quit = true;
     break;

    default:
     System.out.println("Invalid choice.");
   }
  } while (!quit);

  System.out.println("Sorry to see you go :(");
  return 0;
 }
}
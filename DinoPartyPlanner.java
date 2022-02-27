import java.util.Scanner;

public class DinoPartyPlanner
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);//Scanner input
      
      
      //any key option
      String anyKey = "";
      
      //repeating texts
      String anyKeyTxt = "Press any key to continue.";
      String memberTxt = "Are you a member? (y/n): ";
      String adult = "Additional adults: ";
      String child = "Additional children: ";
      String total = "Total cost will be $";
      String invalid = "Invalid selection. Please try again.";
      String admission = "cost is for admission for up to 12 people.";
      String additional = "Enter in the amount of additional people: ";
      String welcome = "Welcome member.";
      
      //input party pick
      int partyPick = 0;
      
      //input member
      String member = "";
     
      //input additional guests
      int adAdult = 0;
      int adChild = 0;
      
      // cost
      int cost = 0;
      
      
      do
      {
         
         //Main Menu
         System.out.println("Welcome to the Dinosaur Park Party Planner.");
         System.out.println("Chose the type of party");
         System.out.println("1. Group Rate Admission Party");
         System.out.println("2. Bare Bones Deluxe package");
         System.out.println("3. Deluxe Party Package");
         System.out.println("4. Quit");
         System.out.print("Enter a choice: ");
         
         partyPick = in.nextInt();
         
            //Group Rate Admission Party option.
            while (partyPick == 1)
            {
               //submenu
               System.out.println("");
               System.out.println("Group Rate Admission Party cost is for 10 or more people.");
               System.out.println(additional);
               System.out.print(adult);
               adAdult = in.nextInt();
               System.out.print(child);
               adChild = in.nextInt();
              
               
               //cost formula
               cost = ((adAdult*5) + (adChild*4));
                  
               //check to see if there will be 10 or more guests   
                  if (adAdult + adChild < 10)
                  {
                     System.out.println("");
                     System.out.println("Group Party selection needs 10 or more guest. Please try again.");
                     System.out.print("Press M to return to main menu, or any other key to continue.");
                     in.nextLine(); //buffer
                     anyKey = in.nextLine();
                        
                        //option to return to main menu if guest count is low
                        if (anyKey.equalsIgnoreCase("M"))
                           {
                              System.out.println("");
                              break;
                           }
                  }
                  else
                  {
                     System.out.println("");
                     System.out.println(total + cost);
                     System.out.print(anyKeyTxt);
                     in.nextLine(); //buffer
                     anyKey = in.nextLine();
                     System.out.println("");
                     break;
                  }  
               }
               
               // Bare Bones option
               if (partyPick == 2)
               {
                  //checking if user is a member
                  in.nextLine(); //buffer
                  System.out.println("");
                  System.out.print(memberTxt);
                  member = in.nextLine();
                  System.out.println("");
                  
                   //Check if input is other than y and n
                   while (!member.equalsIgnoreCase("Y") && !member.equalsIgnoreCase("N"))
                  {
                     
                     System.out.println(invalid);
                     System.out.print(memberTxt);
                     member = in.nextLine();
                     System.out.println("");
                  }
                 
                  //Member option and price            
                  if (member.equalsIgnoreCase("Y"))
                  {
                     System.out.println(welcome);
                     System.out.println("Bare Bones " + (admission));
                     System.out.println(additional);
                     
                     System.out.print(adult);
                     adAdult = in.nextInt();
                     System.out.print(child);
                     adChild = in.nextInt();
         
                     cost = ((adAdult*3) + (adChild*3) + 99);
                     
                     System.out.println("");
                     System.out.println(total + cost);
                     System.out.print(anyKeyTxt);
                     in.nextLine(); //buffer
                     anyKey = in.nextLine();
                     System.out.println("");
   
                  }
                  
                  //Non Member option and price
                  else if (member.equalsIgnoreCase("N"))
                  {
                     System.out.println("Bare Bones " + (admission));
                     System.out.println(additional);
                     
                     System.out.print(adult);
                     adAdult = in.nextInt();
                     System.out.print(child);
                     adChild = in.nextInt();
         
                     cost = ((adAdult*3) + (adChild*3) + 119);
                     
                     System.out.println("");
                     System.out.println(total + cost);
                     System.out.print(anyKeyTxt);
                     in.nextLine(); //buffer
                     anyKey = in.nextLine();
                     System.out.println("");

                  }
                     
                 }
                 
                 // Deluxe Party option
                 if (partyPick == 3)
                 {
                     //checking if user is a member
                     in.nextLine(); //buffer
                     System.out.println("");
                     System.out.print(memberTxt);
                     member = in.nextLine();
                     System.out.println(""); 
                 
                     //Check if input is other than y and n
                     while (!member.equalsIgnoreCase("Y") && !member.equalsIgnoreCase("N"))
                     {
                        System.out.println(invalid);
                        System.out.print(memberTxt);
                        member = in.nextLine();
                        System.out.println("");
                     }
                     
                     //Member option and price            
                     if (member.equalsIgnoreCase("Y"))
                     {
                        System.out.println(welcome);
                        System.out.println("Deluxe Party " + (admission));
                        System.out.println(additional);
                        
                        System.out.print(adult);
                        adAdult = in.nextInt();
                        System.out.print(child);
                        adChild = in.nextInt();
            
                        cost = ((adAdult*3) + (adChild*5) + 199);
                        
                        System.out.println("");
                        System.out.println(total + cost);
                        System.out.print(anyKeyTxt);
                        in.nextLine(); //buffer
                        anyKey = in.nextLine();
                        System.out.println("");
   
                      }
                      
                      //Non Member option and price
                      else if (member.equalsIgnoreCase("N"))
                      {
                        System.out.println(welcome);
                        System.out.println("Deluxe Party " + (admission));
                        System.out.println(additional);
                        
                        System.out.print(adult);
                        adAdult = in.nextInt();
                        System.out.print(child);
                        adChild = in.nextInt();
            
                        cost = ((adAdult*3) + (adChild*5) + 225);
                        
                        System.out.println("");
                        System.out.println(total + cost);
                        System.out.print(anyKeyTxt);
                        in.nextLine(); //buffer
                        anyKey = in.nextLine();
                        System.out.println("");
   
                      }                
                 
                 } 
   
                 // If input is any number greater than or equal to 5
                 if (partyPick >= 5 || partyPick <=0)
                 {
                    System.out.println("");
                    System.out.println(invalid);
                    System.out.println("");                     
                 }
                  
      }
      //end program
      while(partyPick != 4);
      System.out.println("");
      System.out.println("Thank you for using The Dinosaur Park party planner program. Have a great day!");
   
   }

}
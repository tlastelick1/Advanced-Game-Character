/**
 * @author Trevor Lastelick
 * The character program implements an application that prompts the user for
 * various information needed to fill out every mv (member variable) of the class.
 * There are four string mv's and 6 integer mv's. It validates that the characterClass
 * matches the list. It validates that the character name is under 20 characters.
 * Validates gender is male or female, and that the race is elf, human, or dwarf.
 * Capitilization can be ignored. Validates that all integer mv's are indeed integers.
 * It then neatly displays all the information given to the prompts next to its 
 * corresponding attribute. Below that, it shows the total of all the integer attributes added together. 
 */
package lastelick_hw1;
import java.util.Scanner;
import java.util.*;

public class main {
    
// This class displays a prompt of available character classes to choose from
public static void displayClasses()
{
    System.out.printf("Available Character Classes: \n%s%s%s", "***********\n",
            "Fighter\nPaladin\nRanger\nWizard\nThief\n", "***********");
}
    /**
     * This is the main method which implements the class character. It also
     * makes use of that class's methods addTotal(int, int, int, int, int, int)
     * and displayTotal() (see class documentation for details. Outside of 
     * character class it utilizes the displayClasses() method which displays
     * a prompt. 
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        
    displayClasses(); // show options for classes
    
    // new Scanner object (inputStr) to accept input from prompts
    Scanner inputStr = new Scanner (System.in); 
    
    
    // prompt for the character class
    // validates that the user input matches a class from the list 
    String characterClass = validateCharacter(inputStr); 
    
    // prompt for the name
    System.out.println("What name: ");
    String name = inputStr.nextLine();
            
    // validate the name is under 15 characers long
    try {
        
        if (name.length() > 20)
            throw new Exception();
        
    } catch (Exception e){
        while (name.length() > 20)
        {
            System.out.println("Name must be less than 15 characters.");
            System.out.println("Enter a new name: ");
            name = inputStr.nextLine();
        }
        
    }
     
    // prompt for the gender
    System.out.println("What gender: ");
    String gender = inputStr.nextLine();
    
    // validate correct gender 
    try {
        if (!checkGender(gender));
            throw new IllegalArgumentException();
            
    }catch (IllegalArgumentException e)
            {
              while (!checkGender(gender))
              {
              System.out.println("Gender must be Male or Female. ");
              System.out.println("What gender: ");
              gender = inputStr.nextLine();
              }
            } 
    
    // prompt for the race
    System.out.println("What race (Human, Elf, or Dwarf): ");
    String race = inputStr.nextLine();
    
    // validate correct race selected
    try {
        if (!checkRace(race))
            throw new Exception();
    } catch (Exception e)
    {
        while (!checkRace(race))
        {
            System.out.println("Race must be Dwarf, Elf, or Human");
            System.out.println("Select a race: ");
            race = inputStr.nextLine();
        }
    }
      
    // prompt for strength
        int str = 0;
        System.out.println("Enter strength: ");
    
    // validate strength 
    try {    
        str = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        str = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
     
    // prompt for dexterity
    System.out.println("How much dexterity: ");
    int dex = 0;
    
    // validate dexterity 
    try {    
        dex = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        dex = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
    
    
    // prompt for constitution
    System.out.println("How much constitution: ");
    int con = 0;
    
    // validate for consitution
    try {    
        con = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        con = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
    
    
    // prompt for intellect
    System.out.println("How much intellect: ");
    int intel = 0;
    
    // validate intellect
    try {    
        intel = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        intel = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
    
    // prompt for wisdom
    System.out.println("How much wisdom: ");
    int wis = 0;
    
    // validate wisdom
    try {    
        wis = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        wis = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
    
    // prompt for charisma
    System.out.println("How much charisma: ");
    int cha = 0;
    
    // validate charisma
    try {    
        cha = inputStr.nextInt();
          
    } catch (InputMismatchException e) {
        
        // prompt user with error until inputs correctly.
        while (!inputStr.hasNextInt())
        {
            System.out.println("Enter an integer value: ");
            inputStr.nextLine();
        }      
        cha = Integer.parseInt(inputStr.nextLine()); // convert the string into an integer
    }
    
    // create an object of class character
    // input as parameters all data from the prompts
    character rpg = new character(name, gender, characterClass, race,
    str, dex, con, intel, wis, cha);
    
    // display the string attributes
    System.out.printf("\nName: %s\nGender: %s\nCharacterClass: %s\nRace: %s\n\n", 
    rpg.getName(), rpg.getGender(), rpg.getCharacterClass(), rpg.getRace());

    // display the integer attributes 
    System.out.printf("STR: %s\nDEX: %s\nCON: %s\nINT: %s\nWIS: %s\nCHA: %s\n", 
        rpg.getStr(), rpg.getDex(), rpg.getCon(), rpg.getInt(), rpg.getWis(), 
        rpg.getCha());
    
    // add together all the parameters (every integer value)
    int total = rpg.addTotal(str, dex, con, intel, wis, cha);
    
    // display the total value of all the integer attributes
    rpg.displayTotal(total);
   
    } // end main  
    
   
   // validates that the characterClass is the proper class 
   public static String validateCharacter(Scanner s)
   {
       System.out.println();
       System.out.println("Character class: ");
       String string = s.nextLine();
       
       // While the string is not a character class from the list.
       // Keep prompting the user till they type in a proper class. 
       while (!checkCharacter(string))
       {
           System.out.println("Must select a character class from the list provided.");
           System.out.println("Select a class: ");
           string = s.nextLine();
       }
       
          return string;  
   }
   
   /**
    * Will check to make sure the string matches the character options.
    * @param s Should be the users character class selection
    * @return true if user input matches the character list, false otherwise
    */
   public static boolean checkCharacter(String s)
   {
    boolean flag;
    
    if (s.equalsIgnoreCase("Paladin") || s.equalsIgnoreCase("Fighter") || 
            s.equalsIgnoreCase("Wizard") || s.equalsIgnoreCase("Ranger") ||
            s.equalsIgnoreCase("Thief"))
      flag = true;
    
    else 
        flag = false;
    
    return flag;
   }
   
   /**
    * Will check to make sure the string matches male or female
    * @param gender a string that denotes the sex 
    * @return True if string is male or female false otherwise
    */
   public static boolean checkGender(String gender)
   {
       boolean flag;
       
       if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") 
                || gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))
           flag = true;
       else
           flag = false;
       
       return flag;
   }
   
   /**
    * Will check to make sure the string matches the three races given
    * @param race The user's input when prompted for the race
    * @return True if string is elf, human, dwarf false otherwise
    * */
   public static boolean checkRace(String race)
   {
       boolean flag;
       
       if (race.equalsIgnoreCase("Dwarf") || race.equalsIgnoreCase("Elf") 
                || race.equalsIgnoreCase("Human"))
           flag = true;
       else
           flag = false;
       
       return flag;
   }
   
}// end entire program
package lastelick_hw1;
import java.util.Scanner;

public class character {
    
    private String name;
    private String gender;
    private String characterClass;
    private String race;
    
    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    
    // This default constructor is simply created so that if the mv's aren't
    // known ahead of time, a blank class object can be created and set later,
    // and the program won't error upon running.
    public character()
    {
        
    }
    
    /**
     * This parameterized constructor sets all the mv's (member variables) 
     * of the class
     * @param name  This is the first string parameter of constructor
     * @param gender This is the second string parameter of constructor
     * @param characterClass This is the third string parameter of constructor
     * @param race This is the fourth string parameter of the constructor
     * @param str This is the first integer parameter of the constructor
     * @param dex This is the second integer parameter of the constructor
     * @param con This is the third integer parameter of the constructor
     * @param intel This is the fourth integer parameter of the constructor
     * @param wis This is the fifth integer parameter of the constructor
     * @param cha This is the sixth integer parameter of the constructor
     */
    public character(String name, String gender, String characterClass, String race,
            int str, int dex, int con, int intel, int wis, int cha)
    {
    this.name = name;
    this.gender = gender;
    this.characterClass = characterClass;
    this.race = race;
    this.str = str;
    this.dex = dex;
    this.con = con;
    this.intel = intel;
    this.wis = wis;
    this.cha = cha;
    }// end constructor 
    
    //***********************
    // SETTERS
    //***********************
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public void setCharacter(String characterClass)
    {
        this.characterClass = characterClass;
    }
    
    public void setRace(String race)
    {
        this.race = race;
    }
    
    public void setStr(int str)
    {
        this.str = str;
    }
    
    public void setDex(int dex)
    {
        this.dex = dex;
    }
    
    public void setCon(int con)
    {
        this.con = con;
    }
    
    public void setInt(int intel)
    {
        this.intel = intel;
    }
    
    public void setWis(int wis)
    {
        this.wis = wis;
    }
    
    public void setCha(int cha)
    {
        this.cha = cha;
    }
    
    //***********************
    //GETTERS
    //***********************
    
    public String getName()
    {
        return this.name;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public String getCharacterClass()
    {
        return this.characterClass;
    }
    
    public String getRace()
    {
        return this.race;
    }
    
    public int getStr()
    {
        return this.str;
    }
    
    public int getDex()
    {
        return this.dex;
    }
    
    public int getCon()
    {
        return this.con;
    }
    
    public int getInt()
    {
        return this.intel;
    }
    
    public int getWis()
    {
        return this.wis;
    }
    
    public int getCha()    
    {
        return this.cha;
    }
    
/**
 * This method adds all the parameters (every integer attribute) together
 * and returns the sum in an integer called total
 * @param str This is the strength int attribute of the class
 * @param dex This is the dexterity int attribute of the class
 * @param con This is the constitution int attribute of the class
 * @param intel This is the intellect int attribute of the class
 * @param wis This is the wisdom int attribute of the class
 * @param cha This is the charisma int attribute of the class
 * @return total This is the total number of every param added together 
 */
    public int addTotal(int str, int dex, int con, int intel, int wis, int cha)
    {
        int total = str + dex + con + intel + wis + cha;
        return total;
    }

/**
 * This method neatly displays the total sum of every integer attribute of the
 * class 
 * @param total This is the total number of every integer attribute of the class
 */    
    public void displayTotal(int total)
    {
        System.out.printf("\nTOTAL: %s\n%s\n", total, "----------------"); 
    }
    
}// end class
   

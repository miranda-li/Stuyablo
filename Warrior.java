/*==============================================
Warrior Class
You will need to write a constructor that takes a String parameter for the name
You will need to write normal() and special() methods for Warrior
You will need to add a new method to Warrior called about()
This should be a static method with a String return type and no parameters
This method should return a brief description of the class as a String
==============================================*/

import java.io.*;
import java.util.*;

public class Warrior extends Character {

    public Warrior( String n ) {
	name = n;
	life = 125;
	strength = 40;
	defense = 80;
	attack = 1.0;
    }//end Constructor

    public String toString() {
	String s = name + "\t" + life + "\t" + strength + "\t" + defense + "\t" + attack;
	return s;
    }//end toString()

    public void special() {
	defense = 20;
	attack = 2.0;
    }//end special()

    public void normal() {
	defense = 80;
	attack = 1.0;
    }//end normal()

    public static String about() {
	String description = "WARRIOR \nThe Warrior is a brave a mighty character with a high defense and normal attack.  Warriors typically use their normal attack, which does a moderate amount of damage, but when properly agitated use a special attack known as Rage.  When this happens, warriors swing their swords in large circles with no heed to defense.  Although warriors are strong and reliable, sometimes they are too rash and get killed in one shot by a weak monster.";
	return description;
    }//end about()

    public static void main(String[] args) {
	Warrior m = new Warrior("Miranda");
	System.out.println(m.about());
	System.out.println(m);
    }//end main()
}//end class Warrior


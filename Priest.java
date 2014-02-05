/*======================================================
Priest Class
This must have the same methods as warrior 
constructor, normal, special and about
The behavior in these methods is up to you. You can have different values, add randomness, or any other change you might think of.
======================================================*/

import java.io.*;
import java.util.*;

public class Priest extends Character {

    public Priest ( String n ) {
	name = n;
	life = 170;
	strength = 30;
	defense = 30;
	attack = 0.9;
    }//end Constructor

    public String toString() {
	String s = name + "\t" + life + "\t" + strength + "\t" + defense + "\t" + attack;
	return s;
    }//end toString()

    public void normal() {
	defense = (int)(Math.random() * 20 + 20);
	attack = Math.random() + .5;
	life = life + (int)(Math.random() * 5 + 10);
    }//end normal()

    public void special() {
	defense = (int)(Math.random() * 100 + 50);
	attack = 0.0;
	life = life + (int)(Math.random() * 40 + 5);
    }//end special()

    public static String about() {
	String description = "PRIEST \nThe Priest is a healing class.  Priests do not do a lot of damage, but can heal themselves over time, thus taking down monsters slowly but steadily.  With the normal attack, priests do a little damage and heal themselves a bit.  With the special attack, priests do no damage but raise their defense and heal a lot.  This makes a priest very hard to kill.";
	return description;
    }//end about()

    public static void main(String[] args) {
	Priest m = new Priest("Mimi");
	System.out.println(m.about());
	System.out.println(m);
    }//end main()
}//end class Priest
/*======================================================
Monster Class - Extends Character

Constructor
Set the strength to a random number (I suggest a number in the range [20, 65)
For the other values, I suggest 150 for life, 20 for defense and 1 for attack
Does not take any parameters

=======================================================*/

import java.io.*;
import java.util.*;

public class Monster extends Character {

    public Monster() {
	strength = (int)(Math.random() * 45 + 20);
	life = 150;
	defense = 20;
	attack = 1;
    }//end Constructor

    public String toString() {
	String s = name + strength + life + defense + attack;
	return s;
    }//end toString()

    public static void main(String[] args) {
	Monster m = new Monster();
	System.out.println(m);
	m.lowerHitPoints(10);
	System.out.println(m);
    }//end main()
}//end class Monster

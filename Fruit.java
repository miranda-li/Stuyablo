/*==================================================
Fruit Class
Extends Character Class
Methods
   Constructor
   Normal
   Special
   About
   ================================================*/

import java.io.*;
import java.util.*;

public class Fruit extends Character {

    public Fruit( String n ) {
	name = n;
	life = 500;
	strength = 100;
	defense = 30;
	attack = 4.0;
    }//end Constructor

    public void special() {
	defense = 10;
	attack = Math.random() * 15;
    }//end special()

    public void normal() {
	defense = 30;
	attack = 4.0;
    }//end normal()

    public static String about() {
	String description = "FRUIT \nUndoubtably the best class there is.  Fruits have dangerously low defense (they can be chopped up very easily) but extraordinarily high attack and strength.  Its risky but rewarding special move is all-or-nothing, because if the Fruit doesn't kill the monster, it will certainly get killed.  Most people will probably stick with the safer normal move, so the fruit has slightly higher defense but lower attack.";
	return description;
    }//end about()
}//end class Fruit
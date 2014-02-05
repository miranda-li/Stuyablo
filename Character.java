/*=========================================================
Character Class

Instance variables
Name
Life (or hit points, if you prefer) (int)
Strength (int)
Defense (int)
Attack rating (double)

Methods
isAlive
Returns true/false based on if life > 0

getDefense
returns the value of the defense instance variable

getName
Returns the name

lowerHitPoints
Take an int parameter and decrease the life instance variable by that amount

attack
Takes a Character object as a parameter
Calculates damage using the following formula
damage = (strength * attack rating) - other Character's defense
damage should be an integer value
If the damage calculation results in a negative number, set the damage to 0
Calls a method called lowerHitPoints on the character object parameter
Returns the damage dealt


special and normal
===========================================================*/

import java.io.*;
import java.util.*;

public class Character {

    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive() {
	return life > 0;
    }//end isAlive()

    public String getName() {
	return name;
    }//end getName()

    public int getDefense() {
	return defense;
    }//end getDefense()

    public void lowerHitPoints( int damage ) {
	life = life - damage;
    }//end lowerHitPoints()

    public int attack( Character opponent ) {
	int damage;
	damage = (int)(strength * attack) - opponent.getDefense();
	if ( damage < 0 )
	    damage = 0;
	opponent.lowerHitPoints( damage );
	return damage;
    }//end attack

    public void special() {
    }//end special()

    public void normal() {
    }//end normal()


}//end Character class

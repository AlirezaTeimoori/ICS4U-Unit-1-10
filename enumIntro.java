
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-10         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program does nothing useful! --
//-- just shows that I have understood --
//-- how to make very basic use of enum--
//----------------------------------------

/*

One of the reasons we use enum over array is that enum is a data type and 
you can call the parameters by their names and even their belongings
for example you can call the color of a dog under the type of animals
but in arrays you can only call elements by their positions

enums are constant. you need to know all the posible values because
they will be fixed.

*/

import java.lang.Enum;

public class enumIntro {

    public static void main(String[] args) {
        for (SolarSystem element : SolarSystem.values()){ // for each element
            // Print the name of the name of the planet and the position
            System.out.println(element + "\t==> planet number:  " + (element.position));
        }
    }

    public enum SolarSystem { // Intro data type

        // Intro elements and parameters
        Mercury(1),
        Venus(2),
        Earth(3),
        Mars(4),
        Jupiter(5),
        Saturn(6),
        Uranus(7),
        Neptune(8);
        
        // Intro the position variable
        private final int position;
    
        private SolarSystem (int position){ // Gives out the position
            this.position = position;
        }
            
        
    }
}


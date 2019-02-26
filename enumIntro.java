
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

import java.lang.Enum;



public class enumIntro {

    public static void main(String[] args) {
        for (int number : SolarSystem.values()){
            System.out.println(SolarSystem.Earth.position);}
    }


    public enum SolarSystem {
        Mercury(1),
        Venus(2),
        Earth(3),
        Mars(4),
        Jupiter(5),
        Saturn(6),
        Uranus(7),
        Neptune(8);
        
        private final int position;
    
        private SolarSystem (int position){
            this.position = position;
        }
            
        
    }
}
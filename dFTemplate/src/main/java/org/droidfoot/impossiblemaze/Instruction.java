package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends Button
{
    /**
     * Act - do whatever the Instruction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instruction(){
        setImage("InstruksiText-Button.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new InstructionMenu());
        }
    }    
}

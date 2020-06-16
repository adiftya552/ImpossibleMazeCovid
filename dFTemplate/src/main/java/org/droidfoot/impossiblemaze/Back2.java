package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back2 extends Button
{
    /**
     * Act - do whatever the Back2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back2(){
        setImage("kembali-Button.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new InstructionMenu());
        }
    }    
}

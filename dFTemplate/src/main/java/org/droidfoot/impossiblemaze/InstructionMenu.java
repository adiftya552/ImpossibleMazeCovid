package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionMenu extends World
{

    /**
     * Constructor for objects of class InstructionMenu.
     * 
     */
    public InstructionMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1);
        prepare();
        setBackground("Instruction-Menu1.png");

        
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,177,520);
        
        Next next = new Next();
        addObject(next,570,513);
    }
}

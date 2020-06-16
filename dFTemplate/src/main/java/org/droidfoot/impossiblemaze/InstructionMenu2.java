package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionMenu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionMenu2 extends World
{

    /**
     * Constructor for objects of class InstructionMenu2.
     * 
     */
    public InstructionMenu2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1); 
        prepare();
        setBackground("Instruction-Menu2.png");

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainMenu mainMenu = new MainMenu();
        addObject(mainMenu,576,520);
        
        Back2 back = new Back2();
        addObject(back,177,520);
    }
}

package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinGame extends World
{

    /**
     * Constructor for objects of class WinGame.
     * 
     */
    public WinGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1);
        prepare();
        setBackground("Winn.png");
    }
    
    private void prepare()
    {
        MainMenu2 mainMenu2 = new MainMenu2();
        addObject(mainMenu2,198,519);
        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain,561,518);
        
    }
}

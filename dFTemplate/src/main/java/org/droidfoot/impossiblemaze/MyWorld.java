package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    Player player = new Player();

    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        
        prepare();
        setBackground("bathroom-tile.jpg");



        
    }

    public void act()
    {
        time++;
        if (time % 2500 == 0)
        {
            addObject(new Virus(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(522));
        }
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public int getRandomNumber(int start, int end){
        int normal= Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        VKup vkup = new VKup();
        VKdown vkdown = new VKdown();
        VKstop vkstop1 = new VKstop();
        VKleft vkleft = new VKleft();
        VKstop vkstop2 = new VKstop();
        VKright vkright = new VKright();

        addObject(vkup,1050,387);
        addObject(vkdown,1050,542);
        addObject(vkleft,978,467);
        addObject(vkright,1120,467);
        addObject(vkstop1,60,300);        

        //batas Tepi
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,120,129);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,120,430);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,910,129);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,910,430);

        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,305,600);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,605,600);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,735,600);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,305,0);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,605,0);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,735,0);

        //Teleport
        Teleport2 tele = new Teleport2();
        addObject(tele, 880,35);
        Teleport tele2 = new Teleport();
        addObject(tele2, 155,565);

        //dinding

        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,190,527);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,380,527);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,550,527);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,342,570);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,590,570);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,510,490);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,434,400);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,473,440);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,725,517);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,688,440);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,638,440);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,590,373);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,590,360);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,200,460);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,200,245);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,200,155);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,297,35);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,260,86);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,240,86);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,280,163);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,359,50);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,359,231);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,280,440);
        WallHeightMedium wallHeightMedium11 = new WallHeightMedium();
        addObject(wallHeightMedium11,282,368);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,282,310);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,400,280);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,440,158);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,440,140);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,478,87);
        WallHeightMedium wallHeightMedium9 = new WallHeightMedium();
        addObject(wallHeightMedium9,515,170);
        WallHeightMedium wallHeightMedium10 = new WallHeightMedium();
        addObject(wallHeightMedium10,515,270);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,553,280);
        WallHeightMedium wallHeightMedium12 = new WallHeightMedium();
        addObject(wallHeightMedium12,588,68);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,843,72);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,740,72);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,843,210);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,657,210);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,757,210);

        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,750,440);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,817,483);
        WallHeightMedium wallHeightMedium13 = new WallHeightMedium();
        addObject(wallHeightMedium13,817,360);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,750,280);

        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,667,319);

        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,716,354);
        wallWidthSmall11.setLocation(707,356);
        WallHeightMedium wallHeightMedium14 = new WallHeightMedium();
        addObject(wallHeightMedium14,669,141);

        //Masker
        Masker masker = new Masker();
        addObject(masker,241,481);
        Masker masker2 = new Masker();
        addObject(masker2,392,563);
        Masker masker3 = new Masker();
        addObject(masker3,238,40);
        Masker masker4 = new Masker();
        addObject(masker4,624,565);
        masker4.setLocation(641,560);
        Masker masker5 = new Masker();
        addObject(masker5,713,317);
        Masker masker6 = new Masker();
        addObject(masker6,482,125);
        masker6.setLocation(477,122);
        masker6.setLocation(474,125);
        Masker masker7 = new Masker();
        addObject(masker7,626,172);
        Masker masker8 = new Masker();
        addObject(masker8,704,168);
        masker8.setLocation(719,172);
        Masker masker9 = new Masker();
        addObject(masker9,792,116);
        masker9.setLocation(772,119);
        Masker masker10 = new Masker();
        addObject(masker10,236,403);
        masker10.setLocation(241,401);
        Masker masker11 = new Masker();
        addObject(masker11,553,317);

        //Pintu
        Pintu pintu = new Pintu();
        addObject(pintu,249,123);
        pintu.setLocation(252,126);
        Pintu2 pintu2 = new Pintu2();
        addObject(pintu2,884,102);
        pintu2.setLocation(872,117);

        //Hand Sanitizer
        Sanitizer sanitizer = new Sanitizer();
        addObject(sanitizer,317,393);
        sanitizer.setLocation(327,404);
        Sanitizer sanitizer2 = new Sanitizer();
        addObject(sanitizer2,543,498);
        sanitizer2.setLocation(547,489);

        Sanitizer sanitizer3 = new Sanitizer();
        addObject(sanitizer3,772,165);
        Sanitizer sanitizer4 = new Sanitizer();
        addObject(sanitizer4,554,247);

        //APD
        apd apd = new apd();
        addObject(apd,721,118);
        apd.setLocation(720,117);
        apd apd2 = new apd();
        addObject(apd2,770,315);
        apd apd3 = new apd();
        addObject(apd3,538,558);
        apd3.setLocation(547,558);
        apd apd4 = new apd();
        addObject(apd4,332,80);
        apd4.setLocation(326,80);

        //Garis Finish
        Winning winning = new Winning();
        addObject(winning,772,478);

        //Virus Jaga
        VirusJaga virusJaga = new VirusJaga();
        addObject(virusJaga,158,491);
        VirusJaga virusJaga2 = new VirusJaga();
        addObject(virusJaga2,470,412);
        virusJaga2.setLocation(474,393);
        VirusJaga virusJaga3 = new VirusJaga();
        addObject(virusJaga3,552,33);
        virusJaga3.setLocation(554,46);
        
        //Virus Random
        Virus virus = new Virus();
        addObject(virus,getRandomNumber(140,870),Greenfoot.getRandomNumber(450));
        Virus virus2 = new Virus();
        addObject(virus2,getRandomNumber(140,870),Greenfoot.getRandomNumber(450));
        Virus virus3 = new Virus();
        addObject(virus3,getRandomNumber(140,870),Greenfoot.getRandomNumber(450));
        
        //Player
        addObject(player,202,562);


    }
}

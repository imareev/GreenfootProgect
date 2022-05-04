import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 688, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int chetX=355;
        int chetY=43;
        for (int j=0; j<8; j++) {
            for (int i=0; i<8; i++) {
            int rand = Greenfoot.getRandomNumber(5);
            
            if (rand == 0) {
                addObject(new Chip_yellow(),chetX,chetY);
            }
            if (rand == 1) {
                addObject(new Chip_white(),chetX,chetY);
            }    
            if (rand == 2) {
                addObject(new Chip_green(),chetX,chetY);
            }
            if (rand == 3) {
                addObject(new Chip_blue(),chetX,chetY);
            }
            if (rand == 4) {
                addObject(new Chip_red(),chetX,chetY);
            }
            
            chetX = chetX + 86;
        }
            chetY = chetY + 86;
            chetX = 355;
        }
    }
}

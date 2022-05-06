import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    Chip [][] pole;
    public MyWorld()
    {    
        // сюда пиши
        super(1000, 688, 1); 
        prepare();
        generate_pole();
        show_pole();
    }
    private void prepare()
    {
        // никогда ничего сюда не пиши
    }
    public void generate_pole()
    {
        pole = new Chip [8][8];
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                int rand = Greenfoot.getRandomNumber(5);
                
                if (rand == 0) {
                    pole[i][j] = new Chip_yellow();
                }
                if (rand == 1) {
                    pole[i][j] = new Chip_white();
                }    
                if (rand == 2) {
                    pole[i][j] = new Chip_green();
                }
                if (rand == 3) {
                    pole[i][j] = new Chip_blue();
                }
                if (rand == 4) {
                    pole[i][j] = new Chip_red();
                }
            }
        }
    }
    public void show_pole()
    {
        int chetX=355;
        int chetY=43;
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                addObject(pole[i][j],chetX,chetY);
                chetX = chetX + 86;
            }
            chetY = chetY + 86;
            chetX = 355;
        }
    }
}

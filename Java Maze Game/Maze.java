import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author Piyush Kothari
   * @version (a version number or a date)
 */
public class Maze extends World
{

    /**
     * Constructor for objects of class Maze.
     * 
     */

    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 850, 1); 
        for (int loop=40;loop<960;loop=loop+60)
        {
            addObject(new sandroad(), loop,50);
            addObject(new sandroad(), loop,230);
            addObject(new sandroad(), loop,410);
            addObject(new sandroad(), loop,590);
            addObject(new sandroad(), loop,770);
            for (int loop_2=0;loop_2<=1;loop_2=loop_2+1)
            {
                addObject(new sandroad(), 100,110+(loop_2*60));
                addObject(new sandroad(), 340,110+(loop_2*60));
                addObject(new sandroad(), 580,110+(loop_2*60));
                addObject(new sandroad(), 160,290+(loop_2*60));
                addObject(new sandroad(), 400,290+(loop_2*60));
                addObject(new sandroad(), 700,290+(loop_2*60));
                addObject(new sandroad(), 100,470+(loop_2*60));
                addObject(new sandroad(), 340,470+(loop_2*60));
                addObject(new sandroad(), 760,470+(loop_2*60));
                addObject(new sandroad(), 160,650+(loop_2*60));
                addObject(new sandroad(), 400,650+(loop_2*60));
            }
        }
        addObject(new Goal(), 40,770);
        addObject(new GoldenBall(),940 ,50);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake gameover = new Snake();
        addObject(gameover,225,57);
        gameover.setLocation(215,49);
        Snake gameover2 = new Snake();
        addObject(gameover2,464,232);
        gameover2.setLocation(460,230);
        Snake gameover3 = new Snake();
        addObject(gameover3,107,417);
        gameover3.setLocation(99,410);
        Snake gameover4 = new Snake();
        addObject(gameover4,528,416);
        gameover4.setLocation(515,408);
        gameover4.setLocation(522,409);
        Snake gameover5 = new Snake();
        addObject(gameover5,765,768);
        gameover5.setLocation(758,769);
        gameover5.setLocation(757,769);
        gameover5.setLocation(764,769);
        gameover5.setLocation(759,769);
        Snake gameover6 = new Snake();
        addObject(gameover6,711,590);
        gameover6.setLocation(701,589);
        Snake gameover7 = new Snake();
        addObject(gameover7,170,599);
        gameover7.setLocation(161,589);
        gameover.setLocation(96,44);
        Snake snake = new Snake();
        addObject(snake,224,46);
        snake.setLocation(219,49);
        removeObject(gameover);
        gameover2.setLocation(390,235);
        Snake snake2 = new Snake();
        addObject(snake2,467,229);
        snake2.setLocation(465,229);
        removeObject(gameover2);
        gameover3.setLocation(43,407);
        Snake snake3 = new Snake();
        addObject(snake3,111,413);
        snake3.setLocation(102,410);
        removeObject(gameover3);
        gameover7.setLocation(97,589);
        Snake snake4 = new Snake();
        addObject(snake4,163,588);
        removeObject(gameover7);
        gameover6.setLocation(639,588);
        Snake snake5 = new Snake();
        addObject(snake5,698,590);
        snake5.setLocation(703,588);
        removeObject(gameover6);
        gameover4.setLocation(459,405);
        Snake snake6 = new Snake();
        addObject(snake6,521,404);
        snake6.setLocation(520,407);
        removeObject(gameover4);
        removeObject(gameover5);
        Snake snake7 = new Snake();
        addObject(snake7,769,773);
        snake7.setLocation(763,767);
    }
}

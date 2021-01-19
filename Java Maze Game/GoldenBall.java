import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


    


/**
 * Write a description of class GoldenBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenBall extends Actor
{
    /**
     * Act - do whatever the GoldenBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        key();
        win();
        loss();

               
     
        setLocation(getX(),getY());
        
        

    
}    
    public boolean canMove(int x, int y)
    {
        
        Actor sand;
        sand=getOneObjectAtOffset(x,y,sandroad.class);
        
        //the section below checks if there is a block you can move to
        // if there is it sets sand to a value otherwise it says null
        // The errors are in this section
        boolean flag=false;
        if (sand !=null)
        {
            flag=true;
        }
        return flag;
    }
    public void key()
    {
       //Note 1: Down the page increase the y value and going to the right increases the x value
       //Note 2: Each block is 60 pixels wide and high 
        int leftChange=(-60);//choose the appropriate left step size ; 
       int rightChange=60;//choose the appropriate right step size ; 
       int upChange=(-60);//choose the appropriate up step size ; 
       int downChange=60;//choose the appropriate down step size ; 
        if (Greenfoot.isKeyDown("left"))
        {
            if (canMove(leftChange, 0)==true){
            setLocation(getX()+leftChange, getY()) ;
            Greenfoot.playSound("Tick.mp3");}
            else{
                         Greenfoot.playSound("sound.mp3");
            }
        }
        if (Greenfoot.isKeyDown("right"))
        {
           if (canMove(rightChange, 0)==true){
            setLocation(getX()+rightChange, getY()) ;
        Greenfoot.playSound("Tick.mp3");}
            else{
                         Greenfoot.playSound("sound.mp3");
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            if (canMove(0, upChange)==true){
            setLocation(getX(), getY()+upChange) ;
        Greenfoot.playSound("Tick.mp3");}
            else{
                         Greenfoot.playSound("sound.mp3");
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            if (canMove(0, downChange)==true){
            setLocation(getX(), getY()+downChange) ;
        Greenfoot.playSound("Tick.mp3");}
            else{
                         Greenfoot.playSound("sound.mp3");
            }
        }
       
            
            
    
    
}
    public void win()
    {
        Actor win;
        win=getOneObjectAtOffset(5,5,Goal.class);
        if(win !=null)
        {
            World myWorld = getWorld();
            Congrats Congrats = new Congrats();
            myWorld.addObject(Congrats, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.playSound("TADA.wav");
            Greenfoot.stop();
        }
    }
        public void loss()
    {
        Actor loss;
        loss=getOneObjectAtOffset(5,5,Snake.class);
        if(loss !=null)
        {
            World myWorld = getWorld();
            TheEnd TheEnd = new TheEnd();
            myWorld.addObject(TheEnd, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.playSound("GameOver.mp3");
            Greenfoot.stop();
        }
}
    
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus here.
 * 
 * @author Diego Alfonso Ambriz Martinez 
 * @version 20-11-2014
 */
public class Bonus extends Actor
{
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private  SimpleTimer clockBonus;
    
    public Bonus()
    {
        clockBonus=new SimpleTimer();
    }
    
    
    public void act() 
    {
        // Add your action code here.
        clockBonus.mark();
        if(clockBonus.millisElapsed()>=1000)
        {
            System.out.println("1");
        }
    }    
}

import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Bricks draws a wall of bricks with certain x and y positions, width, and height </p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Bricks b = new P4_Rao_Aditya_Bricks (pen, 200.0, 100.0, 34.0, 23.0);
 * b.setChimneyColor(Color.red);
 * b.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Bricks
{
    /** The pen that draws*/
    DrawingTool pen; 
    /**The color of the edge of each brick*/
    Color bricksColor;
    /**The x position of the upper left corner of the group of bricks*/
    double x;
    /**The y position of the upper left corner of the group of bricks*/
    double y;
    /**The width of each brick*/
    double brickWidth;
    /**The height of each brick*/
    double brickHeight;
    
    /** This is the constructor for objects of the Bricks class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the group of bricks
     * @param yPos The y position of the upper left corner of the group of bricks
     */
    public P4_Rao_Aditya_Bricks(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        brickWidth = 100;
        brickHeight = 100;
        bricksColor = new Color(220, 85, 57);
        
    }
    /** This is the constructor for objects of the Bricks class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the group of bricks
     * @param yPos The y position of the upper left corner of the group of bricks
     * @param bw The width of each brick
     * @param bh The height of each brick
     */
    public P4_Rao_Aditya_Bricks(DrawingTool dt, double xPos, double yPos, double bw, double bh){
        pen = dt;
        x = xPos;
        y = yPos;
        brickWidth = bw;
        brickHeight = bh;
        bricksColor = new Color(220, 85, 57);
        
    }
   

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        
        
        int count = 0;
        pen.setColor(Color.white);
        double ux = x;
        double uy = y;
        y= uy; 
        int r;
        int nr = 10;
        pen.up();
       
        for (r=1; r <= nr; r++) {
            x= ux;
            if (r % 2 == 1){
                pen.up();
                pen.move(x, y);
                pen.down();
                pen.drawRect(brickWidth/2, brickHeight);
                x+= brickWidth/2;
            }else{
                pen.up();
                pen.move(x, y);
                pen.setColor(bricksColor);
                pen.down();
                pen.drawRect(brickWidth, brickHeight);
                x+= brickWidth;
            }
            int c;
            int nc = 10;
            for (c= 1; c <= nc -1; c++){
                count++;
                pen.up();
                pen.move(x, y);
                
                    
                pen.setColor(bricksColor);
                
                pen.down();
                pen.drawRect(brickWidth, brickHeight);
                x+= brickWidth;
            }
            
            y+= brickHeight;
        }
        
        
    }
    
    
    /**
     * This setter method is for the width and height dimensions of each brick
     *
     * @param bw  The width of each brick
     * @param bh  The height of each brick
     */
    public void setDimensions(double bw, double bh){
        brickWidth = bw;
        brickHeight = bh;
    }
    /**
     * This setter method is for the x and y positions of each brick
     *
     * @param xPos The x position of the upper left corner of the group of bricks
     * @param yPos The y position of the upper left corner of the group of bricks
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the edge of each brick
     *
     * @param c  The color of the edge of each brick
     */
    public void setColor(Color c){
        bricksColor = c;
    }
     
    
}

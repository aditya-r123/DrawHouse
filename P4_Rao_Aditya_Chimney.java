import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Chimney draws a rectangle with certain x and y positions, width, and height</p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Chimney c = new P4_Rao_Aditya_Chimney (pen, 200.0, 100.0, 34.0, 23.0);
 * c.setChimneyColor(Color.red);
 * c.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Chimney
{
    
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the chimney*/
    Color chimneyColor;
    /** The x position of the upper left corner of the chimney*/
    double x;
    /** The y position of the upper left corner of the chimney*/
    double y;
    /** The width of the chimney*/
    double width;
    /** The height of the chimney*/
    double height;
    
    
    /** This is the constructor for objects of the Chimney class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the chimney
     * @param yPos The y position of the upper left corner of the chimney
     */
    public P4_Rao_Aditya_Chimney(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;
        chimneyColor = new Color(220, 246, 250);
    }
    /** This is the constructor for objects of the Chimney class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the chimney
     * @param yPos The y position of the upper left corner of the chimney
     * @param w The width of the chimney
     * @param h The height of the chimney
     */
    public P4_Rao_Aditya_Chimney(DrawingTool dt, double xPos, double yPos, double w, double h){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
        chimneyColor = new Color(220, 246, 250);
    }
   
    
    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        
        pen.setColor(chimneyColor);
        pen.up();
        pen.move(x, y);
        pen.down();
        pen.drawRect(width, height);
        pen.fillRect(width, height);

    }
    /**
     * This setter method is for the width and height dimensions of the chimney
     *
     * @param w  The width of the chimney
     * @param h  The height of the chimney
     */
    public void setDimensions(double w, double h){
        width = w;
        height = h;
    }
    /**
     * This setter method is for the x and y positions of the chimney
     *
     * @param xPos The x position of the upper left corner of the chimney
     * @param yPos The y position of the upper left corner of the chimney
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the chimney
     *
     * @param c  The color of the chimney
     */
    public void setColor(Color c){
        chimneyColor = c;
    }
    
    
}

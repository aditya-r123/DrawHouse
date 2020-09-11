import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> SkyObject draws a circle with certain x and y positions, and radius. </p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_SkyObject so = new P4_Rao_Aditya_SkyObject(pen, -750, 400, 90);
 * so.setSkyObjectColor(Color.red);
 * so.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_SkyObject
{
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the sky object*/
    Color skyObjectColor;
    /** The x position of the center of the sky object*/
    double x;
    /** The y position of the center of the sky object*/
    double y;
    /** The radius of the sky object*/
    double radius;
    
    /** This is the constructor for objects of the SkyObject class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the center of the sky object
     * @param yPos The y position of the center of the sky object
     */
    
    public P4_Rao_Aditya_SkyObject(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        radius = 100;
       
        
        skyObjectColor = new Color (255, 255,0);
    }
    /** This is the constructor for objects of the SkyObject class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the center of the sky object
     * @param yPos The y position of the center of the sky object
     * @param r The radius of the sky object
     */
    public P4_Rao_Aditya_SkyObject(DrawingTool dt, double xPos, double yPos, double r){
        pen = dt;
        x = xPos;
        y = yPos;
        radius = r;
        
        skyObjectColor = new Color (255, 255,0);
    }
   

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        pen.up();
        pen.move(x, y);
        pen.down();
        pen.setColor(skyObjectColor);
        pen.drawCircle(radius);
        pen.fillCircle(radius);

        
    }
    /**
     * This setter method is for the radius of the sky object
     * 
     *
     * @param r The radius of the sky object
     */
    public void setDimensions(double r){
        radius = r;
    }
    /**
     * This setter method is for the x and y positions of the sky object
     *
     * @param xPos The x position of the center of the sky object
     * @param yPos The y position of the center of the sky object
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the sky object
     *
     * @param c  The color of the sky object
     */
    public void setColor(Color c){
        skyObjectColor = c;
    }
    
    
    
}

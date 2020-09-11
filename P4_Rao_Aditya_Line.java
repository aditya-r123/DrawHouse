import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Line draws a line from a certain x and y starting position, to a certain x and y ending position</p>
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Line l = new P4_Rao_Aditya_Line (pen, 200.0, 100.0, 300.0, 150.0);
 * l.setLineColor(Color.red);
 * l.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Line
{
    //attributes
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the line*/
    Color lineColor;
    /** The starting x position of the line*/
    double x1;
    /** The starting y position of the line*/
    double y1;
    /** The ending x position of the line*/
    double x2;
    /** The ending y position of the line*/
    double y2;
    /** The width of the line*/
    int lw;
    
    
    /** This is the constructor for objects of the Lines class
     * 
     * @param dt The pen that draws
     * @param xPos1 The starting x position of the line
     * @param yPos1 The starting y position of the line
     * @param xPos2 The ending x position of the line
     * @param yPos2 The ending y position of the line
     */
    public P4_Rao_Aditya_Line(DrawingTool dt, double xPos1, double yPos1, double xPos2, double yPos2){
        pen = dt;
        
        x1 = xPos1;
        y1 = yPos1;
        x2 = xPos2;
        y2 = yPos2;
        
        lineColor = new Color(220, 246, 250);
    }
     /** This is the constructor for objects of the Lines class
     * 
     * @param dt The pen that draws
     * @param lineWidth The width of the line
     * @param xPos1 The starting x position of the line
     * @param yPos1 The starting y position of the line
     * @param xPos2 The ending x position of the line
     * @param yPos2 The ending y position of the line
     */
    public P4_Rao_Aditya_Line(DrawingTool dt, int lineWidth, double xPos1, double yPos1, double xPos2, double yPos2){
        pen = dt;
        lw = lineWidth;
        x1 = xPos1;
        y1 = yPos1;
        x2 = xPos2;
        y2 = yPos2;
        
        lineColor = new Color(220, 246, 250);
    }
   

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        
        pen.setColor(lineColor);
        pen.setWidth(lw);
        pen.up();
 
        pen.move(x1, y1);
        pen.down();
        pen.move(x2, y2);

       
    }
    /**
     * This setter method is for both the starting and ending, x and y positions of the line
     *
     * @param xPos1 The starting x position of the line
     * @param yPos1 The starting y position of the line
     * @param xPos2 The ending x position of the line
     * @param yPos2 The ending y position of the line
     */
    public void setPosition(double xPos1, double yPos1, double xPos2, double yPos2){
        x1 = xPos1;
        y1 = yPos1;
        x2 = xPos2;
        y2 = yPos2;
    }
     /**
     * This setter method is for the color of the line
     *
     * @param c  The color of the line
     */
    public void setColor(Color c){
        lineColor = c;
    }
    
    
}

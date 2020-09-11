import gpdraw.*;
import java.awt.*;
import java.lang.*;

/**
 * <p> Grass draws a field of grass with 12 different parameters as specified below </p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 *P4_Rao_Aditya_Grass g = new P4_Rao_Aditya_Grass(pen, 2, -305, -600.00, 6, 200.0, 20.0, 5, 2000, 62, 10);
 *g.setGrassColor(Color.red);
 *g.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Grass
{
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the grass*/
    Color grassColor;
    /** The width of a blade of grass*/
    int lw;
    /** The x position of the bottom left point of the field*/
    double x;
    /** The y position of the bottom left point of the field*/
    double y;
    /** The width of the field*/
    double width;
    /**The gap between each row of grass*/
    double yI;
    /**The value that affects the angle of a blade of grass*/
    double curveNum;
    /**The number of curves per blade of grass*/
    int log;
    /**The number of blades of grass per row*/
    int gpr;
    /**The number of rows of grass*/
    int rog;
    /**The length of the straight portion in between the curves of a blade of grass*/
    double hbt;

    /** This is the constructor for objects of the Grass class 
     * 
     * @param dt The pen that draws
     * @param lineWidth The width of a blade of grass
     * @param xPos The x position of the bottom left point of the field
     * @param yPos The y position of the bottom left point of the field
     * @param w The width of the field
     */
    public P4_Rao_Aditya_Grass(DrawingTool dt, int lineWidth, double xPos, double yPos, double w){
        pen = dt;
        lw = lineWidth;
        x = xPos;
        y = yPos;
        yI = 6.02;
        width = w;
        curveNum = 20;
        log = 20;
        gpr = 80000;
        rog = 61;
        hbt = 10;

        grassColor = new Color(22, 246, 25);
    }

    /** This is the constructor for objects of the Grass class 
     * @param dt The pen that draws
     * @param lineWidth The width of a blade of grass
     * @param xPos The x position of the bottom left point of the field
     * @param yPos The y position of the bottom left point of the field
     * @param yIncrement The gap in between each row of grass
     * @param w The width of the field
     * @param curveSlant The value that affects the angle of a blade of grass
     * @param lengthOfGrass The number of curves per blade of grass
     * @param grassPerRow The number of blades of grass per row
     * @param rowsOfGrass The number of rows of grass
     * @param heightB4Turn The length of the straight portion in between the curves of a blade of grass

     */
    public P4_Rao_Aditya_Grass(DrawingTool dt, int lineWidth, double xPos, double yPos, double yIncrement, double w, double curveSlant, int lengthOfGrass, int grassPerRow, int rowsOfGrass, double heightB4Turn){
        pen = dt;
        lw = lineWidth;
        x = xPos;
        y = yPos;
        yI = yIncrement;
        width = w;
        curveNum = curveSlant;
        log = lengthOfGrass;
        gpr = grassPerRow;
        rog = rowsOfGrass;
        hbt = heightB4Turn;

        grassColor = new Color(22, 246, 25);
    }

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){

        pen.setWidth(lw);
        pen.setColor(grassColor);

        for(int i = 0; i<rog; i++){//rog = 61
            double xPosition =  x;
            for(int d = 0; d<gpr; d++){
                pen.up();
                pen.move(xPosition,y);
                pen.down();
                pen.setDirection(90);

                for(int j = 0; j<log; j++){
                    pen.turn(((int) (Math.random()*(curveNum - -curveNum))) + -curveNum);
                    pen.move(hbt);
                    pen.turn(((int) (Math.random()*(curveNum - -curveNum))) + -curveNum);//20
                }
                xPosition+=(int) (((Math.random()*(width - -width))) + -width);////////////////////////////////////////////////////////////////

            }
            y+=yI;//6.02
            pen.down();
        }

    }
    /**
     * This setter method is for the x and y positions, and width of the field, and also the gap in between each row of grass
     *
     * @param xPos The x position of the bottom left point of the field
     * @param yPos The y position of the bottom left point of the field
     * @param yIncrement The gap in between each row of grass
     * @param w The width of the field
     */
    public void setPosition(double xPos, double yPos, double yIncrement, double w){
        x = xPos;
        y = yPos;
        yI = yIncrement;
        width = w;

    }
    /**
     * This setter method is for the dimensions of each blade of grass
     * @param curveSlant The value that affects the angle of a blade of grass
     * @param lengthOfGrass The number of curves per blade of grass
     * @param heightB4Turn The length of the straight portion in between the curves of a blade of grass
     */
    public void setGrass(double curveSlant, int lengthOfGrass, int heightB4Turn){
        curveNum = curveSlant;
        log = lengthOfGrass;
        hbt = heightB4Turn;

    }
    /**
     * This setter method is for the number of grass blades per row, and number of rows of grass
     * @param grassPerRow The number of blades of grass per row
     * @param rowsOfGrass The number of rows of grass
     */
    public void setGrassPopulation(int grassPerRow, int rowsOfGrass){
        gpr = grassPerRow;
        rog = rowsOfGrass;

    }
    /**
     * This setter method is for the width of each blade of grass
     * @param lineWidth The width of a blade of grass
     */
    public void setLineWidth(int lineWidth){
        lw = lineWidth;
    }
    /**
     * This setter method is for the color of the grass
     * @param c  The color of the grass
     */
    public void setGrassColor(Color c){
        grassColor = c;
    }

}

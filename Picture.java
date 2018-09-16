/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square background;
    private Square background2;
    private Triangle hill;
    private Circle sun;
    private Person sonicBody;
    private Triangle sonicHair;
    private Circle sonicHead;
    private Circle sonicEye1;
    private Circle sonicPupil1;
    private Circle sonicEye2;
    private Circle sonicPupil2;
    private Circle sonicMouth;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        background2 = new Square();
        hill = new Triangle();  
        sun = new Circle();
        sonicBody = new Person();
        sonicHair = new Triangle();
        sonicHead = new Circle();
        sonicEye1 = new Circle();
        sonicPupil1 = new Circle();
        sonicEye2 = new Circle();
        sonicPupil2 = new Circle();
        sonicMouth = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            background2.changeColor("blue");
            background2.moveHorizontal(-375);
            background2.moveVertical(-180);
            background2.changeSize(580);
            background2.makeVisible();
            
            background.changeColor("green");
            background.moveHorizontal(-375);
            background.moveVertical(20);
            background.changeSize(580);
            background.makeVisible();
            
          
    
            hill.changeSize(60, 180);
            hill.moveHorizontal(-30);
            hill.moveVertical(-60);
            hill.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            sonicBody.changeColor("blue");
            sonicBody.changeSize(80, 60);
            sonicBody.moveHorizontal(30);
            sonicBody.moveVertical(50);
            sonicBody.makeVisible();
            
            sonicHair.changeColor("blue");
            sonicHair.changeSize(40, 30);
            sonicHair.moveHorizontal(90);
            sonicHair.moveVertical(30);
            sonicHair.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        background2.changeColor("white");
        hill.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("red");
        background2.changeColor("black");
        hill.changeColor("green");
        sun.changeColor("yellow");
    }
}

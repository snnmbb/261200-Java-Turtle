public class Glass {

    private double Xvalue = 240;
    private double Yvalue = 420;

    Turtle glass = new Turtle();
    public void drawGlass(String color){

        glass.setDirection(90);
        glass.penColor(color);
        glass.forward(400);
        for(int j = 0 ; j <180;j++)
        {
            glass.forward(2.5);
            glass.right(1);
        }
        glass.forward(400);
    }
    public void drawWink(String colorWink )
    {
        glass.up();
        glass.width(4);
        glass.setPosition(this.Xvalue, this.Yvalue,90);
        glass.down();
        glass.penColor(colorWink);
        glass.forward(60);
        glass.right(180);
        glass.forward(30);
        glass.left(90);
        glass.forward(10);
        glass.right(180);
        glass.forward(20);

        glass.up();
        glass.width(4);
        glass.setPosition(220,400,90);
        glass.down();
        glass.penColor(colorWink);
        glass.forward(30);
        glass.right(180);
        glass.forward(15);
        glass.left(90);
        glass.forward(5);
        glass.right(180);
        glass.forward(10);
    }
    public void setX(double x)
    {
        this.Xvalue = x;
    }
    public void setY(double y)
    {
        this.Yvalue = y;
    }


}

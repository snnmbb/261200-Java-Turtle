public class Shadow {
    private double Xvalue = 150;
    private double Yvalue = -60;
    Turtle shadow = new Turtle();
    public void drawShadow(String color )
    {
        shadow.penColor(color);
        for(int n = 200 ; n>190 ; n-- )
        {
            shadow.forward(n);
            shadow.right(90);
            shadow.forward(1);
            shadow.right(90);
            shadow.forward(n-20);
            shadow.left(90);
            shadow.forward(1);
            shadow.left(90);
        }
    }
    public void setShadowStart()
    {
        shadow.width(15);
        shadow.up();
        shadow.setPosition(this.Xvalue , this.Yvalue);
        shadow.down();
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

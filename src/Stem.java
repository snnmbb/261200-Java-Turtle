public class Stem {
    private double Xvalue = 80;
    private double Yvalue = 0;
    Turtle stem = new Turtle();
    public void drawStem(String color )
    {
        stem.penColor(color);
        for (int k = 0; k < 23; k++) {
            stem.left(4);
            stem.forward(2);
        }
        stem.forward(165);
    }

    public void setStemStart()
    {
        stem.width(7);
        stem.up();
        stem.setPosition(this.Xvalue, this.Yvalue);
        stem.down();
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

public class Base {

    private double Xvalue = -10;
    private double Yvalue =0;
    Turtle base = new Turtle();
    public void drawBase(String color)
    {
        base.setPosition(this.Xvalue, this.Yvalue);
        base.penColor(color);
        base.width(10);

        for (int i = 310; i > 250; i--) {
            base.forward(i);
            base.right(90);
            base.forward(i-260);
            base.right(90);
        }
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

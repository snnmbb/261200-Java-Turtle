public class Petal {
    private double rose_angle = 1.5;
    private double rose_distance = 2;

    private double Xvalue = 100;

    private double Yvalue = 200;

    private double angle = 90;
    Turtle rose = new Turtle();
    public void drawPetal(String colorRose) {


        rose.width(5);

        rose.penColor(colorRose);

        for (int k = 0; k < 40; k++) {
            rose.left(this.rose_angle);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 70; k++) {
            rose.right(this.rose_angle);
            rose.forward(this.rose_distance);
        }
        rose.right(80);
        for(int r = 0 ; r < 3 ; r++)
        {
            for (int k = 0; k < 10; k++) {
                rose.right(this.rose_angle+2);
                rose.forward(this.rose_distance);
            }
            for (int k = 0; k < 10; k++) {
                rose.left(this.rose_angle+2);
                rose.forward(this.rose_distance);
            }
        }
        for (int k = 0; k < 20; k++) {
            rose.right(this.rose_angle+3);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 40; k++) {
            rose.left(this.rose_angle-1);
            rose.forward(this.rose_distance);
        }
        rose.left(180);

        for (int k = 0; k < 40; k++) {
            rose.right(this.rose_angle);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 60; k++) {
            rose.left(this.rose_angle);
            rose.forward(this.rose_distance);
        }
        rose.left(80);
        for(int r = 0 ; r < 2 ; r++)
        {
            for (int k = 0; k < 10; k++) {
                rose.left(this.rose_angle+2);
                rose.forward(this.rose_distance);
            }
            for (int k = 0; k < 10; k++) {
                rose.right(this.rose_angle+2);
                rose.forward(this.rose_distance);
            }
        }
        for (int k = 0; k < 8; k++) {
            rose.left(this.rose_angle+2);
            rose.forward(this.rose_distance);
        }

        rose.right(80);

        for (int k = 0; k < 10; k++) {
            rose.right(this.rose_angle+2);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 10; k++) {
            rose.left(this.rose_angle+2);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 10; k++) {
            rose.right(this.rose_angle+2);
            rose.forward(this.rose_distance);
        }
        for (int k = 0; k < 10; k++) {
            rose.left(this.rose_angle+2);
            rose.forward(this.rose_distance);
        }

        rose.right(80);
        for(int n = 0 ; n < 2 ; n++)
        {
            for(int j = 0 ; j < 70; j++)
            {
                rose.forward(this.rose_distance);
                rose.right(2);
            }
            for(int j = 0 ; j < 20; j++)
            {
                rose.forward(this.rose_distance);
                rose.right(4);
            }
            for(int j = 0 ; j < 40; j++)
            {
                rose.forward(this.rose_distance);
                rose.right(1);
            }
            for(int j = 0 ; j < 30; j++)
            {
                rose.forward(this.rose_distance);
                rose.right(3);
            }
            rose.left(20);
        }
    }

    public void setStartPetal()
    {
        rose.up();
        rose.left(this.angle);
        rose.setPosition(this.Xvalue, this.Yvalue);
        rose.down();
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

public class RoseWorker  implements Runnable{
    @Override
    public void run() {
        Rose rose = new Rose();
        rose.drawRose("darkred" , "darkgreen"  , 100 , 200 ,80 ,0 );
    }
}

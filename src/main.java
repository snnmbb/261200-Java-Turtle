public class main {
    public static void main(String[] a) {

//        RoseWorker rw = new RoseWorker();
//        Thread thread1 = new Thread(rw);
//        GlobeWorker gw = new GlobeWorker();
//        Thread thread2 = new Thread(gw);
//        thread1.start();
//        thread2.start();

        Thread rose = new Thread(new RoseWorker());
        Thread globe = new Thread(new GlobeWorker());
        rose.start();
        globe.start();

//        Rose rose = new Rose();
//        Rose rose2 = new Rose();
//        Globe globe = new Globe();

//        globe.drawGlobe("gold" , "floralwhite" , "floralwhite" , "gray" );
//
//        rose.drawRose("darkred" , "darkgreen"  , 100 , 200 ,80 ,0 );
//
//        rose2.drawRose("red" , "darkgreen" , 200 , 200 ,180 ,0 );

    }
}

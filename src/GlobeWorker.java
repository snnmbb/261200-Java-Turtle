public class GlobeWorker implements Runnable {
    @Override
    public void run() {
        Globe globe = new Globe();
        globe.drawGlobe("gold" , "lightsteelblue" , "lightsteelblue" , "gray" );
    }

}

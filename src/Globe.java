public class Globe {
    Base base = new Base();
    Glass glass = new Glass();
    Shadow shadow = new Shadow();

    public void drawGlobe(String colorBase , String colorGlass , String colorWink ,String colorShadow )
    {
        base.drawBase(colorBase);
        glass.drawGlass(colorGlass);
        glass.drawWink(colorWink);
        shadow.setShadowStart();
        shadow.drawShadow(colorShadow);
    }

}

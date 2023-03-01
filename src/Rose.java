public class Rose {
    Petal rose = new Petal();
    Stem stem = new Stem();

    public void drawRose(String colorPetal , String colorStem , double Petal_posX , double Petal_posY , double Stem_posX , double Stem_posY  )
    {
        stem.setX(Stem_posX);
        stem.setY(Stem_posY);
        stem.setStemStart();
        stem.drawStem(colorStem);

        rose.setX(Petal_posX);
        rose.setY(Petal_posY);
        rose.setStartPetal();
        rose.drawPetal(colorPetal);
    }

}

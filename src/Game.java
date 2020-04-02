public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar=rJ;
        this.nieuwprijs=nwpr;

    }

    public double huidigeWaarde(){
        int jaar = 2020;
        int leeftijd = jaar-releaseJaar;
        double nieuwewaarde = nieuwprijs*Math.pow(0.70,leeftijd);
        return nieuwewaarde;
    }

    public boolean equals(Object andereObject){
        if (this == andereObject) {
            return true;
        }
        if (andereObject == null || getClass() != andereObject.getClass()) {
            return false;
        }
        Game c = (Game) andereObject;
        if(naam != c.naam){
            return false;
        }
        if(releaseJaar != c.releaseJaar){
            return false;
        }
        return true;
    }
    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €"+String.format("%.2f", nieuwprijs)+ " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }
}

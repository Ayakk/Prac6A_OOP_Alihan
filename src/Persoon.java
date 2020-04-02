public class Persoon {
    private String naam;
    private double budget;

    public Persoon(String nm, double bud){

    }

    public double getBudget() {
        return budget;
    }
    public boolean koop(Game g){
        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        return false;
    }
    public String toString(){
        return null;
    }
}

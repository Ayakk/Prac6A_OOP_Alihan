public class Persoon extends mijnGames{
    private String naam;
    private double budget;

    public Persoon(String nm, double bud){
        this.naam=nm;
        this.budget=bud;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean koop(Game g){
        if(mijnGames.contains(g)){
            return false;
        } else if(getBudget() >= g.huidigeWaarde()){
            setBudget(getBudget() - g.huidigeWaarde());
            mijnGames.add(g);
            return true;
        }
        else{
            return false;
        }

    }

    public boolean verkoop(Game g, Persoon koper) {
        if (koper.getBudget() >= g.huidigeWaarde() && !koper.mijnGames.contains(g) && !mijnGames.isEmpty()) {
            System.out.println("Budget is voldoende, game is niet al gekocht");
            mijnGames.remove(g);
            koper.mijnGames.add(g);
            koper.setBudget(koper.getBudget() - g.huidigeWaarde());
            setBudget(getBudget() + g.huidigeWaarde());
            return true;
        } else {
            return false;
        }
    }

    public String games(){
        String out = "";

        for (Game g:mijnGames) {
            out += "\n" + g;
        }
        return out;
    }

    public String toString(){
        return naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:" + games();

    }
}

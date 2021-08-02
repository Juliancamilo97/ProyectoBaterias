public class ProyectoBaterias {
    private int tiempo;
    private double capital;
    private double interes;   
    public ProyectoBaterias(int tiempo, double capital, double interes) {
         this.capital= capital;
         this.tiempo= tiempo;
         this.interes= interes;
    }
    public double calcInteresSimple() {
        double interesSimple = Math.round(capital*(this.interes/100)*this.tiempo);
        return interesSimple;
        }
    public double calcInteresCompuesto() {
        double interesCompuesto= Math.round(capital*(Math.pow(1+(this.interes/100),this.tiempo)-1));
        return interesCompuesto;
    }
    public double comparar() {
        double compararInteres= calcInteresCompuesto()-calcInteresSimple();
        return compararInteres;
    }
}

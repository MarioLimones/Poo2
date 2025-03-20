package pooII;


public class Animal1 {
    private double peso;
    public void identificar(){
        System.out.print("Soy un animal");
    }
    public Animal1(double peso) {
        this.peso = peso;
    } 

    public double getPeso() {
        return peso;
    } 
}

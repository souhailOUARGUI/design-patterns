public class Employe {
private String cin;
private float salaireBrutMensuel;
private CalculIGR calculIGR;

public Employe(String cin, float salaireBrutMensuel, CalculIGR calculIGR) {

this.cin = cin;
this.salaireBrutMensuel = salaireBrutMensuel;
this.calculIGR = calculIGR;

}

// public float calculerIGR(){

// float salaireBrutAnuel=salaireBrutMensuel*12;
// float taux=42;
// return salaireBrutAnuel*taux/100;

// }

public void setCalculIGR(CalculIGR calculIGR) {
    this.calculIGR = calculIGR;
}

public float getSalaireNetMensuel(){
float igr=calculIGR.calculerIGR(salaireBrutMensuel);
float salaireNetAnuel=salaireBrutMensuel*12-igr;
return salaireNetAnuel/12;

}

// Getters et Setters
public String getCin() {
    return cin;
}

public float getSalaireBrutMensuel() {
    return salaireBrutMensuel;
}

public void setCin(String cin) {
    this.cin = cin;
}

public void setSalaireBrutMensuel(float salaireBrutMensuel) {
    this.salaireBrutMensuel = salaireBrutMensuel;
}
}
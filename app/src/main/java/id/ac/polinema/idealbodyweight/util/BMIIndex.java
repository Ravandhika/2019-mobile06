package id.ac.polinema.idealbodyweight.util;

public class BMIIndex {
    private float berat;
    private float tinggi;
    private float BMI;

    public BMIIndex(float berat, float tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;

    }

    public void calculate() {
        this.BMI = this.berat / (this.tinggi * this.tinggi);
    }



    public String BMIRange() {
        String res = "";
        if (this.BMI < 18.50) {
            res = "Underweight";
        } else if (this.BMI >= 18.50 && this.BMI <= 24.99) {
            res = "Healty Weight";
        } else if (this.BMI > 25) {
            res = "Overweight";
        }
        return res;
    }
}


package currencies;

public class KYD extends converter {
    public KYD() {
        INR = 99.66;
        USD = 1.20;
        EUR = 3.02;
        GBP = 2.58;
        KWD = 0.37;
        JPY = 180.47;
        KYD = 1.0;
    }

    public double KYDToINR(double dollars) {
        return (dollars * INR);
    }

    public double KYDToEUR(double dollars) {
        return (dollars * EUR);
    }

    public double KYDToGBP(double dollars) {
        return (dollars * GBP);
    }

    public double KYDToJPY(double dollars) {
        return (dollars * JPY);
    }

    public double KYDToUSD(double dollars) {
        return (dollars * USD);
    }

    public double KYDToKWD(double dollars) {
        return (dollars * KWD);
    }
}

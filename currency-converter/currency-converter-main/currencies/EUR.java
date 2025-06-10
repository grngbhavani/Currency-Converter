package currencies;

public class EUR extends converter {
    public EUR() {
        INR = 89.43;
        USD = 1.08;
        EUR = 1.0;
        GBP = 0.85;
        KWD = 0.33;
        JPY = 161.89;
        KYD = 0.90;
    }

    public double EURToINR(double euros) {
        return (euros * INR);
    }

    public double EURToUSD(double euros) {
        return (euros * USD);
    }

    public double EURToGBP(double euros) {
        return (euros * GBP);
    }

    public double EURToJPY(double euros) {
        return (euros * JPY);
    }

    public double EURToKWD(double euros) {
        return (euros * KWD);
    }

    public double EURToKYD(double euros) {
        return (euros * KYD);
    }
}

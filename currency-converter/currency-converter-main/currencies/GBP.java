package currencies;

public class GBP extends converter {
    public GBP() {
        INR = 104.62;
        USD = 1.26;
        EUR = 1.17;
        GBP = 1.0;
        KWD = 0.39;
        JPY = 189.45;
        KYD = 1.05;
    }

    public double GBPToINR(double pounds) {
        return (pounds * INR);
    }

    public double GBPToUSD(double pounds) {
        return (pounds * USD);
    }

    public double GBPToEUR(double pounds) {
        return (pounds * EUR);
    }

    public double GBPToJPY(double pounds) {
        return (pounds * JPY);
    }

    public double GBPToKWD(double pounds) {
        return (pounds * KWD);
    }

    public double GBPToKYD(double pounds) {
        return (pounds * KYD);
    }
}

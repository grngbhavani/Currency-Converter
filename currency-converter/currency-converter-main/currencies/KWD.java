package currencies;

public class KWD extends converter {
    public KWD() {
        INR = 270.03;
        USD = 3.25;
        EUR = 3.02;
        GBP = 2.58;
        KWD = 1.0;
        JPY = 488.99;
        KYD = 2.71;
    }

    public double KWDToINR(double dinar) {
        return (dinar * INR);
    }

    public double KWDToEUR(double dinar) {
        return (dinar * EUR);
    }

    public double KWDToGBP(double dinar) {
        return (dinar * GBP);
    }

    public double KWDToJPY(double dinar) {
        return (dinar * JPY);
    }

    public double KWDToUSD(double dinar) {
        return (dinar * USD);
    }

    public double KWDToKYD(double dinar) {
        return (dinar * KYD);
    }
}

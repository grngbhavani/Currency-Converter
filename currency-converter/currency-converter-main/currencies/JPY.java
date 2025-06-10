package currencies;

public class JPY extends converter {
    public JPY() {
        INR = 0.55;
        USD = 0.0067;
        EUR = 0.0062;
        GBP = 0.0053;
        KWD = 0.0021;
        JPY = 1.0;
        KYD = 0.0055;
        // String rates="All rates were collected on 23-05-2021 from
        // https://www.exchange-rates.org/";
    }

    public double JPYToUSD(double yen) {
        return (yen * USD);
    }

    public double JPYToEUR(double yen) {
        return (yen * EUR);
    }

    public double JPYToGBP(double yen) {
        return (yen * GBP);
    }

    public double JPYToINR(double yen) {
        return (yen * INR);
    }

    public double JPYToKWD(double yen) {
        return (yen * KWD);
    }

    public double JPYToKYD(double yen) {
        return (yen * KYD);
    }
}
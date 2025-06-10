package currencies;

public class INR extends converter {
    public INR() {
        INR = 1.0;
        USD = 0.012;
        EUR = 0.011;
        GBP = 0.0096;
        KWD = 0.0037;
        JPY = 1.81;
        KYD = 0.010;
        // String rates="All rates were collected on 23-05-2021 from
        // https://www.exchange-rates.org/";
    }

    public double INRToUSD(double rupees) {
        return (rupees * USD);
    }

    public double INRToEUR(double rupees) {
        return (rupees * EUR);
    }

    public double INRToGBP(double rupees) {
        return (rupees * GBP);
    }

    public double INRToJPY(double rupees) {
        return (rupees * JPY);
    }

    public double INRToKWD(double rupees) {
        return (rupees * KWD);
    }

    public double INRToKYD(double rupees) {
        return (rupees * KYD);
    }
}

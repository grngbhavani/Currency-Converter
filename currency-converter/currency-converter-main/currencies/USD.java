package currencies;

public class USD extends converter {
    public USD() {
        INR = 83.02;
        USD = 1.0;
        EUR = 0.93;
        GBP = 0.79;
        KWD = 0.31;
        JPY = 150.33;
        KYD = 0.83;
       
    }

    public double USDToINR(double dollars) {
        return (dollars * INR);
    }

    public double USDToEUR(double dollars) {
        return (dollars * EUR);
    }

    public double USDToGBP(double dollars) {
        return (dollars * GBP);
    }

    public double USDToJPY(double dollars) {
        return (dollars * JPY);
    }

    public double USDToKWD(double dollars) {
        return (dollars * KWD);
    }

    public double USDToKYD(double dollars) {
        return (dollars * KYD);
    }
}
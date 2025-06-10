import currencies.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class currencyConverter extends Frame implements ActionListener {
    Choice cFrom, cTo;
    TextField input;
    Label answer, from, to, none, addressInput;
    Button convert, switchCountry, showHistory;
    private ConversionHistory history;

    public currencyConverter() {
        setTitle("Currency Converter");
        setSize(600, 400);
        setLayout(null);
        setFont(new Font("Arial", Font.PLAIN, 18));

        from = new Label("Select first currency:");
        from.setBounds(50, 100, 200, 30);
        add(from);

        cFrom = new Choice();
        cFrom.add("INR");
        cFrom.add("USD");
        cFrom.add("EUR");
        cFrom.add("JPY");
        cFrom.add("KYD");
        cFrom.add("KWD");
        cFrom.add("GBP");
        cFrom.setBounds(250, 100, 200, 30);
        add(cFrom);

        to = new Label("Select second currency:");
        to.setBounds(50, 150, 200, 30);
        add(to);

        cTo = new Choice();
        cTo.add("INR");
        cTo.add("USD");
        cTo.add("EUR");
        cTo.add("JPY");
        cTo.add("KYD");
        cTo.add("KWD");
        cTo.add("GBP");
        cTo.setBounds(250, 150, 200, 30);
        add(cTo);

        addressInput = new Label("Enter amount:");
        addressInput.setBounds(50, 200, 150, 30);
        add(addressInput);

        input = new TextField();
        input.setBounds(250, 200, 200, 30);
        add(input);

        answer = new Label("Conversion result will be displayed here.");
        answer.setBounds(50, 250, 500, 30);
        add(answer);

        convert = new Button("Convert");
        convert.setBounds(100, 300, 100, 30);
        convert.addActionListener(this);
        add(convert);

        switchCountry = new Button("Switch currencies");
        switchCountry.setBounds(300, 300, 150, 30);
        switchCountry.addActionListener(this);
        add(switchCountry);

        showHistory = new Button("Show History");
        showHistory.setBounds(500, 300, 120, 30);
        showHistory.addActionListener(this);
        add(showHistory);

        none = new Label();
        none.setBackground(Color.decode("0xdda0dd"));
        none.setBounds(0, 50, 1000, 50);
        add(none);

        setVisible(true);
        history = new ConversionHistory();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                String amountStr = input.getText();
                double amount = Double.parseDouble(amountStr);

                String fromCurrency = cFrom.getSelectedItem();
                String toCurrency = cTo.getSelectedItem();

                double result = convertCurrency(amount, fromCurrency, toCurrency);
                answer.setText(amount + " " + fromCurrency + " is equal to " + result + " " + toCurrency);
                history.addRecord(new ConversionRecord(fromCurrency, toCurrency, amount, result));
            } catch (NumberFormatException ex) {
                answer.setText("Invalid input. Please enter a valid number.");
            }
        } else if (e.getSource() == switchCountry) {
            String tempChoice = cFrom.getSelectedItem();
            cFrom.select(cTo.getSelectedItem());
            cTo.select(tempChoice);
        } else if (e.getSource() == showHistory) {
            displayHistory();
        }
    }

    private void displayHistory() {
        StringBuilder historyText = new StringBuilder("Conversion History:\n");
        for (ConversionRecord record : history.getHistory()) {
            historyText.append(record.getFromCurrency())
                    .append(" to ")
                    .append(record.getToCurrency())
                    .append(": ")
                    .append(record.getAmount())
                    .append(" -> ")
                    .append(record.getResult())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(this, historyText.toString(), "Conversion History",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double result = 0;
        switch (fromCurrency) {
            case "INR":
                result = convertINR(amount, toCurrency);
                break;
            case "USD":
                result = convertUSD(amount, toCurrency);
                break;
            case "EUR":
                result = convertEUR(amount, toCurrency);
                break;
            case "JPY":
                result = convertJPY(amount, toCurrency);
                break;
            case "KYD":
                result = convertKYD(amount, toCurrency);
                break;
            case "KWD":
                result = convertKWD(amount, toCurrency);
                break;
            case "GBP":
                result = convertGBP(amount, toCurrency);
                break;
        }
        return result;
    }

    public double convertINR(double amount, String toCurrency) {
        INR inr = new INR();
        switch (toCurrency) {
            case "USD":
                return inr.INRToUSD(amount);
            case "EUR":
                return inr.INRToEUR(amount);
            case "JPY":
                return inr.INRToJPY(amount);
            case "KYD":
                return inr.INRToKYD(amount);
            case "KWD":
                return inr.INRToKWD(amount);
            case "GBP":
                return inr.INRToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertUSD(double amount, String toCurrency) {
        USD usd = new USD();
        switch (toCurrency) {
            case "INR":
                return usd.USDToINR(amount);
            case "EUR":
                return usd.USDToEUR(amount);
            case "JPY":
                return usd.USDToJPY(amount);
            case "KYD":
                return usd.USDToKYD(amount);
            case "KWD":
                return usd.USDToKWD(amount);
            case "GBP":
                return usd.USDToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertEUR(double amount, String toCurrency) {
        EUR eur = new EUR();
        switch (toCurrency) {
            case "INR":
                return eur.EURToINR(amount);
            case "USD":
                return eur.EURToUSD(amount);
            case "JPY":
                return eur.EURToJPY(amount);
            case "KYD":
                return eur.EURToKYD(amount);
            case "KWD":
                return eur.EURToKWD(amount);
            case "GBP":
                return eur.EURToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertJPY(double amount, String toCurrency) {
        JPY jpy = new JPY();
        switch (toCurrency) {
            case "INR":
                return jpy.JPYToINR(amount);
            case "USD":
                return jpy.JPYToUSD(amount);
            case "EUR":
                return jpy.JPYToEUR(amount);
            case "KYD":
                return jpy.JPYToKYD(amount);
            case "KWD":
                return jpy.JPYToKWD(amount);
            case "GBP":
                return jpy.JPYToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertKYD(double amount, String toCurrency) {
        KYD kyd = new KYD();
        switch (toCurrency) {
            case "INR":
                return kyd.KYDToINR(amount);
            case "USD":
                return kyd.KYDToUSD(amount);
            case "EUR":
                return kyd.KYDToEUR(amount);
            case "JPY":
                return kyd.KYDToJPY(amount);
            case "KWD":
                return kyd.KYDToKWD(amount);
            case "GBP":
                return kyd.KYDToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertKWD(double amount, String toCurrency) {
        KWD kwd = new KWD();
        switch (toCurrency) {
            case "INR":
                return kwd.KWDToINR(amount);
            case "USD":
                return kwd.KWDToUSD(amount);
            case "EUR":
                return kwd.KWDToEUR(amount);
            case "JPY":
                return kwd.KWDToJPY(amount);
            case "KYD":
                return kwd.KWDToKYD(amount);
            case "GBP":
                return kwd.KWDToGBP(amount);
            default:
                return amount;
        }
    }

    public double convertGBP(double amount, String toCurrency) {
        GBP gbp = new GBP();
        switch (toCurrency) {
            case "INR":
                return gbp.GBPToINR(amount);
            case "USD":
                return gbp.GBPToUSD(amount);
            case "EUR":
                return gbp.GBPToEUR(amount);
            case "JPY":
                return gbp.GBPToJPY(amount);
            case "KYD":
                return gbp.GBPToKYD(amount);
            case "KWD":
                return gbp.GBPToKWD(amount);
            default:
                return amount;
        }
    }

    public static void main(String[] args) {
        new currencyConverter();
    }
}

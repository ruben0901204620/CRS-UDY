import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows07CurrencyConverter extends JFrame implements ActionListener {

    Container panel;
    JButton buttonEu, buttonUsd, buttonReset;
    JTextField mount;

    public static final String CURRENCY_DOLAR = "dolar";
    public static final String CURRENCY_EUROS = "euros";

    public Windows07CurrencyConverter() {
        super("Conversor de modenas");
        panel = getContentPane();
        panel.setLayout(new FlowLayout());

        mount = new JTextField(10);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(this);



        buttonEu = new JButton(CURRENCY_EUROS);
        buttonEu.addActionListener(this);
        buttonUsd = new JButton(CURRENCY_DOLAR);
        buttonUsd.addActionListener(this);

        panel.add(mount);
        panel.add(buttonEu);
        panel.add(buttonUsd);
        panel.add(buttonReset);

        setSize(500, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float value = Float.parseFloat(mount.getText());
        String textCurrency = e.getActionCommand();

        if(textCurrency.equals(CURRENCY_DOLAR)) {
            value = (float) (value / 7.65);
            panel.setBackground(Color.green);
        } else if(textCurrency.equals(CURRENCY_EUROS)) {
            value = (value / 9.04f);
            panel.setBackground(Color.blue);

        } else {
            value = 0.00f;
        }

        mount.setText(String.valueOf(value));


    }

    static void main() {
        new Windows07CurrencyConverter();
    }
}

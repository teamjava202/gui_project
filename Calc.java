import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    private JTextField textField;

    public Calc() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case "=":
                    try {
                        String expression = textField.getText();
                        double result = evaluateExpression(expression);
                        textField.setText(Double.toString(result));
                    } catch (Exception ex) {
                        textField.setText("Error");
                    }
                    break;

                case "C":
                    textField.setText("");
                    break;

                default:
                    textField.setText(textField.getText() + buttonText);
                    break;
            }
        }

        private double evaluateExpression(String expression) {
            return (double) new Object() {
                public Object execute() {
                    try {
                        return new java.util.Scanner(expression).nextDouble();
                    } catch (Exception e) {
                        return "Error";
                    }
                }
            }.execute();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calc().setVisible(true);
        });
    }
}


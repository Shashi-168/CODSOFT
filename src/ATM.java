import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ATM implements ActionListener
{
    private JFrame frame;
    private JPanel panel;
    private JLabel balanceLabel;
    private JButton TransactionHistoryButton,  DepositButton, WithdrawButton, TransferButton, QuitButton;
    private double balance= 7000; //It is the initial balance.
    public ATM()
    {
        frame= new JFrame ("ATM Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        balanceLabel= new JLabel("Your current balance is:" +balance, JLabel.CENTER);
        panel.add(balanceLabel);

        TransactionHistoryButton= new JButton("Check Balance");
        TransactionHistoryButton.addActionListener(this);
        panel.add(TransactionHistoryButton);

        DepositButton= new JButton("Deposit");
        DepositButton.addActionListener(this);
        panel.add(DepositButton);

        WithdrawButton= new JButton("Withdraw");
        WithdrawButton.addActionListener(this);
        panel.add(WithdrawButton);

        TransferButton= new JButton("Transfer");
        TransferButton.addActionListener(this);
        panel.add(TransferButton);

        QuitButton= new JButton("Quit");
        QuitButton.addActionListener(this);
        panel.add(QuitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == TransactionHistoryButton) {
            JOptionPane.showMessageDialog(frame, "Your current balance is:" + balance);
        } else if (e.getSource() == DepositButton) {
            String input = JOptionPane.showInputDialog(frame, "Enter the amount to deposit:");
            double amount = Double.parseDouble(input);
            balance += amount;
            balanceLabel.setText("Your current balance is:" + balance);
            JOptionPane.showMessageDialog(frame, "You have deposited:" + amount + "Your new current balance is:" + balance);
        } else if (e.getSource() == WithdrawButton) {
            String input = JOptionPane.showInputDialog(frame, "Enter amount withdraw:");
            double amount = Double.parseDouble(input);
            if (balance >= amount) {
                balance -= amount;
                balanceLabel.setText("Your current balance is:" + balance);
                JOptionPane.showMessageDialog(frame, "You have withdrawn:" + amount + "Your new current balance is:" + balance);
            } else {
                JOptionPane.showMessageDialog(frame, "Insufficient balance");
            }
        } else if (e.getSource() == TransferButton) {
            String input = JOptionPane.showInputDialog(frame, "Enter the amount to transfer:");
            double amount = Double.parseDouble(input);
            if (balance >= amount) {
                balance -= amount;
                balanceLabel.setText("Your current balance is:" + balance);
                JOptionPane.showMessageDialog(frame, "You have transferred:" + amount + "Your new current balance is:" + balance);
            } else {
                JOptionPane.showMessageDialog(frame, "Insufficient balance");
            }
        } else if (e.getSource() == QuitButton) {
            String input = JOptionPane.showInputDialog(frame, "Are you sure you want to quit?");
            double amount = Double.parseDouble(input);
            frame.dispose();
        }
    }
    public static void main (String[] args)
    {
        new ATM();
    }
}
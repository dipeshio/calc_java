import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JFrame frame;
    JPanel buttonPanel;
    JPanel calcButtonsNum;
    JPanel calcButtonsOp;
    JPanel calcButtonsFunc;
    JTextField calcDisplay;

    Calculator() {
        int WIDTH = 350;
        int HEIGHT = 550;

        // creating the frame
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(WIDTH, HEIGHT);
        frame.getContentPane().setLayout(new BorderLayout());
        // frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK,
        // 4));

        // creating the button panel
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(WIDTH, frame.getHeight() / 2));
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.PINK, 4));

        // text display of the calculator
        calcDisplay = new JTextField("0");
        calcDisplay.setFont(new Font("Roman", Font.PLAIN, 40));
        calcDisplay.setHorizontalAlignment(JTextField.RIGHT);
        // Display Configuration
        calcDisplay.setPreferredSize(new Dimension(310, 110));
        calcDisplay.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        // // ButtonsNum Configuration
        calcButtonsNum = new JPanel();
        buttonPanel.add(calcButtonsNum, BorderLayout.WEST);
        // // ButtonNum Configuration
        calcButtonsNum.setPreferredSize(new Dimension((int) ((WIDTH / 4) * 2.95), 300));
        calcButtonsNum.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        calcButtonsNum.setLayout(new GridLayout(3, 3, 3, 5));
        // // calcButtonsNum.setBackground(new Color(32, 32, 32, 255));

        calcButtonsOp = new JPanel();
        buttonPanel.add(calcButtonsOp, BorderLayout.EAST);
        calcButtonsOp.setPreferredSize(new Dimension((WIDTH / 4) * 1, 300));
        calcButtonsOp.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
        calcButtonsOp.setLayout(new GridLayout(3, 1, 3, 5));

        calcButtonsFunc = new JPanel();
        buttonPanel.add(calcButtonsFunc, BorderLayout.NORTH);
        calcButtonsFunc.setPreferredSize(new Dimension(WIDTH, WIDTH / 4));
        calcButtonsFunc.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        calcButtonsFunc.setLayout(new GridLayout(1, 4, 3, 5));

        // // ButtonsOp Configuration
        // calcButtonsOp.setPreferredSize(new Dimension(100, 300));
        // calcButtonsOp.setMaximumSize(new Dimension(100, 300));
        // calcButtonsOp.setMinimumSize(new Dimension(100, 300));
        // calcButtonsOp.setAlignmentX(Component.RIGHT_ALIGNMENT);
        // calcButtonsOp.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        // calcButtonsOp.setLayout(new GridLayout(4, 1, 3, 5));

        // calcButtonsFunc = new JPanel();

        // creating the layout of the calculator
        frame.add(calcDisplay, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.WEST);
        // frame.add(calcButtonsNum);
        // frame.add(calcButtonsOp);
        // frame.add(calcButtonsFunc);

        ////////////////////////// CONFIGURATIONS //////////////////////////

        // creating ButtonsNum
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            // button qualities
            // button.setForeground(Color.BLACK);
            // button.setFont(new Font("Roman", Font.PLAIN, 20));
            // button.setBackground(new Color(59, 59, 59, 255));
            calcButtonsNum.add(button);
        }

        for (int i = 1; i <= 3; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            // button qualities
            // button.setForeground(Color.BLACK);
            // button.setFont(new Font("Roman", Font.PLAIN, 20));
            // button.setBackground(new Color(59, 59, 59, 255));
            calcButtonsOp.add(button);
        }
        for (int i = 1; i <= 4; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            // button qualities
            // button.setForeground(Color.BLACK);
            // button.setFont(new Font("Roman", Font.PLAIN, 20));
            // button.setBackground(new Color(59, 59, 59, 255));
            calcButtonsFunc.add(button);
        }

        // making the window show
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcDisplay.setVisible(true);
        calcButtonsNum.setVisible(true);
        buttonPanel.setVisible(true);
    }

    // Action performed logic here
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if (calcDisplay.getText().equals("0")) {
            calcDisplay.setText(buttonText);
        } else {
            calcDisplay.setText(calcDisplay.getText() + buttonText);
        }

    }

    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
    }
}

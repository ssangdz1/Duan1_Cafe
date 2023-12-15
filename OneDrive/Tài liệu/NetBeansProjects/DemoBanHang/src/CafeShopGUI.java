import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CafeShopGUI extends JFrame {
    private JPanel menuPanel;
    private JTextArea orderTextArea;

    public CafeShopGUI() {
        setTitle("Cafe Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createMenuPanel();
        createOrderPanel();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createMenuPanel() {
        menuPanel = new JPanel(new GridLayout(3, 1));
        JButton espressoButton = new JButton("Espresso");
        JButton cappuccinoButton = new JButton("Cappuccino");
        JButton latteButton = new JButton("Latte");

        espressoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToOrder("Espresso");
            }
        });

        cappuccinoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToOrder("Cappuccino");
            }
        });

        latteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToOrder("Latte");
            }
        });

        menuPanel.add(espressoButton);
        menuPanel.add(cappuccinoButton);
        menuPanel.add(latteButton);

        add(menuPanel, BorderLayout.WEST);
    }

    private void createOrderPanel() {
        orderTextArea = new JTextArea(10, 30);
        orderTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(orderTextArea);

        add(scrollPane, BorderLayout.CENTER);
    }

    private void addToOrder(String item) {
        orderTextArea.append(item + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CafeShopGUI();
            }
        });
    }
}
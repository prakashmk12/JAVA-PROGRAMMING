/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROGRAM;

/**
 *
 * @author Kavinkumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EXNO10 extends JFrame implements ActionListener {

    JPanel panel;
    JButton redButton, blueButton, yellowButton;

    public EXNO10() {
        // Create panel
        panel = new JPanel();

        // Create buttons
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");

        // Add action listeners
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);

        // Add buttons to panel
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);

        // Add panel to frame
        add(panel);

        // Frame settings
        setTitle("Color Change Panel");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            panel.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            panel.setBackground(Color.BLUE);
        } else if (e.getSource() == yellowButton) {
            panel.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new EXNO10();
    }
}
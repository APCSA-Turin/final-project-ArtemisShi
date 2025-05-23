package com.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

public class SimpleGUI {
    private static JLabel summonLabel;
    private static JPanel summonGridPanel;

    public static void main(String[] args) {
        // Create the main frame
        BirdRanks B = new BirdRanks();
        BirdCollection d = new BirdCollection();
        JFrame frame = new JFrame("Summoning GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // load image NOT WORKING
        ImageIcon originalIcon = new ImageIcon(Objects.requireNonNull(SimpleGUI.class.getResource("/OIP.png")));
        // scale image
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        // components
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setPreferredSize(new Dimension(100, 100));
        JLabel feather = new JLabel("Feathers");
        summonLabel = new JLabel();

        // Initialize the grid panel
        summonGridPanel = new JPanel(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns, with 10px gaps
        summonGridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton easy= new JButton("Easy");
        JButton medium= new JButton("Medium");
        JButton hard= new JButton("Hard");
        JButton right = new JButton("Move Right");
        JButton left = new JButton("Move Left");
        JButton w = new JButton("Summon 1");
        JButton w1 = new JButton("Summon 10");

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.add(right);

        // Add components
        mainPanel.add(imageLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(feather, BorderLayout.NORTH);
//        mainPanel.add(easy, BorderLayout.WEST);
//        mainPanel.add(medium, BorderLayout.CENTER);
//        mainPanel.add(hard, BorderLayout.EAST);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        frame.add(mainPanel);

        // Button actions
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                buttonPanel.remove(easy);
//                buttonPanel.remove(medium);
//                buttonPanel.remove(hard);
                buttonPanel.remove(right);

                buttonPanel.add(w);
                buttonPanel.add(w1);
                buttonPanel.add(left);
                buttonPanel.revalidate();
                buttonPanel.repaint();
            }
        });

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.remove(left);
                buttonPanel.remove(w);
                buttonPanel.remove(w1);
                buttonPanel.add(right);
                mainPanel.remove(summonLabel);
                mainPanel.remove(summonGridPanel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        w.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String summonText = App.generator();
                summonLabel.setText("<html>" + summonText.replace("\n", "<br/>") + "</html>");
                mainPanel.remove(summonGridPanel);
                mainPanel.add(summonLabel, BorderLayout.CENTER);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        w1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                summonGridPanel.removeAll();


                for (int i = 0; i < 10; i++) {
                    String summonText = App.generator();
                    JLabel summon = new JLabel("<html>" + summonText.replace("\n", "<br/>") + "</html>");
                    summon.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    summonGridPanel.add(summon);
                }

                mainPanel.remove(summonLabel);
                mainPanel.add(summonGridPanel, BorderLayout.CENTER);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });


        frame.setMinimumSize(new Dimension(1000, 700));
        frame.pack();
        frame.setVisible(true);
    }
}
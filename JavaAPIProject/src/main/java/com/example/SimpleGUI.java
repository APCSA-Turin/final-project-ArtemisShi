package com.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class SimpleGUI {
    private static JLabel summonLabel;
    private static JPanel summonGridPanel;
    private static JFrame frame;
    private static int feathers=0;
    private static JPanel inventoryPanel;
    private static JButton a1;
    private static JButton a2;
    private static JButton a3;
    private static JButton a4;
    private static JLabel imageLabel;
    private static int ran;
    private static String question;

    public SimpleGUI() {
        // Create the main frame
        BirdRanks B = new BirdRanks();
        BirdCollection d = new BirdCollection();
        frame = new JFrame("Summoning GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Summon display
        summonLabel = new JLabel(); // To display summoning result(s)

        // Initialize the grid panel for multiple summoning results
        summonGridPanel = new JPanel(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns
        summonGridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));// Done so components aren't hugging the edge

        // Buttons
        JButton easy = new JButton("Easy");
        JButton medium = new JButton("Medium");
        JButton hard = new JButton("Hard");
        JButton right = new JButton("Move Right");
        JButton left = new JButton("Move Left");
        JButton summon1 = new JButton("Summon 1");
        JButton summon10 = new JButton("Summon 10");
        JButton inventory = new JButton("Inventory");
        JButton leaveInventory = new JButton("Leave Inventory");
        // These buttons are for answers
        a1= new JButton();
        a2= new JButton();
        a3= new JButton();
        a4= new JButton();


        // Main panel with a border
        JPanel mainPanel = new JPanel(new BorderLayout());

        // JLabel that shows the amount of feathers you have which will be used as a currency in order to summon the birds
        JLabel f = new JLabel("Feathers: "+feathers);

        // Inventory panel - The inventory will take from the BirdCollection
        inventoryPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Question panel
        JPanel abilitiesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Panel with pokemon ability info
        JPanel typesPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Panel with pokemon type info
        JPanel QPanel = new JPanel(new BorderLayout()); // Panel that holds other information and panels
        JPanel CPanel = new JPanel(); // Panel that holds other information and panels

        // Create a question label
        JLabel questionLabel = new JLabel("What is this Pokemon called?", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 40));

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.add(easy, BorderLayout.WEST);
        buttonPanel.add(medium, BorderLayout.CENTER);
        buttonPanel.add(hard, BorderLayout.EAST);
        buttonPanel.add(right);

        // Feather info
        mainPanel.add(f,BorderLayout.NORTH);

        // Set frame
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.add(mainPanel);

        // Button actions

        // Questions
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ran = (int)(Math.random()*4)+1; // ran will be the actual pokemon in question
                question="e"; // e for easy - to be used in another method
                String imageUrl=""; // Easy questions will give a high quality pokemon image for players to guess from
                // Initializes the answers, the correct answer, and the image
                try {
                for(int i=1; i<5; i++) {
                    PokemonJSONProcessor place = new PokemonJSONProcessor();
                    String name=place.getPokemonName();
                    if(i==ran){
                        imageUrl = place.getOSprite(); 
                    }
                    if(i==1) {
                            a1.setText(name);
                    }
                    if(i==2) {
                            a2.setText(name);
                    }
                    if(i==3) {
                            a3.setText(name);
                    }
                    if(i==4) {
                            a4.setText(name);
                    }
                }
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                
                ImageIcon icon = null;
                try {
                    // Takes url from JSON
                    icon = new ImageIcon(new URL(imageUrl));
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }

                imageLabel = new JLabel(icon);
                imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

                buttonPanel.remove(easy);
                buttonPanel.remove(medium);
                buttonPanel.remove(hard);
                buttonPanel.remove(right);

                mainPanel.add(questionLabel, BorderLayout.NORTH);
                mainPanel.add(imageLabel, BorderLayout.CENTER);
                buttonPanel.add(a1);
                buttonPanel.add(a2);
                buttonPanel.add(a3);
                buttonPanel.add(a4);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        // Code is basically the same as easy with one deviation
        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ran = (int)(Math.random()*4)+1;
                question="m";
                String imageUrl="";
                try {
                    for(int i=1; i<5; i++) {
                        PokemonJSONProcessor place = new PokemonJSONProcessor();
                        String name=place.getPokemonName();
                        if(i==ran){
                            imageUrl = place.getSprite(); // For medium, you only get a small pixel sprite of the pokemon
                        }
                        if(i==1) {
                            a1.setText(name);
                        }
                        if(i==2) {
                            a2.setText(name);
                        }
                        if(i==3) {
                            a3.setText(name);
                        }
                        if(i==4) {
                            a4.setText(name);
                        }
                    }
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                ImageIcon icon = null;
                try {
                    icon = new ImageIcon(new URL(imageUrl));
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }

                imageLabel = new JLabel(icon);
                imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

                buttonPanel.remove(easy);
                buttonPanel.remove(medium);
                buttonPanel.remove(hard);
                buttonPanel.remove(right);

                mainPanel.add(questionLabel, BorderLayout.NORTH);
                mainPanel.add(imageLabel, BorderLayout.CENTER);
                buttonPanel.add(a1);
                buttonPanel.add(a2);
                buttonPanel.add(a3);
                buttonPanel.add(a4);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ran = (int)(Math.random()*4)+1;
                question="h";
                try {
                    // This clears previous components as hard needs multiple panels in order to display the right info
                    mainPanel.removeAll();
                    buttonPanel.removeAll();

                    // Adds question label at the top
                    QPanel.add(questionLabel, BorderLayout.NORTH);
                    CPanel.setLayout(new BoxLayout(CPanel, BoxLayout.Y_AXIS));

                    for(int i=1; i<5; i++) {
                        PokemonJSONProcessor place = new PokemonJSONProcessor();
                        String name = place.getPokemonName();
                        if(i==ran){
                            // Creates panel for Pokemon info
                            JPanel infoPanel = new JPanel();
                            infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

                            // Adds abilities info
                            JPanel abilitiesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                            abilitiesPanel.add(new JLabel("Abilities: "));
                            for (String ability : place.getAbilities()) {
                                abilitiesPanel.add(new JLabel(ability));
                                abilitiesPanel.add(Box.createHorizontalStrut(10));
                            }

                            // Adds types info
                            JPanel typesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                            typesPanel.add(new JLabel("Types: "));
                            for (String type : place.getPokemonTypes()) {
                                typesPanel.add(new JLabel(type));
                            }

                            // Adds both panels with info to info panel
                            infoPanel.add(abilitiesPanel);
                            infoPanel.add(typesPanel);
                            CPanel.add(infoPanel);
                        }

                        if(i==1) {
                            a1.setText(name);
                        }
                        if(i==2) {
                            a2.setText(name);
                        }
                        if(i==3) {
                            a3.setText(name);
                        }
                        if(i==4) {
                            a4.setText(name);
                        }
                    }

                    // Adds c panel to q panel
                    QPanel.add(CPanel, BorderLayout.CENTER);

                    // Adds buttons to button panel
                    buttonPanel.add(a1);
                    buttonPanel.add(a2);
                    buttonPanel.add(a3);
                    buttonPanel.add(a4);

                    // Adds q and button panels to main panel
                    mainPanel.add(QPanel, BorderLayout.CENTER);
                    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

                    frame.revalidate();
                    frame.repaint();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Answers
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ran==1){ // Ran is the right answer so this only changes when you click the right answer
                    feathers++; // Feather amount increases by 1 for easy
                    if(question.equals("m")){ // If medium, it increases by 5
                        feathers+=4;
                    }
                    if(question.equals("h")){ // If hard, it increase by 10
                        feathers+=9;
                    }
                }

                buttonPanel.remove(a1);
                buttonPanel.remove(a2);
                buttonPanel.remove(a3);
                buttonPanel.remove(a4);
                if(!question.equals("h")) { // hard questions have no images
                    mainPanel.remove(imageLabel);
                }
                QPanel.removeAll();
                CPanel.removeAll();
                mainPanel.remove(questionLabel);
                mainPanel.remove(QPanel);
                mainPanel.remove(CPanel);

                buttonPanel.add(easy);
                buttonPanel.add(medium);
                buttonPanel.add(hard);
                buttonPanel.add(right);
                mainPanel.add(f,BorderLayout.NORTH); // Makes sure feather amount is displayed
                f.setText("Feathers: "+feathers); // Sets new feather amount

                frame.revalidate();
                frame.repaint();
            }
        });

        // Rest of a buttons are the same
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ran==2){
                    feathers++;
                    if(question.equals("m")){
                        feathers+=4;
                    }
                    if(question.equals("h")){
                        feathers+=9;
                    }
                }

                buttonPanel.remove(a1);
                buttonPanel.remove(a2);
                buttonPanel.remove(a3);
                buttonPanel.remove(a4);
                if(!question.equals("h")) {
                    mainPanel.remove(imageLabel);
                }
                QPanel.removeAll();
                CPanel.removeAll();
                mainPanel.remove(questionLabel);
                mainPanel.remove(QPanel);
                mainPanel.remove(CPanel);

                buttonPanel.add(easy);
                buttonPanel.add(medium);
                buttonPanel.add(hard);
                buttonPanel.add(right);
                mainPanel.add(f,BorderLayout.NORTH);
                f.setText("Feathers: "+feathers);

                frame.revalidate();
                frame.repaint();
            }
        });

        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ran==3){
                    feathers++;
                    if(question.equals("m")){
                        feathers+=4;
                    }
                    if(question.equals("h")){
                        feathers+=9;
                    }
                }

                buttonPanel.remove(a1);
                buttonPanel.remove(a2);
                buttonPanel.remove(a3);
                buttonPanel.remove(a4);
                if(!question.equals("h")) {
                    mainPanel.remove(imageLabel);
                }
                QPanel.removeAll();
                CPanel.removeAll();
                mainPanel.remove(questionLabel);
                mainPanel.remove(QPanel);
                mainPanel.remove(CPanel);

                buttonPanel.add(easy);
                buttonPanel.add(medium);
                buttonPanel.add(hard);
                buttonPanel.add(right);
                mainPanel.add(f,BorderLayout.NORTH);
                f.setText("Feathers: "+feathers);

                frame.revalidate();
                frame.repaint();
            }
        });

        a4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ran==4){
                    feathers++;
                    if(question.equals("m")){
                        feathers+=4;
                    }
                    if(question.equals("h")){
                        feathers+=9;
                    }
                }

                buttonPanel.remove(a1);
                buttonPanel.remove(a2);
                buttonPanel.remove(a3);
                buttonPanel.remove(a4);
                if(!question.equals("h")) {
                    mainPanel.remove(imageLabel);
                }
                QPanel.removeAll();
                CPanel.removeAll();
                mainPanel.remove(questionLabel);
                mainPanel.remove(QPanel);
                mainPanel.remove(CPanel);

                buttonPanel.add(easy);
                buttonPanel.add(medium);
                buttonPanel.add(hard);
                buttonPanel.add(right);
                mainPanel.add(f,BorderLayout.NORTH);
                f.setText("Feathers: "+feathers);

                frame.revalidate();
                frame.repaint();
            }
        });

        // Movement

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.remove(easy);
                buttonPanel.remove(medium);
                buttonPanel.remove(hard);
                buttonPanel.remove(right);

                buttonPanel.add(summon1);
                buttonPanel.add(summon10);
                buttonPanel.add(inventory);
                buttonPanel.add(left);

                buttonPanel.revalidate();
                buttonPanel.repaint();
            }
        });

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.remove(left);
                buttonPanel.remove(summon1);
                buttonPanel.remove(summon10);
                buttonPanel.remove(inventory);
                mainPanel.remove(summonLabel);
                mainPanel.remove(summonGridPanel);

                buttonPanel.add(easy);
                buttonPanel.add(medium);
                buttonPanel.add(hard);
                buttonPanel.add(right);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });


        summon1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(feathers>0) { // Can only summon if you have the amount of feathers needed
                        String summonText = App.generator();

                        //Allows text to skip lines in the gui
                        summonLabel.setText("<html>" + summonText.replace("\n", "<br/>") + "</html>");

                        mainPanel.remove(summonGridPanel);
                        mainPanel.add(summonLabel, BorderLayout.CENTER);
                        mainPanel.revalidate();
                        mainPanel.repaint();

                        feathers--;// Sets new feather amount
                        f.setText("Feathers: "+feathers);

                    }
                    else{
                        summonLabel.setText("You don't have any feathers");

                        mainPanel.remove(summonGridPanel);
                        mainPanel.add(summonLabel, BorderLayout.CENTER);
                        mainPanel.revalidate();
                        mainPanel.repaint();
                    }
                }
            });



        summon10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                summonGridPanel.removeAll();
                if(feathers>9) {
                    for (int i = 0; i < 10; i++) {// You summon 10 so it displays ten summons
                        String summonText = App.generator();
                        JLabel summon = new JLabel("<html>" + summonText.replace("\n", "<br/>") + "</html>");
                        summon.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                        summonGridPanel.add(summon);
                    }
                    feathers-=10;
                    f.setText("Feathers: "+feathers);
                    mainPanel.remove(summonLabel);
                    mainPanel.add(summonGridPanel, BorderLayout.CENTER);
                    mainPanel.revalidate();
                    mainPanel.repaint();
                }
                else{
                    summonLabel.setText("You don't have enough feathers");

                    mainPanel.remove(summonGridPanel);
                    mainPanel.add(summonLabel, BorderLayout.CENTER);
                    mainPanel.revalidate();
                    mainPanel.repaint();
                }
            }
        });

        // Bird collection
        inventory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.remove(left);
                buttonPanel.remove(summon1);
                buttonPanel.remove(summon10);
                buttonPanel.remove(inventory);
                mainPanel.remove(summonLabel);
                mainPanel.remove(summonGridPanel);

                buttonPanel.add(leaveInventory);
                for(int i=0;i<d.getCollected().length;i++) {
                    JLabel bird = new JLabel("<html>" + d.getCollected()[i].getName() + "</html>");
                    inventoryPanel.add(bird);
                    inventoryPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    if(!(d.getCollected()[i].getName().equals("This bird has not yet been collected"))){
                        bird.setBorder(BorderFactory.createLineBorder(Color.ORANGE)); // If you have this bird, the color will demonstrate that
                    }
                    else{
                        bird.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                    }
                }
                mainPanel.add(inventoryPanel);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        leaveInventory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.add(summon1);
                buttonPanel.add(summon10);
                buttonPanel.add(inventory);
                buttonPanel.add(left);

                inventoryPanel.removeAll();
                buttonPanel.remove(leaveInventory);
                mainPanel.remove(inventoryPanel);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
            });

        frame.setMinimumSize(new Dimension(1000, 700));
        frame.pack();
        frame.setVisible(true);

    }}
package com.calculator.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.calculator.Programmer.Programmer;
import com.calculator.Scientific.Scientific;
import com.calculator.Standard.Standard;

import java.awt.*;
import java.awt.event.ActionEvent;

// 1354 lines of code
public class Calculator extends JFrame{

    Scientific scientificPanel;
    Standard standardPanel;
    Programmer programmerPanel;

    JMenu options;
    JMenuBar menuBar;
    JMenuItem standard, scientific, programmer;

    JPanel main;
    CardLayout cardLayout;
    Calculator(){
        setUpFrame();
        setUpStandardPanel();
        setUpScientificPanel();
        setUpProgrammerPanel();
        // setUpDateCalculation();
        setUpMenu();
    }
    // sets up the frame
    private void setUpFrame(){
        this.setTitle("Calculator");
        this.setSize(350, 550);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        main = new JPanel(cardLayout);
        this.setContentPane(main);
    }
    // sets up the standard panel
    private void setUpStandardPanel(){
        standardPanel = new Standard();
        main.add(standardPanel, "standard");
    }
    // adds and sets up the Scientific Part
    private void setUpScientificPanel(){
        scientificPanel = new Scientific();
        main.add(scientificPanel, "scientific");
    }
    // sets up the programmer panel
    private void setUpProgrammerPanel(){
        programmerPanel = new Programmer();
        main.add(programmerPanel, "programmer");
    }
    // sets up the date calculator panel
    // private void setUpDateCalculation(){
    //     // to be created
    // }
    // sets up the JMenuBar and other related staff
    private void setUpMenu(){
        standard = new JMenuItem("Standard");
        standard.setBorder(new EmptyBorder(5, 10, 5 , 10));
        standard.setFont(new Font("Times New Roman", Font.BOLD, 15));
        standard.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(main, "standard");
            }
        });

        scientific = new JMenuItem("Scientific");
        scientific.setBorder(new EmptyBorder(5, 10, 5 , 10));
        scientific.setFont(new Font("Times New Roman", Font.BOLD, 15));
        scientific.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(main, "scientific");
            }
        });

        programmer = new JMenuItem("Programmer");
        programmer.setBorder(new EmptyBorder(5, 10, 5 , 10));
        programmer.setFont(new Font("Times New Roman", Font.BOLD, 15));
        programmer.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(main, "programmer");
            }
        });

        // dateCalculation = new JMenuItem("Date Calculation");
        // dateCalculation.setBorder(new EmptyBorder(5, 10, 5 , 10));
        // dateCalculation.setFont(new Font("Times New Roman", Font.BOLD, 15));
        // dateCalculation.addActionListener(new AbstractAction() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         cardLayout.show(main, "dateCalculation");
        //     }
        // });

        options = new JMenu("Options");
        options.setFont(new Font("Times New Roman", Font.BOLD, 15));
        options.add(standard);
        options.add(scientific);
        options.add(programmer);
        // options.add(dateCalculation);

        menuBar = new JMenuBar();
        menuBar.add(options);
        this.setJMenuBar(menuBar);
    }





    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                    //
                }
                new Calculator().setVisible(true);
            }
        });
    }
}
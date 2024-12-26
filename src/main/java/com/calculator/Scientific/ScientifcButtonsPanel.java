package com.calculator.Scientific;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.calculator.Source.SourceClass;
import com.calculator.Source.JButtonCustom;


public class ScientifcButtonsPanel extends JPanel{

    SourceClass sourceClassObject;
    

    JPanel upChoices;
    JPanel downButtons;

    JButtonCustom trigonometry;
    JButtonCustom function;

    JDialog tri;
    JDialog fun;

    JButtonCustom sin;
    JButtonCustom cos;
    JButtonCustom tan;

    JButtonCustom ceil;
    JButtonCustom floor;
    ScientifcButtonsPanel(){
        this.setLayout(new BorderLayout());
        sourceClassObject = new SourceClass();
        
        setUpDownButtons();
        setUpUpChoices();
        
  


        this.add(upChoices, BorderLayout.NORTH);
        this.add(downButtons, BorderLayout.SOUTH);
    }
    
    // sets up the upper section of the main panel
    private void setUpUpChoices(){
        upChoices = new JPanel();
        upChoices.setLayout(new FlowLayout(FlowLayout.LEFT));
        upChoices.setPreferredSize(new Dimension(15, 40));
        upChoices.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY));
        upChoices.setBackground(Color.LIGHT_GRAY);
        trigonometry = new JButtonCustom("trigonometry");
        function = new JButtonCustom("function");
        upChoices.add(trigonometry);
        upChoices.add(function);
        setUpFunDialog();
        setUpTriDialog();
        setActionToChoicesButtons();
    }
    // the extra buttons for more functionality
    private void setUpFunDialog(){
        fun = new JDialog();
        fun.setLayout(new FlowLayout());

        ceil = new JButtonCustom("ceil(x)");
        floor = new JButtonCustom("floor(x)");

        fun.add(ceil);
        fun.add(floor);
        fun.pack();
        fun.setResizable(false);
        fun.setLocationRelativeTo(function);
    }
    private void setUpTriDialog(){
        tri = new JDialog();
        tri.setLayout(new FlowLayout());

        sin = new JButtonCustom("sin");
        cos = new JButtonCustom("cos");
        tan = new JButtonCustom("tan");

        tri.add(sin);
        tri.add(cos);
        tri.add(tan);
        tri.pack();
        tri.setResizable(false);
        tri.setLocationRelativeTo(trigonometry);
    }
    // the fun and tri JDialog
    private void setActionToChoicesButtons(){
        trigonometry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun.dispose();
                tri.setVisible(true);
            }
        });
        function.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tri.dispose();
                fun.setVisible(true);
            }
        });
        setUpChoiceDialogPanelsButtons();
    }
    // the buttons insider tri and fun
    private void setUpChoiceDialogPanelsButtons(){
        // tri
        sin.addActionListener(e -> {
            sourceClassObject.input.setText(String.format("%.5f", Math.sin(Math.toRadians(Double.parseDouble(sourceClassObject.input.getText())))));
            sourceClassObject.operationAnswerIsDone = true;
        });
        cos.addActionListener(e -> {
            sourceClassObject.input.setText(String.format("%.5f", Math.cos(Math.toRadians(Double.parseDouble(sourceClassObject.input.getText())))));
            sourceClassObject.operationAnswerIsDone = true;
        });
        tan.addActionListener(e -> {
            sourceClassObject.input.setText(String.format("%.5f", Math.tan(Math.toRadians(Double.parseDouble(sourceClassObject.input.getText())))));
            sourceClassObject.operationAnswerIsDone = true;
        });
        // fan
        ceil.addActionListener(e ->{
            if (sourceClassObject.input.getText().length() > 0){
                sourceClassObject.input.setText((int)Math.ceil(Double.parseDouble(sourceClassObject.input.getText())) + "");
                sourceClassObject.operationAnswerIsDone = true;
                sourceClassObject.pointIsAdded = false;
            }
        });
        floor.addActionListener(e ->{
            if (sourceClassObject.input.getText().length() > 0){
                sourceClassObject.input.setText((int)Math.floor(Double.parseDouble(sourceClassObject.input.getText())) + "");
                sourceClassObject.operationAnswerIsDone = true;
                sourceClassObject.pointIsAdded = false;
            }
        });
    }
    // sets up the buttons sub panel and calls other button related methods
    private void setUpDownButtons(){
        downButtons = new JPanel();
        downButtons.setLayout(new GridLayout(7, 5));
        downButtons.setPreferredSize(new Dimension(0, 300));
        downButtons.setBackground(Color.LIGHT_GRAY);
        addButtonsToPanel();
        // customiseTheColorOfNumbers();
    }
    // adds all the buttons onto the panel
    private void addButtonsToPanel(){
        downButtons.add(sourceClassObject.second);
        downButtons.add(sourceClassObject.pie);
        downButtons.add(sourceClassObject.eNumber);
        downButtons.add(sourceClassObject.clearAll);
        downButtons.add(sourceClassObject.clearLast);
        downButtons.add(sourceClassObject.xToThePowerTwo);
        downButtons.add(sourceClassObject.oneDividedByX);
        downButtons.add(sourceClassObject.absoluteValueOfX);
        downButtons.add(sourceClassObject.exp);
        downButtons.add(sourceClassObject.mod);
        downButtons.add(sourceClassObject.sqrtX);
        downButtons.add(sourceClassObject.openParenthesis);
        downButtons.add(sourceClassObject.closeParenthesis);
        downButtons.add(sourceClassObject.nFactorail);
        downButtons.add(sourceClassObject.division);
        downButtons.add(sourceClassObject.xTOthePowerOfY);
        downButtons.add(sourceClassObject.seven);
        downButtons.add(sourceClassObject.eight);
        downButtons.add(sourceClassObject.nine);
        downButtons.add(sourceClassObject.multiplication);
        downButtons.add(sourceClassObject.tenToThePowerOfX);
        downButtons.add(sourceClassObject.four);
        downButtons.add(sourceClassObject.five);
        downButtons.add(sourceClassObject.six);
        downButtons.add(sourceClassObject.subtraction);
        downButtons.add(sourceClassObject.logToBaseTenOfX);
        downButtons.add(sourceClassObject.one);
        downButtons.add(sourceClassObject.two);
        downButtons.add(sourceClassObject.three);
        downButtons.add(sourceClassObject.addition);
        downButtons.add(sourceClassObject.ln);
        downButtons.add(sourceClassObject.posToNeg);
        downButtons.add(sourceClassObject.zero);
        downButtons.add(sourceClassObject.point);
        downButtons.add(sourceClassObject.answer);

        // deactivited buttons
        sourceClassObject.second.setEnabled(false);
        sourceClassObject.exp.setEnabled(false);
        sourceClassObject.openParenthesis.setEnabled(false);
        sourceClassObject.closeParenthesis.setEnabled(false);
        sourceClassObject.xTOthePowerOfY.setEnabled(false);
    }
}
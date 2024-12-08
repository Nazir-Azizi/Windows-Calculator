package com.calculator.Standard;

import com.calculator.Source.JButtonCustom;
import com.calculator.Source.SourceClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;


public class StandardButtonsPanel extends JPanel{
    JPanel downButtonsPanel;
    SourceClass sourceClassObject;
    StandardButtonsPanel(){
        this.setLayout(new BorderLayout());
        sourceClassObject = new SourceClass();

        setUpDownButtonsPanel();
        this.add(downButtonsPanel);
    }
    // set up the down part of the panel for buttons
    private void setUpDownButtonsPanel(){
        downButtonsPanel = new JPanel(new GridLayout(6, 4));
        downButtonsPanel.setPreferredSize(new Dimension(0, 300));
        downButtonsPanel.setBackground(Color.LIGHT_GRAY);
        addButtonsToDownButtonsPanel();
    }
    // add button to downPanel
    private void addButtonsToDownButtonsPanel(){
        JButtonCustom extraButton = new JButtonCustom("CE");
        extraButton.addActionListener(e ->{
            sourceClassObject.clearAll.doClick();
        });
        sourceClassObject.mod.setText("%");
        downButtonsPanel.add(sourceClassObject.mod);
        downButtonsPanel.add(extraButton);
        downButtonsPanel.add(sourceClassObject.clearAll);
        downButtonsPanel.add(sourceClassObject.clearLast);
        downButtonsPanel.add(sourceClassObject.oneDividedByX);
        downButtonsPanel.add(sourceClassObject.xToThePowerTwo);
        downButtonsPanel.add(sourceClassObject.sqrtX);
        downButtonsPanel.add(sourceClassObject.division);
        downButtonsPanel.add(sourceClassObject.seven);
        downButtonsPanel.add(sourceClassObject.eight);
        downButtonsPanel.add(sourceClassObject.nine);
        downButtonsPanel.add(sourceClassObject.multiplication);
        downButtonsPanel.add(sourceClassObject.four);
        downButtonsPanel.add(sourceClassObject.five);
        downButtonsPanel.add(sourceClassObject.six);
        downButtonsPanel.add(sourceClassObject.subtraction);
        downButtonsPanel.add(sourceClassObject.one);
        downButtonsPanel.add(sourceClassObject.two);
        downButtonsPanel.add(sourceClassObject.three);
        downButtonsPanel.add(sourceClassObject.addition);
        downButtonsPanel.add(sourceClassObject.posToNeg);
        downButtonsPanel.add(sourceClassObject.zero);
        downButtonsPanel.add(sourceClassObject.point);
        downButtonsPanel.add(sourceClassObject.answer);
    }
}

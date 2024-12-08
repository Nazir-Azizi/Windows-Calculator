package com.calculator.Programmer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
// import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.calculator.Source.SourceClass;

public class ProgrammerButtonsPanel extends JPanel{
    SourceClass sourceClassObject;
    JPanel buttonsPanel;
    JPanel numberBasePanel;
    JPanel hexPanel, decPanel, octPanel, binPanel;
    ProgrammerButtonsPanel(){
        this.setLayout(new BorderLayout());
        sourceClassObject = new SourceClass();

        setUpButtonsPanel();
        setUpNumberBasePanel();

        this.add(buttonsPanel, BorderLayout.SOUTH);
        this.add(numberBasePanel, BorderLayout.CENTER);

    }
    //sets up the lower part of this panel
    private void setUpButtonsPanel(){
        buttonsPanel = new JPanel(new GridLayout(6 ,5));
        sourceClassObject.point.setEnabled(false);
        addButtonsToPanel();
    }
    // adds buttons accordingly
    private void addButtonsToPanel(){
        buttonsPanel.add(sourceClassObject.A);
        buttonsPanel.add(sourceClassObject.leftShift);
        buttonsPanel.add(sourceClassObject.rightShift);
        buttonsPanel.add(sourceClassObject.clearAll);
        buttonsPanel.add(sourceClassObject.clearLast);
        buttonsPanel.add(sourceClassObject.B);
        buttonsPanel.add(sourceClassObject.openParenthesis);
        buttonsPanel.add(sourceClassObject.closeParenthesis);
        buttonsPanel.add(sourceClassObject.mod);
        buttonsPanel.add(sourceClassObject.division);
        buttonsPanel.add(sourceClassObject.C);
        buttonsPanel.add(sourceClassObject.seven);
        buttonsPanel.add(sourceClassObject.eight);
        buttonsPanel.add(sourceClassObject.nine);
        buttonsPanel.add(sourceClassObject.multiplication);
        buttonsPanel.add(sourceClassObject.D);
        buttonsPanel.add(sourceClassObject.four);
        buttonsPanel.add(sourceClassObject.five);
        buttonsPanel.add(sourceClassObject.six);
        buttonsPanel.add(sourceClassObject.subtraction);
        buttonsPanel.add(sourceClassObject.E);
        buttonsPanel.add(sourceClassObject.one);
        buttonsPanel.add(sourceClassObject.two);
        buttonsPanel.add(sourceClassObject.three);
        buttonsPanel.add(sourceClassObject.addition);
        buttonsPanel.add(sourceClassObject.F);
        buttonsPanel.add(sourceClassObject.posToNeg);
        buttonsPanel.add(sourceClassObject.zero);
        buttonsPanel.add(sourceClassObject.point);
        buttonsPanel.add(sourceClassObject.answer);
    }
    // sets up the middle part of this panel
    private void setUpNumberBasePanel(){
        hexPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        decPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        octPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        binPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        hexPanel.add(sourceClassObject.hex);
        hexPanel.add(sourceClassObject.hexLabel);

        decPanel.add(sourceClassObject.dec);
        decPanel.add(sourceClassObject.decLabel);

        octPanel.add(sourceClassObject.oct);
        octPanel.add(sourceClassObject.octLabel);

        binPanel.add(sourceClassObject.bin);
        binPanel.add(sourceClassObject.binLabel);

        numberBasePanel = new JPanel();
        numberBasePanel.setLayout(new BoxLayout(numberBasePanel, BoxLayout.Y_AXIS));
        numberBasePanel.add(hexPanel);
        numberBasePanel.add(decPanel);
        numberBasePanel.add(octPanel);
        numberBasePanel.add(binPanel);
    }


}
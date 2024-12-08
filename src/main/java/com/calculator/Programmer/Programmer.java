package com.calculator.Programmer;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Programmer extends JPanel{
    ProgrammerButtonsPanel programmerButtonsPanel;
    public Programmer(){
        createProgrammerButtonsPanel();
        setUpMainPanel();
    }
    private void createProgrammerButtonsPanel(){
        programmerButtonsPanel = new ProgrammerButtonsPanel(); 
    }
    private void setUpMainPanel(){
        this.setLayout(new BorderLayout());
        this.add(programmerButtonsPanel.sourceClassObject.history, BorderLayout.NORTH);
        this.add(programmerButtonsPanel.sourceClassObject.input, BorderLayout.CENTER);
        this.add(programmerButtonsPanel, BorderLayout.SOUTH);
    }
}
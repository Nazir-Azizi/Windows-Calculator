package com.calculator.Scientific;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class Scientific extends JPanel {

    ScientifcButtonsPanel scientifcButtonsPanel;

    public Scientific(){
        setUpScientifcButtonsPanel();    
        setUpMainPanel();
    }

    private void setUpMainPanel(){
        this.setLayout(new BorderLayout());
        this.add(scientifcButtonsPanel.sourceClassObject.history, BorderLayout.NORTH);
        this.add(scientifcButtonsPanel.sourceClassObject.input, BorderLayout.CENTER);
        this.add(scientifcButtonsPanel, BorderLayout.SOUTH);
    }
    // creates a buttonPanel object
    private void setUpScientifcButtonsPanel(){
        scientifcButtonsPanel = new ScientifcButtonsPanel();
    }
}
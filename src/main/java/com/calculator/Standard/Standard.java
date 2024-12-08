package com.calculator.Standard;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Standard extends JPanel{
    StandardButtonsPanel standardButtonsPanel;

    public Standard(){
        createStandardButtonsPanel();
        setUpMainPanel();
    }
    private void createStandardButtonsPanel(){
        standardButtonsPanel = new StandardButtonsPanel();
    }
    private void setUpMainPanel(){
        this.setLayout(new BorderLayout());
        this.add(standardButtonsPanel.sourceClassObject.history, BorderLayout.NORTH);
        this.add(standardButtonsPanel.sourceClassObject.input, BorderLayout.CENTER);
        this.add(standardButtonsPanel, BorderLayout.SOUTH);
    }
}

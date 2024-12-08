package com.calculator.Source;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;

public class JButtonCustom extends JButton implements MouseListener{
    Color color = this.getBackground();
    JButtonCustom(){
        super();
        this.setFont(new Font("Arial", Font.ITALIC, 20));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);
    }
    public JButtonCustom(String s){
        super(s);
        this.setFont(new Font("Arial", Font.ITALIC, 20));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);
    }
    public JButtonCustom(Icon c){
        super(c);
        this.setFont(new Font("Arial", Font.ITALIC, 20));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);
    }
    @Override 
    public void mouseClicked(MouseEvent e) {
        //
    }
    @Override
    public void mousePressed(MouseEvent e) {
        //
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(Color.WHITE);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.GRAY);
    }
}
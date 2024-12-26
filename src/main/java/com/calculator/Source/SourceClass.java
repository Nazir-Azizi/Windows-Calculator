package com.calculator.Source;


import com.calculator.MathFile.MathClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;



public class SourceClass { 
    public JButtonCustom second;
    public JButtonCustom pie;
    public JButtonCustom eNumber;
    public JButtonCustom clearAll;
    public JButtonCustom clearLast;
    public JButtonCustom xToThePowerTwo;
    public JButtonCustom oneDividedByX;
    public JButtonCustom absoluteValueOfX;
    public JButtonCustom exp;
    public JButtonCustom mod;
    public JButtonCustom sqrtX;
    public JButtonCustom openParenthesis;
    public JButtonCustom closeParenthesis;
    public JButtonCustom nFactorail;
    public JButtonCustom division;
    public JButtonCustom xTOthePowerOfY;
    public JButtonCustom seven;
    public JButtonCustom eight;
    public JButtonCustom nine;
    public JButtonCustom multiplication;
    public JButtonCustom tenToThePowerOfX;
    public JButtonCustom four;
    public JButtonCustom five;
    public JButtonCustom six;
    public JButtonCustom subtraction;
    public JButtonCustom logToBaseTenOfX;
    public JButtonCustom one;
    public JButtonCustom two;
    public JButtonCustom three;
    public JButtonCustom addition;
    public JButtonCustom ln;
    public JButtonCustom posToNeg;
    public JButtonCustom zero;
    public JButtonCustom point;
    public JButtonCustom answer;

    public JButtonCustom A, B, C, D, E, F;
    public JButtonCustom rightShift, leftShift;

    public JRadioButton hex, dec, oct, bin;
    public JLabel hexLabel, decLabel, octLabel, binLabel;
    public ButtonGroup groupOfNumberBaseRadioButtons;

    public JLabel input, history;
    
    public boolean pointIsAdded = false;
    boolean operatorIsEntered = true;
    boolean answerIsDisplayed = false;
    public boolean operationAnswerIsDone = false;

    public SourceClass(){
        createLabels();
        createButtons();
        customiseTheColorOfNumbers();
        setUpActionForNumberButtons();
        setUpActionForOtherButtons();
        setUpActionForRadioButtons();
    }
    // creating JLabels
    private void createLabels(){
        input = new JLabel();
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        input.setFont(new Font("Arial", Font.PLAIN, 30));
        history = new JLabel();
        history.setHorizontalAlignment(SwingConstants.RIGHT);
        history.setFont(new Font("Arial", Font.PLAIN, 15));
    }
    // create the buttons
    private void createButtons(){
        second = new JButtonCustom("<html>2<sup>nd</sup></html>");
        pie = new JButtonCustom("π");
        eNumber = new JButtonCustom("e");
        clearAll = new JButtonCustom("C");
        // we use icon here
        Image iicon = new ImageIcon("E:/Practice code/Java Code/Uni Challenge/Windows Calculator/backSpace.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST);
        ImageIcon icon = new ImageIcon(iicon);
        clearLast = new JButtonCustom(icon);
        xToThePowerTwo = new JButtonCustom("<html>x<sup>2</sup></html>");
        oneDividedByX = new JButtonCustom("1/x");
        absoluteValueOfX = new JButtonCustom("|x|");
        exp = new JButtonCustom("exp");
        mod = new JButtonCustom("Mod");
        mod.setFont(new Font("Arial", Font.PLAIN, 15));
        sqrtX = new JButtonCustom("2√x");
        openParenthesis = new JButtonCustom("(");
        closeParenthesis = new JButtonCustom(")");
        nFactorail = new JButtonCustom("n!");
        division = new JButtonCustom("÷");
        xTOthePowerOfY = new JButtonCustom("<html>x<sup>y</sup></html>");
        seven = new JButtonCustom("7");
        eight = new JButtonCustom("8");
        nine = new JButtonCustom("9");
        multiplication = new JButtonCustom("*");
        tenToThePowerOfX = new JButtonCustom("<html>10<sup>x</sup></html>");
        four = new JButtonCustom("4");
        five = new JButtonCustom("5");
        six = new JButtonCustom("6");
        subtraction = new JButtonCustom("-");
        logToBaseTenOfX = new JButtonCustom("log");
        one = new JButtonCustom("1");
        two = new JButtonCustom("2");
        three = new JButtonCustom("3");
        addition = new JButtonCustom("+");
        ln = new JButtonCustom("ln");
        posToNeg = new JButtonCustom("+/-");
        zero = new JButtonCustom("0");
        point = new JButtonCustom(".");
        answer = new JButtonCustom("=");

        A = new JButtonCustom("A");
        B = new JButtonCustom("B");
        C = new JButtonCustom("C");
        D = new JButtonCustom("D");
        E = new JButtonCustom("E");
        F = new JButtonCustom("F");

        rightShift = new JButtonCustom(">>");
        leftShift = new JButtonCustom("<<");

        createRadioButtonsAndLabel();
    }
    // creates radio buttons
    private void createRadioButtonsAndLabel(){
        hex = new JRadioButton("HEX");
        dec = new JRadioButton("DEC");
        oct = new JRadioButton("OCT");
        bin = new JRadioButton("BIN");

        groupOfNumberBaseRadioButtons = new ButtonGroup();
        groupOfNumberBaseRadioButtons.add(hex);
        groupOfNumberBaseRadioButtons.add(dec);
        groupOfNumberBaseRadioButtons.add(oct);
        groupOfNumberBaseRadioButtons.add(bin);

        hexLabel = new JLabel("");
        decLabel = new JLabel("");
        octLabel = new JLabel("");
        binLabel = new JLabel("");
    }
    // customise the color of numbers buttons
    private void customiseTheColorOfNumbers(){
        List<JButtonCustom> buttons = Arrays.asList(one, two, three, four, five, six, seven, eight, nine, zero, point, posToNeg);
        buttons.stream().forEach(button -> setColorAndCostomisNumberKeys(button));
    }
    //helper method
    private void setColorAndCostomisNumberKeys(JButtonCustom button){
        button.setBackground(Color.WHITE);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.WHITE);
            }
        });

    }
    // set Action for Number Buttons
    private void setUpActionForNumberButtons(){
        // 48 - 57
        JButtonCustom[] numberButtonsArray = new JButtonCustom[]{zero, one, two, three, four, 
                                                                    five, six, seven, eight, nine};

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int keyStroke = 48;
        
        for (int i = 0; i < 10; ++i){
            addActionToButton(numberButtonsArray[i], numbers[i], keyStroke++);
        }

    }
    // it is related to setUpActionForNumberButtons. it adds action and keyStroke
    private void addActionToButton(JButtonCustom button, String number, int keyStroke){
        button.addActionListener(e -> {
                if (answerIsDisplayed){
                    history.setText("");
                    input.setText("");
                    answerIsDisplayed = false;
                }
                if (operationAnswerIsDone){
                    input.setText("");
                    operationAnswerIsDone = false;
                }
                history.setText(deleteTillTheLastOperator(history.getText()));
                input.setText(input.getText() + number);
                operatorIsEntered = false;
                updateBaseNumberLabels();
            }
        );     
        button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyStroke, 0), number);
        button.getActionMap().put(number, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.doClick(); // performs a click like when you click using mouse
            }
        });
    }
    // set up action for other buttons
    private void setUpActionForOtherButtons(){
        setActionForOperatorKey();
        setUpKeyStrokeForOperationButtons();
        addActionToHex();

        // pie
        pie.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                input.setText("3.1415");
                operationAnswerIsDone = true;
            }
        );
        // e number
        eNumber.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                input.setText("2.7182");
                operationAnswerIsDone = true;
            }
        );
        // C -> clear all
        clearAll.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText("");
                    updateBaseNumberLabels();
                }
                else
                    history.setText("");
            }
        );
        // < clear last
        clearLast.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(input.getText().substring(0, input.getText().length() - 1));
                    updateBaseNumberLabels();
                }
            }
        );
        // power of 2
        xToThePowerTwo.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    double temp = Math.pow(Double.parseDouble(input.getText()), 2);
                    if (temp == Math.floor(temp))
                        input.setText((int)temp + "");
                    else
                        input.setText(temp + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // 1/x
        oneDividedByX.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(String.format("%.10f",1.0 / Double.parseDouble(input.getText())) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // abs(x)
        absoluteValueOfX.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    double temp = Double.parseDouble(input.getText());
                    if (temp == Math.floor(temp))
                        input.setText((int)Math.abs(temp) + "");
                    else
                        input.setText(Math.abs(temp) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // exp
        // ...
        // mod
        mod.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (!operatorIsEntered && input.getText().length() > 0){
                    history.setText(history.getText() + " " + input.getText() + " " + "M");
                    input.setText("");
                    operatorIsEntered = true;
                }
            }
        );
        // sqrt(x)
        sqrtX.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(Math.sqrt(Double.parseDouble(input.getText())) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // (
        // ...
        // )
        // n!
        nFactorail.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(MathClass.fact((int)Double.parseDouble(input.getText())) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // x ^ y
        xTOthePowerOfY.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    history.setText(history.getText() + " " + input.getText() + " ^ ");
                    operatorIsEntered = true;
                    input.setText("");
                }
            }
        );
        // ...
        // 10 ^ x
        tenToThePowerOfX.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText((long)Math.pow(10 ,Integer.parseInt(input.getText())) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // log
        logToBaseTenOfX.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(Math.log10(Double.parseDouble(input.getText())) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        // ln
        ln.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    input.setText(Math.log10(Double.parseDouble(input.getText())) / Math.log10(Math.E) + "");
                    operationAnswerIsDone = true;
                }
            }
        );
        point.addActionListener(e ->{
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    if (!pointIsPresent() && !pointIsAdded && !(Math.floor(Double.parseDouble(input.getText())) != Double.parseDouble(input.getText()))){
                        input.setText(input.getText() + ".");
                        pointIsAdded = true;
                        operationAnswerIsDone = false;
                    }
                }
            }
        );
        posToNeg.addActionListener(e -> {
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    double temp = Double.parseDouble(input.getText());
                    if (temp > 0)
                        input.setText("-" + input.getText());
                    else
                        input.setText(input.getText().substring(1, input.getText().length()));
                }
            }
        );
        answer.addActionListener(e ->{
                String temp = "";
                String ready = "";
                if (answerIsDisplayed)
                    history.setText("");
                if (input.getText().length() > 0){
                    ready = deleteTillTheLastOperator(history.getText()) + " " + input.getText();
                    history.setText(ready + " =");
                }else{
                    temp = deleteTillTheLastOperator(history.getText());
                    int l = temp.length();
                    ready = temp.substring(0, l - 2) + " " + input.getText();
                    history.setText(ready + " " + " =");
                }
                double r = MathClass.calculateTheReadyPrefixedInput(ready);
                input.setText(r + "");
                answerIsDisplayed = true;
                updateBaseNumberLabels();
            }
        );

        rightShift.addActionListener(e -> {

        });
        leftShift.addActionListener(e ->{
            
        });
    }
    // checks if a dot (.) is already present
    private boolean pointIsPresent(){
        String number = input.getText();
        boolean flag = false;
        for (int i = 0; i < number.length(); ++i)
            if (number.charAt(i) == '.'){
                flag = true;
                break;
            }
        return flag;
    }
    // adds action to Buttons A - F
    private void addActionToHex(){
        JButtonCustom[] buttons = {A, B, C, D, E, F};
        for (JButtonCustom button : buttons)
            actionHex(button);
    }
    private void actionHex(JButtonCustom button){
        button.addActionListener(e -> {
            if (answerIsDisplayed){
                history.setText("");
                input.setText("");
                answerIsDisplayed = false;
            }
            if (operationAnswerIsDone){
                input.setText("");
                operationAnswerIsDone = false;
            }
            history.setText(deleteTillTheLastOperator(history.getText()));
            input.setText(input.getText() + button.getText());
            operatorIsEntered = false;
            updateBaseNumberLabels();
        });
    }
    // adds action to radio buttons
    private void setUpActionForRadioButtons(){
        dec.setSelected(true);
        turnOffAToF();

        hex.addActionListener(e -> {
            turnOnAll();
            input.setText(hexLabel.getText());
        });
        dec.addActionListener(e -> {
            turnOnAll();
            turnOffAToF();
            input.setText(decLabel.getText());
        });
        oct.addActionListener(e -> {
            turnOnAll();
            turnOffAToF();
            turnOff98();
            input.setText(octLabel.getText());
        });
        bin.addActionListener(e -> {
            turnOffAToF();
            turnOff9To2();
            input.setText(binLabel.getText());
        });
    }
    private void turnOnAll(){
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);

        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);

    }
    private void turnOffAToF(){
        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        E.setEnabled(false);
        F.setEnabled(false);
        
    }
    private void turnOff98(){
        eight.setEnabled(false);
        nine.setEnabled(false);
    }
    private void turnOff9To2(){
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);

    }
    // updates the BaseNumberLables every time
    private void updateBaseNumberLabels(){
        if (input.getText().length() < 1){
            decLabel.setText("");
            hexLabel.setText("");
            octLabel.setText("");
            binLabel.setText("");
            return;
        }
        if (hex.isSelected()){
            int decimal = Integer.parseInt(input.getText(), 16);
            decLabel.setText(decimal + "");
            hexLabel.setText(input.getText().toUpperCase());
            octLabel.setText(Integer.toOctalString(decimal));
            binLabel.setText(Integer.toBinaryString(decimal));
        }else if (dec.isSelected()){
            int decimal = (int)Double.parseDouble(input.getText());
            decLabel.setText(decimal + "");
            hexLabel.setText(Integer.toHexString(decimal).toUpperCase());
            octLabel.setText(Integer.toOctalString(decimal));
            binLabel.setText(Integer.toBinaryString(decimal));
        }else if (oct.isSelected()){
            int decimal = Integer.parseInt(input.getText(), 8);
            decLabel.setText(decimal + "");
            hexLabel.setText(Integer.toHexString(decimal).toUpperCase());
            octLabel.setText(input.getText());
            binLabel.setText(Integer.toBinaryString(decimal));
        }else{
            int decimal = Integer.parseInt(input.getText(), 2);
            decLabel.setText(decimal + "");
            hexLabel.setText(Integer.toHexString(decimal).toUpperCase());
            octLabel.setText(Integer.toOctalString(decimal));
            binLabel.setText(input.getText());
        }
    }
    // deletes up to the last occurence of operator 
    private String deleteTillTheLastOperator(String s){
        if (s == null)
            return null;
        if (s.length() >= 1){
            int index = s.length() - 1;
            while (index > 0 && s.charAt(index) != '+' && s.charAt(index) != '-' &&
            s.charAt(index) != '÷' && s.charAt(index) != '*' && s.charAt(index) != '^' && s.charAt(index) != 'M')
                index--;
            if (index == 0)
                return s.substring(0, index);
            return s.substring(0, index + 1);
        }
        return "";
    }
    // set up the keyStroke for the operators
    private void setUpKeyStrokeForOperationButtons(){
        // +
        addition.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, KeyEvent.SHIFT_DOWN_MASK), "plusKey");
        addition.getActionMap().put("plusKey", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addition.doClick();
            }
        });
        // -
        subtraction.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "minuesKey");
        subtraction.getActionMap().put("minuesKey", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtraction.doClick();
            }
        });
        // *
        multiplication.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_8, KeyEvent.SHIFT_DOWN_MASK), "multiKey");
        multiplication.getActionMap().put("multiKey", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplication.doClick();
            }
        });
        // /
        division.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0), "divideKey");
        division.getActionMap().put("divideKey", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                division.doClick();
            }
        });
        // = -> should work with both ENTER and EQUALS key
        answer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "equalKey");
        answer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, 0), "equalKey");
        answer.getActionMap().put("equalKey", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.doClick();
            }
        });
    }
    // it sets up the actions listner for operators and takes care of displaying the immedate input as well
    private void setActionForOperatorKey(){
        // wanted to do it all in a loop but was unsuccessful -. 2 months later -> Well I did it
       
        List<JButtonCustom> operatorsButtons = Arrays.asList(addition, subtraction, multiplication, division);
        operatorsButtons.stream().forEach(op -> setActionForOp(op));
    }
    // helper method
    private void setActionForOp(JButtonCustom button){
        button.addActionListener((e) -> {
                if (answerIsDisplayed){
                    history.setText("");
                    answerIsDisplayed = false;
                }
                if (!operatorIsEntered){
                    history.setText(history.getText() + " " + input.getText() + " " + button.getText());
                    input.setText("");
                    operatorIsEntered = true;
                    pointIsAdded = false;
                }
            }
        );
    }
}
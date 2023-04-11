package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    int num1 = 0;
    int num2 = 0;
    String op = "", stg = "";


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label respostas;

    @FXML
    protected void onButton(ActionEvent ev) {
        Object source = ev.getSource();
        stg += ((Button) source).getText();
        respostas.setText(stg);
    }

    @FXML
    protected void suma(){
        num1 = Integer.parseInt(stg);
        op = "+";
        stg = "";
    }

    @FXML
    protected void resta(){
        num1 = Integer.parseInt(stg);
        op = "-";
        stg = "";
    }

    @FXML
    protected void multiplicacion(){
        num1 = Integer.parseInt(stg);
        op = "*";
        stg = "";
    }

    @FXML
    protected void division(){
        num1 = Integer.parseInt(stg);
        op = "/";
        stg = "";
    }

    @FXML
    protected void igual(){
        num2 = Integer.parseInt(stg);
        stg = "";
        switch (op){
            case "+":
                respostas.setText(String.valueOf(num1 + num2));
                break;
            case "-":
                respostas.setText(String.valueOf(num1 - num2));
                break;
            case "*":
                respostas.setText(String.valueOf(num1 * num2));
                break;
            case "/":
                respostas.setText(String.valueOf(num1 / num2));
                break;
        }
    }

}
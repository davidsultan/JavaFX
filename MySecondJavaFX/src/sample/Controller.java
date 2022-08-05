package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label message;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Label label1;
    @FXML
    private Label label2;


    int c1=0;
    int c2=0;
    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(button1)){
            c1++;
            switch (c1){
                case 1:
                    message.setText("My lovely wife; i miss you so much.");
                    break;
                case 2:
                    message.setText("I wish i already found you and we're together.");
                    break;
                case 3:
                    message.setText("I wanna look into your beautiful eyes, shining face.");
                    break;
                case 4:
                    message.setText("I would love your sweet tongue making compliments to me.");
                    break;
                case 5:
                    message.setText("My baby girl,");
                    break;
                case 6:
                    message.setText("i hope we're gonna have easier, happier life together.");
                    break;
                case 7:
                    message.setText("I hope we're gonna help each other to be better muslims.");
                    break;
                case 8:
                    message.setText("I kissed you my beautiful angel.");
                    break;
            }
        }else if(e.getSource().equals(button2)){
            c2++;

            switch (c2){
                case 1:
                    message.setText("Soner is my baby boy.");
                    break;
                case 2:
                    message.setText("I love him so much and so he does.");
                    break;
                case 3:
                    message.setText("When i see his shining smile,");
                    break;
                case 4:
                    message.setText("i understand that he loves me so much.");
                    break;
                case 5:
                    message.setText("I am his first baby,");
                    break;
                case 6:
                    message.setText("he does not want real babies.");
                    break;
                case 7:
                    message.setText("We're gonna be together in this life and heaven.");
                    break;
                case 8:
                    message.setText("Always and forever...");
                    break;
            }
        }
    }
}

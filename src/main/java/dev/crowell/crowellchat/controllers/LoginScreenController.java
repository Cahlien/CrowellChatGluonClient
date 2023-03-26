package dev.crowell.crowellchat.controllers;

import dev.crowell.crowellchat.models.LoginRequestModel;
import dev.crowell.crowellchat.services.AuthenticationService;
import dev.crowell.crowellchat.services.AuthenticationServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginScreenController {
    private final AuthenticationService authenticationService;
    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label loginErrorLabel;


    public LoginScreenController() {
        this.authenticationService = new AuthenticationServiceImpl();
    }

    @FXML
    private void onLoginButtonClick() throws IOException {
        System.out.println("Clicked");
        var userIdentity = authenticationService.authenticate(new LoginRequestModel(usernameField.getText(), passwordField.getText()));
        if (userIdentity.isPresent()) {
            loginErrorLabel.setOpacity(0);
            usernameField.setText("");
            passwordField.setText("");
            usernameField.requestFocus();
            System.out.println("Success");
        } else {
            loginErrorLabel.setOpacity(1);
        }
    }

    public void onUsernameFieldKeyPressed(KeyEvent keyEvent) {
        if (Objects.requireNonNull(keyEvent.getCode()) == KeyCode.ENTER) {
            passwordField.requestFocus();
        }
    }

    public void onPasswordFieldKeyPressed(KeyEvent keyEvent) {
        if (Objects.requireNonNull(keyEvent.getCode()) == KeyCode.ENTER) {
            try {
                onLoginButtonClick();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
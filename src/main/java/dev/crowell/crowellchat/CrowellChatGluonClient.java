package dev.crowell.crowellchat;

import com.gluonhq.attach.util.Platform;
import dev.crowell.crowellchat.views.AppViewManager;
import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class CrowellChatGluonClient extends Application {

    private final AppManager appManager = AppManager.initialize(this::postInit);

    @Override
    public void init() {
        AppViewManager.registerViewsAndDrawer();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        if(Platform.isDesktop()) {
            primaryStage.setWidth(800);
            primaryStage.setHeight(600);
        }
        appManager.start(primaryStage);
    }

    private void postInit(Scene scene) {
        scene.getStylesheets().add(Objects.requireNonNull(CrowellChatGluonClient.class.getResource("themes/dark/dark-theme.css"), "Unable to locate dark theme").toExternalForm());
        scene.getStylesheets().add(Objects.requireNonNull(CrowellChatGluonClient.class.getResource("style.css"), "Unable to locate app stylesheet").toExternalForm());

        if(!Platform.isDesktop()) {
            ((Stage) scene.getWindow()).getIcons().add(new Image(Objects.requireNonNull(CrowellChatGluonClient.class.getResourceAsStream("/icon.png"), "Unable to locate icon")));
        } else {
            ((Stage) scene.getWindow()).setTitle("CrowellChat");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

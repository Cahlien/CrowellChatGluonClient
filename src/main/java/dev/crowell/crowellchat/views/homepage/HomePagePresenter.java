package dev.crowell.crowellchat.views.homepage;

import com.gluonhq.attach.util.Platform;
import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.fxml.FXML;

public class HomePagePresenter {

    @FXML
    private View primary;

    public void initialize() {
        primary.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppManager appManager = AppManager.getInstance();
                AppBar appBar = appManager.getAppBar();
                appBar.setId("appbar");
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> appManager.getDrawer().open()));
                appBar.setTitleText("CrowellChat");
                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));

                appBar.setVisible(!Platform.isDesktop());
            }
        });
    }
}

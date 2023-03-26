package dev.crowell.crowellchat.views;

import com.gluonhq.charm.glisten.afterburner.AppView;
import com.gluonhq.charm.glisten.afterburner.AppViewRegistry;
import com.gluonhq.charm.glisten.afterburner.Utils;
import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.control.Avatar;
import com.gluonhq.charm.glisten.control.NavigationDrawer;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import dev.crowell.crowellchat.CrowellChatGluonClient;
import dev.crowell.crowellchat.views.homepage.HomePagePresenter;
import dev.crowell.crowellchat.views.settingspage.SettingsPagePresenter;
import javafx.scene.image.Image;
import java.util.Locale;
import java.util.Objects;

import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.HOME_VIEW;
import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.SHOW_IN_DRAWER;
import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.SKIP_VIEW_STACK;

public class AppViewManager {

    public static final AppViewRegistry REGISTRY = new AppViewRegistry();

    public static final AppView HOMEPAGE_VIEW = view("HomePage", HomePagePresenter.class, MaterialDesignIcon.HOME, SHOW_IN_DRAWER, HOME_VIEW, SKIP_VIEW_STACK);
    public static final AppView SETTINGSPAGE_VIEW = view("SettingsPage", SettingsPagePresenter.class, MaterialDesignIcon.SETTINGS, SHOW_IN_DRAWER);
    
    private static AppView view(String title, Class<?> presenterClass, MaterialDesignIcon menuIcon, AppView.Flag... flags ) {
        return REGISTRY.createView(name(presenterClass), title, presenterClass, menuIcon, flags);
    }

    private static String name(Class<?> presenterClass) {
        return presenterClass.getSimpleName().toUpperCase(Locale.ROOT).replace("PRESENTER", "");
    }
    
    public static void registerViewsAndDrawer() {
        for (AppView view : REGISTRY.getViews()) {
            view.registerView();
        }

        NavigationDrawer.Header header = new NavigationDrawer.Header("CrowellChat", "",
                new Avatar(21, new Image(Objects.requireNonNull(CrowellChatGluonClient.class.getResourceAsStream("/icon.png"), "Unable to locate icon"))));

        Utils.buildDrawer(AppManager.getInstance().getDrawer(), header, REGISTRY.getViews()); 
    }
}

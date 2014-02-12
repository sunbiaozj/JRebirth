package org.jrebirth.af.sample;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.jrebirth.af.core.application.DefaultApplication;
import org.jrebirth.af.core.resource.font.FontItem;
import org.jrebirth.af.core.ui.Model;
import org.jrebirth.af.sample.resources.SampleFonts;
import org.jrebirth.af.sample.resources.SampleStyles;
import org.jrebirth.af.sample.ui.SampleModel;

import java.util.Arrays;
import java.util.List;

/**
 * The class <strong>SampleApplication</strong>.
 * 
 * @author
 */
public final class SampleApplication extends DefaultApplication<StackPane> {

    /**
     * Application launcher.
     * 
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        preloadAndLaunch(args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Model> getFirstModelClass() {
        return SampleModel.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeStage(final Stage stage) {
        stage.setFullScreen(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeScene(final Scene scene) {
        addCSS(scene, SampleStyles.MAIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<FontItem> getFontToPreload() {
        return Arrays.asList(new FontItem[] {
                SampleFonts.SPLASH,
        });
    }

}
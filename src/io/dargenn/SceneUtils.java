package io.dargenn;

import javafx.scene.Scene;

class SceneUtils {
    static void hideAllElements(Scene scene) {
        scene.lookup("#circle").setVisible(false);
        scene.lookup("#circleVbox").setVisible(false);
        scene.lookup("#line").setVisible(false);
        scene.lookup("#lineVbox").setVisible(false);
        scene.lookup("#rectangle").setVisible(false);
        scene.lookup("#rectangleVbox").setVisible(false);
    }
}

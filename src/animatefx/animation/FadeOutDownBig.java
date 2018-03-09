package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/**
 * @author Loïc Sculier
 */
public class FadeOutDownBig {

    /**
     * Create new FadeOutDown
     *
     * @param node The node to affect
     */
    public FadeOutDownBig(Node node) {
        FadeOutDown(node);
    }

    private void FadeOutDown(Node node) {

        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(), 0, AnimateFXInterpolator.EASE)

                        ),

                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.translateYProperty(), 2000, AnimateFXInterpolator.EASE)

                        )

                );
        t.play();
    }
}

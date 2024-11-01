package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;

/* loaded from: classes.dex */
public class TransitionBuilder {
    private static final String TAG = "TransitionBuilder";

    public static MotionScene.Transition buildTransition(MotionScene motionScene, int i8, int i9, ConstraintSet constraintSet, int i10, ConstraintSet constraintSet2) {
        MotionScene.Transition transition = new MotionScene.Transition(i8, motionScene, i9, i10);
        updateConstraintSetInMotionScene(motionScene, transition, constraintSet, constraintSet2);
        return transition;
    }

    private static void updateConstraintSetInMotionScene(MotionScene motionScene, MotionScene.Transition transition, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
    }

    public static void validate(MotionLayout motionLayout) {
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene != null) {
            if (motionScene.validateLayout(motionLayout)) {
                if (motionScene.mCurrentTransition != null && !motionScene.getDefinedTransitions().isEmpty()) {
                    return;
                } else {
                    throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
                }
            }
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
    }
}

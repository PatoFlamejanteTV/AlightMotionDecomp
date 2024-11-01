package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {
    private StopEngine mEngine;
    private SpringStopEngine mSpringStopEngine;
    private StopLogicEngine mStopLogicEngine;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.mStopLogicEngine = stopLogicEngine;
        this.mEngine = stopLogicEngine;
    }

    public void config(float f8, float f9, float f10, float f11, float f12, float f13) {
        StopLogicEngine stopLogicEngine = this.mStopLogicEngine;
        this.mEngine = stopLogicEngine;
        stopLogicEngine.config(f8, f9, f10, f11, f12, f13);
    }

    public String debug(String str, float f8) {
        return this.mEngine.debug(str, f8);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        return this.mEngine.getInterpolation(f8);
    }

    public float getVelocity(float f8) {
        return this.mEngine.getVelocity(f8);
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }

    public void springConfig(float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i8) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.mSpringStopEngine;
        this.mEngine = springStopEngine;
        springStopEngine.springConfig(f8, f9, f10, f11, f12, f13, f14, i8);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.mEngine.getVelocity();
    }
}

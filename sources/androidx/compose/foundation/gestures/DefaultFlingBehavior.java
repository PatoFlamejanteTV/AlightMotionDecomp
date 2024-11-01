package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.MotionDurationScale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;

/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    private final DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(DecayAnimationSpec<Float> flingDecay, MotionDurationScale motionDurationScale) {
        AbstractC3292y.i(flingDecay, "flingDecay");
        AbstractC3292y.i(motionDurationScale, "motionDurationScale");
        this.flingDecay = flingDecay;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f8, U5.d dVar) {
        this.lastAnimationCycleCount = 0;
        return AbstractC3458i.g(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f8, this, scrollScope, null), dVar);
    }

    public final void setLastAnimationCycleCount(int i8) {
        this.lastAnimationCycleCount = i8;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i8, AbstractC3284p abstractC3284p) {
        this(decayAnimationSpec, (i8 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}

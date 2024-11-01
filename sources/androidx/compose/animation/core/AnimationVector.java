package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    private AnimationVector() {
    }

    public abstract float get$animation_core_release(int i8);

    public abstract int getSize$animation_core_release();

    public abstract AnimationVector newVector$animation_core_release();

    public abstract void reset$animation_core_release();

    public abstract void set$animation_core_release(int i8, float f8);

    public /* synthetic */ AnimationVector(AbstractC3284p abstractC3284p) {
        this();
    }
}

package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f8) {
        super(null);
        this.value = f8;
        this.size = 1;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).value == this.value) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i8) {
        if (i8 == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i8, float f8) {
        if (i8 == 0) {
            this.value = f8;
        }
    }

    public final void setValue$animation_core_release(float f8) {
        this.value = f8;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}

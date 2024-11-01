package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f14390v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f14391v2;

    public AnimationVector2D(float f8, float f9) {
        super(null);
        this.f14390v1 = f8;
        this.f14391v2 = f9;
        this.size = 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            if (animationVector2D.f14390v1 == this.f14390v1 && animationVector2D.f14391v2 == this.f14391v2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                return 0.0f;
            }
            return this.f14391v2;
        }
        return this.f14390v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f14390v1;
    }

    public final float getV2() {
        return this.f14391v2;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f14390v1) * 31) + Float.floatToIntBits(this.f14391v2);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f14390v1 = 0.0f;
        this.f14391v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i8, float f8) {
        if (i8 != 0) {
            if (i8 == 1) {
                this.f14391v2 = f8;
                return;
            }
            return;
        }
        this.f14390v1 = f8;
    }

    public final void setV1$animation_core_release(float f8) {
        this.f14390v1 = f8;
    }

    public final void setV2$animation_core_release(float f8) {
        this.f14391v2 = f8;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f14390v1 + ", v2 = " + this.f14391v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}

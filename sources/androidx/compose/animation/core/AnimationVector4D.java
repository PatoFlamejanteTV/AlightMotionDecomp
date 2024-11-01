package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f14395v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f14396v2;

    /* renamed from: v3, reason: collision with root package name */
    private float f14397v3;

    /* renamed from: v4, reason: collision with root package name */
    private float f14398v4;

    public AnimationVector4D(float f8, float f9, float f10, float f11) {
        super(null);
        this.f14395v1 = f8;
        this.f14396v2 = f9;
        this.f14397v3 = f10;
        this.f14398v4 = f11;
        this.size = 4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            if (animationVector4D.f14395v1 == this.f14395v1 && animationVector4D.f14396v2 == this.f14396v2 && animationVector4D.f14397v3 == this.f14397v3 && animationVector4D.f14398v4 == this.f14398v4) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        return 0.0f;
                    }
                    return this.f14398v4;
                }
                return this.f14397v3;
            }
            return this.f14396v2;
        }
        return this.f14395v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f14395v1;
    }

    public final float getV2() {
        return this.f14396v2;
    }

    public final float getV3() {
        return this.f14397v3;
    }

    public final float getV4() {
        return this.f14398v4;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f14395v1) * 31) + Float.floatToIntBits(this.f14396v2)) * 31) + Float.floatToIntBits(this.f14397v3)) * 31) + Float.floatToIntBits(this.f14398v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f14395v1 = 0.0f;
        this.f14396v2 = 0.0f;
        this.f14397v3 = 0.0f;
        this.f14398v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i8, float f8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        this.f14398v4 = f8;
                        return;
                    }
                    return;
                }
                this.f14397v3 = f8;
                return;
            }
            this.f14396v2 = f8;
            return;
        }
        this.f14395v1 = f8;
    }

    public final void setV1$animation_core_release(float f8) {
        this.f14395v1 = f8;
    }

    public final void setV2$animation_core_release(float f8) {
        this.f14396v2 = f8;
    }

    public final void setV3$animation_core_release(float f8) {
        this.f14397v3 = f8;
    }

    public final void setV4$animation_core_release(float f8) {
        this.f14398v4 = f8;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f14395v1 + ", v2 = " + this.f14396v2 + ", v3 = " + this.f14397v3 + ", v4 = " + this.f14398v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}

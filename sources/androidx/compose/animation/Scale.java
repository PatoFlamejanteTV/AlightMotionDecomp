package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Scale {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f8, long j8, FiniteAnimationSpec finiteAnimationSpec, AbstractC3284p abstractC3284p) {
        this(f8, j8, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m158copybnNdC4k$default(Scale scale, float f8, long j8, FiniteAnimationSpec finiteAnimationSpec, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = scale.scale;
        }
        if ((i8 & 2) != 0) {
            j8 = scale.transformOrigin;
        }
        if ((i8 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m160copybnNdC4k(f8, j8, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m159component2SzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m160copybnNdC4k(float f8, long j8, FiniteAnimationSpec<Float> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new Scale(f8, j8, animationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m3310equalsimpl0(this.transformOrigin, scale.transformOrigin) && AbstractC3292y.d(this.animationSpec, scale.animationSpec);
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m161getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.scale) * 31) + TransformOrigin.m3313hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m3314toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f8, long j8, FiniteAnimationSpec<Float> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        this.scale = f8;
        this.transformOrigin = j8;
        this.animationSpec = animationSpec;
    }
}

package androidx.compose.animation.core;

import R5.N;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations anims) {
        AbstractC3292y.i(anims, "anims");
        this.anims = anims;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        Iterator it = m.s(0, initialValue.getSize$animation_core_release()).iterator();
        long j8 = 0;
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            j8 = Math.max(j8, this.anims.get(nextInt).getDurationNanos(initialValue.get$animation_core_release(nextInt), targetValue.get$animation_core_release(nextInt), initialVelocity.get$animation_core_release(nextInt)));
        }
        return j8;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v8 = this.endVelocityVector;
        if (v8 == null) {
            AbstractC3292y.y("endVelocityVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.endVelocityVector;
            if (v9 == null) {
                AbstractC3292y.y("endVelocityVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.anims.get(i8).getEndVelocity(initialValue.get$animation_core_release(i8), targetValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.endVelocityVector;
        if (v10 == null) {
            AbstractC3292y.y("endVelocityVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v8 = this.valueVector;
        if (v8 == null) {
            AbstractC3292y.y("valueVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.valueVector;
            if (v9 == null) {
                AbstractC3292y.y("valueVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.anims.get(i8).getValueFromNanos(j8, initialValue.get$animation_core_release(i8), targetValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            AbstractC3292y.y("valueVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v8 = this.velocityVector;
        if (v8 == null) {
            AbstractC3292y.y("velocityVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.velocityVector;
            if (v9 == null) {
                AbstractC3292y.y("velocityVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.anims.get(i8).getVelocityFromNanos(j8, initialValue.get$animation_core_release(i8), targetValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            AbstractC3292y.y("velocityVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return h.a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(final FloatAnimationSpec anim) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i8) {
                return FloatAnimationSpec.this;
            }
        });
        AbstractC3292y.i(anim, "anim");
    }
}

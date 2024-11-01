package androidx.compose.animation.core;

import R5.AbstractC1435t;
import R5.N;
import i6.i;
import i6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int InfiniteIterations = Integer.MAX_VALUE;

    public static final /* synthetic */ Animations access$createSpringAnimations(AnimationVector animationVector, float f8, float f9) {
        return createSpringAnimations(animationVector, f8, f9);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j8) {
        return m.m(j8 - vectorizedDurationBasedAnimationSpec.getDelayMillis(), 0L, vectorizedDurationBasedAnimationSpec.getDurationMillis());
    }

    public static final <V extends AnimationVector> Animations createSpringAnimations(V v8, float f8, float f9) {
        if (v8 != null) {
            return new Animations(v8, f8, f9) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
                private final List<FloatSpringSpec> anims;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    i s8 = m.s(0, v8.getSize$animation_core_release());
                    ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
                    Iterator it = s8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FloatSpringSpec(f8, f9, v8.get$animation_core_release(((N) it).nextInt())));
                    }
                    this.anims = arrayList;
                }

                @Override // androidx.compose.animation.core.Animations
                public FloatSpringSpec get(int i8) {
                    return this.anims.get(i8);
                }
            };
        }
        return new Animations(f8, f9) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            private final FloatSpringSpec anim;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.anim = new FloatSpringSpec(f8, f9, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i8) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(vectorizedAnimationSpec, "<this>");
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity) / 1000000;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j8, V start, V end, V startVelocity) {
        AbstractC3292y.i(vectorizedAnimationSpec, "<this>");
        AbstractC3292y.i(start, "start");
        AbstractC3292y.i(end, "end");
        AbstractC3292y.i(startVelocity, "startVelocity");
        return vectorizedAnimationSpec.getValueFromNanos(j8 * 1000000, start, end, startVelocity);
    }
}

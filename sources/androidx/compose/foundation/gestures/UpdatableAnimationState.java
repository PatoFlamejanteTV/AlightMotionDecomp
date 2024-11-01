package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private static final Companion Companion = new Companion(null);
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);
    private static final VectorizedSpringSpec<AnimationVector1D> RebasableAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(r.f34602a));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final VectorizedSpringSpec<AnimationVector1D> getRebasableAnimationSpec() {
            return UpdatableAnimationState.RebasableAnimationSpec;
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f8) {
            if (Math.abs(f8) < 0.01f) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:            if (r13 != 0.0f) goto L31;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a0 -> B:24:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToZero(kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14, U5.d r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, U5.d):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f8) {
        this.value = f8;
    }
}

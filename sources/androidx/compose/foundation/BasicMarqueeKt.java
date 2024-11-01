package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    private static final int DefaultMarqueeDelayMillis = 1200;
    private static final int DefaultMarqueeIterations = 3;
    private static final MarqueeSpacing DefaultMarqueeSpacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float DefaultMarqueeVelocity = Dp.m5155constructorimpl(30);

    @ExperimentalFoundationApi
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m262MarqueeSpacing0680j_4(final float f8) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$MarqueeSpacing$1
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density MarqueeSpacing, int i8, int i9) {
                AbstractC3292y.i(MarqueeSpacing, "$this$MarqueeSpacing");
                return MarqueeSpacing.mo419roundToPx0680j_4(f8);
            }
        };
    }

    @ExperimentalFoundationApi
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m264basicMarquee1Mj1MLw(Modifier basicMarquee, int i8, int i9, int i10, int i11, MarqueeSpacing spacing, float f8) {
        AbstractC3292y.i(basicMarquee, "$this$basicMarquee");
        AbstractC3292y.i(spacing, "spacing");
        return basicMarquee.then(new MarqueeModifierElement(i8, i9, i10, i11, spacing, f8, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m265basicMarquee1Mj1MLw$default(Modifier modifier, int i8, int i9, int i10, int i11, MarqueeSpacing marqueeSpacing, float f8, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = DefaultMarqueeIterations;
        }
        if ((i12 & 2) != 0) {
            i9 = MarqueeAnimationMode.Companion.m333getImmediatelyZbEOnfQ();
        }
        int i13 = i9;
        if ((i12 & 4) != 0) {
            i10 = DefaultMarqueeDelayMillis;
        }
        int i14 = i10;
        if ((i12 & 8) != 0) {
            if (MarqueeAnimationMode.m327equalsimpl0(i13, MarqueeAnimationMode.Companion.m333getImmediatelyZbEOnfQ())) {
                i11 = i14;
            } else {
                i11 = 0;
            }
        }
        int i15 = i11;
        if ((i12 & 16) != 0) {
            marqueeSpacing = DefaultMarqueeSpacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i12 & 32) != 0) {
            f8 = DefaultMarqueeVelocity;
        }
        return m264basicMarquee1Mj1MLw(modifier, i8, i13, i14, i15, marqueeSpacing2, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m266createMarqueeAnimationSpecZ4HSEVQ(int i8, float f8, int i9, int i10, float f9, Density density) {
        TweenSpec<Float> velocityBasedTween = velocityBasedTween(Math.abs(density.mo425toPx0680j_4(f9)), f8, i10);
        long m209constructorimpl$default = StartOffset.m209constructorimpl$default((-i10) + i9, 0, 2, null);
        if (i8 == Integer.MAX_VALUE) {
            return AnimationSpecKt.m188infiniteRepeatable9IiC70o$default(velocityBasedTween, null, m209constructorimpl$default, 2, null);
        }
        return AnimationSpecKt.m190repeatable91I0pcU$default(i8, velocityBasedTween, null, m209constructorimpl$default, 4, null);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return DefaultMarqueeDelayMillis;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return DefaultMarqueeIterations;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return DefaultMarqueeSpacing;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return DefaultMarqueeVelocity;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }

    private static final TweenSpec<Float> velocityBasedTween(float f8, float f9, int i8) {
        return AnimationSpecKt.tween((int) Math.ceil(f9 / (f8 / 1000.0f)), i8, EasingKt.getLinearEasing());
    }
}

package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private Function0 onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;
    public static final Companion Companion = new Companion(null);
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    private static final int[] RestingState = new int[0];

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        AbstractC3292y.i(context, "context");
    }

    private final void createRipple(boolean z8) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z8);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z8) {
        long j8;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l8 = this.lastRippleStateChangeTimeMillis;
        if (l8 != null) {
            j8 = l8.longValue();
        } else {
            j8 = 0;
        }
        long j9 = currentAnimationTimeMillis - j8;
        if (!z8 && j9 < MinimumRippleStateChangeTime) {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.a
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(RippleHostView.this);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, ResetRippleDelayDuration);
        } else {
            if (z8) {
                iArr = PressedState;
            } else {
                iArr = RestingState;
            }
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView this$0) {
        AbstractC3292y.i(this$0, "this$0");
        UnprojectedRipple unprojectedRipple = this$0.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        this$0.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1418addRippleKOepWvA(PressInteraction.Press interaction, boolean z8, long j8, int i8, long j9, float f8, Function0 onInvalidateRipple) {
        AbstractC3292y.i(interaction, "interaction");
        AbstractC3292y.i(onInvalidateRipple, "onInvalidateRipple");
        if (this.ripple == null || !AbstractC3292y.d(Boolean.valueOf(z8), this.bounded)) {
            createRipple(z8);
            this.bounded = Boolean.valueOf(z8);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        AbstractC3292y.f(unprojectedRipple);
        this.onInvalidateRipple = onInvalidateRipple;
        m1419updateRipplePropertiesbiQXAtU(j8, i8, j9, f8);
        if (z8) {
            unprojectedRipple.setHotspot(Offset.m2712getXimpl(interaction.m458getPressPositionF1C5BW0()), Offset.m2713getYimpl(interaction.m458getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            AbstractC3292y.f(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        AbstractC3292y.i(who, "who");
        Function0 function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1419updateRipplePropertiesbiQXAtU(long j8, int i8, long j9, float f8) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(i8);
        unprojectedRipple.m1426setColorDxMtmZc(j9, f8);
        Rect rect = new Rect(0, 0, AbstractC2829a.d(Size.m2781getWidthimpl(j8)), AbstractC2829a.d(Size.m2778getHeightimpl(j8)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }
}

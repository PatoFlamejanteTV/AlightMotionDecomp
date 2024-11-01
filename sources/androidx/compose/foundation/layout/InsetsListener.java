package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private WindowInsetsCompat savedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsListener(WindowInsetsHolder composeInsets) {
        super(!composeInsets.getConsumes() ? 1 : 0);
        AbstractC3292y.i(composeInsets, "composeInsets");
        this.composeInsets = composeInsets;
    }

    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final WindowInsetsCompat getSavedInsets() {
        return this.savedInsets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(insets, "insets");
        this.savedInsets = insets;
        this.composeInsets.updateImeAnimationTarget(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(insets);
            WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        }
        if (this.composeInsets.getConsumes()) {
            WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
            AbstractC3292y.h(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        AbstractC3292y.i(animation, "animation");
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (animation.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        this.savedInsets = null;
        super.onEnd(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat animation) {
        AbstractC3292y.i(animation, "animation");
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
        AbstractC3292y.i(insets, "insets");
        AbstractC3292y.i(runningAnimations, "runningAnimations");
        WindowInsetsHolder.update$default(this.composeInsets, insets, 0, 2, null);
        if (this.composeInsets.getConsumes()) {
            WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
            AbstractC3292y.h(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(bounds, "bounds");
        this.prepared = false;
        WindowInsetsAnimationCompat.BoundsCompat onStart = super.onStart(animation, bounds);
        AbstractC3292y.h(onStart, "super.onStart(animation, bounds)");
        return onStart;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        AbstractC3292y.i(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v8) {
        AbstractC3292y.i(v8, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z8) {
        this.prepared = z8;
    }

    public final void setRunningAnimation(boolean z8) {
        this.runningAnimation = z8;
    }

    public final void setSavedInsets(WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
    }
}

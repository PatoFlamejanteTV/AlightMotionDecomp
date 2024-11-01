package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean isListeningToGlobalLayout;
    private final Function0 onGlobalLayoutCallback;
    private final View view;

    public OnGlobalLayoutListener(View view, Function0 onGlobalLayoutCallback) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.view = view;
        this.onGlobalLayoutCallback = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout && this.view.isAttachedToWindow()) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout) {
            return;
        }
        this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = false;
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.onGlobalLayoutCallback.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View p02) {
        AbstractC3292y.i(p02, "p0");
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View p02) {
        AbstractC3292y.i(p02, "p0");
        unregisterOnGlobalLayoutListener();
    }
}

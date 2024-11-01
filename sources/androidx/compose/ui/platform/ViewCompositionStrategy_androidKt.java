package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {
    public static final Function0 installForLifecycle(final AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.V0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(AbstractComposeView.this, lifecycleOwner, event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, lifecycleEventObserver);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}

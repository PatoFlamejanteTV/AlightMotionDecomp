package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private InterfaceC2072n lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m4424getLambda1$ui_release();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices;
        Composition composition = this.original;
        if (composition instanceof CompositionServices) {
            compositionServices = (CompositionServices) composition;
        } else {
            compositionServices = null;
        }
        if (compositionServices == null) {
            return null;
        }
        return (T) compositionServices.getCompositionService(compositionServiceKey);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.disposed) {
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(InterfaceC2072n interfaceC2072n) {
        this.owner.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, interfaceC2072n));
    }
}

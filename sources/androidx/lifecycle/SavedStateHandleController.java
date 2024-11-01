package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, Closeable {
    private final SavedStateHandle handle;
    private boolean isAttached;
    private final String key;

    public SavedStateHandleController(String key, SavedStateHandle handle) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    public final void attachToLifecycle(SavedStateRegistry registry, Lifecycle lifecycle) {
        AbstractC3292y.i(registry, "registry");
        AbstractC3292y.i(lifecycle, "lifecycle");
        if (!this.isAttached) {
            this.isAttached = true;
            lifecycle.addObserver(this);
            registry.registerSavedStateProvider(this.key, this.handle.savedStateProvider());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().removeObserver(this);
        }
    }
}

package androidx.datastore.core.okio;

/* loaded from: classes3.dex */
public final class AtomicBoolean {
    private final java.util.concurrent.atomic.AtomicBoolean delegate;

    public AtomicBoolean(boolean z8) {
        this.delegate = new java.util.concurrent.atomic.AtomicBoolean(z8);
    }

    public final boolean get() {
        return this.delegate.get();
    }

    public final void set(boolean z8) {
        this.delegate.set(z8);
    }
}

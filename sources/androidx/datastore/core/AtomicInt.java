package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes3.dex */
public final class AtomicInt {
    private final AtomicInteger delegate;

    public AtomicInt(int i8) {
        this.delegate = new AtomicInteger(i8);
    }

    public final int decrementAndGet() {
        return this.delegate.decrementAndGet();
    }

    public final int get() {
        return this.delegate.get();
    }

    public final int getAndIncrement() {
        return this.delegate.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.delegate.incrementAndGet();
    }

    public /* synthetic */ AtomicInt(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}

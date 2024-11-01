package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}

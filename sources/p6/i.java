package p6;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i8, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }
}

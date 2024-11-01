package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3982b extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39187a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3982b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC3981a.f39186a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39187a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC3981a.f39186a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @Override // s6.y
    public final Object a(Object obj) {
        Object obj2 = f39187a.get(this);
        if (obj2 == AbstractC3981a.f39186a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}

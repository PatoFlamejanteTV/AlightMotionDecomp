package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39216a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z8) {
        this._cur = new s(8, z8);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39216a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a9 = sVar.a(obj);
            if (a9 == 0) {
                return true;
            }
            if (a9 != 1) {
                if (a9 == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.a.a(f39216a, this, sVar, sVar.i());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39216a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f39216a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) f39216a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39216a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object j8 = sVar.j();
            if (j8 != s.f39220h) {
                return j8;
            }
            androidx.concurrent.futures.a.a(f39216a, this, sVar, sVar.i());
        }
    }
}

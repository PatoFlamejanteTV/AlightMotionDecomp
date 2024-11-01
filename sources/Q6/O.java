package q6;

import Q5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import s6.C3980F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O extends r6.d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37394a = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_state");
    private volatile Object _state;

    @Override // r6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C3814M c3814m) {
        C3980F c3980f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37394a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            c3980f = AbstractC3815N.f37392a;
            atomicReferenceFieldUpdater.set(this, c3980f);
            return true;
        }
        return false;
    }

    public final Object e(U5.d dVar) {
        C3980F c3980f;
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37394a;
        c3980f = AbstractC3815N.f37392a;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3980f, c3472p)) {
            s.a aVar = Q5.s.f8810b;
            c3472p.resumeWith(Q5.s.b(Q5.I.f8786a));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return Q5.I.f8786a;
    }

    @Override // r6.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public U5.d[] b(C3814M c3814m) {
        f37394a.set(this, null);
        return r6.c.f38792a;
    }

    public final void g() {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37394a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                c3980f = AbstractC3815N.f37393b;
                if (obj != c3980f) {
                    c3980f2 = AbstractC3815N.f37392a;
                    if (obj == c3980f2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f37394a;
                        c3980f3 = AbstractC3815N.f37393b;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, c3980f3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f37394a;
                        c3980f4 = AbstractC3815N.f37392a;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater3, this, obj, c3980f4)) {
                            s.a aVar = Q5.s.f8810b;
                            ((C3472p) obj).resumeWith(Q5.s.b(Q5.I.f8786a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        C3980F c3980f;
        C3980F c3980f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37394a;
        c3980f = AbstractC3815N.f37392a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c3980f);
        AbstractC3292y.f(andSet);
        c3980f2 = AbstractC3815N.f37393b;
        if (andSet == c3980f2) {
            return true;
        }
        return false;
    }
}

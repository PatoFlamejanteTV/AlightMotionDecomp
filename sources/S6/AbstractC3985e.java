package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3985e {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39190a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3985e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39191b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3985e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC3985e(AbstractC3985e abstractC3985e) {
        this._prev = abstractC3985e;
    }

    private final AbstractC3985e c() {
        AbstractC3985e g8 = g();
        while (g8 != null && g8.h()) {
            g8 = (AbstractC3985e) f39191b.get(g8);
        }
        return g8;
    }

    private final AbstractC3985e d() {
        AbstractC3985e e8 = e();
        AbstractC3292y.f(e8);
        while (e8.h()) {
            AbstractC3985e e9 = e8.e();
            if (e9 == null) {
                return e8;
            }
            e8 = e9;
        }
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f39190a.get(this);
    }

    public final void b() {
        f39191b.lazySet(this, null);
    }

    public final AbstractC3985e e() {
        Object f8 = f();
        if (f8 == AbstractC3984d.a()) {
            return null;
        }
        return (AbstractC3985e) f8;
    }

    public final AbstractC3985e g() {
        return (AbstractC3985e) f39191b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        if (e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f39190a, this, null, AbstractC3984d.a());
    }

    public final void k() {
        Object obj;
        AbstractC3985e abstractC3985e;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC3985e c8 = c();
            AbstractC3985e d8 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39191b;
            do {
                obj = atomicReferenceFieldUpdater.get(d8);
                if (((AbstractC3985e) obj) == null) {
                    abstractC3985e = null;
                } else {
                    abstractC3985e = c8;
                }
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, d8, obj, abstractC3985e));
            if (c8 != null) {
                f39190a.set(c8, d8);
            }
            if (!d8.h() || d8.i()) {
                if (c8 == null || !c8.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC3985e abstractC3985e) {
        return androidx.concurrent.futures.a.a(f39190a, this, null, abstractC3985e);
    }
}

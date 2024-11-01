package u6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.T;

/* renamed from: u6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4103n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40377b = AtomicReferenceFieldUpdater.newUpdater(C4103n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40378c = AtomicIntegerFieldUpdater.newUpdater(C4103n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40379d = AtomicIntegerFieldUpdater.newUpdater(C4103n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40380e = AtomicIntegerFieldUpdater.newUpdater(C4103n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f40381a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final AbstractRunnableC4097h b(AbstractRunnableC4097h abstractRunnableC4097h) {
        if (d() == 127) {
            return abstractRunnableC4097h;
        }
        if (abstractRunnableC4097h.f40365b.b() == 1) {
            f40380e.incrementAndGet(this);
        }
        int i8 = f40378c.get(this) & ModuleDescriptor.MODULE_VERSION;
        while (this.f40381a.get(i8) != null) {
            Thread.yield();
        }
        this.f40381a.lazySet(i8, abstractRunnableC4097h);
        f40378c.incrementAndGet(this);
        return null;
    }

    private final void c(AbstractRunnableC4097h abstractRunnableC4097h) {
        if (abstractRunnableC4097h != null && abstractRunnableC4097h.f40365b.b() == 1) {
            f40380e.decrementAndGet(this);
        }
    }

    private final int d() {
        return f40378c.get(this) - f40379d.get(this);
    }

    private final AbstractRunnableC4097h i() {
        AbstractRunnableC4097h abstractRunnableC4097h;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40379d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f40378c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (abstractRunnableC4097h = (AbstractRunnableC4097h) this.f40381a.getAndSet(i9, null)) != null) {
                c(abstractRunnableC4097h);
                return abstractRunnableC4097h;
            }
        }
    }

    private final boolean j(C4093d c4093d) {
        AbstractRunnableC4097h i8 = i();
        if (i8 == null) {
            return false;
        }
        c4093d.a(i8);
        return true;
    }

    private final AbstractRunnableC4097h k(boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC4097h abstractRunnableC4097h;
        do {
            atomicReferenceFieldUpdater = f40377b;
            abstractRunnableC4097h = (AbstractRunnableC4097h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC4097h != null) {
                boolean z9 = true;
                if (abstractRunnableC4097h.f40365b.b() != 1) {
                    z9 = false;
                }
                if (z9 == z8) {
                }
            }
            int i8 = f40379d.get(this);
            int i9 = f40378c.get(this);
            while (i8 != i9) {
                if (z8 && f40380e.get(this) == 0) {
                    return null;
                }
                i9--;
                AbstractRunnableC4097h m8 = m(i9, z8);
                if (m8 != null) {
                    return m8;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC4097h, null));
        return abstractRunnableC4097h;
    }

    private final AbstractRunnableC4097h l(int i8) {
        int i9 = f40379d.get(this);
        int i10 = f40378c.get(this);
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        while (i9 != i10) {
            if (z8 && f40380e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            AbstractRunnableC4097h m8 = m(i9, z8);
            if (m8 == null) {
                i9 = i11;
            } else {
                return m8;
            }
        }
        return null;
    }

    private final AbstractRunnableC4097h m(int i8, boolean z8) {
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) this.f40381a.get(i9);
        if (abstractRunnableC4097h != null) {
            boolean z9 = true;
            if (abstractRunnableC4097h.f40365b.b() != 1) {
                z9 = false;
            }
            if (z9 == z8 && p6.i.a(this.f40381a, i9, abstractRunnableC4097h, null)) {
                if (z8) {
                    f40380e.decrementAndGet(this);
                }
                return abstractRunnableC4097h;
            }
        }
        return null;
    }

    private final long o(int i8, T t8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC4097h abstractRunnableC4097h;
        do {
            atomicReferenceFieldUpdater = f40377b;
            abstractRunnableC4097h = (AbstractRunnableC4097h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC4097h == null) {
                return -2L;
            }
            int i9 = 1;
            if (abstractRunnableC4097h.f40365b.b() != 1) {
                i9 = 2;
            }
            if ((i9 & i8) == 0) {
                return -2L;
            }
            long a9 = AbstractC4101l.f40373f.a() - abstractRunnableC4097h.f40364a;
            long j8 = AbstractC4101l.f40369b;
            if (a9 < j8) {
                return j8 - a9;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC4097h, null));
        t8.f34573a = abstractRunnableC4097h;
        return -1L;
    }

    public final AbstractRunnableC4097h a(AbstractRunnableC4097h abstractRunnableC4097h, boolean z8) {
        if (z8) {
            return b(abstractRunnableC4097h);
        }
        AbstractRunnableC4097h abstractRunnableC4097h2 = (AbstractRunnableC4097h) f40377b.getAndSet(this, abstractRunnableC4097h);
        if (abstractRunnableC4097h2 == null) {
            return null;
        }
        return b(abstractRunnableC4097h2);
    }

    public final int e() {
        if (f40377b.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(C4093d c4093d) {
        AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) f40377b.getAndSet(this, null);
        if (abstractRunnableC4097h != null) {
            c4093d.a(abstractRunnableC4097h);
        }
        do {
        } while (j(c4093d));
    }

    public final AbstractRunnableC4097h g() {
        AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) f40377b.getAndSet(this, null);
        if (abstractRunnableC4097h == null) {
            return i();
        }
        return abstractRunnableC4097h;
    }

    public final AbstractRunnableC4097h h() {
        return k(true);
    }

    public final long n(int i8, T t8) {
        AbstractRunnableC4097h l8;
        if (i8 == 3) {
            l8 = i();
        } else {
            l8 = l(i8);
        }
        if (l8 != null) {
            t8.f34573a = l8;
            return -1L;
        }
        return o(i8, t8);
    }
}

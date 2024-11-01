package q0;

import Q.AbstractC1396p;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N extends Task {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36623a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final J f36624b = new J();

    /* renamed from: c, reason: collision with root package name */
    private boolean f36625c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f36626d;

    /* renamed from: e, reason: collision with root package name */
    private Object f36627e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f36628f;

    private final void v() {
        AbstractC1396p.p(this.f36625c, "Task is not yet complete");
    }

    private final void w() {
        if (!this.f36626d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        if (!this.f36625c) {
        } else {
            throw C3618d.a(this);
        }
    }

    private final void y() {
        synchronized (this.f36623a) {
            try {
                if (!this.f36625c) {
                    return;
                }
                this.f36624b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, InterfaceC3619e interfaceC3619e) {
        this.f36624b.a(new z(executor, interfaceC3619e));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(Executor executor, InterfaceC3620f interfaceC3620f) {
        this.f36624b.a(new C3611B(executor, interfaceC3620f));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(InterfaceC3620f interfaceC3620f) {
        this.f36624b.a(new C3611B(AbstractC3627m.f36633a, interfaceC3620f));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Executor executor, InterfaceC3621g interfaceC3621g) {
        this.f36624b.a(new C3613D(executor, interfaceC3621g));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(InterfaceC3621g interfaceC3621g) {
        d(AbstractC3627m.f36633a, interfaceC3621g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, InterfaceC3622h interfaceC3622h) {
        this.f36624b.a(new F(executor, interfaceC3622h));
        y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, InterfaceC3617c interfaceC3617c) {
        N n8 = new N();
        this.f36624b.a(new v(executor, interfaceC3617c, n8));
        y();
        return n8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, InterfaceC3617c interfaceC3617c) {
        N n8 = new N();
        this.f36624b.a(new x(executor, interfaceC3617c, n8));
        y();
        return n8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception i() {
        Exception exc;
        synchronized (this.f36623a) {
            exc = this.f36628f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object j() {
        Object obj;
        synchronized (this.f36623a) {
            try {
                v();
                w();
                Exception exc = this.f36628f;
                if (exc == null) {
                    obj = this.f36627e;
                } else {
                    throw new C3624j(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k(Class cls) {
        Object obj;
        synchronized (this.f36623a) {
            try {
                v();
                w();
                if (!cls.isInstance(this.f36628f)) {
                    Exception exc = this.f36628f;
                    if (exc == null) {
                        obj = this.f36627e;
                    } else {
                        throw new C3624j(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f36628f));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f36626d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z8;
        synchronized (this.f36623a) {
            z8 = this.f36625c;
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z8;
        synchronized (this.f36623a) {
            try {
                z8 = false;
                if (this.f36625c && !this.f36626d && this.f36628f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, InterfaceC3625k interfaceC3625k) {
        N n8 = new N();
        this.f36624b.a(new H(executor, interfaceC3625k, n8));
        y();
        return n8;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(InterfaceC3625k interfaceC3625k) {
        Executor executor = AbstractC3627m.f36633a;
        N n8 = new N();
        this.f36624b.a(new H(executor, interfaceC3625k, n8));
        y();
        return n8;
    }

    public final void q(Exception exc) {
        AbstractC1396p.m(exc, "Exception must not be null");
        synchronized (this.f36623a) {
            x();
            this.f36625c = true;
            this.f36628f = exc;
        }
        this.f36624b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.f36623a) {
            x();
            this.f36625c = true;
            this.f36627e = obj;
        }
        this.f36624b.b(this);
    }

    public final boolean s() {
        synchronized (this.f36623a) {
            try {
                if (this.f36625c) {
                    return false;
                }
                this.f36625c = true;
                this.f36626d = true;
                this.f36624b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        AbstractC1396p.m(exc, "Exception must not be null");
        synchronized (this.f36623a) {
            try {
                if (this.f36625c) {
                    return false;
                }
                this.f36625c = true;
                this.f36628f = exc;
                this.f36624b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.f36623a) {
            try {
                if (this.f36625c) {
                    return false;
                }
                this.f36625c = true;
                this.f36627e = obj;
                this.f36624b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

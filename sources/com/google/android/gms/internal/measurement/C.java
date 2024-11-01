package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final C2277w1 f16242a;

    /* renamed from: b, reason: collision with root package name */
    private Y2 f16243b;

    /* renamed from: c, reason: collision with root package name */
    C2114d f16244c;

    /* renamed from: d, reason: collision with root package name */
    private final C2096b f16245d;

    public C() {
        this(new C2277w1());
    }

    public final C2114d a() {
        return this.f16244c;
    }

    public final void b(A2 a22) {
        AbstractC2204n abstractC2204n;
        try {
            this.f16243b = this.f16242a.f17059b.d();
            if (!(this.f16242a.a(this.f16243b, (B2[]) a22.I().toArray(new B2[0])) instanceof C2186l)) {
                for (C2302z2 c2302z2 : a22.G().I()) {
                    List I8 = c2302z2.I();
                    String H8 = c2302z2.H();
                    Iterator it = I8.iterator();
                    while (it.hasNext()) {
                        InterfaceC2243s a9 = this.f16242a.a(this.f16243b, (B2) it.next());
                        if (a9 instanceof r) {
                            Y2 y22 = this.f16243b;
                            if (!y22.g(H8)) {
                                abstractC2204n = null;
                            } else {
                                InterfaceC2243s c8 = y22.c(H8);
                                if (c8 instanceof AbstractC2204n) {
                                    abstractC2204n = (AbstractC2204n) c8;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + H8);
                                }
                            }
                            if (abstractC2204n != null) {
                                abstractC2204n.a(this.f16243b, Collections.singletonList(a9));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + H8);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C2124e0(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f16242a.b(str, callable);
    }

    public final boolean d(C2123e c2123e) {
        try {
            this.f16244c.b(c2123e);
            this.f16242a.f17060c.h("runtime.counter", new C2177k(Double.valueOf(0.0d)));
            this.f16245d.b(this.f16243b.d(), this.f16244c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new C2124e0(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC2204n e() {
        return new J7(this.f16245d);
    }

    public final boolean f() {
        if (!this.f16244c.f().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!this.f16244c.d().equals(this.f16244c.a())) {
            return true;
        }
        return false;
    }

    private C(C2277w1 c2277w1) {
        this.f16242a = c2277w1;
        this.f16243b = c2277w1.f17059b.d();
        this.f16244c = new C2114d();
        this.f16245d = new C2096b();
        c2277w1.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.this.e();
            }
        });
        c2277w1.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.F0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2296y4(C.this.f16244c);
            }
        });
    }
}

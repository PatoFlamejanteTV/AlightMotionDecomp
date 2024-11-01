package D0;

import c1.InterfaceC2008a;
import c1.InterfaceC2009b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class D implements InterfaceC2009b, InterfaceC2008a {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2008a.InterfaceC0369a f1142c = new InterfaceC2008a.InterfaceC0369a() { // from class: D0.A
        @Override // c1.InterfaceC2008a.InterfaceC0369a
        public final void a(InterfaceC2009b interfaceC2009b) {
            D.f(interfaceC2009b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2009b f1143d = new InterfaceC2009b() { // from class: D0.B
        @Override // c1.InterfaceC2009b
        public final Object get() {
            Object g8;
            g8 = D.g();
            return g8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2008a.InterfaceC0369a f1144a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC2009b f1145b;

    private D(InterfaceC2008a.InterfaceC0369a interfaceC0369a, InterfaceC2009b interfaceC2009b) {
        this.f1144a = interfaceC0369a;
        this.f1145b = interfaceC2009b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D e() {
        return new D(f1142c, f1143d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(InterfaceC2008a.InterfaceC0369a interfaceC0369a, InterfaceC2008a.InterfaceC0369a interfaceC0369a2, InterfaceC2009b interfaceC2009b) {
        interfaceC0369a.a(interfaceC2009b);
        interfaceC0369a2.a(interfaceC2009b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D i(InterfaceC2009b interfaceC2009b) {
        return new D(null, interfaceC2009b);
    }

    @Override // c1.InterfaceC2008a
    public void a(final InterfaceC2008a.InterfaceC0369a interfaceC0369a) {
        InterfaceC2009b interfaceC2009b;
        InterfaceC2009b interfaceC2009b2;
        InterfaceC2009b interfaceC2009b3 = this.f1145b;
        InterfaceC2009b interfaceC2009b4 = f1143d;
        if (interfaceC2009b3 != interfaceC2009b4) {
            interfaceC0369a.a(interfaceC2009b3);
            return;
        }
        synchronized (this) {
            interfaceC2009b = this.f1145b;
            if (interfaceC2009b != interfaceC2009b4) {
                interfaceC2009b2 = interfaceC2009b;
            } else {
                final InterfaceC2008a.InterfaceC0369a interfaceC0369a2 = this.f1144a;
                this.f1144a = new InterfaceC2008a.InterfaceC0369a() { // from class: D0.C
                    @Override // c1.InterfaceC2008a.InterfaceC0369a
                    public final void a(InterfaceC2009b interfaceC2009b5) {
                        D.h(InterfaceC2008a.InterfaceC0369a.this, interfaceC0369a, interfaceC2009b5);
                    }
                };
                interfaceC2009b2 = null;
            }
        }
        if (interfaceC2009b2 != null) {
            interfaceC0369a.a(interfaceC2009b);
        }
    }

    @Override // c1.InterfaceC2009b
    public Object get() {
        return this.f1145b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(InterfaceC2009b interfaceC2009b) {
        InterfaceC2008a.InterfaceC0369a interfaceC0369a;
        if (this.f1145b == f1143d) {
            synchronized (this) {
                interfaceC0369a = this.f1144a;
                this.f1144a = null;
                this.f1145b = interfaceC2009b;
            }
            interfaceC0369a.a(interfaceC2009b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(InterfaceC2009b interfaceC2009b) {
    }
}

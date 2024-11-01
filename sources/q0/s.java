package q0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36637a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f36638b;

    /* renamed from: c, reason: collision with root package name */
    private final N f36639c;

    /* renamed from: d, reason: collision with root package name */
    private int f36640d;

    /* renamed from: e, reason: collision with root package name */
    private int f36641e;

    /* renamed from: f, reason: collision with root package name */
    private int f36642f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f36643g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36644h;

    public s(int i8, N n8) {
        this.f36638b = i8;
        this.f36639c = n8;
    }

    private final void c() {
        if (this.f36640d + this.f36641e + this.f36642f == this.f36638b) {
            if (this.f36643g != null) {
                this.f36639c.q(new ExecutionException(this.f36641e + " out of " + this.f36638b + " underlying tasks failed", this.f36643g));
                return;
            }
            if (this.f36644h) {
                this.f36639c.s();
            } else {
                this.f36639c.r(null);
            }
        }
    }

    @Override // q0.InterfaceC3622h
    public final void a(Object obj) {
        synchronized (this.f36637a) {
            this.f36640d++;
            c();
        }
    }

    @Override // q0.InterfaceC3619e
    public final void b() {
        synchronized (this.f36637a) {
            this.f36642f++;
            this.f36644h = true;
            c();
        }
    }

    @Override // q0.InterfaceC3621g
    public final void d(Exception exc) {
        synchronized (this.f36637a) {
            this.f36641e++;
            this.f36643g = exc;
            c();
        }
    }
}

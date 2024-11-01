package u6;

import n6.Q;

/* renamed from: u6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4100k extends AbstractRunnableC4097h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f40367c;

    public C4100k(Runnable runnable, long j8, InterfaceC4098i interfaceC4098i) {
        super(j8, interfaceC4098i);
        this.f40367c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f40367c.run();
        } finally {
            this.f40365b.a();
        }
    }

    public String toString() {
        return "Task[" + Q.a(this.f40367c) + '@' + Q.b(this.f40367c) + ", " + this.f40364a + ", " + this.f40365b + ']';
    }
}

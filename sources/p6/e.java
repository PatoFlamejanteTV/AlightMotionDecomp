package p6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import n6.AbstractC3442a;
import n6.C3490y0;
import n6.F0;

/* loaded from: classes5.dex */
public abstract class e extends AbstractC3442a implements d {

    /* renamed from: d, reason: collision with root package name */
    private final d f36416d;

    public e(U5.g gVar, d dVar, boolean z8, boolean z9) {
        super(gVar, z8, z9);
        this.f36416d = dVar;
    }

    @Override // p6.v
    public boolean A() {
        return this.f36416d.A();
    }

    @Override // n6.F0
    public void M(Throwable th) {
        CancellationException C02 = F0.C0(this, th, null, 1, null);
        this.f36416d.cancel(C02);
        K(C02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d O0() {
        return this.f36416d;
    }

    @Override // p6.u
    public Object c() {
        return this.f36416d.c();
    }

    @Override // n6.F0, n6.InterfaceC3488x0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C3490y0(P(), null, this);
        }
        M(cancellationException);
    }

    @Override // p6.v
    public boolean d(Throwable th) {
        return this.f36416d.d(th);
    }

    @Override // p6.u
    public f iterator() {
        return this.f36416d.iterator();
    }

    @Override // p6.v
    public Object l(Object obj, U5.d dVar) {
        return this.f36416d.l(obj, dVar);
    }

    @Override // p6.u
    public Object s(U5.d dVar) {
        return this.f36416d.s(dVar);
    }

    @Override // p6.v
    public void w(Function1 function1) {
        this.f36416d.w(function1);
    }

    @Override // p6.v
    public Object x(Object obj) {
        return this.f36416d.x(obj);
    }

    @Override // p6.u
    public Object y(U5.d dVar) {
        Object y8 = this.f36416d.y(dVar);
        V5.b.e();
        return y8;
    }

    public final d N0() {
        return this;
    }
}

package n6;

import s6.C3976B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z0 extends C3976B implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f35688e;

    public Z0(long j8, U5.d dVar) {
        super(dVar.getContext(), dVar);
        this.f35688e = j8;
    }

    @Override // n6.AbstractC3442a, n6.F0
    public String o0() {
        return super.o0() + "(timeMillis=" + this.f35688e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        K(a1.a(this.f35688e, X.d(getContext()), this));
    }
}

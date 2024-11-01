package s6;

import n6.AbstractC3441G;
import n6.AbstractC3442a;

/* renamed from: s6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3976B extends AbstractC3442a implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final U5.d f39161d;

    public C3976B(U5.g gVar, U5.d dVar) {
        super(gVar, true, true);
        this.f39161d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n6.F0
    public void H(Object obj) {
        AbstractC3991k.c(V5.b.c(this.f39161d), AbstractC3441G.a(obj, this.f39161d), null, 2, null);
    }

    @Override // n6.AbstractC3442a
    protected void J0(Object obj) {
        U5.d dVar = this.f39161d;
        dVar.resumeWith(AbstractC3441G.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        U5.d dVar = this.f39161d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // n6.F0
    protected final boolean h0() {
        return true;
    }
}

package G0;

import L0.m;
import c1.InterfaceC2008a;
import c1.InterfaceC2009b;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2008a f2757a;

    public l(InterfaceC2008a interfaceC2008a) {
        this.f2757a = interfaceC2008a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, InterfaceC2009b interfaceC2009b) {
        android.support.v4.media.a.a(interfaceC2009b.get());
        throw null;
    }

    public void c(m mVar) {
        if (mVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(mVar);
            this.f2757a.a(new InterfaceC2008a.InterfaceC0369a() { // from class: G0.k
                @Override // c1.InterfaceC2008a.InterfaceC0369a
                public final void a(InterfaceC2009b interfaceC2009b) {
                    l.b(e.this, interfaceC2009b);
                }
            });
        }
    }
}

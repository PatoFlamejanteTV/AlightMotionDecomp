package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public final class d0 extends T {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC1383c f8228a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8229b;

    public d0(AbstractC1383c abstractC1383c, int i8) {
        this.f8228a = abstractC1383c;
        this.f8229b = i8;
    }

    @Override // Q.InterfaceC1391k
    public final void F(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // Q.InterfaceC1391k
    public final void N(int i8, IBinder iBinder, h0 h0Var) {
        AbstractC1383c abstractC1383c = this.f8228a;
        AbstractC1396p.m(abstractC1383c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC1396p.l(h0Var);
        AbstractC1383c.c0(abstractC1383c, h0Var);
        U(i8, iBinder, h0Var.f8265a);
    }

    @Override // Q.InterfaceC1391k
    public final void U(int i8, IBinder iBinder, Bundle bundle) {
        AbstractC1396p.m(this.f8228a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8228a.N(i8, iBinder, bundle, this.f8229b);
        this.f8228a = null;
    }
}

package Q;

import N.C1339b;
import Q.AbstractC1383c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f8254g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC1383c abstractC1383c, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC1383c, i8, bundle);
        this.f8255h = abstractC1383c;
        this.f8254g = iBinder;
    }

    @Override // Q.Q
    protected final void f(C1339b c1339b) {
        if (this.f8255h.f8204v != null) {
            this.f8255h.f8204v.i(c1339b);
        }
        this.f8255h.L(c1339b);
    }

    @Override // Q.Q
    protected final boolean g() {
        AbstractC1383c.a aVar;
        AbstractC1383c.a aVar2;
        try {
            IBinder iBinder = this.f8254g;
            AbstractC1396p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f8255h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f8255h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s8 = this.f8255h.s(this.f8254g);
            if (s8 != null && (AbstractC1383c.g0(this.f8255h, 2, 4, s8) || AbstractC1383c.g0(this.f8255h, 3, 4, s8))) {
                this.f8255h.f8208z = null;
                AbstractC1383c abstractC1383c = this.f8255h;
                Bundle x8 = abstractC1383c.x();
                aVar = abstractC1383c.f8203u;
                if (aVar != null) {
                    aVar2 = this.f8255h.f8203u;
                    aVar2.k(x8);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

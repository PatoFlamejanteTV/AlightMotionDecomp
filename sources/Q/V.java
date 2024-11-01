package Q;

import android.os.IBinder;
import android.os.Parcel;
import f0.AbstractC2836a;
import f0.AbstractC2838c;

/* loaded from: classes3.dex */
public final class V extends AbstractC2836a implements X {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // Q.X
    public final boolean I(N.I i8, Y.a aVar) {
        Parcel i9 = i();
        AbstractC2838c.c(i9, i8);
        AbstractC2838c.d(i9, aVar);
        Parcel h8 = h(5, i9);
        boolean e8 = AbstractC2838c.e(h8);
        h8.recycle();
        return e8;
    }

    @Override // Q.X
    public final N.G M(N.E e8) {
        Parcel i8 = i();
        AbstractC2838c.c(i8, e8);
        Parcel h8 = h(6, i8);
        N.G g8 = (N.G) AbstractC2838c.a(h8, N.G.CREATOR);
        h8.recycle();
        return g8;
    }

    @Override // Q.X
    public final N.G R(N.E e8) {
        Parcel i8 = i();
        AbstractC2838c.c(i8, e8);
        Parcel h8 = h(8, i8);
        N.G g8 = (N.G) AbstractC2838c.a(h8, N.G.CREATOR);
        h8.recycle();
        return g8;
    }

    @Override // Q.X
    public final boolean d() {
        Parcel h8 = h(7, i());
        boolean e8 = AbstractC2838c.e(h8);
        h8.recycle();
        return e8;
    }
}

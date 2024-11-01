package N;

import Q.v0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class I extends R.a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    private final String f6338a;

    /* renamed from: b, reason: collision with root package name */
    private final z f6339b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6340c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6341d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(String str, z zVar, boolean z8, boolean z9) {
        this.f6338a = str;
        this.f6339b = zVar;
        this.f6340c = z8;
        this.f6341d = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f6338a;
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, str, false);
        z zVar = this.f6339b;
        if (zVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zVar = null;
        }
        R.c.j(parcel, 2, zVar, false);
        R.c.c(parcel, 3, this.f6340c);
        R.c.c(parcel, 4, this.f6341d);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(String str, IBinder iBinder, boolean z8, boolean z9) {
        this.f6338a = str;
        A a9 = null;
        if (iBinder != null) {
            try {
                Y.a y8 = v0.i(iBinder).y();
                byte[] bArr = y8 == null ? null : (byte[]) Y.b.k(y8);
                if (bArr != null) {
                    a9 = new A(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f6339b = a9;
        this.f6340c = z8;
        this.f6341d = z9;
    }
}

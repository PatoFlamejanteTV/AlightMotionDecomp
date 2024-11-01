package N;

import Q.AbstractC1396p;
import Q.S;
import Q.v0;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class z extends v0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6388a;

    /* JADX INFO: Access modifiers changed from: protected */
    public z(byte[] bArr) {
        boolean z8;
        if (bArr.length == 25) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1396p.a(z8);
        this.f6388a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] k(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // Q.S
    public final int b() {
        return this.f6388a;
    }

    public final boolean equals(Object obj) {
        Y.a y8;
        if (obj != null && (obj instanceof S)) {
            try {
                S s8 = (S) obj;
                if (s8.b() != this.f6388a || (y8 = s8.y()) == null) {
                    return false;
                }
                return Arrays.equals(s0(), (byte[]) Y.b.k(y8));
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6388a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] s0();

    @Override // Q.S
    public final Y.a y() {
        return Y.b.s0(s0());
    }
}

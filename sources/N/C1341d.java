package N;

import Q.AbstractC1394n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: N.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1341d extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1341d> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    private final String f6358a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6359b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6360c;

    public C1341d(String str, int i8, long j8) {
        this.f6358a = str;
        this.f6359b = i8;
        this.f6360c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1341d) {
            C1341d c1341d = (C1341d) obj;
            if (((s() != null && s().equals(c1341d.s())) || (s() == null && c1341d.s() == null)) && u() == c1341d.u()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1394n.b(s(), Long.valueOf(u()));
    }

    public String s() {
        return this.f6358a;
    }

    public final String toString() {
        AbstractC1394n.a c8 = AbstractC1394n.c(this);
        c8.a("name", s());
        c8.a("version", Long.valueOf(u()));
        return c8.toString();
    }

    public long u() {
        long j8 = this.f6360c;
        if (j8 == -1) {
            return this.f6359b;
        }
        return j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, s(), false);
        R.c.k(parcel, 2, this.f6359b);
        R.c.n(parcel, 3, u());
        R.c.b(parcel, a9);
    }

    public C1341d(String str, long j8) {
        this.f6358a = str;
        this.f6360c = j8;
        this.f6359b = -1;
    }
}

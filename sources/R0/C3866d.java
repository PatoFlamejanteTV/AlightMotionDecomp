package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3866d extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3866d> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    private String f37693a;

    /* renamed from: b, reason: collision with root package name */
    private String f37694b;

    /* renamed from: c, reason: collision with root package name */
    private int f37695c;

    public C3866d(String str, String str2, int i8) {
        this.f37693a = str;
        this.f37694b = str2;
        this.f37695c = i8;
    }

    public int s() {
        int i8 = this.f37695c;
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            return 0;
        }
        return i8;
    }

    public String u() {
        return this.f37694b;
    }

    public String v() {
        return this.f37693a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, v(), false);
        R.c.q(parcel, 3, u(), false);
        R.c.k(parcel, 4, s());
        R.c.b(parcel, a9);
    }
}

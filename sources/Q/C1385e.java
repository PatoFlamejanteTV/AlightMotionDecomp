package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1385e extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1385e> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final r f8230a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8231b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8232c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f8233d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8234e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f8235f;

    public C1385e(r rVar, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f8230a = rVar;
        this.f8231b = z8;
        this.f8232c = z9;
        this.f8233d = iArr;
        this.f8234e = i8;
        this.f8235f = iArr2;
    }

    public final r I() {
        return this.f8230a;
    }

    public int s() {
        return this.f8234e;
    }

    public int[] u() {
        return this.f8233d;
    }

    public int[] v() {
        return this.f8235f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f8230a, i8, false);
        R.c.c(parcel, 2, y());
        R.c.c(parcel, 3, z());
        R.c.l(parcel, 4, u(), false);
        R.c.k(parcel, 5, s());
        R.c.l(parcel, 6, v(), false);
        R.c.b(parcel, a9);
    }

    public boolean y() {
        return this.f8231b;
    }

    public boolean z() {
        return this.f8232c;
    }
}

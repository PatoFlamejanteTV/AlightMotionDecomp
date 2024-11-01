package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class r extends R.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f8308a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8309b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8310c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8311d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8312e;

    public r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f8308a = i8;
        this.f8309b = z8;
        this.f8310c = z9;
        this.f8311d = i9;
        this.f8312e = i10;
    }

    public int s() {
        return this.f8311d;
    }

    public int u() {
        return this.f8312e;
    }

    public boolean v() {
        return this.f8309b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, z());
        R.c.c(parcel, 2, v());
        R.c.c(parcel, 3, y());
        R.c.k(parcel, 4, s());
        R.c.k(parcel, 5, u());
        R.c.b(parcel, a9);
    }

    public boolean y() {
        return this.f8310c;
    }

    public int z() {
        return this.f8308a;
    }
}

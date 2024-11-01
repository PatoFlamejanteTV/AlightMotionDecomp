package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class d extends R.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    int f40160a;

    /* renamed from: b, reason: collision with root package name */
    String f40161b;

    /* renamed from: c, reason: collision with root package name */
    double f40162c;

    /* renamed from: d, reason: collision with root package name */
    String f40163d;

    /* renamed from: e, reason: collision with root package name */
    long f40164e;

    /* renamed from: f, reason: collision with root package name */
    int f40165f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i8, String str, double d8, String str2, long j8, int i9) {
        this.f40160a = i8;
        this.f40161b = str;
        this.f40162c = d8;
        this.f40163d = str2;
        this.f40164e = j8;
        this.f40165f = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f40160a);
        R.c.q(parcel, 3, this.f40161b, false);
        R.c.g(parcel, 4, this.f40162c);
        R.c.q(parcel, 5, this.f40163d, false);
        R.c.n(parcel, 6, this.f40164e);
        R.c.k(parcel, 7, this.f40165f);
        R.c.b(parcel, a9);
    }
}

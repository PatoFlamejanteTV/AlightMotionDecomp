package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class f extends R.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    long f40168a;

    /* renamed from: b, reason: collision with root package name */
    long f40169b;

    public f(long j8, long j9) {
        this.f40168a = j8;
        this.f40169b = j9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.n(parcel, 2, this.f40168a);
        R.c.n(parcel, 3, this.f40169b);
        R.c.b(parcel, a9);
    }
}

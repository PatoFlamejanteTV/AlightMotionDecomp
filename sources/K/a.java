package K;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class a extends R.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f4521a;

    /* renamed from: b, reason: collision with root package name */
    private int f4522b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f4523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i8, int i9, Bundle bundle) {
        this.f4521a = i8;
        this.f4522b = i9;
        this.f4523c = bundle;
    }

    public int s() {
        return this.f4522b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f4521a);
        R.c.k(parcel, 2, s());
        R.c.e(parcel, 3, this.f4523c, false);
        R.c.b(parcel, a9);
    }
}

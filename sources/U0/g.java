package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class g extends R.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    String f40170a;

    /* renamed from: b, reason: collision with root package name */
    String f40171b;

    public g(String str, String str2) {
        this.f40170a = str;
        this.f40171b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40170a, false);
        R.c.q(parcel, 3, this.f40171b, false);
        R.c.b(parcel, a9);
    }
}

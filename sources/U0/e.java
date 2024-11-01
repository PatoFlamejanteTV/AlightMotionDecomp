package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class e extends R.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f40166a;

    /* renamed from: b, reason: collision with root package name */
    String f40167b;

    public e(String str, String str2) {
        this.f40166a = str;
        this.f40167b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40166a, false);
        R.c.q(parcel, 3, this.f40167b, false);
        R.c.b(parcel, a9);
    }
}

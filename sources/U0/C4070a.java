package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4070a extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4070a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    String f40152a;

    /* renamed from: b, reason: collision with root package name */
    String f40153b;

    public C4070a(String str, String str2) {
        this.f40152a = str;
        this.f40153b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40152a, false);
        R.c.q(parcel, 3, this.f40153b, false);
        R.c.b(parcel, a9);
    }
}

package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class h extends R.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    String f40172a;

    /* renamed from: b, reason: collision with root package name */
    String f40173b;

    /* renamed from: c, reason: collision with root package name */
    f f40174c;

    /* renamed from: d, reason: collision with root package name */
    g f40175d;

    /* renamed from: e, reason: collision with root package name */
    g f40176e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, String str2, f fVar, g gVar, g gVar2) {
        this.f40172a = str;
        this.f40173b = str2;
        this.f40174c = fVar;
        this.f40175d = gVar;
        this.f40176e = gVar2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40172a, false);
        R.c.q(parcel, 3, this.f40173b, false);
        R.c.p(parcel, 4, this.f40174c, i8, false);
        R.c.p(parcel, 5, this.f40175d, i8, false);
        R.c.p(parcel, 6, this.f40176e, i8, false);
        R.c.b(parcel, a9);
    }
}

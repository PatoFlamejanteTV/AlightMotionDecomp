package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class m extends R.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String[] f32665a;

    /* renamed from: b, reason: collision with root package name */
    int[] f32666b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f32667c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f32668d;

    public m(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f32665a = strArr;
        this.f32666b = iArr;
        this.f32667c = remoteViews;
        this.f32668d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.r(parcel, 1, this.f32665a, false);
        R.c.l(parcel, 2, this.f32666b, false);
        R.c.p(parcel, 3, this.f32667c, i8, false);
        R.c.f(parcel, 4, this.f32668d, false);
        R.c.b(parcel, a9);
    }
}

package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class e extends R.a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32661a;

    public e(byte[] bArr) {
        this.f32661a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32661a;
        int a9 = R.c.a(parcel);
        R.c.f(parcel, 2, bArr, false);
        R.c.b(parcel, a9);
    }
}

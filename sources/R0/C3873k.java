package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3873k extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3873k> CREATOR = new C3850A();

    /* renamed from: a, reason: collision with root package name */
    int f37751a;

    /* renamed from: b, reason: collision with root package name */
    String f37752b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3873k(int i8, String str) {
        this.f37751a = i8;
        this.f37752b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f37751a);
        R.c.q(parcel, 3, this.f37752b, false);
        R.c.b(parcel, a9);
    }
}

package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3864b extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3864b> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    String f37684a;

    /* renamed from: b, reason: collision with root package name */
    String f37685b;

    /* renamed from: c, reason: collision with root package name */
    String f37686c;

    /* renamed from: d, reason: collision with root package name */
    int f37687d;

    /* renamed from: e, reason: collision with root package name */
    UserAddress f37688e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3864b(String str, String str2, String str3, int i8, UserAddress userAddress) {
        this.f37684a = str;
        this.f37685b = str2;
        this.f37686c = str3;
        this.f37687d = i8;
        this.f37688e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f37684a, false);
        R.c.q(parcel, 2, this.f37685b, false);
        R.c.q(parcel, 3, this.f37686c, false);
        R.c.k(parcel, 4, this.f37687d);
        R.c.p(parcel, 5, this.f37688e, i8, false);
        R.c.b(parcel, a9);
    }
}

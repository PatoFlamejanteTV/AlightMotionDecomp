package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3869g extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3869g> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private final int f37725a;

    /* renamed from: b, reason: collision with root package name */
    String f37726b;

    /* renamed from: c, reason: collision with root package name */
    String f37727c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f37728d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3869g(int i8, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f37725a = i8;
        this.f37727c = str2;
        if (i8 < 3) {
            com.google.android.gms.wallet.wobs.a s8 = CommonWalletObject.s();
            s8.a(str);
            this.f37728d = s8.b();
            return;
        }
        this.f37728d = commonWalletObject;
    }

    public int s() {
        return this.f37725a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, s());
        R.c.q(parcel, 2, this.f37726b, false);
        R.c.q(parcel, 3, this.f37727c, false);
        R.c.p(parcel, 4, this.f37728d, i8, false);
        R.c.b(parcel, a9);
    }
}

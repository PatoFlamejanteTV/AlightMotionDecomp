package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3865c extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3865c> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37689a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37690b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37691c;

    /* renamed from: d, reason: collision with root package name */
    int f37692d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3865c(ArrayList arrayList, boolean z8, boolean z9, int i8) {
        this.f37689a = arrayList;
        this.f37690b = z8;
        this.f37691c = z9;
        this.f37692d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.m(parcel, 1, this.f37689a, false);
        R.c.c(parcel, 2, this.f37690b);
        R.c.c(parcel, 3, this.f37691c);
        R.c.k(parcel, 4, this.f37692d);
        R.c.b(parcel, a9);
    }
}

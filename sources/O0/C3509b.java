package o0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3509b extends R.a implements O.j {
    public static final Parcelable.Creator<C3509b> CREATOR = new C3510c();

    /* renamed from: a, reason: collision with root package name */
    final int f35828a;

    /* renamed from: b, reason: collision with root package name */
    private int f35829b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f35830c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3509b(int i8, int i9, Intent intent) {
        this.f35828a = i8;
        this.f35829b = i9;
        this.f35830c = intent;
    }

    @Override // O.j
    public final Status getStatus() {
        if (this.f35829b == 0) {
            return Status.f16060f;
        }
        return Status.f16064j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f35828a;
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, this.f35829b);
        R.c.p(parcel, 3, this.f35830c, i8, false);
        R.c.b(parcel, a9);
    }
}

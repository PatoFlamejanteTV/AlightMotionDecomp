package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3881t extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3881t> CREATOR = new C3856G();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3881t(ArrayList arrayList) {
        this.f37769a = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.s(parcel, 1, this.f37769a, false);
        R.c.b(parcel, a9);
    }
}

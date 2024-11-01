package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Q.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1399t extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1399t> CREATOR = new C1403x();

    /* renamed from: a, reason: collision with root package name */
    private final int f8318a;

    /* renamed from: b, reason: collision with root package name */
    private List f8319b;

    public C1399t(int i8, List list) {
        this.f8318a = i8;
        this.f8319b = list;
    }

    public final int s() {
        return this.f8318a;
    }

    public final List u() {
        return this.f8319b;
    }

    public final void v(C1393m c1393m) {
        if (this.f8319b == null) {
            this.f8319b = new ArrayList();
        }
        this.f8319b.add(c1393m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f8318a);
        R.c.u(parcel, 2, this.f8319b, false);
        R.c.b(parcel, a9);
    }
}

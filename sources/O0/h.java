package o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends R.a implements O.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f35831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35832b;

    public h(List list, String str) {
        this.f35831a = list;
        this.f35832b = str;
    }

    @Override // O.j
    public final Status getStatus() {
        if (this.f35832b != null) {
            return Status.f16060f;
        }
        return Status.f16064j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f35831a;
        int a9 = R.c.a(parcel);
        R.c.s(parcel, 1, list, false);
        R.c.q(parcel, 2, this.f35832b, false);
        R.c.b(parcel, a9);
    }
}

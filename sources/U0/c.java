package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class c extends R.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String f40157a;

    /* renamed from: b, reason: collision with root package name */
    d f40158b;

    /* renamed from: c, reason: collision with root package name */
    f f40159c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, d dVar, f fVar) {
        this.f40157a = str;
        this.f40158b = dVar;
        this.f40159c = fVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f40157a, false);
        R.c.p(parcel, 3, this.f40158b, i8, false);
        R.c.p(parcel, 5, this.f40159c, i8, false);
        R.c.b(parcel, a9);
    }
}

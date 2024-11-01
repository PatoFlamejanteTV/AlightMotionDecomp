package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class G extends R.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6334a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6335b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6336c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6337d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(boolean z8, String str, int i8, int i9) {
        this.f6334a = z8;
        this.f6335b = str;
        this.f6336c = O.a(i8) - 1;
        this.f6337d = t.a(i9) - 1;
    }

    public final String s() {
        return this.f6335b;
    }

    public final boolean u() {
        return this.f6334a;
    }

    public final int v() {
        return t.a(this.f6337d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.c(parcel, 1, this.f6334a);
        R.c.q(parcel, 2, this.f6335b, false);
        R.c.k(parcel, 3, this.f6336c);
        R.c.k(parcel, 4, this.f6337d);
        R.c.b(parcel, a9);
    }

    public final int y() {
        return O.a(this.f6336c);
    }
}

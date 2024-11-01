package N;

import Y.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class E extends R.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final String f6328a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6329b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6330c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6331d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6332e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6333f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(String str, boolean z8, boolean z9, IBinder iBinder, boolean z10, boolean z11) {
        this.f6328a = str;
        this.f6329b = z8;
        this.f6330c = z9;
        this.f6331d = (Context) Y.b.k(a.AbstractBinderC0258a.i(iBinder));
        this.f6332e = z10;
        this.f6333f = z11;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Y.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f6328a;
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, str, false);
        R.c.c(parcel, 2, this.f6329b);
        R.c.c(parcel, 3, this.f6330c);
        R.c.j(parcel, 4, Y.b.s0(this.f6331d), false);
        R.c.c(parcel, 5, this.f6332e);
        R.c.c(parcel, 6, this.f6333f);
        R.c.b(parcel, a9);
    }
}

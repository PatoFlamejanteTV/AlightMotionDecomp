package C2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a implements c {
    public static final Parcelable.Creator<a> CREATOR = new C0015a();

    /* renamed from: a, reason: collision with root package name */
    private final c f771a;

    /* renamed from: b, reason: collision with root package name */
    private final c f772b;

    /* renamed from: C2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0015a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new a((c) parcel.readParcelable(a.class.getClassLoader()), (c) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(c first, c second) {
        AbstractC3292y.i(first, "first");
        AbstractC3292y.i(second, "second");
        this.f771a = first;
        this.f772b = second;
    }

    @Override // C2.c
    public String R(Context context) {
        AbstractC3292y.i(context, "context");
        return this.f771a.R(context) + this.f772b.R(context);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f771a, aVar.f771a) && AbstractC3292y.d(this.f772b, aVar.f772b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f771a.hashCode() * 31) + this.f772b.hashCode();
    }

    public String toString() {
        return "ConcatenatedResolvableString(first=" + this.f771a + ", second=" + this.f772b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f771a, i8);
        out.writeParcelable(this.f772b, i8);
    }
}

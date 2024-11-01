package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import p2.C3559a;

/* renamed from: g3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2908g implements z2.f {
    public static final Parcelable.Creator<C2908g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C3559a f32148a;

    /* renamed from: b, reason: collision with root package name */
    private final List f32149b;

    /* renamed from: g3.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2908g createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            C3559a c3559a = (C3559a) parcel.readParcelable(C2908g.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(C2902a.CREATOR.createFromParcel(parcel));
            }
            return new C2908g(c3559a, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2908g[] newArray(int i8) {
            return new C2908g[i8];
        }
    }

    public C2908g(C3559a bin, List accountRanges) {
        AbstractC3292y.i(bin, "bin");
        AbstractC3292y.i(accountRanges, "accountRanges");
        this.f32148a = bin;
        this.f32149b = accountRanges;
    }

    public final List a() {
        return this.f32149b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2908g)) {
            return false;
        }
        C2908g c2908g = (C2908g) obj;
        if (AbstractC3292y.d(this.f32148a, c2908g.f32148a) && AbstractC3292y.d(this.f32149b, c2908g.f32149b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32148a.hashCode() * 31) + this.f32149b.hashCode();
    }

    public String toString() {
        return "CardMetadata(bin=" + this.f32148a + ", accountRanges=" + this.f32149b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f32148a, i8);
        List list = this.f32149b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C2902a) it.next()).writeToParcel(out, i8);
        }
    }
}

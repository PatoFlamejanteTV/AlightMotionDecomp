package n2;

import android.os.Parcel;
import android.os.Parcelable;
import g3.C2895E;
import g3.C2896F;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35440a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35441b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35442c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35443d;

    /* renamed from: e, reason: collision with root package name */
    private final C2895E f35444e;

    /* renamed from: f, reason: collision with root package name */
    private final C2896F f35445f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.model.o f35446g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35447h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            C2895E createFromParcel;
            C2896F createFromParcel2;
            boolean z10;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            com.stripe.android.model.o oVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2895E.CREATOR.createFromParcel(parcel);
            }
            C2895E c2895e = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C2896F.CREATOR.createFromParcel(parcel);
            }
            C2896F c2896f = createFromParcel2;
            if (parcel.readInt() != 0) {
                oVar = com.stripe.android.model.o.CREATOR.createFromParcel(parcel);
            }
            com.stripe.android.model.o oVar2 = oVar;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new v(z8, z9, readLong, readLong2, c2895e, c2896f, oVar2, z10);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    public v(boolean z8, boolean z9, long j8, long j9, C2895E c2895e, C2896F c2896f, com.stripe.android.model.o oVar, boolean z10) {
        this.f35440a = z8;
        this.f35441b = z9;
        this.f35442c = j8;
        this.f35443d = j9;
        this.f35444e = c2895e;
        this.f35445f = c2896f;
        this.f35446g = oVar;
        this.f35447h = z10;
    }

    public static /* synthetic */ v b(v vVar, boolean z8, boolean z9, long j8, long j9, C2895E c2895e, C2896F c2896f, com.stripe.android.model.o oVar, boolean z10, int i8, Object obj) {
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        C2895E c2895e2;
        C2896F c2896f2;
        com.stripe.android.model.o oVar2;
        boolean z13;
        if ((i8 & 1) != 0) {
            z11 = vVar.f35440a;
        } else {
            z11 = z8;
        }
        if ((i8 & 2) != 0) {
            z12 = vVar.f35441b;
        } else {
            z12 = z9;
        }
        if ((i8 & 4) != 0) {
            j10 = vVar.f35442c;
        } else {
            j10 = j8;
        }
        if ((i8 & 8) != 0) {
            j11 = vVar.f35443d;
        } else {
            j11 = j9;
        }
        if ((i8 & 16) != 0) {
            c2895e2 = vVar.f35444e;
        } else {
            c2895e2 = c2895e;
        }
        if ((i8 & 32) != 0) {
            c2896f2 = vVar.f35445f;
        } else {
            c2896f2 = c2896f;
        }
        if ((i8 & 64) != 0) {
            oVar2 = vVar.f35446g;
        } else {
            oVar2 = oVar;
        }
        if ((i8 & 128) != 0) {
            z13 = vVar.f35447h;
        } else {
            z13 = z10;
        }
        return vVar.a(z11, z12, j10, j11, c2895e2, c2896f2, oVar2, z13);
    }

    public final v a(boolean z8, boolean z9, long j8, long j9, C2895E c2895e, C2896F c2896f, com.stripe.android.model.o oVar, boolean z10) {
        return new v(z8, z9, j8, j9, c2895e, c2896f, oVar, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f35440a == vVar.f35440a && this.f35441b == vVar.f35441b && this.f35442c == vVar.f35442c && this.f35443d == vVar.f35443d && AbstractC3292y.d(this.f35444e, vVar.f35444e) && AbstractC3292y.d(this.f35445f, vVar.f35445f) && AbstractC3292y.d(this.f35446g, vVar.f35446g) && this.f35447h == vVar.f35447h) {
            return true;
        }
        return false;
    }

    public final C2895E f() {
        return this.f35444e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a9 = ((((((androidx.compose.foundation.a.a(this.f35440a) * 31) + androidx.compose.foundation.a.a(this.f35441b)) * 31) + androidx.collection.a.a(this.f35442c)) * 31) + androidx.collection.a.a(this.f35443d)) * 31;
        C2895E c2895e = this.f35444e;
        int i8 = 0;
        if (c2895e == null) {
            hashCode = 0;
        } else {
            hashCode = c2895e.hashCode();
        }
        int i9 = (a9 + hashCode) * 31;
        C2896F c2896f = this.f35445f;
        if (c2896f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2896f.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.o oVar = this.f35446g;
        if (oVar != null) {
            i8 = oVar.hashCode();
        }
        return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f35447h);
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.f35440a + ", isShippingMethodRequired=" + this.f35441b + ", cartTotal=" + this.f35442c + ", shippingTotal=" + this.f35443d + ", shippingInformation=" + this.f35444e + ", shippingMethod=" + this.f35445f + ", paymentMethod=" + this.f35446g + ", useGooglePay=" + this.f35447h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(this.f35440a ? 1 : 0);
        out.writeInt(this.f35441b ? 1 : 0);
        out.writeLong(this.f35442c);
        out.writeLong(this.f35443d);
        C2895E c2895e = this.f35444e;
        if (c2895e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2895e.writeToParcel(out, i8);
        }
        C2896F c2896f = this.f35445f;
        if (c2896f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2896f.writeToParcel(out, i8);
        }
        com.stripe.android.model.o oVar = this.f35446g;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f35447h ? 1 : 0);
    }
}

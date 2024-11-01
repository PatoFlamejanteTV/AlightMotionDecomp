package N3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final w.g f6600a;

    /* renamed from: b, reason: collision with root package name */
    private final N3.a f6601b;

    /* renamed from: c, reason: collision with root package name */
    private final g f6602c;

    /* renamed from: d, reason: collision with root package name */
    private final D3.f f6603d;

    /* renamed from: e, reason: collision with root package name */
    private final j f6604e;

    /* renamed from: f, reason: collision with root package name */
    private final C2752d f6605f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            N3.a createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            w.g createFromParcel2 = w.g.CREATOR.createFromParcel(parcel);
            g gVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = N3.a.CREATOR.createFromParcel(parcel);
            }
            N3.a aVar = createFromParcel;
            if (parcel.readInt() != 0) {
                gVar = g.CREATOR.createFromParcel(parcel);
            }
            return new l(createFromParcel2, aVar, gVar, (D3.f) parcel.readParcelable(l.class.getClassLoader()), (j) parcel.readSerializable(), C2752d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(w.g config, N3.a aVar, g gVar, D3.f fVar, j jVar, C2752d paymentMethodMetadata) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        this.f6600a = config;
        this.f6601b = aVar;
        this.f6602c = gVar;
        this.f6603d = fVar;
        this.f6604e = jVar;
        this.f6605f = paymentMethodMetadata;
    }

    public final w.g a() {
        return this.f6600a;
    }

    public final N3.a b() {
        return this.f6601b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3292y.d(this.f6600a, lVar.f6600a) && AbstractC3292y.d(this.f6601b, lVar.f6601b) && AbstractC3292y.d(this.f6602c, lVar.f6602c) && AbstractC3292y.d(this.f6603d, lVar.f6603d) && AbstractC3292y.d(this.f6604e, lVar.f6604e) && AbstractC3292y.d(this.f6605f, lVar.f6605f)) {
            return true;
        }
        return false;
    }

    public final g f() {
        return this.f6602c;
    }

    public final C2752d h() {
        return this.f6605f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f6600a.hashCode() * 31;
        N3.a aVar = this.f6601b;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = (hashCode4 + hashCode) * 31;
        g gVar = this.f6602c;
        if (gVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        D3.f fVar = this.f6603d;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        j jVar = this.f6604e;
        if (jVar != null) {
            i8 = jVar.hashCode();
        }
        return ((i11 + i8) * 31) + this.f6605f.hashCode();
    }

    public final D3.f i() {
        return this.f6603d;
    }

    public final boolean l() {
        if ((this.f6601b != null && (!r0.h().isEmpty())) || this.f6605f.a0()) {
            return true;
        }
        return false;
    }

    public final StripeIntent p() {
        return this.f6605f.W();
    }

    public final j s() {
        return this.f6604e;
    }

    public String toString() {
        return "Full(config=" + this.f6600a + ", customer=" + this.f6601b + ", linkState=" + this.f6602c + ", paymentSelection=" + this.f6603d + ", validationError=" + this.f6604e + ", paymentMethodMetadata=" + this.f6605f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f6600a.writeToParcel(out, i8);
        N3.a aVar = this.f6601b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        g gVar = this.f6602c;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f6603d, i8);
        out.writeSerializable(this.f6604e);
        this.f6605f.writeToParcel(out, i8);
    }
}

package Z3;

import Q5.x;
import R5.Q;
import Z3.a;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e implements a.b, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final q f13241a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            q createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = q.CREATOR.createFromParcel(parcel);
            }
            return new e(createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(q qVar) {
        this.f13241a = qVar;
    }

    @Override // Z3.a.b
    public Map a() {
        Map map;
        q qVar = this.f13241a;
        if (qVar != null) {
            map = Q.e(x.a("sdk_transaction_id", qVar.a()));
        } else {
            map = null;
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3292y.d(this.f13241a, ((e) obj).f13241a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        q qVar = this.f13241a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.f13241a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        q qVar = this.f13241a;
        if (qVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            qVar.writeToParcel(out, i8);
        }
    }
}

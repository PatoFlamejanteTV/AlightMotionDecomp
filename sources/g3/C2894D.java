package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2894D implements z2.f {
    public static final Parcelable.Creator<C2894D> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f31949a;

    /* renamed from: g3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2894D createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(com.stripe.android.model.o.CREATOR.createFromParcel(parcel));
            }
            return new C2894D(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2894D[] newArray(int i8) {
            return new C2894D[i8];
        }
    }

    public C2894D(List paymentMethods) {
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        this.f31949a = paymentMethods;
    }

    public final List a() {
        return this.f31949a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2894D) && AbstractC3292y.d(this.f31949a, ((C2894D) obj).f31949a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31949a.hashCode();
    }

    public String toString() {
        return "PaymentMethodsList(paymentMethods=" + this.f31949a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        List list = this.f31949a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.stripe.android.model.o) it.next()).writeToParcel(out, i8);
        }
    }
}

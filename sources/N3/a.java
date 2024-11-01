package N3;

import Q5.p;
import R5.AbstractC1435t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f6446a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6447b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6448c;

    /* renamed from: d, reason: collision with root package name */
    private final c f6449d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0118a f6444e = new C0118a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f6445f = 8;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: N3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0118a {
        private C0118a() {
        }

        public final a a(j.d customer, List supportedSavedPaymentMethodTypes) {
            boolean z8;
            AbstractC3292y.i(customer, "customer");
            AbstractC3292y.i(supportedSavedPaymentMethodTypes, "supportedSavedPaymentMethodTypes");
            j.d.a.c a9 = customer.b().b().a();
            if (a9 instanceof j.d.a.c.b) {
                z8 = ((j.d.a.c.b) a9).b();
            } else if (a9 instanceof j.d.a.c.C0507a) {
                z8 = false;
            } else {
                throw new p();
            }
            String f8 = customer.b().f();
            String a10 = customer.b().a();
            List a11 = customer.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a11) {
                if (AbstractC1435t.d0(supportedSavedPaymentMethodTypes, ((o) obj).f25635e)) {
                    arrayList.add(obj);
                }
            }
            return new a(f8, a10, arrayList, new c(z8, true));
        }

        public final a b(String customerId, w.h.b accessType, List paymentMethods) {
            AbstractC3292y.i(customerId, "customerId");
            AbstractC3292y.i(accessType, "accessType");
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            return new a(customerId, accessType.a(), paymentMethods, new c(true, false));
        }

        public /* synthetic */ C0118a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
            }
            return new a(readString, readString2, arrayList, c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0119a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6450a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6451b;

        /* renamed from: N3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0119a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new c(z8, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(boolean z8, boolean z9) {
            this.f6450a = z8;
            this.f6451b = z9;
        }

        public final boolean a() {
            return this.f6451b;
        }

        public final boolean b() {
            return this.f6450a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f6450a == cVar.f6450a && this.f6451b == cVar.f6451b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f6450a) * 31) + androidx.compose.foundation.a.a(this.f6451b);
        }

        public String toString() {
            return "Permissions(canRemovePaymentMethods=" + this.f6450a + ", canRemoveDuplicates=" + this.f6451b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f6450a ? 1 : 0);
            out.writeInt(this.f6451b ? 1 : 0);
        }
    }

    public a(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(permissions, "permissions");
        this.f6446a = id;
        this.f6447b = ephemeralKeySecret;
        this.f6448c = paymentMethods;
        this.f6449d = permissions;
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, List list, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aVar.f6446a;
        }
        if ((i8 & 2) != 0) {
            str2 = aVar.f6447b;
        }
        if ((i8 & 4) != 0) {
            list = aVar.f6448c;
        }
        if ((i8 & 8) != 0) {
            cVar = aVar.f6449d;
        }
        return aVar.a(str, str2, list, cVar);
    }

    public final a a(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(permissions, "permissions");
        return new a(id, ephemeralKeySecret, paymentMethods, permissions);
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
        if (AbstractC3292y.d(this.f6446a, aVar.f6446a) && AbstractC3292y.d(this.f6447b, aVar.f6447b) && AbstractC3292y.d(this.f6448c, aVar.f6448c) && AbstractC3292y.d(this.f6449d, aVar.f6449d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f6447b;
    }

    public final String getId() {
        return this.f6446a;
    }

    public final List h() {
        return this.f6448c;
    }

    public int hashCode() {
        return (((((this.f6446a.hashCode() * 31) + this.f6447b.hashCode()) * 31) + this.f6448c.hashCode()) * 31) + this.f6449d.hashCode();
    }

    public final c i() {
        return this.f6449d;
    }

    public String toString() {
        return "CustomerState(id=" + this.f6446a + ", ephemeralKeySecret=" + this.f6447b + ", paymentMethods=" + this.f6448c + ", permissions=" + this.f6449d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f6446a);
        out.writeString(this.f6447b);
        List list = this.f6448c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        this.f6449d.writeToParcel(out, i8);
    }
}

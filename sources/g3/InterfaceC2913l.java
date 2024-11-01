package g3;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2913l extends InterfaceC2900J, Parcelable {

    /* renamed from: g3.l$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2913l {

        /* renamed from: a, reason: collision with root package name */
        private final Map f32174a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32175b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32176c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0742a f32173d = new C0742a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: g3.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0742a {
            private C0742a() {
            }

            public final Map a(Map paymentMethodCreateParams) {
                Map map;
                AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.get("card");
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map == null) {
                    return null;
                }
                return Q.e(Q5.x.a("card", Q.e(Q5.x.a("cvc", map.get("cvc")))));
            }

            public /* synthetic */ C0742a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: g3.l$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                boolean z8 = false;
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(a.class.getClassLoader()));
                }
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                return new a(linkedHashMap, readString, z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Map cardPaymentMethodCreateParamsMap, String email, boolean z8) {
            AbstractC3292y.i(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            AbstractC3292y.i(email, "email");
            this.f32174a = cardPaymentMethodCreateParamsMap;
            this.f32175b = email;
            this.f32176c = z8;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map map2;
            Object obj;
            Map m8 = Q.m(Q5.x.a("type", "card"), Q5.x.a("active", Boolean.valueOf(this.f32176c)), Q5.x.a("billing_email_address", this.f32175b));
            Q5.r a9 = AbstractC2914m.a(this.f32174a);
            if (a9 != null) {
                m8.put(a9.c(), a9.d());
            }
            Object obj2 = this.f32174a.get("card");
            String str = null;
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (AbstractC1435t.d0(a0.i("number", "exp_month", "exp_year"), entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map B8 = Q.B(linkedHashMap);
                Object obj3 = map.get("networks");
                if (obj3 instanceof Map) {
                    map2 = (Map) obj3;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    obj = map2.get("preferred");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                }
                if (str != null) {
                    B8.put("preferred_network", str);
                }
                m8.put("card", Q.w(B8));
            }
            return m8;
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
            if (AbstractC3292y.d(this.f32174a, aVar.f32174a) && AbstractC3292y.d(this.f32175b, aVar.f32175b) && this.f32176c == aVar.f32176c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f32174a.hashCode() * 31) + this.f32175b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32176c);
        }

        public String toString() {
            return "Card(cardPaymentMethodCreateParamsMap=" + this.f32174a + ", email=" + this.f32175b + ", active=" + this.f32176c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            Map map = this.f32174a;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
            out.writeString(this.f32175b);
            out.writeInt(this.f32176c ? 1 : 0);
        }
    }
}

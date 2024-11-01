package g3;

import R5.AbstractC1435t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface v extends Parcelable {
    List C();

    String H();

    String P();

    String S();

    String d();

    String getType();

    List n();

    /* loaded from: classes4.dex */
    public static final class a implements v {
        public static final Parcelable.Creator<a> CREATOR = new C0744a();

        /* renamed from: a, reason: collision with root package name */
        private final String f32250a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.i f32251b;

        /* renamed from: c, reason: collision with root package name */
        private final List f32252c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32253d;

        /* renamed from: e, reason: collision with root package name */
        private final String f32254e;

        /* renamed from: g3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0744a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), com.stripe.android.model.i.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, com.stripe.android.model.i deferredIntentParams, List externalPaymentMethods, String str2, String str3) {
            AbstractC3292y.i(deferredIntentParams, "deferredIntentParams");
            AbstractC3292y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f32250a = str;
            this.f32251b = deferredIntentParams;
            this.f32252c = externalPaymentMethods;
            this.f32253d = str2;
            this.f32254e = str3;
        }

        @Override // g3.v
        public List C() {
            return AbstractC1435t.m();
        }

        @Override // g3.v
        public String H() {
            return this.f32254e;
        }

        @Override // g3.v
        public String P() {
            return this.f32253d;
        }

        @Override // g3.v
        public String S() {
            return this.f32250a;
        }

        public final com.stripe.android.model.i a() {
            return this.f32251b;
        }

        @Override // g3.v
        public String d() {
            return null;
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
            if (AbstractC3292y.d(this.f32250a, aVar.f32250a) && AbstractC3292y.d(this.f32251b, aVar.f32251b) && AbstractC3292y.d(this.f32252c, aVar.f32252c) && AbstractC3292y.d(this.f32253d, aVar.f32253d) && AbstractC3292y.d(this.f32254e, aVar.f32254e)) {
                return true;
            }
            return false;
        }

        @Override // g3.v
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f32250a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode * 31) + this.f32251b.hashCode()) * 31) + this.f32252c.hashCode()) * 31;
            String str2 = this.f32253d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (hashCode3 + hashCode2) * 31;
            String str3 = this.f32254e;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i9 + i8;
        }

        @Override // g3.v
        public List n() {
            return this.f32252c;
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.f32250a + ", deferredIntentParams=" + this.f32251b + ", externalPaymentMethods=" + this.f32252c + ", defaultPaymentMethodId=" + this.f32253d + ", customerSessionClientSecret=" + this.f32254e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32250a);
            this.f32251b.writeToParcel(out, i8);
            out.writeStringList(this.f32252c);
            out.writeString(this.f32253d);
            out.writeString(this.f32254e);
        }

        public /* synthetic */ a(String str, com.stripe.android.model.i iVar, List list, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, iVar, list, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements v {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f32255a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32256b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32257c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32258d;

        /* renamed from: e, reason: collision with root package name */
        private final List f32259e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f32255a = clientSecret;
            this.f32256b = str;
            this.f32257c = str2;
            this.f32258d = str3;
            this.f32259e = externalPaymentMethods;
        }

        @Override // g3.v
        public List C() {
            return AbstractC1435t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // g3.v
        public String H() {
            return this.f32257c;
        }

        @Override // g3.v
        public String P() {
            return this.f32258d;
        }

        @Override // g3.v
        public String S() {
            return this.f32256b;
        }

        @Override // g3.v
        public String d() {
            return this.f32255a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f32255a, bVar.f32255a) && AbstractC3292y.d(this.f32256b, bVar.f32256b) && AbstractC3292y.d(this.f32257c, bVar.f32257c) && AbstractC3292y.d(this.f32258d, bVar.f32258d) && AbstractC3292y.d(this.f32259e, bVar.f32259e)) {
                return true;
            }
            return false;
        }

        @Override // g3.v
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f32255a.hashCode() * 31;
            String str = this.f32256b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f32257c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f32258d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f32259e.hashCode();
        }

        @Override // g3.v
        public List n() {
            return this.f32259e;
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.f32255a + ", locale=" + this.f32256b + ", customerSessionClientSecret=" + this.f32257c + ", defaultPaymentMethodId=" + this.f32258d + ", externalPaymentMethods=" + this.f32259e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32255a);
            out.writeString(this.f32256b);
            out.writeString(this.f32257c);
            out.writeString(this.f32258d);
            out.writeStringList(this.f32259e);
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, List list, int i8, AbstractC3284p abstractC3284p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f32260a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32261b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32262c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32263d;

        /* renamed from: e, reason: collision with root package name */
        private final List f32264e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f32260a = clientSecret;
            this.f32261b = str;
            this.f32262c = str2;
            this.f32263d = str3;
            this.f32264e = externalPaymentMethods;
        }

        @Override // g3.v
        public List C() {
            return AbstractC1435t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // g3.v
        public String H() {
            return this.f32262c;
        }

        @Override // g3.v
        public String P() {
            return this.f32263d;
        }

        @Override // g3.v
        public String S() {
            return this.f32261b;
        }

        @Override // g3.v
        public String d() {
            return this.f32260a;
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
            if (AbstractC3292y.d(this.f32260a, cVar.f32260a) && AbstractC3292y.d(this.f32261b, cVar.f32261b) && AbstractC3292y.d(this.f32262c, cVar.f32262c) && AbstractC3292y.d(this.f32263d, cVar.f32263d) && AbstractC3292y.d(this.f32264e, cVar.f32264e)) {
                return true;
            }
            return false;
        }

        @Override // g3.v
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f32260a.hashCode() * 31;
            String str = this.f32261b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f32262c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f32263d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f32264e.hashCode();
        }

        @Override // g3.v
        public List n() {
            return this.f32264e;
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.f32260a + ", locale=" + this.f32261b + ", customerSessionClientSecret=" + this.f32262c + ", defaultPaymentMethodId=" + this.f32263d + ", externalPaymentMethods=" + this.f32264e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32260a);
            out.writeString(this.f32261b);
            out.writeString(this.f32262c);
            out.writeString(this.f32263d);
            out.writeStringList(this.f32264e);
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, List list, int i8, AbstractC3284p abstractC3284p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }
}

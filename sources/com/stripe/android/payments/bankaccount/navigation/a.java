package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0538a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0538a f26321a = new C0538a();
        public static final Parcelable.Creator<C0538a> CREATOR = new C0539a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0539a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0538a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0538a.f26321a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0538a[] newArray(int i8) {
                return new C0538a[i8];
            }
        }

        private C0538a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0538a);
        }

        public int hashCode() {
            return 1430639253;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C0540a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f26322a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26323b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26324c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26325d;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0540a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, String paymentMethodId, String str, String str2) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            this.f26322a = intent;
            this.f26323b = paymentMethodId;
            this.f26324c = str;
            this.f26325d = str2;
        }

        public final String a() {
            return this.f26325d;
        }

        public final StripeIntent b() {
            return this.f26322a;
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
            return AbstractC3292y.d(this.f26322a, bVar.f26322a) && AbstractC3292y.d(this.f26323b, bVar.f26323b) && AbstractC3292y.d(this.f26324c, bVar.f26324c) && AbstractC3292y.d(this.f26325d, bVar.f26325d);
        }

        public final String f() {
            return this.f26324c;
        }

        public final String h() {
            return this.f26323b;
        }

        public int hashCode() {
            int hashCode = ((this.f26322a.hashCode() * 31) + this.f26323b.hashCode()) * 31;
            String str = this.f26324c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26325d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(intent=" + this.f26322a + ", paymentMethodId=" + this.f26323b + ", last4=" + this.f26324c + ", bankName=" + this.f26325d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26322a, i8);
            out.writeString(this.f26323b);
            out.writeString(this.f26324c);
            out.writeString(this.f26325d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0541a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26326a;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0541a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Throwable error) {
            AbstractC3292y.i(error, "error");
            this.f26326a = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26326a, ((c) obj).f26326a);
        }

        public int hashCode() {
            return this.f26326a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f26326a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f26326a);
        }
    }
}

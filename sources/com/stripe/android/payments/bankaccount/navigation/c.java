package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3292y;
import z2.f;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f26328a;

    /* renamed from: b, reason: collision with root package name */
    private final C0542c f26329b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26330c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26327d = FinancialConnectionsSession.$stable;
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new c((StripeIntent) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C0542c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26331a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26332b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26333c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String paymentMethodId, String str, String str2) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            this.f26331a = paymentMethodId;
            this.f26332b = str;
            this.f26333c = str2;
        }

        public final String a() {
            return this.f26333c;
        }

        public final String b() {
            return this.f26332b;
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
            return AbstractC3292y.d(this.f26331a, bVar.f26331a) && AbstractC3292y.d(this.f26332b, bVar.f26332b) && AbstractC3292y.d(this.f26333c, bVar.f26333c);
        }

        public final String f() {
            return this.f26331a;
        }

        public int hashCode() {
            int hashCode = this.f26331a.hashCode() * 31;
            String str = this.f26332b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26333c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebitsData(paymentMethodId=" + this.f26331a + ", last4=" + this.f26332b + ", bankName=" + this.f26333c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f26331a);
            out.writeString(this.f26332b);
            out.writeString(this.f26333c);
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0542c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final FinancialConnectionsSession f26335a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26334b = FinancialConnectionsSession.$stable;
        public static final Parcelable.Creator<C0542c> CREATOR = new a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0542c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0542c(parcel.readParcelable(C0542c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0542c[] newArray(int i8) {
                return new C0542c[i8];
            }
        }

        public C0542c(FinancialConnectionsSession financialConnectionsSession) {
            AbstractC3292y.i(financialConnectionsSession, "financialConnectionsSession");
            this.f26335a = financialConnectionsSession;
        }

        public final FinancialConnectionsSession a() {
            return this.f26335a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0542c) && AbstractC3292y.d(this.f26335a, ((C0542c) obj).f26335a);
        }

        public int hashCode() {
            return this.f26335a.hashCode();
        }

        public String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.f26335a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable((Parcelable) this.f26335a, i8);
        }
    }

    public c(StripeIntent stripeIntent, C0542c c0542c, b bVar) {
        this.f26328a = stripeIntent;
        this.f26329b = c0542c;
        this.f26330c = bVar;
    }

    public final b a() {
        return this.f26330c;
    }

    public final StripeIntent b() {
        return this.f26328a;
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
        return AbstractC3292y.d(this.f26328a, cVar.f26328a) && AbstractC3292y.d(this.f26329b, cVar.f26329b) && AbstractC3292y.d(this.f26330c, cVar.f26330c);
    }

    public final C0542c f() {
        return this.f26329b;
    }

    public int hashCode() {
        StripeIntent stripeIntent = this.f26328a;
        int hashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        C0542c c0542c = this.f26329b;
        int hashCode2 = (hashCode + (c0542c == null ? 0 : c0542c.hashCode())) * 31;
        b bVar = this.f26330c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.f26328a + ", usBankAccountData=" + this.f26329b + ", instantDebitsData=" + this.f26330c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f26328a, i8);
        C0542c c0542c = this.f26329b;
        if (c0542c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0542c.writeToParcel(out, i8);
        }
        b bVar = this.f26330c;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }
}

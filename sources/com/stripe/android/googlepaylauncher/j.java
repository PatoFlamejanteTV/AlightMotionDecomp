package com.stripe.android.googlepaylauncher;

import B2.InterfaceC0951c;
import Q5.I;
import Q5.t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import c6.InterfaceC2072n;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final c f25134g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25135h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final d f25136a;

    /* renamed from: b, reason: collision with root package name */
    private final e f25137b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f25138c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25139d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f25140e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25141f;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f25142a;

        /* renamed from: b, reason: collision with root package name */
        int f25143b;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object e8 = V5.b.e();
            int i8 = this.f25143b;
            if (i8 != 0) {
                if (i8 == 1) {
                    eVar = (e) this.f25142a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                n nVar = (n) j.this.f25140e.invoke(j.this.f25136a.f());
                e eVar2 = j.this.f25137b;
                InterfaceC3821f isReady = nVar.isReady();
                this.f25142a = eVar2;
                this.f25143b = 1;
                obj = AbstractC3823h.w(isReady, this);
                if (obj == e8) {
                    return e8;
                }
                eVar = eVar2;
            }
            Boolean bool = (Boolean) obj;
            j.this.f25141f = bool.booleanValue();
            eVar.a(bool.booleanValue());
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(boolean z8);
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f25160a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0475a();

            /* renamed from: com.stripe.android.googlepaylauncher.j$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0475a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    parcel.readInt();
                    return a.f25160a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -299418266;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends f {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final o f25161a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(o.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f25161a = paymentMethod;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3292y.d(this.f25161a, ((b) obj).f25161a);
            }

            public int hashCode() {
                return this.f25161a.hashCode();
            }

            public final o r() {
                return this.f25161a;
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.f25161a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f25161a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f25162a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25163b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable error, int i8) {
                super(null);
                AbstractC3292y.i(error, "error");
                this.f25162a = error;
                this.f25163b = i8;
            }

            public final Throwable a() {
                return this.f25162a;
            }

            public final int b() {
                return this.f25163b;
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
                return AbstractC3292y.d(this.f25162a, cVar.f25162a) && this.f25163b == cVar.f25163b;
            }

            public int hashCode() {
                return (this.f25162a.hashCode() * 31) + this.f25163b;
            }

            public String toString() {
                return "Failed(error=" + this.f25162a + ", errorCode=" + this.f25163b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeSerializable(this.f25162a);
                out.writeInt(this.f25163b);
            }
        }

        private f() {
        }

        public /* synthetic */ f(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public j(M lifecycleScope, d config, e readyCallback, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0951c analyticsRequestExecutor) {
        AbstractC3292y.i(lifecycleScope, "lifecycleScope");
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(readyCallback, "readyCallback");
        AbstractC3292y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f25136a = config;
        this.f25137b = readyCallback;
        this.f25138c = activityResultLauncher;
        this.f25139d = z8;
        this.f25140e = googlePayRepositoryFactory;
        analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.v(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.f26094y0, null, null, null, null, null, 62, null));
        if (!z8) {
            AbstractC3462k.d(lifecycleScope, null, null, new a(null), 3, null);
        }
    }

    public final void e(String currencyCode, long j8, String str, String str2) {
        AbstractC3292y.i(currencyCode, "currencyCode");
        if (!this.f25139d && !this.f25141f) {
            throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
        }
        this.f25138c.launch(new GooglePayPaymentMethodLauncherContractV2.a(this.f25136a, currencyCode, j8, str2, str));
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f25145a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0474b f25146b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25147c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readInt() != 0, EnumC0474b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.googlepaylauncher.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0474b {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0474b f25148b = new EnumC0474b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0474b f25149c = new EnumC0474b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0474b[] f25150d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25151e;

            /* renamed from: a, reason: collision with root package name */
            private final String f25152a;

            static {
                EnumC0474b[] a9 = a();
                f25150d = a9;
                f25151e = W5.b.a(a9);
            }

            private EnumC0474b(String str, int i8, String str2) {
                this.f25152a = str2;
            }

            private static final /* synthetic */ EnumC0474b[] a() {
                return new EnumC0474b[]{f25148b, f25149c};
            }

            public static EnumC0474b valueOf(String str) {
                return (EnumC0474b) Enum.valueOf(EnumC0474b.class, str);
            }

            public static EnumC0474b[] values() {
                return (EnumC0474b[]) f25150d.clone();
            }
        }

        public b(boolean z8, EnumC0474b format, boolean z9) {
            AbstractC3292y.i(format, "format");
            this.f25145a = z8;
            this.f25146b = format;
            this.f25147c = z9;
        }

        public final EnumC0474b a() {
            return this.f25146b;
        }

        public final boolean b() {
            return this.f25147c;
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
            return this.f25145a == bVar.f25145a && this.f25146b == bVar.f25146b && this.f25147c == bVar.f25147c;
        }

        public final boolean f() {
            return this.f25145a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f25145a) * 31) + this.f25146b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25147c);
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.f25145a + ", format=" + this.f25146b + ", isPhoneNumberRequired=" + this.f25147c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f25145a ? 1 : 0);
            out.writeString(this.f25146b.name());
            out.writeInt(this.f25147c ? 1 : 0);
        }

        public /* synthetic */ b(boolean z8, EnumC0474b enumC0474b, boolean z9, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? EnumC0474b.f25148b : enumC0474b, (i8 & 4) != 0 ? false : z9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final N2.d f25153a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25154b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25155c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f25156d;

        /* renamed from: e, reason: collision with root package name */
        private b f25157e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f25158f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f25159g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(N2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(N2.d environment, String merchantCountryCode, String merchantName, boolean z8, b billingAddressConfig, boolean z9, boolean z10) {
            AbstractC3292y.i(environment, "environment");
            AbstractC3292y.i(merchantCountryCode, "merchantCountryCode");
            AbstractC3292y.i(merchantName, "merchantName");
            AbstractC3292y.i(billingAddressConfig, "billingAddressConfig");
            this.f25153a = environment;
            this.f25154b = merchantCountryCode;
            this.f25155c = merchantName;
            this.f25156d = z8;
            this.f25157e = billingAddressConfig;
            this.f25158f = z9;
            this.f25159g = z10;
        }

        public final boolean a() {
            return this.f25159g;
        }

        public final b b() {
            return this.f25157e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f25153a == dVar.f25153a && AbstractC3292y.d(this.f25154b, dVar.f25154b) && AbstractC3292y.d(this.f25155c, dVar.f25155c) && this.f25156d == dVar.f25156d && AbstractC3292y.d(this.f25157e, dVar.f25157e) && this.f25158f == dVar.f25158f && this.f25159g == dVar.f25159g;
        }

        public final N2.d f() {
            return this.f25153a;
        }

        public final boolean h() {
            return this.f25158f;
        }

        public int hashCode() {
            return (((((((((((this.f25153a.hashCode() * 31) + this.f25154b.hashCode()) * 31) + this.f25155c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25156d)) * 31) + this.f25157e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25158f)) * 31) + androidx.compose.foundation.a.a(this.f25159g);
        }

        public final String i() {
            return this.f25154b;
        }

        public final String l() {
            return this.f25155c;
        }

        public final boolean p() {
            return this.f25156d;
        }

        public final boolean s() {
            return l6.n.s(this.f25154b, Locale.JAPAN.getCountry(), true);
        }

        public String toString() {
            return "Config(environment=" + this.f25153a + ", merchantCountryCode=" + this.f25154b + ", merchantName=" + this.f25155c + ", isEmailRequired=" + this.f25156d + ", billingAddressConfig=" + this.f25157e + ", existingPaymentMethodRequired=" + this.f25158f + ", allowCreditCards=" + this.f25159g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25153a.name());
            out.writeString(this.f25154b);
            out.writeString(this.f25155c);
            out.writeInt(this.f25156d ? 1 : 0);
            this.f25157e.writeToParcel(out, i8);
            out.writeInt(this.f25158f ? 1 : 0);
            out.writeInt(this.f25159g ? 1 : 0);
        }

        public /* synthetic */ d(N2.d dVar, String str, String str2, boolean z8, b bVar, boolean z9, boolean z10, int i8, AbstractC3284p abstractC3284p) {
            this(dVar, str, str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? new b(false, null, false, 7, null) : bVar, (i8 & 32) != 0 ? true : z9, (i8 & 64) != 0 ? true : z10);
        }
    }
}

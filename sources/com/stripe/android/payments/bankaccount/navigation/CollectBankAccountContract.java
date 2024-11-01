package com.stripe.android.payments.bankaccount.navigation;

import Q5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l3.InterfaceC3322a;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollectBankAccountContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26283a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0533a f26284g = new C0533a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f26285h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f26286a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26287b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26288c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3322a f26289d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26290e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26291f;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0533a {
            private C0533a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }

            public /* synthetic */ C0533a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0534a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26292i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26293j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC3322a f26294k;

            /* renamed from: l, reason: collision with root package name */
            private final String f26295l;

            /* renamed from: m, reason: collision with root package name */
            private final String f26296m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26297n;

            /* renamed from: o, reason: collision with root package name */
            private final String f26298o;

            /* renamed from: p, reason: collision with root package name */
            private final Integer f26299p;

            /* renamed from: q, reason: collision with root package name */
            private final String f26300q;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0534a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString(), (InterfaceC3322a) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, InterfaceC3322a configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(configuration, "configuration");
                AbstractC3292y.i(elementsSessionId, "elementsSessionId");
                this.f26292i = publishableKey;
                this.f26293j = str;
                this.f26294k = configuration;
                this.f26295l = str2;
                this.f26296m = elementsSessionId;
                this.f26297n = str3;
                this.f26298o = str4;
                this.f26299p = num;
                this.f26300q = str5;
            }

            public final String L() {
                return this.f26300q;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3322a b() {
                return this.f26294k;
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
                return AbstractC3292y.d(this.f26292i, bVar.f26292i) && AbstractC3292y.d(this.f26293j, bVar.f26293j) && AbstractC3292y.d(this.f26294k, bVar.f26294k) && AbstractC3292y.d(this.f26295l, bVar.f26295l) && AbstractC3292y.d(this.f26296m, bVar.f26296m) && AbstractC3292y.d(this.f26297n, bVar.f26297n) && AbstractC3292y.d(this.f26298o, bVar.f26298o) && AbstractC3292y.d(this.f26299p, bVar.f26299p) && AbstractC3292y.d(this.f26300q, bVar.f26300q);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f26295l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26292i;
            }

            public int hashCode() {
                int hashCode = this.f26292i.hashCode() * 31;
                String str = this.f26293j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26294k.hashCode()) * 31;
                String str2 = this.f26295l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26296m.hashCode()) * 31;
                String str3 = this.f26297n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f26298o;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.f26299p;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.f26300q;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26293j;
            }

            public final Integer l() {
                return this.f26299p;
            }

            public final String p() {
                return this.f26297n;
            }

            public final String s() {
                return this.f26296m;
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.f26292i + ", stripeAccountId=" + this.f26293j + ", configuration=" + this.f26294k + ", hostedSurface=" + this.f26295l + ", elementsSessionId=" + this.f26296m + ", customerId=" + this.f26297n + ", onBehalfOf=" + this.f26298o + ", amount=" + this.f26299p + ", currency=" + this.f26300q + ")";
            }

            public final String u() {
                return this.f26298o;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26292i);
                out.writeString(this.f26293j);
                out.writeParcelable(this.f26294k, i8);
                out.writeString(this.f26295l);
                out.writeString(this.f26296m);
                out.writeString(this.f26297n);
                out.writeString(this.f26298o);
                Integer num = this.f26299p;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
                out.writeString(this.f26300q);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0535a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26301i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26302j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC3322a f26303k;

            /* renamed from: l, reason: collision with root package name */
            private final String f26304l;

            /* renamed from: m, reason: collision with root package name */
            private final String f26305m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26306n;

            /* renamed from: o, reason: collision with root package name */
            private final String f26307o;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0535a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), (InterfaceC3322a) parcel.readParcelable(c.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, InterfaceC3322a configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(configuration, "configuration");
                AbstractC3292y.i(elementsSessionId, "elementsSessionId");
                this.f26301i = publishableKey;
                this.f26302j = str;
                this.f26303k = configuration;
                this.f26304l = str2;
                this.f26305m = elementsSessionId;
                this.f26306n = str3;
                this.f26307o = str4;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3322a b() {
                return this.f26303k;
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
                return AbstractC3292y.d(this.f26301i, cVar.f26301i) && AbstractC3292y.d(this.f26302j, cVar.f26302j) && AbstractC3292y.d(this.f26303k, cVar.f26303k) && AbstractC3292y.d(this.f26304l, cVar.f26304l) && AbstractC3292y.d(this.f26305m, cVar.f26305m) && AbstractC3292y.d(this.f26306n, cVar.f26306n) && AbstractC3292y.d(this.f26307o, cVar.f26307o);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f26304l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26301i;
            }

            public int hashCode() {
                int hashCode = this.f26301i.hashCode() * 31;
                String str = this.f26302j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26303k.hashCode()) * 31;
                String str2 = this.f26304l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26305m.hashCode()) * 31;
                String str3 = this.f26306n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f26307o;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26302j;
            }

            public final String l() {
                return this.f26306n;
            }

            public final String p() {
                return this.f26305m;
            }

            public final String s() {
                return this.f26307o;
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.f26301i + ", stripeAccountId=" + this.f26302j + ", configuration=" + this.f26303k + ", hostedSurface=" + this.f26304l + ", elementsSessionId=" + this.f26305m + ", customerId=" + this.f26306n + ", onBehalfOf=" + this.f26307o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26301i);
                out.writeString(this.f26302j);
                out.writeParcelable(this.f26303k, i8);
                out.writeString(this.f26304l);
                out.writeString(this.f26305m);
                out.writeString(this.f26306n);
                out.writeString(this.f26307o);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0536a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26308i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26309j;

            /* renamed from: k, reason: collision with root package name */
            private final String f26310k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC3322a f26311l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26312m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26313n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0536a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3322a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(clientSecret, "clientSecret");
                AbstractC3292y.i(configuration, "configuration");
                this.f26308i = publishableKey;
                this.f26309j = str;
                this.f26310k = clientSecret;
                this.f26311l = configuration;
                this.f26312m = z8;
                this.f26313n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean a() {
                return this.f26312m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3322a b() {
                return this.f26311l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f26310k;
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
                return AbstractC3292y.d(this.f26308i, dVar.f26308i) && AbstractC3292y.d(this.f26309j, dVar.f26309j) && AbstractC3292y.d(this.f26310k, dVar.f26310k) && AbstractC3292y.d(this.f26311l, dVar.f26311l) && this.f26312m == dVar.f26312m && AbstractC3292y.d(this.f26313n, dVar.f26313n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f26313n;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26308i;
            }

            public int hashCode() {
                int hashCode = this.f26308i.hashCode() * 31;
                String str = this.f26309j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26310k.hashCode()) * 31) + this.f26311l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26312m)) * 31;
                String str2 = this.f26313n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26309j;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.f26308i + ", stripeAccountId=" + this.f26309j + ", clientSecret=" + this.f26310k + ", configuration=" + this.f26311l + ", attachToIntent=" + this.f26312m + ", hostedSurface=" + this.f26313n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26308i);
                out.writeString(this.f26309j);
                out.writeString(this.f26310k);
                out.writeParcelable(this.f26311l, i8);
                out.writeInt(this.f26312m ? 1 : 0);
                out.writeString(this.f26313n);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {
            public static final Parcelable.Creator<e> CREATOR = new C0537a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26314i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26315j;

            /* renamed from: k, reason: collision with root package name */
            private final String f26316k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC3322a f26317l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26318m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26319n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0537a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new e(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC3322a) parcel.readParcelable(e.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String publishableKey, String str, String clientSecret, InterfaceC3322a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(clientSecret, "clientSecret");
                AbstractC3292y.i(configuration, "configuration");
                this.f26314i = publishableKey;
                this.f26315j = str;
                this.f26316k = clientSecret;
                this.f26317l = configuration;
                this.f26318m = z8;
                this.f26319n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean a() {
                return this.f26318m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC3322a b() {
                return this.f26317l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f26316k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC3292y.d(this.f26314i, eVar.f26314i) && AbstractC3292y.d(this.f26315j, eVar.f26315j) && AbstractC3292y.d(this.f26316k, eVar.f26316k) && AbstractC3292y.d(this.f26317l, eVar.f26317l) && this.f26318m == eVar.f26318m && AbstractC3292y.d(this.f26319n, eVar.f26319n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f26319n;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String h() {
                return this.f26314i;
            }

            public int hashCode() {
                int hashCode = this.f26314i.hashCode() * 31;
                String str = this.f26315j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26316k.hashCode()) * 31) + this.f26317l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26318m)) * 31;
                String str2 = this.f26319n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f26315j;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.f26314i + ", stripeAccountId=" + this.f26315j + ", clientSecret=" + this.f26316k + ", configuration=" + this.f26317l + ", attachToIntent=" + this.f26318m + ", hostedSurface=" + this.f26319n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26314i);
                out.writeString(this.f26315j);
                out.writeString(this.f26316k);
                out.writeParcelable(this.f26317l, i8);
                out.writeInt(this.f26318m ? 1 : 0);
                out.writeString(this.f26319n);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, InterfaceC3322a interfaceC3322a, boolean z8, String str4, AbstractC3284p abstractC3284p) {
            this(str, str2, str3, interfaceC3322a, z8, str4);
        }

        public boolean a() {
            return this.f26290e;
        }

        public abstract InterfaceC3322a b();

        public String d() {
            return this.f26288c;
        }

        public abstract String f();

        public abstract String h();

        public abstract String i();

        private a(String str, String str2, String str3, InterfaceC3322a interfaceC3322a, boolean z8, String str4) {
            this.f26286a = str;
            this.f26287b = str2;
            this.f26288c = str3;
            this.f26289d = interfaceC3322a;
            this.f26290e = z8;
            this.f26291f = str4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f26320a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((d) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(d collectBankAccountResult) {
            AbstractC3292y.i(collectBankAccountResult, "collectBankAccountResult");
            this.f26320a = collectBankAccountResult;
        }

        public final d a() {
            return this.f26320a;
        }

        public final Bundle b() {
            return BundleKt.bundleOf(x.a("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26320a, ((c) obj).f26320a);
        }

        public int hashCode() {
            return this.f26320a.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.f26320a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26320a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        d dVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) != null) {
            dVar = cVar.a();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return new d.c(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult."));
        }
        return dVar;
    }
}

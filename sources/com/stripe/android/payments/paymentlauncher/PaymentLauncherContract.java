package com.stripe.android.payments.paymentlauncher;

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
import g3.InterfaceC2910i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentLauncherContract extends ActivityResultContract<a, com.stripe.android.payments.paymentlauncher.a> {

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0549a f26494g = new C0549a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f26495h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f26496a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26497b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26498c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f26499d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26500e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f26501f;

        /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0549a {
            private C0549a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0549a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0550a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26502i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26503j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26504k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26505l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26506m;

            /* renamed from: n, reason: collision with root package name */
            private final InterfaceC2910i f26507n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26508o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0550a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new b(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, (InterfaceC2910i) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, InterfaceC2910i confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(productUsage, "productUsage");
                AbstractC3292y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.f26502i = publishableKey;
                this.f26503j = str;
                this.f26504k = z8;
                this.f26505l = productUsage;
                this.f26506m = z9;
                this.f26507n = confirmStripeIntentParams;
                this.f26508o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26504k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26506m;
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
                return AbstractC3292y.d(this.f26502i, bVar.f26502i) && AbstractC3292y.d(this.f26503j, bVar.f26503j) && this.f26504k == bVar.f26504k && AbstractC3292y.d(this.f26505l, bVar.f26505l) && this.f26506m == bVar.f26506m && AbstractC3292y.d(this.f26507n, bVar.f26507n) && AbstractC3292y.d(this.f26508o, bVar.f26508o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set f() {
                return this.f26505l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26502i;
            }

            public int hashCode() {
                int hashCode = this.f26502i.hashCode() * 31;
                String str = this.f26503j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26504k)) * 31) + this.f26505l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26506m)) * 31) + this.f26507n.hashCode()) * 31;
                Integer num = this.f26508o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26508o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26503j;
            }

            public final InterfaceC2910i s() {
                return this.f26507n;
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.f26502i + ", stripeAccountId=" + this.f26503j + ", enableLogging=" + this.f26504k + ", productUsage=" + this.f26505l + ", includePaymentSheetNextHandlers=" + this.f26506m + ", confirmStripeIntentParams=" + this.f26507n + ", statusBarColor=" + this.f26508o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26502i);
                out.writeString(this.f26503j);
                out.writeInt(this.f26504k ? 1 : 0);
                Set set = this.f26505l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26506m ? 1 : 0);
                out.writeParcelable(this.f26507n, i8);
                Integer num = this.f26508o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0551a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26509i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26510j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26511k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26512l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26513m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26514n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26515o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0551a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String paymentIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(productUsage, "productUsage");
                AbstractC3292y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.f26509i = publishableKey;
                this.f26510j = str;
                this.f26511k = z8;
                this.f26512l = productUsage;
                this.f26513m = z9;
                this.f26514n = paymentIntentClientSecret;
                this.f26515o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26511k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26513m;
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
                return AbstractC3292y.d(this.f26509i, cVar.f26509i) && AbstractC3292y.d(this.f26510j, cVar.f26510j) && this.f26511k == cVar.f26511k && AbstractC3292y.d(this.f26512l, cVar.f26512l) && this.f26513m == cVar.f26513m && AbstractC3292y.d(this.f26514n, cVar.f26514n) && AbstractC3292y.d(this.f26515o, cVar.f26515o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set f() {
                return this.f26512l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26509i;
            }

            public int hashCode() {
                int hashCode = this.f26509i.hashCode() * 31;
                String str = this.f26510j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26511k)) * 31) + this.f26512l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26513m)) * 31) + this.f26514n.hashCode()) * 31;
                Integer num = this.f26515o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26515o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26510j;
            }

            public final String s() {
                return this.f26514n;
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.f26509i + ", stripeAccountId=" + this.f26510j + ", enableLogging=" + this.f26511k + ", productUsage=" + this.f26512l + ", includePaymentSheetNextHandlers=" + this.f26513m + ", paymentIntentClientSecret=" + this.f26514n + ", statusBarColor=" + this.f26515o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26509i);
                out.writeString(this.f26510j);
                out.writeInt(this.f26511k ? 1 : 0);
                Set set = this.f26512l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26513m ? 1 : 0);
                out.writeString(this.f26514n);
                Integer num = this.f26515o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0552a();

            /* renamed from: i, reason: collision with root package name */
            private final String f26516i;

            /* renamed from: j, reason: collision with root package name */
            private final String f26517j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f26518k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f26519l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f26520m;

            /* renamed from: n, reason: collision with root package name */
            private final String f26521n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f26522o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0552a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new d(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String setupIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3292y.i(publishableKey, "publishableKey");
                AbstractC3292y.i(productUsage, "productUsage");
                AbstractC3292y.i(setupIntentClientSecret, "setupIntentClientSecret");
                this.f26516i = publishableKey;
                this.f26517j = str;
                this.f26518k = z8;
                this.f26519l = productUsage;
                this.f26520m = z9;
                this.f26521n = setupIntentClientSecret;
                this.f26522o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean a() {
                return this.f26518k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f26520m;
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
                return AbstractC3292y.d(this.f26516i, dVar.f26516i) && AbstractC3292y.d(this.f26517j, dVar.f26517j) && this.f26518k == dVar.f26518k && AbstractC3292y.d(this.f26519l, dVar.f26519l) && this.f26520m == dVar.f26520m && AbstractC3292y.d(this.f26521n, dVar.f26521n) && AbstractC3292y.d(this.f26522o, dVar.f26522o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set f() {
                return this.f26519l;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String h() {
                return this.f26516i;
            }

            public int hashCode() {
                int hashCode = this.f26516i.hashCode() * 31;
                String str = this.f26517j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26518k)) * 31) + this.f26519l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26520m)) * 31) + this.f26521n.hashCode()) * 31;
                Integer num = this.f26522o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f26522o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String l() {
                return this.f26517j;
            }

            public final String s() {
                return this.f26521n;
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.f26516i + ", stripeAccountId=" + this.f26517j + ", enableLogging=" + this.f26518k + ", productUsage=" + this.f26519l + ", includePaymentSheetNextHandlers=" + this.f26520m + ", setupIntentClientSecret=" + this.f26521n + ", statusBarColor=" + this.f26522o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3292y.i(out, "out");
                out.writeString(this.f26516i);
                out.writeString(this.f26517j);
                out.writeInt(this.f26518k ? 1 : 0);
                Set set = this.f26519l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f26520m ? 1 : 0);
                out.writeString(this.f26521n);
                Integer num = this.f26522o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        public /* synthetic */ a(String str, String str2, boolean z8, Set set, boolean z9, Integer num, AbstractC3284p abstractC3284p) {
            this(str, str2, z8, set, z9, num);
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract Set f();

        public abstract String h();

        public abstract Integer i();

        public abstract String l();

        public final Bundle p() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        private a(String str, String str2, boolean z8, Set set, boolean z9, Integer num) {
            this.f26496a = str;
            this.f26497b = str2;
            this.f26498c = z8;
            this.f26499d = set;
            this.f26500e = z9;
            this.f26501f = num;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.p());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.a parseResult(int i8, Intent intent) {
        return com.stripe.android.payments.paymentlauncher.a.f26523a.a(intent);
    }
}

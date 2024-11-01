package com.stripe.android.auth;

import Q5.p;
import Q5.x;
import Y3.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import k3.C3235a;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentBrowserAuthContract extends ActivityResultContract<a, C3237c> {

    /* renamed from: a */
    public static final b f24688a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final a a(Intent intent) {
            AbstractC3292y.i(intent, "intent");
            return (a) intent.getParcelableExtra("extra_args");
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a */
    public Intent createIntent(Context context, a input) {
        boolean z8;
        Class cls;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        C3235a a9 = C3235a.f34401b.a(context);
        if (!input.h() && (input.z(a9) || input.I())) {
            z8 = true;
        } else {
            z8 = false;
        }
        Bundle Q8 = input.Q();
        if (z8) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z8) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new p();
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(Q8);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b */
    public C3237c parseResult(int i8, Intent intent) {
        C3237c c3237c;
        if (intent != null) {
            c3237c = (C3237c) intent.getParcelableExtra("extra_args");
        } else {
            c3237c = null;
        }
        if (c3237c == null) {
            return new C3237c(null, 0, null, false, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
        }
        return c3237c;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final C0452a CREATOR = new C0452a(null);

        /* renamed from: p */
        public static final int f24689p = 8;

        /* renamed from: a */
        private final String f24690a;

        /* renamed from: b */
        private final int f24691b;

        /* renamed from: c */
        private final String f24692c;

        /* renamed from: d */
        private final String f24693d;

        /* renamed from: e */
        private final String f24694e;

        /* renamed from: f */
        private final boolean f24695f;

        /* renamed from: g */
        private final k f24696g;

        /* renamed from: h */
        private final String f24697h;

        /* renamed from: i */
        private final boolean f24698i;

        /* renamed from: j */
        private final boolean f24699j;

        /* renamed from: k */
        private final Integer f24700k;

        /* renamed from: l */
        private final String f24701l;

        /* renamed from: m */
        private final boolean f24702m;

        /* renamed from: n */
        private final String f24703n;

        /* renamed from: o */
        private final boolean f24704o;

        /* renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$a$a */
        /* loaded from: classes4.dex */
        public static final class C0452a implements Parcelable.Creator {
            private C0452a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public a[] newArray(int i8) {
                return new a[i8];
            }

            public /* synthetic */ C0452a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public a(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3292y.i(objectId, "objectId");
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(url, "url");
            AbstractC3292y.i(publishableKey, "publishableKey");
            this.f24690a = objectId;
            this.f24691b = i8;
            this.f24692c = clientSecret;
            this.f24693d = url;
            this.f24694e = str;
            this.f24695f = z8;
            this.f24696g = kVar;
            this.f24697h = str2;
            this.f24698i = z9;
            this.f24699j = z10;
            this.f24700k = num;
            this.f24701l = publishableKey;
            this.f24702m = z11;
            this.f24703n = str3;
            this.f24704o = z12;
        }

        public static /* synthetic */ a b(a aVar, String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, Object obj) {
            return aVar.a((i9 & 1) != 0 ? aVar.f24690a : str, (i9 & 2) != 0 ? aVar.f24691b : i8, (i9 & 4) != 0 ? aVar.f24692c : str2, (i9 & 8) != 0 ? aVar.f24693d : str3, (i9 & 16) != 0 ? aVar.f24694e : str4, (i9 & 32) != 0 ? aVar.f24695f : z8, (i9 & 64) != 0 ? aVar.f24696g : kVar, (i9 & 128) != 0 ? aVar.f24697h : str5, (i9 & 256) != 0 ? aVar.f24698i : z9, (i9 & 512) != 0 ? aVar.f24699j : z10, (i9 & 1024) != 0 ? aVar.f24700k : num, (i9 & 2048) != 0 ? aVar.f24701l : str6, (i9 & 4096) != 0 ? aVar.f24702m : z11, (i9 & 8192) != 0 ? aVar.f24703n : str7, (i9 & 16384) != 0 ? aVar.f24704o : z12);
        }

        public final String A() {
            return this.f24694e;
        }

        public final boolean I() {
            return this.f24702m;
        }

        public final Bundle Q() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public final a a(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3292y.i(objectId, "objectId");
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(url, "url");
            AbstractC3292y.i(publishableKey, "publishableKey");
            return new a(objectId, i8, clientSecret, url, str, z8, kVar, str2, z9, z10, num, publishableKey, z11, str3, z12);
        }

        public final String d() {
            return this.f24692c;
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
            return AbstractC3292y.d(this.f24690a, aVar.f24690a) && this.f24691b == aVar.f24691b && AbstractC3292y.d(this.f24692c, aVar.f24692c) && AbstractC3292y.d(this.f24693d, aVar.f24693d) && AbstractC3292y.d(this.f24694e, aVar.f24694e) && this.f24695f == aVar.f24695f && AbstractC3292y.d(this.f24696g, aVar.f24696g) && AbstractC3292y.d(this.f24697h, aVar.f24697h) && this.f24698i == aVar.f24698i && this.f24699j == aVar.f24699j && AbstractC3292y.d(this.f24700k, aVar.f24700k) && AbstractC3292y.d(this.f24701l, aVar.f24701l) && this.f24702m == aVar.f24702m && AbstractC3292y.d(this.f24703n, aVar.f24703n) && this.f24704o == aVar.f24704o;
        }

        public final boolean f() {
            return this.f24695f;
        }

        public final boolean h() {
            return this.f24704o;
        }

        public int hashCode() {
            int hashCode = ((((((this.f24690a.hashCode() * 31) + this.f24691b) * 31) + this.f24692c.hashCode()) * 31) + this.f24693d.hashCode()) * 31;
            String str = this.f24694e;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24695f)) * 31;
            k kVar = this.f24696g;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            String str2 = this.f24697h;
            int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24698i)) * 31) + androidx.compose.foundation.a.a(this.f24699j)) * 31;
            Integer num = this.f24700k;
            int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f24701l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24702m)) * 31;
            String str3 = this.f24703n;
            return ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f24704o);
        }

        public final String i() {
            return this.f24701l;
        }

        public final String l() {
            return this.f24703n;
        }

        public final int p() {
            return this.f24691b;
        }

        public final boolean s() {
            return this.f24699j;
        }

        public String toString() {
            return "Args(objectId=" + this.f24690a + ", requestCode=" + this.f24691b + ", clientSecret=" + this.f24692c + ", url=" + this.f24693d + ", returnUrl=" + this.f24694e + ", enableLogging=" + this.f24695f + ", toolbarCustomization=" + this.f24696g + ", stripeAccountId=" + this.f24697h + ", shouldCancelSource=" + this.f24698i + ", shouldCancelIntentOnUserNavigation=" + this.f24699j + ", statusBarColor=" + this.f24700k + ", publishableKey=" + this.f24701l + ", isInstantApp=" + this.f24702m + ", referrer=" + this.f24703n + ", forceInAppWebView=" + this.f24704o + ")";
        }

        public final boolean u() {
            return this.f24698i;
        }

        public final Integer v() {
            return this.f24700k;
        }

        public final String w() {
            return this.f24697h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            AbstractC3292y.i(parcel, "parcel");
            parcel.writeString(this.f24690a);
            parcel.writeInt(this.f24691b);
            parcel.writeString(this.f24692c);
            parcel.writeString(this.f24693d);
            parcel.writeString(this.f24694e);
            parcel.writeByte(this.f24695f ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f24696g, i8);
            parcel.writeString(this.f24697h);
            parcel.writeByte(this.f24698i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24699j ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.f24700k);
            parcel.writeString(this.f24701l);
            parcel.writeByte(this.f24702m ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f24703n);
            parcel.writeByte(this.f24704o ? (byte) 1 : (byte) 0);
        }

        public final k x() {
            return this.f24696g;
        }

        public final String y() {
            return this.f24693d;
        }

        public final boolean z(C3235a defaultReturnUrl) {
            AbstractC3292y.i(defaultReturnUrl, "defaultReturnUrl");
            return AbstractC3292y.d(this.f24694e, defaultReturnUrl.a());
        }

        public /* synthetic */ a(String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, AbstractC3284p abstractC3284p) {
            this(str, i8, str2, str3, (i9 & 16) != 0 ? null : str4, (i9 & 32) != 0 ? false : z8, (i9 & 64) != 0 ? null : kVar, (i9 & 128) != 0 ? null : str5, (i9 & 256) != 0 ? false : z9, (i9 & 512) != 0 ? true : z10, num, str6, z11, (i9 & 8192) != 0 ? null : str7, (i9 & 16384) != 0 ? false : z12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.os.Parcel r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.AbstractC3292y.i(r0, r1)
                java.lang.String r1 = r20.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L11
                r4 = r2
                goto L12
            L11:
                r4 = r1
            L12:
                int r5 = r20.readInt()
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L1e
                r6 = r2
                goto L1f
            L1e:
                r6 = r1
            L1f:
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L27
                r7 = r2
                goto L28
            L27:
                r7 = r1
            L28:
                java.lang.String r8 = r20.readString()
                byte r1 = r20.readByte()
                r3 = 0
                r9 = 1
                if (r1 == 0) goto L36
                r1 = 1
                goto L37
            L36:
                r1 = 0
            L37:
                java.lang.Class<Y3.k> r10 = Y3.k.class
                java.lang.ClassLoader r10 = r10.getClassLoader()
                android.os.Parcelable r10 = r0.readParcelable(r10)
                Y3.k r10 = (Y3.k) r10
                java.lang.String r11 = r20.readString()
                byte r12 = r20.readByte()
                if (r12 == 0) goto L4f
                r12 = 1
                goto L50
            L4f:
                r12 = 0
            L50:
                byte r13 = r20.readByte()
                if (r13 == 0) goto L58
                r13 = 1
                goto L59
            L58:
                r13 = 0
            L59:
                java.lang.Class r14 = java.lang.Integer.TYPE
                java.lang.ClassLoader r14 = r14.getClassLoader()
                java.lang.Object r14 = r0.readValue(r14)
                boolean r15 = r14 instanceof java.lang.Integer
                if (r15 == 0) goto L6a
                java.lang.Integer r14 = (java.lang.Integer) r14
                goto L6b
            L6a:
                r14 = 0
            L6b:
                java.lang.String r15 = r20.readString()
                if (r15 != 0) goto L72
                r15 = r2
            L72:
                byte r2 = r20.readByte()
                if (r2 == 0) goto L7b
                r16 = 1
                goto L7d
            L7b:
                r16 = 0
            L7d:
                java.lang.String r17 = r20.readString()
                byte r0 = r20.readByte()
                if (r0 == 0) goto L8a
                r18 = 1
                goto L8c
            L8a:
                r18 = 0
            L8c:
                r3 = r19
                r9 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.a.<init>(android.os.Parcel):void");
        }
    }
}

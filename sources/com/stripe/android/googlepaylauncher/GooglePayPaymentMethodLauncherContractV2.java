package com.stripe.android.googlepaylauncher;

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
import com.stripe.android.googlepaylauncher.j;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<a, j.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25036a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(input.l());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.f parseResult(int i8, Intent intent) {
        j.f fVar;
        if (intent != null) {
            fVar = (j.f) intent.getParcelableExtra("extra_result");
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return new j.f.c(new IllegalArgumentException("Could not parse a valid result."), 1);
        }
        return fVar;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final j.d f25039a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25040b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25041c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25042d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25043e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0468a f25037f = new C0468a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f25038g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0468a {
            private C0468a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0468a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(j.d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(j.d config, String currencyCode, long j8, String str, String str2) {
            AbstractC3292y.i(config, "config");
            AbstractC3292y.i(currencyCode, "currencyCode");
            this.f25039a = config;
            this.f25040b = currencyCode;
            this.f25041c = j8;
            this.f25042d = str;
            this.f25043e = str2;
        }

        public final long a() {
            return this.f25041c;
        }

        public final j.d b() {
            return this.f25039a;
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
            return AbstractC3292y.d(this.f25039a, aVar.f25039a) && AbstractC3292y.d(this.f25040b, aVar.f25040b) && this.f25041c == aVar.f25041c && AbstractC3292y.d(this.f25042d, aVar.f25042d) && AbstractC3292y.d(this.f25043e, aVar.f25043e);
        }

        public final String f() {
            return this.f25040b;
        }

        public final String h() {
            return this.f25042d;
        }

        public int hashCode() {
            int hashCode = ((((this.f25039a.hashCode() * 31) + this.f25040b.hashCode()) * 31) + androidx.collection.a.a(this.f25041c)) * 31;
            String str = this.f25042d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25043e;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.f25043e;
        }

        public final Bundle l() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public String toString() {
            return "Args(config=" + this.f25039a + ", currencyCode=" + this.f25040b + ", amount=" + this.f25041c + ", label=" + this.f25042d + ", transactionId=" + this.f25043e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25039a.writeToParcel(out, i8);
            out.writeString(this.f25040b);
            out.writeLong(this.f25041c);
            out.writeString(this.f25042d);
            out.writeString(this.f25043e);
        }

        public /* synthetic */ a(j.d dVar, String str, long j8, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this(dVar, str, j8, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }
}

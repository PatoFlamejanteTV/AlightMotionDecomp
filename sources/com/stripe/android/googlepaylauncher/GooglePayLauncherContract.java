package com.stripe.android.googlepaylauncher;

import Q5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<a, h> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24992a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0465a f24993a = new C0465a(null);

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0465a {
            private C0465a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0465a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private a() {
        }

        public abstract String a();

        public abstract g b();

        public final Bundle f() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
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
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f24994b;

        /* renamed from: c, reason: collision with root package name */
        private final g f24995c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24996d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), g.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String clientSecret, g config, String str) {
            super(null);
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(config, "config");
            this.f24994b = clientSecret;
            this.f24995c = config;
            this.f24996d = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String a() {
            return this.f24994b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public g b() {
            return this.f24995c;
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
            return AbstractC3292y.d(this.f24994b, cVar.f24994b) && AbstractC3292y.d(this.f24995c, cVar.f24995c) && AbstractC3292y.d(this.f24996d, cVar.f24996d);
        }

        public final String h() {
            return this.f24996d;
        }

        public int hashCode() {
            int hashCode = ((this.f24994b.hashCode() * 31) + this.f24995c.hashCode()) * 31;
            String str = this.f24996d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.f24994b + ", config=" + this.f24995c + ", label=" + this.f24996d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f24994b);
            this.f24995c.writeToParcel(out, i8);
            out.writeString(this.f24996d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f24997b;

        /* renamed from: c, reason: collision with root package name */
        private final g f24998c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24999d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f25000e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25001f;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), g.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String clientSecret, g config, String currencyCode, Long l8, String str) {
            super(null);
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(config, "config");
            AbstractC3292y.i(currencyCode, "currencyCode");
            this.f24997b = clientSecret;
            this.f24998c = config;
            this.f24999d = currencyCode;
            this.f25000e = l8;
            this.f25001f = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String a() {
            return this.f24997b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public g b() {
            return this.f24998c;
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
            return AbstractC3292y.d(this.f24997b, dVar.f24997b) && AbstractC3292y.d(this.f24998c, dVar.f24998c) && AbstractC3292y.d(this.f24999d, dVar.f24999d) && AbstractC3292y.d(this.f25000e, dVar.f25000e) && AbstractC3292y.d(this.f25001f, dVar.f25001f);
        }

        public final Long h() {
            return this.f25000e;
        }

        public int hashCode() {
            int hashCode = ((((this.f24997b.hashCode() * 31) + this.f24998c.hashCode()) * 31) + this.f24999d.hashCode()) * 31;
            Long l8 = this.f25000e;
            int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str = this.f25001f;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String i() {
            return this.f24999d;
        }

        public final String l() {
            return this.f25001f;
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.f24997b + ", config=" + this.f24998c + ", currencyCode=" + this.f24999d + ", amount=" + this.f25000e + ", label=" + this.f25001f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f24997b);
            this.f24998c.writeToParcel(out, i8);
            out.writeString(this.f24999d);
            Long l8 = this.f25000e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f25001f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.f());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h parseResult(int i8, Intent intent) {
        h hVar;
        if (intent != null) {
            hVar = (h) intent.getParcelableExtra("extra_result");
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return new h.c(new IllegalStateException("Error while processing result from Google Pay."));
        }
        return hVar;
    }
}

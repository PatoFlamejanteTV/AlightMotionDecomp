package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherContract extends ActivityResultContract<a, j.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25023a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final j.d f25026a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25027b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25028c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25029d;

        /* renamed from: e, reason: collision with root package name */
        private final c f25030e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0466a f25024f = new C0466a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f25025g = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0466a {
            private C0466a() {
            }

            public /* synthetic */ C0466a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(j.d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new C0467a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25031a;

            /* renamed from: b, reason: collision with root package name */
            private final Set f25032b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f25033c;

            /* renamed from: d, reason: collision with root package name */
            private final String f25034d;

            /* renamed from: e, reason: collision with root package name */
            private final String f25035e;

            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0467a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(readString, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String injectorKey, Set productUsage, boolean z8, String publishableKey, String str) {
                AbstractC3292y.i(injectorKey, "injectorKey");
                AbstractC3292y.i(productUsage, "productUsage");
                AbstractC3292y.i(publishableKey, "publishableKey");
                this.f25031a = injectorKey;
                this.f25032b = productUsage;
                this.f25033c = z8;
                this.f25034d = publishableKey;
                this.f25035e = str;
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
                return AbstractC3292y.d(this.f25031a, cVar.f25031a) && AbstractC3292y.d(this.f25032b, cVar.f25032b) && this.f25033c == cVar.f25033c && AbstractC3292y.d(this.f25034d, cVar.f25034d) && AbstractC3292y.d(this.f25035e, cVar.f25035e);
            }

            public int hashCode() {
                int hashCode = ((((((this.f25031a.hashCode() * 31) + this.f25032b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25033c)) * 31) + this.f25034d.hashCode()) * 31;
                String str = this.f25035e;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.f25031a + ", productUsage=" + this.f25032b + ", enableLogging=" + this.f25033c + ", publishableKey=" + this.f25034d + ", stripeAccountId=" + this.f25035e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25031a);
                Set set = this.f25032b;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25033c ? 1 : 0);
                out.writeString(this.f25034d);
                out.writeString(this.f25035e);
            }
        }

        public a(j.d config, String currencyCode, int i8, String str, c cVar) {
            AbstractC3292y.i(config, "config");
            AbstractC3292y.i(currencyCode, "currencyCode");
            this.f25026a = config;
            this.f25027b = currencyCode;
            this.f25028c = i8;
            this.f25029d = str;
            this.f25030e = cVar;
        }

        public final int a() {
            return this.f25028c;
        }

        public final j.d b() {
            return this.f25026a;
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
            return AbstractC3292y.d(this.f25026a, aVar.f25026a) && AbstractC3292y.d(this.f25027b, aVar.f25027b) && this.f25028c == aVar.f25028c && AbstractC3292y.d(this.f25029d, aVar.f25029d) && AbstractC3292y.d(this.f25030e, aVar.f25030e);
        }

        public final String f() {
            return this.f25027b;
        }

        public final String h() {
            return this.f25029d;
        }

        public int hashCode() {
            int hashCode = ((((this.f25026a.hashCode() * 31) + this.f25027b.hashCode()) * 31) + this.f25028c) * 31;
            String str = this.f25029d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f25030e;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.f25026a + ", currencyCode=" + this.f25027b + ", amount=" + this.f25028c + ", transactionId=" + this.f25029d + ", injectionParams=" + this.f25030e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25026a.writeToParcel(out, i8);
            out.writeString(this.f25027b);
            out.writeInt(this.f25028c);
            out.writeString(this.f25029d);
            c cVar = this.f25030e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
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

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        GooglePayPaymentMethodLauncherContractV2.a b9;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent intent = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class);
        b9 = k.b(input);
        Intent putExtras = intent.putExtras(b9.l());
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
}

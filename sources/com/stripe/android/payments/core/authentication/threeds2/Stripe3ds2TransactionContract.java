package com.stripe.android.payments.core.authentication.threeds2;

import B2.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import c4.q;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.p;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<a, C3237c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final q f26415a;

        /* renamed from: b, reason: collision with root package name */
        private final p.c f26416b;

        /* renamed from: c, reason: collision with root package name */
        private final StripeIntent f26417c;

        /* renamed from: d, reason: collision with root package name */
        private final StripeIntent.a.j.b f26418d;

        /* renamed from: e, reason: collision with root package name */
        private final j.c f26419e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f26420f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f26421g;

        /* renamed from: h, reason: collision with root package name */
        private final String f26422h;

        /* renamed from: i, reason: collision with root package name */
        private final Set f26423i;

        /* renamed from: j, reason: collision with root package name */
        public static final C0546a f26413j = new C0546a(null);

        /* renamed from: k, reason: collision with root package name */
        public static final int f26414k = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0546a {
            private C0546a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0546a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                q qVar = (q) parcel.readParcelable(a.class.getClassLoader());
                p.c createFromParcel = p.c.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(a.class.getClassLoader());
                StripeIntent.a.j.b createFromParcel2 = StripeIntent.a.j.b.CREATOR.createFromParcel(parcel);
                j.c cVar = (j.c) parcel.readParcelable(a.class.getClassLoader());
                boolean z8 = parcel.readInt() != 0;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(qVar, createFromParcel, stripeIntent, createFromParcel2, cVar, z8, valueOf, readString, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(q sdkTransactionId, p.c config, StripeIntent stripeIntent, StripeIntent.a.j.b nextActionData, j.c requestOptions, boolean z8, Integer num, String publishableKey, Set productUsage) {
            AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
            AbstractC3292y.i(config, "config");
            AbstractC3292y.i(stripeIntent, "stripeIntent");
            AbstractC3292y.i(nextActionData, "nextActionData");
            AbstractC3292y.i(requestOptions, "requestOptions");
            AbstractC3292y.i(publishableKey, "publishableKey");
            AbstractC3292y.i(productUsage, "productUsage");
            this.f26415a = sdkTransactionId;
            this.f26416b = config;
            this.f26417c = stripeIntent;
            this.f26418d = nextActionData;
            this.f26419e = requestOptions;
            this.f26420f = z8;
            this.f26421g = num;
            this.f26422h = publishableKey;
            this.f26423i = productUsage;
        }

        public final p.c a() {
            return this.f26416b;
        }

        public final boolean b() {
            return this.f26420f;
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
            return AbstractC3292y.d(this.f26415a, aVar.f26415a) && AbstractC3292y.d(this.f26416b, aVar.f26416b) && AbstractC3292y.d(this.f26417c, aVar.f26417c) && AbstractC3292y.d(this.f26418d, aVar.f26418d) && AbstractC3292y.d(this.f26419e, aVar.f26419e) && this.f26420f == aVar.f26420f && AbstractC3292y.d(this.f26421g, aVar.f26421g) && AbstractC3292y.d(this.f26422h, aVar.f26422h) && AbstractC3292y.d(this.f26423i, aVar.f26423i);
        }

        public final x f() {
            return new x(this.f26418d);
        }

        public final StripeIntent.a.j.b h() {
            return this.f26418d;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f26415a.hashCode() * 31) + this.f26416b.hashCode()) * 31) + this.f26417c.hashCode()) * 31) + this.f26418d.hashCode()) * 31) + this.f26419e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26420f)) * 31;
            Integer num = this.f26421g;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f26422h.hashCode()) * 31) + this.f26423i.hashCode();
        }

        public final Set i() {
            return this.f26423i;
        }

        public final String l() {
            return this.f26422h;
        }

        public final j.c p() {
            return this.f26419e;
        }

        public final q s() {
            return this.f26415a;
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.f26415a + ", config=" + this.f26416b + ", stripeIntent=" + this.f26417c + ", nextActionData=" + this.f26418d + ", requestOptions=" + this.f26419e + ", enableLogging=" + this.f26420f + ", statusBarColor=" + this.f26421g + ", publishableKey=" + this.f26422h + ", productUsage=" + this.f26423i + ")";
        }

        public final Integer u() {
            return this.f26421g;
        }

        public final StripeIntent v() {
            return this.f26417c;
        }

        public final Bundle w() {
            return BundleKt.bundleOf(Q5.x.a("extra_args", this));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26415a, i8);
            this.f26416b.writeToParcel(out, i8);
            out.writeParcelable(this.f26417c, i8);
            this.f26418d.writeToParcel(out, i8);
            out.writeParcelable(this.f26419e, i8);
            out.writeInt(this.f26420f ? 1 : 0);
            Integer num = this.f26421g;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.f26422h);
            Set set = this.f26423i;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.w());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3237c parseResult(int i8, Intent intent) {
        return C3237c.f34404h.b(intent);
    }
}

package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.z;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContractV2 extends ActivityResultContract<a, z> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26816a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final w.l f26819a;

        /* renamed from: b, reason: collision with root package name */
        private final w.g f26820b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f26821c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26822d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0575a f26817e = new C0575a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26818f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0575a {
            private C0575a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
            }

            public /* synthetic */ C0575a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((w.l) parcel.readParcelable(a.class.getClassLoader()), w.g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(w.l initializationMode, w.g config, Integer num, boolean z8) {
            AbstractC3292y.i(initializationMode, "initializationMode");
            AbstractC3292y.i(config, "config");
            this.f26819a = initializationMode;
            this.f26820b = config;
            this.f26821c = num;
            this.f26822d = z8;
        }

        public final w.g a() {
            return this.f26820b;
        }

        public final w.k b() {
            return this.f26820b.u();
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
            return AbstractC3292y.d(this.f26819a, aVar.f26819a) && AbstractC3292y.d(this.f26820b, aVar.f26820b) && AbstractC3292y.d(this.f26821c, aVar.f26821c) && this.f26822d == aVar.f26822d;
        }

        public final w.l f() {
            return this.f26819a;
        }

        public final boolean h() {
            return this.f26822d;
        }

        public int hashCode() {
            int hashCode = ((this.f26819a.hashCode() * 31) + this.f26820b.hashCode()) * 31;
            Integer num = this.f26821c;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26822d);
        }

        public final Integer i() {
            return this.f26821c;
        }

        public String toString() {
            return "Args(initializationMode=" + this.f26819a + ", config=" + this.f26820b + ", statusBarColor=" + this.f26821c + ", initializedViaCompose=" + this.f26822d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26819a, i8);
            this.f26820b.writeToParcel(out, i8);
            Integer num = this.f26821c;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26822d ? 1 : 0);
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
        private final z f26823a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((z) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(z paymentSheetResult) {
            AbstractC3292y.i(paymentSheetResult, "paymentSheetResult");
            this.f26823a = paymentSheetResult;
        }

        public final z a() {
            return this.f26823a;
        }

        public Bundle b() {
            return BundleKt.bundleOf(Q5.x.a("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26823a, ((c) obj).f26823a);
        }

        public int hashCode() {
            return this.f26823a.hashCode();
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.f26823a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26823a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public z parseResult(int i8, Intent intent) {
        z zVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
            zVar = cVar.a();
        } else {
            zVar = null;
        }
        if (zVar == null) {
            return new z.c(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult."));
        }
        return zVar;
    }
}

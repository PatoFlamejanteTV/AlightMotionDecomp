package com.stripe.android.paymentsheet.addresselement;

import Q5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.paymentsheet.addresselement.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddressElementActivityContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26872a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26875a;

        /* renamed from: b, reason: collision with root package name */
        private final w3.e f26876b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0585a f26873c = new C0585a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f26874d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0585a {
            private C0585a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args");
            }

            public /* synthetic */ C0585a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : w3.e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String publishableKey, w3.e eVar) {
            AbstractC3292y.i(publishableKey, "publishableKey");
            this.f26875a = publishableKey;
            this.f26876b = eVar;
        }

        public final w3.e a() {
            return this.f26876b;
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
            return AbstractC3292y.d(this.f26875a, aVar.f26875a) && AbstractC3292y.d(this.f26876b, aVar.f26876b);
        }

        public int hashCode() {
            int hashCode = this.f26875a.hashCode() * 31;
            w3.e eVar = this.f26876b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "Args(publishableKey=" + this.f26875a + ", config=" + this.f26876b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f26875a);
            w3.e eVar = this.f26876b;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i8);
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

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f26877a;

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

        public c(d addressOptionsResult) {
            AbstractC3292y.i(addressOptionsResult, "addressOptionsResult");
            this.f26877a = addressOptionsResult;
        }

        public final d a() {
            return this.f26877a;
        }

        public Bundle b() {
            return BundleKt.bundleOf(x.a("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26877a, ((c) obj).f26877a);
        }

        public int hashCode() {
            return this.f26877a.hashCode();
        }

        public String toString() {
            return "Result(addressOptionsResult=" + this.f26877a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26877a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) AddressElementActivity.class).putExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        c cVar;
        d a9;
        if (intent == null || (cVar = (c) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result")) == null || (a9 = cVar.a()) == null) {
            return d.a.f26891a;
        }
        return a9;
    }
}

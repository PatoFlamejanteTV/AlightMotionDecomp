package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleCompat;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CvcRecollectionContract extends ActivityResultContract<a, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27501a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27503a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2906e f27504b;

        /* renamed from: c, reason: collision with root package name */
        private final w.b f27505c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27506d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0631a f27502e = new C0631a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0631a {
            private C0631a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return (a) BundleCompat.getParcelable(extras, "extra_activity_args", a.class);
                }
                return null;
            }

            public /* synthetic */ C0631a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), EnumC2906e.valueOf(parcel.readString()), w.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String lastFour, EnumC2906e cardBrand, w.b appearance, boolean z8) {
            AbstractC3292y.i(lastFour, "lastFour");
            AbstractC3292y.i(cardBrand, "cardBrand");
            AbstractC3292y.i(appearance, "appearance");
            this.f27503a = lastFour;
            this.f27504b = cardBrand;
            this.f27505c = appearance;
            this.f27506d = z8;
        }

        public final w.b a() {
            return this.f27505c;
        }

        public final EnumC2906e b() {
            return this.f27504b;
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
            return AbstractC3292y.d(this.f27503a, aVar.f27503a) && this.f27504b == aVar.f27504b && AbstractC3292y.d(this.f27505c, aVar.f27505c) && this.f27506d == aVar.f27506d;
        }

        public final String f() {
            return this.f27503a;
        }

        public final boolean h() {
            return this.f27506d;
        }

        public int hashCode() {
            return (((((this.f27503a.hashCode() * 31) + this.f27504b.hashCode()) * 31) + this.f27505c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27506d);
        }

        public String toString() {
            return "Args(lastFour=" + this.f27503a + ", cardBrand=" + this.f27504b + ", appearance=" + this.f27505c + ", isTestMode=" + this.f27506d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27503a);
            out.writeString(this.f27504b.name());
            this.f27505c.writeToParcel(out, i8);
            out.writeInt(this.f27506d ? 1 : 0);
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
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a parseResult(int i8, Intent intent) {
        return com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f27507k0.a(intent);
    }
}

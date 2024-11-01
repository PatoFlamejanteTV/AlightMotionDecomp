package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import Q5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PollingContract extends ActivityResultContract<a, C3237c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27587a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f27588b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27589c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27590d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27591e;

        /* renamed from: f, reason: collision with root package name */
        private final int f27592f;

        /* renamed from: g, reason: collision with root package name */
        public static final C0641a f27586g = new C0641a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0641a {
            private C0641a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0641a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String clientSecret, Integer num, int i8, int i9, int i10, int i11) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            this.f27587a = clientSecret;
            this.f27588b = num;
            this.f27589c = i8;
            this.f27590d = i9;
            this.f27591e = i10;
            this.f27592f = i11;
        }

        public final int a() {
            return this.f27592f;
        }

        public final int b() {
            return this.f27590d;
        }

        public final String d() {
            return this.f27587a;
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
            return AbstractC3292y.d(this.f27587a, aVar.f27587a) && AbstractC3292y.d(this.f27588b, aVar.f27588b) && this.f27589c == aVar.f27589c && this.f27590d == aVar.f27590d && this.f27591e == aVar.f27591e && this.f27592f == aVar.f27592f;
        }

        public final int f() {
            return this.f27591e;
        }

        public final int h() {
            return this.f27589c;
        }

        public int hashCode() {
            int hashCode = this.f27587a.hashCode() * 31;
            Integer num = this.f27588b;
            return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f27589c) * 31) + this.f27590d) * 31) + this.f27591e) * 31) + this.f27592f;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f27587a + ", statusBarColor=" + this.f27588b + ", timeLimitInSeconds=" + this.f27589c + ", initialDelayInSeconds=" + this.f27590d + ", maxAttempts=" + this.f27591e + ", ctaText=" + this.f27592f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27587a);
            Integer num = this.f27588b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f27589c);
            out.writeInt(this.f27590d);
            out.writeInt(this.f27591e);
            out.writeInt(this.f27592f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PollingActivity.class).putExtras(BundleKt.bundleOf(x.a("extra_args", input)));
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3237c parseResult(int i8, Intent intent) {
        return C3237c.f34404h.b(intent);
    }
}

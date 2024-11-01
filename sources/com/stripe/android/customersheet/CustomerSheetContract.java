package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.customersheet.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CustomerSheetContract extends ActivityResultContract<a, d> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final F2.c f24784a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f24785b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0458a f24782c = new C0458a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24783d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.customersheet.CustomerSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0458a {
            private C0458a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("args");
            }

            public /* synthetic */ C0458a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(F2.c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(F2.c configuration, Integer num) {
            AbstractC3292y.i(configuration, "configuration");
            this.f24784a = configuration;
            this.f24785b = num;
        }

        public final F2.c a() {
            return this.f24784a;
        }

        public final Integer b() {
            return this.f24785b;
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
            return AbstractC3292y.d(this.f24784a, aVar.f24784a) && AbstractC3292y.d(this.f24785b, aVar.f24785b);
        }

        public int hashCode() {
            int hashCode = this.f24784a.hashCode() * 31;
            Integer num = this.f24785b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Args(configuration=" + this.f24784a + ", statusBarColor=" + this.f24785b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            this.f24784a.writeToParcel(out, i8);
            Integer num = this.f24785b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra("args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        d a9 = d.f24969a.a(intent);
        if (a9 == null) {
            return new d.c(new IllegalArgumentException("Failed to retrieve a CustomerSheetResult"));
        }
        return a9;
    }
}

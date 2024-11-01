package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentOptionContract extends ActivityResultContract<a, q> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26758a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final N3.l f26761a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f26762b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26763c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f26764d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0565a f26759e = new C0565a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26760f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0565a {
            private C0565a() {
            }

            public final a a(Intent intent) {
                AbstractC3292y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0565a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                N3.l createFromParcel = N3.l.CREATOR.createFromParcel(parcel);
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z8 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(createFromParcel, valueOf, z8, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(N3.l state, Integer num, boolean z8, Set productUsage) {
            AbstractC3292y.i(state, "state");
            AbstractC3292y.i(productUsage, "productUsage");
            this.f26761a = state;
            this.f26762b = num;
            this.f26763c = z8;
            this.f26764d = productUsage;
        }

        public final Set a() {
            return this.f26764d;
        }

        public final N3.l b() {
            return this.f26761a;
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
            return AbstractC3292y.d(this.f26761a, aVar.f26761a) && AbstractC3292y.d(this.f26762b, aVar.f26762b) && this.f26763c == aVar.f26763c && AbstractC3292y.d(this.f26764d, aVar.f26764d);
        }

        public int hashCode() {
            int hashCode = this.f26761a.hashCode() * 31;
            Integer num = this.f26762b;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26763c)) * 31) + this.f26764d.hashCode();
        }

        public String toString() {
            return "Args(state=" + this.f26761a + ", statusBarColor=" + this.f26762b + ", enableLogging=" + this.f26763c + ", productUsage=" + this.f26764d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            this.f26761a.writeToParcel(out, i8);
            Integer num = this.f26762b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26763c ? 1 : 0);
            Set set = this.f26764d;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
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
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q parseResult(int i8, Intent intent) {
        return q.f27645b.a(intent);
    }
}

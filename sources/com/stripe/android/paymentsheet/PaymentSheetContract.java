package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.z;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContract extends ActivityResultContract<a, z> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26809a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final D3.a f26812a;

        /* renamed from: b, reason: collision with root package name */
        private final w.g f26813b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f26814c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26815d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0574a f26810e = new C0574a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26811f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0574a {
            private C0574a() {
            }

            public /* synthetic */ C0574a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((D3.a) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : w.g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(D3.a clientSecret, w.g gVar, Integer num, String injectorKey) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(injectorKey, "injectorKey");
            this.f26812a = clientSecret;
            this.f26813b = gVar;
            this.f26814c = num;
            this.f26815d = injectorKey;
        }

        public static /* synthetic */ a b(a aVar, D3.a aVar2, w.g gVar, Integer num, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                aVar2 = aVar.f26812a;
            }
            if ((i8 & 2) != 0) {
                gVar = aVar.f26813b;
            }
            if ((i8 & 4) != 0) {
                num = aVar.f26814c;
            }
            if ((i8 & 8) != 0) {
                str = aVar.f26815d;
            }
            return aVar.a(aVar2, gVar, num, str);
        }

        public final a a(D3.a clientSecret, w.g gVar, Integer num, String injectorKey) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(injectorKey, "injectorKey");
            return new a(clientSecret, gVar, num, injectorKey);
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
            return AbstractC3292y.d(this.f26812a, aVar.f26812a) && AbstractC3292y.d(this.f26813b, aVar.f26813b) && AbstractC3292y.d(this.f26814c, aVar.f26814c) && AbstractC3292y.d(this.f26815d, aVar.f26815d);
        }

        public final PaymentSheetContractV2.a f(Context context) {
            w.l cVar;
            AbstractC3292y.i(context, "context");
            D3.a aVar = this.f26812a;
            if (aVar instanceof D3.e) {
                cVar = new w.l.b(this.f26812a.a());
            } else if (aVar instanceof D3.k) {
                cVar = new w.l.c(this.f26812a.a());
            } else {
                throw new Q5.p();
            }
            w.g gVar = this.f26813b;
            if (gVar == null) {
                gVar = w.g.f27936q.a(context);
            }
            return new PaymentSheetContractV2.a(cVar, gVar, this.f26814c, false);
        }

        public int hashCode() {
            int hashCode = this.f26812a.hashCode() * 31;
            w.g gVar = this.f26813b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Integer num = this.f26814c;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f26815d.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.f26812a + ", config=" + this.f26813b + ", statusBarColor=" + this.f26814c + ", injectorKey=" + this.f26815d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26812a, i8);
            w.g gVar = this.f26813b;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                gVar.writeToParcel(out, i8);
            }
            Integer num = this.f26814c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f26815d);
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
        Activity activity;
        Window window;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(input, "input");
        Integer num = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", a.b(input, null, null, num, null, 11, null).f(context));
        AbstractC3292y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public z parseResult(int i8, Intent intent) {
        z zVar;
        PaymentSheetContractV2.c cVar;
        if (intent != null && (cVar = (PaymentSheetContractV2.c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
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

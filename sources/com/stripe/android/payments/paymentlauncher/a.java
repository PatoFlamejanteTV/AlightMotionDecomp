package com.stripe.android.payments.paymentlauncher;

import Q5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26523a = new b(null);

    /* renamed from: com.stripe.android.payments.paymentlauncher.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0553a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0553a f26524b = new C0553a();
        public static final Parcelable.Creator<C0553a> CREATOR = new C0554a();

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0554a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0553a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0553a.f26524b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0553a[] newArray(int i8) {
                return new C0553a[i8];
            }
        }

        private C0553a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ a a(Intent intent) {
            a aVar;
            if (intent != null) {
                aVar = (a) intent.getParcelableExtra("extra_args");
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return new d(new IllegalStateException("Failed to get PaymentSheetResult from Intent"));
            }
            return aVar;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0555a();

        /* renamed from: b, reason: collision with root package name */
        private final StripeIntent f26525b;

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0555a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((StripeIntent) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StripeIntent intent) {
            super(null);
            AbstractC3292y.i(intent, "intent");
            this.f26525b = intent;
        }

        public final StripeIntent b() {
            return this.f26525b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26525b, ((c) obj).f26525b);
        }

        public int hashCode() {
            return this.f26525b.hashCode();
        }

        public String toString() {
            return "Completed(intent=" + this.f26525b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f26525b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0556a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f26526b;

        /* renamed from: com.stripe.android.payments.paymentlauncher.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0556a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable throwable) {
            super(null);
            AbstractC3292y.i(throwable, "throwable");
            this.f26526b = throwable;
        }

        public final Throwable b() {
            return this.f26526b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f26526b);
        }
    }

    public /* synthetic */ a(AbstractC3284p abstractC3284p) {
        this();
    }

    public final /* synthetic */ Bundle a() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    private a() {
    }
}

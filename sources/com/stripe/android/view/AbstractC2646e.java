package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2646e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28917a = new b(null);

    /* renamed from: com.stripe.android.view.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC2646e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28918b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0689a();

        /* renamed from: com.stripe.android.view.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0689a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f28918b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1880119200;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.stripe.android.view.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final AbstractC2646e a(Intent intent) {
            AbstractC2646e abstractC2646e;
            if (intent != null) {
                abstractC2646e = (AbstractC2646e) intent.getParcelableExtra("extra_activity_result");
            } else {
                abstractC2646e = null;
            }
            if (abstractC2646e == null) {
                return a.f28918b;
            }
            return abstractC2646e;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2646e {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f28919b;

        /* renamed from: com.stripe.android.view.e$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable exception) {
            super(null);
            AbstractC3292y.i(exception, "exception");
            this.f28919b = exception;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f28919b, ((c) obj).f28919b);
        }

        public int hashCode() {
            return this.f28919b.hashCode();
        }

        public String toString() {
            return "Failure(exception=" + this.f28919b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f28919b);
        }
    }

    /* renamed from: com.stripe.android.view.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2646e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.o f28920b;

        /* renamed from: com.stripe.android.view.e$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(com.stripe.android.model.o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.stripe.android.model.o paymentMethod) {
            super(null);
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            this.f28920b = paymentMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3292y.d(this.f28920b, ((d) obj).f28920b);
        }

        public int hashCode() {
            return this.f28920b.hashCode();
        }

        public final com.stripe.android.model.o r() {
            return this.f28920b;
        }

        public String toString() {
            return "Success(paymentMethod=" + this.f28920b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28920b.writeToParcel(out, i8);
        }
    }

    private AbstractC2646e() {
    }

    public Bundle a() {
        return BundleKt.bundleOf(Q5.x.a("extra_activity_result", this));
    }

    public /* synthetic */ AbstractC2646e(AbstractC3284p abstractC3284p) {
        this();
    }
}

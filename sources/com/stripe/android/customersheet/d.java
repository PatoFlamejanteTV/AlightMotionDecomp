package com.stripe.android.customersheet;

import D3.f;
import Q5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24969a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends d {
        public static final Parcelable.Creator<a> CREATOR = new C0462a();

        /* renamed from: b, reason: collision with root package name */
        private final f f24970b;

        /* renamed from: com.stripe.android.customersheet.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0462a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((f) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(f fVar) {
            super(null);
            this.f24970b = fVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f24970b, ((a) obj).f24970b);
        }

        public int hashCode() {
            f fVar = this.f24970b;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Canceled(paymentSelection=" + this.f24970b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f24970b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ d a(Intent intent) {
            if (intent != null) {
                return (d) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends d {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f24971b;

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
            this.f24971b = exception;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f24971b);
        }
    }

    /* renamed from: com.stripe.android.customersheet.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0463d extends d {
        public static final Parcelable.Creator<C0463d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final f f24972b;

        /* renamed from: com.stripe.android.customersheet.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0463d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0463d((f) parcel.readParcelable(C0463d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0463d[] newArray(int i8) {
                return new C0463d[i8];
            }
        }

        public C0463d(f fVar) {
            super(null);
            this.f24972b = fVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0463d) && AbstractC3292y.d(this.f24972b, ((C0463d) obj).f24972b);
        }

        public int hashCode() {
            f fVar = this.f24972b;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Selected(paymentSelection=" + this.f24972b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f24972b, i8);
        }
    }

    public /* synthetic */ d(AbstractC3284p abstractC3284p) {
        this();
    }

    public final Bundle a() {
        return BundleKt.bundleOf(x.a("extra_activity_result", this));
    }

    private d() {
    }
}

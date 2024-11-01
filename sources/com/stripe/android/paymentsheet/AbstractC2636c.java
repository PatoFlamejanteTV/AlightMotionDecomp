package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.paymentsheet.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2636c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27201a = new b(null);

    /* renamed from: com.stripe.android.paymentsheet.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC2636c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27202b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0604a();

        /* renamed from: com.stripe.android.paymentsheet.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0604a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f27202b;
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
            return -1307955248;
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

    /* renamed from: com.stripe.android.paymentsheet.c$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0605c extends AbstractC2636c {

        /* renamed from: b, reason: collision with root package name */
        public static final C0605c f27203b = new C0605c();
        public static final Parcelable.Creator<C0605c> CREATOR = new a();

        /* renamed from: com.stripe.android.paymentsheet.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0605c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0605c.f27203b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0605c[] newArray(int i8) {
                return new C0605c[i8];
            }
        }

        private C0605c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0605c);
        }

        public int hashCode() {
            return 523547124;
        }

        public String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2636c {

        /* renamed from: b, reason: collision with root package name */
        private final String f27205b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f27204c = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.c$d$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(null);
            this.f27205b = str;
        }

        public final String a() {
            return this.f27205b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC3292y.d(this.f27205b, ((d) obj).f27205b);
        }

        public int hashCode() {
            String str = this.f27205b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(displayMessage=" + this.f27205b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27205b);
        }
    }

    private AbstractC2636c() {
    }

    public /* synthetic */ AbstractC2636c(AbstractC3284p abstractC3284p) {
        this();
    }
}

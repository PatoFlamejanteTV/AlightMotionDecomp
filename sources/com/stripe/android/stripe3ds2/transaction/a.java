package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0666a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0666a f28044a = new C0666a();
        public static final Parcelable.Creator<C0666a> CREATOR = new C0667a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0667a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0666a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0666a.f28044a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0666a[] newArray(int i8) {
                return new C0666a[i8];
            }
        }

        private C0666a() {
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
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0668a();

        /* renamed from: a, reason: collision with root package name */
        private final String f28045a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0668a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String userEntry) {
            super(null);
            AbstractC3292y.i(userEntry, "userEntry");
            this.f28045a = userEntry;
        }

        public final String a() {
            return this.f28045a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f28045a, ((b) obj).f28045a);
        }

        public int hashCode() {
            return this.f28045a.hashCode();
        }

        public String toString() {
            return "HtmlForm(userEntry=" + this.f28045a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28045a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0669a();

        /* renamed from: a, reason: collision with root package name */
        private final String f28046a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0669a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String userEntry) {
            super(null);
            AbstractC3292y.i(userEntry, "userEntry");
            this.f28046a = userEntry;
        }

        public final String a() {
            return this.f28046a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f28046a, ((c) obj).f28046a);
        }

        public int hashCode() {
            return this.f28046a.hashCode();
        }

        public String toString() {
            return "NativeForm(userEntry=" + this.f28046a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28046a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f28047a = new d();
        public static final Parcelable.Creator<d> CREATOR = new C0670a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0670a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return d.f28047a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
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
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28048a = new e();
        public static final Parcelable.Creator<e> CREATOR = new C0671a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0671a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return e.f28048a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        private e() {
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

    private a() {
    }

    public /* synthetic */ a(AbstractC3284p abstractC3284p) {
        this();
    }
}

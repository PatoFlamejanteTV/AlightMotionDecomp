package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transaction.c;
import d4.C2757a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    /* loaded from: classes4.dex */
    public static abstract class a extends d {
        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d4.d f28070a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(d4.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d4.d data) {
            super(null);
            AbstractC3292y.i(data, "data");
            this.f28070a = data;
        }

        public final d4.d a() {
            return this.f28070a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f28070a, ((b) obj).f28070a);
        }

        public int hashCode() {
            return this.f28070a.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f28070a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28070a.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f28071a;

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
        public c(Throwable throwable) {
            super(null);
            AbstractC3292y.i(throwable, "throwable");
            this.f28071a = throwable;
        }

        public final Throwable a() {
            return this.f28071a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f28071a, ((c) obj).f28071a);
        }

        public int hashCode() {
            return this.f28071a.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f28071a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f28071a);
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0676d extends d {
        public static final Parcelable.Creator<C0676d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final C2757a f28072a;

        /* renamed from: b, reason: collision with root package name */
        private final d4.b f28073b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f28074c;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0676d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0676d(C2757a.CREATOR.createFromParcel(parcel), d4.b.CREATOR.createFromParcel(parcel), c.a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0676d[] newArray(int i8) {
                return new C0676d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0676d(C2757a creqData, d4.b cresData, c.a creqExecutorConfig) {
            super(null);
            AbstractC3292y.i(creqData, "creqData");
            AbstractC3292y.i(cresData, "cresData");
            AbstractC3292y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f28072a = creqData;
            this.f28073b = cresData;
            this.f28074c = creqExecutorConfig;
        }

        public final C2757a a() {
            return this.f28072a;
        }

        public final d4.b b() {
            return this.f28073b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0676d)) {
                return false;
            }
            C0676d c0676d = (C0676d) obj;
            return AbstractC3292y.d(this.f28072a, c0676d.f28072a) && AbstractC3292y.d(this.f28073b, c0676d.f28073b) && AbstractC3292y.d(this.f28074c, c0676d.f28074c);
        }

        public int hashCode() {
            return (((this.f28072a.hashCode() * 31) + this.f28073b.hashCode()) * 31) + this.f28074c.hashCode();
        }

        public String toString() {
            return "Success(creqData=" + this.f28072a + ", cresData=" + this.f28073b + ", creqExecutorConfig=" + this.f28074c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28072a.writeToParcel(out, i8);
            this.f28073b.writeToParcel(out, i8);
            this.f28074c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d4.d f28075a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(d4.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d4.d data) {
            super(null);
            AbstractC3292y.i(data, "data");
            this.f28075a = data;
        }

        public final d4.d a() {
            return this.f28075a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3292y.d(this.f28075a, ((e) obj).f28075a);
        }

        public int hashCode() {
            return this.f28075a.hashCode();
        }

        public String toString() {
            return "Timeout(data=" + this.f28075a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28075a.writeToParcel(out, i8);
        }
    }

    private d() {
    }

    public /* synthetic */ d(AbstractC3284p abstractC3284p) {
        this();
    }
}

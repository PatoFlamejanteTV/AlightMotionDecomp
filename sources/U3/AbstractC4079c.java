package u3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4079c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f40267a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f40268b = 0;

    /* renamed from: u3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4079c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f40269c = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0902a();

        /* renamed from: u3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0902a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return a.f40269c;
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
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -953289798;
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

    /* renamed from: u3.c$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: u3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0903c extends AbstractC4079c {

        /* renamed from: c, reason: collision with root package name */
        public static final C0903c f40270c = new C0903c();
        public static final Parcelable.Creator<C0903c> CREATOR = new a();

        /* renamed from: u3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0903c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return C0903c.f40270c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0903c[] newArray(int i8) {
                return new C0903c[i8];
            }
        }

        private C0903c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof C0903c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1366725814;
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

    /* renamed from: u3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC4079c {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f40271c;

        /* renamed from: u3.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
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
            this.f40271c = throwable;
        }

        public final Throwable a() {
            return this.f40271c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f40271c);
        }
    }

    private AbstractC4079c() {
    }

    public /* synthetic */ AbstractC4079c(AbstractC3284p abstractC3284p) {
        this();
    }
}

package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2912k implements z2.f {
    public static final Parcelable.Creator<C2912k> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final List f32163a;

    /* renamed from: g3.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends e {
        public static final Parcelable.Creator<a> CREATOR = new C0741a();

        /* renamed from: c, reason: collision with root package name */
        private final String f32164c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32165d;

        /* renamed from: e, reason: collision with root package name */
        private final String f32166e;

        /* renamed from: g3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0741a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id, String last4, String str) {
            super(id, "bank_account", null);
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(last4, "last4");
            this.f32164c = id;
            this.f32165d = last4;
            this.f32166e = str;
        }

        @Override // g3.C2912k.e
        public String a() {
            return this.f32165d;
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
            if (AbstractC3292y.d(this.f32164c, aVar.f32164c) && AbstractC3292y.d(this.f32165d, aVar.f32165d) && AbstractC3292y.d(this.f32166e, aVar.f32166e)) {
                return true;
            }
            return false;
        }

        @Override // g3.C2912k.e
        public String getId() {
            return this.f32164c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f32164c.hashCode() * 31) + this.f32165d.hashCode()) * 31;
            String str = this.f32166e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "BankAccount(id=" + this.f32164c + ", last4=" + this.f32165d + ", bankName=" + this.f32166e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32164c);
            out.writeString(this.f32165d);
            out.writeString(this.f32166e);
        }
    }

    /* renamed from: g3.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f32167c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32168d;

        /* renamed from: g3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id, String last4) {
            super(id, "card", null);
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(last4, "last4");
            this.f32167c = id;
            this.f32168d = last4;
        }

        @Override // g3.C2912k.e
        public String a() {
            return this.f32168d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f32167c, bVar.f32167c) && AbstractC3292y.d(this.f32168d, bVar.f32168d)) {
                return true;
            }
            return false;
        }

        @Override // g3.C2912k.e
        public String getId() {
            return this.f32167c;
        }

        public int hashCode() {
            return (this.f32167c.hashCode() * 31) + this.f32168d.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.f32167c + ", last4=" + this.f32168d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32167c);
            out.writeString(this.f32168d);
        }
    }

    /* renamed from: g3.k$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2912k createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C2912k.class.getClassLoader()));
            }
            return new C2912k(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2912k[] newArray(int i8) {
            return new C2912k[i8];
        }
    }

    /* renamed from: g3.k$d */
    /* loaded from: classes4.dex */
    public static final class d extends e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f32169c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32170d;

        /* renamed from: g3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id, String last4) {
            super(id, "card", null);
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(last4, "last4");
            this.f32169c = id;
            this.f32170d = last4;
        }

        @Override // g3.C2912k.e
        public String a() {
            return this.f32170d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3292y.d(this.f32169c, dVar.f32169c) && AbstractC3292y.d(this.f32170d, dVar.f32170d)) {
                return true;
            }
            return false;
        }

        @Override // g3.C2912k.e
        public String getId() {
            return this.f32169c;
        }

        public int hashCode() {
            return (this.f32169c.hashCode() * 31) + this.f32170d.hashCode();
        }

        public String toString() {
            return "Passthrough(id=" + this.f32169c + ", last4=" + this.f32170d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32169c);
            out.writeString(this.f32170d);
        }
    }

    /* renamed from: g3.k$e */
    /* loaded from: classes4.dex */
    public static abstract class e implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f32171a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32172b;

        public /* synthetic */ e(String str, String str2, AbstractC3284p abstractC3284p) {
            this(str, str2);
        }

        public abstract String a();

        public abstract String getId();

        private e(String str, String str2) {
            this.f32171a = str;
            this.f32172b = str2;
        }
    }

    public C2912k(List paymentDetails) {
        AbstractC3292y.i(paymentDetails, "paymentDetails");
        this.f32163a = paymentDetails;
    }

    public final List a() {
        return this.f32163a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2912k) && AbstractC3292y.d(this.f32163a, ((C2912k) obj).f32163a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32163a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.f32163a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        List list = this.f32163a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
    }
}

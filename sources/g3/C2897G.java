package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2897G implements z2.f {
    public static final Parcelable.Creator<C2897G> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f31959a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31960b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31961c;

    /* renamed from: d, reason: collision with root package name */
    private final List f31962d;

    /* renamed from: e, reason: collision with root package name */
    private final c f31963e;

    /* renamed from: g3.G$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2897G createFromParcel(Parcel parcel) {
            Integer valueOf;
            AbstractC3292y.i(parcel, "parcel");
            c cVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                cVar = c.CREATOR.createFromParcel(parcel);
            }
            return new C2897G(valueOf, readString, readString2, arrayList, cVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2897G[] newArray(int i8) {
            return new C2897G[i8];
        }
    }

    /* renamed from: g3.G$b */
    /* loaded from: classes4.dex */
    public static final class b implements z2.f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0738b f31964a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f31965b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31966c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31967d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f31968e;

        /* renamed from: g3.G$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                AbstractC3292y.i(parcel, "parcel");
                EnumC0738b valueOf3 = EnumC0738b.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new b(valueOf3, valueOf, readString, readString2, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: g3.G$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0738b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f31969b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0738b f31970c = new EnumC0738b("Sku", 0, "sku");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0738b f31971d = new EnumC0738b("Tax", 1, "tax");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0738b f31972e = new EnumC0738b("Shipping", 2, "shipping");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ EnumC0738b[] f31973f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ W5.a f31974g;

            /* renamed from: a, reason: collision with root package name */
            private final String f31975a;

            /* renamed from: g3.G$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final /* synthetic */ EnumC0738b a(String str) {
                    Object obj;
                    Iterator<E> it = EnumC0738b.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(((EnumC0738b) obj).f31975a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (EnumC0738b) obj;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            static {
                EnumC0738b[] a9 = a();
                f31973f = a9;
                f31974g = W5.b.a(a9);
                f31969b = new a(null);
            }

            private EnumC0738b(String str, int i8, String str2) {
                this.f31975a = str2;
            }

            private static final /* synthetic */ EnumC0738b[] a() {
                return new EnumC0738b[]{f31970c, f31971d, f31972e};
            }

            public static W5.a c() {
                return f31974g;
            }

            public static EnumC0738b valueOf(String str) {
                return (EnumC0738b) Enum.valueOf(EnumC0738b.class, str);
            }

            public static EnumC0738b[] values() {
                return (EnumC0738b[]) f31973f.clone();
            }
        }

        public b(EnumC0738b type, Integer num, String str, String str2, Integer num2) {
            AbstractC3292y.i(type, "type");
            this.f31964a = type;
            this.f31965b = num;
            this.f31966c = str;
            this.f31967d = str2;
            this.f31968e = num2;
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
            if (this.f31964a == bVar.f31964a && AbstractC3292y.d(this.f31965b, bVar.f31965b) && AbstractC3292y.d(this.f31966c, bVar.f31966c) && AbstractC3292y.d(this.f31967d, bVar.f31967d) && AbstractC3292y.d(this.f31968e, bVar.f31968e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f31964a.hashCode() * 31;
            Integer num = this.f31965b;
            int i8 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str = this.f31966c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f31967d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            Integer num2 = this.f31968e;
            if (num2 != null) {
                i8 = num2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "Item(type=" + this.f31964a + ", amount=" + this.f31965b + ", currency=" + this.f31966c + ", description=" + this.f31967d + ", quantity=" + this.f31968e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f31964a.name());
            Integer num = this.f31965b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f31966c);
            out.writeString(this.f31967d);
            Integer num2 = this.f31968e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* renamed from: g3.G$c */
    /* loaded from: classes4.dex */
    public static final class c implements z2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f31976a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31977b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31978c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31979d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31980e;

        /* renamed from: g3.G$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3292y.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new c(createFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4) {
            this.f31976a = aVar;
            this.f31977b = str;
            this.f31978c = str2;
            this.f31979d = str3;
            this.f31980e = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f31976a, cVar.f31976a) && AbstractC3292y.d(this.f31977b, cVar.f31977b) && AbstractC3292y.d(this.f31978c, cVar.f31978c) && AbstractC3292y.d(this.f31979d, cVar.f31979d) && AbstractC3292y.d(this.f31980e, cVar.f31980e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f31976a;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f31977b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f31978c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f31979d;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str4 = this.f31980e;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "Shipping(address=" + this.f31976a + ", carrier=" + this.f31977b + ", name=" + this.f31978c + ", phone=" + this.f31979d + ", trackingNumber=" + this.f31980e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f31976a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f31977b);
            out.writeString(this.f31978c);
            out.writeString(this.f31979d);
            out.writeString(this.f31980e);
        }
    }

    public C2897G(Integer num, String str, String str2, List items, c cVar) {
        AbstractC3292y.i(items, "items");
        this.f31959a = num;
        this.f31960b = str;
        this.f31961c = str2;
        this.f31962d = items;
        this.f31963e = cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2897G)) {
            return false;
        }
        C2897G c2897g = (C2897G) obj;
        if (AbstractC3292y.d(this.f31959a, c2897g.f31959a) && AbstractC3292y.d(this.f31960b, c2897g.f31960b) && AbstractC3292y.d(this.f31961c, c2897g.f31961c) && AbstractC3292y.d(this.f31962d, c2897g.f31962d) && AbstractC3292y.d(this.f31963e, c2897g.f31963e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f31959a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f31960b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31961c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i10 + hashCode3) * 31) + this.f31962d.hashCode()) * 31;
        c cVar = this.f31963e;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return hashCode4 + i8;
    }

    public String toString() {
        return "SourceOrder(amount=" + this.f31959a + ", currency=" + this.f31960b + ", email=" + this.f31961c + ", items=" + this.f31962d + ", shipping=" + this.f31963e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        Integer num = this.f31959a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f31960b);
        out.writeString(this.f31961c);
        List list = this.f31962d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(out, i8);
        }
        c cVar = this.f31963e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
    }
}

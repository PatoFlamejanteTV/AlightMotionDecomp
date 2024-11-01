package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2899I implements z2.f {
    public static final Parcelable.Creator<C2899I> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f31991a;

    /* renamed from: b, reason: collision with root package name */
    private final a f31992b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f31993c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31994d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31995e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31996f;

    /* renamed from: g, reason: collision with root package name */
    private final d f31997g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31998h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31999i;

    /* renamed from: g3.I$a */
    /* loaded from: classes4.dex */
    public static final class a implements z2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f32002a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32003b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32004c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32005d;

        /* renamed from: e, reason: collision with root package name */
        private final String f32006e;

        /* renamed from: f, reason: collision with root package name */
        private final String f32007f;

        /* renamed from: g, reason: collision with root package name */
        private final String f32008g;

        /* renamed from: h, reason: collision with root package name */
        private final List f32009h;

        /* renamed from: i, reason: collision with root package name */
        private final String f32010i;

        /* renamed from: j, reason: collision with root package name */
        private final String f32011j;

        /* renamed from: k, reason: collision with root package name */
        private final String f32012k;

        /* renamed from: l, reason: collision with root package name */
        private final String f32013l;

        /* renamed from: m, reason: collision with root package name */
        public static final C0739a f32000m = new C0739a(null);

        /* renamed from: n, reason: collision with root package name */
        public static final int f32001n = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: g3.I$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0739a {
            private C0739a() {
            }

            public /* synthetic */ C0739a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: g3.I$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(c.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new a(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11) {
            this.f32002a = str;
            this.f32003b = str2;
            this.f32004c = str3;
            this.f32005d = str4;
            this.f32006e = str5;
            this.f32007f = str6;
            this.f32008g = str7;
            this.f32009h = list;
            this.f32010i = str8;
            this.f32011j = str9;
            this.f32012k = str10;
            this.f32013l = str11;
        }

        public final String a() {
            return this.f32004c;
        }

        public final String b() {
            return this.f32005d;
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
            if (AbstractC3292y.d(this.f32002a, aVar.f32002a) && AbstractC3292y.d(this.f32003b, aVar.f32003b) && AbstractC3292y.d(this.f32004c, aVar.f32004c) && AbstractC3292y.d(this.f32005d, aVar.f32005d) && AbstractC3292y.d(this.f32006e, aVar.f32006e) && AbstractC3292y.d(this.f32007f, aVar.f32007f) && AbstractC3292y.d(this.f32008g, aVar.f32008g) && AbstractC3292y.d(this.f32009h, aVar.f32009h) && AbstractC3292y.d(this.f32010i, aVar.f32010i) && AbstractC3292y.d(this.f32011j, aVar.f32011j) && AbstractC3292y.d(this.f32012k, aVar.f32012k) && AbstractC3292y.d(this.f32013l, aVar.f32013l)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f32002a;
        }

        public final boolean h() {
            return AbstractC3292y.d("C", this.f32013l);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            String str = this.f32002a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f32003b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f32004c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f32005d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f32006e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f32007f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f32008g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            List list = this.f32009h;
            if (list == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = list.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str8 = this.f32010i;
            if (str8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str8.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str9 = this.f32011j;
            if (str9 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str9.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str10 = this.f32012k;
            if (str10 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = str10.hashCode();
            }
            int i19 = (i18 + hashCode11) * 31;
            String str11 = this.f32013l;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i19 + i8;
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.f32002a + ", acsChallengeMandated=" + this.f32003b + ", acsSignedContent=" + this.f32004c + ", acsTransId=" + this.f32005d + ", acsUrl=" + this.f32006e + ", authenticationType=" + this.f32007f + ", cardholderInfo=" + this.f32008g + ", messageExtension=" + this.f32009h + ", messageType=" + this.f32010i + ", messageVersion=" + this.f32011j + ", sdkTransId=" + this.f32012k + ", transStatus=" + this.f32013l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32002a);
            out.writeString(this.f32003b);
            out.writeString(this.f32004c);
            out.writeString(this.f32005d);
            out.writeString(this.f32006e);
            out.writeString(this.f32007f);
            out.writeString(this.f32008g);
            List list = this.f32009h;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).writeToParcel(out, i8);
                }
            }
            out.writeString(this.f32010i);
            out.writeString(this.f32011j);
            out.writeString(this.f32012k);
            out.writeString(this.f32013l);
        }
    }

    /* renamed from: g3.I$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2899I createFromParcel(Parcel parcel) {
            a createFromParcel;
            Long valueOf;
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = a.CREATOR.createFromParcel(parcel);
            }
            a aVar = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            return new C2899I(readString, aVar, valueOf, readString2, readString3, z8, dVar, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2899I[] newArray(int i8) {
            return new C2899I[i8];
        }
    }

    /* renamed from: g3.I$c */
    /* loaded from: classes4.dex */
    public static final class c implements z2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f32014a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f32015b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32016c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f32017d;

        /* renamed from: g3.I$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                LinkedHashMap linkedHashMap;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new c(readString, z8, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, boolean z8, String str2, Map map) {
            this.f32014a = str;
            this.f32015b = z8;
            this.f32016c = str2;
            this.f32017d = map;
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
            if (AbstractC3292y.d(this.f32014a, cVar.f32014a) && this.f32015b == cVar.f32015b && AbstractC3292y.d(this.f32016c, cVar.f32016c) && AbstractC3292y.d(this.f32017d, cVar.f32017d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f32014a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a9 = ((hashCode * 31) + androidx.compose.foundation.a.a(this.f32015b)) * 31;
            String str2 = this.f32016c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (a9 + hashCode2) * 31;
            Map map = this.f32017d;
            if (map != null) {
                i8 = map.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "MessageExtension(name=" + this.f32014a + ", criticalityIndicator=" + this.f32015b + ", id=" + this.f32016c + ", data=" + this.f32017d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32014a);
            out.writeInt(this.f32015b ? 1 : 0);
            out.writeString(this.f32016c);
            Map map = this.f32017d;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
    }

    /* renamed from: g3.I$d */
    /* loaded from: classes4.dex */
    public static final class d implements z2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f32018a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32019b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32020c;

        /* renamed from: d, reason: collision with root package name */
        private final String f32021d;

        /* renamed from: e, reason: collision with root package name */
        private final String f32022e;

        /* renamed from: f, reason: collision with root package name */
        private final String f32023f;

        /* renamed from: g, reason: collision with root package name */
        private final String f32024g;

        /* renamed from: h, reason: collision with root package name */
        private final String f32025h;

        /* renamed from: i, reason: collision with root package name */
        private final String f32026i;

        /* renamed from: j, reason: collision with root package name */
        private final String f32027j;

        /* renamed from: k, reason: collision with root package name */
        private final String f32028k;

        /* renamed from: g3.I$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f32018a = str;
            this.f32019b = str2;
            this.f32020c = str3;
            this.f32021d = str4;
            this.f32022e = str5;
            this.f32023f = str6;
            this.f32024g = str7;
            this.f32025h = str8;
            this.f32026i = str9;
            this.f32027j = str10;
            this.f32028k = str11;
        }

        public final String a() {
            return this.f32021d;
        }

        public final String b() {
            return this.f32022e;
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
            if (AbstractC3292y.d(this.f32018a, dVar.f32018a) && AbstractC3292y.d(this.f32019b, dVar.f32019b) && AbstractC3292y.d(this.f32020c, dVar.f32020c) && AbstractC3292y.d(this.f32021d, dVar.f32021d) && AbstractC3292y.d(this.f32022e, dVar.f32022e) && AbstractC3292y.d(this.f32023f, dVar.f32023f) && AbstractC3292y.d(this.f32024g, dVar.f32024g) && AbstractC3292y.d(this.f32025h, dVar.f32025h) && AbstractC3292y.d(this.f32026i, dVar.f32026i) && AbstractC3292y.d(this.f32027j, dVar.f32027j) && AbstractC3292y.d(this.f32028k, dVar.f32028k)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f32023f;
        }

        public final String h() {
            return this.f32024g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            String str = this.f32018a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f32019b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f32020c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f32021d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f32022e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f32023f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f32024g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str8 = this.f32025h;
            if (str8 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str8.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str9 = this.f32026i;
            if (str9 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str9.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str10 = this.f32027j;
            if (str10 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str10.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str11 = this.f32028k;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i18 + i8;
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.f32018a + ", acsTransId=" + this.f32019b + ", dsTransId=" + this.f32020c + ", errorCode=" + this.f32021d + ", errorComponent=" + this.f32022e + ", errorDescription=" + this.f32023f + ", errorDetail=" + this.f32024g + ", errorMessageType=" + this.f32025h + ", messageType=" + this.f32026i + ", messageVersion=" + this.f32027j + ", sdkTransId=" + this.f32028k + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f32018a);
            out.writeString(this.f32019b);
            out.writeString(this.f32020c);
            out.writeString(this.f32021d);
            out.writeString(this.f32022e);
            out.writeString(this.f32023f);
            out.writeString(this.f32024g);
            out.writeString(this.f32025h);
            out.writeString(this.f32026i);
            out.writeString(this.f32027j);
            out.writeString(this.f32028k);
        }
    }

    public C2899I(String str, a aVar, Long l8, String str2, String str3, boolean z8, d dVar, String str4, String str5) {
        this.f31991a = str;
        this.f31992b = aVar;
        this.f31993c = l8;
        this.f31994d = str2;
        this.f31995e = str3;
        this.f31996f = z8;
        this.f31997g = dVar;
        this.f31998h = str4;
        this.f31999i = str5;
    }

    public final a a() {
        return this.f31992b;
    }

    public final d b() {
        return this.f31997g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2899I)) {
            return false;
        }
        C2899I c2899i = (C2899I) obj;
        if (AbstractC3292y.d(this.f31991a, c2899i.f31991a) && AbstractC3292y.d(this.f31992b, c2899i.f31992b) && AbstractC3292y.d(this.f31993c, c2899i.f31993c) && AbstractC3292y.d(this.f31994d, c2899i.f31994d) && AbstractC3292y.d(this.f31995e, c2899i.f31995e) && this.f31996f == c2899i.f31996f && AbstractC3292y.d(this.f31997g, c2899i.f31997g) && AbstractC3292y.d(this.f31998h, c2899i.f31998h) && AbstractC3292y.d(this.f31999i, c2899i.f31999i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31998h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f31991a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f31992b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l8 = this.f31993c;
        if (l8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l8.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f31994d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f31995e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int a9 = (((i12 + hashCode5) * 31) + androidx.compose.foundation.a.a(this.f31996f)) * 31;
        d dVar = this.f31997g;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i13 = (a9 + hashCode6) * 31;
        String str4 = this.f31998h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str5 = this.f31999i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.f31991a + ", ares=" + this.f31992b + ", created=" + this.f31993c + ", source=" + this.f31994d + ", state=" + this.f31995e + ", liveMode=" + this.f31996f + ", error=" + this.f31997g + ", fallbackRedirectUrl=" + this.f31998h + ", creq=" + this.f31999i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31991a);
        a aVar = this.f31992b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        Long l8 = this.f31993c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f31994d);
        out.writeString(this.f31995e);
        out.writeInt(this.f31996f ? 1 : 0);
        d dVar = this.f31997g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31998h);
        out.writeString(this.f31999i);
    }
}

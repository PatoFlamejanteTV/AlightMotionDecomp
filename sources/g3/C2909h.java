package g3;

import R5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2901K;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2909h extends L {

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2906e f32152c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f32153d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32154e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32155f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32156g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32157h;

    /* renamed from: i, reason: collision with root package name */
    private String f32158i;

    /* renamed from: j, reason: collision with root package name */
    private com.stripe.android.model.a f32159j;

    /* renamed from: k, reason: collision with root package name */
    private String f32160k;

    /* renamed from: l, reason: collision with root package name */
    private final C2893C f32161l;

    /* renamed from: m, reason: collision with root package name */
    private Map f32162m;

    /* renamed from: n, reason: collision with root package name */
    private static final a f32150n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f32151o = 8;
    public static final Parcelable.Creator<C2909h> CREATOR = new b();

    /* renamed from: g3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.h$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2909h createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            C2893C createFromParcel2;
            LinkedHashMap linkedHashMap;
            AbstractC3292y.i(parcel, "parcel");
            EnumC2906e valueOf = EnumC2906e.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
            }
            com.stripe.android.model.a aVar = createFromParcel;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C2893C.CREATOR.createFromParcel(parcel);
            }
            C2893C c2893c = createFromParcel2;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                for (int i9 = 0; i9 != readInt4; i9++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new C2909h(valueOf, linkedHashSet, readString, readInt2, readInt3, readString2, readString3, aVar, readString4, c2893c, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2909h[] newArray(int i8) {
            return new C2909h[i8];
        }
    }

    public /* synthetic */ C2909h(EnumC2906e enumC2906e, Set set, String str, int i8, int i9, String str2, String str3, com.stripe.android.model.a aVar, String str4, C2893C c2893c, Map map, int i10, AbstractC3284p abstractC3284p) {
        this(enumC2906e, (i10 & 2) != 0 ? a0.f() : set, str, i8, i9, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : aVar, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : c2893c, (i10 & 1024) != 0 ? null : map);
    }

    public final String b() {
        return this.f32157h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2909h)) {
            return false;
        }
        C2909h c2909h = (C2909h) obj;
        if (this.f32152c == c2909h.f32152c && AbstractC3292y.d(this.f32153d, c2909h.f32153d) && AbstractC3292y.d(this.f32154e, c2909h.f32154e) && this.f32155f == c2909h.f32155f && this.f32156g == c2909h.f32156g && AbstractC3292y.d(this.f32157h, c2909h.f32157h) && AbstractC3292y.d(this.f32158i, c2909h.f32158i) && AbstractC3292y.d(this.f32159j, c2909h.f32159j) && AbstractC3292y.d(this.f32160k, c2909h.f32160k) && AbstractC3292y.d(this.f32161l, c2909h.f32161l) && AbstractC3292y.d(this.f32162m, c2909h.f32162m)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f32155f;
    }

    public final int h() {
        return this.f32156g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((((((((this.f32152c.hashCode() * 31) + this.f32153d.hashCode()) * 31) + this.f32154e.hashCode()) * 31) + this.f32155f) * 31) + this.f32156g) * 31;
        String str = this.f32157h;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode) * 31;
        String str2 = this.f32158i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.a aVar = this.f32159j;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.f32160k;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        C2893C c2893c = this.f32161l;
        if (c2893c == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2893c.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Map map = this.f32162m;
        if (map != null) {
            i8 = map.hashCode();
        }
        return i13 + i8;
    }

    public final String i() {
        return this.f32154e;
    }

    public String toString() {
        return "CardParams(brand=" + this.f32152c + ", loggingTokens=" + this.f32153d + ", number=" + this.f32154e + ", expMonth=" + this.f32155f + ", expYear=" + this.f32156g + ", cvc=" + this.f32157h + ", name=" + this.f32158i + ", address=" + this.f32159j + ", currency=" + this.f32160k + ", networks=" + this.f32161l + ", metadata=" + this.f32162m + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32152c.name());
        Set set = this.f32153d;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f32154e);
        out.writeInt(this.f32155f);
        out.writeInt(this.f32156g);
        out.writeString(this.f32157h);
        out.writeString(this.f32158i);
        com.stripe.android.model.a aVar = this.f32159j;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f32160k);
        C2893C c2893c = this.f32161l;
        if (c2893c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2893c.writeToParcel(out, i8);
        }
        Map map = this.f32162m;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909h(EnumC2906e brand, Set loggingTokens, String number, int i8, int i9, String str, String str2, com.stripe.android.model.a aVar, String str3, C2893C c2893c, Map map) {
        super(C2901K.c.f32038c, loggingTokens);
        AbstractC3292y.i(brand, "brand");
        AbstractC3292y.i(loggingTokens, "loggingTokens");
        AbstractC3292y.i(number, "number");
        this.f32152c = brand;
        this.f32153d = loggingTokens;
        this.f32154e = number;
        this.f32155f = i8;
        this.f32156g = i9;
        this.f32157h = str;
        this.f32158i = str2;
        this.f32159j = aVar;
        this.f32160k = str3;
        this.f32161l = c2893c;
        this.f32162m = map;
    }
}

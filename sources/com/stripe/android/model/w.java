package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.Source;
import g3.InterfaceC2900J;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25986a;

    /* renamed from: b, reason: collision with root package name */
    private Long f25987b;

    /* renamed from: c, reason: collision with root package name */
    private String f25988c;

    /* renamed from: d, reason: collision with root package name */
    private e f25989d;

    /* renamed from: e, reason: collision with root package name */
    private Source.Usage f25990e;

    /* renamed from: f, reason: collision with root package name */
    private String f25991f;

    /* renamed from: g, reason: collision with root package name */
    private d f25992g;

    /* renamed from: h, reason: collision with root package name */
    private v f25993h;

    /* renamed from: i, reason: collision with root package name */
    private String f25994i;

    /* renamed from: j, reason: collision with root package name */
    private Map f25995j;

    /* renamed from: k, reason: collision with root package name */
    private g f25996k;

    /* renamed from: l, reason: collision with root package name */
    private a f25997l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f25998m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f25984n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f25985o = 8;
    public static final Parcelable.Creator<w> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final Map f26001a;

        /* renamed from: b, reason: collision with root package name */
        public static final C0528a f25999b = new C0528a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f26000c = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0528a {
            private C0528a() {
            }

            public a a(Parcel parcel) {
                JSONObject jSONObject;
                AbstractC3292y.i(parcel, "parcel");
                z2.e eVar = z2.e.f41477a;
                String readString = parcel.readString();
                if (readString != null) {
                    jSONObject = new JSONObject(readString);
                } else {
                    jSONObject = null;
                }
                Map b9 = eVar.b(jSONObject);
                if (b9 == null) {
                    b9 = Q.h();
                }
                return new a(b9);
            }

            public void b(a aVar, Parcel parcel, int i8) {
                String str;
                AbstractC3292y.i(aVar, "<this>");
                AbstractC3292y.i(parcel, "parcel");
                JSONObject d8 = z2.e.f41477a.d(aVar.a());
                if (d8 != null) {
                    str = d8.toString();
                } else {
                    str = null;
                }
                parcel.writeString(str);
            }

            public /* synthetic */ C0528a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return a.f25999b.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Map value) {
            AbstractC3292y.i(value, "value");
            this.f26001a = value;
        }

        public final Map a() {
            return this.f26001a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f26001a, ((a) obj).f26001a);
        }

        public int hashCode() {
            return this.f26001a.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.f26001a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            f25999b.b(this, out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            android.support.v4.media.a.a(parcel.readParcelable(w.class.getClassLoader()));
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            e createFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            Source.Usage valueOf2 = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            d valueOf3 = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            v createFromParcel2 = parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            g createFromParcel3 = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            a createFromParcel4 = a.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet.add(parcel.readString());
            }
            return new w(readString, null, valueOf, readString2, createFromParcel, valueOf2, readString3, valueOf3, createFromParcel2, readString4, linkedHashMap, createFromParcel3, createFromParcel4, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w[] newArray(int i8) {
            return new w[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f26002b = new d("Redirect", 0, "redirect");

        /* renamed from: c, reason: collision with root package name */
        public static final d f26003c = new d("Receiver", 1, "receiver");

        /* renamed from: d, reason: collision with root package name */
        public static final d f26004d = new d("CodeVerification", 2, "code_verification");

        /* renamed from: e, reason: collision with root package name */
        public static final d f26005e = new d("None", 3, "none");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f26006f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ W5.a f26007g;

        /* renamed from: a, reason: collision with root package name */
        private final String f26008a;

        static {
            d[] a9 = a();
            f26006f = a9;
            f26007g = W5.b.a(a9);
        }

        private d(String str, int i8, String str2) {
            this.f26008a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f26002b, f26003c, f26004d, f26005e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f26006f.clone();
        }

        public final String b() {
            return this.f26008a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private com.stripe.android.model.a f26011a;

        /* renamed from: b, reason: collision with root package name */
        private String f26012b;

        /* renamed from: c, reason: collision with root package name */
        private String f26013c;

        /* renamed from: d, reason: collision with root package name */
        private String f26014d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f26009e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26010f = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f26011a = aVar;
            this.f26012b = str;
            this.f26013c = str2;
            this.f26014d = str3;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f26011a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(Q5.x.a("address", aVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f26012b;
            if (str != null) {
                map2 = Q.e(Q5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f26013c;
            if (str2 != null) {
                map3 = Q.e(Q5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f26014d;
            if (str3 != null) {
                map4 = Q.e(Q5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3292y.d(this.f26011a, eVar.f26011a) && AbstractC3292y.d(this.f26012b, eVar.f26012b) && AbstractC3292y.d(this.f26013c, eVar.f26013c) && AbstractC3292y.d(this.f26014d, eVar.f26014d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f26011a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f26012b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26013c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26014d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.f26011a + ", email=" + this.f26012b + ", name=" + this.f26013c + ", phone=" + this.f26014d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f26011a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f26012b);
            out.writeString(this.f26013c);
            out.writeString(this.f26014d);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26016a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26017b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26015c = new a(null);
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str, String str2) {
            this.f26016a = str;
            this.f26017b = str2;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map h8 = Q.h();
            String str = this.f26016a;
            Map map2 = null;
            if (str != null) {
                map = Q.e(Q5.x.a("appid", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str2 = this.f26017b;
            if (str2 != null) {
                map2 = Q.e(Q5.x.a("statement_descriptor", str2));
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            return Q.q(q8, map2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3292y.d(this.f26016a, gVar.f26016a) && AbstractC3292y.d(this.f26017b, gVar.f26017b);
        }

        public int hashCode() {
            String str = this.f26016a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26017b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.f26016a + ", statementDescriptor=" + this.f26017b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f26016a);
            out.writeString(this.f26017b);
        }
    }

    public w(String typeRaw, f fVar, Long l8, String str, e eVar, Source.Usage usage, String str2, d dVar, v vVar, String str3, Map map, g gVar, a apiParams, Set attribution) {
        AbstractC3292y.i(typeRaw, "typeRaw");
        AbstractC3292y.i(apiParams, "apiParams");
        AbstractC3292y.i(attribution, "attribution");
        this.f25986a = typeRaw;
        this.f25987b = l8;
        this.f25988c = str;
        this.f25989d = eVar;
        this.f25990e = usage;
        this.f25991f = str2;
        this.f25992g = dVar;
        this.f25993h = vVar;
        this.f25994i = str3;
        this.f25995j = map;
        this.f25996k = gVar;
        this.f25997l = apiParams;
        this.f25998m = attribution;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        Map e8 = Q.e(Q5.x.a("type", this.f25986a));
        Map a9 = this.f25997l.a();
        Map map11 = null;
        if (!(!a9.isEmpty())) {
            a9 = null;
        }
        if (a9 != null) {
            map = Q.e(Q5.x.a(this.f25986a, a9));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(Q.q(e8, map), Q.h());
        Long l8 = this.f25987b;
        if (l8 != null) {
            map2 = Q.e(Q5.x.a(RewardPlus.AMOUNT, Long.valueOf(l8.longValue())));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        String str = this.f25988c;
        if (str != null) {
            map3 = Q.e(Q5.x.a("currency", str));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        d dVar = this.f25992g;
        if (dVar != null) {
            map4 = Q.e(Q5.x.a("flow", dVar.b()));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        v vVar = this.f25993h;
        if (vVar != null) {
            map5 = Q.e(Q5.x.a("source_order", vVar.B()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        e eVar = this.f25989d;
        if (eVar != null) {
            map6 = Q.e(Q5.x.a("owner", eVar.B()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        String str2 = this.f25991f;
        if (str2 != null) {
            map7 = Q.e(Q5.x.a("redirect", Q.e(Q5.x.a("return_url", str2))));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(q13, map7);
        Map map12 = this.f25995j;
        if (map12 != null) {
            map8 = Q.e(Q5.x.a(TtmlNode.TAG_METADATA, map12));
        } else {
            map8 = null;
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        Map q15 = Q.q(q14, map8);
        String str3 = this.f25994i;
        if (str3 != null) {
            map9 = Q.e(Q5.x.a("token", str3));
        } else {
            map9 = null;
        }
        if (map9 == null) {
            map9 = Q.h();
        }
        Map q16 = Q.q(q15, map9);
        Source.Usage usage = this.f25990e;
        if (usage != null) {
            map10 = Q.e(Q5.x.a("usage", usage.b()));
        } else {
            map10 = null;
        }
        if (map10 == null) {
            map10 = Q.h();
        }
        Map q17 = Q.q(q16, map10);
        g gVar = this.f25996k;
        if (gVar != null) {
            map11 = Q.e(Q5.x.a("wechat", gVar.B()));
        }
        if (map11 == null) {
            map11 = Q.h();
        }
        return Q.q(q17, map11);
    }

    public final Set a() {
        return this.f25998m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC3292y.d(this.f25986a, wVar.f25986a) && AbstractC3292y.d(null, null) && AbstractC3292y.d(this.f25987b, wVar.f25987b) && AbstractC3292y.d(this.f25988c, wVar.f25988c) && AbstractC3292y.d(this.f25989d, wVar.f25989d) && this.f25990e == wVar.f25990e && AbstractC3292y.d(this.f25991f, wVar.f25991f) && this.f25992g == wVar.f25992g && AbstractC3292y.d(this.f25993h, wVar.f25993h) && AbstractC3292y.d(this.f25994i, wVar.f25994i) && AbstractC3292y.d(this.f25995j, wVar.f25995j) && AbstractC3292y.d(this.f25996k, wVar.f25996k) && AbstractC3292y.d(this.f25997l, wVar.f25997l) && AbstractC3292y.d(this.f25998m, wVar.f25998m);
    }

    public final String getType() {
        return Source.f25227v.a(this.f25986a);
    }

    public int hashCode() {
        int hashCode = this.f25986a.hashCode() * 961;
        Long l8 = this.f25987b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.f25988c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f25989d;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Source.Usage usage = this.f25990e;
        int hashCode5 = (hashCode4 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.f25991f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f25992g;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        v vVar = this.f25993h;
        int hashCode8 = (hashCode7 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str3 = this.f25994i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f25995j;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        g gVar = this.f25996k;
        return ((((hashCode10 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f25997l.hashCode()) * 31) + this.f25998m.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.f25986a + ", typeData=" + ((Object) null) + ", amount=" + this.f25987b + ", currency=" + this.f25988c + ", owner=" + this.f25989d + ", usage=" + this.f25990e + ", returnUrl=" + this.f25991f + ", flow=" + this.f25992g + ", sourceOrder=" + this.f25993h + ", token=" + this.f25994i + ", metadata=" + this.f25995j + ", weChatParams=" + this.f25996k + ", apiParams=" + this.f25997l + ", attribution=" + this.f25998m + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25986a);
        out.writeParcelable(null, i8);
        Long l8 = this.f25987b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f25988c);
        e eVar = this.f25989d;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Source.Usage usage = this.f25990e;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        out.writeString(this.f25991f);
        d dVar = this.f25992g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(dVar.name());
        }
        v vVar = this.f25993h;
        if (vVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            vVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25994i);
        Map map = this.f25995j;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
        g gVar = this.f25996k;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        this.f25997l.writeToParcel(out, i8);
        Set set = this.f25998m;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }
}

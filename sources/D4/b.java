package d4;

import Q5.C1413h;
import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import R5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c4.q;
import c4.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import l6.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: C, reason: collision with root package name */
    public static final C0722b f31370C = new C0722b(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: D, reason: collision with root package name */
    private static final List f31371D = AbstractC1435t.p("Y", "N");

    /* renamed from: E, reason: collision with root package name */
    private static final Set f31372E = a0.i("threeDSServerTransID", "acsCounterAtoS", "acsTransID", "challengeCompletionInd", "messageExtension", "messageType", "messageVersion", "sdkTransID", "transStatus");

    /* renamed from: A, reason: collision with root package name */
    private final String f31373A;

    /* renamed from: B, reason: collision with root package name */
    private final String f31374B;

    /* renamed from: a, reason: collision with root package name */
    private final String f31375a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31376b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31377c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31378d;

    /* renamed from: e, reason: collision with root package name */
    private final g f31379e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31380f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31381g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31382h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31383i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31384j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f31385k;

    /* renamed from: l, reason: collision with root package name */
    private final List f31386l;

    /* renamed from: m, reason: collision with root package name */
    private final String f31387m;

    /* renamed from: n, reason: collision with root package name */
    private final String f31388n;

    /* renamed from: o, reason: collision with root package name */
    private final d f31389o;

    /* renamed from: p, reason: collision with root package name */
    private final List f31390p;

    /* renamed from: q, reason: collision with root package name */
    private final String f31391q;

    /* renamed from: r, reason: collision with root package name */
    private final String f31392r;

    /* renamed from: s, reason: collision with root package name */
    private final String f31393s;

    /* renamed from: t, reason: collision with root package name */
    private final String f31394t;

    /* renamed from: u, reason: collision with root package name */
    private final d f31395u;

    /* renamed from: v, reason: collision with root package name */
    private final String f31396v;

    /* renamed from: w, reason: collision with root package name */
    private final q f31397w;

    /* renamed from: x, reason: collision with root package name */
    private final String f31398x;

    /* renamed from: y, reason: collision with root package name */
    private final String f31399y;

    /* renamed from: z, reason: collision with root package name */
    private final String f31400z;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f31402a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31403b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0720a f31401c = new C0720a(null);
        public static final Parcelable.Creator<a> CREATOR = new C0721b();

        /* renamed from: d4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0720a {
            private C0720a() {
            }

            public final List a(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    if (optJSONObject != null) {
                        String next = optJSONObject.keys().next();
                        String optString = optJSONObject.optString(next);
                        AbstractC3292y.f(next);
                        AbstractC3292y.f(optString);
                        arrayList.add(new a(next, optString));
                    }
                }
                return arrayList;
            }

            public /* synthetic */ C0720a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: d4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0721b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String name, String text) {
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(text, "text");
            this.f31402a = name;
            this.f31403b = text;
        }

        public final String a() {
            return this.f31402a;
        }

        public final String b() {
            return this.f31403b;
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
            if (AbstractC3292y.d(this.f31402a, aVar.f31402a) && AbstractC3292y.d(this.f31403b, aVar.f31403b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f31402a.hashCode() * 31) + this.f31403b.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.f31402a + ", text=" + this.f31403b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f31402a);
            out.writeString(this.f31403b);
        }
    }

    /* renamed from: d4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0722b {
        private C0722b() {
        }

        private final String c(String str) {
            Object b9;
            Object obj = null;
            if (str == null) {
                return null;
            }
            C0722b c0722b = b.f31370C;
            try {
                s.a aVar = s.f8810b;
                byte[] decode = Base64.decode(str, 8);
                AbstractC3292y.h(decode, "decode(...)");
                b9 = s.b(new String(decode, C3338d.f34755b));
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (!s.g(b9)) {
                obj = b9;
            }
            return (String) obj;
        }

        private final String j(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void a(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            Iterator<String> keys = cresJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!b.f31372E.contains(next)) {
                    throw new d4.c(f.f31437c.b(), "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void b(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            if (AbstractC3292y.d("CRes", cresJson.optString("messageType"))) {
            } else {
                throw new d4.c(f.f31437c.b(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final b d(JSONObject cresJson) {
            b bVar;
            AbstractC3292y.i(cresJson, "cresJson");
            b(cresJson);
            boolean p8 = p(cresJson, "challengeCompletionInd", true);
            q qVar = new q(n(cresJson, "sdkTransID"));
            String uuid = n(cresJson, "threeDSServerTransID").toString();
            AbstractC3292y.h(uuid, "toString(...)");
            String uuid2 = n(cresJson, "acsTransID").toString();
            AbstractC3292y.h(uuid2, "toString(...)");
            String h8 = h(cresJson);
            List g8 = g(cresJson);
            if (p8) {
                a(cresJson);
                bVar = new b(uuid, uuid2, null, null, null, p8, null, null, null, null, false, null, null, null, null, g8, h8, null, null, null, null, null, qVar, null, null, null, null, m(cresJson).b(), 129925084, null);
            } else {
                boolean p9 = p(cresJson, "challengeInfoTextIndicator", false);
                String k8 = k(cresJson);
                JSONArray e8 = e(cresJson);
                g o8 = o(cresJson);
                String l8 = l(cresJson, o8);
                String f8 = f(cresJson, o8);
                String i8 = i(cresJson, o8);
                List a9 = a.f31401c.a(e8);
                String c8 = c(cresJson.optString("acsHTMLRefresh"));
                String optString = cresJson.optString("challengeInfoHeader");
                String optString2 = cresJson.optString("challengeInfoLabel");
                String optString3 = cresJson.optString("challengeInfoText");
                String optString4 = cresJson.optString("challengeAddInfo");
                String optString5 = cresJson.optString("expandInfoLabel");
                String optString6 = cresJson.optString("expandInfoText");
                d.a aVar = d.f31404d;
                bVar = new b(uuid, uuid2, f8, c8, o8, p8, optString, optString2, optString3, optString4, p9, a9, optString5, optString6, aVar.a(cresJson.optJSONObject("issuerImage")), g8, h8, cresJson.optString("oobAppURL"), cresJson.optString("oobAppLabel"), i8, aVar.a(cresJson.optJSONObject("psImage")), k8, qVar, l8, cresJson.optString("whitelistingInfoText"), cresJson.optString("whyInfoLabel"), cresJson.optString("whyInfoText"), "");
            }
            if (bVar.g0()) {
                return bVar;
            }
            throw d4.c.f31408d.b("UI fields missing");
        }

        public final JSONArray e(JSONObject cresJson) {
            Object b9;
            AbstractC3292y.i(cresJson, "cresJson");
            if (!cresJson.has("challengeSelectInfo")) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            C0722b c0722b = b.f31370C;
            try {
                s.a aVar = s.f8810b;
                b9 = s.b(cresJson.getJSONArray("challengeSelectInfo"));
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (s.e(b9) == null) {
                return (JSONArray) b9;
            }
            throw d4.c.f31408d.a("challengeSelectInfo");
        }

        public final String f(JSONObject cresJson, g uiType) {
            AbstractC3292y.i(cresJson, "cresJson");
            AbstractC3292y.i(uiType, "uiType");
            String j8 = j(cresJson, "acsHTML");
            if ((j8 != null && !n.T(j8)) || uiType != g.f31454h) {
                return c(j8);
            }
            throw d4.c.f31408d.b("acsHTML");
        }

        public final List g(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            List b9 = e.f31431e.b(cresJson.optJSONArray("messageExtension"));
            if (b9 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : b9) {
                    e eVar = (e) obj;
                    if (eVar.a() && !eVar.b()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new d4.c(f.f31440f, AbstractC1435t.w0(arrayList, ",", null, null, 0, null, null, 62, null));
                }
            }
            return b9;
        }

        public final String h(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            String optString = cresJson.optString("messageVersion");
            AbstractC3292y.f(optString);
            if (!(!n.T(optString))) {
                optString = null;
            }
            if (optString != null) {
                return optString;
            }
            throw d4.c.f31408d.b("messageVersion");
        }

        public final String i(JSONObject cresJson, g uiType) {
            AbstractC3292y.i(cresJson, "cresJson");
            AbstractC3292y.i(uiType, "uiType");
            String optString = cresJson.optString("oobContinueLabel");
            if ((optString != null && !n.T(optString)) || uiType != g.f31453g) {
                return optString;
            }
            throw d4.c.f31408d.b("oobContinueLabel");
        }

        public final String k(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            String j8 = j(cresJson, "resendInformationLabel");
            if (j8 != null && j8.length() == 0) {
                throw d4.c.f31408d.a("resendInformationLabel");
            }
            return j8;
        }

        public final String l(JSONObject cresJson, g uiType) {
            AbstractC3292y.i(cresJson, "cresJson");
            AbstractC3292y.i(uiType, "uiType");
            String j8 = j(cresJson, "submitAuthenticationLabel");
            if ((j8 != null && !n.T(j8)) || !uiType.d()) {
                return j8;
            }
            throw d4.c.f31408d.b("submitAuthenticationLabel");
        }

        public final u m(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            String optString = cresJson.optString("transStatus");
            if (optString != null && !n.T(optString)) {
                u a9 = u.f15542b.a(optString);
                if (a9 != null) {
                    return a9;
                }
                throw d4.c.f31408d.a("transStatus");
            }
            throw d4.c.f31408d.b("transStatus");
        }

        public final UUID n(JSONObject cresJson, String fieldName) {
            AbstractC3292y.i(cresJson, "cresJson");
            AbstractC3292y.i(fieldName, "fieldName");
            String optString = cresJson.optString(fieldName);
            if (optString != null && !n.T(optString)) {
                try {
                    s.a aVar = s.f8810b;
                    UUID fromString = UUID.fromString(optString);
                    AbstractC3292y.h(fromString, "fromString(...)");
                    return fromString;
                } catch (Throwable th) {
                    s.a aVar2 = s.f8810b;
                    if (s.e(s.b(t.a(th))) == null) {
                        throw new C1413h();
                    }
                    throw d4.c.f31408d.a(fieldName);
                }
            }
            throw d4.c.f31408d.b(fieldName);
        }

        public final g o(JSONObject cresJson) {
            AbstractC3292y.i(cresJson, "cresJson");
            String optString = cresJson.optString("acsUiType");
            if (optString != null && !n.T(optString)) {
                g a9 = g.f31449c.a(optString);
                if (a9 != null) {
                    return a9;
                }
                throw d4.c.f31408d.a("acsUiType");
            }
            throw d4.c.f31408d.b("acsUiType");
        }

        public final boolean p(JSONObject cresJson, String fieldName, boolean z8) {
            String j8;
            AbstractC3292y.i(cresJson, "cresJson");
            AbstractC3292y.i(fieldName, "fieldName");
            if (z8) {
                if (cresJson.has(fieldName)) {
                    j8 = cresJson.getString(fieldName);
                } else {
                    throw d4.c.f31408d.b(fieldName);
                }
            } else {
                j8 = j(cresJson, fieldName);
            }
            if (j8 != null && !b.f31371D.contains(j8)) {
                if (!z8 || !n.T(j8)) {
                    throw d4.c.f31408d.a(fieldName);
                }
                throw d4.c.f31408d.b(fieldName);
            }
            return AbstractC3292y.d("Y", j8);
        }

        public /* synthetic */ C0722b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            g valueOf;
            boolean z8;
            boolean z9;
            ArrayList arrayList;
            d createFromParcel;
            ArrayList arrayList2;
            d createFromParcel2;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = g.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(a.CREATOR.createFromParcel(parcel));
                }
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = d.CREATOR.createFromParcel(parcel);
            }
            d dVar = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    arrayList3.add(e.CREATOR.createFromParcel(parcel));
                    i9++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList3;
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = d.CREATOR.createFromParcel(parcel);
            }
            return new b(readString, readString2, readString3, readString4, valueOf, z8, readString5, readString6, readString7, readString8, z9, arrayList, readString9, readString10, dVar, arrayList2, readString11, readString12, readString13, readString14, createFromParcel2, parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f31405a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31406b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31407c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f31404d = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0723b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final d a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new d(jSONObject.optString("medium"), jSONObject.optString("high"), jSONObject.optString("extraHigh"));
                }
                return null;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: d4.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0723b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            this.f31405a = str;
            this.f31406b = str2;
            this.f31407c = str3;
        }

        public final String a() {
            Object obj;
            boolean z8;
            Iterator it = AbstractC1435t.p(this.f31407c, this.f31406b, this.f31405a).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String str = (String) obj;
                    if (str != null && !n.T(str)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (!z8) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (String) obj;
        }

        public final String b(int i8) {
            String str;
            if (i8 <= 160) {
                str = this.f31405a;
            } else if (i8 >= 320) {
                str = this.f31407c;
            } else {
                str = this.f31406b;
            }
            if (str == null || n.T(str)) {
                str = null;
            }
            if (str == null) {
                return a();
            }
            return str;
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
            if (AbstractC3292y.d(this.f31405a, dVar.f31405a) && AbstractC3292y.d(this.f31406b, dVar.f31406b) && AbstractC3292y.d(this.f31407c, dVar.f31407c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f31405a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f31406b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f31407c;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i10 + i8;
        }

        public String toString() {
            return "Image(mediumUrl=" + this.f31405a + ", highUrl=" + this.f31406b + ", extraHighUrl=" + this.f31407c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f31405a);
            out.writeString(this.f31406b);
            out.writeString(this.f31407c);
        }
    }

    public b(String serverTransId, String acsTransId, String str, String str2, g gVar, boolean z8, String str3, String str4, String str5, String str6, boolean z9, List list, String str7, String str8, d dVar, List list2, String messageVersion, String str9, String str10, String str11, d dVar2, String str12, q sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        AbstractC3292y.i(serverTransId, "serverTransId");
        AbstractC3292y.i(acsTransId, "acsTransId");
        AbstractC3292y.i(messageVersion, "messageVersion");
        AbstractC3292y.i(sdkTransId, "sdkTransId");
        this.f31375a = serverTransId;
        this.f31376b = acsTransId;
        this.f31377c = str;
        this.f31378d = str2;
        this.f31379e = gVar;
        this.f31380f = z8;
        this.f31381g = str3;
        this.f31382h = str4;
        this.f31383i = str5;
        this.f31384j = str6;
        this.f31385k = z9;
        this.f31386l = list;
        this.f31387m = str7;
        this.f31388n = str8;
        this.f31389o = dVar;
        this.f31390p = list2;
        this.f31391q = messageVersion;
        this.f31392r = str9;
        this.f31393s = str10;
        this.f31394t = str11;
        this.f31395u = dVar2;
        this.f31396v = str12;
        this.f31397w = sdkTransId;
        this.f31398x = str13;
        this.f31399y = str14;
        this.f31400z = str15;
        this.f31373A = str16;
        this.f31374B = str17;
    }

    public final String I() {
        return this.f31394t;
    }

    public final d Q() {
        return this.f31395u;
    }

    public final String U() {
        return this.f31396v;
    }

    public final q W() {
        return this.f31397w;
    }

    public final String X() {
        return this.f31375a;
    }

    public final boolean Y() {
        return this.f31385k;
    }

    public final String Z() {
        return this.f31398x;
    }

    public final String a0() {
        return this.f31374B;
    }

    public final g b0() {
        return this.f31379e;
    }

    public final String c0() {
        return this.f31399y;
    }

    public final String d0() {
        return this.f31400z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e0() {
        return this.f31373A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f31375a, bVar.f31375a) && AbstractC3292y.d(this.f31376b, bVar.f31376b) && AbstractC3292y.d(this.f31377c, bVar.f31377c) && AbstractC3292y.d(this.f31378d, bVar.f31378d) && this.f31379e == bVar.f31379e && this.f31380f == bVar.f31380f && AbstractC3292y.d(this.f31381g, bVar.f31381g) && AbstractC3292y.d(this.f31382h, bVar.f31382h) && AbstractC3292y.d(this.f31383i, bVar.f31383i) && AbstractC3292y.d(this.f31384j, bVar.f31384j) && this.f31385k == bVar.f31385k && AbstractC3292y.d(this.f31386l, bVar.f31386l) && AbstractC3292y.d(this.f31387m, bVar.f31387m) && AbstractC3292y.d(this.f31388n, bVar.f31388n) && AbstractC3292y.d(this.f31389o, bVar.f31389o) && AbstractC3292y.d(this.f31390p, bVar.f31390p) && AbstractC3292y.d(this.f31391q, bVar.f31391q) && AbstractC3292y.d(this.f31392r, bVar.f31392r) && AbstractC3292y.d(this.f31393s, bVar.f31393s) && AbstractC3292y.d(this.f31394t, bVar.f31394t) && AbstractC3292y.d(this.f31395u, bVar.f31395u) && AbstractC3292y.d(this.f31396v, bVar.f31396v) && AbstractC3292y.d(this.f31397w, bVar.f31397w) && AbstractC3292y.d(this.f31398x, bVar.f31398x) && AbstractC3292y.d(this.f31399y, bVar.f31399y) && AbstractC3292y.d(this.f31400z, bVar.f31400z) && AbstractC3292y.d(this.f31373A, bVar.f31373A) && AbstractC3292y.d(this.f31374B, bVar.f31374B)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31377c;
    }

    public final boolean f0() {
        return this.f31380f;
    }

    public final boolean g0() {
        List list;
        boolean z8;
        g gVar = this.f31379e;
        if (gVar == null) {
            return true;
        }
        boolean z9 = false;
        if (gVar == g.f31454h) {
            String str = this.f31377c;
            if (str == null || n.T(str)) {
                z9 = true;
            }
            return !z9;
        }
        Set i8 = a0.i(this.f31381g, this.f31382h, this.f31383i, this.f31400z, this.f31373A, this.f31387m, this.f31388n, this.f31396v);
        if (!(i8 instanceof Collection) || !i8.isEmpty()) {
            Iterator it = i8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && !n.T(str2)) {
                    g gVar2 = this.f31379e;
                    if (gVar2 == g.f31453g) {
                        Set<String> i9 = a0.i(this.f31393s, this.f31392r, this.f31394t);
                        if (!(i9 instanceof Collection) || !i9.isEmpty()) {
                            for (String str3 : i9) {
                                if (str3 != null && !n.T(str3)) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (!z8) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if ((gVar2 != g.f31451e && gVar2 != g.f31452f) || ((list = this.f31386l) != null && !list.isEmpty())) {
                        String str4 = this.f31398x;
                        if (str4 == null || n.T(str4)) {
                            z9 = true;
                        }
                        return !z9;
                    }
                }
            }
        }
        return false;
    }

    public final String h() {
        return this.f31378d;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22 = ((this.f31375a.hashCode() * 31) + this.f31376b.hashCode()) * 31;
        String str = this.f31377c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode22 + hashCode) * 31;
        String str2 = this.f31378d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        g gVar = this.f31379e;
        if (gVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        boolean z8 = this.f31380f;
        int i12 = 1;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        String str3 = this.f31381g;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f31382h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str5 = this.f31383i;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str6 = this.f31384j;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        boolean z9 = this.f31385k;
        if (!z9) {
            i12 = z9 ? 1 : 0;
        }
        int i19 = (i18 + i12) * 31;
        List list = this.f31386l;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        String str7 = this.f31387m;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i21 = (i20 + hashCode9) * 31;
        String str8 = this.f31388n;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        d dVar = this.f31389o;
        if (dVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = dVar.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List list2 = this.f31390p;
        if (list2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list2.hashCode();
        }
        int hashCode23 = (((i23 + hashCode12) * 31) + this.f31391q.hashCode()) * 31;
        String str9 = this.f31392r;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i24 = (hashCode23 + hashCode13) * 31;
        String str10 = this.f31393s;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i25 = (i24 + hashCode14) * 31;
        String str11 = this.f31394t;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i26 = (i25 + hashCode15) * 31;
        d dVar2 = this.f31395u;
        if (dVar2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = dVar2.hashCode();
        }
        int i27 = (i26 + hashCode16) * 31;
        String str12 = this.f31396v;
        if (str12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str12.hashCode();
        }
        int hashCode24 = (((i27 + hashCode17) * 31) + this.f31397w.hashCode()) * 31;
        String str13 = this.f31398x;
        if (str13 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str13.hashCode();
        }
        int i28 = (hashCode24 + hashCode18) * 31;
        String str14 = this.f31399y;
        if (str14 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str14.hashCode();
        }
        int i29 = (i28 + hashCode19) * 31;
        String str15 = this.f31400z;
        if (str15 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str15.hashCode();
        }
        int i30 = (i29 + hashCode20) * 31;
        String str16 = this.f31373A;
        if (str16 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str16.hashCode();
        }
        int i31 = (i30 + hashCode21) * 31;
        String str17 = this.f31374B;
        if (str17 != null) {
            i8 = str17.hashCode();
        }
        return i31 + i8;
    }

    public final String i() {
        return this.f31376b;
    }

    public final String l() {
        return this.f31384j;
    }

    public final String p() {
        return this.f31381g;
    }

    public final String s() {
        return this.f31382h;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.f31375a + ", acsTransId=" + this.f31376b + ", acsHtml=" + this.f31377c + ", acsHtmlRefresh=" + this.f31378d + ", uiType=" + this.f31379e + ", isChallengeCompleted=" + this.f31380f + ", challengeInfoHeader=" + this.f31381g + ", challengeInfoLabel=" + this.f31382h + ", challengeInfoText=" + this.f31383i + ", challengeAdditionalInfoText=" + this.f31384j + ", shouldShowChallengeInfoTextIndicator=" + this.f31385k + ", challengeSelectOptions=" + this.f31386l + ", expandInfoLabel=" + this.f31387m + ", expandInfoText=" + this.f31388n + ", issuerImage=" + this.f31389o + ", messageExtensions=" + this.f31390p + ", messageVersion=" + this.f31391q + ", oobAppUrl=" + this.f31392r + ", oobAppLabel=" + this.f31393s + ", oobContinueLabel=" + this.f31394t + ", paymentSystemImage=" + this.f31395u + ", resendInformationLabel=" + this.f31396v + ", sdkTransId=" + this.f31397w + ", submitAuthenticationLabel=" + this.f31398x + ", whitelistingInfoText=" + this.f31399y + ", whyInfoLabel=" + this.f31400z + ", whyInfoText=" + this.f31373A + ", transStatus=" + this.f31374B + ")";
    }

    public final String u() {
        return this.f31383i;
    }

    public final List v() {
        return this.f31386l;
    }

    public final String w() {
        return this.f31387m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31375a);
        out.writeString(this.f31376b);
        out.writeString(this.f31377c);
        out.writeString(this.f31378d);
        g gVar = this.f31379e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gVar.name());
        }
        out.writeInt(this.f31380f ? 1 : 0);
        out.writeString(this.f31381g);
        out.writeString(this.f31382h);
        out.writeString(this.f31383i);
        out.writeString(this.f31384j);
        out.writeInt(this.f31385k ? 1 : 0);
        List list = this.f31386l;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f31387m);
        out.writeString(this.f31388n);
        d dVar = this.f31389o;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        List list2 = this.f31390p;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f31391q);
        out.writeString(this.f31392r);
        out.writeString(this.f31393s);
        out.writeString(this.f31394t);
        d dVar2 = this.f31395u;
        if (dVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar2.writeToParcel(out, i8);
        }
        out.writeString(this.f31396v);
        this.f31397w.writeToParcel(out, i8);
        out.writeString(this.f31398x);
        out.writeString(this.f31399y);
        out.writeString(this.f31400z);
        out.writeString(this.f31373A);
        out.writeString(this.f31374B);
    }

    public final String x() {
        return this.f31388n;
    }

    public final d y() {
        return this.f31389o;
    }

    public final String z() {
        return this.f31391q;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, g gVar, boolean z8, String str5, String str6, String str7, String str8, boolean z9, List list, String str9, String str10, d dVar, List list2, String str11, String str12, String str13, String str14, d dVar2, String str15, q qVar, String str16, String str17, String str18, String str19, String str20, int i8, AbstractC3284p abstractC3284p) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : str6, (i8 & 256) != 0 ? null : str7, (i8 & 512) != 0 ? null : str8, (i8 & 1024) != 0 ? false : z9, (i8 & 2048) != 0 ? null : list, (i8 & 4096) != 0 ? null : str9, (i8 & 8192) != 0 ? null : str10, (i8 & 16384) != 0 ? null : dVar, (32768 & i8) != 0 ? null : list2, str11, (131072 & i8) != 0 ? null : str12, (262144 & i8) != 0 ? null : str13, (524288 & i8) != 0 ? null : str14, (1048576 & i8) != 0 ? null : dVar2, (2097152 & i8) != 0 ? null : str15, qVar, (8388608 & i8) != 0 ? null : str16, (16777216 & i8) != 0 ? null : str17, (33554432 & i8) != 0 ? null : str18, (67108864 & i8) != 0 ? null : str19, (i8 & 134217728) != 0 ? null : str20);
    }
}

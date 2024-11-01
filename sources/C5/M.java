package c5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3770C;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class M implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f15634a;

    /* renamed from: b, reason: collision with root package name */
    private String f15635b;

    /* renamed from: c, reason: collision with root package name */
    private String f15636c;

    /* renamed from: d, reason: collision with root package name */
    private String f15637d;

    /* renamed from: e, reason: collision with root package name */
    private long f15638e;

    /* renamed from: f, reason: collision with root package name */
    private String f15639f;

    /* renamed from: g, reason: collision with root package name */
    private int f15640g;

    /* renamed from: h, reason: collision with root package name */
    private int f15641h;

    /* renamed from: i, reason: collision with root package name */
    private String f15642i;

    /* renamed from: j, reason: collision with root package name */
    private int f15643j;

    /* renamed from: k, reason: collision with root package name */
    private int f15644k;

    /* renamed from: l, reason: collision with root package name */
    private String f15645l;

    /* renamed from: m, reason: collision with root package name */
    private int f15646m;

    /* renamed from: n, reason: collision with root package name */
    private String f15647n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f15633o = new b(null);
    public static Parcelable.Creator<M> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public M createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new M(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public M[] newArray(int i8) {
            return new M[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f15648a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f15649b;

            /* renamed from: d, reason: collision with root package name */
            int f15651d;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f15649b = obj;
                this.f15651d |= Integer.MIN_VALUE;
                return b.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c5.M$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0373b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f15652a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f15653b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M f15654c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f15655d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0373b(Context context, M m8, kotlin.jvm.internal.Q q8, U5.d dVar) {
                super(2, dVar);
                this.f15653b = context;
                this.f15654c = m8;
                this.f15655d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0373b(this.f15653b, this.f15654c, this.f15655d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f15652a == 0) {
                    Q5.t.b(obj);
                    K z02 = new C3775H(this.f15653b).z0(this.f15654c.l());
                    if (!z02.b() && z02.d() != null) {
                        String d8 = z02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f15655d.f34571a = jSONObject.getInt("success");
                        }
                        if (this.f15655d.f34571a == 1) {
                            int p8 = this.f15654c.p();
                            this.f15654c.a0(p8 + 1);
                            kotlin.coroutines.jvm.internal.b.c(p8);
                        } else {
                            C3770C.f37260a.l(this.f15654c.l());
                        }
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0373b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        private b() {
        }

        public final M a(JSONObject jsonObject) {
            AbstractC3292y.i(jsonObject, "jsonObject");
            M m8 = new M();
            if (!jsonObject.isNull("id")) {
                m8.Z(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("userID")) {
                m8.f0(jsonObject.getString("userID"));
                if (!jsonObject.isNull("userName")) {
                    m8.g0(jsonObject.getString("userName"));
                }
                if (!jsonObject.isNull("userAvatar")) {
                    m8.Y(jsonObject.getString("userAvatar"));
                }
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                m8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_STAR)) {
                m8.b0(jsonObject.getInt(CampaignEx.JSON_KEY_STAR));
            }
            if (!jsonObject.isNull("totalAnswers")) {
                m8.Q(jsonObject.getInt("totalAnswers"));
            }
            if (!jsonObject.isNull("timeAgo")) {
                m8.d0(jsonObject.getString("timeAgo"));
            }
            if (!jsonObject.isNull("likes")) {
                m8.a0(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isAuthorVerified")) {
                m8.X(jsonObject.getInt("isAuthorVerified"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                m8.e0(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                m8.h0(jsonObject.getString("usernameFormat"));
            }
            return m8;
        }

        public final boolean b(Context context, String str) {
            if (context == null) {
                return false;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            String s8 = aVar.s(context);
            String t8 = aVar.t(context);
            if (t8 == null) {
                t8 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            if (str == null || !l6.n.s(str, s8, true) || System.currentTimeMillis() - Long.parseLong(t8) >= 600000) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(c5.M r7, android.content.Context r8, U5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof c5.M.b.a
                if (r0 == 0) goto L13
                r0 = r9
                c5.M$b$a r0 = (c5.M.b.a) r0
                int r1 = r0.f15651d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15651d = r1
                goto L18
            L13:
                c5.M$b$a r0 = new c5.M$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f15649b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f15651d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f15648a
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                Q5.t.b(r9)
                goto L5c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                Q5.t.b(r9)
                q5.C r9 = q5.C3770C.f37260a
                long r4 = r7.l()
                r9.b(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                n6.I r2 = n6.C3445b0.b()
                c5.M$b$b r4 = new c5.M$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f15648a = r9
                r0.f15651d = r3
                java.lang.Object r7 = n6.AbstractC3458i.g(r2, r4, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                r7 = r9
            L5c:
                int r7 = r7.f34571a
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.M.b.c(c5.M, android.content.Context, U5.d):java.lang.Object");
        }

        public final void d(M m8, JSONObject jsonObject) {
            AbstractC3292y.i(m8, "<this>");
            AbstractC3292y.i(jsonObject, "jsonObject");
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_STAR)) {
                m8.b0(jsonObject.getInt(CampaignEx.JSON_KEY_STAR));
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                m8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
        }

        public final ArrayList e(JSONArray jsonArray) {
            AbstractC3292y.i(jsonArray, "jsonArray");
            ArrayList arrayList = new ArrayList();
            try {
                int length = jsonArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject jSONObject = jsonArray.getJSONObject(i8);
                    AbstractC3292y.h(jSONObject, "getJSONObject(...)");
                    arrayList.add(a(jSONObject));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return arrayList;
        }

        public final void f(Context context, String str, String str2) {
            if (context != null) {
                if (str != null && str.length() != 0) {
                    SettingsPreferences.f30529b.K0(context, str);
                }
                if (str2 != null && str2.length() != 0) {
                    SettingsPreferences.f30529b.L0(context, str2);
                }
            }
        }

        public final M g(JSONObject jsonObject) {
            AbstractC3292y.i(jsonObject, "jsonObject");
            M m8 = new M();
            if (!jsonObject.isNull("id")) {
                m8.Z(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("appName")) {
                m8.W(jsonObject.getString("appName"));
            }
            if (!jsonObject.isNull("appID")) {
                m8.U(jsonObject.getLong("appID"));
            }
            if (!jsonObject.isNull("appIcon")) {
                m8.Y(jsonObject.getString("appIcon"));
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                m8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull("rate")) {
                m8.b0(jsonObject.getInt("rate"));
            }
            if (!jsonObject.isNull("publishedDate")) {
                m8.d0(jsonObject.getString("publishedDate"));
            }
            if (!jsonObject.isNull("likes")) {
                m8.a0(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                m8.e0(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                m8.h0(jsonObject.getString("usernameFormat"));
            }
            if (!jsonObject.isNull("totalAnswers")) {
                m8.Q(jsonObject.getInt("totalAnswers"));
            }
            return m8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final M f15656a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15657b;

        public c(M review, int i8) {
            AbstractC3292y.i(review, "review");
            this.f15656a = review;
            this.f15657b = i8;
        }

        public final M a() {
            return this.f15656a;
        }

        public final int b() {
            return this.f15657b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f15656a, cVar.f15656a) && this.f15657b == cVar.f15657b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f15656a.hashCode() * 31) + this.f15657b;
        }

        public String toString() {
            return "ReviewLikeData(review=" + this.f15656a + ", reviewLikedSuccessfully=" + this.f15657b + ')';
        }
    }

    public M() {
    }

    public final boolean I() {
        if (this.f15646m == 1) {
            return true;
        }
        return false;
    }

    public final void Q(int i8) {
        this.f15641h = i8;
    }

    public final void U(long j8) {
        this.f15638e = j8;
    }

    public final void W(String str) {
        this.f15645l = str;
    }

    public final void X(int i8) {
        this.f15644k = i8;
    }

    public final void Y(String str) {
        this.f15637d = str;
    }

    public final void Z(long j8) {
        this.f15634a = j8;
    }

    public final int a() {
        return this.f15641h;
    }

    public final void a0(int i8) {
        this.f15643j = i8;
    }

    public final long b() {
        return this.f15638e;
    }

    public final void b0(int i8) {
        this.f15640g = i8;
    }

    public final void c0(String str) {
        this.f15639f = str;
    }

    public final void d0(String str) {
        this.f15642i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void e0(int i8) {
        this.f15646m = i8;
    }

    public final String f() {
        return this.f15645l;
    }

    public final void f0(String str) {
        this.f15635b = str;
    }

    public final void g0(String str) {
        this.f15636c = str;
    }

    public final int h() {
        return this.f15644k;
    }

    public final void h0(String str) {
        this.f15647n = str;
    }

    public final String i() {
        return this.f15637d;
    }

    public final long l() {
        return this.f15634a;
    }

    public final int p() {
        return this.f15643j;
    }

    public final int s() {
        return this.f15640g;
    }

    public final String u() {
        return this.f15639f;
    }

    public final Spanned v() {
        String str = this.f15639f;
        if (str == null) {
            return null;
        }
        C3770C c3770c = C3770C.f37260a;
        AbstractC3292y.f(str);
        return c3770c.c(l6.n.z(str, "\n", "<br />", false, 4, null));
    }

    public final String w() {
        return this.f15642i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeLong(this.f15634a);
        parcel.writeLong(this.f15638e);
        parcel.writeString(this.f15636c);
        parcel.writeString(this.f15635b);
        parcel.writeString(this.f15637d);
        parcel.writeString(this.f15639f);
        parcel.writeInt(this.f15640g);
        parcel.writeInt(this.f15641h);
        parcel.writeString(this.f15642i);
        parcel.writeInt(this.f15643j);
        parcel.writeInt(this.f15644k);
        parcel.writeString(this.f15645l);
        parcel.writeInt(this.f15646m);
        parcel.writeString(this.f15647n);
    }

    public final String x() {
        return this.f15635b;
    }

    public final String y() {
        return this.f15636c;
    }

    public final String z() {
        return this.f15647n;
    }

    public M(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15634a = source.readLong();
        this.f15638e = source.readLong();
        this.f15636c = source.readString();
        this.f15635b = source.readString();
        this.f15637d = source.readString();
        this.f15639f = source.readString();
        this.f15640g = source.readInt();
        this.f15641h = source.readInt();
        this.f15642i = source.readString();
        this.f15643j = source.readInt();
        this.f15644k = source.readInt();
        this.f15645l = source.readString();
        this.f15646m = source.readInt();
        this.f15647n = source.readString();
    }
}

package c5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3770C;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class I implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f15601a;

    /* renamed from: b, reason: collision with root package name */
    private String f15602b;

    /* renamed from: c, reason: collision with root package name */
    private String f15603c;

    /* renamed from: d, reason: collision with root package name */
    private String f15604d;

    /* renamed from: e, reason: collision with root package name */
    private long f15605e;

    /* renamed from: f, reason: collision with root package name */
    private String f15606f;

    /* renamed from: g, reason: collision with root package name */
    private String f15607g;

    /* renamed from: h, reason: collision with root package name */
    private int f15608h;

    /* renamed from: i, reason: collision with root package name */
    private int f15609i;

    /* renamed from: j, reason: collision with root package name */
    private int f15610j;

    /* renamed from: k, reason: collision with root package name */
    private String f15611k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f15600l = new b(null);
    public static Parcelable.Creator<I> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public I createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new I(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I[] newArray(int i8) {
            return new I[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f15612a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f15613b;

            /* renamed from: d, reason: collision with root package name */
            int f15615d;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f15613b = obj;
                this.f15615d |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c5.I$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0372b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f15616a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f15617b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f15618c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f15619d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0372b(Context context, I i8, kotlin.jvm.internal.Q q8, U5.d dVar) {
                super(2, dVar);
                this.f15617b = context;
                this.f15618c = i8;
                this.f15619d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0372b(this.f15617b, this.f15618c, this.f15619d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f15616a == 0) {
                    Q5.t.b(obj);
                    K y02 = new C3775H(this.f15617b).y0(this.f15618c.f());
                    if (!y02.b() && y02.d() != null) {
                        String d8 = y02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f15619d.f34571a = jSONObject.getInt("success");
                        }
                        if (this.f15619d.f34571a == 1) {
                            this.f15618c.z(this.f15618c.h() + 1);
                        }
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0372b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        private b() {
        }

        public final I a(JSONObject jsonObject) {
            AbstractC3292y.i(jsonObject, "jsonObject");
            I i8 = new I();
            if (!jsonObject.isNull("id")) {
                i8.y(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("userName")) {
                i8.X(jsonObject.getString("userName"));
                if (!jsonObject.isNull("userAvatar")) {
                    i8.x(jsonObject.getString("userAvatar"));
                }
                if (!jsonObject.isNull("userID")) {
                    i8.W(jsonObject.getString("userID"));
                }
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                i8.I(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull("timeAgo")) {
                i8.Q(jsonObject.getString("timeAgo"));
            }
            if (!jsonObject.isNull("likes")) {
                i8.z(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isAuthorVerified")) {
                i8.w(jsonObject.getInt("isAuthorVerified"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                i8.U(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                i8.Y(jsonObject.getString("usernameFormat"));
            }
            return i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(c5.I r7, android.content.Context r8, U5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof c5.I.b.a
                if (r0 == 0) goto L13
                r0 = r9
                c5.I$b$a r0 = (c5.I.b.a) r0
                int r1 = r0.f15615d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15615d = r1
                goto L18
            L13:
                c5.I$b$a r0 = new c5.I$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f15613b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f15615d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f15612a
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
                long r4 = r7.f()
                r9.a(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                n6.I r2 = n6.C3445b0.b()
                c5.I$b$b r4 = new c5.I$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f15612a = r9
                r0.f15615d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: c5.I.b.b(c5.I, android.content.Context, U5.d):java.lang.Object");
        }

        public final ArrayList c(JSONArray jsonArray) {
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

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public I() {
    }

    public final void I(String str) {
        this.f15606f = str;
    }

    public final void Q(String str) {
        this.f15607g = str;
    }

    public final void U(int i8) {
        this.f15610j = i8;
    }

    public final void W(String str) {
        this.f15603c = str;
    }

    public final void X(String str) {
        this.f15602b = str;
    }

    public final void Y(String str) {
        this.f15611k = str;
    }

    public final int a() {
        return this.f15609i;
    }

    public final String b() {
        return this.f15604d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final long f() {
        return this.f15601a;
    }

    public final int h() {
        return this.f15608h;
    }

    public final Spanned i() {
        String str = this.f15606f;
        if (str == null) {
            return null;
        }
        C3770C c3770c = C3770C.f37260a;
        AbstractC3292y.f(str);
        return c3770c.c(l6.n.z(str, "\n", "<br />", false, 4, null));
    }

    public final String l() {
        return this.f15607g;
    }

    public final String p() {
        return this.f15603c;
    }

    public final String s() {
        return this.f15602b;
    }

    public final String u() {
        return this.f15611k;
    }

    public final boolean v() {
        if (this.f15610j == 1) {
            return true;
        }
        return false;
    }

    public final void w(int i8) {
        this.f15609i = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeLong(this.f15601a);
        parcel.writeLong(this.f15605e);
        parcel.writeString(this.f15602b);
        parcel.writeString(this.f15603c);
        parcel.writeString(this.f15604d);
        parcel.writeString(this.f15606f);
        parcel.writeString(this.f15607g);
        parcel.writeInt(this.f15608h);
        parcel.writeInt(this.f15609i);
        parcel.writeInt(this.f15610j);
        parcel.writeString(this.f15611k);
    }

    public final void x(String str) {
        this.f15604d = str;
    }

    public final void y(long j8) {
        this.f15601a = j8;
    }

    public final void z(int i8) {
        this.f15608h = i8;
    }

    public I(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15601a = source.readLong();
        this.f15605e = source.readLong();
        this.f15602b = source.readString();
        this.f15603c = source.readString();
        this.f15604d = source.readString();
        this.f15606f = source.readString();
        this.f15607g = source.readString();
        this.f15608h = source.readInt();
        this.f15609i = source.readInt();
        this.f15610j = source.readInt();
        this.f15611k = source.readString();
    }
}

package g3;

import C6.AbstractC1012d0;
import C6.AbstractC1034y;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import C6.n0;
import C6.r0;
import R5.AbstractC1435t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2916o implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f32179a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32180b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32181c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32182d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32183e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C2916o> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final y6.b[] f32178f = {null, null, null, null, new C1013e(d.a.f32189a)};

    /* renamed from: g3.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32184a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f32185b;

        static {
            a aVar = new a();
            f32184a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.model.ConsumerSession", aVar, 5);
            c1014e0.k("client_secret", true);
            c1014e0.k("email_address", false);
            c1014e0.k("redacted_formatted_phone_number", false);
            c1014e0.k("redacted_phone_number", false);
            c1014e0.k("verification_sessions", true);
            f32185b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f32185b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b bVar = C2916o.f32178f[4];
            r0 r0Var = r0.f1092a;
            return new y6.b[]{r0Var, r0Var, r0Var, r0Var, bVar};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2916o d(B6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = C2916o.f32178f;
            String str5 = null;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                String o9 = c8.o(a9, 1);
                String o10 = c8.o(a9, 2);
                String o11 = c8.o(a9, 3);
                list = (List) c8.p(a9, 4, bVarArr[4], null);
                str = o8;
                str4 = o11;
                str3 = o10;
                str2 = o9;
                i8 = 31;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 != 2) {
                                    if (y8 != 3) {
                                        if (y8 == 4) {
                                            list2 = (List) c8.p(a9, 4, bVarArr[4], list2);
                                            i9 |= 16;
                                        } else {
                                            throw new y6.l(y8);
                                        }
                                    } else {
                                        str8 = c8.o(a9, 3);
                                        i9 |= 8;
                                    }
                                } else {
                                    str7 = c8.o(a9, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = c8.o(a9, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = c8.o(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
                list = list2;
            }
            c8.a(a9);
            return new C2916o(i8, str, str2, str3, str4, list, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C2916o value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C2916o.i(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: g3.o$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f32184a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.o$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2916o createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(d.CREATOR.createFromParcel(parcel));
            }
            return new C2916o(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2916o[] newArray(int i8) {
            return new C2916o[i8];
        }
    }

    @y6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g3.o$d */
    /* loaded from: classes4.dex */
    public static final class d implements z2.f {

        /* renamed from: a, reason: collision with root package name */
        private final e f32187a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0743d f32188b;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: c, reason: collision with root package name */
        private static final y6.b[] f32186c = {AbstractC1034y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", e.values()), AbstractC1034y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", EnumC0743d.values())};

        /* renamed from: g3.o$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements C6.C {

            /* renamed from: a, reason: collision with root package name */
            public static final a f32189a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1014e0 f32190b;

            static {
                a aVar = new a();
                f32189a = aVar;
                C1014e0 c1014e0 = new C1014e0("com.stripe.android.model.ConsumerSession.VerificationSession", aVar, 2);
                c1014e0.k("type", false);
                c1014e0.k("state", false);
                f32190b = c1014e0;
            }

            private a() {
            }

            @Override // y6.b, y6.i, y6.InterfaceC4248a
            public A6.f a() {
                return f32190b;
            }

            @Override // C6.C
            public y6.b[] b() {
                return C.a.a(this);
            }

            @Override // C6.C
            public y6.b[] c() {
                y6.b[] bVarArr = d.f32186c;
                return new y6.b[]{bVarArr[0], bVarArr[1]};
            }

            @Override // y6.InterfaceC4248a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public d d(B6.e decoder) {
                EnumC0743d enumC0743d;
                e eVar;
                int i8;
                AbstractC3292y.i(decoder, "decoder");
                A6.f a9 = a();
                B6.c c8 = decoder.c(a9);
                y6.b[] bVarArr = d.f32186c;
                n0 n0Var = null;
                if (c8.z()) {
                    eVar = (e) c8.p(a9, 0, bVarArr[0], null);
                    enumC0743d = (EnumC0743d) c8.p(a9, 1, bVarArr[1], null);
                    i8 = 3;
                } else {
                    EnumC0743d enumC0743d2 = null;
                    e eVar2 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int y8 = c8.y(a9);
                        if (y8 != -1) {
                            if (y8 != 0) {
                                if (y8 == 1) {
                                    enumC0743d2 = (EnumC0743d) c8.p(a9, 1, bVarArr[1], enumC0743d2);
                                    i9 |= 2;
                                } else {
                                    throw new y6.l(y8);
                                }
                            } else {
                                eVar2 = (e) c8.p(a9, 0, bVarArr[0], eVar2);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    enumC0743d = enumC0743d2;
                    eVar = eVar2;
                    i8 = i9;
                }
                c8.a(a9);
                return new d(i8, eVar, enumC0743d, n0Var);
            }

            @Override // y6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(B6.f encoder, d value) {
                AbstractC3292y.i(encoder, "encoder");
                AbstractC3292y.i(value, "value");
                A6.f a9 = a();
                B6.d c8 = encoder.c(a9);
                d.h(value, c8, a9);
                c8.a(a9);
            }
        }

        /* renamed from: g3.o$d$b */
        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final y6.b serializer() {
                return a.f32189a;
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: g3.o$d$c */
        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(e.CREATOR.createFromParcel(parcel), EnumC0743d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: g3.o$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0743d implements Parcelable {
            public static final Parcelable.Creator<EnumC0743d> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f32191b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0743d f32192c = new EnumC0743d("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0743d f32193d = new EnumC0743d("Started", 1, "started");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0743d f32194e = new EnumC0743d("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC0743d f32195f = new EnumC0743d("Verified", 3, "verified");

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC0743d f32196g = new EnumC0743d("Canceled", 4, "canceled");

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC0743d f32197h = new EnumC0743d("Expired", 5, "expired");

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ EnumC0743d[] f32198i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ W5.a f32199j;

            /* renamed from: a, reason: collision with root package name */
            private final String f32200a;

            /* renamed from: g3.o$d$d$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final EnumC0743d a(String value) {
                    Object obj;
                    AbstractC3292y.i(value, "value");
                    Iterator<E> it = EnumC0743d.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (l6.n.s(((EnumC0743d) obj).f(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    EnumC0743d enumC0743d = (EnumC0743d) obj;
                    if (enumC0743d == null) {
                        return EnumC0743d.f32192c;
                    }
                    return enumC0743d;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: g3.o$d$d$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EnumC0743d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return EnumC0743d.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC0743d[] newArray(int i8) {
                    return new EnumC0743d[i8];
                }
            }

            static {
                EnumC0743d[] a9 = a();
                f32198i = a9;
                f32199j = W5.b.a(a9);
                f32191b = new a(null);
                CREATOR = new b();
            }

            private EnumC0743d(String str, int i8, String str2) {
                this.f32200a = str2;
            }

            private static final /* synthetic */ EnumC0743d[] a() {
                return new EnumC0743d[]{f32192c, f32193d, f32194e, f32195f, f32196g, f32197h};
            }

            public static W5.a b() {
                return f32199j;
            }

            public static EnumC0743d valueOf(String str) {
                return (EnumC0743d) Enum.valueOf(EnumC0743d.class, str);
            }

            public static EnumC0743d[] values() {
                return (EnumC0743d[]) f32198i.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String f() {
                return this.f32200a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: g3.o$d$e */
        /* loaded from: classes4.dex */
        public static final class e implements Parcelable {
            public static final Parcelable.Creator<e> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f32201b;

            /* renamed from: c, reason: collision with root package name */
            public static final e f32202c = new e("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final e f32203d = new e("SignUp", 1, "signup");

            /* renamed from: e, reason: collision with root package name */
            public static final e f32204e = new e("Email", 2, NotificationCompat.CATEGORY_EMAIL);

            /* renamed from: f, reason: collision with root package name */
            public static final e f32205f = new e("Sms", 3, "sms");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ e[] f32206g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ W5.a f32207h;

            /* renamed from: a, reason: collision with root package name */
            private final String f32208a;

            /* renamed from: g3.o$d$e$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final e a(String value) {
                    Object obj;
                    AbstractC3292y.i(value, "value");
                    Iterator<E> it = e.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (l6.n.s(((e) obj).f(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    e eVar = (e) obj;
                    if (eVar == null) {
                        return e.f32202c;
                    }
                    return eVar;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: g3.o$d$e$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return e.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            static {
                e[] a9 = a();
                f32206g = a9;
                f32207h = W5.b.a(a9);
                f32201b = new a(null);
                CREATOR = new b();
            }

            private e(String str, int i8, String str2) {
                this.f32208a = str2;
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f32202c, f32203d, f32204e, f32205f};
            }

            public static W5.a b() {
                return f32207h;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f32206g.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String f() {
                return this.f32208a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(name());
            }
        }

        public /* synthetic */ d(int i8, e eVar, EnumC0743d enumC0743d, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC1012d0.a(i8, 3, a.f32189a.a());
            }
            this.f32187a = eVar;
            this.f32188b = enumC0743d;
        }

        public static final /* synthetic */ void h(d dVar, B6.d dVar2, A6.f fVar) {
            y6.b[] bVarArr = f32186c;
            dVar2.n(fVar, 0, bVarArr[0], dVar.f32187a);
            dVar2.n(fVar, 1, bVarArr[1], dVar.f32188b);
        }

        public final EnumC0743d b() {
            return this.f32188b;
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
            if (this.f32187a == dVar.f32187a && this.f32188b == dVar.f32188b) {
                return true;
            }
            return false;
        }

        public final e f() {
            return this.f32187a;
        }

        public int hashCode() {
            return (this.f32187a.hashCode() * 31) + this.f32188b.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.f32187a + ", state=" + this.f32188b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f32187a.writeToParcel(out, i8);
            this.f32188b.writeToParcel(out, i8);
        }

        public d(e type, EnumC0743d state) {
            AbstractC3292y.i(type, "type");
            AbstractC3292y.i(state, "state");
            this.f32187a = type;
            this.f32188b = state;
        }
    }

    public /* synthetic */ C2916o(int i8, String str, String str2, String str3, String str4, List list, n0 n0Var) {
        if (14 != (i8 & 14)) {
            AbstractC1012d0.a(i8, 14, a.f32184a.a());
        }
        this.f32179a = (i8 & 1) == 0 ? "" : str;
        this.f32180b = str2;
        this.f32181c = str3;
        this.f32182d = str4;
        if ((i8 & 16) == 0) {
            this.f32183e = AbstractC1435t.m();
        } else {
            this.f32183e = list;
        }
    }

    public static final /* synthetic */ void i(C2916o c2916o, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f32178f;
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(c2916o.f32179a, "")) {
            dVar.q(fVar, 0, c2916o.f32179a);
        }
        dVar.q(fVar, 1, c2916o.f32180b);
        dVar.q(fVar, 2, c2916o.f32181c);
        dVar.q(fVar, 3, c2916o.f32182d);
        if (dVar.x(fVar, 4) || !AbstractC3292y.d(c2916o.f32183e, AbstractC1435t.m())) {
            dVar.n(fVar, 4, bVarArr[4], c2916o.f32183e);
        }
    }

    public final String b() {
        return this.f32180b;
    }

    public final String d() {
        return this.f32179a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2916o)) {
            return false;
        }
        C2916o c2916o = (C2916o) obj;
        if (AbstractC3292y.d(this.f32179a, c2916o.f32179a) && AbstractC3292y.d(this.f32180b, c2916o.f32180b) && AbstractC3292y.d(this.f32181c, c2916o.f32181c) && AbstractC3292y.d(this.f32182d, c2916o.f32182d) && AbstractC3292y.d(this.f32183e, c2916o.f32183e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f32182d;
    }

    public final List h() {
        return this.f32183e;
    }

    public int hashCode() {
        return (((((((this.f32179a.hashCode() * 31) + this.f32180b.hashCode()) * 31) + this.f32181c.hashCode()) * 31) + this.f32182d.hashCode()) * 31) + this.f32183e.hashCode();
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.f32179a + ", emailAddress=" + this.f32180b + ", redactedFormattedPhoneNumber=" + this.f32181c + ", redactedPhoneNumber=" + this.f32182d + ", verificationSessions=" + this.f32183e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32179a);
        out.writeString(this.f32180b);
        out.writeString(this.f32181c);
        out.writeString(this.f32182d);
        List list = this.f32183e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(out, i8);
        }
    }

    public C2916o(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, List verificationSessions) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(emailAddress, "emailAddress");
        AbstractC3292y.i(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        AbstractC3292y.i(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC3292y.i(verificationSessions, "verificationSessions");
        this.f32179a = clientSecret;
        this.f32180b = emailAddress;
        this.f32181c = redactedFormattedPhoneNumber;
        this.f32182d = redactedPhoneNumber;
        this.f32183e = verificationSessions;
    }
}

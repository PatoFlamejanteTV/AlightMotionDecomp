package U7;

import R5.AbstractC1435t;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f10370a;

    /* renamed from: b, reason: collision with root package name */
    public final T7.a f10371b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f10372c;

    /* renamed from: d, reason: collision with root package name */
    public final T7.b f10373d;

    /* renamed from: e, reason: collision with root package name */
    public W7.j f10374e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10375f;

    /* renamed from: g, reason: collision with root package name */
    public S7.r f10376g;

    /* renamed from: h, reason: collision with root package name */
    public S7.e f10377h;

    /* renamed from: i, reason: collision with root package name */
    public S7.i f10378i;

    /* renamed from: j, reason: collision with root package name */
    public S7.n f10379j;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10380a;

        static {
            int[] iArr = new int[ChoiceError.values().length];
            iArr[ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR.ordinal()] = 1;
            f10380a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10381a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10382b;

        /* renamed from: d, reason: collision with root package name */
        public int f10384d;

        public b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10382b = obj;
            this.f10384d |= Integer.MIN_VALUE;
            return x.this.c(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10385a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10386b;

        /* renamed from: d, reason: collision with root package name */
        public int f10388d;

        public c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10386b = obj;
            this.f10388d |= Integer.MIN_VALUE;
            return x.this.a(this);
        }
    }

    public x(Locale appLocale, T7.a networkUtil, SharedStorage shareStorage, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(appLocale, "appLocale");
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(shareStorage, "shareStorage");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10370a = appLocale;
        this.f10371b = networkUtil;
        this.f10372c = shareStorage;
        this.f10373d = requestApi;
        this.f10374e = resolver;
        this.f10375f = "tcfv2/translations/";
        this.f10377h = new S7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143);
        this.f10378i = new S7.i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
        this.f10379j = new S7.n(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // U7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof U7.x.c
            if (r0 == 0) goto L13
            r0 = r13
            U7.x$c r0 = (U7.x.c) r0
            int r1 = r0.f10388d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10388d = r1
            goto L18
        L13:
            U7.x$c r0 = new U7.x$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f10386b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10388d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f10385a
            U7.x r0 = (U7.x) r0
            Q5.t.b(r13)
            goto L94
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.f10385a
            U7.x r2 = (U7.x) r2
            Q5.t.b(r13)     // Catch: A5.a -> L40
            goto L5f
        L40:
            r13 = move-exception
            goto L7c
        L42:
            Q5.t.b(r13)
            T7.a r13 = r12.f10371b     // Catch: A5.a -> L62
            boolean r13 = r13.a()     // Catch: A5.a -> L62
            if (r13 == 0) goto L65
            T7.b r13 = r12.f10373d     // Catch: A5.a -> L62
            java.lang.String r2 = r12.j()     // Catch: A5.a -> L62
            r0.f10385a = r12     // Catch: A5.a -> L62
            r0.f10388d = r4     // Catch: A5.a -> L62
            java.lang.Object r13 = r13.a(r2, r0)     // Catch: A5.a -> L62
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r2 = r12
        L5f:
            java.lang.String r13 = (java.lang.String) r13     // Catch: A5.a -> L40
            goto La0
        L62:
            r13 = move-exception
            r2 = r12
            goto L7c
        L65:
            A5.b r5 = A5.b.f238a     // Catch: A5.a -> L62
            com.inmobi.cmp.model.ChoiceError r6 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L62
            r10 = 0
            r11 = 30
            r7 = 0
            r8 = 0
            r9 = 0
            A5.b.a(r5, r6, r7, r8, r9, r10, r11)     // Catch: A5.a -> L62
            com.inmobi.cmp.data.storage.SharedStorage r13 = r12.f10372c     // Catch: A5.a -> L62
            X7.a r2 = X7.a.TRANSLATIONS_TEXT     // Catch: A5.a -> L62
            java.lang.String r13 = r13.j(r2)     // Catch: A5.a -> L62
            r2 = r12
            goto La0
        L7c:
            com.inmobi.cmp.model.ChoiceError r13 = r13.f237a
            int[] r5 = U7.x.a.f10380a
            int r13 = r13.ordinal()
            r13 = r5[r13]
            if (r13 != r4) goto L98
            r0.f10385a = r2
            r0.f10388d = r3
            java.lang.Object r13 = r2.c(r0)
            if (r13 != r1) goto L93
            return r1
        L93:
            r0 = r2
        L94:
            java.lang.String r13 = (java.lang.String) r13
            r2 = r0
            goto La0
        L98:
            com.inmobi.cmp.data.storage.SharedStorage r13 = r2.f10372c
            X7.a r0 = X7.a.TRANSLATIONS_TEXT
            java.lang.String r13 = r13.j(r0)
        La0:
            com.inmobi.cmp.data.storage.SharedStorage r0 = r2.f10372c
            X7.a r1 = X7.a.TRANSLATIONS_TEXT
            r0.e(r1, r13)
            W7.j r0 = r2.f10374e
            java.lang.Object r13 = r0.a(r13)
            S7.r r13 = (S7.r) r13
            r2.f10376g = r13
            if (r13 != 0) goto Lb9
            java.lang.String r13 = "translationsText"
            kotlin.jvm.internal.AbstractC3292y.y(r13)
            r13 = 0
        Lb9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.x.a(U5.d):java.lang.Object");
    }

    @Override // U7.w
    public void b(J6.f portalConfig) {
        AbstractC3292y.i(portalConfig, "portalConfig");
        this.f10377h = portalConfig.f4499d;
        this.f10378i = portalConfig.f4500e;
        this.f10379j = portalConfig.f4501f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(U5.d r78) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.x.c(U5.d):java.lang.Object");
    }

    @Override // U7.w
    public S7.m d() {
        String str;
        k();
        if (this.f10377h.f9826X.length() == 0) {
            S7.r rVar = this.f10376g;
            if (rVar == null) {
                AbstractC3292y.y("translationsText");
                rVar = null;
            }
            str = rVar.f9953a.f9826X;
        } else {
            str = this.f10377h.f9826X;
        }
        return new S7.m(str, i());
    }

    @Override // U7.w
    public S7.h e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        k();
        S7.r rVar = null;
        if (this.f10377h.f9844r.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9953a.f9844r;
        } else {
            str = this.f10377h.f9844r;
        }
        String str11 = str;
        if (this.f10377h.f9809G.length() == 0) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f9953a.f9809G;
        } else {
            str2 = this.f10377h.f9809G;
        }
        String str12 = str2;
        if (this.f10377h.f9813K.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f9953a.f9813K;
        } else {
            str3 = this.f10377h.f9813K;
        }
        String str13 = str3;
        if (this.f10377h.f9814L.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f9953a.f9814L;
        } else {
            str4 = this.f10377h.f9814L;
        }
        String str14 = str4;
        if (this.f10377h.f9815M.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f9953a.f9815M;
        } else {
            str5 = this.f10377h.f9815M;
        }
        String str15 = str5;
        if (this.f10378i.f9878b.length() == 0) {
            S7.r rVar7 = this.f10376g;
            if (rVar7 == null) {
                AbstractC3292y.y("translationsText");
                rVar7 = null;
            }
            str6 = rVar7.f9955c.f9878b;
        } else {
            str6 = this.f10378i.f9878b;
        }
        String str16 = str6;
        if (this.f10377h.f9819Q.length() == 0) {
            S7.r rVar8 = this.f10376g;
            if (rVar8 == null) {
                AbstractC3292y.y("translationsText");
                rVar8 = null;
            }
            str7 = rVar8.f9953a.f9819Q;
        } else {
            str7 = this.f10377h.f9819Q;
        }
        String str17 = str7;
        if (this.f10377h.f9843q.length() == 0) {
            S7.r rVar9 = this.f10376g;
            if (rVar9 == null) {
                AbstractC3292y.y("translationsText");
                rVar9 = null;
            }
            str8 = rVar9.f9953a.f9843q;
        } else {
            str8 = this.f10377h.f9843q;
        }
        String str18 = str8;
        if (this.f10378i.f9880d.length() == 0) {
            S7.r rVar10 = this.f10376g;
            if (rVar10 == null) {
                AbstractC3292y.y("translationsText");
                rVar10 = null;
            }
            str9 = rVar10.f9955c.f9880d;
        } else {
            str9 = this.f10378i.f9880d;
        }
        String str19 = str9;
        if (this.f10378i.f9881e.length() == 0) {
            S7.r rVar11 = this.f10376g;
            if (rVar11 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar11;
            }
            str10 = rVar.f9955c.f9881e;
        } else {
            str10 = this.f10378i.f9881e;
        }
        return new S7.h(str11, str12, str13, str14, str15, str16, str17, str18, str19, str10, i());
    }

    @Override // U7.w
    public S7.j f() {
        String str;
        String w02;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        k();
        S7.r rVar = null;
        if (this.f10377h.f9827a.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9953a.f9827a;
        } else {
            str = this.f10377h.f9827a;
        }
        String str15 = str;
        if (this.f10378i.f9891o.isEmpty()) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            w02 = AbstractC1435t.w0(rVar3.f9955c.f9891o, " ", null, null, 0, null, null, 62, null);
        } else {
            w02 = AbstractC1435t.w0(this.f10378i.f9891o, " ", null, null, 0, null, null, 62, null);
        }
        String str16 = w02;
        if (this.f10377h.f9844r.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f9953a.f9844r;
        } else {
            str2 = this.f10377h.f9844r;
        }
        String str17 = str2;
        if (this.f10377h.f9819Q.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f9953a.f9819Q;
        } else {
            str3 = this.f10377h.f9819Q;
        }
        String str18 = str3;
        if (this.f10378i.f9882f.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
                rVar6 = null;
            }
            str4 = rVar6.f9955c.f9882f;
        } else {
            str4 = this.f10378i.f9882f;
        }
        String str19 = str4;
        if (this.f10377h.f9841o.length() == 0) {
            S7.r rVar7 = this.f10376g;
            if (rVar7 == null) {
                AbstractC3292y.y("translationsText");
                rVar7 = null;
            }
            str5 = rVar7.f9953a.f9841o;
        } else {
            str5 = this.f10377h.f9841o;
        }
        String str20 = str5;
        if (this.f10377h.f9829c.length() == 0) {
            S7.r rVar8 = this.f10376g;
            if (rVar8 == null) {
                AbstractC3292y.y("translationsText");
                rVar8 = null;
            }
            str6 = rVar8.f9953a.f9829c;
        } else {
            str6 = this.f10377h.f9829c;
        }
        String str21 = str6;
        if (this.f10377h.f9842p.length() == 0) {
            S7.r rVar9 = this.f10376g;
            if (rVar9 == null) {
                AbstractC3292y.y("translationsText");
                rVar9 = null;
            }
            str7 = rVar9.f9953a.f9842p;
        } else {
            str7 = this.f10377h.f9842p;
        }
        String str22 = str7;
        if (this.f10377h.f9803A.length() == 0) {
            S7.r rVar10 = this.f10376g;
            if (rVar10 == null) {
                AbstractC3292y.y("translationsText");
                rVar10 = null;
            }
            str8 = rVar10.f9953a.f9803A;
        } else {
            str8 = this.f10377h.f9803A;
        }
        String str23 = str8;
        if (this.f10377h.f9843q.length() == 0) {
            S7.r rVar11 = this.f10376g;
            if (rVar11 == null) {
                AbstractC3292y.y("translationsText");
                rVar11 = null;
            }
            str9 = rVar11.f9953a.f9843q;
        } else {
            str9 = this.f10377h.f9843q;
        }
        String str24 = str9;
        if (this.f10378i.f9885i.length() == 0) {
            S7.r rVar12 = this.f10376g;
            if (rVar12 == null) {
                AbstractC3292y.y("translationsText");
                rVar12 = null;
            }
            str10 = rVar12.f9955c.f9885i;
        } else {
            str10 = this.f10378i.f9885i;
        }
        String str25 = str10;
        if (this.f10378i.f9886j.length() == 0) {
            S7.r rVar13 = this.f10376g;
            if (rVar13 == null) {
                AbstractC3292y.y("translationsText");
                rVar13 = null;
            }
            str11 = rVar13.f9955c.f9886j;
        } else {
            str11 = this.f10378i.f9886j;
        }
        String str26 = str11;
        if (this.f10378i.f9887k.length() == 0) {
            S7.r rVar14 = this.f10376g;
            if (rVar14 == null) {
                AbstractC3292y.y("translationsText");
                rVar14 = null;
            }
            str12 = rVar14.f9955c.f9887k;
        } else {
            str12 = this.f10378i.f9887k;
        }
        String str27 = str12;
        if (this.f10378i.f9888l.length() == 0) {
            S7.r rVar15 = this.f10376g;
            if (rVar15 == null) {
                AbstractC3292y.y("translationsText");
                rVar15 = null;
            }
            str13 = rVar15.f9955c.f9888l;
        } else {
            str13 = this.f10378i.f9888l;
        }
        String str28 = str13;
        String i8 = i();
        if (this.f10377h.f9804B.length() == 0) {
            S7.r rVar16 = this.f10376g;
            if (rVar16 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar16;
            }
            str14 = rVar.f9953a.f9804B;
        } else {
            str14 = this.f10377h.f9804B;
        }
        return new S7.j(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i8, str14);
    }

    @Override // U7.w
    public S7.k g() {
        String str;
        String upperCase;
        String upperCase2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        k();
        S7.r rVar = null;
        if (this.f10377h.f9819Q.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9953a.f9819Q;
        } else {
            str = this.f10377h.f9819Q;
        }
        String str13 = str;
        if (this.f10377h.f9844r.length() == 0) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            upperCase = rVar3.f9953a.f9844r.toUpperCase(this.f10370a);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase = this.f10377h.f9844r.toUpperCase(this.f10370a);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        }
        String str14 = upperCase;
        if (this.f10377h.f9845s.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            upperCase2 = rVar4.f9953a.f9845s.toUpperCase(this.f10370a);
            AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase2 = this.f10377h.f9845s.toUpperCase(this.f10370a);
            AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        }
        String str15 = upperCase2;
        if (this.f10377h.f9847u.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str2 = rVar5.f9953a.f9847u;
        } else {
            str2 = this.f10377h.f9847u;
        }
        String str16 = str2;
        if (this.f10377h.f9846t.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
                rVar6 = null;
            }
            str3 = rVar6.f9953a.f9846t;
        } else {
            str3 = this.f10377h.f9846t;
        }
        String str17 = str3;
        if (this.f10377h.f9848v.length() == 0) {
            S7.r rVar7 = this.f10376g;
            if (rVar7 == null) {
                AbstractC3292y.y("translationsText");
                rVar7 = null;
            }
            str4 = rVar7.f9953a.f9848v;
        } else {
            str4 = this.f10377h.f9848v;
        }
        String str18 = str4;
        if (this.f10377h.f9807E.length() == 0) {
            S7.r rVar8 = this.f10376g;
            if (rVar8 == null) {
                AbstractC3292y.y("translationsText");
                rVar8 = null;
            }
            str5 = rVar8.f9953a.f9807E;
        } else {
            str5 = this.f10377h.f9807E;
        }
        String str19 = str5;
        if (this.f10377h.f9820R.length() == 0) {
            S7.r rVar9 = this.f10376g;
            if (rVar9 == null) {
                AbstractC3292y.y("translationsText");
                rVar9 = null;
            }
            str6 = rVar9.f9953a.f9820R;
        } else {
            str6 = this.f10377h.f9820R;
        }
        String str20 = str6;
        if (this.f10377h.f9821S.length() == 0) {
            S7.r rVar10 = this.f10376g;
            if (rVar10 == null) {
                AbstractC3292y.y("translationsText");
                rVar10 = null;
            }
            str7 = rVar10.f9953a.f9821S;
        } else {
            str7 = this.f10377h.f9821S;
        }
        String str21 = str7;
        if (this.f10377h.f9822T.length() == 0) {
            S7.r rVar11 = this.f10376g;
            if (rVar11 == null) {
                AbstractC3292y.y("translationsText");
                rVar11 = null;
            }
            str8 = rVar11.f9953a.f9822T;
        } else {
            str8 = this.f10377h.f9822T;
        }
        String str22 = str8;
        if (this.f10377h.f9823U.length() == 0) {
            S7.r rVar12 = this.f10376g;
            if (rVar12 == null) {
                AbstractC3292y.y("translationsText");
                rVar12 = null;
            }
            str9 = rVar12.f9953a.f9823U;
        } else {
            str9 = this.f10377h.f9823U;
        }
        String str23 = str9;
        if (this.f10377h.f9824V.length() == 0) {
            S7.r rVar13 = this.f10376g;
            if (rVar13 == null) {
                AbstractC3292y.y("translationsText");
                rVar13 = null;
            }
            str10 = rVar13.f9953a.f9824V;
        } else {
            str10 = this.f10377h.f9824V;
        }
        String str24 = str10;
        if (this.f10377h.f9825W.length() == 0) {
            S7.r rVar14 = this.f10376g;
            if (rVar14 == null) {
                AbstractC3292y.y("translationsText");
                rVar14 = null;
            }
            str11 = rVar14.f9953a.f9825W;
        } else {
            str11 = this.f10377h.f9825W;
        }
        String str25 = str11;
        if (this.f10377h.f9826X.length() == 0) {
            S7.r rVar15 = this.f10376g;
            if (rVar15 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar15;
            }
            str12 = rVar.f9953a.f9826X;
        } else {
            str12 = this.f10377h.f9826X;
        }
        return new S7.k(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str12, str23, str24, str25, i());
    }

    @Override // U7.w
    public S7.q h() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        k();
        S7.r rVar = null;
        if (this.f10377h.f9819Q.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9953a.f9819Q;
        } else {
            str = this.f10377h.f9819Q;
        }
        String str6 = str;
        if (this.f10377h.f9803A.length() == 0) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f9953a.f9803A;
        } else {
            str2 = this.f10377h.f9803A;
        }
        String str7 = str2;
        if (this.f10377h.f9829c.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f9953a.f9829c;
        } else {
            str3 = this.f10377h.f9829c;
        }
        String str8 = str3;
        if (this.f10378i.f9878b.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f9955c.f9878b;
        } else {
            str4 = this.f10378i.f9878b;
        }
        String str9 = str4;
        if (this.f10378i.f9888l.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str5 = rVar.f9955c.f9888l;
        } else {
            str5 = this.f10378i.f9888l;
        }
        return new S7.q(str6, str7, str8, str9, str5, i());
    }

    public final String i() {
        if (this.f10377h.f9849w.length() == 0) {
            S7.r rVar = this.f10376g;
            if (rVar == null) {
                AbstractC3292y.y("translationsText");
                rVar = null;
            }
            return rVar.f9953a.f9849w;
        }
        return this.f10377h.f9849w;
    }

    public final String j() {
        String language = this.f10372c.j(X7.a.PORTAL_CHOICE_LANG);
        AbstractC3292y.i(language, "key");
        int[] a9 = D5.b.a(26);
        int length = a9.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                int i9 = a9[i8];
                i8++;
                if (l6.n.s(G6.a.b(i9), language, true) && !l6.n.s(language, "autoDetectedLanguage", true)) {
                    break;
                }
            } else {
                language = this.f10370a.getLanguage();
                break;
            }
        }
        StringBuilder a10 = AbstractC4157a.a("https://cmp.inmobi.com/");
        a10.append(this.f10375f);
        AbstractC3292y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f10370a);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a10.append(lowerCase);
        a10.append(".json");
        return a10.toString();
    }

    public final void k() {
        S7.r rVar;
        if (this.f10376g == null) {
            String j8 = this.f10372c.j(X7.a.TRANSLATIONS_TEXT);
            if (j8.length() > 0) {
                rVar = (S7.r) this.f10374e.a(j8);
            } else {
                rVar = new S7.r(null, null, null, 7);
            }
            this.f10376g = rVar;
        }
    }

    @Override // U7.w
    public S7.a b() {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        S7.r rVar = null;
        if (this.f10379j.f9934c.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9954b.f9934c;
        } else {
            str = this.f10379j.f9934c;
        }
        String str5 = str;
        if (this.f10379j.f9935d.isEmpty()) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            list = rVar3.f9954b.f9935d;
        } else {
            list = this.f10379j.f9935d;
        }
        List list2 = list;
        if (this.f10379j.f9938g.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f9954b.f9938g;
        } else {
            str2 = this.f10379j.f9938g;
        }
        String str6 = str2;
        if (this.f10379j.f9939h.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f9954b.f9939h;
        } else {
            str3 = this.f10379j.f9939h;
        }
        String str7 = str3;
        if (this.f10379j.f9937f.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str4 = rVar.f9954b.f9937f;
        } else {
            str4 = this.f10379j.f9937f;
        }
        return new S7.a(str5, list2, str6, str7, str4, i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:            if (r0 == null) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:            r10 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:            if (r0 == null) goto L66;     */
    @Override // U7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public S7.g c() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.x.c():S7.g");
    }

    @Override // U7.w
    public S7.l a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        k();
        S7.r rVar = null;
        if (this.f10378i.f9882f.length() == 0) {
            S7.r rVar2 = this.f10376g;
            if (rVar2 == null) {
                AbstractC3292y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f9955c.f9882f;
        } else {
            str = this.f10378i.f9882f;
        }
        String str7 = str;
        if (this.f10377h.f9806D.length() == 0) {
            S7.r rVar3 = this.f10376g;
            if (rVar3 == null) {
                AbstractC3292y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f9953a.f9806D;
        } else {
            str2 = this.f10377h.f9806D;
        }
        String str8 = str2;
        if (this.f10378i.f9878b.length() == 0) {
            S7.r rVar4 = this.f10376g;
            if (rVar4 == null) {
                AbstractC3292y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f9955c.f9878b;
        } else {
            str3 = this.f10378i.f9878b;
        }
        String str9 = str3;
        if (this.f10377h.f9843q.length() == 0) {
            S7.r rVar5 = this.f10376g;
            if (rVar5 == null) {
                AbstractC3292y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f9953a.f9843q;
        } else {
            str4 = this.f10377h.f9843q;
        }
        String str10 = str4;
        if (this.f10378i.f9880d.length() == 0) {
            S7.r rVar6 = this.f10376g;
            if (rVar6 == null) {
                AbstractC3292y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f9955c.f9880d;
        } else {
            str5 = this.f10378i.f9880d;
        }
        String str11 = str5;
        if (this.f10378i.f9881e.length() == 0) {
            S7.r rVar7 = this.f10376g;
            if (rVar7 == null) {
                AbstractC3292y.y("translationsText");
            } else {
                rVar = rVar7;
            }
            str6 = rVar.f9955c.f9881e;
        } else {
            str6 = this.f10378i.f9881e;
        }
        return new S7.l(str7, str8, str9, str10, str11, str6, i());
    }
}

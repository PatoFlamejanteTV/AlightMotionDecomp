package Q7;

import D5.s;
import R5.AbstractC1435t;
import com.inmobi.cmp.ChoiceCmpCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final s f9038a;

    /* renamed from: b, reason: collision with root package name */
    public J6.a f9039b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.a f9040c;

    /* renamed from: d, reason: collision with root package name */
    public T7.b f9041d;

    /* renamed from: e, reason: collision with root package name */
    public final ChoiceCmpCallback f9042e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9043f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9044g;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f9045a;

        /* renamed from: c, reason: collision with root package name */
        public int f9047c;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9045a = obj;
            this.f9047c |= Integer.MIN_VALUE;
            return g.this.a(null, null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f9048a;

        /* renamed from: c, reason: collision with root package name */
        public int f9050c;

        public b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9048a = obj;
            this.f9050c |= Integer.MIN_VALUE;
            return g.this.b(null, null, this);
        }
    }

    static {
        AbstractC3292y.h(g.class.getSimpleName(), "Tracking::class.java.simpleName");
    }

    public g(s tcModel, J6.a aVar, T7.a networkUtil, T7.b requestApi, ChoiceCmpCallback choiceCmpCallback, String domain) {
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(domain, "domain");
        this.f9038a = tcModel;
        this.f9039b = aVar;
        this.f9040c = networkUtil;
        this.f9041d = requestApi;
        this.f9042e = choiceCmpCallback;
        this.f9043f = domain;
        this.f9044g = new ArrayList();
    }

    public static Object c(g gVar, Boolean bool, String str, String str2, String str3, String str4, f fVar, U5.d dVar, int i8) {
        String str5;
        String str6;
        String str7;
        String str8;
        String d8;
        String d9;
        if ((i8 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i8 & 4) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i8 & 8) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i8 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        gVar.getClass();
        if (AbstractC3292y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d8 = "All";
        } else {
            d8 = gVar.d(null);
        }
        String str9 = d8;
        if (AbstractC3292y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d9 = "none";
        } else {
            d9 = gVar.d("legitimate");
        }
        String str10 = d9;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f9044g);
        j jVar = new j(arrayList, str9, str10, str5, str6, null, null, str7, str8, 96);
        gVar.f9044g.clear();
        return gVar.a(e.DONE, jVar, fVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Q7.e r12, Q7.h r13, Q7.f r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof Q7.g.a
            if (r0 == 0) goto L13
            r0 = r15
            Q7.g$a r0 = (Q7.g.a) r0
            int r1 = r0.f9047c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9047c = r1
            goto L18
        L13:
            Q7.g$a r0 = new Q7.g$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f9045a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f9047c
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            Q5.t.b(r15)     // Catch: A5.a -> Lc0
            goto Lb2
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            Q5.t.b(r15)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            long r5 = r15.getTimeInMillis()
            r13.b(r5)
            java.lang.String r15 = "<set-?>"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r15)
            r13.f9052b = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = r14.f9037a
            r12.append(r14)
            r14 = 45
            r12.append(r14)
            java.util.UUID r14 = Q7.m.f9075b
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "sessionID.toString()"
            kotlin.jvm.internal.AbstractC3292y.h(r14, r2)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r13.f9053c = r12
            java.lang.String r12 = r11.f9043f
            kotlin.jvm.internal.AbstractC3292y.i(r12, r15)
            r13.f9054d = r12
            java.lang.String r12 = "https://api.cmp.inmobi.com/"
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.net.Uri$Builder r12 = r12.buildUpon()
            java.lang.String r5 = r13.a()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "\\"
            java.lang.String r7 = ""
            r8 = 0
            java.lang.String r13 = l6.n.z(r5, r6, r7, r8, r9, r10)
            java.lang.String r14 = "log"
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r14, r13)
            android.net.Uri r12 = r12.build()
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "parse(BuildConfig.INMOBI…      .build().toString()"
            kotlin.jvm.internal.AbstractC3292y.h(r12, r13)
            T7.a r13 = r11.f9040c     // Catch: A5.a -> Lc0
            boolean r13 = r13.a()     // Catch: A5.a -> Lc0
            if (r13 == 0) goto Lb6
            T7.b r13 = r11.f9041d     // Catch: A5.a -> Lc0
            r0.f9047c = r4     // Catch: A5.a -> Lc0
            java.lang.Object r15 = r13.a(r12, r0)     // Catch: A5.a -> Lc0
            if (r15 != r1) goto Lb2
            return r1
        Lb2:
            java.lang.String r15 = (java.lang.String) r15     // Catch: A5.a -> Lc0
            r3 = r15
            goto Lc0
        Lb6:
            com.inmobi.cmp.ChoiceCmpCallback r12 = r11.f9042e     // Catch: A5.a -> Lc0
            if (r12 != 0) goto Lbb
            goto Lc0
        Lbb:
            com.inmobi.cmp.model.ChoiceError r13 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> Lc0
            r12.onCmpError(r13)     // Catch: A5.a -> Lc0
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.g.a(Q7.e, Q7.h, Q7.f, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Q7.f r12, Q7.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof Q7.g.b
            if (r0 == 0) goto L13
            r0 = r14
            Q7.g$b r0 = (Q7.g.b) r0
            int r1 = r0.f9050c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9050c = r1
            goto L18
        L13:
            Q7.g$b r0 = new Q7.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f9048a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f9050c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r14)
            goto L62
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            Q5.t.b(r14)
            J6.a r14 = r11.f9039b
            if (r14 != 0) goto L39
            goto L66
        L39:
            Q7.i r2 = new Q7.i
            java.lang.String r5 = r14.f4455a
            java.lang.String r6 = r14.f4461g
            D5.s r4 = r11.f9038a
            int r7 = r4.f1426m
            int r4 = r4.f1427n
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            java.lang.String r8 = "2."
            java.lang.String r8 = kotlin.jvm.internal.AbstractC3292y.q(r8, r4)
            java.lang.String r9 = r13.f9023a
            java.lang.String r10 = r14.f4459e
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            Q7.e r13 = Q7.e.INIT
            r0.f9050c = r3
            java.lang.Object r14 = r11.a(r13, r2, r12, r0)
            if (r14 != r1) goto L62
            return r1
        L62:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L68
        L66:
            java.lang.String r14 = "Error sending init log: CMP configuration have not been initialized yet"
        L68:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.g.b(Q7.f, Q7.c, U5.d):java.lang.Object");
    }

    public final String d(String str) {
        List z8;
        boolean d8 = AbstractC3292y.d(str, "legitimate");
        if (d8) {
            z8 = AbstractC1435t.z(AbstractC1435t.p(this.f9038a.f1410D.getMap().values(), this.f9038a.f1409C.getMap().values(), this.f9038a.f1432s.getMap().values()));
        } else {
            z8 = AbstractC1435t.z(AbstractC1435t.p(this.f9038a.f1431r.getMap().values(), this.f9038a.f1439z.getMap().values(), this.f9038a.f1407A.getMap().values()));
        }
        boolean z9 = z8 instanceof Collection;
        if (!z9 || !z8.isEmpty()) {
            Iterator it = z8.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    if (!z9 || !z8.isEmpty()) {
                        Iterator it2 = z8.iterator();
                        while (it2.hasNext()) {
                            if (!(!((Boolean) it2.next()).booleanValue())) {
                                return "Partial";
                            }
                        }
                    }
                    if (d8) {
                        return "all";
                    }
                    return "Reject";
                }
            }
        }
        if (d8) {
            return "none";
        }
        return "All";
    }

    public final void e(String identifier, String value) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(value, "value");
        this.f9044g.add(new o(Calendar.getInstance().getTimeInMillis(), identifier + ':' + value));
    }
}

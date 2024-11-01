package T3;

import B2.F;
import B2.j;
import Q5.r;
import Q5.s;
import Q5.x;
import R5.Q;
import h3.C2947i;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b implements T3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9973d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9974e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9975f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f9976g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f9977h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f9978i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f9979j;

    /* renamed from: a, reason: collision with root package name */
    private final F f9980a;

    /* renamed from: b, reason: collision with root package name */
    private final A2.b f9981b;

    /* renamed from: c, reason: collision with root package name */
    private final j.b f9982c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0211b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9983a;

        /* renamed from: c, reason: collision with root package name */
        int f9985c;

        C0211b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9983a = obj;
            this.f9985c |= Integer.MIN_VALUE;
            Object b9 = b.this.b(null, null, null, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9986a;

        /* renamed from: c, reason: collision with root package name */
        int f9988c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9986a = obj;
            this.f9988c |= Integer.MIN_VALUE;
            Object a9 = b.this.a(null, null, null, null, null, null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    static {
        a aVar = new a(null);
        f9973d = aVar;
        f9974e = aVar.b("consumers/accounts/sign_up");
        f9975f = aVar.b("consumers/sessions/lookup");
        f9976g = aVar.b("consumers/sessions/start_verification");
        f9977h = aVar.b("consumers/sessions/confirm_verification");
        f9978i = aVar.b("consumers/attach_link_consumer_to_link_account_session");
        f9979j = aVar.b("consumers/payment_details");
    }

    public b(F stripeNetworkClient, String apiVersion, String sdkVersion, v2.c cVar) {
        AbstractC3292y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3292y.i(apiVersion, "apiVersion");
        AbstractC3292y.i(sdkVersion, "sdkVersion");
        this.f9980a = stripeNetworkClient;
        this.f9981b = new A2.b();
        this.f9982c = new j.b(cVar, apiVersion, sdkVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // T3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Locale r22, java.lang.String r23, g3.r r24, B2.j.c r25, U5.d r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Locale, java.lang.String, g3.r, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // T3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r14, g3.InterfaceC2913l r15, java.lang.String r16, B2.j.c r17, U5.d r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = 1
            boolean r3 = r1 instanceof T3.b.C0211b
            if (r3 == 0) goto L17
            r3 = r1
            T3.b$b r3 = (T3.b.C0211b) r3
            int r4 = r3.f9985c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f9985c = r4
            goto L1c
        L17:
            T3.b$b r3 = new T3.b$b
            r3.<init>(r1)
        L1c:
            java.lang.Object r1 = r3.f9983a
            java.lang.Object r4 = V5.b.e()
            int r5 = r3.f9985c
            if (r5 == 0) goto L3a
            if (r5 != r2) goto L32
            Q5.t.b(r1)
            Q5.s r1 = (Q5.s) r1
            java.lang.Object r1 = r1.j()
            goto L87
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            Q5.t.b(r1)
            A2.b r1 = r0.f9981b
            B2.F r5 = r0.f9980a
            B2.j$b r6 = r0.f9982c
            java.lang.String r7 = T3.b.f9979j
            java.lang.String r8 = "request_surface"
            r9 = r16
            Q5.r r8 = Q5.x.a(r8, r9)
            java.lang.String r9 = "consumer_session_client_secret"
            r10 = r14
            Q5.r r9 = Q5.x.a(r9, r14)
            java.util.Map r9 = R5.Q.e(r9)
            java.lang.String r10 = "credentials"
            Q5.r r9 = Q5.x.a(r10, r9)
            r10 = 2
            Q5.r[] r10 = new Q5.r[r10]
            r11 = 0
            r10[r11] = r8
            r10[r2] = r9
            java.util.Map r8 = R5.Q.k(r10)
            java.util.Map r9 = r15.B()
            java.util.Map r9 = R5.Q.q(r8, r9)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            B2.j r6 = B2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            h3.f r7 = h3.C2944f.f32577b
            r3.f9985c = r2
            java.lang.Object r1 = B2.x.b(r5, r1, r6, r7, r3)
            if (r1 != r4) goto L87
            return r4
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.b.b(java.lang.String, g3.l, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    @Override // T3.a
    public Object c(String str, String str2, j.c cVar, U5.d dVar) {
        A2.b bVar = this.f9981b;
        F f8 = this.f9980a;
        j.b bVar2 = this.f9982c;
        String str3 = f9975f;
        r a9 = x.a("request_surface", str2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        return B2.x.a(f8, bVar, j.b.d(bVar2, str3, cVar, Q.k(a9, x.a("email_address", lowerCase)), false, 8, null), new C2947i(), dVar);
    }
}

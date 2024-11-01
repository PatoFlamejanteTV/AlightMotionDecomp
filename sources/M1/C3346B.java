package m1;

import android.util.Log;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import o1.C3516f;

/* renamed from: m1.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3346B implements com.google.firebase.sessions.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f34818g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final double f34819h = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f34820b;

    /* renamed from: c, reason: collision with root package name */
    private final d1.e f34821c;

    /* renamed from: d, reason: collision with root package name */
    private final C3516f f34822d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3358h f34823e;

    /* renamed from: f, reason: collision with root package name */
    private final U5.g f34824f;

    /* renamed from: m1.B$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: m1.B$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f34825a;

        /* renamed from: b, reason: collision with root package name */
        Object f34826b;

        /* renamed from: c, reason: collision with root package name */
        Object f34827c;

        /* renamed from: d, reason: collision with root package name */
        Object f34828d;

        /* renamed from: e, reason: collision with root package name */
        Object f34829e;

        /* renamed from: f, reason: collision with root package name */
        Object f34830f;

        /* renamed from: g, reason: collision with root package name */
        int f34831g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ y f34833i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, U5.d dVar) {
            super(2, dVar);
            this.f34833i = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f34833i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r10.f34831g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f34830f
                o1.f r0 = (o1.C3516f) r0
                java.lang.Object r1 = r10.f34829e
                m1.y r1 = (m1.y) r1
                java.lang.Object r2 = r10.f34828d
                A0.f r2 = (A0.f) r2
                java.lang.Object r3 = r10.f34827c
                m1.A r3 = (m1.C3345A) r3
                java.lang.Object r4 = r10.f34826b
                m1.B r4 = (m1.C3346B) r4
                java.lang.Object r5 = r10.f34825a
                m1.s r5 = (m1.s) r5
                Q5.t.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                Q5.t.b(r11)
                goto L6c
            L41:
                Q5.t.b(r11)
                goto L53
            L45:
                Q5.t.b(r11)
                m1.B r11 = m1.C3346B.this
                r10.f34831g = r4
                java.lang.Object r11 = m1.C3346B.f(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                m1.s$a r11 = m1.s.f34938c
                m1.B r1 = m1.C3346B.this
                d1.e r1 = m1.C3346B.d(r1)
                r10.f34831g = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                m1.s r5 = (m1.s) r5
                m1.B r4 = m1.C3346B.this
                m1.A r3 = m1.C3345A.f34816a
                A0.f r11 = m1.C3346B.c(r4)
                m1.y r1 = r10.f34833i
                m1.B r6 = m1.C3346B.this
                o1.f r6 = m1.C3346B.e(r6)
                n1.a r7 = n1.C3388a.f35071a
                r10.f34825a = r5
                r10.f34826b = r4
                r10.f34827c = r3
                r10.f34828d = r11
                r10.f34829e = r1
                r10.f34830f = r6
                r10.f34831g = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                m1.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                m1.C3346B.b(r7, r11)
            Lb0:
                Q5.I r11 = Q5.I.f8786a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: m1.C3346B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.B$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34834a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34835b;

        /* renamed from: d, reason: collision with root package name */
        int f34837d;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34835b = obj;
            this.f34837d |= Integer.MIN_VALUE;
            return C3346B.this.i(this);
        }
    }

    public C3346B(A0.f firebaseApp, d1.e firebaseInstallations, C3516f sessionSettings, InterfaceC3358h eventGDTLogger, U5.g backgroundDispatcher) {
        AbstractC3292y.i(firebaseApp, "firebaseApp");
        AbstractC3292y.i(firebaseInstallations, "firebaseInstallations");
        AbstractC3292y.i(sessionSettings, "sessionSettings");
        AbstractC3292y.i(eventGDTLogger, "eventGDTLogger");
        AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34820b = firebaseApp;
        this.f34821c = firebaseInstallations;
        this.f34822d = sessionSettings;
        this.f34823e = eventGDTLogger;
        this.f34824f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f34823e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + zVar.c().f());
        } catch (RuntimeException e8) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e8);
        }
    }

    private final boolean h() {
        if (f34819h <= this.f34822d.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m1.C3346B.c
            if (r0 == 0) goto L13
            r0 = r6
            m1.B$c r0 = (m1.C3346B.c) r0
            int r1 = r0.f34837d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34837d = r1
            goto L18
        L13:
            m1.B$c r0 = new m1.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34835b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f34837d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f34834a
            m1.B r0 = (m1.C3346B) r0
            Q5.t.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            Q5.t.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            o1.f r6 = r5.f34822d
            r0.f34834a = r5
            r0.f34837d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            o1.f r6 = r0.f34822d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C3346B.i(U5.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(y sessionDetails) {
        AbstractC3292y.i(sessionDetails, "sessionDetails");
        AbstractC3462k.d(N.a(this.f34824f), null, null, new b(sessionDetails, null), 3, null);
    }
}

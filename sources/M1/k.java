package m1;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import o1.C3516f;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final b f34930c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f34931a;

    /* renamed from: b, reason: collision with root package name */
    private final C3516f f34932b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34933a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U5.g f34935c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3350F f34936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U5.g gVar, InterfaceC3350F interfaceC3350F, U5.d dVar) {
            super(2, dVar);
            this.f34935c = gVar;
            this.f34936d = interfaceC3350F;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f34935c, this.f34936d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r5.f34933a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                Q5.t.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                Q5.t.b(r6)
                goto L2e
            L20:
                Q5.t.b(r6)
                n1.a r6 = n1.C3388a.f35071a
                r5.f34933a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L9b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9b
                java.lang.Object r1 = r6.next()
                n1.b r1 = (n1.InterfaceC3389b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                m1.k r6 = m1.k.this
                o1.f r6 = m1.k.b(r6)
                r5.f34933a = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                m1.k r6 = m1.k.this
                o1.f r6 = m1.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La0
            L7b:
                m1.D r6 = new m1.D
                U5.g r0 = r5.f34935c
                r6.<init>(r0)
                m1.F r0 = r5.f34936d
                r6.i(r0)
                m1.H r0 = m1.H.f34860a
                r0.a(r6)
                m1.k r6 = m1.k.this
                A0.f r6 = m1.k.a(r6)
                m1.j r0 = new m1.j
                r0.<init>()
                r6.h(r0)
                goto La0
            L9b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La0:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m1.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
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

    public k(A0.f firebaseApp, C3516f settings, U5.g backgroundDispatcher, InterfaceC3350F lifecycleServiceBinder) {
        AbstractC3292y.i(firebaseApp, "firebaseApp");
        AbstractC3292y.i(settings, "settings");
        AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3292y.i(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f34931a = firebaseApp;
        this.f34932b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f34860a);
            AbstractC3462k.d(N.a(backgroundDispatcher), null, null, new a(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}

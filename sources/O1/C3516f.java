package o1;

import A0.n;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import f6.InterfaceC2871d;
import j6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.U;
import m1.C3352b;
import m1.v;
import m1.w;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3516f {

    /* renamed from: c, reason: collision with root package name */
    public static final b f35874c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2871d f35875d = PreferenceDataStoreDelegateKt.preferencesDataStore$default(w.f34956a.b(), new ReplaceFileCorruptionHandler(a.f35878a), null, null, 12, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3518h f35876a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3518h f35877b;

    /* renamed from: o1.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35878a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Preferences invoke(CorruptionException ex) {
            AbstractC3292y.i(ex, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f34955a.e() + '.', ex);
            return PreferencesFactory.createEmpty();
        }
    }

    /* renamed from: o1.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ i[] f35879a = {U.h(new M(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore b(Context context) {
            return (DataStore) C3516f.f35875d.getValue(context, f35879a[0]);
        }

        public final C3516f c() {
            Object j8 = n.a(A0.c.f72a).j(C3516f.class);
            AbstractC3292y.h(j8, "Firebase.app[SessionsSettings::class.java]");
            return (C3516f) j8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35880a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35881b;

        /* renamed from: d, reason: collision with root package name */
        int f35883d;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35881b = obj;
            this.f35883d |= Integer.MIN_VALUE;
            return C3516f.this.g(this);
        }
    }

    public C3516f(InterfaceC3518h localOverrideSettings, InterfaceC3518h remoteSettings) {
        AbstractC3292y.i(localOverrideSettings, "localOverrideSettings");
        AbstractC3292y.i(remoteSettings, "remoteSettings");
        this.f35876a = localOverrideSettings;
        this.f35877b = remoteSettings;
    }

    private final boolean e(double d8) {
        if (0.0d > d8 || d8 > 1.0d) {
            return false;
        }
        return true;
    }

    private final boolean f(long j8) {
        if (C3374a.G(j8) && C3374a.B(j8)) {
            return true;
        }
        return false;
    }

    public final double b() {
        Double c8 = this.f35876a.c();
        if (c8 != null) {
            double doubleValue = c8.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c9 = this.f35877b.c();
        if (c9 != null) {
            double doubleValue2 = c9.doubleValue();
            if (e(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    public final long c() {
        C3374a b9 = this.f35876a.b();
        if (b9 != null) {
            long P8 = b9.P();
            if (f(P8)) {
                return P8;
            }
        }
        C3374a b10 = this.f35877b.b();
        if (b10 != null) {
            long P9 = b10.P();
            if (f(P9)) {
                return P9;
            }
        }
        C3374a.C0804a c0804a = C3374a.f35036b;
        return AbstractC3376c.s(30, EnumC3377d.f35047f);
    }

    public final boolean d() {
        Boolean a9 = this.f35876a.a();
        if (a9 != null) {
            return a9.booleanValue();
        }
        Boolean a10 = this.f35877b.a();
        if (a10 != null) {
            return a10.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o1.C3516f.c
            if (r0 == 0) goto L13
            r0 = r6
            o1.f$c r0 = (o1.C3516f.c) r0
            int r1 = r0.f35883d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35883d = r1
            goto L18
        L13:
            o1.f$c r0 = new o1.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35881b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f35883d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f35880a
            o1.f r2 = (o1.C3516f) r2
            Q5.t.b(r6)
            goto L4d
        L3c:
            Q5.t.b(r6)
            o1.h r6 = r5.f35876a
            r0.f35880a = r5
            r0.f35883d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            o1.h r6 = r2.f35877b
            r2 = 0
            r0.f35880a = r2
            r0.f35883d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C3516f.g(U5.d):java.lang.Object");
    }

    private C3516f(Context context, U5.g gVar, U5.g gVar2, d1.e eVar, C3352b c3352b) {
        this(new C3512b(context), new C3513c(gVar2, eVar, c3352b, new C3514d(c3352b, gVar, null, 4, null), f35874c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3516f(A0.f r8, U5.g r9, U5.g r10, d1.e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.AbstractC3292y.i(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            android.content.Context r2 = r8.k()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
            m1.A r0 = m1.C3345A.f34816a
            m1.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C3516f.<init>(A0.f, U5.g, U5.g, d1.e):void");
    }
}

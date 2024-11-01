package o1;

import Q5.I;
import Q5.t;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3460j;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* renamed from: o1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3517g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f35884c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Preferences.Key f35885d = PreferencesKeys.booleanKey("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final Preferences.Key f35886e = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final Preferences.Key f35887f = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final Preferences.Key f35888g = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final Preferences.Key f35889h = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final DataStore f35890a;

    /* renamed from: b, reason: collision with root package name */
    private C3515e f35891b;

    /* renamed from: o1.g$a */
    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f35892a;

        /* renamed from: b, reason: collision with root package name */
        int f35893b;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3517g c3517g;
            Object e8 = V5.b.e();
            int i8 = this.f35893b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3517g = (C3517g) this.f35892a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3517g c3517g2 = C3517g.this;
                InterfaceC3821f data = c3517g2.f35890a.getData();
                this.f35892a = c3517g2;
                this.f35893b = 1;
                Object w8 = AbstractC3823h.w(data, this);
                if (w8 == e8) {
                    return e8;
                }
                c3517g = c3517g2;
                obj = w8;
            }
            c3517g.l(((Preferences) obj).toPreferences());
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: o1.g$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35895a;

        /* renamed from: c, reason: collision with root package name */
        int f35897c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35895a = obj;
            this.f35897c |= Integer.MIN_VALUE;
            return C3517g.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35898a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f35900c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f35901d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3517g f35902e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Preferences.Key key, C3517g c3517g, U5.d dVar) {
            super(2, dVar);
            this.f35900c = obj;
            this.f35901d = key;
            this.f35902e = c3517g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f35900c, this.f35901d, this.f35902e, dVar);
            dVar2.f35899b = obj;
            return dVar2;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, U5.d dVar) {
            return ((d) create(mutablePreferences, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f35898a == 0) {
                t.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f35899b;
                Object obj2 = this.f35900c;
                if (obj2 != null) {
                    mutablePreferences.set(this.f35901d, obj2);
                } else {
                    mutablePreferences.remove(this.f35901d);
                }
                this.f35902e.l(mutablePreferences);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3517g(DataStore dataStore) {
        AbstractC3292y.i(dataStore, "dataStore");
        this.f35890a = dataStore;
        AbstractC3460j.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:            android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o1.C3517g.c
            if (r0 == 0) goto L13
            r0 = r8
            o1.g$c r0 = (o1.C3517g.c) r0
            int r1 = r0.f35897c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35897c = r1
            goto L18
        L13:
            o1.g$c r0 = new o1.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35895a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f35897c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Q5.t.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            Q5.t.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f35890a     // Catch: java.io.IOException -> L29
            o1.g$d r2 = new o1.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f35897c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C3517g.h(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Preferences preferences) {
        this.f35891b = new C3515e((Boolean) preferences.get(f35885d), (Double) preferences.get(f35886e), (Integer) preferences.get(f35887f), (Integer) preferences.get(f35888g), (Long) preferences.get(f35889h));
    }

    public final boolean d() {
        C3515e c3515e = this.f35891b;
        C3515e c3515e2 = null;
        if (c3515e == null) {
            AbstractC3292y.y("sessionConfigs");
            c3515e = null;
        }
        Long b9 = c3515e.b();
        C3515e c3515e3 = this.f35891b;
        if (c3515e3 == null) {
            AbstractC3292y.y("sessionConfigs");
        } else {
            c3515e2 = c3515e3;
        }
        Integer a9 = c3515e2.a();
        if (b9 != null && a9 != null && (System.currentTimeMillis() - b9.longValue()) / 1000 < a9.intValue()) {
            return false;
        }
        return true;
    }

    public final Integer e() {
        C3515e c3515e = this.f35891b;
        if (c3515e == null) {
            AbstractC3292y.y("sessionConfigs");
            c3515e = null;
        }
        return c3515e.d();
    }

    public final Double f() {
        C3515e c3515e = this.f35891b;
        if (c3515e == null) {
            AbstractC3292y.y("sessionConfigs");
            c3515e = null;
        }
        return c3515e.e();
    }

    public final Boolean g() {
        C3515e c3515e = this.f35891b;
        if (c3515e == null) {
            AbstractC3292y.y("sessionConfigs");
            c3515e = null;
        }
        return c3515e.c();
    }

    public final Object i(Double d8, U5.d dVar) {
        Object h8 = h(f35886e, d8, dVar);
        if (h8 == V5.b.e()) {
            return h8;
        }
        return I.f8786a;
    }

    public final Object j(Integer num, U5.d dVar) {
        Object h8 = h(f35888g, num, dVar);
        if (h8 == V5.b.e()) {
            return h8;
        }
        return I.f8786a;
    }

    public final Object k(Long l8, U5.d dVar) {
        Object h8 = h(f35889h, l8, dVar);
        if (h8 == V5.b.e()) {
            return h8;
        }
        return I.f8786a;
    }

    public final Object m(Integer num, U5.d dVar) {
        Object h8 = h(f35887f, num, dVar);
        if (h8 == V5.b.e()) {
            return h8;
        }
        return I.f8786a;
    }

    public final Object n(Boolean bool, U5.d dVar) {
        Object h8 = h(f35885d, bool, dVar);
        if (h8 == V5.b.e()) {
            return h8;
        }
        return I.f8786a;
    }
}

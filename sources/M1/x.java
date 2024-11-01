package m1;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import f6.InterfaceC2871d;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class x implements com.google.firebase.sessions.a {

    /* renamed from: f, reason: collision with root package name */
    private static final c f34960f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC2871d f34961g = PreferenceDataStoreDelegateKt.preferencesDataStore$default(w.f34956a.a(), new ReplaceFileCorruptionHandler(b.f34969a), null, null, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f34962b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f34963c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f34964d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3821f f34965e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34966a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m1.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0801a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f34968a;

            C0801a(x xVar) {
                this.f34968a = xVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(l lVar, U5.d dVar) {
                this.f34968a.f34964d.set(lVar);
                return Q5.I.f8786a;
            }
        }

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34966a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f interfaceC3821f = x.this.f34965e;
                C0801a c0801a = new C0801a(x.this);
                this.f34966a = 1;
                if (interfaceC3821f.collect(c0801a, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34969a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Preferences invoke(CorruptionException ex) {
            AbstractC3292y.i(ex, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f34955a.e() + '.', ex);
            return PreferencesFactory.createEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ j6.i[] f34970a = {U.h(new kotlin.jvm.internal.M(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore b(Context context) {
            return (DataStore) x.f34961g.getValue(context, f34970a[0]);
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34971a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Preferences.Key f34972b = PreferencesKeys.stringKey("session_id");

        private d() {
        }

        public final Preferences.Key a() {
            return f34972b;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f34973a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34974b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34975c;

        e(U5.d dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34973a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f34974b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f34975c);
                Preferences createEmpty = PreferencesFactory.createEmpty();
                this.f34974b = null;
                this.f34973a = 1;
                if (interfaceC3822g.emit(createEmpty, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2073o
        public final Object invoke(InterfaceC3822g interfaceC3822g, Throwable th, U5.d dVar) {
            e eVar = new e(dVar);
            eVar.f34974b = interfaceC3822g;
            eVar.f34975c = th;
            return eVar.invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f34976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f34977b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f34978a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f34979b;

            /* renamed from: m1.x$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0802a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34980a;

                /* renamed from: b, reason: collision with root package name */
                int f34981b;

                public C0802a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34980a = obj;
                    this.f34981b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g, x xVar) {
                this.f34978a = interfaceC3822g;
                this.f34979b = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof m1.x.f.a.C0802a
                    if (r0 == 0) goto L13
                    r0 = r6
                    m1.x$f$a$a r0 = (m1.x.f.a.C0802a) r0
                    int r1 = r0.f34981b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34981b = r1
                    goto L18
                L13:
                    m1.x$f$a$a r0 = new m1.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34980a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f34981b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    q6.g r6 = r4.f34978a
                    androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                    m1.x r2 = r4.f34979b
                    m1.l r5 = m1.x.h(r2, r5)
                    r0.f34981b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: m1.x.f.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public f(InterfaceC3821f interfaceC3821f, x xVar) {
            this.f34976a = interfaceC3821f;
            this.f34977b = xVar;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f34976a.collect(new a(interfaceC3822g, this.f34977b), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34983a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34985c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f34986a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34987b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f34988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, U5.d dVar) {
                super(2, dVar);
                this.f34988c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f34988c, dVar);
                aVar.f34987b = obj;
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, U5.d dVar) {
                return ((a) create(mutablePreferences, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f34986a == 0) {
                    Q5.t.b(obj);
                    ((MutablePreferences) this.f34987b).set(d.f34971a.a(), this.f34988c);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, U5.d dVar) {
            super(2, dVar);
            this.f34985c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f34985c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34983a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    DataStore b9 = x.f34960f.b(x.this.f34962b);
                    a aVar = new a(this.f34985c, null);
                    this.f34983a = 1;
                    if (PreferencesKt.edit(b9, aVar, this) == e8) {
                        return e8;
                    }
                }
            } catch (IOException e9) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e9);
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public x(Context context, U5.g backgroundDispatcher) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34962b = context;
        this.f34963c = backgroundDispatcher;
        this.f34964d = new AtomicReference();
        this.f34965e = new f(AbstractC3823h.f(f34960f.b(context).getData(), new e(null)), this);
        AbstractC3462k.d(N.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(Preferences preferences) {
        return new l((String) preferences.get(d.f34971a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        l lVar = (l) this.f34964d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String sessionId) {
        AbstractC3292y.i(sessionId, "sessionId");
        AbstractC3462k.d(N.a(this.f34963c), null, null, new g(sessionId, null), 3, null);
    }
}

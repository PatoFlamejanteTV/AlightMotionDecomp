package X3;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.s;
import Q5.t;
import android.content.Context;
import android.content.SharedPreferences;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.M;
import n6.N;

/* loaded from: classes4.dex */
public final class c implements X3.b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f11004c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0236c f11005a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11006b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11007a;

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
            int i8 = this.f11007a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC0236c interfaceC0236c = c.this.f11005a;
                this.f11007a = 1;
                obj = interfaceC0236c.a(this);
                if (obj == e8) {
                    return e8;
                }
            }
            X3.a aVar = (X3.a) obj;
            if (aVar == null || c.this.f11006b != aVar.b()) {
                c.this.e();
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context) {
            Object b9;
            try {
                s.a aVar = s.f8810b;
                b9 = s.b(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (s.g(b9)) {
                b9 = -1;
            }
            return ((Number) b9).intValue();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: X3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0236c {

        /* renamed from: X3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0236c {

            /* renamed from: d, reason: collision with root package name */
            private static final C0237a f11009d = new C0237a(null);

            /* renamed from: a, reason: collision with root package name */
            private final int f11010a;

            /* renamed from: b, reason: collision with root package name */
            private final U5.g f11011b;

            /* renamed from: c, reason: collision with root package name */
            private final InterfaceC1416k f11012c;

            /* renamed from: X3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0237a {
                private C0237a() {
                }

                public /* synthetic */ C0237a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: X3.c$c$a$b */
            /* loaded from: classes4.dex */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f11013a;

                b(U5.d dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new b(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f11013a == 0) {
                        t.b(obj);
                        int i8 = a.this.d().getInt("app_version", 0);
                        String string = a.this.d().getString(MBridgeConstans.SDK_APP_ID, null);
                        if (string == null) {
                            return null;
                        }
                        return new X3.a(string, i8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* renamed from: X3.c$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0238c extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f11015a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0238c(Context context) {
                    super(0);
                    this.f11015a = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public final SharedPreferences invoke() {
                    return this.f11015a.getSharedPreferences("app_info", 0);
                }
            }

            public a(Context context, int i8, U5.g workContext) {
                AbstractC3292y.i(context, "context");
                AbstractC3292y.i(workContext, "workContext");
                this.f11010a = i8;
                this.f11011b = workContext;
                this.f11012c = Q5.l.b(new C0238c(context));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences d() {
                Object value = this.f11012c.getValue();
                AbstractC3292y.h(value, "getValue(...)");
                return (SharedPreferences) value;
            }

            @Override // X3.c.InterfaceC0236c
            public Object a(U5.d dVar) {
                return AbstractC3458i.g(this.f11011b, new b(null), dVar);
            }

            @Override // X3.c.InterfaceC0236c
            public void b(X3.a appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                d().edit().putInt("app_version", this.f11010a).putString(MBridgeConstans.SDK_APP_ID, appInfo.a()).apply();
            }
        }

        Object a(U5.d dVar);

        void b(X3.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11016a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11017b;

        /* renamed from: d, reason: collision with root package name */
        int f11019d;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11017b = obj;
            this.f11019d |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(InterfaceC0236c store, int i8, U5.g workContext) {
        AbstractC3292y.i(store, "store");
        AbstractC3292y.i(workContext, "workContext");
        this.f11005a = store;
        this.f11006b = i8;
        AbstractC3462k.d(N.a(workContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X3.a e() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3292y.h(uuid, "toString(...)");
        X3.a aVar = new X3.a(uuid, this.f11006b);
        this.f11005a.b(aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // X3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X3.c.d
            if (r0 == 0) goto L13
            r0 = r5
            X3.c$d r0 = (X3.c.d) r0
            int r1 = r0.f11019d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11019d = r1
            goto L18
        L13:
            X3.c$d r0 = new X3.c$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11017b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f11019d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f11016a
            X3.c r0 = (X3.c) r0
            Q5.t.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Q5.t.b(r5)
            X3.c$c r5 = r4.f11005a
            r0.f11016a = r4
            r0.f11019d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            X3.a r5 = (X3.a) r5
            if (r5 != 0) goto L4e
            X3.a r5 = r0.e()
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.c.a(U5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, U5.g workContext) {
        this(context, f11004c.b(context), workContext);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i8, U5.g workContext) {
        this(new InterfaceC0236c.a(context, i8, workContext), i8, workContext);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
    }
}

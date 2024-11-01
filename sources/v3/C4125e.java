package v3;

import D3.i;
import Q5.I;
import Q5.InterfaceC1416k;
import android.content.Context;
import android.content.SharedPreferences;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.M;

/* renamed from: v3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4125e implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f40469e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f40470f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f40471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40472b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f40473c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f40474d;

    /* renamed from: v3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: v3.e$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40475a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f40477c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f40478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f40477c = z8;
            this.f40478d = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f40477c, this.f40478d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:            if (r8.f40478d != false) goto L21;     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:            r1 = r9;     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:            if (r8.f40477c != false) goto L21;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                V5.b.e()
                int r0 = r8.f40475a
                if (r0 != 0) goto L88
                Q5.t.b(r9)
                v3.e r9 = v3.C4125e.this
                android.content.SharedPreferences r9 = v3.C4125e.e(r9)
                v3.e r0 = v3.C4125e.this
                java.lang.String r0 = v3.C4125e.d(r0)
                r1 = 0
                java.lang.String r9 = r9.getString(r0, r1)
                if (r9 != 0) goto L1f
                java.lang.String r9 = ""
            L1f:
                r2 = r9
                java.lang.String r9 = ":"
                java.lang.String[] r3 = new java.lang.String[]{r9}
                r6 = 6
                r7 = 0
                r4 = 0
                r5 = 0
                java.util.List r9 = l6.n.s0(r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = R5.AbstractC1435t.o0(r9)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L83
                int r2 = r0.hashCode()
                r3 = -1534821982(0xffffffffa48479a2, float:-5.745193E-17)
                if (r2 == r3) goto L73
                r3 = -1029412550(0xffffffffc2a4693a, float:-82.20552)
                if (r2 == r3) goto L5b
                r9 = 3321850(0x32affa, float:4.654903E-39)
                if (r2 == r9) goto L4a
                goto L83
            L4a:
                java.lang.String r9 = "link"
                boolean r9 = r0.equals(r9)
                if (r9 != 0) goto L53
                goto L83
            L53:
                D3.i$b r9 = D3.i.b.f1315a
                boolean r0 = r8.f40478d
                if (r0 == 0) goto L83
            L59:
                r1 = r9
                goto L83
            L5b:
                java.lang.String r2 = "payment_method"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L64
                goto L83
            L64:
                r0 = 1
                java.lang.Object r9 = R5.AbstractC1435t.p0(r9, r0)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L83
                D3.i$d r1 = new D3.i$d
                r1.<init>(r9)
                goto L83
            L73:
                java.lang.String r9 = "google_pay"
                boolean r9 = r0.equals(r9)
                if (r9 != 0) goto L7c
                goto L83
            L7c:
                D3.i$a r9 = D3.i.a.f1314a
                boolean r0 = r8.f40477c
                if (r0 == 0) goto L83
                goto L59
            L83:
                if (r1 != 0) goto L87
                D3.i$c r1 = D3.i.c.f1316a
            L87:
                return r1
            L88:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.C4125e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: v3.e$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C4125e.this.f40471a.getSharedPreferences("DefaultPrefsRepository", 0);
        }
    }

    public C4125e(Context context, String str, U5.g workContext) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
        this.f40471a = context;
        this.f40472b = str;
        this.f40473c = workContext;
        this.f40474d = Q5.l.b(new c());
    }

    private final void f(String str) {
        h().edit().putString(g(), str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        String str = this.f40472b;
        if (str != null) {
            String str2 = "customer[" + str + "]";
            if (str2 != null) {
                return str2;
            }
        }
        return "guest";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences h() {
        Object value = this.f40474d.getValue();
        AbstractC3292y.h(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // v3.q
    public void a(D3.f fVar) {
        D3.i iVar;
        String str = null;
        if (fVar != null) {
            iVar = D3.j.a(fVar);
        } else {
            iVar = null;
        }
        if (AbstractC3292y.d(iVar, i.a.f1314a)) {
            str = "google_pay";
        } else if (AbstractC3292y.d(iVar, i.b.f1315a)) {
            str = "link";
        } else if (iVar instanceof i.d) {
            str = "payment_method:" + ((i.d) iVar).getId();
        }
        if (str != null) {
            f(str);
        }
    }

    @Override // v3.q
    public Object b(boolean z8, boolean z9, U5.d dVar) {
        return AbstractC3458i.g(this.f40473c, new b(z8, z9, null), dVar);
    }
}

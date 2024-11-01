package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3820e implements InterfaceC3821f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3821f f37409a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f37410b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2072n f37411c;

    /* renamed from: q6.e$a */
    /* loaded from: classes5.dex */
    static final class a implements InterfaceC3822g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f37413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37414c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0833a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37415a;

            /* renamed from: c, reason: collision with root package name */
            int f37417c;

            C0833a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37415a = obj;
                this.f37417c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(T t8, InterfaceC3822g interfaceC3822g) {
            this.f37413b = t8;
            this.f37414c = interfaceC3822g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q6.C3820e.a.C0833a
                if (r0 == 0) goto L13
                r0 = r7
                q6.e$a$a r0 = (q6.C3820e.a.C0833a) r0
                int r1 = r0.f37417c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37417c = r1
                goto L18
            L13:
                q6.e$a$a r0 = new q6.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37415a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37417c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Q5.t.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Q5.t.b(r7)
                q6.e r7 = q6.C3820e.this
                kotlin.jvm.functions.Function1 r7 = r7.f37410b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.T r2 = r5.f37413b
                java.lang.Object r2 = r2.f34573a
                s6.F r4 = r6.s.f38851a
                if (r2 == r4) goto L58
                q6.e r4 = q6.C3820e.this
                c6.n r4 = r4.f37411c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                Q5.I r6 = Q5.I.f8786a
                return r6
            L58:
                kotlin.jvm.internal.T r2 = r5.f37413b
                r2.f34573a = r7
                q6.g r7 = r5.f37414c
                r0.f37417c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.C3820e.a.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    public C3820e(InterfaceC3821f interfaceC3821f, Function1 function1, InterfaceC2072n interfaceC2072n) {
        this.f37409a = interfaceC3821f;
        this.f37410b = function1;
        this.f37411c = interfaceC2072n;
    }

    @Override // q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        T t8 = new T();
        t8.f34573a = r6.s.f38851a;
        Object collect = this.f37409a.collect(new a(t8, interfaceC3822g), dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }
}

package A4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;

/* loaded from: classes4.dex */
public final class e implements InterfaceC3813L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3821f f168a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f170a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f171b;

        /* renamed from: d, reason: collision with root package name */
        int f173d;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f171b = obj;
            this.f173d |= Integer.MIN_VALUE;
            return e.this.collect(null, this);
        }
    }

    public e(InterfaceC3821f flow, Function0 produceValue) {
        AbstractC3292y.i(flow, "flow");
        AbstractC3292y.i(produceValue, "produceValue");
        this.f168a = flow;
        this.f169b = produceValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // q6.InterfaceC3802A, q6.InterfaceC3821f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(q6.InterfaceC3822g r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof A4.e.a
            if (r0 == 0) goto L13
            r0 = r6
            A4.e$a r0 = (A4.e.a) r0
            int r1 = r0.f173d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173d = r1
            goto L18
        L13:
            A4.e$a r0 = new A4.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f171b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f173d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f170a
            n6.x0 r5 = (n6.InterfaceC3488x0) r5
            Q5.t.b(r6)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Q5.t.b(r6)
            U5.g r6 = r0.getContext()
            n6.x0$b r2 = n6.InterfaceC3488x0.f35757n0
            U5.g$b r6 = r6.get(r2)
            n6.x0 r6 = (n6.InterfaceC3488x0) r6
            q6.f r2 = r4.f168a
            q6.f r2 = q6.AbstractC3823h.p(r2)
            r0.f170a = r6
            r0.f173d = r3
            java.lang.Object r5 = r2.collect(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            r5 = r6
        L56:
            if (r5 == 0) goto L56
            n6.B0.k(r5)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.e.collect(q6.g, U5.d):java.lang.Object");
    }

    @Override // q6.InterfaceC3813L
    public Object getValue() {
        return this.f169b.invoke();
    }
}

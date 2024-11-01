package c4;

import d4.C2757a;
import d4.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes4.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f15514a;

    /* renamed from: b, reason: collision with root package name */
    private final C2757a f15515b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15516c;

    /* renamed from: d, reason: collision with root package name */
    private final w f15517d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f15518e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f15519a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15520b;

        /* renamed from: d, reason: collision with root package name */
        int f15522d;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15520b = obj;
            this.f15522d |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    public j(int i8, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, C2757a creqData) {
        AbstractC3292y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3292y.i(creqData, "creqData");
        this.f15514a = errorRequestExecutor;
        this.f15515b = creqData;
        this.f15516c = TimeUnit.MINUTES.toMillis(i8);
        w a9 = AbstractC3815N.a(Boolean.FALSE);
        this.f15517d = a9;
        this.f15518e = a9;
    }

    private final d4.d c() {
        String v8 = this.f15515b.v();
        String f8 = this.f15515b.f();
        d4.f fVar = d4.f.f31444j;
        return new d4.d(v8, f8, null, String.valueOf(fVar.b()), d.c.f31424c, fVar.c(), "Timeout expiry reached for the transaction", null, this.f15515b.p(), this.f15515b.u(), 132, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // c4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c4.j.a
            if (r0 == 0) goto L13
            r0 = r7
            c4.j$a r0 = (c4.j.a) r0
            int r1 = r0.f15522d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15522d = r1
            goto L18
        L13:
            c4.j$a r0 = new c4.j$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15520b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f15522d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f15519a
            c4.j r0 = (c4.j) r0
            Q5.t.b(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            Q5.t.b(r7)
            long r4 = r6.f15516c
            r0.f15519a = r6
            r0.f15522d = r3
            java.lang.Object r7 = n6.X.b(r4, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r0 = r6
        L46:
            r0.e()
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.j.a(U5.d):java.lang.Object");
    }

    @Override // c4.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC3813L b() {
        return this.f15518e;
    }

    public final void e() {
        this.f15514a.a(c());
        this.f15517d.setValue(Boolean.TRUE);
    }
}

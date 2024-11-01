package k3;

import Q5.s;
import android.content.Context;
import com.stripe.android.model.u;
import j3.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n2.C3397H;

/* loaded from: classes4.dex */
public final class j extends AbstractC3239e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34473a;

        /* renamed from: c, reason: collision with root package name */
        int f34475c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34473a = obj;
            this.f34475c |= Integer.MIN_VALUE;
            Object l8 = j.this.l(null, null, null, this);
            if (l8 == V5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34476a;

        /* renamed from: c, reason: collision with root package name */
        int f34478c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34476a = obj;
            this.f34478c |= Integer.MIN_VALUE;
            Object q8 = j.this.q(null, null, null, this);
            if (q8 == V5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34479a;

        /* renamed from: c, reason: collision with root package name */
        int f34481c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34479a = obj;
            this.f34481c |= Integer.MIN_VALUE;
            Object s8 = j.this.s(null, null, null, this);
            if (s8 == V5.b.e()) {
                return s8;
            }
            return s.a(s8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, final Function0 publishableKeyProvider, m stripeRepository, v2.d logger, U5.g workContext) {
        super(context, new N5.a() { // from class: k3.i
            @Override // N5.a
            public final Object get() {
                String y8;
                y8 = j.y(Function0.this);
                return y8;
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(Function0 tmp0) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k3.AbstractC3239e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object l(java.lang.String r5, B2.j.c r6, java.lang.String r7, U5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k3.j.a
            if (r0 == 0) goto L13
            r0 = r8
            k3.j$a r0 = (k3.j.a) r0
            int r1 = r0.f34475c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34475c = r1
            goto L18
        L13:
            k3.j$a r0 = new k3.j$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34473a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f34475c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r8)
            Q5.s r8 = (Q5.s) r8
            java.lang.Object r5 = r8.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r8)
            j3.m r8 = r4.o()
            r0.f34475c = r3
            java.lang.Object r5 = r8.r(r5, r7, r6, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.l(java.lang.String, B2.j$c, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k3.AbstractC3239e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object q(java.lang.String r4, B2.j.c r5, java.util.List r6, U5.d r7) {
        /*
            r3 = this;
            boolean r6 = r7 instanceof k3.j.b
            if (r6 == 0) goto L13
            r6 = r7
            k3.j$b r6 = (k3.j.b) r6
            int r0 = r6.f34478c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f34478c = r0
            goto L18
        L13:
            k3.j$b r6 = new k3.j$b
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f34476a
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.f34478c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r4 = r7.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Q5.t.b(r7)
            j3.m r7 = r3.o()
            r6.f34478c = r2
            java.lang.Object r4 = r7.u(r4, r5, r6)
            if (r4 != r0) goto L47
            return r0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.q(java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k3.AbstractC3239e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object s(java.lang.String r5, B2.j.c r6, java.util.List r7, U5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k3.j.c
            if (r0 == 0) goto L13
            r0 = r8
            k3.j$c r0 = (k3.j.c) r0
            int r1 = r0.f34481c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34481c = r1
            goto L18
        L13:
            k3.j$c r0 = new k3.j$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34479a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f34481c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r8)
            Q5.s r8 = (Q5.s) r8
            java.lang.Object r5 = r8.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r8)
            j3.m r8 = r4.o()
            r0.f34481c = r3
            java.lang.Object r5 = r8.x(r5, r6, r7, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.s(java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k3.AbstractC3239e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C3397H m(u stripeIntent, int i8, String str) {
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        return new C3397H(stripeIntent, i8, str);
    }
}

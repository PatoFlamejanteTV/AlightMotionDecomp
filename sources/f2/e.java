package F2;

import Q5.I;
import Q5.s;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import n6.U;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2144a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2145b;

        /* renamed from: c, reason: collision with root package name */
        int f2146c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2145b = obj;
            this.f2146c |= Integer.MIN_VALUE;
            Object b9 = e.b(null, 0L, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U f2148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U u8, U5.d dVar) {
            super(2, dVar);
            this.f2148b = u8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f2148b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f2147a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                U u8 = this.f2148b;
                this.f2147a = 1;
                obj = u8.h(this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n6.U r4, long r5, kotlin.jvm.functions.Function0 r7, U5.d r8) {
        /*
            boolean r0 = r8 instanceof F2.e.a
            if (r0 == 0) goto L13
            r0 = r8
            F2.e$a r0 = (F2.e.a) r0
            int r1 = r0.f2146c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2146c = r1
            goto L18
        L13:
            F2.e$a r0 = new F2.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2145b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f2146c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f2144a
            r7 = r4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            Q5.t.b(r8)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            Q5.t.b(r8)
            F2.e$b r8 = new F2.e$b
            r2 = 0
            r8.<init>(r4, r2)
            r0.f2144a = r7
            r0.f2146c = r3
            java.lang.Object r8 = n6.a1.e(r5, r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            if (r8 == 0) goto L51
            java.lang.Object r4 = Q5.s.b(r8)
            goto L66
        L51:
            Q5.s$a r4 = Q5.s.f8810b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Object r5 = r7.invoke()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5)
            java.lang.Object r4 = Q5.t.a(r4)
            java.lang.Object r4 = Q5.s.b(r4)
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.e.b(n6.U, long, kotlin.jvm.functions.Function0, U5.d):java.lang.Object");
    }
}

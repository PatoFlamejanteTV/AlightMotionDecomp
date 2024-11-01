package p6;

import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.H;
import n6.InterfaceC3470o;
import n6.M;
import n6.O;

/* loaded from: classes5.dex */
public abstract class q {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f36429a;

        /* renamed from: b */
        Object f36430b;

        /* renamed from: c */
        /* synthetic */ Object f36431c;

        /* renamed from: d */
        int f36432d;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36431c = obj;
            this.f36432d |= Integer.MIN_VALUE;
            return q.a(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3470o f36433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3470o interfaceC3470o) {
            super(1);
            this.f36433a = interfaceC3470o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            InterfaceC3470o interfaceC3470o = this.f36433a;
            s.a aVar = Q5.s.f8810b;
            interfaceC3470o.resumeWith(Q5.s.b(I.f8786a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p6.s r4, kotlin.jvm.functions.Function0 r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof p6.q.a
            if (r0 == 0) goto L13
            r0 = r6
            p6.q$a r0 = (p6.q.a) r0
            int r1 = r0.f36432d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36432d = r1
            goto L18
        L13:
            p6.q$a r0 = new p6.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36431c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f36432d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f36430b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f36429a
            p6.s r4 = (p6.s) r4
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            Q5.t.b(r6)
            U5.g r6 = r0.getContext()
            n6.x0$b r2 = n6.InterfaceC3488x0.f35757n0
            U5.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f36429a = r4     // Catch: java.lang.Throwable -> L32
            r0.f36430b = r5     // Catch: java.lang.Throwable -> L32
            r0.f36432d = r3     // Catch: java.lang.Throwable -> L32
            n6.p r6 = new n6.p     // Catch: java.lang.Throwable -> L32
            U5.d r2 = V5.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.B()     // Catch: java.lang.Throwable -> L32
            p6.q$b r2 = new p6.q$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.w(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.y()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = V5.b.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            Q5.I r4 = Q5.I.f8786a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.q.a(p6.s, kotlin.jvm.functions.Function0, U5.d):java.lang.Object");
    }

    public static final u b(M m8, U5.g gVar, int i8, EnumC3588a enumC3588a, O o8, Function1 function1, InterfaceC2072n interfaceC2072n) {
        r rVar = new r(H.e(m8, gVar), g.b(i8, enumC3588a, null, 4, null));
        if (function1 != null) {
            rVar.u(function1);
        }
        rVar.M0(o8, rVar, interfaceC2072n);
        return rVar;
    }

    public static /* synthetic */ u c(M m8, U5.g gVar, int i8, EnumC3588a enumC3588a, O o8, Function1 function1, InterfaceC2072n interfaceC2072n, int i9, Object obj) {
        int i10;
        if ((i9 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        U5.g gVar2 = gVar;
        if ((i9 & 2) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        if ((i9 & 4) != 0) {
            enumC3588a = EnumC3588a.SUSPEND;
        }
        EnumC3588a enumC3588a2 = enumC3588a;
        if ((i9 & 8) != 0) {
            o8 = O.DEFAULT;
        }
        O o9 = o8;
        if ((i9 & 16) != 0) {
            function1 = null;
        }
        return b(m8, gVar2, i10, enumC3588a2, o9, function1, interfaceC2072n);
    }
}

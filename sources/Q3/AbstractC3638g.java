package q3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3487x;

/* renamed from: q3.g */
/* loaded from: classes4.dex */
public abstract class AbstractC3638g {

    /* renamed from: q3.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3487x f36686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3487x interfaceC3487x) {
            super(0);
            this.f36686a = interfaceC3487x;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(this.f36686a.v(I.f8786a));
        }
    }

    /* renamed from: q3.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f36687a;

        /* renamed from: b */
        /* synthetic */ Object f36688b;

        /* renamed from: c */
        int f36689c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36688b = obj;
            this.f36689c |= Integer.MIN_VALUE;
            return AbstractC3638g.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.lifecycle.LifecycleOwner r10, U5.d r11) {
        /*
            boolean r0 = r11 instanceof q3.AbstractC3638g.b
            if (r0 == 0) goto L13
            r0 = r11
            q3.g$b r0 = (q3.AbstractC3638g.b) r0
            int r1 = r0.f36689c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36689c = r1
            goto L18
        L13:
            q3.g$b r0 = new q3.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f36688b
            java.lang.Object r7 = V5.b.e()
            int r1 = r0.f36689c
            r8 = 2
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            Q5.t.b(r11)
            goto L9e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f36687a
            n6.x r10 = (n6.InterfaceC3487x) r10
            Q5.t.b(r11)
            goto L92
        L3e:
            Q5.t.b(r11)
            n6.x r11 = n6.AbstractC3491z.b(r9, r2, r9)
            androidx.lifecycle.Lifecycle r1 = r10.getLifecycle()
            androidx.lifecycle.Lifecycle$State r10 = androidx.lifecycle.Lifecycle.State.RESUMED
            n6.J0 r3 = n6.C3445b0.c()
            n6.J0 r4 = r3.G()
            U5.g r3 = r0.getContext()
            boolean r3 = r4.isDispatchNeeded(r3)
            if (r3 != 0) goto L7f
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r6) goto L79
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            int r5 = r5.compareTo(r10)
            if (r5 < 0) goto L7f
            Q5.I r10 = Q5.I.f8786a
            boolean r10 = r11.v(r10)
            kotlin.coroutines.jvm.internal.b.a(r10)
            goto L93
        L79:
            androidx.lifecycle.LifecycleDestroyedException r10 = new androidx.lifecycle.LifecycleDestroyedException
            r10.<init>()
            throw r10
        L7f:
            q3.g$a r5 = new q3.g$a
            r5.<init>(r11)
            r0.f36687a = r11
            r0.f36689c = r2
            r2 = r10
            r6 = r0
            java.lang.Object r10 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L91
            return r7
        L91:
            r10 = r11
        L92:
            r11 = r10
        L93:
            r0.f36687a = r9
            r0.f36689c = r8
            java.lang.Object r10 = r11.h(r0)
            if (r10 != r7) goto L9e
            return r7
        L9e:
            Q5.I r10 = Q5.I.f8786a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.AbstractC3638g.b(androidx.lifecycle.LifecycleOwner, U5.d):java.lang.Object");
    }
}

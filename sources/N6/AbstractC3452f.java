package n6;

import R5.AbstractC1435t;
import java.util.Collection;

/* renamed from: n6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3452f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n6.f$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35713a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35714b;

        /* renamed from: c, reason: collision with root package name */
        int f35715c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35714b = obj;
            this.f35715c |= Integer.MIN_VALUE;
            return AbstractC3452f.b(null, this);
        }
    }

    public static final Object a(Collection collection, U5.d dVar) {
        if (collection.isEmpty()) {
            return AbstractC1435t.m();
        }
        return new C3450e((U[]) collection.toArray(new U[0])).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.Collection r4, U5.d r5) {
        /*
            boolean r0 = r5 instanceof n6.AbstractC3452f.a
            if (r0 == 0) goto L13
            r0 = r5
            n6.f$a r0 = (n6.AbstractC3452f.a) r0
            int r1 = r0.f35715c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35715c = r1
            goto L18
        L13:
            n6.f$a r0 = new n6.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35714b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f35715c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35713a
            java.util.Iterator r4 = (java.util.Iterator) r4
            Q5.t.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Q5.t.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            n6.x0 r5 = (n6.InterfaceC3488x0) r5
            r0.f35713a = r4
            r0.f35715c = r3
            java.lang.Object r5 = r5.k(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            Q5.I r4 = Q5.I.f8786a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.AbstractC3452f.b(java.util.Collection, U5.d):java.lang.Object");
    }
}

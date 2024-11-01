package q6;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3816a implements InterfaceC3821f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0832a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37396a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37397b;

        /* renamed from: d, reason: collision with root package name */
        int f37399d;

        C0832a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37397b = obj;
            this.f37399d |= Integer.MIN_VALUE;
            return AbstractC3816a.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // q6.InterfaceC3821f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(q6.InterfaceC3822g r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q6.AbstractC3816a.C0832a
            if (r0 == 0) goto L13
            r0 = r7
            q6.a$a r0 = (q6.AbstractC3816a.C0832a) r0
            int r1 = r0.f37399d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37399d = r1
            goto L18
        L13:
            q6.a$a r0 = new q6.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37397b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37399d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f37396a
            r6.t r6 = (r6.t) r6
            Q5.t.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Q5.t.b(r7)
            r6.t r7 = new r6.t
            U5.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f37396a = r7     // Catch: java.lang.Throwable -> L55
            r0.f37399d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            Q5.I r6 = Q5.I.f8786a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3816a.collect(q6.g, U5.d):java.lang.Object");
    }

    public abstract Object e(InterfaceC3822g interfaceC3822g, U5.d dVar);
}

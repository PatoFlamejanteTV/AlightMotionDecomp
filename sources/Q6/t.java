package q6;

import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37557a;

        /* renamed from: q6.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0837a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f37558a;

            /* renamed from: q6.t$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0838a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f37559a;

                /* renamed from: b, reason: collision with root package name */
                int f37560b;

                public C0838a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f37559a = obj;
                    this.f37560b |= Integer.MIN_VALUE;
                    return C0837a.this.emit(null, this);
                }
            }

            public C0837a(InterfaceC3822g interfaceC3822g) {
                this.f37558a = interfaceC3822g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q6.t.a.C0837a.C0838a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q6.t$a$a$a r0 = (q6.t.a.C0837a.C0838a) r0
                    int r1 = r0.f37560b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37560b = r1
                    goto L18
                L13:
                    q6.t$a$a$a r0 = new q6.t$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f37559a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f37560b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    q6.g r6 = r4.f37558a
                    if (r5 == 0) goto L41
                    r0.f37560b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q6.t.a.C0837a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public a(InterfaceC3821f interfaceC3821f) {
            this.f37557a = interfaceC3821f;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f37557a.collect(new C0837a(interfaceC3822g), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37563b;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f37564a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f37565b;

            /* renamed from: q6.t$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0839a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f37566a;

                /* renamed from: b, reason: collision with root package name */
                int f37567b;

                /* renamed from: d, reason: collision with root package name */
                Object f37569d;

                /* renamed from: e, reason: collision with root package name */
                Object f37570e;

                public C0839a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f37566a = obj;
                    this.f37567b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g, InterfaceC2072n interfaceC2072n) {
                this.f37564a = interfaceC3822g;
                this.f37565b = interfaceC2072n;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof q6.t.b.a.C0839a
                    if (r0 == 0) goto L13
                    r0 = r7
                    q6.t$b$a$a r0 = (q6.t.b.a.C0839a) r0
                    int r1 = r0.f37567b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37567b = r1
                    goto L18
                L13:
                    q6.t$b$a$a r0 = new q6.t$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f37566a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f37567b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    Q5.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f37570e
                    q6.g r6 = (q6.InterfaceC3822g) r6
                    java.lang.Object r2 = r0.f37569d
                    Q5.t.b(r7)
                    goto L5c
                L3e:
                    Q5.t.b(r7)
                    q6.g r7 = r5.f37564a
                    c6.n r2 = r5.f37565b
                    r0.f37569d = r6
                    r0.f37570e = r7
                    r0.f37567b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC3290w.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC3290w.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f37569d = r7
                    r0.f37570e = r7
                    r0.f37567b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    Q5.I r6 = Q5.I.f8786a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: q6.t.b.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public b(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
            this.f37562a = interfaceC3821f;
            this.f37563b = interfaceC2072n;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f37562a.collect(new a(interfaceC3822g, this.f37563b), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    public static final InterfaceC3821f a(InterfaceC3821f interfaceC3821f) {
        return new a(interfaceC3821f);
    }

    public static final InterfaceC3821f b(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
        return new b(interfaceC3821f, interfaceC2072n);
    }
}

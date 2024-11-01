package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.InterfaceC3488x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3808G f37545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37546c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f37547d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f37548e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0835a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f37549a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f37550b;

            C0835a(U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                C0835a c0835a = new C0835a(dVar);
                c0835a.f37550b = ((Number) obj).intValue();
                return c0835a;
            }

            public final Object i(int i8, U5.d dVar) {
                return ((C0835a) create(Integer.valueOf(i8), dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).intValue(), (U5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z8;
                V5.b.e();
                if (this.f37549a == 0) {
                    Q5.t.b(obj);
                    if (this.f37550b > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z8);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f37551a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37552b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f f37553c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ v f37554d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f37555e;

            /* renamed from: q6.s$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C0836a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f37556a;

                static {
                    int[] iArr = new int[EnumC3806E.values().length];
                    try {
                        iArr[EnumC3806E.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC3806E.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC3806E.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f37556a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3821f interfaceC3821f, v vVar, Object obj, U5.d dVar) {
                super(2, dVar);
                this.f37553c = interfaceC3821f;
                this.f37554d = vVar;
                this.f37555e = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                b bVar = new b(this.f37553c, this.f37554d, this.f37555e, dVar);
                bVar.f37552b = obj;
                return bVar;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC3806E enumC3806E, U5.d dVar) {
                return ((b) create(enumC3806E, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f37551a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    int i9 = C0836a.f37556a[((EnumC3806E) this.f37552b).ordinal()];
                    if (i9 != 1) {
                        if (i9 == 3) {
                            Object obj2 = this.f37555e;
                            if (obj2 == AbstractC3804C.f37351a) {
                                this.f37554d.c();
                            } else {
                                this.f37554d.d(obj2);
                            }
                        }
                    } else {
                        InterfaceC3821f interfaceC3821f = this.f37553c;
                        v vVar = this.f37554d;
                        this.f37551a = 1;
                        if (interfaceC3821f.collect(vVar, this) == e8) {
                            return e8;
                        }
                    }
                }
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3808G interfaceC3808G, InterfaceC3821f interfaceC3821f, v vVar, Object obj, U5.d dVar) {
            super(2, dVar);
            this.f37545b = interfaceC3808G;
            this.f37546c = interfaceC3821f;
            this.f37547d = vVar;
            this.f37548e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f37545b, this.f37546c, this.f37547d, this.f37548e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r7.f37544a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                Q5.t.b(r8)
                goto L5c
            L21:
                Q5.t.b(r8)
                goto L8d
            L25:
                Q5.t.b(r8)
                q6.G r8 = r7.f37545b
                q6.G$a r1 = q6.InterfaceC3808G.f37362a
                q6.G r6 = r1.c()
                if (r8 != r6) goto L3f
                q6.f r8 = r7.f37546c
                q6.v r1 = r7.f37547d
                r7.f37544a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                q6.G r8 = r7.f37545b
                q6.G r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                q6.v r8 = r7.f37547d
                q6.L r8 = r8.g()
                q6.s$a$a r1 = new q6.s$a$a
                r1.<init>(r5)
                r7.f37544a = r4
                java.lang.Object r8 = q6.AbstractC3823h.x(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                q6.f r8 = r7.f37546c
                q6.v r1 = r7.f37547d
                r7.f37544a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                q6.G r8 = r7.f37545b
                q6.v r1 = r7.f37547d
                q6.L r1 = r1.g()
                q6.f r8 = r8.a(r1)
                q6.f r8 = q6.AbstractC3823h.p(r8)
                q6.s$a$b r1 = new q6.s$a$b
                q6.f r3 = r7.f37546c
                q6.v r4 = r7.f37547d
                java.lang.Object r6 = r7.f37548e
                r1.<init>(r3, r4, r6, r5)
                r7.f37544a = r2
                java.lang.Object r8 = q6.AbstractC3823h.j(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                Q5.I r8 = Q5.I.f8786a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public static final InterfaceC3802A a(v vVar) {
        return new x(vVar, null);
    }

    public static final InterfaceC3813L b(w wVar) {
        return new y(wVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:            if (r3 == 0) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final q6.C3807F c(q6.InterfaceC3821f r7, int r8) {
        /*
            p6.d$a r0 = p6.d.f36413o0
            int r0 = r0.a()
            int r0 = i6.m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof r6.e
            if (r1 == 0) goto L3c
            r1 = r7
            r6.e r1 = (r6.e) r1
            q6.f r2 = r1.j()
            if (r2 == 0) goto L3c
            q6.F r7 = new q6.F
            int r3 = r1.f38794b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            p6.a r4 = r1.f38795c
            p6.a r5 = p6.EnumC3588a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            p6.a r8 = r1.f38795c
            U5.g r1 = r1.f38793a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            q6.F r8 = new q6.F
            p6.a r1 = p6.EnumC3588a.SUSPEND
            U5.h r2 = U5.h.f10149a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.s.c(q6.f, int):q6.F");
    }

    private static final InterfaceC3488x0 d(n6.M m8, U5.g gVar, InterfaceC3821f interfaceC3821f, v vVar, InterfaceC3808G interfaceC3808G, Object obj) {
        n6.O o8;
        if (AbstractC3292y.d(interfaceC3808G, InterfaceC3808G.f37362a.c())) {
            o8 = n6.O.DEFAULT;
        } else {
            o8 = n6.O.UNDISPATCHED;
        }
        return AbstractC3458i.c(m8, gVar, o8, new a(interfaceC3808G, interfaceC3821f, vVar, obj, null));
    }

    public static final InterfaceC3802A e(InterfaceC3821f interfaceC3821f, n6.M m8, InterfaceC3808G interfaceC3808G, int i8) {
        C3807F c8 = c(interfaceC3821f, i8);
        v a9 = AbstractC3804C.a(i8, c8.f37359b, c8.f37360c);
        return new x(a9, d(m8, c8.f37361d, c8.f37358a, a9, interfaceC3808G, AbstractC3804C.f37351a));
    }

    public static final InterfaceC3813L f(InterfaceC3821f interfaceC3821f, n6.M m8, InterfaceC3808G interfaceC3808G, Object obj) {
        C3807F c8 = c(interfaceC3821f, 1);
        w a9 = AbstractC3815N.a(obj);
        return new y(a9, d(m8, c8.f37361d, c8.f37358a, a9, interfaceC3808G, obj));
    }
}

package r6;

import Q5.I;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import n6.M;
import p6.v;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f38826a;

        /* renamed from: b, reason: collision with root package name */
        Object f38827b;

        /* renamed from: c, reason: collision with root package name */
        int f38828c;

        /* renamed from: d, reason: collision with root package name */
        int f38829d;

        /* renamed from: e, reason: collision with root package name */
        int f38830e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f38831f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38832g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f38833h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f38834i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f38835j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0875a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f38836a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38837b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f38838c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f38839d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ p6.d f38840e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: r6.k$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0876a implements InterfaceC3822g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ p6.d f38841a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f38842b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: r6.k$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0877a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f38843a;

                    /* renamed from: c, reason: collision with root package name */
                    int f38845c;

                    C0877a(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f38843a = obj;
                        this.f38845c |= Integer.MIN_VALUE;
                        return C0876a.this.emit(null, this);
                    }
                }

                C0876a(p6.d dVar, int i8) {
                    this.f38841a = dVar;
                    this.f38842b = i8;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, U5.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof r6.k.a.C0875a.C0876a.C0877a
                        if (r0 == 0) goto L13
                        r0 = r8
                        r6.k$a$a$a$a r0 = (r6.k.a.C0875a.C0876a.C0877a) r0
                        int r1 = r0.f38845c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f38845c = r1
                        goto L18
                    L13:
                        r6.k$a$a$a$a r0 = new r6.k$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f38843a
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.f38845c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        Q5.t.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        Q5.t.b(r8)
                        goto L4d
                    L38:
                        Q5.t.b(r8)
                        p6.d r8 = r6.f38841a
                        R5.K r2 = new R5.K
                        int r5 = r6.f38842b
                        r2.<init>(r5, r7)
                        r0.f38845c = r4
                        java.lang.Object r7 = r8.l(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f38845c = r3
                        java.lang.Object r7 = n6.g1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        Q5.I r7 = Q5.I.f8786a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r6.k.a.C0875a.C0876a.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0875a(InterfaceC3821f[] interfaceC3821fArr, int i8, AtomicInteger atomicInteger, p6.d dVar, U5.d dVar2) {
                super(2, dVar2);
                this.f38837b = interfaceC3821fArr;
                this.f38838c = i8;
                this.f38839d = atomicInteger;
                this.f38840e = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0875a(this.f38837b, this.f38838c, this.f38839d, this.f38840e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object e8 = V5.b.e();
                int i8 = this.f38836a;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3821f[] interfaceC3821fArr = this.f38837b;
                        int i9 = this.f38838c;
                        InterfaceC3821f interfaceC3821f = interfaceC3821fArr[i9];
                        C0876a c0876a = new C0876a(this.f38840e, i9);
                        this.f38836a = 1;
                        if (interfaceC3821f.collect(c0876a, this) == e8) {
                            return e8;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        v.a.a(this.f38840e, null, 1, null);
                    }
                    return I.f8786a;
                } finally {
                    if (this.f38839d.decrementAndGet() == 0) {
                        v.a.a(this.f38840e, null, 1, null);
                    }
                }
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0875a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3821f[] interfaceC3821fArr, Function0 function0, InterfaceC2073o interfaceC2073o, InterfaceC3822g interfaceC3822g, U5.d dVar) {
            super(2, dVar);
            this.f38832g = interfaceC3821fArr;
            this.f38833h = function0;
            this.f38834i = interfaceC2073o;
            this.f38835j = interfaceC3822g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f38832g, this.f38833h, this.f38834i, this.f38835j, dVar);
            aVar.f38831f = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[EDGE_INSN: B:38:0x00ee->B:27:0x00ee BREAK  A[LOOP:0: B:19:0x00c9->B:37:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0134 -> B:10:0x0136). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public static final Object a(InterfaceC3822g interfaceC3822g, InterfaceC3821f[] interfaceC3821fArr, Function0 function0, InterfaceC2073o interfaceC2073o, U5.d dVar) {
        Object a9 = n.a(new a(interfaceC3821fArr, function0, interfaceC2073o, interfaceC3822g, null), dVar);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }
}

package s2;

import Q5.I;
import Q5.s;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import n6.M;
import n6.N;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3945a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0879a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38919a;

        /* renamed from: b, reason: collision with root package name */
        int f38920b;

        C0879a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38919a = obj;
            this.f38920b |= Integer.MIN_VALUE;
            Object a9 = AbstractC3945a.a(null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38921a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38922b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38923c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f38924d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s2.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0880a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f38925a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38926b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f38927c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0880a(InterfaceC2072n interfaceC2072n, U5.d dVar) {
                super(2, dVar);
                this.f38927c = interfaceC2072n;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                C0880a c0880a = new C0880a(this.f38927c, dVar);
                c0880a.f38926b = obj;
                return c0880a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38925a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    M m8 = (M) this.f38926b;
                    InterfaceC2072n interfaceC2072n = this.f38927c;
                    this.f38925a = 1;
                    obj = interfaceC2072n.invoke(m8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0880a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2072n interfaceC2072n, Function1 function1, U5.d dVar) {
            super(2, dVar);
            this.f38923c = interfaceC2072n;
            this.f38924d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f38923c, this.f38924d, dVar);
            bVar.f38922b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f38921a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC2072n interfaceC2072n = this.f38923c;
                    s.a aVar = s.f8810b;
                    C0880a c0880a = new C0880a(interfaceC2072n, null);
                    this.f38921a = 1;
                    obj = N.e(c0880a, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b9 = s.b(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            Function1 function1 = this.f38924d;
            Throwable e9 = s.e(b9);
            if (e9 != null && function1 != null) {
                function1.invoke(e9);
            }
            return s.a(b9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(U5.g r4, kotlin.jvm.functions.Function1 r5, c6.InterfaceC2072n r6, U5.d r7) {
        /*
            boolean r0 = r7 instanceof s2.AbstractC3945a.C0879a
            if (r0 == 0) goto L13
            r0 = r7
            s2.a$a r0 = (s2.AbstractC3945a.C0879a) r0
            int r1 = r0.f38920b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38920b = r1
            goto L18
        L13:
            s2.a$a r0 = new s2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38919a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f38920b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Q5.t.b(r7)
            s2.a$b r7 = new s2.a$b
            r2 = 0
            r7.<init>(r6, r5, r2)
            r0.f38920b = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r4, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r4 = r7.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.AbstractC3945a.a(U5.g, kotlin.jvm.functions.Function1, c6.n, U5.d):java.lang.Object");
    }
}

package q6;

import Q5.C1413h;
import c6.InterfaceC2072n;

/* renamed from: q6.J, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3811J implements InterfaceC3808G {

    /* renamed from: q6.J$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37366a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f37368c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.J$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0830a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O f37369a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f37370b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: q6.J$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0831a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f37371a;

                /* renamed from: c, reason: collision with root package name */
                int f37373c;

                C0831a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f37371a = obj;
                    this.f37373c |= Integer.MIN_VALUE;
                    return C0830a.this.b(0, this);
                }
            }

            C0830a(kotlin.jvm.internal.O o8, InterfaceC3822g interfaceC3822g) {
                this.f37369a = o8;
                this.f37370b = interfaceC3822g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(int r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q6.C3811J.a.C0830a.C0831a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q6.J$a$a$a r0 = (q6.C3811J.a.C0830a.C0831a) r0
                    int r1 = r0.f37373c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f37373c = r1
                    goto L18
                L13:
                    q6.J$a$a$a r0 = new q6.J$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f37371a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f37373c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.O r5 = r4.f37369a
                    boolean r6 = r5.f34569a
                    if (r6 != 0) goto L4e
                    r5.f34569a = r3
                    q6.g r5 = r4.f37370b
                    q6.E r6 = q6.EnumC3806E.START
                    r0.f37373c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                L4e:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q6.C3811J.a.C0830a.b(int, U5.d):java.lang.Object");
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3813L interfaceC3813L, U5.d dVar) {
            super(2, dVar);
            this.f37368c = interfaceC3813L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f37368c, dVar);
            aVar.f37367b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f37366a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f37367b;
                kotlin.jvm.internal.O o8 = new kotlin.jvm.internal.O();
                InterfaceC3813L interfaceC3813L = this.f37368c;
                C0830a c0830a = new C0830a(o8, interfaceC3822g);
                this.f37366a = 1;
                if (interfaceC3813L.collect(c0830a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            return ((a) create(interfaceC3822g, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    @Override // q6.InterfaceC3808G
    public InterfaceC3821f a(InterfaceC3813L interfaceC3813L) {
        return AbstractC3823h.z(new a(interfaceC3813L, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}

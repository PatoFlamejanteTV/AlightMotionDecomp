package R3;

import D3.f;
import E3.c;
import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2073o;
import c6.InterfaceC2075q;
import c6.InterfaceC2077s;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.w;
import g4.C2918b;
import g4.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final w.g f9250a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9251b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f9252c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f9253d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f9254e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f9255f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f9256g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f9257h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f9258i;

    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f9259a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9260b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9261c;

        public a(d dVar) {
            super(3, dVar);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3822g interfaceC3822g, Object obj, d dVar) {
            a aVar = new a(dVar);
            aVar.f9260b = interfaceC3822g;
            aVar.f9261c = obj;
            return aVar.invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9259a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f9260b;
                InterfaceC3821f interfaceC3821f = (InterfaceC3821f) this.f9261c;
                this.f9259a = 1;
                if (AbstractC3823h.t(interfaceC3822g, interfaceC3821f, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2077s {

        /* renamed from: a, reason: collision with root package name */
        int f9262a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9263b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f9264c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9265d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f9266e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f9267f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f9268g;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f f9270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.b f9271b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f9272c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C2918b f9273d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f9274e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f9275f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ E3.c f9276g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f9277h;

            /* renamed from: R3.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0190a implements InterfaceC3822g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3822g f9278a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PrimaryButton.b f9279b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f9280c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C2918b f9281d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f9282e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ f f9283f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ E3.c f9284g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f9285h;

                /* renamed from: R3.c$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0191a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f9286a;

                    /* renamed from: b, reason: collision with root package name */
                    int f9287b;

                    public C0191a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f9286a = obj;
                        this.f9287b |= Integer.MIN_VALUE;
                        return C0190a.this.emit(null, this);
                    }
                }

                public C0190a(InterfaceC3822g interfaceC3822g, PrimaryButton.b bVar, c cVar, C2918b c2918b, boolean z8, f fVar, E3.c cVar2, boolean z9) {
                    this.f9278a = interfaceC3822g;
                    this.f9279b = bVar;
                    this.f9280c = cVar;
                    this.f9281d = c2918b;
                    this.f9282e = z8;
                    this.f9283f = fVar;
                    this.f9284g = cVar2;
                    this.f9285h = z9;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r11, U5.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof R3.c.b.a.C0190a.C0191a
                        if (r0 == 0) goto L13
                        r0 = r12
                        R3.c$b$a$a$a r0 = (R3.c.b.a.C0190a.C0191a) r0
                        int r1 = r0.f9287b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f9287b = r1
                        goto L18
                    L13:
                        R3.c$b$a$a$a r0 = new R3.c$b$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f9286a
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.f9287b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Q5.t.b(r12)
                        goto L90
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        Q5.t.b(r12)
                        q6.g r12 = r10.f9278a
                        E3.a r11 = (E3.a) r11
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = r10.f9279b
                        if (r2 == 0) goto L3d
                        goto L87
                    L3d:
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = new com.stripe.android.paymentsheet.ui.PrimaryButton$b
                        E3.a$a r4 = r11.a()
                        if (r4 == 0) goto L4b
                        C2.c r4 = r4.a()
                        if (r4 != 0) goto L53
                    L4b:
                        R3.c r4 = r10.f9280c
                        g4.b r5 = r10.f9281d
                        C2.c r4 = R3.c.a(r4, r5)
                    L53:
                        R3.c r5 = r10.f9280c
                        kotlin.jvm.functions.Function0 r5 = R3.c.d(r5)
                        boolean r6 = r10.f9282e
                        if (r6 == 0) goto L6f
                        D3.f r6 = r10.f9283f
                        if (r6 == 0) goto L6f
                        R3.c r7 = r10.f9280c
                        E3.c r8 = r10.f9284g
                        boolean r9 = r10.f9285h
                        boolean r6 = R3.c.c(r7, r8, r9, r6)
                        if (r6 == 0) goto L6f
                        r6 = 1
                        goto L70
                    L6f:
                        r6 = 0
                    L70:
                        E3.a$a r7 = r11.a()
                        if (r7 == 0) goto L7b
                        boolean r7 = r7.b()
                        goto L7c
                    L7b:
                        r7 = 1
                    L7c:
                        r2.<init>(r4, r5, r6, r7)
                        boolean r11 = r11.b()
                        if (r11 == 0) goto L86
                        goto L87
                    L86:
                        r2 = 0
                    L87:
                        r0.f9287b = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L90
                        return r1
                    L90:
                        Q5.I r11 = Q5.I.f8786a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: R3.c.b.a.C0190a.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            public a(InterfaceC3821f interfaceC3821f, PrimaryButton.b bVar, c cVar, C2918b c2918b, boolean z8, f fVar, E3.c cVar2, boolean z9) {
                this.f9270a = interfaceC3821f;
                this.f9271b = bVar;
                this.f9272c = cVar;
                this.f9273d = c2918b;
                this.f9274e = z8;
                this.f9275f = fVar;
                this.f9276g = cVar2;
                this.f9277h = z9;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, d dVar) {
                Object collect = this.f9270a.collect(new C0190a(interfaceC3822g, this.f9271b, this.f9272c, this.f9273d, this.f9274e, this.f9275f, this.f9276g, this.f9277h), dVar);
                if (collect == V5.b.e()) {
                    return collect;
                }
                return I.f8786a;
            }
        }

        b(d dVar) {
            super(7, dVar);
        }

        public final Object i(E3.c cVar, boolean z8, C2918b c2918b, f fVar, PrimaryButton.b bVar, boolean z9, d dVar) {
            b bVar2 = new b(dVar);
            bVar2.f9263b = cVar;
            bVar2.f9264c = z8;
            bVar2.f9265d = c2918b;
            bVar2.f9266e = fVar;
            bVar2.f9267f = bVar;
            bVar2.f9268g = z9;
            return bVar2.invokeSuspend(I.f8786a);
        }

        @Override // c6.InterfaceC2077s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            return i((E3.c) obj, ((Boolean) obj2).booleanValue(), (C2918b) obj3, (f) obj4, (PrimaryButton.b) obj5, ((Boolean) obj6).booleanValue(), (d) obj7);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f9262a == 0) {
                t.b(obj);
                E3.c cVar = (E3.c) this.f9263b;
                boolean z8 = this.f9264c;
                C2918b c2918b = (C2918b) this.f9265d;
                f fVar = (f) this.f9266e;
                return new a(cVar.a(), (PrimaryButton.b) this.f9267f, c.this, c2918b, z8, fVar, cVar, this.f9268g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0192c extends l implements InterfaceC2075q {

        /* renamed from: a, reason: collision with root package name */
        int f9289a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9290b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f9291c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9292d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f9293e;

        C0192c(d dVar) {
            super(5, dVar);
        }

        public final Object i(E3.c cVar, boolean z8, f fVar, PrimaryButton.b bVar, d dVar) {
            C0192c c0192c = new C0192c(dVar);
            c0192c.f9290b = cVar;
            c0192c.f9291c = z8;
            c0192c.f9292d = fVar;
            c0192c.f9293e = bVar;
            return c0192c.invokeSuspend(I.f8786a);
        }

        @Override // c6.InterfaceC2075q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((E3.c) obj, ((Boolean) obj2).booleanValue(), (f) obj3, (PrimaryButton.b) obj4, (d) obj5);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            V5.b.e();
            if (this.f9289a == 0) {
                t.b(obj);
                E3.c cVar = (E3.c) this.f9290b;
                boolean z9 = this.f9291c;
                f fVar = (f) this.f9292d;
                PrimaryButton.b bVar = (PrimaryButton.b) this.f9293e;
                if (bVar == null) {
                    C2.c f8 = c.this.f();
                    Function0 function0 = c.this.f9258i;
                    if (z9 && fVar != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    PrimaryButton.b bVar2 = new PrimaryButton.b(f8, function0, z8, false);
                    if (!cVar.g()) {
                        if (fVar == null || !fVar.a()) {
                            return null;
                        }
                        return bVar2;
                    }
                    return bVar2;
                }
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(w.g config, boolean z8, InterfaceC3813L currentScreenFlow, InterfaceC3813L buttonsEnabledFlow, InterfaceC3813L amountFlow, InterfaceC3813L selectionFlow, InterfaceC3813L customPrimaryButtonUiStateFlow, InterfaceC3813L cvcCompleteFlow, Function0 onClick) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(currentScreenFlow, "currentScreenFlow");
        AbstractC3292y.i(buttonsEnabledFlow, "buttonsEnabledFlow");
        AbstractC3292y.i(amountFlow, "amountFlow");
        AbstractC3292y.i(selectionFlow, "selectionFlow");
        AbstractC3292y.i(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        AbstractC3292y.i(cvcCompleteFlow, "cvcCompleteFlow");
        AbstractC3292y.i(onClick, "onClick");
        this.f9250a = config;
        this.f9251b = z8;
        this.f9252c = currentScreenFlow;
        this.f9253d = buttonsEnabledFlow;
        this.f9254e = amountFlow;
        this.f9255f = selectionFlow;
        this.f9256g = customPrimaryButtonUiStateFlow;
        this.f9257h = cvcCompleteFlow;
        this.f9258i = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2.c e(C2918b c2918b) {
        C2.c a9;
        C2.c b9;
        String I8 = this.f9250a.I();
        if (I8 == null || (b9 = C2.d.b(I8)) == null) {
            if (this.f9251b) {
                C2.c a10 = C2.d.a(v3.w.f40595S);
                if (c2918b == null || (a9 = c2918b.a()) == null) {
                    return a10;
                }
            } else {
                a9 = C2.d.a(n.f32365C0);
            }
            return a9;
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2.c f() {
        C2.c b9;
        String I8 = this.f9250a.I();
        if (I8 == null || (b9 = C2.d.b(I8)) == null) {
            return C2.d.a(n.f32418o);
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(E3.c cVar, boolean z8, f fVar) {
        c.j jVar;
        c.j.b bVar;
        f.C0023f c0023f;
        o r8;
        o.p pVar = null;
        if (cVar instanceof c.j) {
            jVar = (c.j) cVar;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            bVar = jVar.v();
        } else {
            bVar = null;
        }
        if (bVar instanceof c.j.b.C0033b) {
            if (fVar instanceof f.C0023f) {
                c0023f = (f.C0023f) fVar;
            } else {
                c0023f = null;
            }
            if (c0023f != null && (r8 = c0023f.r()) != null) {
                pVar = r8.f25635e;
            }
            if (pVar == o.p.f25755i) {
                return z8;
            }
        }
        return true;
    }

    public final InterfaceC3821f h() {
        return AbstractC3823h.M(P3.c.a(this.f9252c, this.f9253d, this.f9254e, this.f9255f, this.f9256g, this.f9257h, new b(null)), new a(null));
    }

    public final InterfaceC3821f i() {
        return AbstractC3823h.m(this.f9252c, this.f9253d, this.f9255f, this.f9256g, new C0192c(null));
    }
}

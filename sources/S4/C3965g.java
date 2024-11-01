package s4;

import Q5.I;
import Q5.t;
import androidx.compose.material.ModalBottomSheetState;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3965g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f39091e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final ModalBottomSheetState f39092a;

    /* renamed from: b, reason: collision with root package name */
    private final C3960b f39093b;

    /* renamed from: c, reason: collision with root package name */
    private a f39094c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39095d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: s4.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39096a = new a("Programmatically", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f39097b = new a("SwipedDownByUser", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f39098c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f39099d;

        static {
            a[] a9 = a();
            f39098c = a9;
            f39099d = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39096a, f39097b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39098c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f39100a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39101b;

        /* renamed from: d, reason: collision with root package name */
        int f39103d;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39101b = obj;
            this.f39103d |= Integer.MIN_VALUE;
            return C3965g.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3965g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f39105a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f39106b;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f39106b = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (U5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f39105a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f39106b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, U5.d dVar) {
            return ((d) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f39107a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39108b;

        /* renamed from: d, reason: collision with root package name */
        int f39110d;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39108b = obj;
            this.f39110d |= Integer.MIN_VALUE;
            return C3965g.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f39111a;

        f(U5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(U5.d dVar) {
            return ((f) create(dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f39111a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b9 = C3965g.this.b();
                this.f39111a = 1;
                if (b9.hide(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0885g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f39113a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39114b;

        /* renamed from: d, reason: collision with root package name */
        int f39116d;

        C0885g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39114b = obj;
            this.f39116d |= Integer.MIN_VALUE;
            return C3965g.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f39117a;

        h(U5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(U5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(U5.d dVar) {
            return ((h) create(dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f39117a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b9 = C3965g.this.b();
                this.f39117a = 1;
                if (b9.show(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3965g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$j */
    /* loaded from: classes4.dex */
    public static final class j extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f39120a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f39121b;

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            j jVar = new j(dVar);
            jVar.f39121b = ((Boolean) obj).booleanValue();
            return jVar;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (U5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f39120a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f39121b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, U5.d dVar) {
            return ((j) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3965g(ModalBottomSheetState modalBottomSheetState, C3960b keyboardHandler) {
        AbstractC3292y.i(modalBottomSheetState, "modalBottomSheetState");
        AbstractC3292y.i(keyboardHandler, "keyboardHandler");
        this.f39092a = modalBottomSheetState;
        this.f39093b = keyboardHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s4.C3965g.b
            if (r0 == 0) goto L13
            r0 = r6
            s4.g$b r0 = (s4.C3965g.b) r0
            int r1 = r0.f39103d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39103d = r1
            goto L18
        L13:
            s4.g$b r0 = new s4.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39101b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f39103d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f39100a
            s4.g r0 = (s4.C3965g) r0
            Q5.t.b(r6)
            goto L53
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            Q5.t.b(r6)
            s4.g$c r6 = new s4.g$c
            r6.<init>()
            q6.f r6 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r6)
            s4.g$d r2 = new s4.g$d
            r4 = 0
            r2.<init>(r4)
            r0.f39100a = r5
            r0.f39103d = r3
            java.lang.Object r6 = q6.AbstractC3823h.x(r6, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            s4.g$a r6 = r0.f39094c
            if (r6 != 0) goto L59
            s4.g$a r6 = s4.C3965g.a.f39097b
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3965g.a(U5.d):java.lang.Object");
    }

    public final ModalBottomSheetState b() {
        return this.f39092a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s4.C3965g.e
            if (r0 == 0) goto L13
            r0 = r6
            s4.g$e r0 = (s4.C3965g.e) r0
            int r1 = r0.f39110d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39110d = r1
            goto L18
        L13:
            s4.g$e r0 = new s4.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39108b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f39110d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r6)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f39107a
            s4.g r2 = (s4.C3965g) r2
            Q5.t.b(r6)
            goto L58
        L3c:
            Q5.t.b(r6)
            boolean r6 = r5.f39095d
            if (r6 == 0) goto L46
            Q5.I r6 = Q5.I.f8786a
            return r6
        L46:
            s4.g$a r6 = s4.C3965g.a.f39096a
            r5.f39094c = r6
            s4.b r6 = r5.f39093b
            r0.f39107a = r5
            r0.f39110d = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.material.ModalBottomSheetState r6 = r2.f39092a
            boolean r6 = r6.isVisible()
            if (r6 == 0) goto L76
            s4.g$f r6 = new s4.g$f
            r4 = 0
            r6.<init>(r4)
            r0.f39107a = r4
            r0.f39110d = r3
            r2 = 10
            java.lang.Object r6 = s4.AbstractC3966h.a(r2, r6, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            Q5.I r6 = Q5.I.f8786a
            return r6
        L76:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3965g.c(U5.d):java.lang.Object");
    }

    public final void d(boolean z8) {
        this.f39095d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s4.C3965g.C0885g
            if (r0 == 0) goto L13
            r0 = r7
            s4.g$g r0 = (s4.C3965g.C0885g) r0
            int r1 = r0.f39116d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39116d = r1
            goto L18
        L13:
            s4.g$g r0 = new s4.g$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39114b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f39116d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f39113a
            s4.g r2 = (s4.C3965g) r2
            Q5.t.b(r7)
            goto L53
        L3d:
            Q5.t.b(r7)
            s4.g$h r7 = new s4.g$h
            r7.<init>(r5)
            r0.f39113a = r6
            r0.f39116d = r4
            r2 = 10
            java.lang.Object r7 = s4.AbstractC3966h.a(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            s4.g$i r7 = new s4.g$i
            r7.<init>()
            q6.f r7 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r7)
            s4.g$j r2 = new s4.g$j
            r2.<init>(r5)
            r0.f39113a = r5
            r0.f39116d = r3
            java.lang.Object r7 = q6.AbstractC3823h.x(r7, r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3965g.e(U5.d):java.lang.Object");
    }
}

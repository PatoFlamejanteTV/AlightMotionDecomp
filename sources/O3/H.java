package O3;

import O3.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f7207a = new H();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7208a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m22invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m22invoke() {
        }
    }

    private H() {
    }

    public final G a(boolean z8, boolean z9, G.a editable) {
        int i8;
        int i9;
        G.a.C0136a c0136a;
        boolean z10;
        G.a.C0136a c0136a2;
        Function0 function0;
        AbstractC3292y.i(editable, "editable");
        if (z8) {
            i8 = v3.t.f40552g;
        } else {
            i8 = v3.t.f40563r;
        }
        int i10 = i8;
        if (z8) {
            i9 = g4.n.f32394c;
        } else {
            i9 = v3.w.f40581E;
        }
        int i11 = i9;
        boolean z11 = !z9;
        boolean z12 = editable instanceof G.a.C0136a;
        G.a.C0136a c0136a3 = null;
        if (z12) {
            c0136a = (G.a.C0136a) editable;
        } else {
            c0136a = null;
        }
        boolean z13 = false;
        if (c0136a != null && c0136a.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12) {
            c0136a2 = (G.a.C0136a) editable;
        } else {
            c0136a2 = null;
        }
        if (c0136a2 != null && c0136a2.c()) {
            z13 = true;
        }
        if (z12) {
            c0136a3 = (G.a.C0136a) editable;
        }
        if (c0136a3 == null || (function0 = c0136a3.b()) == null) {
            function0 = a.f7208a;
        }
        return new G(i10, i11, z11, z10, z13, function0);
    }
}

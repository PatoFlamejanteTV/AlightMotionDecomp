package r4;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.D;
import w4.C4156a;

/* renamed from: r4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3915n implements D {

    /* renamed from: a, reason: collision with root package name */
    private final G f38532a;

    /* renamed from: b, reason: collision with root package name */
    private final C3914m f38533b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38534c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f38535d;

    /* renamed from: r4.n$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        public final List a(boolean z8) {
            return AbstractC1435t.e(Q5.x.a(C3915n.this.a(), new C4156a(String.valueOf(z8), z8)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3915n(G identifier, C3914m controller) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38532a = identifier;
        this.f38533b = controller;
        this.f38534c = true;
    }

    @Override // r4.D
    public G a() {
        return this.f38532a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f38535d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f38534c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.m(f().y(), new a());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public C3914m f() {
        return this.f38533b;
    }
}

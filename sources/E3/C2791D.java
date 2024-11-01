package e3;

import b3.C1969a;
import c3.C2022b;
import c3.C2027g;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import j4.C3171b0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2791D implements InterfaceC2756h.d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f31558b = C3171b0.f34090e;

    /* renamed from: a, reason: collision with root package name */
    private final C3171b0 f31559a;

    public C2791D(C3171b0 externalPaymentMethodSpec) {
        AbstractC3292y.i(externalPaymentMethodSpec, "externalPaymentMethodSpec");
        this.f31559a = externalPaymentMethodSpec;
    }

    @Override // d3.InterfaceC2756h.d
    public C1969a c(boolean z8) {
        return InterfaceC2756h.d.a.b(this, z8);
    }

    @Override // d3.InterfaceC2756h
    public List d(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, InterfaceC2756h.a aVar) {
        return InterfaceC2756h.d.a.c(this, interfaceC2750b, c2752d, list, aVar);
    }

    @Override // d3.InterfaceC2756h
    public C1969a e(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, boolean z8) {
        return InterfaceC2756h.d.a.d(this, interfaceC2750b, c2752d, list, z8);
    }

    @Override // d3.InterfaceC2756h.d
    public List f(C2752d metadata, InterfaceC2756h.a arguments) {
        AbstractC3292y.i(metadata, "metadata");
        AbstractC3292y.i(arguments, "arguments");
        return new C2022b(arguments).a();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(this.f31559a.getType(), C2.d.b(this.f31559a.b()), 0, this.f31559a.f(), this.f31559a.a(), false, (C2.c) null, 64, (AbstractC3284p) null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}

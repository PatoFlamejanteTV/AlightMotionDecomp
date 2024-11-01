package B6;

import B6.c;
import B6.e;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import y6.InterfaceC4248a;
import y6.h;

/* loaded from: classes5.dex */
public abstract class a implements e, c {
    @Override // B6.e
    public e A(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return this;
    }

    @Override // B6.c
    public final float B(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return G();
    }

    @Override // B6.c
    public final byte C(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return D();
    }

    @Override // B6.e
    public abstract byte D();

    @Override // B6.c
    public final short E(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return F();
    }

    @Override // B6.e
    public abstract short F();

    @Override // B6.e
    public float G() {
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J8).floatValue();
    }

    @Override // B6.e
    public double H() {
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J8).doubleValue();
    }

    public Object I(InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(deserializer, "deserializer");
        return w(deserializer);
    }

    public Object J() {
        throw new h(U.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // B6.c
    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
    }

    @Override // B6.e
    public c c(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return this;
    }

    @Override // B6.c
    public final double e(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return H();
    }

    @Override // B6.e
    public boolean f() {
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J8).booleanValue();
    }

    @Override // B6.c
    public e g(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return A(descriptor.h(i8));
    }

    @Override // B6.e
    public char h() {
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J8).charValue();
    }

    @Override // B6.e
    public int i(A6.f enumDescriptor) {
        AbstractC3292y.i(enumDescriptor, "enumDescriptor");
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J8).intValue();
    }

    @Override // B6.c
    public final char j(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return h();
    }

    @Override // B6.c
    public final long k(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return v();
    }

    @Override // B6.c
    public final boolean m(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return f();
    }

    @Override // B6.e
    public abstract int n();

    @Override // B6.c
    public final String o(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return r();
    }

    @Override // B6.c
    public Object p(A6.f descriptor, int i8, InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // B6.e
    public Void q() {
        return null;
    }

    @Override // B6.e
    public String r() {
        Object J8 = J();
        AbstractC3292y.g(J8, "null cannot be cast to non-null type kotlin.String");
        return (String) J8;
    }

    @Override // B6.c
    public int s(A6.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // B6.c
    public final Object t(A6.f descriptor, int i8, InterfaceC4248a deserializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(deserializer, "deserializer");
        if (!deserializer.a().c() && !x()) {
            return q();
        }
        return I(deserializer, obj);
    }

    @Override // B6.c
    public final int u(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return n();
    }

    @Override // B6.e
    public abstract long v();

    @Override // B6.e
    public Object w(InterfaceC4248a interfaceC4248a) {
        return e.a.a(this, interfaceC4248a);
    }

    @Override // B6.e
    public boolean x() {
        return true;
    }

    @Override // B6.c
    public boolean z() {
        return c.a.b(this);
    }
}

package B6;

import B6.d;
import B6.f;
import C6.W;
import kotlin.jvm.internal.AbstractC3292y;
import y6.i;

/* loaded from: classes5.dex */
public abstract class b implements f, d {
    @Override // B6.f
    public abstract void B(int i8);

    @Override // B6.f
    public abstract void C(long j8);

    @Override // B6.d
    public void D(A6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            H(serializer, obj);
        }
    }

    @Override // B6.d
    public final void E(A6.f descriptor, int i8, short s8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            i(s8);
        }
    }

    @Override // B6.f
    public abstract void F(String str);

    public boolean G(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return true;
    }

    public void H(i iVar, Object obj) {
        f.a.c(this, iVar, obj);
    }

    @Override // B6.d
    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
    }

    @Override // B6.f
    public d c(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return this;
    }

    @Override // B6.d
    public final void f(A6.f descriptor, int i8, char c8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            s(c8);
        }
    }

    @Override // B6.d
    public final void g(A6.f descriptor, int i8, float f8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            p(f8);
        }
    }

    @Override // B6.f
    public abstract void h(double d8);

    @Override // B6.f
    public abstract void i(short s8);

    @Override // B6.f
    public abstract void j(byte b9);

    @Override // B6.f
    public abstract void k(boolean z8);

    @Override // B6.f
    public d l(A6.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // B6.d
    public final void m(A6.f descriptor, int i8, byte b9) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            j(b9);
        }
    }

    @Override // B6.d
    public void n(A6.f descriptor, int i8, i serializer, Object obj) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(serializer, "serializer");
        if (G(descriptor, i8)) {
            z(serializer, obj);
        }
    }

    @Override // B6.d
    public final void o(A6.f descriptor, int i8, boolean z8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            k(z8);
        }
    }

    @Override // B6.f
    public abstract void p(float f8);

    @Override // B6.d
    public final void q(A6.f descriptor, int i8, String value) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(value, "value");
        if (G(descriptor, i8)) {
            F(value);
        }
    }

    @Override // B6.d
    public final f r(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            return v(descriptor.h(i8));
        }
        return W.f1027a;
    }

    @Override // B6.f
    public abstract void s(char c8);

    @Override // B6.f
    public void t() {
        f.a.b(this);
    }

    @Override // B6.d
    public final void u(A6.f descriptor, int i8, int i9) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            B(i9);
        }
    }

    @Override // B6.f
    public f v(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return this;
    }

    @Override // B6.d
    public final void w(A6.f descriptor, int i8, long j8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            C(j8);
        }
    }

    @Override // B6.d
    public boolean x(A6.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    @Override // B6.d
    public final void y(A6.f descriptor, int i8, double d8) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            h(d8);
        }
    }

    @Override // B6.f
    public void z(i iVar, Object obj) {
        f.a.d(this, iVar, obj);
    }
}

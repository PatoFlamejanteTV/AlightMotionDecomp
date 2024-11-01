package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1050h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1063v f2072a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2073b;

    public C1050h(InterfaceC1063v writer) {
        AbstractC3292y.i(writer, "writer");
        this.f2072a = writer;
        this.f2073b = true;
    }

    public final boolean a() {
        return this.f2073b;
    }

    public void b() {
        this.f2073b = true;
    }

    public void c() {
        this.f2073b = false;
    }

    public void d(byte b9) {
        this.f2072a.writeLong(b9);
    }

    public final void e(char c8) {
        this.f2072a.a(c8);
    }

    public void f(double d8) {
        this.f2072a.c(String.valueOf(d8));
    }

    public void g(float f8) {
        this.f2072a.c(String.valueOf(f8));
    }

    public void h(int i8) {
        this.f2072a.writeLong(i8);
    }

    public void i(long j8) {
        this.f2072a.writeLong(j8);
    }

    public final void j(String v8) {
        AbstractC3292y.i(v8, "v");
        this.f2072a.c(v8);
    }

    public void k(short s8) {
        this.f2072a.writeLong(s8);
    }

    public void l(boolean z8) {
        this.f2072a.c(String.valueOf(z8));
    }

    public void m(String value) {
        AbstractC3292y.i(value, "value");
        this.f2072a.b(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(boolean z8) {
        this.f2073b = z8;
    }

    public void o() {
    }

    public void p() {
    }
}

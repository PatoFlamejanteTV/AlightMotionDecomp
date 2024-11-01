package U6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1458n extends a0 {

    /* renamed from: f, reason: collision with root package name */
    private a0 f10250f;

    public C1458n(a0 delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.f10250f = delegate;
    }

    @Override // U6.a0
    public a0 a() {
        return this.f10250f.a();
    }

    @Override // U6.a0
    public a0 b() {
        return this.f10250f.b();
    }

    @Override // U6.a0
    public long c() {
        return this.f10250f.c();
    }

    @Override // U6.a0
    public a0 d(long j8) {
        return this.f10250f.d(j8);
    }

    @Override // U6.a0
    public boolean e() {
        return this.f10250f.e();
    }

    @Override // U6.a0
    public void f() {
        this.f10250f.f();
    }

    @Override // U6.a0
    public a0 g(long j8, TimeUnit unit) {
        AbstractC3292y.i(unit, "unit");
        return this.f10250f.g(j8, unit);
    }

    public final a0 i() {
        return this.f10250f;
    }

    public final C1458n j(a0 delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.f10250f = delegate;
        return this;
    }
}

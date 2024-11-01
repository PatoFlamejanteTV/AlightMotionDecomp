package j4;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* loaded from: classes4.dex */
public abstract class A0 implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33715a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33716b;

    /* renamed from: c, reason: collision with root package name */
    private final C2.c f33717c;

    public A0(r4.G identifier, boolean z8) {
        AbstractC3292y.i(identifier, "identifier");
        this.f33715a = identifier;
        this.f33716b = z8;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f33715a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f33717c;
    }

    @Override // r4.D
    public boolean c() {
        return this.f33716b;
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public abstract void f(boolean z8, Composer composer, int i8);
}

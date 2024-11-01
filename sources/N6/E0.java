package n6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class E0 extends AbstractC3439E implements InterfaceC3449d0, InterfaceC3478s0 {

    /* renamed from: d, reason: collision with root package name */
    public F0 f35629d;

    @Override // n6.InterfaceC3478s0
    public K0 a() {
        return null;
    }

    @Override // n6.InterfaceC3449d0
    public void dispose() {
        s().x0(this);
    }

    @Override // n6.InterfaceC3478s0
    public boolean isActive() {
        return true;
    }

    public final F0 s() {
        F0 f02 = this.f35629d;
        if (f02 != null) {
            return f02;
        }
        AbstractC3292y.y("job");
        return null;
    }

    public final void t(F0 f02) {
        this.f35629d = f02;
    }

    @Override // s6.C3997q
    public String toString() {
        return Q.a(this) + '@' + Q.b(this) + "[job@" + Q.b(s()) + ']';
    }
}

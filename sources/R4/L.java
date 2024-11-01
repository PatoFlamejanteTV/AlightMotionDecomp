package r4;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.D;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class L implements D {

    /* renamed from: e, reason: collision with root package name */
    public static final int f38041e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f38042a;

    /* renamed from: b, reason: collision with root package name */
    private final K f38043b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38044c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f38045d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(String it) {
            boolean z8;
            AbstractC3292y.i(it, "it");
            G a9 = L.this.a();
            if (it.length() == L.this.f().y()) {
                z8 = true;
            } else {
                z8 = false;
            }
            return AbstractC1435t.e(Q5.x.a(a9, new C4156a(it, z8)));
        }
    }

    public L(G identifier, K controller) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38042a = identifier;
        this.f38043b = controller;
        this.f38044c = true;
    }

    @Override // r4.D
    public G a() {
        return this.f38042a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f38045d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f38044c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.m(f().j(), new a());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3292y.d(this.f38042a, l8.f38042a) && AbstractC3292y.d(this.f38043b, l8.f38043b)) {
            return true;
        }
        return false;
    }

    public K f() {
        return this.f38043b;
    }

    public int hashCode() {
        return (this.f38042a.hashCode() * 31) + this.f38043b.hashCode();
    }

    public String toString() {
        return "OTPElement(identifier=" + this.f38042a + ", controller=" + this.f38043b + ")";
    }
}

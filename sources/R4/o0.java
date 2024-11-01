package r4;

import R5.AbstractC1435t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.k0;
import w4.C4156a;

/* loaded from: classes4.dex */
public abstract class o0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f38558a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4156a formFieldEntry) {
            AbstractC3292y.i(formFieldEntry, "formFieldEntry");
            return AbstractC1435t.e(Q5.x.a(o0.this.a(), formFieldEntry));
        }
    }

    public o0(G identifier) {
        AbstractC3292y.i(identifier, "identifier");
        this.f38558a = identifier;
    }

    @Override // r4.k0
    public G a() {
        return this.f38558a;
    }

    @Override // r4.k0
    public InterfaceC3813L d() {
        return A4.g.m(i().l(), new a());
    }

    @Override // r4.k0
    public InterfaceC3813L e() {
        List e8 = AbstractC1435t.e(a());
        if (!(i() instanceof w0)) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1435t.m();
        }
        return AbstractC3815N.a(e8);
    }

    @Override // r4.k0
    public m0 f() {
        return i();
    }

    @Override // r4.k0
    public boolean g() {
        return k0.a.a(this);
    }

    @Override // r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().q(str);
        }
    }

    public abstract H i();
}

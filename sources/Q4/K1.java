package q4;

import R5.AbstractC1435t;
import java.util.List;
import p4.C3579d;
import p4.EnumC3581f;
import p4.InterfaceC3576a;

/* loaded from: classes4.dex */
public final class K1 implements InterfaceC3576a {

    /* renamed from: a, reason: collision with root package name */
    public static final K1 f36871a = new K1();

    /* renamed from: b, reason: collision with root package name */
    private static final String f36872b = "MO";

    private K1() {
    }

    @Override // p4.InterfaceC3576a
    public List a() {
        return AbstractC1435t.p(new C3579d(EnumC3581f.f36277e, true, null), new C3579d(EnumC3581f.f36278f, false, null));
    }

    public String b() {
        return f36872b;
    }
}

package q4;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import p4.C3579d;
import p4.C3580e;
import p4.EnumC3581f;
import p4.EnumC3582g;
import p4.InterfaceC3576a;

/* renamed from: q4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3736s implements InterfaceC3576a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3736s f37173a = new C3736s();

    /* renamed from: b, reason: collision with root package name */
    private static final String f37174b = "BD";

    private C3736s() {
    }

    @Override // p4.InterfaceC3576a
    public List a() {
        return AbstractC1435t.p(new C3579d(EnumC3581f.f36277e, true, null), new C3579d(EnumC3581f.f36278f, false, null), new C3579d(EnumC3581f.f36279g, true, new C3580e(false, (ArrayList) null, EnumC3582g.f36297e, 2, (AbstractC3284p) null)), new C3579d(EnumC3581f.f36281i, false, new C3580e(false, (ArrayList) null, EnumC3582g.f36311s, 2, (AbstractC3284p) null)));
    }

    public String b() {
        return f37174b;
    }
}

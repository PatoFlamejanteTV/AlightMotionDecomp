package p2;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import p2.AbstractC3564f;
import q6.InterfaceC3813L;

/* renamed from: p2.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3570l implements InterfaceC3562d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3563e f36169a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f36170b;

    public C3570l(InterfaceC3563e store) {
        AbstractC3292y.i(store, "store");
        this.f36169a = store;
        this.f36170b = A4.g.n(Boolean.FALSE);
    }

    @Override // p2.InterfaceC3562d
    public InterfaceC3813L a() {
        return this.f36170b;
    }

    @Override // p2.InterfaceC3562d
    public Object b(AbstractC3564f.b bVar, U5.d dVar) {
        C3559a d8 = bVar.d();
        if (d8 != null) {
            Object a9 = this.f36169a.a(d8, dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return (List) a9;
        }
        return null;
    }
}

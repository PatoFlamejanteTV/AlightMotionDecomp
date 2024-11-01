package B;

import C.InterfaceC0959c;
import C.InterfaceC0960d;
import android.content.Context;
import java.util.concurrent.Executor;
import v.InterfaceC4109e;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class s implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f349a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f350b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f351c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f352d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f353e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f354f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f355g;

    /* renamed from: h, reason: collision with root package name */
    private final N5.a f356h;

    /* renamed from: i, reason: collision with root package name */
    private final N5.a f357i;

    public s(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8, N5.a aVar9) {
        this.f349a = aVar;
        this.f350b = aVar2;
        this.f351c = aVar3;
        this.f352d = aVar4;
        this.f353e = aVar5;
        this.f354f = aVar6;
        this.f355g = aVar7;
        this.f356h = aVar8;
        this.f357i = aVar9;
    }

    public static s a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8, N5.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, InterfaceC4109e interfaceC4109e, InterfaceC0960d interfaceC0960d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC0959c interfaceC0959c) {
        return new r(context, interfaceC4109e, interfaceC0960d, xVar, executor, bVar, aVar, aVar2, interfaceC0959c);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f349a.get(), (InterfaceC4109e) this.f350b.get(), (InterfaceC0960d) this.f351c.get(), (x) this.f352d.get(), (Executor) this.f353e.get(), (D.b) this.f354f.get(), (E.a) this.f355g.get(), (E.a) this.f356h.get(), (InterfaceC0959c) this.f357i.get());
    }
}

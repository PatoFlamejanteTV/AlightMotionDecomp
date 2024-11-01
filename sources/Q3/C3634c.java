package q3;

import android.content.Context;
import java.util.Map;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3634c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36672a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f36673b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f36674c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f36675d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f36676e;

    public C3634c(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f36672a = aVar;
        this.f36673b = aVar2;
        this.f36674c = aVar3;
        this.f36675d = aVar4;
        this.f36676e = aVar5;
    }

    public static C3634c a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new C3634c(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C3632a c(C3635d c3635d, C3643l c3643l, Map map, boolean z8, Context context) {
        return new C3632a(c3635d, c3643l, map, z8, context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3632a get() {
        return c((C3635d) this.f36672a.get(), (C3643l) this.f36673b.get(), (Map) this.f36674c.get(), ((Boolean) this.f36675d.get()).booleanValue(), (Context) this.f36676e.get());
    }
}

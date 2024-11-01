package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public final class z extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f22401a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f22402b;

    /* renamed from: c, reason: collision with root package name */
    private final c f22403c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f22401a = bVar;
        this.f22402b = aVar;
        this.f22403c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        if (xVar != null) {
            xVar.a(this.f22401a, this.f22402b, this);
            xVar.b(this.f22401a, this.f22402b, this);
        }
    }
}

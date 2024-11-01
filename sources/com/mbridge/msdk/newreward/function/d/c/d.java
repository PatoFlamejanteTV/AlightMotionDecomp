package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public abstract class d<Resource> extends a<Resource> {
    public d(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.a
    public final boolean c() {
        if (!f() && !super.c()) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.a
    public final boolean d() {
        if (!f() && !super.d()) {
            return false;
        }
        return true;
    }

    protected abstract boolean f();

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean i() {
        return true;
    }
}

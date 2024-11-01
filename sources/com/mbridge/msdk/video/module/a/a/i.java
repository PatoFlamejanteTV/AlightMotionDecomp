package com.mbridge.msdk.video.module.a.a;

/* loaded from: classes4.dex */
public class i extends f {

    /* renamed from: b, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f23778b;

    public i(com.mbridge.msdk.video.module.a.a aVar) {
        this.f23778b = aVar;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        com.mbridge.msdk.video.module.a.a aVar = this.f23778b;
        if (aVar != null) {
            aVar.a(i8, obj);
        }
    }
}

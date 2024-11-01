package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.c.c;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b extends a {
    public b(c cVar) {
        super(cVar);
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(Object obj) {
        Map map = (Map) obj;
        a(((Integer) map.get("type")).intValue(), map.get("object"));
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        if (bVar != null && this.f21963c != null) {
            try {
                if (bVar.i() == -1) {
                    this.f21963c.c(System.currentTimeMillis());
                }
                this.f21963c.b(bVar.i() + "");
                com.mbridge.msdk.foundation.same.net.g.c.a().a(this.f21963c.v() + "_" + this.f21963c.w() + "_" + this.f21963c.A() + "_" + this.f21963c.p(), bVar.i(), bVar.k(), System.currentTimeMillis());
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
        if (!this.f21963c.l() && !this.f21963c.m() && !this.f21963c.n()) {
            b(bVar);
        } else {
            a(this.f21962b, bVar);
        }
    }
}

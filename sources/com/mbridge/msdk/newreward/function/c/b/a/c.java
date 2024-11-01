package com.mbridge.msdk.newreward.function.c.b.a;

import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.newreward.function.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.b f22148a;

    public final Object a(Object obj) {
        com.mbridge.msdk.newreward.b.b bVar;
        com.mbridge.msdk.newreward.function.c.c cVar;
        com.mbridge.msdk.newreward.a.d dVar;
        if (this.f22148a != null || obj == null) {
            return null;
        }
        try {
            Map map = (Map) obj;
            bVar = (com.mbridge.msdk.newreward.b.b) map.get("controller_model");
            cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            dVar = (com.mbridge.msdk.newreward.a.d) map.get("adapter_manager");
        } catch (Exception e8) {
            ad.a("LoadCheckReceiver", "action", e8);
        }
        if (bVar != null && cVar != null && dVar != null) {
            com.mbridge.msdk.newreward.function.f.b bVar2 = new com.mbridge.msdk.newreward.function.f.b(bVar.e(), bVar.d(), bVar.c(), bVar.f());
            this.f22148a = bVar2;
            bVar2.a(cVar, dVar);
            return null;
        }
        return null;
    }
}

package com.mbridge.msdk.newreward.function.c.b.a;

import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j implements com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f22173a;

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        if (bVar != null && bVar.b() != null) {
            try {
                Map map = (Map) bVar.b();
                this.f22173a = (com.mbridge.msdk.foundation.c.b) map.get("reason");
                com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
                com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
                map.put("candidate_type", 0);
                map.put("scene", 2);
                com.mbridge.msdk.newreward.function.a.b bVar3 = (com.mbridge.msdk.newreward.function.a.b) cVar.b(map);
                if (!com.mbridge.msdk.newreward.function.h.a.c(eVar.C())) {
                    a(bVar2, this.f22173a);
                    return;
                }
                eVar.f(true);
                if (bVar3 == null) {
                    a(bVar2, this.f22173a);
                    return;
                }
                if (bVar3.h() == com.mbridge.msdk.newreward.function.a.b.f22129d) {
                    eVar.x().a(bVar3.a());
                    if (bVar2 != null) {
                        try {
                            bVar2.a(bVar3.a());
                            return;
                        } catch (Exception e8) {
                            ad.a("SmartLoadReceiver", "handlerCandidateSuccess", e8);
                            return;
                        }
                    }
                    return;
                }
                a(bVar2, new com.mbridge.msdk.foundation.c.b(bVar3.g(), bVar3.b()));
                return;
            } catch (Exception e9) {
                ad.a("SmartLoadReceiver", "action", e9);
                if (bVar2 != null) {
                    com.mbridge.msdk.foundation.c.b bVar4 = this.f22173a;
                    if (bVar4 == null) {
                        a(bVar2, new com.mbridge.msdk.foundation.c.b(-1, "SmartLoadReceiver action exception"));
                        return;
                    } else {
                        a(bVar2, bVar4);
                        return;
                    }
                }
                return;
            }
        }
        a(bVar2, new com.mbridge.msdk.foundation.c.b(-1, "command or object is null"));
    }

    private static void a(com.mbridge.msdk.newreward.a.b.b bVar, com.mbridge.msdk.foundation.c.b bVar2) {
        if (bVar != null) {
            try {
                bVar.a(bVar2);
            } catch (Exception e8) {
                ad.a("SmartLoadReceiver", "handlerCandidateFailed", e8);
            }
        }
    }
}

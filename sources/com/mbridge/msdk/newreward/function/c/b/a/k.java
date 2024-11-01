package com.mbridge.msdk.newreward.function.c.b.a;

import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements com.mbridge.msdk.newreward.function.c.b.a {
    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(final com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        MBridgeTaskManager.commonExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.c.b.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.video.bt.module.b.f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (String) ((Map) bVar.b()).get("mb_ad_unit_id"));
                    ab.a();
                    ab.a(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                    ab.a(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                } catch (Exception unused) {
                }
            }
        });
    }
}

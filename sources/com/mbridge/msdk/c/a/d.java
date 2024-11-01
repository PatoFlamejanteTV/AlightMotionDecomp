package com.mbridge.msdk.c.a;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a("gaid", com.mbridge.msdk.foundation.tools.e.c());
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SettingRequestDiff", e8.getMessage());
            }
        }
    }
}

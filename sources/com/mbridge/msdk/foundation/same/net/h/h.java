package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public class h extends c {
    public h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.c
    public void addExtraParams(String str, e eVar) {
        try {
            try {
                int a9 = ai.a();
                String c8 = ai.c();
                if (eVar != null) {
                    eVar.a("misk_spt", String.valueOf(a9));
                    if (!TextUtils.isEmpty(c8)) {
                        eVar.a("misk_spt_det", c8);
                    }
                }
            } catch (Exception e8) {
                ad.a("CampaignRequest", e8.getMessage());
            }
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}

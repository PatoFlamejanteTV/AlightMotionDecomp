package com.mbridge.msdk.newreward.function.c.b.a;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h implements com.mbridge.msdk.newreward.function.c.b.a {
    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, final com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            Map map = (Map) bVar.b();
            int intValue = ((Integer) map.get("mb_ad_type")).intValue();
            String str = (String) map.get("mb_ad_pid");
            String str2 = (String) map.get("mb_ad_unit_id");
            com.mbridge.msdk.newreward.function.e.c.a().b().a(intValue, str, str2, ((Boolean) map.get("mb_ad_is_header_bidding")).booleanValue(), MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, str2), 1), new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.c.b.a.h.1
                @Override // com.mbridge.msdk.newreward.function.e.b
                public final void a(List<com.mbridge.msdk.newreward.function.d.a.b> list) {
                    try {
                        com.mbridge.msdk.newreward.a.b.b bVar3 = bVar2;
                        if (bVar3 != null) {
                            bVar3.a(list);
                        }
                    } catch (Exception e8) {
                        ad.a("RestoreFromDBReceiver", "action", e8);
                    }
                }

                @Override // com.mbridge.msdk.newreward.function.e.b
                public final void a() {
                    try {
                        com.mbridge.msdk.newreward.a.b.b bVar3 = bVar2;
                        if (bVar3 != null) {
                            bVar3.a(new com.mbridge.msdk.foundation.c.b(880040, "no cached campaign in db"));
                        }
                    } catch (Exception e8) {
                        ad.a("RestoreFromDBReceiver", "action", e8);
                    }
                }
            });
        } catch (Exception e8) {
            ad.a("RestoreFromDBReceiver", "action", e8);
        }
    }
}

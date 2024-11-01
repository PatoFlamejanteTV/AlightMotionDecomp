package com.mbridge.msdk.newreward.function.c.b.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements com.mbridge.msdk.newreward.function.c.b.b {
    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        char c8;
        try {
            Map map = (Map) obj;
            com.mbridge.msdk.newreward.function.c.d dVar = (com.mbridge.msdk.newreward.function.c.d) map.get("result");
            Map map2 = (Map) map.get("obj_map");
            String str = (String) map.get("type");
            int hashCode = str.hashCode();
            if (hashCode == -2057274110) {
                if (str.equals("bridge_ids")) {
                    c8 = 2;
                }
                c8 = 65535;
            } else if (hashCode != -1019779949) {
                if (hashCode == 95346201 && str.equals("daily")) {
                    c8 = 0;
                }
                c8 = 65535;
            } else {
                if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    c8 = 1;
                }
                c8 = 65535;
            }
            if (c8 == 0) {
                if (a("daily", dVar, map2)) {
                    return;
                }
                MBridgeDailyPlayModel mBridgeDailyPlayModel = new MBridgeDailyPlayModel(((Integer) map.get("mb_ad_type")).intValue(), (String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("daily", mBridgeDailyPlayModel);
                dVar.a(mBridgeDailyPlayModel);
                return;
            }
            if (c8 != 1) {
                if (c8 == 2 && !a("bridge_ids", dVar, map2)) {
                    MBridgeIds mBridgeIds = new MBridgeIds((String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                    map2.put("bridge_ids", mBridgeIds);
                    dVar.a(mBridgeIds);
                    return;
                }
                return;
            }
            if (a(TypedValues.CycleType.S_WAVE_OFFSET, dVar, map2)) {
                return;
            }
            MBridgeOffsetManager mBridgeOffsetManager = new MBridgeOffsetManager();
            map2.put(TypedValues.CycleType.S_WAVE_OFFSET, mBridgeOffsetManager);
            dVar.a(mBridgeOffsetManager);
        } catch (Exception e8) {
            ad.a("CreateObjectReceiver", "action", e8);
        }
    }

    private boolean a(String str, com.mbridge.msdk.newreward.function.c.d dVar, Map map) {
        if (map.get(str) == null) {
            return false;
        }
        dVar.a(map.get(str));
        return true;
    }
}

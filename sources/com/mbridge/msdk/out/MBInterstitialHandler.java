package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.interstitial.c.a;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBInterstitialHandler {
    private a mController;
    private String unitId;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.unitId = str;
            if (!TextUtils.isEmpty(str)) {
                String e8 = ai.e(str);
                if (!TextUtils.isEmpty(e8)) {
                    ai.b(str, e8);
                }
            }
        }
        this.mController.a(context, map);
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.mController;
        if (aVar != null) {
            return aVar.c();
        }
        return "";
    }

    public String getRequestId() {
        a aVar = this.mController;
        if (aVar != null) {
            return aVar.b();
        }
        return "";
    }

    public void preload() {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            a aVar = this.mController;
            if (aVar != null) {
                aVar.a(interstitialListener);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void show() {
        try {
            this.mController.d();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}

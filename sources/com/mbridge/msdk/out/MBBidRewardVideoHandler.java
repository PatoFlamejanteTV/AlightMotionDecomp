package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.f.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;
import com.mbridge.msdk.video.bt.module.b.g;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidRewardVideoHandler implements BaseExtraInterfaceForHandler {
    private static final String REFACTOR_SWITCH_REWARD_VIDEO = "new_bridge_reward_video";
    private static final String TAG = "MBBidRewardVideoHandler";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private a controller;
    private d newController;
    private String placementId;
    private String unitId;
    private boolean refactorAvailable = false;
    private g listener = null;
    private int isSilent = 2;
    private boolean isRewardPlusOpen = false;
    private boolean isSetListenerNewController = false;
    private boolean isSetListenerController = false;
    private boolean isConfigAlertDialogTextController = false;
    private boolean isConfigAlertDialogTextNewController = false;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.placementId = str;
        this.unitId = str2;
    }

    private void checkAndCreateController() {
        if (this.controller == null) {
            initMBBidRewardVideoHandler(this.placementId, this.unitId);
        }
        configController();
    }

    private void checkAndCreateNewController() {
        if (this.newController == null) {
            initMBNewBidRewardVideoHandler(this.placementId, this.unitId);
        }
        configNewController();
    }

    private void configController() {
        if (this.controller == null) {
            return;
        }
        if (this.isSetListenerController) {
            if (b.a()) {
                this.controller.a(new com.mbridge.msdk.video.bt.module.b.a(this.listener, this.unitId, true));
            } else {
                this.controller.a(new com.mbridge.msdk.video.bt.module.b.a(this.listener));
            }
            this.isSetListenerController = false;
        }
        this.controller.c(this.isRewardPlusOpen);
        this.controller.a(this.isSilent);
        if (this.isConfigAlertDialogTextController) {
            this.controller.a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextController = false;
        }
    }

    private void configNewController() {
        d dVar = this.newController;
        if (dVar == null) {
            return;
        }
        if (this.isSetListenerNewController) {
            dVar.a(new RewardVideoListenerWrapper(this.listener));
            this.isSetListenerNewController = false;
        }
        this.newController.a(this.isRewardPlusOpen);
        this.newController.a(this.isSilent);
        if (this.isConfigAlertDialogTextNewController) {
            MBridgeGlobalCommon.setAlertDialogText(this.unitId, this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextNewController = false;
        }
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                a aVar = new a();
                this.controller = aVar;
                aVar.a(false);
                this.controller.b(true);
                this.controller.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a(TAG, th.getMessage(), th);
        }
    }

    private void initMBNewBidRewardVideoHandler(String str, String str2) {
        if (this.newController == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.newController = new d(94, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.refactorAvailable) {
            return;
        }
        try {
            if (this.controller != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.controller;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.controller;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.controller;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFromBid(String str) {
        boolean a9 = com.mbridge.msdk.foundation.same.b.a().a(REFACTOR_SWITCH_REWARD_VIDEO);
        this.refactorAvailable = a9;
        if (a9) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 94, this.unitId, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.isSilent = i8;
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.confirmTitle = str;
        this.confirmContent = str2;
        this.confirmText = str3;
        this.cancelText = str4;
        this.isConfigAlertDialogTextController = true;
        this.isConfigAlertDialogTextNewController = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.unitId, jSONObject);
    }

    public void setRewardPlus(boolean z8) {
        this.isRewardPlusOpen = z8;
    }

    public void setRewardVideoListener(g gVar) {
        this.listener = gVar;
        this.isSetListenerNewController = true;
        this.isSetListenerController = true;
    }

    public void showFromBid() {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 94, this.unitId, false, -1));
        }
    }

    public void showFromBid(String str) {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 94, this.unitId, false, -1));
        }
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.placementId = str;
        this.unitId = str2;
    }

    public void showFromBid(String str, String str2) {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, str2, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 94, this.unitId, false, -1));
        }
    }
}

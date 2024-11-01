package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.video.bt.module.b.h;

/* loaded from: classes4.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static h showRewardListener;

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context c8 = c.m().c();
        if (!TextUtils.isEmpty(str2)) {
            al.b(c8, "MBridge_ConfirmTitle" + str, str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            al.b(c8, "MBridge_ConfirmContent" + str, str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            al.b(c8, "MBridge_CancelText" + str, str5.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(c8, "MBridge_ConfirmText" + str, str4.trim());
        }
    }
}

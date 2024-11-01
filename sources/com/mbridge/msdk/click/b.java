package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {
    public static void a(Context context, String str, CampaignEx campaignEx, String str2, int i8) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a.a(context, campaignEx, str, str2, true, false, com.mbridge.msdk.click.a.a.f19313i);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, JumpLoaderResult jumpLoaderResult, Boolean bool, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        ah.a(context, jumpLoaderResult.getUrl(), nativeTrackingListener, campaignEx, list);
    }
}

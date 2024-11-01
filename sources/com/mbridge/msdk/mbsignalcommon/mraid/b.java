package com.mbridge.msdk.mbsignalcommon.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public interface b {
    void close();

    void expand(String str, boolean z8);

    CampaignEx getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z8);
}

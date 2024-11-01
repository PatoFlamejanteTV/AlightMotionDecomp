package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class c implements com.mbridge.msdk.video.signal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23846a = "c";

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i8, String str) {
        ad.a(f23846a, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i8, String str) {
        ad.a(f23846a, "handlerH5Exception");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        ad.a(f23846a, "reactDeveloper");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        ad.a(f23846a, "reportUrls");
    }
}

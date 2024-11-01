package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes4.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i8) {
        ad.a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i8, String str) {
        ad.a("DefaultJSNotifyProxy", "onClick:" + i8 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.b bVar) {
        ad.a("DefaultJSNotifyProxy", "onProgressNotify:" + bVar.toString());
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        ad.a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i8, int i9, int i10, int i11) {
        ad.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}

package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public String a() {
        ad.a("js", "getEndScreenInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void b(String str) {
        ad.a("js", "setOrientation,landscape=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void c(String str) {
        ad.a("js", "handlerPlayableException，msg=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        ad.a("js", "notifyCloseBtn,state=" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        ad.a("js", "toggleCloseBtn,state=" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        ad.a("js", "triggerCloseBtn,state=" + str);
    }
}

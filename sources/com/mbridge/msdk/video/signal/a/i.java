package com.mbridge.msdk.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private WebView f23847a;

    /* renamed from: b, reason: collision with root package name */
    private int f23848b = 0;

    public i(WebView webView) {
        this.f23847a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a() {
        super.a();
        this.f23848b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23847a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void b() {
        super.b();
        this.f23848b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23847a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void c() {
        super.c();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23847a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void g() {
        super.g();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23847a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final int h() {
        return this.f23848b;
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23847a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a(int i8) {
        super.a(i8);
        this.f23848b = i8;
    }
}

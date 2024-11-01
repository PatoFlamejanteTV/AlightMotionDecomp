package com.mbridge.msdk.video.signal.a;

import android.content.res.Configuration;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class b implements com.mbridge.msdk.video.signal.b {
    @Override // com.mbridge.msdk.video.signal.b
    public void a() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onPause");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void b() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onResume");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void c() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onDestory");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public final void d() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onStop");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public final void e() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onStart");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public final void f() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onRestart");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void g() {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onBackPressed");
    }

    @Override // com.mbridge.msdk.video.signal.b
    public int h() {
        ad.a("DefaultJSActivity", "isSystemResume");
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        ad.a("DefaultJSActivity", "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }

    @Override // com.mbridge.msdk.video.signal.b
    public void a(int i8) {
        ad.a("DefaultJSActivity", "setSystemResume,isResume:" + i8);
    }
}

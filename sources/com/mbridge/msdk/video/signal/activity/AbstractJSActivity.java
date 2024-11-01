package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes4.dex */
public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new a();

    public boolean canBackPress() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (getJSCommon().b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (canBackPress()) {
            super.onBackPressed();
        } else {
            ad.a(TAG, "onBackPressed can't excute");
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (getJSCommon().b()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f20403c) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }
}

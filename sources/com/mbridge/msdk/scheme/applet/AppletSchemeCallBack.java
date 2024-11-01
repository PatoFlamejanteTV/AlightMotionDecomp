package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i8, String str, String str2) {
        try {
            onRequestFailed(i8, str, str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e8.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e8.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e8.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i8, String str, String str2) {
        try {
            onRequestFailed(i8, str, str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e8.getMessage());
            }
        }
    }

    protected abstract void onRequestFailed(int i8, String str, String str2);

    protected abstract void onRequestStart();

    protected abstract void onRequestSuccess(String str);
}

package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.splash.d.c;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBSplashHandler implements BaseExtraInterfaceForHandler {
    private static final String TAG = "MBSplashHandler";
    private static boolean canSkip = true;
    private static int defCountDownS = 5;
    private static int logoSizeH = 0;
    private static int logoSizeW = 0;
    private static int orientation = 1;
    private c splashProvider;
    private String unitId;

    public MBSplashHandler(String str, String str2) {
        this(str, str2, canSkip, defCountDownS);
    }

    public void allowClickSplash(boolean z8) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d(z8);
        }
    }

    public ViewGroup createZoomOutByType(ZoomOutTypeEnum zoomOutTypeEnum) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.a(zoomOutTypeEnum);
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.f();
        }
        return "";
    }

    public String getRequestId() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.e();
        }
        return "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void loadAndShow(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("", viewGroup);
        }
    }

    public void loadAndShowByToken(String str, ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str, viewGroup);
        }
    }

    public void onDestroy() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void onPause() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.j();
        }
    }

    public void onResume() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.i();
        }
    }

    public void preLoad() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("");
        }
    }

    public void preLoadByToken(String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void setDevCloseView(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(viewGroup);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        com.mbridge.msdk.foundation.controller.c.m().a(this.unitId, jSONObject);
    }

    public void setLoadTimeOut(long j8) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(j8);
        }
    }

    public void setLogoView(View view, int i8, int i9) {
        if (this.splashProvider != null) {
            this.splashProvider.a(view, new RelativeLayout.LayoutParams(i8, i9));
        }
    }

    public void setNotchScreenParameter(int i8, int i9, int i10, int i11) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(i8, i10, i9, i11);
        }
    }

    public void setOrientation(int i8) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(i8);
        }
    }

    public void setSplashLoadListener(MBSplashLoadListener mBSplashLoadListener) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(mBSplashLoadListener);
        }
    }

    public void setSplashShowListener(MBSplashShowListener mBSplashShowListener) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(mBSplashShowListener);
        }
    }

    public void setSupportZoomOut(boolean z8) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(z8);
        }
    }

    public void show(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d("", viewGroup);
        }
    }

    public void zoomOutAttacked() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.g();
        }
    }

    public void zoomOutPlayFinish() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.h();
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2) {
        this(activity, str, str2, canSkip, defCountDownS);
    }

    public boolean isReady(String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.c(str);
        }
        return false;
    }

    public MBSplashHandler(String str, String str2, boolean z8, int i8) {
        this(str, str2, z8, i8, orientation, logoSizeH, logoSizeW);
    }

    public void loadAndShow(Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("", activity);
        }
    }

    public void loadAndShowByToken(String str, Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str, activity);
        }
    }

    public void show(ViewGroup viewGroup, String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(str, viewGroup);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z8, int i8) {
        this(activity, str, str2, z8, i8, orientation, logoSizeH, logoSizeW);
    }

    public MBSplashHandler(String str, String str2, boolean z8, int i8, int i9, int i10, int i11) {
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.unitId = str2;
        c cVar = new c((Activity) null, str, str2);
        this.splashProvider = cVar;
        cVar.b(z8);
        this.splashProvider.b(i8);
        this.splashProvider.a(i9);
        this.splashProvider.a(i10, i11);
    }

    public void show(Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d("", activity);
        }
    }

    public void show(Activity activity, String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(str, activity);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z8, int i8, int i9, int i10, int i11) {
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        c cVar = new c(activity, str, str2);
        this.splashProvider = cVar;
        cVar.b(z8);
        this.splashProvider.b(i8);
        this.splashProvider.a(i9);
        this.splashProvider.a(i10, i11);
    }
}

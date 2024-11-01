package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.controller.d;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.e;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class a implements MBridgeSDK {
    protected static final String LOG_TAG = "com.mbridge.msdk";
    public static Map<String, String> map;
    private b mBridgeSDKImplDiff;
    protected volatile Context mContext;
    protected SDKInitStatusListener mStatusListener;
    protected volatile AtomicBoolean sdkInited;
    public boolean isCoolStart = true;
    protected volatile MBridgeSDK.PLUGIN_LOAD_STATUS STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;
    protected boolean initCallbacked = false;
    protected boolean isRegisteredLifeCycle = false;
    protected volatile boolean isMIMinited = false;
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.mbridge.msdk.system.a.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (a.this.isMIMinited) {
                MIMManager.a().e();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (a.this.isMIMinited) {
                MIMManager.a().f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ad.b("com.mbridge.msdk", "onActivityPaused currentActivityNum:" + c.m().f());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int f8 = c.m().f();
            ad.b("com.mbridge.msdk", "onActivityStarted currentActivityNum:" + f8);
            ad.b("com.mbridge.msdk", "onActivityStarted isCoolStart:" + a.this.isCoolStart);
            if (!a.this.isCoolStart && f8 == 0) {
                k.a("1");
            }
            if (a.this.mBridgeSDKImplDiff != null) {
                b unused = a.this.mBridgeSDKImplDiff;
                a aVar = a.this;
                boolean z8 = aVar.isCoolStart;
                Context context = aVar.mContext;
            }
            a.this.isCoolStart = false;
            c.m().a(f8 + 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int f8 = c.m().f();
            ad.b("com.mbridge.msdk", "onActivityStopped currentActivityNum:" + f8);
            if (f8 == 1 || f8 == 0) {
                k.a("2");
            }
            c.m().a(f8 - 1);
        }
    };

    private void initMIMManager() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str) && str.equals("Xiaomi")) {
                this.isMIMinited = true;
                MIMManager.a().a(this.mContext.getApplicationContext());
            }
        } catch (Throwable th) {
            ad.b("com.mbridge.msdk", th.getMessage());
        }
    }

    private void startTrackManager() {
        g.a().c();
    }

    private void unregisterActivityLifecycleListener(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (this.isRegisteredLifeCycle && (activityLifecycleCallbacks = this.activityLifecycleCallbacks) != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public void checkAliveContext(Context context) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public boolean getConsentStatus(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().e();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.STATUS;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preload(Map<String, Object> map2) {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            d.a().a(map2, 0);
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preloadFrame(Map<String, Object> map2) {
        d.a().a(map2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:            if (com.mbridge.msdk.foundation.tools.af.a().a("c_r_a_l_c", 0) == 0) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void registerActivityLifecycleListener(android.app.Application r5) {
        /*
            r4 = this;
            r0 = 1
            com.mbridge.msdk.foundation.tools.af r1 = com.mbridge.msdk.foundation.tools.af.a()     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = "c_r_a_l_c"
            r3 = 0
            int r1 = r1.a(r2, r3)     // Catch: java.lang.Exception -> Lf
            if (r1 != 0) goto L1a
            goto L19
        Lf:
            r1 = move-exception
            java.lang.String r2 = "com.mbridge.msdk"
            java.lang.String r1 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r2, r1)
        L19:
            r3 = 1
        L1a:
            if (r5 == 0) goto L27
            if (r3 == 0) goto L27
            android.app.Application$ActivityLifecycleCallbacks r1 = r4.activityLifecycleCallbacks
            if (r1 == 0) goto L25
            r5.registerActivityLifecycleCallbacks(r1)
        L25:
            r4.isRegisteredLifeCycle = r0
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.system.a.registerActivityLifecycleListener(android.app.Application):void");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void release() {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            d.a().c();
        }
        if (this.mContext instanceof Application) {
            unregisterActivityLifecycleListener((Application) this.mContext);
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowAcquireIds(boolean z8) {
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.a(z8);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowTransferIdsIfLimit(boolean z8) {
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.b(z8);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, int i8) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().a(i8);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setCoppaStatus(Context context, boolean z8) {
        int i8;
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j();
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        com.mbridge.msdk.foundation.a.a.a.a().b(MBridgeConstans.AUTHORITY_COPPA, i8);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && developerTransferIdInfo != null && !TextUtils.isEmpty(developerTransferIdInfo.getGaid())) {
            e.a(developerTransferIdInfo.getGaid());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(boolean z8) {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().b(z8 ? 1 : 0);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setPlayVideoMute(int i8, int i9) {
        if (i8 == 94) {
            com.mbridge.msdk.foundation.same.a.f20650V = i9;
        } else if (i8 == 287) {
            com.mbridge.msdk.foundation.same.a.f20651W = i9;
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setThirdPartyFeatures(Map<String, Object> map2) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setUserPrivateInfoType(Context context, String str, int i8) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().a(str, i8);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        c.m().a(weakReference);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public AuthorityInfoBean userPrivateInfo(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().d();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, boolean z8) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(Context context, boolean z8) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().b(z8 ? 1 : 0);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        return hashMap;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().a(context, (OnCompletionListener) null);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, OnCompletionListener onCompletionListener) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().a(context, onCompletionListener);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z8) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    private void init() {
        SDKInitStatusListener sDKInitStatusListener;
        SDKInitStatusListener sDKInitStatusListener2;
        if (this.sdkInited == null) {
            this.sdkInited = new AtomicBoolean(false);
        }
        this.initCallbacked = false;
        try {
            if (this.sdkInited.get() && (sDKInitStatusListener2 = this.mStatusListener) != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener2.onInitSuccess();
                return;
            }
        } catch (Exception e8) {
            ad.b("com.mbridge.msdk", e8.getMessage());
        }
        if (this.mContext == null && (sDKInitStatusListener = this.mStatusListener) != null) {
            sDKInitStatusListener.onInitFail("Context can not be null.");
            this.initCallbacked = true;
            return;
        }
        try {
            this.mBridgeSDKImplDiff = new b();
            d.a().a(map, this.mContext);
            this.STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            startTrackManager();
            ai.j();
            initMIMManager();
            if (this.mContext instanceof Application) {
                registerActivityLifecycleListener((Application) this.mContext);
            }
            this.sdkInited.set(true);
        } catch (Exception e9) {
            ad.a("com.mbridge.msdk", "INIT FAIL", e9);
            if (this.sdkInited != null) {
                this.sdkInited.set(false);
            }
            SDKInitStatusListener sDKInitStatusListener3 = this.mStatusListener;
            if (sDKInitStatusListener3 != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener3.onInitFail(e9.getMessage());
            }
        }
        try {
            f.a().b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            if (this.sdkInited != null) {
                dVar.a(NotificationCompat.CATEGORY_STATUS, this.sdkInited.get() ? "1" : "2");
                dVar.a("is_allow_crash", c.m().d().b() ? "1" : "2");
                dVar.a("is_allow_anr", c.m().d().a() ? "1" : "2");
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.a("m_init_sdk", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_init_sdk", bVar);
        } catch (Throwable th) {
            ad.b("com.mbridge.msdk", th.getMessage());
        }
        SDKInitStatusListener sDKInitStatusListener4 = this.mStatusListener;
        if (sDKInitStatusListener4 == null || this.initCallbacked) {
            return;
        }
        this.initCallbacked = true;
        sDKInitStatusListener4.onInitSuccess();
    }

    public void init(Application application) {
        this.mContext = application.getApplicationContext();
        init();
    }
}

package com.mbridge.msdk.out;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.system.NoProGuard;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class CustomInfoManager implements NoProGuard {
    private static CustomInfoManager INSTANCE = null;
    private static String TAG = "CustomInfoManager";
    public static final int TYPE_BID = 6;
    public static final int TYPE_BIDLOAD = 7;
    public static final int TYPE_LOAD = 8;
    private ConcurrentHashMap<String, String> infoMap = new ConcurrentHashMap<>();

    private CustomInfoManager() {
    }

    public static synchronized CustomInfoManager getInstance() {
        CustomInfoManager customInfoManager;
        synchronized (CustomInfoManager.class) {
            try {
                if (INSTANCE == null) {
                    synchronized (CustomInfoManager.class) {
                        try {
                            if (INSTANCE == null) {
                                INSTANCE = new CustomInfoManager();
                            }
                        } finally {
                        }
                    }
                }
                customInfoManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return customInfoManager;
    }

    public String getCustomInfoByType(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getCustomInfoByUnitId(str, i8);
    }

    public String getCustomInfoByUnitId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str2);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return getCustomInfoByUnitId(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return getCustomInfoByUnitId(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains("v3")) {
                    return getCustomInfoByUnitId(str, 8);
                }
            }
        } catch (Throwable th) {
            ad.a(TAG, "Exception", th);
        }
        return "";
    }

    public void setCustomInfo(String str, int i8, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            String b9 = x.b(str2);
            if (i8 != 6) {
                if (i8 != 7) {
                    if (i8 == 8) {
                        this.infoMap.put(str, b9);
                        return;
                    }
                    return;
                } else {
                    this.infoMap.put(str + "_bidload", b9);
                    return;
                }
            }
            this.infoMap.put(str + "_bid", b9);
        }
    }

    public String getCustomInfoByUnitId(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i8 == 6) {
            return this.infoMap.get(str + "_bid");
        }
        if (i8 != 7) {
            return i8 != 8 ? "" : this.infoMap.get(str);
        }
        return this.infoMap.get(str + "_bidload");
    }
}

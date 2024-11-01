package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.system.NoProGuard;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.d.c> rewardUnitSettings;

    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final RewardUnitCacheManager f22511a = new RewardUnitCacheManager();
    }

    public static RewardUnitCacheManager getInstance() {
        return a.f22511a;
    }

    public final void add(String str, String str2, com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e8) {
            ad.b(TAG, e8.getMessage());
        }
    }

    public final com.mbridge.msdk.videocommon.d.c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e8) {
                ad.b(TAG, e8.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }
}

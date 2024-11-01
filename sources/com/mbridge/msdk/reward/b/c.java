package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22899a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22900b;

    public c(Context context, String str) {
        this.f22899a = context;
        this.f22900b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> a9;
        if (this.f22899a != null && !TextUtils.isEmpty(this.f22900b)) {
            try {
                com.mbridge.msdk.reward.c.a.a(this.f22899a, this.f22900b);
                ab.a();
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                com.mbridge.msdk.videocommon.d.b.a().c(this.f22900b);
                if (!af.a().a("c_d_v_w_i", false) && !TextUtils.isEmpty(this.f22900b) && (a9 = com.mbridge.msdk.videocommon.a.a.a().a(this.f22900b, 1)) != null && a9.size() > 0) {
                    com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f22899a, this.f22900b, a9, 94, (com.mbridge.msdk.videocommon.listener.a) null);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoControllerInitTask", "initRewardVideoController task ", e8);
                }
            }
        }
    }
}

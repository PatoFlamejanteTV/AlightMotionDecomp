package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class h extends k {
    public h(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        if (i8 != 100) {
            if (i8 != 109) {
                if (i8 != 122) {
                    if (i8 != 129) {
                        String str = "";
                        if (i8 != 118) {
                            if (i8 == 119) {
                                if (obj != null && (obj instanceof String)) {
                                    str = (String) obj;
                                }
                                a(4, str);
                            }
                        } else {
                            if (obj != null && (obj instanceof String)) {
                                str = (String) obj;
                            }
                            a(3, str);
                        }
                    } else {
                        CampaignEx campaignEx = this.f23781b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                            g();
                            f();
                            e();
                            a(1);
                        }
                    }
                } else {
                    a();
                }
            } else {
                b(2);
            }
        } else {
            g();
            f();
            e();
            a(2);
        }
        super.a(i8, obj);
    }
}

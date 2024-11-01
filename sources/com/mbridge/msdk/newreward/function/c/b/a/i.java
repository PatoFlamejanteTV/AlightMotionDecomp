package com.mbridge.msdk.newreward.function.c.b.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.d.c.n;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class i implements com.mbridge.msdk.newreward.function.c.b.b {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f22170a;

    /* loaded from: classes4.dex */
    private static class a implements com.mbridge.msdk.video.bt.module.b.h {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f22171a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.e f22172b;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.e eVar) {
            this.f22171a = bVar;
            this.f22172b = eVar;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i8, String str, String str2) {
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                this.f22172b.D().onEndcardShow(new MBridgeIds(this.f22172b.w(), this.f22172b.A()));
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onEndcardShow", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22171a.a(), this.f22171a.b(), this.f22171a.c(), this.f22171a.e(), 6);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000130", bVar);
                this.f22172b.D().onAdShow(new MBridgeIds(this.f22172b.w(), this.f22172b.A()));
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onAdShow", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar);
                this.f22172b.D().onAdClose(new MBridgeIds(this.f22172b.w(), this.f22172b.A()), new RewardInfo(z8, cVar.a(), String.valueOf(cVar.b())));
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onAdClose", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22171a.a(), this.f22171a.b(), this.f22171a.c(), this.f22171a.e(), 7);
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("reason", str);
                bVar.a("2000131", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000131", bVar);
                this.f22172b.D().onShowFail(new MBridgeIds(this.f22172b.w(), this.f22172b.A()), str);
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onShowFail", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, String str, String str2) {
            try {
                this.f22172b.D().onVideoAdClicked(new MBridgeIds(this.f22172b.w(), this.f22172b.A()));
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onVideoAdClicked", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                this.f22172b.D().onVideoComplete(new MBridgeIds(this.f22172b.w(), this.f22172b.A()));
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onVideoComplete", e8);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, int i8) {
            try {
                this.f22172b.D().onAdCloseWithIVReward(new MBridgeIds(this.f22172b.w(), this.f22172b.A()), z8, i8);
            } catch (Exception e8) {
                ad.a("DefaultShowRewardListener", "onAdCloseWithIVReward", e8);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        Intent intent;
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) ((com.mbridge.msdk.newreward.function.c.b) obj).b();
        this.f22170a = eVar;
        if (eVar != null) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b b9 = eVar.x().b();
                try {
                    Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                    String str = MBRewardVideoActivity.INTENT_UNITID;
                    intent = new Intent(c8, (Class<?>) MBRewardVideoActivity.class);
                } catch (Exception unused) {
                    intent = null;
                }
                intent.putExtra(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f22170a.A());
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f22170a.w());
                intent.putExtra(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f22170a.H());
                boolean z8 = false;
                if (this.f22170a.p() == 287) {
                    z8 = true;
                }
                intent.putExtra("isIV", z8);
                intent.putExtra("isBid", TextUtils.isEmpty(this.f22170a.C()));
                if (z8) {
                    intent.putExtra("ivRewardMode", this.f22170a.k());
                    intent.putExtra("ivRewardValueType", this.f22170a.j());
                    intent.putExtra("ivRewardValue", this.f22170a.k());
                }
                intent.putExtra("isBigOffer", !TextUtils.isEmpty(b9.z()));
                intent.putExtra("is_refactor", true);
                List<com.mbridge.msdk.newreward.function.d.a.a> s8 = b9.s();
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.a> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (com.mbridge.msdk.newreward.function.d.a.a aVar : s8) {
                    CampaignEx g8 = aVar.g();
                    g8.setReady_rate(100);
                    copyOnWriteArrayList.add(g8);
                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.m().c(), g8, this.f22170a.A(), 1);
                    aVar2.d(this.f22170a.p());
                    aVar2.d(g8.getVideoUrlEncode());
                    n d8 = aVar.d();
                    if (d8 != null) {
                        aVar2.c(d8.f().getPath());
                    }
                    copyOnWriteArrayList2.add(aVar2);
                }
                com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f22170a.A(), copyOnWriteArrayList);
                com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f22170a.A(), copyOnWriteArrayList2);
                intent.addFlags(268435456);
                MBridgeGlobalCommon.showRewardListener = new a(b9, this.f22170a);
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(intent);
            } catch (Exception e8) {
                ad.a("ShowReceiver", "show", e8);
            }
        }
    }
}

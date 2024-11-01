package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.e.f;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f23429a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f23430b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private int f23431c = 500;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f23429a == null) {
            synchronized (a.class) {
                try {
                    if (f23429a == null) {
                        f23429a = new a();
                    }
                    aVar = f23429a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return f23429a;
    }

    public final void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f23430b;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f23430b.clear();
            }
        } catch (Exception e8) {
            ad.b("MOfferEnergize", e8.getMessage());
        }
    }

    private int b(String str) {
        return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
    }

    public final void a(final ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.a.a aVar) {
        if (viewGroup == null || aVar == null || this.f23430b == null || TextUtils.isEmpty(str) || !this.f23430b.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f23430b.get(str);
        final MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new f() { // from class: com.mbridge.msdk.video.dynview.moffer.a.1
            @Override // com.mbridge.msdk.video.dynview.e.f
            public final void a(ViewGroup viewGroup2, CampaignUnit campaignUnit) {
                ViewGroup viewGroup3;
                if (viewGroup2 == null || (viewGroup3 = viewGroup) == null) {
                    return;
                }
                try {
                    a.a(a.this, mOfferModel, viewGroup3, viewGroup2, campaignUnit);
                } catch (Exception e8) {
                    ad.b("MOfferEnergize", e8.getMessage());
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.f
            public final void a(int i8, String str2) {
                ad.b("MOfferEnergize", str2);
            }
        }, aVar);
        mOfferModel.showView();
    }

    public final void a(CampaignEx campaignEx, int i8) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f23430b == null) {
            this.f23430b = new ConcurrentHashMap();
        }
        if (this.f23430b.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i8);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f23430b.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e8) {
            ad.b("MOfferEnergize", e8.getMessage());
        }
    }

    public final void a(CampaignEx campaignEx, final ViewGroup viewGroup, com.mbridge.msdk.video.module.a.a aVar, int i8) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f23430b == null) {
            this.f23430b = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i8);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f23430b.put(str, softReference);
                final MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new f() { // from class: com.mbridge.msdk.video.dynview.moffer.a.3
                    @Override // com.mbridge.msdk.video.dynview.e.f
                    public final void a(int i9, String str2) {
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.f
                    public final void a(ViewGroup viewGroup2, CampaignUnit campaignUnit) {
                        if (viewGroup2 == null || campaignUnit == null) {
                            return;
                        }
                        try {
                            a.a(a.this, mOfferModel2, viewGroup, viewGroup2, campaignUnit);
                        } catch (Exception e8) {
                            ad.b("MOfferEnergize", e8.getMessage());
                        }
                    }
                }, aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e8) {
            ad.b("MOfferEnergize", e8.getMessage());
        }
    }

    public final boolean a(String str) {
        if (this.f23430b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f23430b.containsKey(str);
    }

    static /* synthetic */ void a(a aVar, final MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        View findViewById;
        int i8;
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        RelativeLayout relativeLayout2;
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        RelativeLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.addRule(12, -1);
        int a9 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 5.0f);
        layoutParams2.setMargins(a9, a9, a9, a9);
        if (viewGroup2.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getDrawable(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable != null && (findViewById = viewGroup2.findViewById(aVar.b("mbridge_moreoffer_hls"))) != null) {
                    findViewById.setBackground(drawable);
                }
            } catch (Exception e8) {
                ad.b("MOfferEnergize", e8.getMessage());
            }
        }
        viewGroup2.setLayoutParams(layoutParams2);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() == null || mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() == null) {
                    i8 = 1;
                } else {
                    i8 = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().b();
                    if (i8 == 0) {
                        i8 = z.r(com.mbridge.msdk.foundation.controller.c.m().c());
                    }
                }
                if (i8 != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
                    if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                        imageView2 = (ImageView) viewGroup.findViewById(-1803557032);
                    } else {
                        imageView2 = (ImageView) viewGroup.findViewById(aVar.b("mbridge_iv_adbanner"));
                    }
                    int g8 = ai.g(com.mbridge.msdk.foundation.controller.c.m().c()) - ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 220.0f);
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                    layoutParams3.height = g8;
                    layoutParams3.width = (g8 * 16) / 9;
                    imageView2.setLayoutParams(layoutParams3);
                }
                if (viewGroup instanceof MBridgeNativeEndCardView) {
                    if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                        relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                        imageView = (ImageView) viewGroup.findViewById(389008949);
                        textView = (TextView) viewGroup.findViewById(1561614848);
                    } else {
                        relativeLayout = (RelativeLayout) viewGroup.findViewById(aVar.b("mbridge_native_ec_layout"));
                        imageView = (ImageView) viewGroup.findViewById(aVar.b("mbridge_iv_flag"));
                        textView = (TextView) viewGroup.findViewById(aVar.b("mbridge_tv_flag"));
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(imageView);
                    arrayList.add(textView);
                    new com.mbridge.msdk.video.dynview.h.b().a(arrayList, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 100.0f), aVar.f23431c);
                } else {
                    relativeLayout = null;
                }
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams4.setMargins(0, 0, 0, 0);
                viewGroup2.setLayoutParams(layoutParams4);
                if (relativeLayout != null) {
                    relativeLayout.addView(viewGroup2);
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
        } else {
            try {
                if (viewGroup instanceof MBridgeNativeEndCardView) {
                    if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                        relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-1642631508);
                    } else {
                        relativeLayout2 = (RelativeLayout) viewGroup.findViewById(aVar.b("mbridge_native_ec_layout"));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(relativeLayout2);
                    new com.mbridge.msdk.video.dynview.h.b().a(arrayList2, 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 100.0f), aVar.f23431c);
                }
                RelativeLayout relativeLayout3 = (RelativeLayout) viewGroup.findViewById(aVar.b("mbridge_reward_moreoffer_layout"));
                if (relativeLayout3 == null) {
                    relativeLayout3 = (RelativeLayout) viewGroup.findViewById(-82036151);
                }
                if (relativeLayout3 != null) {
                    if (viewGroup.isShown()) {
                        relativeLayout3.setVisibility(0);
                        relativeLayout3.addView(viewGroup2);
                    }
                } else {
                    viewGroup.addView(viewGroup2);
                }
            } catch (Exception e10) {
                ad.b("MOfferEnergize", e10.getMessage());
            }
        }
        new com.mbridge.msdk.video.dynview.h.b().a(viewGroup2, 0, ai.f(com.mbridge.msdk.foundation.controller.c.m().c()), 0, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.dynview.moffer.a.2
            @Override // java.lang.Runnable
            public final void run() {
                MOfferModel mOfferModel2 = mOfferModel;
                if (mOfferModel2 != null) {
                    mOfferModel2.checkViewVisiableState();
                }
            }
        }, aVar.f23431c + 500);
    }
}

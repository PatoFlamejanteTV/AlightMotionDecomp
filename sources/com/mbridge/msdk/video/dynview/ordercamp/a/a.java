package com.mbridge.msdk.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.dynview.h.b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f23440a = false;

    /* renamed from: b, reason: collision with root package name */
    private C0435a f23441b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f23442c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0435a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f23446a;

        /* renamed from: b, reason: collision with root package name */
        MBRotationView f23447b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f23448c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f23449d;

        /* renamed from: e, reason: collision with root package name */
        TextView f23450e;

        /* renamed from: f, reason: collision with root package name */
        TextView f23451f;

        /* renamed from: g, reason: collision with root package name */
        TextView f23452g;

        /* renamed from: h, reason: collision with root package name */
        TextView f23453h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f23454i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f23455j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f23456k;

        /* renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f23457l;

        /* renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f23458m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f23459n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f23460o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f23461p;

        C0435a() {
        }
    }

    public a(List<CampaignEx> list) {
        this.f23442c = list;
    }

    private View a(int i8) {
        View view;
        String str;
        String str2;
        try {
            List<CampaignEx> list = this.f23442c;
            str = "";
            if (list != null && list.get(i8) != null) {
                str2 = this.f23442c.get(i8).getMof_tplid() + "";
                str = this.f23442c.get(i8).getCMPTEntryUrl();
            } else {
                str2 = "501";
            }
        } catch (Exception e8) {
            ad.b("OrderCampAdapter", e8.getMessage());
            view = null;
        }
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        int r8 = z.r(c.m().c());
        String a9 = n.a(0, str2, str);
        if (TextUtils.isEmpty(a9)) {
            return a();
        }
        File file = new File(a9 + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> a10 = ab.a(a9, "template_" + str2 + "_" + r8 + "_item");
            if (a10 == null) {
                return a();
            }
            int r9 = z.r(c.m().c());
            h.a().b(c.m().k());
            view = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f23442c.get(i8)).fileDirs(a10).dyAdType(DyAdType.REWARD).orientation(r9).adChoiceLink(ai.a(this.f23442c.get(i8))).build());
            if (view != null) {
                this.f23440a = true;
                C0435a c0435a = new C0435a();
                this.f23441b = c0435a;
                c0435a.f23457l = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_iv"));
                this.f23441b.f23456k = (ImageView) view.findViewById(c("mbridge_lv_iv_burl"));
                this.f23441b.f23458m = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_icon_iv"));
                this.f23441b.f23459n = (MBStarLevelLayoutView) view.findViewById(c("mbridge_lv_sv_starlevel"));
                this.f23441b.f23461p = (MBFrameLayout) view.findViewById(c("mbridge_lv_ration"));
                view.setTag(this.f23441b);
            }
            return this.f23440a ? view : a();
        }
        return a();
    }

    private int b(String str) {
        return v.a(c.m().c().getApplicationContext(), str, "id");
    }

    private int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    private int d(String str) {
        if (this.f23440a) {
            return c(str);
        }
        return b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<CampaignEx> list = this.f23442c;
        if (list != null && list.size() > 0) {
            return this.f23442c.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i8) {
        List<CampaignEx> list = this.f23442c;
        if (list != null) {
            return list.get(i8);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public final View getView(int i8, View view, ViewGroup viewGroup) {
        View view2;
        try {
            if (view == null) {
                view2 = a(i8);
            } else {
                this.f23441b = (C0435a) view.getTag();
                view2 = view;
            }
            try {
                this.f23441b.f23446a = (RelativeLayout) view2.findViewById(d("mbridge_lv_item_rl"));
                this.f23441b.f23450e = (TextView) view2.findViewById(d("mbridge_lv_title_tv"));
                this.f23441b.f23452g = (TextView) view2.findViewById(d("mbridge_lv_tv_install"));
                this.f23441b.f23460o = (MBHeatLevelLayoutView) view2.findViewById(d("mbridge_lv_sv_heat_level"));
                this.f23441b.f23451f = (TextView) view2.findViewById(d("mbridge_lv_desc_tv"));
                this.f23441b.f23455j = (ImageView) view2.findViewById(d("mbridge_iv_flag"));
                this.f23441b.f23453h = (TextView) view2.findViewById(d("mbridge_order_viewed_tv"));
                double d8 = 5.0d;
                if (this.f23440a) {
                    List<CampaignEx> list = this.f23442c;
                    if (list != null && this.f23441b != null && list.size() != 0) {
                        MBCusRoundImageView mBCusRoundImageView = this.f23441b.f23457l;
                        if (mBCusRoundImageView != null && (mBCusRoundImageView instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                            a(this.f23441b.f23457l, this.f23442c.get(i8).getImageUrl(), false);
                        }
                        ImageView imageView = this.f23441b.f23456k;
                        if (imageView != null) {
                            a(imageView, this.f23442c.get(i8).getImageUrl(), false);
                        }
                        MBCusRoundImageView mBCusRoundImageView2 = this.f23441b.f23458m;
                        if (mBCusRoundImageView2 != null && (mBCusRoundImageView2 instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView2.setBorder(50, 20, -1);
                            a(this.f23441b.f23458m, this.f23442c.get(i8).getIconUrl(), true);
                        }
                        double rating = this.f23442c.get(i8).getRating();
                        if (rating > 0.0d) {
                            d8 = rating;
                        }
                        MBStarLevelLayoutView mBStarLevelLayoutView = this.f23441b.f23459n;
                        if (mBStarLevelLayoutView != null) {
                            mBStarLevelLayoutView.setRating((int) d8);
                            this.f23441b.f23459n.setOrientation(0);
                        }
                        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f23441b.f23460o;
                        if (mBHeatLevelLayoutView != null) {
                            mBHeatLevelLayoutView.setHeatCount(this.f23442c.get(i8).getNumberRating());
                        }
                    }
                } else {
                    List<CampaignEx> list2 = this.f23442c;
                    if (list2 != null && this.f23441b != null && list2.size() != 0) {
                        MBridgeImageView mBridgeImageView = this.f23441b.f23448c;
                        if (mBridgeImageView != null) {
                            a(mBridgeImageView, this.f23442c.get(i8).getImageUrl(), false);
                        }
                        ImageView imageView2 = this.f23441b.f23456k;
                        if (imageView2 != null) {
                            a(imageView2, this.f23442c.get(i8).getImageUrl(), false);
                        }
                        RoundImageView roundImageView = this.f23441b.f23449d;
                        if (roundImageView != null) {
                            roundImageView.setBorderRadius(25);
                            a(this.f23441b.f23449d, this.f23442c.get(i8).getIconUrl(), true);
                        }
                        double rating2 = this.f23442c.get(i8).getRating();
                        if (rating2 > 0.0d) {
                            d8 = rating2;
                        }
                        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f23441b.f23454i;
                        if (mBridgeLevelLayoutView != null) {
                            mBridgeLevelLayoutView.setRatingAndUser(d8, this.f23442c.get(i8).getNumberRating());
                            this.f23441b.f23454i.setOrientation(0);
                        }
                        MBRotationView mBRotationView = this.f23441b.f23447b;
                        if (mBRotationView != null) {
                            mBRotationView.setWidthRatio(1.0f);
                            this.f23441b.f23447b.setHeightRatio(1.0f);
                            this.f23441b.f23447b.setAutoscroll(false);
                        }
                        MBridgeImageView mBridgeImageView2 = this.f23441b.f23448c;
                        if (mBridgeImageView2 != null) {
                            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        }
                    }
                }
                C0435a c0435a = this.f23441b;
                if (c0435a != null) {
                    if (c0435a.f23450e != null) {
                        this.f23441b.f23450e.setText(this.f23442c.get(i8).getAppName());
                    }
                    if (this.f23441b.f23451f != null) {
                        this.f23441b.f23451f.setText(this.f23442c.get(i8).getAppDesc());
                    }
                    if (this.f23441b.f23452g != null) {
                        String adCall = this.f23442c.get(i8).getAdCall();
                        if (this.f23441b.f23452g instanceof MBridgeTextView) {
                            ((MBridgeTextView) this.f23441b.f23452g).setObjectAnimator(new b().c(this.f23441b.f23452g));
                        }
                        this.f23441b.f23452g.setText(adCall);
                    }
                    if (this.f23441b.f23455j != null) {
                        try {
                            String language = Locale.getDefault().getLanguage();
                            Context c8 = c.m().c();
                            if (c8 != null) {
                                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                                    this.f23441b.f23455j.setImageDrawable(c8.getResources().getDrawable(c8.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                                } else {
                                    this.f23441b.f23455j.setImageDrawable(c8.getResources().getDrawable(c8.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                                }
                            }
                        } catch (Exception e8) {
                            ad.b("OrderCampAdapter", e8.getMessage());
                        }
                        ai.a(2, this.f23441b.f23455j, this.f23442c.get(i8), c.m().c(), false, null);
                    }
                    if (this.f23441b.f23453h != null) {
                        try {
                            this.f23441b.f23453h.setText(c.m().c().getResources().getString(c.m().c().getResources().getIdentifier("mbridge_reward_viewed_text_str", TypedValues.Custom.S_STRING, c.m().g())));
                            this.f23441b.f23453h.setVisibility(0);
                        } catch (Exception e9) {
                            ad.b("OrderCampAdapter", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
                ad.b("OrderCampAdapter", e.getMessage());
                return view2;
            }
        } catch (Exception e11) {
            e = e11;
            view2 = view;
        }
        return view2;
    }

    private View a() {
        View inflate = LayoutInflater.from(c.m().c()).inflate(a("mbridge_order_layout_item"), (ViewGroup) null);
        C0435a c0435a = new C0435a();
        this.f23441b = c0435a;
        c0435a.f23448c = (MBridgeImageView) inflate.findViewById(b("mbridge_lv_iv"));
        this.f23441b.f23456k = (ImageView) inflate.findViewById(b("mbridge_lv_iv_burl"));
        this.f23441b.f23449d = (RoundImageView) inflate.findViewById(b("mbridge_lv_icon_iv"));
        this.f23441b.f23454i = (MBridgeLevelLayoutView) inflate.findViewById(b("mbridge_lv_sv_starlevel"));
        this.f23441b.f23447b = (MBRotationView) inflate.findViewById(b("mbridge_lv_ration"));
        inflate.setTag(this.f23441b);
        return inflate;
    }

    private void a(final ImageView imageView, String str, final boolean z8) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.ordercamp.a.a.1
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str2, String str3) {
                    if (z8) {
                        imageView.setVisibility(8);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str2) {
                    try {
                        if (!bitmap.isRecycled()) {
                            imageView.setImageBitmap(bitmap);
                        }
                    } catch (Throwable th) {
                        ad.b("OrderCampAdapter", th.getMessage());
                    }
                }
            });
        } else if (z8) {
            imageView.setVisibility(8);
        }
    }

    private int a(String str) {
        return v.a(c.m().c().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }
}

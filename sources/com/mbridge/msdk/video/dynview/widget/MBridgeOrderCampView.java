package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.bt.module.b.f;
import com.mbridge.msdk.video.dynview.e.b;
import com.mbridge.msdk.video.dynview.e.c;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* renamed from: n, reason: collision with root package name */
    private MBridgeOrderCampView f23466n;

    /* renamed from: o, reason: collision with root package name */
    private List<CampaignEx> f23467o;

    /* renamed from: p, reason: collision with root package name */
    private int f23468p;

    /* renamed from: q, reason: collision with root package name */
    private int f23469q;

    /* renamed from: r, reason: collision with root package name */
    private int f23470r;

    /* renamed from: s, reason: collision with root package name */
    private int f23471s;

    /* renamed from: t, reason: collision with root package name */
    private String f23472t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f23473u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f23474v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f23475w;

    /* renamed from: x, reason: collision with root package name */
    private c f23476x;

    /* renamed from: y, reason: collision with root package name */
    private b f23477y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f23478z;

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f23475w = false;
        this.f23476x = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i8) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i8);
                    } catch (Exception e8) {
                        ad.b(MBridgeBaseView.TAG, e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f23478z = false;
    }

    static /* synthetic */ void a(MBridgeOrderCampView mBridgeOrderCampView) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", mBridgeOrderCampView.f23494b);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
        com.mbridge.msdk.video.module.a.a aVar = mBridgeOrderCampView.f23497e;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.f23467o == null) {
            b bVar = this.f23477y;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_view_callback", this.f23476x);
        com.mbridge.msdk.video.dynview.c b9 = new com.mbridge.msdk.video.dynview.j.c().b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23467o);
        com.mbridge.msdk.video.dynview.b.a();
        new com.mbridge.msdk.video.dynview.h.a(b9, new g() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.2
            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                if (aVar != null) {
                    try {
                        MBridgeOrderCampView.this.f23466n.addView(aVar.a());
                        MBridgeOrderCampView.this.f23475w = aVar.c();
                        viewGroup.removeAllViews();
                        viewGroup.addView(MBridgeOrderCampView.this.f23466n);
                        f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f23467o, ((CampaignEx) MBridgeOrderCampView.this.f23467o.get(0)).getCampaignUnitId());
                        MBridgeOrderCampView.this.setViewStatus();
                        if (MBridgeOrderCampView.this.f23477y != null) {
                            MBridgeOrderCampView.this.f23477y.a();
                        }
                    } catch (Exception e8) {
                        ad.b(MBridgeBaseView.TAG, e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                try {
                    f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.f23467o, ((CampaignEx) MBridgeOrderCampView.this.f23467o.get(0)).getCampaignUnitId(), aVar.b());
                    if (MBridgeOrderCampView.this.f23477y != null) {
                        MBridgeOrderCampView.this.f23477y.b();
                    }
                } catch (Exception e8) {
                    ad.b(MBridgeBaseView.TAG, e8.getMessage());
                }
            }
        }, hashMap);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f23466n = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r5.f23467o
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f23467o
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r2.<init>()     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = "camp_position"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1d
            goto L26
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L23:
            r1.printStackTrace()
        L26:
            com.mbridge.msdk.video.module.a.a r1 = r5.f23497e
            if (r1 == 0) goto L2f
            r3 = 110(0x6e, float:1.54E-43)
            r1.a(r3, r2)
        L2f:
            int r0 = r0 + 1
            goto L9
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setCampOrderViewBuildCallback(b bVar) {
        this.f23477y = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f23467o = list;
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        this.f23468p = i8;
        this.f23469q = i9;
        this.f23470r = i10;
        this.f23471s = i11;
        setViewStatus();
    }

    public void setRewarded(boolean z8) {
        this.f23478z = z8;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f23466n;
        if (mBridgeOrderCampView != null && this.f23478z) {
            RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f23475w, "mbridge_native_order_camp_controller"));
            this.f23473u = (FeedBackButton) this.f23466n.findViewById(filterFindViewId(this.f23475w, "mbridge_native_order_camp_feed_btn"));
            this.f23474v = (ImageView) this.f23466n.findViewById(filterFindViewId(this.f23475w, "mbridge_iv_link"));
            if (relativeLayout != null) {
                relativeLayout.setPadding(this.f23468p, this.f23470r, this.f23469q, this.f23471s);
            }
            if (this.f23473u != null) {
                try {
                    List<CampaignEx> list = this.f23467o;
                    if (list != null && list.get(0) != null) {
                        this.f23472t = this.f23467o.get(0).getCampaignUnitId();
                        this.f23494b = this.f23467o.get(0);
                        com.mbridge.msdk.foundation.d.b.a().a(this.f23472t + "_2", this.f23494b);
                        if (this.f23473u != null) {
                            if (com.mbridge.msdk.foundation.d.b.a().b()) {
                                com.mbridge.msdk.foundation.d.b.a().a(this.f23472t + "_2", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.3
                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void a() {
                                    }

                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void b() {
                                    }

                                    @Override // com.mbridge.msdk.foundation.d.a
                                    public final void a(String str) {
                                    }
                                });
                                com.mbridge.msdk.foundation.d.b.a().a(this.f23472t + "_2", this.f23473u);
                            } else {
                                this.f23473u.setVisibility(8);
                            }
                        }
                    }
                    FeedBackButton feedBackButton = this.f23473u;
                    if (feedBackButton != null) {
                        feedBackButton.setVisibility(8);
                    }
                } catch (Exception e8) {
                    ad.b(MBridgeBaseView.TAG, e8.getMessage());
                }
            }
            ImageView imageView = this.f23474v;
            if (imageView != null && imageView != null) {
                try {
                    com.mbridge.msdk.c.g b9 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b9 != null) {
                        final String g8 = b9.g();
                        if (TextUtils.isEmpty(g8)) {
                            this.f23474v.setVisibility(8);
                        }
                        this.f23474v.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f23493a, g8);
                            }
                        });
                        return;
                    }
                    this.f23474v.setVisibility(8);
                } catch (Exception e9) {
                    ad.b(MBridgeBaseView.TAG, e9.getMessage());
                }
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f23466n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f23466n.startAnimation(translateAnimation);
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23475w = false;
        this.f23476x = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i8) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i8);
                    } catch (Exception e8) {
                        ad.b(MBridgeBaseView.TAG, e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.f23478z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView r8, com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) {
        /*
            if (r9 == 0) goto L61
            boolean r0 = r9.isDynamicView()
            if (r0 == 0) goto L61
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r9.getRewardTemplateMode()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r2.<init>()     // Catch: java.lang.Exception -> L25
            int r0 = r0.f()     // Catch: java.lang.Exception -> L25
            r2.append(r0)     // Catch: java.lang.Exception -> L25
            r2.append(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L25
        L23:
            r7 = r1
            goto L27
        L25:
            r9 = move-exception
            goto L58
        L27:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L25
            android.content.Context r0 = r0.c()     // Catch: java.lang.Exception -> L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "order_view_click"
            r1.append(r2)     // Catch: java.lang.Exception -> L25
            r1.append(r7)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r9.getCampaignUnitId()     // Catch: java.lang.Exception -> L25
            boolean r3 = r9.isBidCampaign()     // Catch: java.lang.Exception -> L25
            java.lang.String r4 = r9.getRequestId()     // Catch: java.lang.Exception -> L25
            java.lang.String r5 = r9.getRequestIdNotice()     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = r9.getId()     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.foundation.same.report.k.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L25
            goto L61
        L58:
            java.lang.String r0 = "MBridgeBaseView"
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r9)
        L61:
            r9 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L78
            r0.<init>()     // Catch: org.json.JSONException -> L78
            java.lang.String r9 = com.mbridge.msdk.foundation.same.a.f20661j     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r10 = r8.a(r10)     // Catch: org.json.JSONException -> L76
            r0.put(r9, r10)     // Catch: org.json.JSONException -> L76
            java.lang.String r9 = "camp_position"
            r0.put(r9, r11)     // Catch: org.json.JSONException -> L76
            goto L7e
        L76:
            r9 = move-exception
            goto L7b
        L78:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L7b:
            r9.printStackTrace()
        L7e:
            com.mbridge.msdk.video.module.a.a r8 = r8.f23497e
            if (r8 == 0) goto L87
            r9 = 105(0x69, float:1.47E-43)
            r8.a(r9, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView, com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }
}

package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f21489a;

    /* renamed from: b, reason: collision with root package name */
    private a f21490b;

    /* renamed from: c, reason: collision with root package name */
    private String f21491c;

    /* renamed from: d, reason: collision with root package name */
    private String f21492d;

    /* renamed from: e, reason: collision with root package name */
    private String f21493e;

    /* renamed from: f, reason: collision with root package name */
    private String f21494f;

    /* renamed from: g, reason: collision with root package name */
    private String f21495g;

    /* renamed from: h, reason: collision with root package name */
    private d f21496h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f21498j;

    /* renamed from: p, reason: collision with root package name */
    private int f21504p;

    /* renamed from: q, reason: collision with root package name */
    private int f21505q;

    /* renamed from: r, reason: collision with root package name */
    private int f21506r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21497i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21499k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21500l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21501m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21502n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21503o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21489a = str;
        this.f21491c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21490b == null) {
                a aVar = new a();
                this.f21490b = aVar;
                aVar.a(true);
                this.f21490b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21496h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21496h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f21497i) {
            return;
        }
        try {
            if (this.f21490b != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21497i) {
            d dVar = this.f21496h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21490b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21497i) {
            d dVar = this.f21496h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21490b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f21497i) {
            d dVar = this.f21496h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21490b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a9 = b.a().a("new_bridge_reward_video");
        this.f21497i = a9;
        if (a9) {
            b();
            d dVar = this.f21496h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f21490b != null) {
            this.f21490b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21491c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a9 = b.a().a("new_bridge_reward_video");
        this.f21497i = a9;
        if (a9) {
            b();
            d dVar = this.f21496h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21490b != null) {
            this.f21490b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21491c, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f21499k = i8;
        if (this.f21497i) {
            d dVar = this.f21496h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21490b;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21492d = str;
        this.f21493e = str2;
        this.f21494f = str3;
        this.f21495g = str4;
        this.f21502n = true;
        this.f21503o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21504p = i8;
        this.f21505q = i9;
        this.f21506r = com.mbridge.msdk.foundation.same.a.f20638J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21498j = interstitialVideoListener;
        this.f21501m = true;
        this.f21500l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21498j = interstitialVideoListener;
        this.f21501m = true;
        this.f21500l = true;
    }

    public void show() {
        if (this.f21497i) {
            b();
            d dVar = this.f21496h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21490b != null) {
            this.f21490b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21491c, false, -1));
        }
    }

    private void b() {
        if (this.f21496h == null) {
            b(this.f21489a, this.f21491c);
        }
        if (this.f21500l) {
            this.f21496h.a(new InterstitialVideoListenerWrapper(this.f21498j));
            this.f21500l = false;
        }
        if (this.f21503o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21491c, this.f21492d, this.f21493e, this.f21494f, this.f21495g);
            this.f21503o = false;
        }
        d dVar = this.f21496h;
        if (dVar != null) {
            dVar.a(this.f21504p, this.f21506r, this.f21505q);
            this.f21496h.a(this.f21499k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21504p = i8;
        this.f21505q = (int) (d8 * 100.0d);
        this.f21506r = com.mbridge.msdk.foundation.same.a.f20637I;
    }

    private void a() {
        if (this.f21490b == null) {
            a(this.f21489a, this.f21491c);
        }
        if (this.f21501m) {
            this.f21490b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f21498j, this.f21491c, false));
            this.f21501m = false;
        }
        if (this.f21502n) {
            this.f21490b.a(this.f21492d, this.f21493e, this.f21494f, this.f21495g);
            this.f21502n = false;
        }
        a aVar = this.f21490b;
        if (aVar != null) {
            aVar.a(this.f21504p, this.f21506r, this.f21505q);
            this.f21490b.a(this.f21499k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f21491c = str2;
        this.f21489a = str;
    }
}

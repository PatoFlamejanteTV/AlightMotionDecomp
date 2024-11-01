package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f21471a;

    /* renamed from: b, reason: collision with root package name */
    private String f21472b;

    /* renamed from: c, reason: collision with root package name */
    private String f21473c;

    /* renamed from: d, reason: collision with root package name */
    private String f21474d;

    /* renamed from: e, reason: collision with root package name */
    private String f21475e;

    /* renamed from: f, reason: collision with root package name */
    private String f21476f;

    /* renamed from: g, reason: collision with root package name */
    private String f21477g;

    /* renamed from: h, reason: collision with root package name */
    private d f21478h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f21480j;

    /* renamed from: p, reason: collision with root package name */
    private int f21486p;

    /* renamed from: q, reason: collision with root package name */
    private int f21487q;

    /* renamed from: r, reason: collision with root package name */
    private int f21488r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21479i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21481k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21482l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21483m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21484n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21485o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21472b = str2;
        this.f21473c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21471a == null) {
                a aVar = new a();
                this.f21471a = aVar;
                aVar.a(true);
                this.f21471a.b(true);
                this.f21471a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21478h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21478h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f21479i) {
            return;
        }
        try {
            if (this.f21471a != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21479i) {
            d dVar = this.f21478h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21471a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21479i) {
            d dVar = this.f21478h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21471a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21479i) {
            d dVar = this.f21478h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21471a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a9 = b.a().a("new_bridge_reward_video");
        this.f21479i = a9;
        if (a9) {
            b();
            d dVar = this.f21478h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21471a != null) {
            this.f21471a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21472b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a9 = b.a().a("new_bridge_reward_video");
        this.f21479i = a9;
        if (a9) {
            b();
            d dVar = this.f21478h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21471a != null) {
            this.f21471a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21472b, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21481k = i8;
        if (this.f21479i) {
            d dVar = this.f21478h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21471a;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21474d = str;
        this.f21475e = str2;
        this.f21476f = str3;
        this.f21477g = str4;
        this.f21484n = true;
        this.f21485o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21486p = i8;
        this.f21487q = i9;
        this.f21488r = com.mbridge.msdk.foundation.same.a.f20638J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21480j = interstitialVideoListener;
        this.f21483m = true;
        this.f21482l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f21480j = interstitialVideoListener;
        this.f21483m = true;
        this.f21482l = true;
    }

    public void showFromBid() {
        if (this.f21479i) {
            b();
            d dVar = this.f21478h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21471a != null) {
            this.f21471a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21472b, false, -1));
        }
    }

    private void b() {
        if (this.f21478h == null) {
            b(this.f21473c, this.f21472b);
        }
        if (this.f21482l) {
            d dVar = this.f21478h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f21480j));
            }
            this.f21482l = false;
        }
        if (this.f21485o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21472b, this.f21474d, this.f21475e, this.f21476f, this.f21477g);
            this.f21485o = false;
        }
        d dVar2 = this.f21478h;
        if (dVar2 != null) {
            dVar2.a(this.f21486p, this.f21488r, this.f21487q);
            this.f21478h.a(this.f21481k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21486p = i8;
        this.f21487q = (int) (d8 * 100.0d);
        this.f21488r = com.mbridge.msdk.foundation.same.a.f20637I;
    }

    private void a() {
        if (this.f21471a == null) {
            a(this.f21473c, this.f21472b);
        }
        if (this.f21483m) {
            a aVar = this.f21471a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f21480j, this.f21472b, true));
            }
            this.f21483m = false;
        }
        if (this.f21484n) {
            a aVar2 = this.f21471a;
            if (aVar2 != null) {
                aVar2.a(this.f21474d, this.f21475e, this.f21476f, this.f21477g);
            }
            this.f21484n = false;
        }
        a aVar3 = this.f21471a;
        if (aVar3 != null) {
            aVar3.a(this.f21486p, this.f21488r, this.f21487q);
            this.f21471a.a(this.f21481k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.f21472b = str2;
        this.f21473c = str;
    }
}

package com.mbridge.msdk.newinterstitial.out;

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
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f21914a;

    /* renamed from: b, reason: collision with root package name */
    private String f21915b;

    /* renamed from: c, reason: collision with root package name */
    private String f21916c;

    /* renamed from: d, reason: collision with root package name */
    private String f21917d;

    /* renamed from: e, reason: collision with root package name */
    private String f21918e;

    /* renamed from: f, reason: collision with root package name */
    private a f21919f;

    /* renamed from: g, reason: collision with root package name */
    private String f21920g;

    /* renamed from: h, reason: collision with root package name */
    private d f21921h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f21923j;

    /* renamed from: p, reason: collision with root package name */
    private int f21929p;

    /* renamed from: q, reason: collision with root package name */
    private int f21930q;

    /* renamed from: r, reason: collision with root package name */
    private int f21931r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21922i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21924k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21925l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21926m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21927n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21928o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21914a = str;
        this.f21920g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21919f == null) {
                a aVar = new a();
                this.f21919f = aVar;
                aVar.a(true);
                this.f21919f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21921h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21921h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f21922i) {
            return;
        }
        try {
            if (this.f21919f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21922i) {
            d dVar = this.f21921h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21919f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21922i) {
            d dVar = this.f21921h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21919f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f21922i) {
            d dVar = this.f21921h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21919f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21922i = a9;
        if (a9) {
            b();
            d dVar = this.f21921h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f21919f != null) {
            this.f21919f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21920g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21922i = a9;
        if (a9) {
            b();
            d dVar = this.f21921h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21919f != null) {
            this.f21919f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21920g, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f21924k = i8;
        if (this.f21922i) {
            d dVar = this.f21921h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21919f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21915b = str;
        this.f21916c = str2;
        this.f21917d = str3;
        this.f21918e = str4;
        this.f21927n = true;
        this.f21928o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f21920g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21929p = i8;
        this.f21930q = i9;
        this.f21931r = com.mbridge.msdk.foundation.same.a.f20638J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21923j = newInterstitialListener;
        this.f21925l = true;
        this.f21926m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21923j = newInterstitialListener;
        this.f21925l = true;
        this.f21926m = true;
    }

    public void show() {
        if (this.f21922i) {
            b();
            d dVar = this.f21921h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21919f != null) {
            this.f21919f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f21920g, false, -1));
        }
    }

    private void b() {
        if (this.f21921h == null) {
            b(this.f21914a, this.f21920g);
        }
        if (this.f21925l) {
            d dVar = this.f21921h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21923j));
            }
            this.f21925l = false;
        }
        if (this.f21928o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21920g, this.f21915b, this.f21916c, this.f21917d, this.f21918e);
            this.f21928o = false;
        }
        d dVar2 = this.f21921h;
        if (dVar2 != null) {
            dVar2.a(this.f21929p, this.f21931r, this.f21930q);
            this.f21921h.a(this.f21924k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21929p = i8;
        this.f21930q = (int) (d8 * 100.0d);
        this.f21931r = com.mbridge.msdk.foundation.same.a.f20637I;
    }

    private void a() {
        if (this.f21919f == null) {
            a(this.f21914a, this.f21920g);
        }
        if (this.f21926m) {
            a aVar = this.f21919f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21923j, this.f21920g, false));
            }
            this.f21926m = false;
        }
        if (this.f21927n) {
            a aVar2 = this.f21919f;
            if (aVar2 != null) {
                aVar2.a(this.f21915b, this.f21916c, this.f21917d, this.f21918e);
            }
            this.f21927n = false;
        }
        a aVar3 = this.f21919f;
        if (aVar3 != null) {
            aVar3.a(this.f21929p, this.f21931r, this.f21930q);
            this.f21919f.a(this.f21924k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.f21914a = str;
        this.f21920g = str2;
    }
}

package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
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
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f21879a;

    /* renamed from: b, reason: collision with root package name */
    private String f21880b;

    /* renamed from: c, reason: collision with root package name */
    private String f21881c;

    /* renamed from: d, reason: collision with root package name */
    private String f21882d;

    /* renamed from: e, reason: collision with root package name */
    private String f21883e;

    /* renamed from: f, reason: collision with root package name */
    private a f21884f;

    /* renamed from: g, reason: collision with root package name */
    private d f21885g;

    /* renamed from: i, reason: collision with root package name */
    private NewInterstitialListener f21887i;
    public String mUnitId;

    /* renamed from: o, reason: collision with root package name */
    private int f21893o;

    /* renamed from: p, reason: collision with root package name */
    private int f21894p;

    /* renamed from: q, reason: collision with root package name */
    private int f21895q;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21886h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f21888j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21889k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21890l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21891m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21892n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.mUnitId = str2;
        this.f21879a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21884f == null) {
                a aVar = new a();
                this.f21884f = aVar;
                aVar.a(true);
                this.f21884f.b(true);
                this.f21884f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21885g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21885g = new d(287, str, str2, true);
        }
    }

    private void c() {
        if (this.f21885g == null) {
            b(this.f21879a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.f21889k) {
            d dVar = this.f21885g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21887i));
            }
            this.f21889k = false;
        }
        if (this.f21892n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.f21881c, this.f21880b, this.f21882d, this.f21883e);
            this.f21892n = false;
        }
        d dVar2 = this.f21885g;
        if (dVar2 != null) {
            dVar2.a(this.f21893o, this.f21895q, this.f21894p);
            this.f21885g.a(this.f21888j);
        }
    }

    public void clearVideoCache() {
        if (this.f21886h) {
            return;
        }
        try {
            if (this.f21884f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21886h) {
            d dVar = this.f21885g;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21884f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21886h) {
            d dVar = this.f21885g;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21884f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21886h) {
            d dVar = this.f21885g;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21884f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21886h = a9;
        if (a9) {
            c();
            d dVar = this.f21885g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21884f != null) {
            this.f21884f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21886h = a9;
        if (a9) {
            c();
            d dVar = this.f21885g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21884f != null) {
            this.f21884f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21888j = i8;
        if (this.f21886h) {
            d dVar = this.f21885g;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21884f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21881c = str;
        this.f21880b = str2;
        this.f21882d = str3;
        this.f21883e = str4;
        this.f21892n = true;
        this.f21891m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21893o = i8;
        this.f21894p = i9;
        this.f21895q = com.mbridge.msdk.foundation.same.a.f20638J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21887i = newInterstitialListener;
        this.f21889k = true;
        this.f21890l = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21887i = newInterstitialListener;
        this.f21889k = true;
        this.f21890l = true;
    }

    public void showFromBid() {
        if (this.f21886h) {
            c();
            d dVar = this.f21885g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21884f != null) {
            this.f21884f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void b() {
        if (this.f21890l) {
            a aVar = this.f21884f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21887i));
            }
            this.f21890l = false;
        }
        if (this.f21891m) {
            a aVar2 = this.f21884f;
            if (aVar2 != null) {
                aVar2.a(this.f21881c, this.f21880b, this.f21882d, this.f21883e);
            }
            this.f21891m = false;
        }
        a aVar3 = this.f21884f;
        if (aVar3 != null) {
            aVar3.a(this.f21893o, this.f21895q, this.f21894p);
            this.f21884f.a(this.f21888j);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21893o = i8;
        this.f21894p = (int) (d8 * 100.0d);
        this.f21895q = com.mbridge.msdk.foundation.same.a.f20637I;
    }

    private void a() {
        if (this.f21884f == null) {
            a(this.f21879a, this.mUnitId);
        }
        b();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.f21879a = str;
    }
}

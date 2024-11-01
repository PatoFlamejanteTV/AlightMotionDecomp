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
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f21896a;

    /* renamed from: b, reason: collision with root package name */
    private String f21897b;

    /* renamed from: c, reason: collision with root package name */
    private String f21898c;

    /* renamed from: d, reason: collision with root package name */
    private String f21899d;

    /* renamed from: e, reason: collision with root package name */
    private String f21900e;

    /* renamed from: f, reason: collision with root package name */
    private a f21901f;

    /* renamed from: g, reason: collision with root package name */
    private String f21902g;

    /* renamed from: h, reason: collision with root package name */
    private d f21903h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f21905j;

    /* renamed from: p, reason: collision with root package name */
    private int f21911p;

    /* renamed from: q, reason: collision with root package name */
    private int f21912q;

    /* renamed from: r, reason: collision with root package name */
    private int f21913r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21904i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f21906k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21907l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21908m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21909n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21910o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f21896a = str;
        this.f21902g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f21901f == null) {
                a aVar = new a();
                this.f21901f = aVar;
                aVar.a(true);
                this.f21901f.b(true);
                this.f21901f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidNewInterstitialHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f21903h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f21903h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f21904i) {
            return;
        }
        try {
            if (this.f21901f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f21904i) {
            d dVar = this.f21903h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f21901f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f21904i) {
            d dVar = this.f21903h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f21901f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f21904i) {
            d dVar = this.f21903h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f21901f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21904i = a9;
        if (a9) {
            b();
            d dVar = this.f21903h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f21901f != null) {
            this.f21901f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21902g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a9 = b.a().a("new_bridge_new_interstitial_video");
        this.f21904i = a9;
        if (a9) {
            b();
            d dVar = this.f21903h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f21901f != null) {
            this.f21901f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21902g, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f21906k = i8;
        if (this.f21904i) {
            d dVar = this.f21903h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f21901f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f21898c = str;
        this.f21897b = str2;
        this.f21899d = str3;
        this.f21900e = str4;
        this.f21909n = true;
        this.f21910o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f21902g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f21911p = i8;
        this.f21912q = i9;
        this.f21913r = com.mbridge.msdk.foundation.same.a.f20638J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21905j = newInterstitialListener;
        this.f21907l = true;
        this.f21908m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f21905j = newInterstitialListener;
        this.f21907l = true;
        this.f21908m = true;
    }

    public void showFromBid() {
        if (this.f21904i) {
            b();
            d dVar = this.f21903h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f21901f != null) {
            this.f21901f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f21902g, false, -1));
        }
    }

    private void b() {
        if (this.f21903h == null) {
            b(this.f21896a, this.f21902g);
        }
        if (this.f21907l) {
            d dVar = this.f21903h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f21905j));
            }
            this.f21907l = false;
        }
        if (this.f21910o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f21902g, this.f21898c, this.f21897b, this.f21899d, this.f21900e);
            this.f21910o = false;
        }
        d dVar2 = this.f21903h;
        if (dVar2 != null) {
            dVar2.a(this.f21906k);
            this.f21903h.a(this.f21911p, this.f21913r, this.f21912q);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f21911p = i8;
        this.f21912q = (int) (d8 * 100.0d);
        this.f21913r = com.mbridge.msdk.foundation.same.a.f20637I;
    }

    private void a() {
        if (this.f21901f == null) {
            a(this.f21896a, this.f21902g);
        }
        if (this.f21908m) {
            a aVar = this.f21901f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f21905j, this.f21902g, true));
            }
            this.f21908m = false;
        }
        if (this.f21909n) {
            a aVar2 = this.f21901f;
            if (aVar2 != null) {
                aVar2.a(this.f21898c, this.f21897b, this.f21899d, this.f21900e);
            }
            this.f21909n = false;
        }
        a aVar3 = this.f21901f;
        if (aVar3 != null) {
            aVar3.a(this.f21906k);
            this.f21901f.a(this.f21911p, this.f21913r, this.f21912q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f21896a = str;
        this.f21902g = str2;
    }
}

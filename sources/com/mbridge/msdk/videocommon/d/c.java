package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: H, reason: collision with root package name */
    private static h f24237H;

    /* renamed from: a, reason: collision with root package name */
    public static String f24238a;

    /* renamed from: F, reason: collision with root package name */
    private int f24244F;

    /* renamed from: I, reason: collision with root package name */
    private int f24246I;

    /* renamed from: W, reason: collision with root package name */
    private JSONArray f24260W;

    /* renamed from: X, reason: collision with root package name */
    private JSONObject f24261X;

    /* renamed from: b, reason: collision with root package name */
    private String f24262b;

    /* renamed from: c, reason: collision with root package name */
    private String f24263c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f24264d;

    /* renamed from: e, reason: collision with root package name */
    private long f24265e;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Integer> f24281u;

    /* renamed from: f, reason: collision with root package name */
    private int f24266f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f24267g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f24268h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f24269i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f24270j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f24271k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f24272l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f24273m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f24274n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f24275o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f24276p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f24277q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f24278r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f24279s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f24280t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f24282v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f24283w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f24284x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f24285y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f24286z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f24239A = 70;

    /* renamed from: B, reason: collision with root package name */
    private int f24240B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f24241C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f24242D = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f24243E = -1;

    /* renamed from: G, reason: collision with root package name */
    private int f24245G = 20;

    /* renamed from: J, reason: collision with root package name */
    private int f24247J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f24248K = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f24249L = "";

    /* renamed from: M, reason: collision with root package name */
    private int f24250M = 1;

    /* renamed from: N, reason: collision with root package name */
    private String f24251N = "";

    /* renamed from: O, reason: collision with root package name */
    private int f24252O = 1;

    /* renamed from: P, reason: collision with root package name */
    private String f24253P = "Virtual Item";

    /* renamed from: Q, reason: collision with root package name */
    private String f24254Q = "";

    /* renamed from: R, reason: collision with root package name */
    private String f24255R = "";

    /* renamed from: S, reason: collision with root package name */
    private int f24256S = 0;

    /* renamed from: T, reason: collision with root package name */
    private int f24257T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f24258U = 60;

    /* renamed from: V, reason: collision with root package name */
    private String f24259V = "";

    private void y(int i8) {
        if (i8 <= 0) {
            this.f24250M = 1;
        } else {
            this.f24250M = i8;
        }
    }

    public final int A() {
        return this.f24282v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e8;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f24264d;
        } catch (Exception e9) {
            linkedList = null;
            e8 = e9;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i8 = 0; i8 < this.f24264d.size(); i8++) {
            try {
                linkedList.add(Integer.valueOf(this.f24264d.get(i8).b()));
            } catch (Exception e10) {
                e8 = e10;
                e8.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.f24257T;
    }

    public final int D() {
        return this.f24258U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f24262b);
            jSONObject.put("callbackType", this.f24269i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f24264d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f24264d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f24270j);
            jSONObject.put("acn", this.f24271k);
            jSONObject.put("vcn", this.f24272l);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f24273m);
            jSONObject.put("dlnet", this.f24274n);
            jSONObject.put("tv_start", this.f24275o);
            jSONObject.put("tv_end", this.f24276p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f24277q);
            jSONObject.put("endscreen_type", this.f24246I);
            jSONObject.put("daily_play_cap", this.f24240B);
            jSONObject.put("video_skip_time", this.f24241C);
            jSONObject.put("video_skip_result", this.f24242D);
            jSONObject.put("video_interactive_type", this.f24243E);
            jSONObject.put("orientation", this.f24286z);
            jSONObject.put("close_button_delay", this.f24244F);
            jSONObject.put("playclosebtn_tm", this.f24266f);
            jSONObject.put("play_ctdown", this.f24267g);
            jSONObject.put("close_alert", this.f24268h);
            jSONObject.put("rfpv", this.f24280t);
            jSONObject.put("vdcmp", this.f24279s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f24281u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f24281u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f24282v);
            jSONObject.put("tmorl", this.f24283w);
            jSONObject.put("placementid", this.f24263c);
            jSONObject.put("ltafemty", this.f24284x);
            jSONObject.put("ltorwc", this.f24285y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f24247J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f24248K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f24249L);
            jSONObject.put(RewardPlus.AMOUNT, this.f24250M);
            jSONObject.put(RewardPlus.ICON, this.f24251N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f24252O);
            jSONObject.put("name", this.f24253P);
            jSONObject.put("isDefault", this.f24256S);
            jSONObject.put("video_error_rule", this.f24257T);
            jSONObject.put("loadtmo", this.f24258U);
            jSONObject.put("vtag", this.f24259V);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.f24239A;
    }

    public final JSONArray G() {
        return this.f24260W;
    }

    public final int a() {
        return this.f24284x;
    }

    public final int b() {
        return this.f24285y;
    }

    public final int c() {
        return this.f24286z;
    }

    public final int d() {
        return this.f24240B;
    }

    public final int e() {
        return this.f24241C;
    }

    public final int f() {
        return this.f24242D;
    }

    public final int g() {
        return this.f24243E;
    }

    public final int h() {
        return this.f24266f;
    }

    public final int i() {
        return this.f24268h;
    }

    public final String j() {
        return this.f24259V;
    }

    public final String k() {
        return this.f24254Q;
    }

    public final String l() {
        return this.f24255R;
    }

    public final int m() {
        return this.f24250M;
    }

    public final String n() {
        return this.f24253P;
    }

    public final int o() {
        return this.f24245G;
    }

    public final int p() {
        return this.f24244F;
    }

    public final int q() {
        return this.f24246I;
    }

    public final int r() {
        return this.f24277q;
    }

    public final int s() {
        return this.f24278r;
    }

    public final int t() {
        return this.f24270j;
    }

    public final int u() {
        return this.f24271k;
    }

    public final int v() {
        return this.f24273m;
    }

    public final int w() {
        return this.f24274n;
    }

    public final long x() {
        return this.f24265e;
    }

    public final String z() {
        return this.f24263c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f24281u = arrayList;
    }

    public final void b(int i8) {
        this.f24240B = i8;
    }

    public final void c(int i8) {
        this.f24241C = i8;
    }

    public final void d(int i8) {
        this.f24242D = i8;
    }

    public final void e(int i8) {
        this.f24243E = i8;
    }

    public final void f(int i8) {
        this.f24244F = i8;
    }

    public final void g(int i8) {
        this.f24246I = i8;
    }

    public final void h(int i8) {
        this.f24275o = i8;
    }

    public final void i(int i8) {
        this.f24276p = i8;
    }

    public final void j(int i8) {
        this.f24277q = i8;
    }

    public final void k(int i8) {
        this.f24278r = i8;
    }

    public final void l(int i8) {
        this.f24270j = i8;
    }

    public final void m(int i8) {
        this.f24271k = i8;
    }

    public final void n(int i8) {
        this.f24272l = i8;
    }

    public final void o(int i8) {
        this.f24273m = i8;
    }

    public final void p(int i8) {
        this.f24274n = i8;
    }

    public final void q(int i8) {
        this.f24269i = i8;
    }

    public final void r(int i8) {
        this.f24283w = i8;
    }

    public final boolean s(int i8) {
        ArrayList<Integer> arrayList = this.f24281u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f24281u.contains(Integer.valueOf(i8));
    }

    public final void t(int i8) {
        this.f24282v = i8;
    }

    public final void u(int i8) {
        this.f24256S = i8;
    }

    public final void v(int i8) {
        this.f24257T = i8;
    }

    public final void w(int i8) {
        this.f24258U = i8;
    }

    public final void x(int i8) {
        this.f24239A = i8;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (f24237H == null) {
            f24237H = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("vtag", "");
                String optString2 = jSONObject.optString("rid", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString3 = optJSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (TextUtils.isEmpty(optString3)) {
                    return null;
                }
                c cVar2 = new c();
                try {
                    cVar2.f24259V = optString;
                    cVar2.f24255R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a9 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f24262b = optString3;
                    cVar2.f24264d = a9;
                    cVar2.f24269i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f24270j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f24271k = optInt2;
                    cVar2.f24272l = optJSONObject.optInt("vcn", 5);
                    cVar2.f24273m = optJSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                    cVar2.f24274n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f24246I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f24275o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f24276p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f24277q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f24278r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f24265e = jSONObject.optLong("current_time");
                    cVar2.f24286z = optJSONObject.optInt("orientation", 0);
                    cVar2.f24240B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f24241C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f24242D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f24243E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f24244F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f24266f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f24267g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f24268h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f24245G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f24239A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f24280t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f24279s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f24238a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i8)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.f24281u = arrayList;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f24282v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f24283w = optInt4;
                    cVar2.f24263c = optJSONObject.optString("placementid");
                    cVar2.f24284x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f24285y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.f24247J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f24248K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f24249L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt(RewardPlus.AMOUNT, 1));
                    cVar2.f24251N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f24252O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f24257T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f24258U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.f24260W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a10 = x.a(optString4);
                            if (!TextUtils.isEmpty(a10)) {
                                cVar2.f24261X = new JSONObject(a10);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return cVar;
    }

    private void d(String str) {
        this.f24254Q = str;
        com.mbridge.msdk.foundation.controller.a.f20292b.put(this.f24262b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f24253P = this.f24249L;
        } else {
            this.f24253P = str;
        }
    }

    public final void a(int i8) {
        this.f24286z = i8;
    }

    public final void b(String str) {
        this.f24263c = str;
    }

    public final int y() {
        return this.f24283w;
    }

    public final void a(String str) {
        this.f24262b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f24264d = list;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                cVar2.f24264d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f24269i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f24270j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f24271k = optInt2;
                cVar2.f24272l = jSONObject.optInt("vcn", 5);
                cVar2.f24273m = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                cVar2.f24274n = jSONObject.optInt("dlnet", 1);
                cVar2.f24246I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f24275o = jSONObject.optInt("tv_start", 3);
                cVar2.f24276p = jSONObject.optInt("tv_end", 80);
                cVar2.f24277q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f24265e = jSONObject.optLong("current_time");
                cVar2.f24286z = jSONObject.optInt("orientation", 0);
                cVar2.f24240B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f24241C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f24242D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f24243E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f24244F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f24266f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f24267g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f24268h = jSONObject.optInt("close_alert", 0);
                cVar2.f24245G = jSONObject.optInt("rdrct", 20);
                cVar2.f24280t = jSONObject.optInt("rfpv", -1);
                cVar2.f24279s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f24239A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i8)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f24281u = arrayList;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                cVar2.f24282v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f24283w = optInt3;
                cVar2.f24263c = jSONObject.optString("placementid");
                cVar2.f24284x = jSONObject.optInt("ltafemty", 10);
                cVar2.f24285y = jSONObject.optInt("ltorwc", 60);
                cVar2.d(jSONObject.optString("ab_id"));
                cVar2.f24255R = jSONObject.optString("rid", "");
                cVar2.f24247J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f24248K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f24249L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.y(jSONObject.optInt(RewardPlus.AMOUNT, 1));
                cVar2.f24251N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.f24252O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                cVar2.e(jSONObject.optString("name", "Virtual Item"));
                cVar2.f24257T = jSONObject.optInt("video_error_rule", 1);
                cVar2.f24258U = jSONObject.optInt("loadtmo", 60);
                cVar2.f24259V = jSONObject.optString("vtag", "");
                cVar2.f24260W = jSONObject.optJSONArray("local_cache_info");
                try {
                    String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                    if (!TextUtils.isEmpty(optString)) {
                        String a9 = x.a(optString);
                        if (!TextUtils.isEmpty(a9)) {
                            cVar2.f24261X = new JSONObject(a9);
                        }
                    }
                } catch (Exception unused) {
                }
                return cVar2;
            } catch (Exception e9) {
                e = e9;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}

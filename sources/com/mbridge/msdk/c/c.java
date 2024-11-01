package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private String f19200A;

    /* renamed from: D, reason: collision with root package name */
    private int f19203D;

    /* renamed from: E, reason: collision with root package name */
    private int f19204E;

    /* renamed from: I, reason: collision with root package name */
    private int f19208I;

    /* renamed from: K, reason: collision with root package name */
    private String f19210K;

    /* renamed from: N, reason: collision with root package name */
    private int f19213N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f19215b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f19216c;

    /* renamed from: d, reason: collision with root package name */
    private int f19217d;

    /* renamed from: e, reason: collision with root package name */
    private int f19218e;

    /* renamed from: f, reason: collision with root package name */
    private int f19219f;

    /* renamed from: g, reason: collision with root package name */
    private int f19220g;

    /* renamed from: h, reason: collision with root package name */
    private int f19221h;

    /* renamed from: i, reason: collision with root package name */
    private int f19222i;

    /* renamed from: k, reason: collision with root package name */
    private long f19224k;

    /* renamed from: l, reason: collision with root package name */
    private long f19225l;

    /* renamed from: m, reason: collision with root package name */
    private int f19226m;

    /* renamed from: n, reason: collision with root package name */
    private int f19227n;

    /* renamed from: o, reason: collision with root package name */
    private int f19228o;

    /* renamed from: p, reason: collision with root package name */
    private long f19229p;

    /* renamed from: q, reason: collision with root package name */
    private long f19230q;

    /* renamed from: r, reason: collision with root package name */
    private int f19231r;

    /* renamed from: s, reason: collision with root package name */
    private String f19232s;

    /* renamed from: t, reason: collision with root package name */
    private int f19233t;

    /* renamed from: u, reason: collision with root package name */
    private int f19234u;

    /* renamed from: z, reason: collision with root package name */
    private String f19239z;

    /* renamed from: a, reason: collision with root package name */
    private String f19214a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f19223j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f19235v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f19236w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f19237x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f19238y = 60;

    /* renamed from: B, reason: collision with root package name */
    private int f19201B = 1;

    /* renamed from: C, reason: collision with root package name */
    private String f19202C = "";

    /* renamed from: F, reason: collision with root package name */
    private int f19205F = 100;

    /* renamed from: G, reason: collision with root package name */
    private int f19206G = 60;

    /* renamed from: H, reason: collision with root package name */
    private int f19207H = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;

    /* renamed from: J, reason: collision with root package name */
    private int f19209J = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f19211L = "";

    /* renamed from: M, reason: collision with root package name */
    private String f19212M = "";

    public static k a(JSONObject jSONObject) {
        k kVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            k kVar2 = new k();
            try {
                ((c) kVar2).f19210K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                String optString = jSONObject.optString("ab_id");
                ((c) kVar2).f19214a = optString;
                com.mbridge.msdk.foundation.controller.a.f20292b.put(((c) kVar2).f19210K, optString);
                ((c) kVar2).f19211L = jSONObject.optString("rid");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i8)));
                    }
                    ((c) kVar2).f19215b = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i9)));
                    }
                    ((c) kVar2).f19216c = arrayList2;
                }
                ((c) kVar2).f19208I = jSONObject.optInt("tpqn");
                ((c) kVar2).f19219f = jSONObject.optInt("aqn");
                ((c) kVar2).f19218e = jSONObject.optInt("acn");
                ((c) kVar2).f19213N = jSONObject.optInt("wt");
                int i10 = 1;
                ((c) kVar2).f19236w = jSONObject.optInt("iscasf", 1);
                ((c) kVar2).f19207H = jSONObject.optInt("spmxrt", DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                ((c) kVar2).f19229p = jSONObject.optLong("current_time");
                ((c) kVar2).f19201B = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET);
                ((c) kVar2).f19230q = jSONObject.optLong("dlct", 3600L);
                ((c) kVar2).f19220g = jSONObject.optInt("autoplay", 0);
                ((c) kVar2).f19231r = jSONObject.optInt("dlnet", 2);
                ((c) kVar2).f19200A = jSONObject.optString("no_offer");
                ((c) kVar2).f19222i = jSONObject.optInt("cb_type");
                ((c) kVar2).f19225l = jSONObject.optLong("clct", 86400L);
                ((c) kVar2).f19224k = jSONObject.optLong("clcq", 300L);
                ((c) kVar2).f19205F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                ((c) kVar2).f19223j = jSONObject.optInt("cd_rate", 0);
                ((c) kVar2).f19227n = jSONObject.optInt("content", 1);
                ((c) kVar2).f19234u = jSONObject.optInt("impt", 0);
                ((c) kVar2).f19233t = jSONObject.optInt("icon_type", 1);
                ((c) kVar2).f19239z = jSONObject.optString("no_ads_url", "");
                ((c) kVar2).f19204E = jSONObject.optInt("playclosebtn_tm", -1);
                ((c) kVar2).f19203D = jSONObject.optInt("play_ctdown", 0);
                ((c) kVar2).f19226m = jSONObject.optInt("close_alert", 0);
                ((c) kVar2).f19235v = jSONObject.optInt("intershowlimit", 30);
                ((c) kVar2).f19206G = jSONObject.optInt("refreshFq", 60);
                ((c) kVar2).f19221h = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i10 = optInt;
                }
                ((c) kVar2).f19209J = i10;
                ((c) kVar2).f19202C = jSONObject.optString("placementid", "");
                ((c) kVar2).f19237x = jSONObject.optInt("ltafemty", 10);
                ((c) kVar2).f19238y = jSONObject.optInt("ltorwc", 60);
                ((c) kVar2).f19212M = jSONObject.optString("vtag", "");
                return kVar2;
            } catch (Exception e8) {
                e = e8;
                kVar = kVar2;
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<Integer> b() {
        return this.f19215b;
    }

    public final List<Integer> c() {
        return this.f19216c;
    }

    public final int d() {
        return this.f19218e;
    }

    public final int e() {
        return this.f19219f;
    }

    public final int f() {
        return this.f19221h;
    }

    public final int g() {
        return this.f19223j;
    }

    public final int h() {
        return this.f19227n;
    }

    public final long i() {
        return this.f19229p;
    }

    public final long j() {
        return this.f19230q;
    }

    public final int k() {
        return this.f19231r;
    }

    public final int l() {
        return this.f19234u;
    }

    public final int m() {
        return this.f19236w;
    }

    public final int n() {
        return this.f19237x;
    }

    public final int o() {
        return this.f19238y;
    }

    public final int p() {
        return this.f19205F;
    }

    public final int q() {
        return this.f19206G;
    }

    public final int r() {
        return this.f19207H;
    }

    public final String s() {
        return this.f19211L;
    }

    public final String t() {
        return this.f19212M;
    }

    public String toString() {
        List<Integer> list = this.f19215b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f19215b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f19201B + " unitId = " + this.f19210K + " fbPlacementId = " + this.f19232s + str;
    }

    public final int u() {
        return this.f19213N;
    }

    public final int v() {
        return this.f19220g;
    }

    public final int w() {
        return this.f19201B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f19215b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put(list.get(i8));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f19216c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < size2; i9++) {
                    jSONArray2.put(list2.get(i9));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f19208I);
            jSONObject.put("aqn", this.f19219f);
            jSONObject.put("acn", this.f19218e);
            jSONObject.put("wt", this.f19213N);
            jSONObject.put("current_time", this.f19229p);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f19201B);
            jSONObject.put("dlct", this.f19230q);
            jSONObject.put("autoplay", this.f19220g);
            jSONObject.put("dlnet", this.f19231r);
            jSONObject.put("no_offer", this.f19200A);
            jSONObject.put("cb_type", this.f19222i);
            jSONObject.put("clct", this.f19225l);
            jSONObject.put("clcq", this.f19224k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f19205F);
            jSONObject.put("content", this.f19227n);
            jSONObject.put("impt", this.f19234u);
            jSONObject.put("icon_type", this.f19233t);
            jSONObject.put("no_ads_url", this.f19239z);
            jSONObject.put("playclosebtn_tm", this.f19204E);
            jSONObject.put("play_ctdown", this.f19203D);
            jSONObject.put("close_alert", this.f19226m);
            jSONObject.put("closeBtn", this.f19221h);
            jSONObject.put("refreshFq", this.f19206G);
            jSONObject.put("countdown", this.f19228o);
            jSONObject.put("allowSkip", this.f19217d);
            jSONObject.put("tmorl", this.f19209J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f19210K);
            jSONObject.put("placementid", this.f19202C);
            jSONObject.put("ltafemty", this.f19237x);
            jSONObject.put("ltorwc", this.f19238y);
            jSONObject.put("vtag", this.f19212M);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f19216c = list;
    }

    public final void c(int i8) {
        this.f19218e = i8;
    }

    public final void d(int i8) {
        this.f19219f = i8;
    }

    public final void e(int i8) {
        this.f19223j = i8;
    }

    public final void f(int i8) {
        this.f19227n = i8;
    }

    public final void g(int i8) {
        this.f19228o = i8;
    }

    public final void h(int i8) {
        this.f19231r = i8;
    }

    public final void i(int i8) {
        this.f19234u = i8;
    }

    public final void j(int i8) {
        this.f19237x = i8;
    }

    public final void k(int i8) {
        this.f19238y = i8;
    }

    public final void l(int i8) {
        this.f19205F = i8;
    }

    public final void m(int i8) {
        this.f19206G = i8;
    }

    public final void n(int i8) {
        this.f19208I = i8;
    }

    public final void o(int i8) {
        this.f19213N = i8;
    }

    public final void p(int i8) {
        this.f19201B = i8;
    }

    public final void b(int i8) {
        this.f19217d = i8;
    }

    public final void b(String str) {
        this.f19210K = str;
    }

    public final void a(int i8) {
        this.f19220g = i8;
    }

    public final String a() {
        return this.f19214a;
    }

    public final void a(List<Integer> list) {
        this.f19215b = list;
    }

    public final void a(long j8) {
        this.f19230q = j8;
    }

    public final void a(String str) {
        this.f19202C = str;
    }
}

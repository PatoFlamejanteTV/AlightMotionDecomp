package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f20587a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f20588b;

    /* renamed from: A, reason: collision with root package name */
    private String f20589A;

    /* renamed from: B, reason: collision with root package name */
    private String f20590B;

    /* renamed from: C, reason: collision with root package name */
    private String f20591C;

    /* renamed from: D, reason: collision with root package name */
    private String f20592D;

    /* renamed from: E, reason: collision with root package name */
    private int f20593E;

    /* renamed from: F, reason: collision with root package name */
    private String f20594F;

    /* renamed from: G, reason: collision with root package name */
    private String f20595G;

    /* renamed from: I, reason: collision with root package name */
    private String f20597I;

    /* renamed from: J, reason: collision with root package name */
    private String f20598J;

    /* renamed from: K, reason: collision with root package name */
    private String f20599K;

    /* renamed from: L, reason: collision with root package name */
    private int f20600L;

    /* renamed from: M, reason: collision with root package name */
    private long f20601M;

    /* renamed from: N, reason: collision with root package name */
    private String f20602N;

    /* renamed from: O, reason: collision with root package name */
    private int f20603O;

    /* renamed from: d, reason: collision with root package name */
    private String f20605d;

    /* renamed from: e, reason: collision with root package name */
    private int f20606e;

    /* renamed from: g, reason: collision with root package name */
    private int f20608g;

    /* renamed from: h, reason: collision with root package name */
    private String f20609h;

    /* renamed from: i, reason: collision with root package name */
    private String f20610i;

    /* renamed from: j, reason: collision with root package name */
    private String f20611j;

    /* renamed from: k, reason: collision with root package name */
    private String f20612k;

    /* renamed from: l, reason: collision with root package name */
    private String f20613l;

    /* renamed from: m, reason: collision with root package name */
    private String f20614m;

    /* renamed from: n, reason: collision with root package name */
    private String f20615n;

    /* renamed from: o, reason: collision with root package name */
    private String f20616o;

    /* renamed from: p, reason: collision with root package name */
    private String f20617p;

    /* renamed from: q, reason: collision with root package name */
    private String f20618q;

    /* renamed from: r, reason: collision with root package name */
    private int f20619r;

    /* renamed from: s, reason: collision with root package name */
    private String f20620s;

    /* renamed from: t, reason: collision with root package name */
    private String f20621t;

    /* renamed from: u, reason: collision with root package name */
    private String f20622u;

    /* renamed from: w, reason: collision with root package name */
    private int f20624w;

    /* renamed from: x, reason: collision with root package name */
    private String f20625x;

    /* renamed from: y, reason: collision with root package name */
    private String f20626y;

    /* renamed from: z, reason: collision with root package name */
    private String f20627z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f20604c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f20607f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f20623v = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f20596H = 0;

    public n(String str, int i8, int i9, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5) {
        this.f20620s = str;
        this.f20624w = i8;
        this.f20625x = str5;
        this.f20619r = i9;
        this.f20603O = i10;
        this.f20600L = i11;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20626y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f20627z = str3;
        this.f20593E = i12;
        this.f20612k = str4;
        this.f20601M = i13;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f20591C != null) {
                stringBuffer.append("resource_type=" + next.f20591C + "&");
            }
            if (next.f20610i != null) {
                stringBuffer.append("creative=" + next.f20610i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20620s + "&");
                stringBuffer.append("network_type=" + next.f20624w + "&");
                stringBuffer.append("network_str=" + next.f20625x + "&");
                stringBuffer.append("result=" + next.f20593E + "&");
                stringBuffer.append("duration=" + next.f20612k + "&");
                stringBuffer.append("video_size=" + next.f20601M + "&");
                stringBuffer.append("video_length=" + next.f20600L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f20609h + "&");
                stringBuffer.append("video_url=" + next.f20602N + "&");
                stringBuffer.append("rid=" + next.f20589A + "&");
                stringBuffer.append("rid_n=" + next.f20590B + "&");
                stringBuffer.append("unit_id=" + next.f20599K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f20626y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20620s + "&");
                stringBuffer.append("result=" + next.f20593E + "&");
                stringBuffer.append("duration=" + next.f20612k + "&");
                stringBuffer.append("video_size=" + next.f20601M + "&");
                stringBuffer.append("video_length=" + next.f20600L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f20609h + "&");
                stringBuffer.append("video_url=" + next.f20602N + "&");
                stringBuffer.append("rid=" + next.f20589A + "&");
                stringBuffer.append("rid_n=" + next.f20590B + "&");
                stringBuffer.append("unit_id=" + next.f20599K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f20626y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
            it = it2;
        }
        return stringBuffer.toString();
    }

    public static String b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("key=" + nVar.f20620s + "&");
            stringBuffer.append("result=" + nVar.f20593E + "&");
            stringBuffer.append("duration=" + nVar.f20612k + "&");
            stringBuffer.append("endcard_url=" + nVar.f20614m + "&");
            stringBuffer.append("cid=" + nVar.f20609h + "&");
            stringBuffer.append("unit_id=" + nVar.f20599K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("ad_type=" + nVar.f20605d + "&");
            stringBuffer.append("rid=" + nVar.f20589A + "&");
            stringBuffer.append("rid_n=" + nVar.f20590B + "&");
            stringBuffer.append("type=" + nVar.f20613l + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(nVar.f20606e);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static String c(List<n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().f20617p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ad.a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    public static String d(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("network_type=" + nVar.f20624w + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("image_url=" + nVar.f20618q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("image_url=" + nVar.f20618q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String e(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("network_type=" + nVar.f20624w + "&");
                stringBuffer.append("network_str=" + nVar.f20625x + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("video_url=" + nVar.f20602N + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(nVar.f20626y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("video_url=" + nVar.f20602N + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(nVar.f20626y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String f(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20620s + "&");
        stringBuffer.append("cid=" + nVar.f20609h + "&");
        stringBuffer.append("unit_id=" + nVar.f20599K + "&");
        stringBuffer.append("network_type=" + nVar.f20624w + "&");
        stringBuffer.append("mraid_type=" + nVar.f20623v + "&");
        stringBuffer.append("rid_n=" + nVar.f20590B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f20589A);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20620s + "&");
        stringBuffer.append("result=" + nVar.f20593E + "&");
        stringBuffer.append("duration=" + nVar.f20612k + "&");
        stringBuffer.append("cid=" + nVar.f20609h + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f20605d + "&");
        stringBuffer.append("unit_id=" + nVar.f20599K + "&");
        stringBuffer.append("devid=" + nVar.f20611j + "&");
        stringBuffer.append("mraid_type=" + nVar.f20623v + "&");
        stringBuffer.append("network_type=" + nVar.f20624w + "&");
        if (!TextUtils.isEmpty(nVar.f20614m)) {
            stringBuffer.append("endcard_url=" + nVar.f20614m + "&");
        }
        if (!TextUtils.isEmpty(nVar.f20613l)) {
            stringBuffer.append("type=" + nVar.f20613l + "&");
        }
        if (nVar.f20591C != null) {
            stringBuffer.append("resource_type=" + nVar.f20591C + "&");
        }
        stringBuffer.append("rid_n=" + nVar.f20590B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f20589A);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String h(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f20615n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f20597I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20599K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20609h) + "&");
                stringBuffer.append("network_str=" + nVar.f20625x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f20624w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f20615n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f20597I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20599K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20609h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.f20596H;
    }

    public final String i() {
        return this.f20610i;
    }

    public final String j() {
        return this.f20611j;
    }

    public final int k() {
        return this.f20624w;
    }

    public final String l() {
        return this.f20625x;
    }

    public final int m() {
        return this.f20593E;
    }

    public final String n() {
        return this.f20612k;
    }

    public final long o() {
        return this.f20601M;
    }

    public final int p() {
        return this.f20600L;
    }

    public final String q() {
        return this.f20602N;
    }

    public final String r() {
        return this.f20626y;
    }

    public final String s() {
        return this.f20614m;
    }

    public final String t() {
        return this.f20613l;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f20620s + ", networkType=" + this.f20624w + ", isCompleteView=" + this.f20619r + ", watchedMillis=" + this.f20603O + ", videoLength=" + this.f20600L + ", offerUrl=" + this.f20626y + ", reason=" + this.f20627z + ", result=" + this.f20593E + ", duration=" + this.f20612k + ", videoSize=" + this.f20601M + "]";
    }

    public final int u() {
        return this.f20606e;
    }

    public final String v() {
        return this.f20618q;
    }

    public final int w() {
        return this.f20619r;
    }

    public final int x() {
        return this.f20603O;
    }

    public final int y() {
        return this.f20623v;
    }

    public final String z() {
        return this.f20597I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20610i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f20611j = str;
    }

    public final void k(String str) {
        this.f20625x = str;
    }

    public final void l(String str) {
        this.f20612k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20602N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20614m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(String str) {
        this.f20613l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20618q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20597I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f20615n = str;
    }

    public final void s(String str) {
        this.f20622u = str;
    }

    public final void t(String str) {
        this.f20592D = str;
    }

    public final void u(String str) {
        this.f20594F = str;
    }

    public final void v(String str) {
        this.f20595G = str;
    }

    public static String c(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f20620s + "&");
            stringBuffer.append("cid=" + nVar.f20609h + "&");
            stringBuffer.append("rid=" + nVar.f20589A + "&");
            stringBuffer.append("rid_n=" + nVar.f20590B + "&");
            stringBuffer.append("unit_id=" + nVar.f20599K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("case=" + nVar.f20608g + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("network_type=");
            sb.append(nVar.f20624w);
            stringBuffer.append(sb.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("network_type=" + nVar.f20624w + "&");
                stringBuffer.append("result=" + nVar.f20593E + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("template_url=" + nVar.f20597I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("result=" + nVar.f20593E + "&");
                stringBuffer.append("cid=" + nVar.f20609h + "&");
                stringBuffer.append("template_url=" + nVar.f20597I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20589A + "&");
                stringBuffer.append("rid_n=" + nVar.f20590B + "&");
                stringBuffer.append("unit_id=" + nVar.f20599K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public n() {
    }

    public n(String str, int i8, String str2, String str3, String str4) {
        this.f20620s = str;
        this.f20625x = str4;
        this.f20624w = i8;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f20626y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20627z = str3;
    }

    public final String c() {
        return this.f20599K;
    }

    public final void c(String str) {
        this.f20599K = str;
    }

    public static String b(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f20620s + "&");
            stringBuffer.append("cid=" + nVar.f20609h + "&");
            stringBuffer.append("rid=" + nVar.f20589A + "&");
            stringBuffer.append("rid_n=" + nVar.f20590B + "&");
            stringBuffer.append("unit_id=" + nVar.f20599K + "&");
            stringBuffer.append("network_type=" + nVar.f20624w + "&");
            stringBuffer.append("mraid_type=" + nVar.f20623v + "&");
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public final void c(int i8) {
        this.f20606e = i8;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f20627z) ? "" : this.f20627z;
    }

    public final void h(String str) {
        this.f20627z = str;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20620s + "&");
        stringBuffer.append("cid=" + nVar.f20609h + "&");
        stringBuffer.append("unit_id=" + nVar.f20599K + "&");
        stringBuffer.append("network_type=" + nVar.f20624w + "&");
        stringBuffer.append("rid=" + nVar.f20589A + "&");
        stringBuffer.append("rid_n=" + nVar.f20590B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(nVar.h());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public n(String str, int i8, int i9, String str2, int i10, String str3, int i11, String str4) {
        this.f20620s = str;
        this.f20624w = i8;
        this.f20625x = str4;
        this.f20600L = i9;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f20626y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20593E = i10;
        this.f20612k = str3;
        this.f20601M = i11;
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20620s + "&");
        stringBuffer.append("result=" + nVar.f20593E + "&");
        stringBuffer.append("duration=" + nVar.f20612k + "&");
        stringBuffer.append("cid=" + nVar.f20609h + "&");
        stringBuffer.append("unit_id=" + nVar.f20599K + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f20605d + "&");
        stringBuffer.append("rid=" + nVar.f20589A + "&");
        stringBuffer.append("rid_n=" + nVar.f20590B + "&");
        stringBuffer.append("network_type=" + nVar.f20624w + "&");
        stringBuffer.append("mraid_type=" + nVar.f20623v + "&");
        stringBuffer.append("devid=" + nVar.f20611j + "&");
        if (nVar.f20591C != null) {
            stringBuffer.append("resource_type=" + nVar.f20591C + "&");
        }
        if (!TextUtils.isEmpty(nVar.f20614m)) {
            stringBuffer.append("endcard_url=" + nVar.f20614m + "&");
        }
        stringBuffer.append("type=" + nVar.f20613l);
        return stringBuffer.toString();
    }

    public final String g() {
        return this.f20590B;
    }

    public final void g(String str) {
        this.f20590B = str;
    }

    public final String b() {
        return this.f20591C;
    }

    public final void b(String str) {
        this.f20591C = str;
    }

    public final void b(int i8) {
        this.f20593E = i8;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f20604c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final String d() {
        return this.f20605d;
    }

    public final void d(String str) {
        this.f20605d = str;
    }

    public n(Context context, CampaignEx campaignEx, int i8, String str, long j8, int i9) {
        if (i9 == 1 || i9 == 287 || i9 == 94) {
            this.f20620s = "m_download_end";
        } else if (i9 == 95) {
            this.f20620s = "2000025";
        }
        int l8 = z.l(context);
        this.f20624w = l8;
        this.f20625x = z.a(context, l8);
        this.f20600L = campaignEx.getVideoLength();
        this.f20589A = campaignEx.getRequestId();
        this.f20590B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f20626y)) {
            try {
                this.f20626y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20593E = i8;
        this.f20612k = str;
        this.f20601M = j8 == 0 ? campaignEx.getVideoSize() : j8;
    }

    public final void d(int i8) {
        this.f20623v = i8;
    }

    public final String f() {
        return this.f20589A;
    }

    public final void f(String str) {
        this.f20589A = str;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f20616o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f20598J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f20621t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20599K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20609h) + "&");
                stringBuffer.append("network_str=" + nVar.f20625x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f20624w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f20620s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f20616o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f20598J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f20621t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20599K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20609h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i8, String str7) {
        this.f20620s = str;
        this.f20616o = str2;
        this.f20598J = str3;
        this.f20621t = str4;
        this.f20599K = str5;
        this.f20609h = str6;
        this.f20624w = i8;
        this.f20625x = str7;
    }

    public final String e() {
        return this.f20609h;
    }

    public final void e(String str) {
        this.f20609h = str;
    }

    public final void e(int i8) {
        this.f20596H = i8;
    }

    public n(String str) {
        this.f20617p = str;
    }

    public n(String str, int i8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20620s = str;
        this.f20593E = i8;
        this.f20612k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f20614m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f20609h = str4;
        this.f20599K = str5;
        this.f20627z = str6;
        this.f20613l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f20639K) {
            this.f20593E = 2;
        }
    }

    public final String a() {
        return this.f20620s;
    }

    public final void a(String str) {
        this.f20620s = str;
    }

    public final void a(int i8) {
        this.f20624w = i8;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f20604c == null) {
            this.f20604c = new HashMap();
        }
        try {
            this.f20604c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8) {
        this.f20620s = str;
        this.f20609h = str2;
        this.f20589A = str3;
        this.f20590B = str4;
        this.f20599K = str5;
        this.f20624w = i8;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8, int i9, String str6) {
        this.f20620s = str;
        this.f20609h = str2;
        this.f20589A = str3;
        this.f20590B = str4;
        this.f20599K = str5;
        this.f20624w = i8;
        this.f20627z = str6;
        this.f20608g = i9;
    }
}

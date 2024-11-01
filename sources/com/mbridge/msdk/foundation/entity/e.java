package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f20510a;

    /* renamed from: b, reason: collision with root package name */
    private String f20511b;

    /* renamed from: c, reason: collision with root package name */
    private String f20512c;

    /* renamed from: d, reason: collision with root package name */
    private int f20513d;

    /* renamed from: e, reason: collision with root package name */
    private int f20514e;

    /* renamed from: f, reason: collision with root package name */
    private String f20515f;

    /* renamed from: g, reason: collision with root package name */
    private String f20516g;

    /* renamed from: h, reason: collision with root package name */
    private String f20517h;

    /* renamed from: i, reason: collision with root package name */
    private int f20518i;

    /* renamed from: j, reason: collision with root package name */
    private String f20519j;

    /* renamed from: k, reason: collision with root package name */
    private int f20520k;

    /* renamed from: l, reason: collision with root package name */
    private int f20521l;

    /* renamed from: m, reason: collision with root package name */
    private String f20522m;

    /* renamed from: n, reason: collision with root package name */
    private int f20523n;

    /* renamed from: o, reason: collision with root package name */
    private String f20524o;

    /* renamed from: p, reason: collision with root package name */
    private String f20525p;

    /* renamed from: q, reason: collision with root package name */
    private int f20526q;

    /* renamed from: r, reason: collision with root package name */
    private String f20527r;

    public e() {
    }

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.f20527r;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.f20292b.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f20524o);
                sb.append("&rid_n=" + next.f20525p);
                sb.append("&network_type=" + next.f20523n);
                sb.append("&network_str=" + next.f20522m);
                sb.append("&cid=" + next.f20510a);
                sb.append("&click_type=" + next.f20513d);
                sb.append("&type=" + next.f20526q);
                sb.append("&click_duration=" + next.f20511b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20527r);
                sb.append("&last_url=" + next.f20519j);
                sb.append("&content=" + next.f20515f);
                sb.append("&code=" + next.f20514e);
                sb.append("&exception=" + next.f20516g);
                sb.append("&header=" + next.f20517h);
                sb.append("&landing_type=" + next.f20518i);
                sb.append("&link_type=" + next.f20520k);
                sb.append("&click_time=" + next.f20512c + "\n");
            } else {
                sb.append("rid=" + next.f20524o);
                sb.append("&rid_n=" + next.f20525p);
                sb.append("&cid=" + next.f20510a);
                sb.append("&click_type=" + next.f20513d);
                sb.append("&type=" + next.f20526q);
                sb.append("&click_duration=" + next.f20511b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20527r);
                sb.append("&last_url=" + next.f20519j);
                sb.append("&content=" + next.f20515f);
                sb.append("&code=" + next.f20514e);
                sb.append("&exception=" + next.f20516g);
                sb.append("&header=" + next.f20517h);
                sb.append("&landing_type=" + next.f20518i);
                sb.append("&link_type=" + next.f20520k);
                sb.append("&click_time=" + next.f20512c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final void b(String str) {
        this.f20524o = str;
    }

    public final void c(String str) {
        this.f20522m = str;
    }

    public final void d(String str) {
        this.f20516g = str;
    }

    public final void e(int i8) {
        this.f20520k = i8;
    }

    public final void f(String str) {
        this.f20517h = str;
    }

    public final void g(String str) {
        this.f20515f = str;
    }

    public final void h(String str) {
        this.f20519j = str;
    }

    public final void i(String str) {
        this.f20511b = str;
    }

    public final void j(String str) {
        this.f20510a = str;
    }

    public final void k(String str) {
        this.f20525p = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f20510a + ", click_duration=" + this.f20511b + ", lastUrl=" + this.f20519j + ", code=" + this.f20514e + ", excepiton=" + this.f20516g + ", header=" + this.f20517h + ", content=" + this.f20515f + ", type=" + this.f20526q + ", click_type=" + this.f20513d + "]";
    }

    public e(String str, String str2, String str3, String str4, String str5, int i8, String str6, String str7, String str8, int i9, int i10, String str9, int i11, int i12, String str10, int i13, int i14, String str11) {
        this.f20524o = str;
        this.f20525p = str2;
        this.f20510a = str3;
        this.f20511b = str4;
        this.f20519j = str5;
        this.f20514e = i8;
        this.f20516g = str6;
        this.f20517h = str7;
        this.f20515f = str8;
        this.f20526q = i9;
        this.f20513d = i10;
        this.f20527r = str9;
        this.f20518i = i11;
        this.f20520k = i12;
        this.f20512c = str10;
        this.f20523n = i13;
        this.f20522m = str11;
        this.f20521l = i14;
    }

    public final void b(int i8) {
        this.f20513d = i8;
    }

    public final void c(int i8) {
        this.f20526q = i8;
    }

    public final void d(int i8) {
        this.f20518i = i8;
    }

    public final void e(String str) {
        this.f20512c = str;
    }

    public final void f(int i8) {
        this.f20514e = i8;
    }

    public final void a(String str) {
        this.f20527r = str;
    }

    public final void a(int i8) {
        this.f20523n = i8;
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = eVar.f20519j;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + eVar.f20524o);
            sb.append("&rid_n=" + eVar.f20525p);
            sb.append("&network_type=" + eVar.f20523n);
            sb.append("&network_str=" + eVar.f20522m);
            sb.append("&click_type=" + eVar.f20513d);
            sb.append("&type=" + eVar.f20526q);
            sb.append("&cid=" + eVar.f20510a);
            sb.append("&click_duration=" + eVar.f20511b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f20527r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f20514e);
            sb.append("&exception=" + eVar.f20516g);
            sb.append("&landing_type=" + eVar.f20518i);
            sb.append("&link_type=" + eVar.f20520k);
            sb.append("&click_time=" + eVar.f20512c + "\n");
        } else {
            sb.append("rid=" + eVar.f20524o);
            sb.append("&rid_n=" + eVar.f20525p);
            sb.append("&click_type=" + eVar.f20513d);
            sb.append("&type=" + eVar.f20526q);
            sb.append("&cid=" + eVar.f20510a);
            sb.append("&click_duration=" + eVar.f20511b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f20527r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f20514e);
            sb.append("&exception=" + eVar.f20516g);
            sb.append("&landing_type=" + eVar.f20518i);
            sb.append("&link_type=" + eVar.f20520k);
            sb.append("&click_time=" + eVar.f20512c + "\n");
        }
        return sb.toString();
    }
}

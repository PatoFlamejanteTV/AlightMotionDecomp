package com.mbridge.msdk.foundation.b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f20260a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f20261b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f20262c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f20263d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f20264e = 4;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f20265f;

    /* renamed from: g, reason: collision with root package name */
    private String f20266g;

    /* renamed from: h, reason: collision with root package name */
    private int f20267h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f20268i = f20261b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f20269j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f20270k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f20271l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f20272m = new ArrayList();

    public final CopyOnWriteArrayList<CampaignEx> a() {
        return this.f20265f;
    }

    public final String b() {
        return this.f20266g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f20269j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f20270k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f20271l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f20272m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f20268i;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f20265f = copyOnWriteArrayList;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f20270k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f20269j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f20271l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f20266g = str;
    }

    public final void a(int i8) {
        this.f20268i = i8;
    }
}

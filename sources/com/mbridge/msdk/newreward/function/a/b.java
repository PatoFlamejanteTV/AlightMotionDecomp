package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f22126a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f22127b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f22128c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f22129d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f22130e = 4;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f22131f;

    /* renamed from: g, reason: collision with root package name */
    private String f22132g;

    /* renamed from: h, reason: collision with root package name */
    private int f22133h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f22134i = f22127b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f22135j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f22136k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f22137l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f22138m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f22131f;
    }

    public final String b() {
        return this.f22132g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f22135j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f22136k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f22137l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f22138m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f22133h;
    }

    public final int h() {
        return this.f22134i;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f22131f = bVar;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f22136k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f22135j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f22137l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f22132g = str;
    }

    public final void a(int i8) {
        this.f22134i = i8;
    }
}

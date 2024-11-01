package q7;

import W6.C1488n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3836e {

    /* renamed from: h, reason: collision with root package name */
    public static final C3836e f37608h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3836e f37609i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3836e f37610j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3836e f37611k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map f37612l;

    /* renamed from: a, reason: collision with root package name */
    private final int f37613a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37614b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37615c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37616d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37617e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37618f;

    /* renamed from: g, reason: collision with root package name */
    private final C1488n f37619g;

    /* renamed from: q7.e$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3836e c3836e = C3836e.f37608h;
            put(Integer.valueOf(c3836e.f37613a), c3836e);
            C3836e c3836e2 = C3836e.f37609i;
            put(Integer.valueOf(c3836e2.f37613a), c3836e2);
            C3836e c3836e3 = C3836e.f37610j;
            put(Integer.valueOf(c3836e3.f37613a), c3836e3);
            C3836e c3836e4 = C3836e.f37611k;
            put(Integer.valueOf(c3836e4.f37613a), c3836e4);
        }
    }

    static {
        C1488n c1488n = Z6.a.f13974c;
        f37608h = new C3836e(1, 32, 1, 265, 7, 8516, c1488n);
        f37609i = new C3836e(2, 32, 2, 133, 6, 4292, c1488n);
        f37610j = new C3836e(3, 32, 4, 67, 4, 2180, c1488n);
        f37611k = new C3836e(4, 32, 8, 34, 0, 1124, c1488n);
        f37612l = new a();
    }

    protected C3836e(int i8, int i9, int i10, int i11, int i12, int i13, C1488n c1488n) {
        this.f37613a = i8;
        this.f37614b = i9;
        this.f37615c = i10;
        this.f37616d = i11;
        this.f37617e = i12;
        this.f37618f = i13;
        this.f37619g = c1488n;
    }

    public static C3836e e(int i8) {
        return (C3836e) f37612l.get(Integer.valueOf(i8));
    }

    public C1488n b() {
        return this.f37619g;
    }

    public int c() {
        return this.f37614b;
    }

    public int d() {
        return this.f37616d;
    }

    public int f() {
        return this.f37613a;
    }

    public int g() {
        return this.f37615c;
    }
}

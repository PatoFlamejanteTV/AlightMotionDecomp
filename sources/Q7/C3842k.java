package q7;

import W6.C1488n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q7.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3842k {

    /* renamed from: e, reason: collision with root package name */
    public static final C3842k f37644e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3842k f37645f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3842k f37646g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3842k f37647h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3842k f37648i;

    /* renamed from: j, reason: collision with root package name */
    private static Map f37649j;

    /* renamed from: a, reason: collision with root package name */
    private final int f37650a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37651b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37652c;

    /* renamed from: d, reason: collision with root package name */
    private final C1488n f37653d;

    /* renamed from: q7.k$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3842k c3842k = C3842k.f37644e;
            put(Integer.valueOf(c3842k.f37650a), c3842k);
            C3842k c3842k2 = C3842k.f37645f;
            put(Integer.valueOf(c3842k2.f37650a), c3842k2);
            C3842k c3842k3 = C3842k.f37646g;
            put(Integer.valueOf(c3842k3.f37650a), c3842k3);
            C3842k c3842k4 = C3842k.f37647h;
            put(Integer.valueOf(c3842k4.f37650a), c3842k4);
            C3842k c3842k5 = C3842k.f37648i;
            put(Integer.valueOf(c3842k5.f37650a), c3842k5);
        }
    }

    static {
        C1488n c1488n = Z6.a.f13974c;
        f37644e = new C3842k(5, 32, 5, c1488n);
        f37645f = new C3842k(6, 32, 10, c1488n);
        f37646g = new C3842k(7, 32, 15, c1488n);
        f37647h = new C3842k(8, 32, 20, c1488n);
        f37648i = new C3842k(9, 32, 25, c1488n);
        f37649j = new a();
    }

    protected C3842k(int i8, int i9, int i10, C1488n c1488n) {
        this.f37650a = i8;
        this.f37651b = i9;
        this.f37652c = i10;
        this.f37653d = c1488n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C3842k e(int i8) {
        return (C3842k) f37649j.get(Integer.valueOf(i8));
    }

    public C1488n b() {
        return this.f37653d;
    }

    public int c() {
        return this.f37652c;
    }

    public int d() {
        return this.f37651b;
    }

    public int f() {
        return this.f37650a;
    }
}

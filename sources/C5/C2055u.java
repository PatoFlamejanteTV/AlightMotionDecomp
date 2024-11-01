package c5;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2055u {

    /* renamed from: a, reason: collision with root package name */
    private String f15951a;

    /* renamed from: b, reason: collision with root package name */
    private String f15952b;

    /* renamed from: c, reason: collision with root package name */
    private long f15953c;

    /* renamed from: d, reason: collision with root package name */
    private String f15954d;

    public final String a() {
        return this.f15954d;
    }

    public final String b() {
        return this.f15951a;
    }

    public final String c() {
        String str = this.f15954d;
        if (str == null) {
            return null;
        }
        AbstractC3292y.f(str);
        String str2 = this.f15954d;
        AbstractC3292y.f(str2);
        String substring = str.substring(l6.n.X(str2, "/", 0, false, 6, null) + 1);
        AbstractC3292y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return this.f15952b;
    }

    public final long e() {
        return this.f15953c;
    }

    public final void f(String str) {
        this.f15954d = str;
    }

    public final void g(String str) {
        this.f15951a = str;
    }

    public final void h(String str) {
        this.f15952b = str;
    }

    public final void i(long j8) {
        this.f15953c = j8;
    }

    public String toString() {
        return "FileInfo{md5='" + this.f15951a + "', sha256='" + this.f15952b + "', size=" + this.f15953c + ", absolutePath='" + this.f15954d + "'}";
    }
}

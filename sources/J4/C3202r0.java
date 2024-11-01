package j4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j4.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3202r0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34255a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34256b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34257c;

    public C3202r0(String url, int i8, int i9) {
        AbstractC3292y.i(url, "url");
        this.f34255a = url;
        this.f34256b = i8;
        this.f34257c = i9;
    }

    public final int a() {
        return this.f34257c;
    }

    public final int b() {
        return this.f34256b;
    }

    public final String c() {
        return this.f34255a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3202r0)) {
            return false;
        }
        C3202r0 c3202r0 = (C3202r0) obj;
        if (AbstractC3292y.d(this.f34255a, c3202r0.f34255a) && this.f34256b == c3202r0.f34256b && this.f34257c == c3202r0.f34257c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34255a.hashCode() * 31) + this.f34256b) * 31) + this.f34257c;
    }

    public String toString() {
        return "LinkAnnotation(url=" + this.f34255a + ", start=" + this.f34256b + ", end=" + this.f34257c + ")";
    }
}

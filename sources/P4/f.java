package P4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private String f8101a;

    /* renamed from: b, reason: collision with root package name */
    private String f8102b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8103c;

    /* renamed from: d, reason: collision with root package name */
    private long f8104d;

    public f(String path) {
        AbstractC3292y.i(path, "path");
        this.f8101a = path;
    }

    public final long a() {
        return this.f8104d;
    }

    public final String b() {
        return this.f8101a;
    }

    public final boolean c() {
        return AbstractC3292y.d("mounted", this.f8102b);
    }

    public final boolean d() {
        return this.f8103c;
    }

    public final void e(long j8) {
        this.f8104d = j8;
    }

    public final void f(boolean z8) {
        this.f8103c = z8;
    }

    public final void g(String str) {
        this.f8102b = str;
    }
}

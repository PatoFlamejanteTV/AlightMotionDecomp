package P4;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0160a f8078f = new C0160a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f8079a;

    /* renamed from: c, reason: collision with root package name */
    private String f8081c;

    /* renamed from: d, reason: collision with root package name */
    private long f8082d;

    /* renamed from: b, reason: collision with root package name */
    private long f8080b = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f8083e = -1;

    /* renamed from: P4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0160a {
        private C0160a() {
        }

        public /* synthetic */ C0160a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final String a() {
        return this.f8081c;
    }

    public final String b() {
        return this.f8079a;
    }

    public final long c() {
        return this.f8083e;
    }

    public final long d() {
        return this.f8082d;
    }

    public final long e() {
        return this.f8080b;
    }

    public final void f(String packageName, long j8, String appName, long j9) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(appName, "appName");
        this.f8079a = packageName;
        this.f8080b = j8;
        this.f8081c = appName;
        this.f8082d = System.currentTimeMillis();
        this.f8083e = j9;
    }
}

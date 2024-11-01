package com.mbridge.msdk.e.a;

/* loaded from: classes4.dex */
public abstract class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final m f20097a;

    /* renamed from: b, reason: collision with root package name */
    private long f20098b;

    /* renamed from: c, reason: collision with root package name */
    private int f20099c;

    /* renamed from: d, reason: collision with root package name */
    private String f20100d;

    public z() {
        this.f20099c = 0;
        this.f20100d = "";
        this.f20097a = null;
    }

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j8) {
        this.f20098b = j8;
    }

    public final int b() {
        return this.f20099c;
    }

    public final String c() {
        return this.f20100d;
    }

    public final void a(int i8) {
        this.f20099c = i8;
    }

    public final void a(String str) {
        this.f20100d = str;
    }

    public z(m mVar) {
        this.f20099c = 0;
        this.f20100d = "";
        this.f20097a = mVar;
    }

    public z(String str) {
        super(str);
        this.f20099c = 0;
        this.f20100d = "";
        this.f20097a = null;
    }

    public z(Throwable th) {
        super(th);
        this.f20099c = 0;
        this.f20100d = "";
        this.f20097a = null;
    }
}

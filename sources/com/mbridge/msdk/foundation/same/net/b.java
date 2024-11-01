package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f20832a;

    /* renamed from: b, reason: collision with root package name */
    private int f20833b;

    /* renamed from: c, reason: collision with root package name */
    private int f20834c;

    /* renamed from: d, reason: collision with root package name */
    private int f20835d;

    /* renamed from: e, reason: collision with root package name */
    private int f20836e;

    /* renamed from: f, reason: collision with root package name */
    private int f20837f;

    /* renamed from: g, reason: collision with root package name */
    private int f20838g;

    /* renamed from: h, reason: collision with root package name */
    private int f20839h;

    public b() {
        this(30000, 0);
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int a() {
        return this.f20836e;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int b() {
        return this.f20832a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int c() {
        return this.f20834c;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int d() {
        return this.f20837f;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int e() {
        return this.f20838g;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int f() {
        return this.f20833b;
    }

    private b(int i8, int i9) {
        this.f20833b = 0;
        this.f20834c = 0;
        this.f20837f = 0;
        this.f20838g = 0;
        this.f20839h = 2;
        this.f20836e = i8 <= 0 ? 30000 : i8;
        this.f20832a = i9;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final boolean a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i8 = this.f20835d + 1;
        this.f20835d = i8;
        return i8 <= this.f20832a;
    }

    public b(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f20833b = 0;
        this.f20834c = 0;
        this.f20837f = 0;
        this.f20838g = 0;
        this.f20839h = 2;
        this.f20834c = Math.max(i8, 0);
        this.f20837f = Math.max(i9, 0);
        this.f20838g = Math.max(i10, 0);
        this.f20833b = Math.max(i11, 0);
        this.f20832a = Math.max(i12, 0);
        this.f20839h = i13;
    }

    public b(int i8, int i9, int i10, int i11, int i12) {
        this.f20833b = 0;
        this.f20834c = 0;
        this.f20837f = 0;
        this.f20838g = 0;
        this.f20839h = 2;
        this.f20834c = Math.max(i8, 0);
        this.f20837f = Math.max(i9, 0);
        this.f20838g = Math.max(i10, 0);
        this.f20833b = Math.max(i11, 0);
        this.f20832a = Math.max(i12, 0);
    }
}

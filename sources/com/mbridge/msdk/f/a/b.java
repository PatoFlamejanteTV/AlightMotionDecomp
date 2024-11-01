package com.mbridge.msdk.f.a;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.f.a.a f20225a;

    /* renamed from: b, reason: collision with root package name */
    private long f20226b;

    /* renamed from: c, reason: collision with root package name */
    private a f20227c;

    /* renamed from: d, reason: collision with root package name */
    private long f20228d = 0;

    /* loaded from: classes4.dex */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.f.a.a f20229a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.f.a.a aVar) {
            this.f20229a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.f.a.a aVar = this.f20229a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.f.a.a aVar = this.f20229a;
            if (aVar != null) {
                aVar.onTick(j8);
            }
        }
    }

    public final void a() {
        a aVar = this.f20227c;
        if (aVar != null) {
            aVar.cancel();
            this.f20227c = null;
        }
    }

    public final b b(long j8) {
        this.f20228d = j8;
        return this;
    }

    public final void b() {
        a aVar = this.f20227c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f20227c = null;
            }
            if (this.f20226b <= 0) {
                this.f20226b = this.f20228d + 1000;
            }
            a aVar2 = new a(this.f20228d, this.f20226b);
            this.f20227c = aVar2;
            aVar2.a(this.f20225a);
        }
        this.f20227c.start();
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f20226b = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.f.a.a aVar) {
        this.f20225a = aVar;
        return this;
    }
}

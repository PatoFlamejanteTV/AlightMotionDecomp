package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f23334a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f23335b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f23336c;

    /* renamed from: d, reason: collision with root package name */
    private a f23337d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.i.c.a f23338a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.f23338a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f23338a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f23338a;
            if (aVar != null) {
                aVar.a(j8);
            }
        }
    }

    private void c() {
        a aVar = this.f23337d;
        if (aVar != null) {
            aVar.cancel();
            this.f23337d = null;
        }
        if (this.f23335b <= 0) {
            this.f23335b = this.f23334a + 1000;
        }
        a aVar2 = new a(this.f23334a, this.f23335b);
        this.f23337d = aVar2;
        aVar2.a(this.f23336c);
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f23335b = j8;
        return this;
    }

    public final b b(long j8) {
        this.f23334a = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f23336c = aVar;
        return this;
    }

    public final void b() {
        a aVar = this.f23337d;
        if (aVar != null) {
            aVar.cancel();
            this.f23337d = null;
        }
    }

    public final void a() {
        if (this.f23337d == null) {
            c();
        }
        this.f23337d.start();
    }

    public final void a(long j8, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f23334a = j8;
        this.f23336c = aVar;
        c();
        a aVar2 = this.f23337d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}

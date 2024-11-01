package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import m2.InterfaceC3361a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f24658a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3361a f24659b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f24660c;

    /* renamed from: d, reason: collision with root package name */
    long f24661d;

    /* renamed from: e, reason: collision with root package name */
    long f24662e;

    /* renamed from: f, reason: collision with root package name */
    long f24663f;

    /* renamed from: g, reason: collision with root package name */
    long f24664g;

    /* renamed from: h, reason: collision with root package name */
    long f24665h;

    /* renamed from: i, reason: collision with root package name */
    long f24666i;

    /* renamed from: j, reason: collision with root package name */
    long f24667j;

    /* renamed from: k, reason: collision with root package name */
    long f24668k;

    /* renamed from: l, reason: collision with root package name */
    int f24669l;

    /* renamed from: m, reason: collision with root package name */
    int f24670m;

    /* renamed from: n, reason: collision with root package name */
    int f24671n;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final z f24672a;

        /* renamed from: com.squareup.picasso.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0444a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f24673a;

            RunnableC0444a(Message message) {
                this.f24673a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f24673a.what);
            }
        }

        a(Looper looper, z zVar) {
            super(looper);
            this.f24672a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                s.f24554o.post(new RunnableC0444a(message));
                                return;
                            } else {
                                this.f24672a.l((Long) message.obj);
                                return;
                            }
                        }
                        this.f24672a.i(message.arg1);
                        return;
                    }
                    this.f24672a.h(message.arg1);
                    return;
                }
                this.f24672a.k();
                return;
            }
            this.f24672a.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(InterfaceC3361a interfaceC3361a) {
        this.f24659b = interfaceC3361a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f24658a = handlerThread;
        handlerThread.start();
        C.i(handlerThread.getLooper());
        this.f24660c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i8, long j8) {
        return j8 / i8;
    }

    private void m(Bitmap bitmap, int i8) {
        int j8 = C.j(bitmap);
        Handler handler = this.f24660c;
        handler.sendMessage(handler.obtainMessage(i8, j8, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2.d a() {
        return new m2.d(this.f24659b.b(), this.f24659b.size(), this.f24661d, this.f24662e, this.f24663f, this.f24664g, this.f24665h, this.f24666i, this.f24667j, this.f24668k, this.f24669l, this.f24670m, this.f24671n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f24660c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f24660c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j8) {
        Handler handler = this.f24660c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void h(long j8) {
        int i8 = this.f24670m + 1;
        this.f24670m = i8;
        long j9 = this.f24664g + j8;
        this.f24664g = j9;
        this.f24667j = g(i8, j9);
    }

    void i(long j8) {
        this.f24671n++;
        long j9 = this.f24665h + j8;
        this.f24665h = j9;
        this.f24668k = g(this.f24670m, j9);
    }

    void j() {
        this.f24661d++;
    }

    void k() {
        this.f24662e++;
    }

    void l(Long l8) {
        this.f24669l++;
        long longValue = this.f24663f + l8.longValue();
        this.f24663f = longValue;
        this.f24666i = g(this.f24669l, longValue);
    }
}

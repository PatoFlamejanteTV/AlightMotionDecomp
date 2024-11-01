package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f21048a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f21049b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f21050c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f21051d;

    /* renamed from: e, reason: collision with root package name */
    private int f21052e;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f21054b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21055c;

        /* renamed from: d, reason: collision with root package name */
        private long f21056d;

        private a() {
            this.f21054b = SystemClock.uptimeMillis();
        }

        final void b() {
            this.f21055c = false;
            this.f21056d = SystemClock.uptimeMillis();
            b.this.f21049b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f21055c = true;
                this.f21054b = SystemClock.uptimeMillis();
            }
        }

        final boolean a() {
            return !this.f21055c || this.f21054b - this.f21056d >= ((long) b.this.f21052e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f21049b = new Handler(Looper.getMainLooper());
        this.f21052e = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f21050c == null || this.f21050c.f21055c)) {
                synchronized (this) {
                    try {
                        if (this.f21050c == null) {
                            this.f21050c = new a();
                        }
                        this.f21050c.b();
                        long j8 = this.f21052e;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j8 > 0) {
                            try {
                                wait(j8);
                            } catch (InterruptedException e8) {
                                Log.w("AnrMonitor", e8.toString());
                            }
                            j8 = this.f21052e - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.f21050c.a()) {
                            com.mbridge.msdk.foundation.same.report.b.a aVar = this.f21051d;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f21051d != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f21051d.a(c.a(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f21052e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (f21048a == null) {
            synchronized (b.class) {
                try {
                    if (f21048a == null) {
                        f21048a = new b();
                    }
                } finally {
                }
            }
        }
        return f21048a;
    }

    public final b a(int i8, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f21052e = i8;
        this.f21051d = aVar;
        return this;
    }
}

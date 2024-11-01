package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f22035a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f22036b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f22037c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0414a {
        void a(String str, long j8);
    }

    /* loaded from: classes4.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f22038a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22039b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22040c;

        public b(String str, long j8) {
            this.f22038a = str;
            this.f22039b = j8;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f22041a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0414a f22042b;

        public c(b bVar, InterfaceC0414a interfaceC0414a) {
            this.f22041a = bVar;
            this.f22042b = interfaceC0414a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0414a interfaceC0414a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f22041a.f22038a + " isStop: " + this.f22041a.f22040c);
            }
            if (this.f22041a.f22040c || (interfaceC0414a = this.f22042b) == null) {
                return;
            }
            try {
                interfaceC0414a.a(this.f22041a.f22038a, this.f22041a.f22039b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f22037c = new Handler(handlerThread.getLooper());
        this.f22036b = new HashMap();
    }

    public static a a() {
        if (f22035a == null) {
            synchronized (a.class) {
                try {
                    if (f22035a == null) {
                        f22035a = new a();
                    }
                } finally {
                }
            }
        }
        return f22035a;
    }

    public final void a(String str, long j8, InterfaceC0414a interfaceC0414a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j8);
        }
        if (this.f22036b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j8), interfaceC0414a);
        this.f22036b.put(str, cVar);
        this.f22037c.postDelayed(cVar, j8);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.f22036b.remove(str);
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (remove != null) {
            remove.f22041a.f22040c = true;
            this.f22037c.removeCallbacks(remove);
        }
    }
}

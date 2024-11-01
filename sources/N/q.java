package N;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import d0.HandlerC2742i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q extends HandlerC2742i {

    /* renamed from: b, reason: collision with root package name */
    private final Context f6383b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1344g f6384c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(N.C1344g r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f6384c = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f6383b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.q.<init>(N.g, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i8);
            return;
        }
        C1344g c1344g = this.f6384c;
        int g8 = c1344g.g(this.f6383b);
        if (c1344g.j(g8)) {
            this.f6384c.p(this.f6383b, g8);
        }
    }
}

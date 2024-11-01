package com.uptodown.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c5.Q;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3794s;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class DownloadUpdateNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1881097171) {
                if (hashCode != 75902422) {
                    if (hashCode == 1980572282 && str.equals("CANCEL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 262 && context != null) {
                        UptodownApp.a aVar = UptodownApp.f29249C;
                        aVar.g();
                        DownloadWorker.f31208c.k(true);
                        Iterator it = aVar.F().iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            Q q8 = (Q) next;
                            DownloadUpdatesWorker.f31198k.a(q8.s());
                            UptodownApp.f29249C.c0(q8.s(), context);
                            String l8 = q8.l();
                            if (l8 != null && l8.length() != 0) {
                                File g8 = new C3794s().g(context);
                                String l9 = q8.l();
                                AbstractC3292y.f(l9);
                                File file = new File(g8, l9);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                        C3800y.f37330a.c(context, intExtra);
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    DownloadWorker.f31208c.g();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                DownloadWorker.f31208c.i();
            }
        }
    }
}

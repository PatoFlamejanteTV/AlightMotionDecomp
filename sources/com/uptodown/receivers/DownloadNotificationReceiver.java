package com.uptodown.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c5.r;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;
import q5.C3794s;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class DownloadNotificationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31011a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        DownloadApkWorker.a aVar;
        r b9;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1881097171) {
                if (hashCode != 75902422) {
                    if (hashCode == 1980572282 && str.equals("CANCEL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 261 && (b9 = (aVar = DownloadApkWorker.f31190k).b()) != null) {
                        aVar.a(b9.h());
                        if (context != null) {
                            b9.n0(context);
                            if (new C3788m().k(context).isEmpty()) {
                                C3800y.f37330a.c(context, intExtra);
                            }
                            String X8 = b9.X();
                            if (X8 != null && X8.length() != 0) {
                                File f8 = new C3794s().f(context);
                                String X9 = b9.X();
                                AbstractC3292y.f(X9);
                                File file = new File(f8, X9);
                                if (file.exists()) {
                                    file.delete();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    DownloadWorker.f31208c.f();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                DownloadWorker.f31208c.h();
            }
        }
    }
}

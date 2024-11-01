package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import F.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import u.p;
import u.u;

/* loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i8 = intent.getExtras().getInt("attemptNumber");
        u.f(context);
        p.a d8 = p.a().b(queryParameter).d(a.b(intValue));
        if (queryParameter2 != null) {
            d8.c(Base64.decode(queryParameter2, 0));
        }
        u.c().e().v(d8.a(), i8, new Runnable() { // from class: B.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.b();
            }
        });
    }
}

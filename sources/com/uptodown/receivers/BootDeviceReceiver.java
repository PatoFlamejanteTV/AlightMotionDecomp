package com.uptodown.receivers;

import J4.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import l6.n;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class BootDeviceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null && n.s(intent.getAction(), "android.intent.action.BOOT_COMPLETED", true) && context != null) {
                    UptodownApp.f29249C.l0(context);
                    C3800y.f37330a.y(j.f4395g.a(context));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}

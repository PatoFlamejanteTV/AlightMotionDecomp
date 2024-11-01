package org.matomo.sdk.extra;

import M7.b;
import V7.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;
import org.matomo.sdk.extra.InstallReferrerReceiver;

/* loaded from: classes5.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36070a = b.i(InstallReferrerReceiver.class);

    /* renamed from: b, reason: collision with root package name */
    static final List f36071b = Collections.singletonList("com.android.vending.INSTALL_REFERRER");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context, String str, BroadcastReceiver.PendingResult pendingResult) {
        b.f(context.getApplicationContext()).g().edit().putString("referrer.extras", str).apply();
        a.b(f36070a).a("Stored Google Play referrer extras: %s", str);
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        final String stringExtra;
        String str = f36070a;
        a.b(str).a(intent.toString(), new Object[0]);
        if (intent.getAction() != null && f36071b.contains(intent.getAction())) {
            if (intent.getBooleanExtra("forwarded", false)) {
                a.b(str).a("Dropping forwarded intent", new Object[0]);
                return;
            }
            if (intent.getAction().equals("com.android.vending.INSTALL_REFERRER") && (stringExtra = intent.getStringExtra("referrer")) != null) {
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                new Thread(new Runnable() { // from class: O7.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        InstallReferrerReceiver.b(context, stringExtra, goAsync);
                    }
                }).start();
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            intent.putExtra("forwarded", true);
            context.sendBroadcast(intent);
            return;
        }
        a.b(str).h("Got called outside our responsibilities: %s", intent.getAction());
    }
}

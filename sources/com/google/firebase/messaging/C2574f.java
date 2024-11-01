package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.AbstractC2572d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.AbstractC3628n;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C2574f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f18660a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18661b;

    /* renamed from: c, reason: collision with root package name */
    private final J f18662c;

    public C2574f(Context context, J j8, ExecutorService executorService) {
        this.f18660a = executorService;
        this.f18661b = context;
        this.f18662c = j8;
    }

    private boolean b() {
        if (((KeyguardManager) this.f18661b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!V.k.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f18661b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void c(AbstractC2572d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f18661b.getSystemService("notification")).notify(aVar.f18648b, aVar.f18649c, aVar.f18647a.build());
    }

    private F d() {
        F h8 = F.h(this.f18662c.p("gcm.n.image"));
        if (h8 != null) {
            h8.k(this.f18660a);
        }
        return h8;
    }

    private void e(NotificationCompat.Builder builder, F f8) {
        if (f8 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC3628n.b(f8.i(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f8.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f8.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f18662c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F d8 = d();
        AbstractC2572d.a e8 = AbstractC2572d.e(this.f18661b, this.f18662c);
        e(e8.f18647a, d8);
        c(e8);
        return true;
    }
}

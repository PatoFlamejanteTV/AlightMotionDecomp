package q5;

import S4.x;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c5.C2032B;
import c5.C2036a;
import c5.C2043h;
import c5.Q;
import com.uptodown.R;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.receivers.DownloadNotificationReceiver;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* renamed from: q5.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3800y {

    /* renamed from: a, reason: collision with root package name */
    public static final C3800y f37330a = new C3800y();

    private C3800y() {
    }

    private final void A(NotificationCompat.Builder builder) {
        builder.setSmallIcon(R.drawable.vector_uptodown_logo_bag_transp);
    }

    private final void b(Context context, int i8) {
        StatusBarNotification[] activeNotifications;
        String str;
        if (Build.VERSION.SDK_INT >= 24 && i8 > 0) {
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            activeNotifications = notificationManager.getActiveNotifications();
            Iterator a9 = AbstractC3274f.a(activeNotifications);
            while (true) {
                if (a9.hasNext()) {
                    StatusBarNotification statusBarNotification = (StatusBarNotification) a9.next();
                    if (i8 == statusBarNotification.getId()) {
                        str = statusBarNotification.getGroupKey();
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (str != null) {
                Iterator a10 = AbstractC3274f.a(activeNotifications);
                while (a10.hasNext()) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) a10.next();
                    if (i8 != statusBarNotification2.getId() && AbstractC3292y.d(statusBarNotification2.getGroupKey(), str)) {
                        return;
                    }
                }
                notificationManager.cancel(i8);
            }
        }
    }

    private final Bitmap p(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                AbstractC3292y.h(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            AbstractC3292y.f(createBitmap);
        } else {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            AbstractC3292y.f(createBitmap);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private final int q(Context context) {
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        int i02 = a9.i0();
        a9.i();
        if (i02 == 0) {
            return 300;
        }
        return i02 + 1;
    }

    private final int r() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 201326592;
        }
        return 134217728;
    }

    private final void u(Q q8, Context context) {
        Drawable drawable;
        Object systemService = context.getSystemService("notification");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        q8.W(1);
        a9.p1(q8);
        a9.i();
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            PackageInfo d8 = S4.r.d(packageManager, q8.s(), 0);
            drawable = d8.applicationInfo.loadIcon(context.getPackageManager());
            try {
                str = d8.applicationInfo.loadLabel(context.getPackageManager()).toString();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            drawable = null;
        }
        if (str != null) {
            String string = context.getString(R.string.notification_update_available_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = context.getString(R.string.notification_update_available_message, str);
            AbstractC3292y.h(string2, "getString(...)");
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.setBigContentTitle(string);
            inboxStyle.addLine(string2);
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            AbstractC3292y.h(sb, "append(...)");
            sb.append('\n');
            AbstractC3292y.h(sb, "append(...)");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(true);
            if (drawable != null) {
                builder.setLargeIcon(p(drawable));
            }
            builder.setTimeoutAfter(3600000L);
            builder.setOngoing(false);
            builder.setContentText(string2);
            builder.setStyle(inboxStyle);
            Intent intent = new Intent(context, (Class<?>) Updates.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3292y.h(create, "create(...)");
            create.addParentStack(Updates.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            notificationManager.notify(258, builder.build());
            SettingsPreferences.f30529b.J0(context, String.valueOf(System.currentTimeMillis()));
            x(string, String.valueOf(System.currentTimeMillis()), sb.toString(), null, null, context);
        }
    }

    private final void w(Context context) {
        Object systemService = context.getSystemService("notification");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int a9 = Q.f15674l.a(context);
        if (a9 > 0) {
            String string = context.getResources().getString(R.string.app_name);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = context.getString(R.string.updates_availables_notification, String.valueOf(a9));
            AbstractC3292y.h(string2, "getString(...)");
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.setBigContentTitle(string);
            inboxStyle.addLine(string2);
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            AbstractC3292y.h(sb, "append(...)");
            sb.append('\n');
            AbstractC3292y.h(sb, "append(...)");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(false);
            builder.setOngoing(false);
            builder.setContentText(string2);
            builder.setStyle(inboxStyle);
            Intent intent = new Intent(context, (Class<?>) Updates.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3292y.h(create, "create(...)");
            create.addParentStack(Updates.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            builder.setNumber(a9);
            notificationManager.notify(258, builder.build());
            SettingsPreferences.f30529b.J0(context, String.valueOf(System.currentTimeMillis()));
            x(string, String.valueOf(System.currentTimeMillis()), sb.toString(), null, null, context);
            return;
        }
        notificationManager.cancel(258);
    }

    private final void x(String str, String str2, String str3, String str4, String str5, Context context) {
        C2032B c2032b = new C2032B();
        c2032b.m(str);
        c2032b.l(str2);
        c2032b.k(str3);
        c2032b.i(str4);
        c2032b.j(str5);
        c2032b.h(context);
    }

    private final void z(NotificationCompat.Builder builder, int i8) {
        builder.setOnlyAlertOnce(true);
        A(builder);
        builder.setAutoCancel(false);
        builder.setOngoing(true);
        builder.setProgress(100, i8, false);
    }

    public final boolean a(Context context) {
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 33) {
            if (s(context) && SettingsPreferences.f30529b.a0(context)) {
                return true;
            }
            return false;
        }
        return SettingsPreferences.f30529b.a0(context);
    }

    public final void c(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        Object systemService = context.getSystemService("notification");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i8);
    }

    public final void d(Context context) {
        AbstractC3292y.i(context, "context");
        c(context, 261);
    }

    public final void e(Context context) {
        AbstractC3292y.i(context, "context");
        c(context, 255);
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        c(context, 259);
    }

    public final void g(Context context) {
        AbstractC3292y.i(context, "context");
        c(context, 258);
    }

    public final void h(Context context) {
        StatusBarNotification[] activeNotifications;
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            Iterator it = a9.R().iterator();
            AbstractC3292y.h(it, "iterator(...)");
            boolean z8 = false;
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                C2036a c2036a = (C2036a) next;
                Iterator a10 = AbstractC3274f.a(activeNotifications);
                while (true) {
                    if (!a10.hasNext()) {
                        break;
                    }
                    if (c2036a.a() == ((StatusBarNotification) a10.next()).getId()) {
                        z8 = true;
                        break;
                    }
                }
                if (!z8) {
                    a9.k(c2036a);
                }
            }
            a9.i();
        }
    }

    public final void i(Context context) {
        String X8;
        Intent intent;
        CharSequence string;
        int i8;
        AbstractC3292y.i(context, "context");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
        c5.r b9 = DownloadApkWorker.f31190k.b();
        if (b9 != null) {
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            ArrayList c02 = a9.c0();
            a9.i();
            Iterator it = c02.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            int i9 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                c5.r rVar = (c5.r) next;
                if (rVar.Z() == 0 && !DownloadApkWorker.f31190k.c(rVar.h())) {
                    i9++;
                }
            }
            String i10 = b9.i();
            if (i10 != null && i10.length() != 0) {
                X8 = b9.i();
            } else {
                X8 = b9.X();
            }
            CharSequence charSequence = context.getResources().getString(R.string.notification_line_downloading) + ' ' + X8 + " (" + b9.Z() + context.getResources().getString(R.string.percent) + ')';
            String str = new S4.g().c((b9.a0() * b9.Z()) / 100) + '/' + new S4.g().c(b9.a0());
            z(builder, b9.Z());
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.addLine(str);
            if (i9 > 0) {
                Y y8 = Y.f34578a;
                String string2 = context.getString(R.string.x_downloads_in_queue);
                AbstractC3292y.h(string2, "getString(...)");
                String format = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1));
                AbstractC3292y.h(format, "format(...)");
                inboxStyle.addLine(format);
            }
            builder.setStyle(inboxStyle);
            builder.setContentTitle(charSequence);
            Intent intent2 = new Intent(context, (Class<?>) MyDownloads.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3292y.h(create, "create(...)");
            create.addParentStack(MyDownloads.class);
            create.addNextIntent(intent2);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            if (DownloadWorker.f31208c.c()) {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("RESUME");
                string = context.getString(R.string.updates_button_resume);
                i8 = R.drawable.vector_play_resume;
            } else {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("PAUSE");
                string = context.getString(R.string.action_pause);
                i8 = R.drawable.vector_pause;
            }
            builder.addAction(i8, string, PendingIntent.getBroadcast(context, 0, intent, r()));
            Intent intent3 = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
            intent3.setAction("CANCEL");
            intent3.putExtra("download", b9);
            intent3.putExtra("notificationID", 261);
            builder.addAction(R.drawable.core_vector_cross, context.getString(R.string.option_button_cancel), PendingIntent.getBroadcast(context, 0, intent3, r()));
        } else {
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(false);
            builder.setOngoing(true);
            CharSequence string3 = context.getString(R.string.preparing_update_download);
            AbstractC3292y.h(string3, "getString(...)");
            builder.setContentTitle(string3);
        }
        Object systemService = context.getSystemService("notification");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(261, builder.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.content.Context r12, c5.r r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3800y.j(android.content.Context, c5.r):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3800y.k(android.content.Context, java.lang.String):void");
    }

    public final void l(Context context, String contentText) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(contentText, "contentText");
        if (a(context) && SettingsPreferences.f30529b.Y(context)) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            String string = context.getString(R.string.installing);
            AbstractC3292y.h(string, "getString(...)");
            builder.setContentTitle(string);
            builder.setContentText(contentText);
            builder.setProgress(100, 0, true);
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(255, builder.build());
            x(string, String.valueOf(System.currentTimeMillis()), contentText, null, null, context);
        }
    }

    public final void m(Context context, File file, boolean z8, int i8) {
        boolean z9;
        String str;
        Drawable d8;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(file, "file");
        if (a(context) && new L4.a(context).p()) {
            int i9 = i8 + 260;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            intent.setDataAndType(new C3788m().t(file, context), "application/vnd.android.package-archive");
            intent.putExtra("notificationId", i9);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            if (l6.n.r(name, ".apk", false, 2, null)) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3292y.h(packageManager, "getPackageManager(...)");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                    PackageInfo c8 = S4.r.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        Drawable loadIcon = c8.applicationInfo.loadIcon(context.getPackageManager());
                        AbstractC3292y.h(loadIcon, "loadIcon(...)");
                        builder.setLargeIcon(p(loadIcon));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                x.a aVar = S4.x.f9510b;
                String name2 = file.getName();
                AbstractC3292y.h(name2, "getName(...)");
                if (aVar.a(name2) && (d8 = new S4.x().d(file, context)) != null) {
                    builder.setLargeIcon(p(d8));
                }
            }
            String name3 = file.getName();
            builder.setContentTitle(name3);
            if (z8) {
                Y y8 = Y.f34578a;
                String string = context.getString(R.string.notification_installable_found);
                AbstractC3292y.h(string, "getString(...)");
                String absolutePath2 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath2, "getAbsolutePath(...)");
                String absolutePath3 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath3, "getAbsolutePath(...)");
                String substring = absolutePath2.substring(0, l6.n.X(absolutePath3, "/", 0, false, 6, null));
                AbstractC3292y.h(substring, "substring(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{substring}, 1));
                AbstractC3292y.h(format, "format(...)");
                str = format;
                z9 = true;
            } else {
                Y y9 = Y.f34578a;
                String string2 = context.getString(R.string.notification_installable_to_delete);
                AbstractC3292y.h(string2, "getString(...)");
                String absolutePath4 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath4, "getAbsolutePath(...)");
                String absolutePath5 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath5, "getAbsolutePath(...)");
                String substring2 = absolutePath4.substring(0, l6.n.X(absolutePath5, "/", 0, false, 6, null));
                AbstractC3292y.h(substring2, "substring(...)");
                z9 = true;
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{substring2}, 1));
                AbstractC3292y.h(format2, "format(...)");
                str = format2;
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str));
            builder.setContentText(str);
            builder.setAutoCancel(z9);
            builder.setGroup("com.uptodown.INSTALLABLE_FOUND");
            Intent intent2 = new Intent(context, (Class<?>) InstallerActivity.class);
            intent2.putExtra("realPath", file.getAbsolutePath());
            intent2.putExtra("action", "delete");
            intent2.putExtra("notificationId", i9);
            PendingIntent activity2 = PendingIntent.getActivity(context, i9, intent2, r());
            StringBuilder sb = new StringBuilder();
            if (z8) {
                builder.addAction(R.drawable.vector_user_panel_my_apps, context.getString(R.string.option_button_install), activity);
                builder.setContentIntent(activity);
                sb.append("install");
                sb.append(";");
            }
            builder.addAction(R.drawable.core_vector_cross, context.getString(R.string.option_button_delete), activity2);
            sb.append("delete");
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 24) {
                NotificationCompat.Builder groupSummary = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN").setContentTitle(str).setSmallIcon(R.drawable.vector_uptodown_logo_bag_transp).setGroup("com.uptodown.INSTALLABLE_FOUND").setAutoCancel(true).setGroupSummary(true);
                AbstractC3292y.h(groupSummary, "setGroupSummary(...)");
                notificationManager.notify(5, groupSummary.build());
            }
            notificationManager.notify(i9, builder.build());
            x(name3, String.valueOf(System.currentTimeMillis()), str, sb.toString(), file.getAbsolutePath(), context);
        }
    }

    public final void n(Context context, int i8, String str) {
        int i9;
        String format;
        AbstractC3292y.i(context, "context");
        try {
            if (a(context)) {
                Intent intent = new Intent(context, (Class<?>) SecurityActivity.class);
                intent.setPackage(context.getPackageName());
                if (Build.VERSION.SDK_INT >= 31) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 0;
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i9);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                A(builder);
                builder.setContentIntent(activity);
                if (i8 > 0) {
                    if (i8 == 1 && str != null && str.length() != 0) {
                        Y y8 = Y.f34578a;
                        String string = context.getString(R.string.notification_app_positives_found);
                        AbstractC3292y.h(string, "getString(...)");
                        format = String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.app_name), str}, 2));
                        AbstractC3292y.h(format, "format(...)");
                        String str2 = format;
                        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str2));
                        builder.setContentText(str2);
                        builder.setAutoCancel(true);
                        Object systemService = context.getSystemService("notification");
                        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).notify(256, builder.build());
                        x(null, String.valueOf(System.currentTimeMillis()), str2, "positive_apps", null, context);
                    }
                    Y y9 = Y.f34578a;
                    String string2 = context.getString(R.string.notification_apps_positives_found);
                    AbstractC3292y.h(string2, "getString(...)");
                    format = String.format(string2, Arrays.copyOf(new Object[]{context.getString(R.string.app_name), String.valueOf(i8)}, 2));
                    AbstractC3292y.h(format, "format(...)");
                    String str22 = format;
                    builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str22));
                    builder.setContentText(str22);
                    builder.setAutoCancel(true);
                    Object systemService2 = context.getSystemService("notification");
                    AbstractC3292y.g(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService2).notify(256, builder.build());
                    x(null, String.valueOf(System.currentTimeMillis()), str22, "positive_apps", null, context);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(Context context, C2043h appInfo, int i8, Bitmap bitmap, c5.G preRegister) {
        int i9;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(preRegister, "preRegister");
        if (a(context)) {
            int i10 = i8 + 500;
            Intent intent = new Intent(context, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            if (Build.VERSION.SDK_INT >= 31) {
                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i9 = 0;
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i9);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            builder.setContentIntent(activity);
            Y y8 = Y.f34578a;
            String string = context.getString(R.string.notification_upcoming_releases);
            AbstractC3292y.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{appInfo.q0(), context.getString(R.string.app_name)}, 2));
            AbstractC3292y.h(format, "format(...)");
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
            builder.setContentIntent(activity);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(format));
            builder.setContentText(format);
            builder.setAutoCancel(true);
            builder.setGroup("com.uptodown.PREREGISTER");
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(i10, builder.build());
            x(null, String.valueOf(System.currentTimeMillis()), format, "preregister", String.valueOf(appInfo.h()), context);
            Bundle bundle = new Bundle();
            bundle.putString("type", "notification_shown");
            new C3795t(context).e("preregister", bundle);
        } else {
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            if (a9.n0(preRegister.b()) == null) {
                a9.K0(preRegister);
            }
            a9.i();
        }
        preRegister.i(context);
    }

    public final boolean s(Context context) {
        AbstractC3292y.i(context, "context");
        if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    public final void t(Context context, c5.r rVar, String str) {
        String str2;
        String str3;
        String str4;
        String string;
        AbstractC3292y.i(context, "context");
        if (a(context) && SettingsPreferences.f30529b.S(context)) {
            String str5 = null;
            if (rVar != null) {
                str2 = rVar.i();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                AbstractC3292y.f(rVar);
                str5 = rVar.i();
                AbstractC3292y.f(str5);
            } else {
                if (rVar != null) {
                    str3 = rVar.X();
                } else {
                    str3 = null;
                }
                if (str3 != null && str3.length() != 0) {
                    AbstractC3292y.f(rVar);
                    str5 = rVar.X();
                    AbstractC3292y.f(str5);
                } else {
                    if (rVar != null) {
                        str4 = rVar.Y();
                    } else {
                        str4 = null;
                    }
                    if (str4 != null && str4.length() != 0) {
                        AbstractC3292y.f(rVar);
                        str5 = rVar.Y();
                        AbstractC3292y.f(str5);
                    }
                }
            }
            String str6 = str5;
            if (str != null && str.length() != 0) {
                string = context.getString(R.string.descarga_error) + str;
            } else {
                string = context.getString(R.string.descarga_error);
            }
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            if (str6 != null && str6.length() != 0) {
                builder.setContentTitle(str6);
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string));
            builder.setContentText(string);
            builder.setAutoCancel(true);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3292y.h(create, "create(...)");
            create.addParentStack(MainActivity.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            Intent intent2 = new Intent(context, (Class<?>) MyDownloads.class);
            TaskStackBuilder create2 = TaskStackBuilder.create(context);
            AbstractC3292y.h(create2, "create(...)");
            create2.addParentStack(MyDownloads.class);
            create2.addNextIntent(intent2);
            builder.setContentIntent(create2.getPendingIntent(0, r()));
            notificationManager.notify(257, builder.build());
            x(str6, String.valueOf(System.currentTimeMillis()), str, null, null, context);
        }
    }

    public final void v(Context context, Uri uri) {
        AbstractC3292y.i(context, "context");
        if (uri != null) {
            String string = context.getString(R.string.app_name);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = context.getString(R.string.notification_msg_update_uptodown);
            AbstractC3292y.h(string2, "getString(...)");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, r());
            Object systemService = context.getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            builder.setContentTitle(string);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string2));
            builder.setContentText(string2);
            builder.setAutoCancel(true);
            builder.setContentIntent(activity);
            ((NotificationManager) systemService).notify(259, builder.build());
            x(string, String.valueOf(System.currentTimeMillis()), string2, "update_uptodown", uri.getPath(), context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3800y.y(android.content.Context):void");
    }
}

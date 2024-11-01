package N;

import Q.AbstractC1396p;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import d0.AbstractC2740g;
import d0.AbstractC2741h;

/* renamed from: N.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1344g extends C1345h {

    /* renamed from: c, reason: collision with root package name */
    private String f6364c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f6362e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C1344g f6363f = new C1344g();

    /* renamed from: d, reason: collision with root package name */
    public static final int f6361d = C1345h.f6365a;

    public static C1344g n() {
        return f6363f;
    }

    @Override // N.C1345h
    public Intent b(Context context, int i8, String str) {
        return super.b(context, i8, str);
    }

    @Override // N.C1345h
    public PendingIntent c(Context context, int i8, int i9) {
        return super.c(context, i8, i9);
    }

    @Override // N.C1345h
    public final String e(int i8) {
        return super.e(i8);
    }

    @Override // N.C1345h
    public int g(Context context) {
        return super.g(context);
    }

    @Override // N.C1345h
    public int h(Context context, int i8) {
        return super.h(context, i8);
    }

    @Override // N.C1345h
    public final boolean j(int i8) {
        return super.j(i8);
    }

    public Dialog l(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i8, Q.D.b(activity, b(activity, i8, "d"), i9), onCancelListener, null);
    }

    public PendingIntent m(Context context, C1339b c1339b) {
        if (c1339b.y()) {
            return c1339b.v();
        }
        return c(context, c1339b.s(), 0);
    }

    public boolean o(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l8 = l(activity, i8, i9, onCancelListener);
        if (l8 == null) {
            return false;
        }
        t(activity, l8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i8) {
        u(context, i8, null, d(context, i8, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog q(Context context, int i8, Q.D d8, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(Q.A.c(context, i8));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b9 = Q.A.b(context, i8);
        if (b9 != null) {
            if (d8 == null) {
                d8 = onClickListener;
            }
            builder.setPositiveButton(b9, d8);
        }
        String f8 = Q.A.f(context, i8);
        if (f8 != null) {
            builder.setTitle(f8);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i8)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(Q.A.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final P.s s(Context context, P.r rVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        P.s sVar = new P.s(rVar);
        AbstractC2740g.a(context, sVar, intentFilter);
        sVar.a(context);
        if (!i(context, "com.google.android.gms")) {
            rVar.a();
            sVar.b();
            return null;
        }
        return sVar;
    }

    final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C1352o.h(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1340c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void u(Context context, int i8, String str, PendingIntent pendingIntent) {
        int i9;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i8), null), new IllegalArgumentException());
        if (i8 == 18) {
            v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i8 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e8 = Q.A.e(context, i8);
        String d8 = Q.A.d(context, i8);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC1396p.l(context.getSystemService("notification"));
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(e8).setStyle(new NotificationCompat.BigTextStyle().bigText(d8));
        if (V.h.c(context)) {
            AbstractC1396p.o(V.k.e());
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (V.h.d(context)) {
                style.addAction(L.a.f5205a, resources.getString(L.b.f5220o), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(L.b.f5213h)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(d8);
        }
        if (V.k.h()) {
            AbstractC1396p.o(V.k.h());
            synchronized (f6362e) {
                str2 = this.f6364c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(L.b.f5212g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(androidx.browser.trusted.h.a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            style.setChannelId(str2);
        }
        Notification build = style.build();
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            i9 = 39789;
        } else {
            AbstractC1349l.f6371b.set(false);
            i9 = 10436;
        }
        notificationManager.notify(i9, build);
    }

    final void v(Context context) {
        new q(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean w(Activity activity, P.e eVar, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog q8 = q(activity, i8, Q.D.c(eVar, b(activity, i8, "d"), 2), onCancelListener, null);
        if (q8 == null) {
            return false;
        }
        t(activity, q8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, C1339b c1339b, int i8) {
        PendingIntent m8;
        if (X.b.a(context) || (m8 = m(context, c1339b)) == null) {
            return false;
        }
        u(context, c1339b.s(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, m8, i8, true), AbstractC2741h.f31284a | 134217728));
        return true;
    }
}

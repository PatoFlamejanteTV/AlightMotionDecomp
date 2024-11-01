package N;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import f0.AbstractC2839d;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1345h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6365a = AbstractC1349l.f6370a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1345h f6366b = new C1345h();

    public static C1345h f() {
        return f6366b;
    }

    public int a(Context context) {
        return AbstractC1349l.b(context);
    }

    public Intent b(Context context, int i8, String str) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && V.h.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f6365a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(X.e.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i8, int i9) {
        return d(context, i8, i9, null);
    }

    public PendingIntent d(Context context, int i8, int i9, String str) {
        Intent b9 = b(context, i8, str);
        if (b9 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i9, b9, AbstractC2839d.f31816a | 134217728);
    }

    public String e(int i8) {
        return AbstractC1349l.c(i8);
    }

    public int g(Context context) {
        return h(context, f6365a);
    }

    public int h(Context context, int i8) {
        int g8 = AbstractC1349l.g(context, i8);
        if (AbstractC1349l.h(context, g8)) {
            return 18;
        }
        return g8;
    }

    public boolean i(Context context, String str) {
        return AbstractC1349l.l(context, str);
    }

    public boolean j(int i8) {
        return AbstractC1349l.j(i8);
    }

    public void k(Context context, int i8) {
        AbstractC1349l.a(context, i8);
    }
}

package J4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.uptodown.core.activities.InstallerActivity;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a */
    private final Context f4394a;

    public i(Context context) {
        AbstractC3292y.i(context, "context");
        this.f4394a = context;
    }

    public static /* synthetic */ void e(i iVar, Uri uri, String str, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        iVar.b(uri, str, z8, z9);
    }

    public static /* synthetic */ void f(i iVar, File file, String str, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        iVar.c(file, str, z8);
    }

    public static /* synthetic */ void g(i iVar, String str, String str2, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        iVar.d(str, str2, z8, z9);
    }

    public final void a(File file, String str, boolean z8) {
        AbstractC3292y.i(file, "file");
        String absolutePath = file.getAbsolutePath();
        AbstractC3292y.h(absolutePath, "file.absolutePath");
        d(absolutePath, str, z8, true);
    }

    public final void b(Uri uri, String str, boolean z8, boolean z9) {
        AbstractC3292y.i(uri, "uri");
        Intent intent = new Intent(this.f4394a, (Class<?>) InstallerActivity.class);
        intent.setData(uri);
        intent.putExtra("requireUserAction", z8);
        intent.putExtra("backgroundInstallation", z9);
        intent.addFlags(268435456);
        if (str != null && str.length() != 0) {
            intent.putExtra("newFeatures", str);
        }
        this.f4394a.startActivity(intent);
    }

    public final void c(File file, String str, boolean z8) {
        AbstractC3292y.i(file, "file");
        String absolutePath = file.getAbsolutePath();
        AbstractC3292y.h(absolutePath, "file.absolutePath");
        g(this, absolutePath, str, z8, false, 8, null);
    }

    public final void d(String path, String str, boolean z8, boolean z9) {
        AbstractC3292y.i(path, "path");
        Intent intent = new Intent(this.f4394a, (Class<?>) InstallerActivity.class);
        intent.putExtra("realPath", path);
        intent.putExtra("requireUserAction", z8);
        intent.putExtra("backgroundInstallation", z9);
        intent.addFlags(268435456);
        if (str != null && str.length() != 0) {
            intent.putExtra("newFeatures", str);
        }
        this.f4394a.startActivity(intent);
    }

    public final void h(String packageName) {
        int i8;
        AbstractC3292y.i(packageName, "packageName");
        Intent intent = new Intent("android.intent.action.DELETE", Uri.fromParts("package", packageName, null));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 && i9 < 34) {
            i8 = 167772160;
        } else {
            i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        PendingIntent activity = PendingIntent.getActivity(this.f4394a, 0, intent, i8);
        PackageInstaller packageInstaller = this.f4394a.getPackageManager().getPackageInstaller();
        AbstractC3292y.h(packageInstaller, "context.packageManager.packageInstaller");
        packageInstaller.uninstall(packageName, activity.getIntentSender());
    }
}

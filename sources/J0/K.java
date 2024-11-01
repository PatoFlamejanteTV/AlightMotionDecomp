package J0;

import android.content.Context;

/* loaded from: classes3.dex */
class K {

    /* renamed from: a, reason: collision with root package name */
    private String f3870a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        try {
            if (this.f3870a == null) {
                this.f3870a = b(context);
            }
            if ("".equals(this.f3870a)) {
                str = null;
            } else {
                str = this.f3870a;
            }
        } finally {
        }
        return str;
    }
}

package androidx.leanback.app;

import android.app.Fragment;
import android.os.Build;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class PermissionHelper {
    private PermissionHelper() {
    }

    public static void requestPermissions(Fragment fragment, String[] strArr, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            fragment.requestPermissions(strArr, i8);
        }
    }
}

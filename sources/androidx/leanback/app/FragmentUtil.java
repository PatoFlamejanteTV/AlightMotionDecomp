package androidx.leanback.app;

import android.app.Fragment;
import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
class FragmentUtil {
    private FragmentUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context getContext(Fragment fragment) {
        Context context;
        if (Build.VERSION.SDK_INT >= 23) {
            context = fragment.getContext();
            return context;
        }
        return fragment.getActivity();
    }
}

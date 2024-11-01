package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes3.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void setTransitionVisibility(View view, int i8) {
            view.setTransitionVisibility(i8);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void setTransitionVisibility(@NonNull View view, int i8) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i8);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i8);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}

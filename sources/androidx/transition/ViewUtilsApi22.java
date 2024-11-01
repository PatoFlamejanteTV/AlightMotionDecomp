package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
/* loaded from: classes3.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void setLeftTopRightBottom(View view, int i8, int i9, int i10, int i11) {
            view.setLeftTopRightBottom(i8, i9, i10, i11);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void setLeftTopRightBottom(@NonNull View view, int i8, int i9, int i10, int i11) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                Api29Impl.setLeftTopRightBottom(view, i8, i9, i10, i11);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}

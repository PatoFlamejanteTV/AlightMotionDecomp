package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class DialogCompat {

    @RequiresApi(28)
    /* loaded from: classes.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static <T> T requireViewById(Dialog dialog, int i8) {
            return (T) dialog.requireViewById(i8);
        }
    }

    private DialogCompat() {
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(dialog, i8);
        }
        View findViewById = dialog.findViewById(i8);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}

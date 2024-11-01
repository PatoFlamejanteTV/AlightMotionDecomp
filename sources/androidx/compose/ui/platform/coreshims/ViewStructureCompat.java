package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    @RequiresApi(23)
    /* loaded from: classes.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        static void setDimens(ViewStructure viewStructure, int i8, int i9, int i10, int i11, int i12, int i13) {
            viewStructure.setDimens(i8, i9, i10, i11, i12, i13);
        }

        @DoNotInline
        static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @DoNotInline
        static void setTextStyle(ViewStructure viewStructure, float f8, int i8, int i9, int i10) {
            viewStructure.setTextStyle(f8, i8, i9, i10);
        }
    }

    private ViewStructureCompat(@NonNull ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setClassName(c.a(this.mWrappedObj), str);
        }
    }

    public void setContentDescription(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setContentDescription(c.a(this.mWrappedObj), charSequence);
        }
    }

    public void setDimens(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setDimens(c.a(this.mWrappedObj), i8, i9, i10, i11, i12, i13);
        }
    }

    public void setText(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setText(c.a(this.mWrappedObj), charSequence);
        }
    }

    public void setTextStyle(float f8, int i8, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setTextStyle(c.a(this.mWrappedObj), f8, i8, i9, i10);
        }
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return c.a(this.mWrappedObj);
    }
}
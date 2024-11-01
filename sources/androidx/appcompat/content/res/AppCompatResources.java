package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public final class AppCompatResources {
    private AppCompatResources() {
    }

    public static ColorStateList getColorStateList(@NonNull Context context, @ColorRes int i8) {
        return ContextCompat.getColorStateList(context, i8);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int i8) {
        return ResourceManagerInternal.get().getDrawable(context, i8);
    }
}

package s0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public abstract class g {
    public static Drawable a(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i8});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            return new GradientDrawable();
        }
        return drawable;
    }
}

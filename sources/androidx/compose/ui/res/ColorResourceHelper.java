package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;

@RequiresApi(23)
/* loaded from: classes.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    @DoNotInline
    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m4483getColorWaAFU9c(Context context, @ColorRes int i8) {
        int color;
        color = context.getResources().getColor(i8, context.getTheme());
        return ColorKt.Color(color);
    }
}

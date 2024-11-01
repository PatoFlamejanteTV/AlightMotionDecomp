package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(23)
/* loaded from: classes.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    @DoNotInline
    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m1481getColorWaAFU9c(Context context, @ColorRes int i8) {
        int color;
        AbstractC3292y.i(context, "context");
        color = context.getResources().getColor(i8, context.getTheme());
        return ColorKt.Color(color);
    }
}

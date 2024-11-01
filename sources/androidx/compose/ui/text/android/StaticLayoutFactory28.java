package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes.dex */
final class StaticLayoutFactory28 {
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    @DoNotInline
    public static final void setUseLineSpacingFromFallbacks(StaticLayout.Builder builder, boolean z8) {
        builder.setUseLineSpacingFromFallbacks(z8);
    }
}

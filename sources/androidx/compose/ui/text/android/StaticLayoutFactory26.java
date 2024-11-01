package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class StaticLayoutFactory26 {
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    @DoNotInline
    public static final void setJustificationMode(StaticLayout.Builder builder, int i8) {
        builder.setJustificationMode(i8);
    }
}

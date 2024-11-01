package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @DoNotInline
    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @DoNotInline
    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = x.a().setLineBreakStyle(i8);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i9);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}

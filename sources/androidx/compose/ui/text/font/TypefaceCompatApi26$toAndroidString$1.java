package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TypefaceCompatApi26$toAndroidString$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(FontVariation.Setting setting) {
        return '\'' + setting.getAxisName() + "' " + setting.toVariationValue(this.$density);
    }
}

package androidx.compose.material3;

import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextKt$LocalTextStyle$1 extends AbstractC3293z implements Function0 {
    public static final TextKt$LocalTextStyle$1 INSTANCE = new TextKt$LocalTextStyle$1();

    TextKt$LocalTextStyle$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextStyle invoke() {
        return TextStyle.Companion.getDefault();
    }
}

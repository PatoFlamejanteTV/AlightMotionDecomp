package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Orientation $orientation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.$orientation = orientation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(this.$orientation, 0.0f, 2, null);
    }
}

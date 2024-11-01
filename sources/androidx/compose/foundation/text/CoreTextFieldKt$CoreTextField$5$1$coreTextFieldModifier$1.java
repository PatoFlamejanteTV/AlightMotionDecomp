package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(TextFieldState textFieldState) {
        super(0);
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextLayoutResultProxy invoke() {
        return this.$state.getLayoutResult();
    }
}

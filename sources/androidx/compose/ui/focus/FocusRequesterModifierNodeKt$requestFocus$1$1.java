package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt$requestFocus$1$1 extends AbstractC3293z implements Function1 {
    public static final FocusRequesterModifierNodeKt$requestFocus$1$1 INSTANCE = new FocusRequesterModifierNodeKt$requestFocus$1$1();

    FocusRequesterModifierNodeKt$requestFocus$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetNode));
    }
}

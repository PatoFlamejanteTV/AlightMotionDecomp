package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusRequester$focus$1$1 extends AbstractC3293z implements Function1 {
    public static final FocusRequester$focus$1$1 INSTANCE = new FocusRequester$focus$1$1();

    FocusRequester$focus$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetNode));
    }
}

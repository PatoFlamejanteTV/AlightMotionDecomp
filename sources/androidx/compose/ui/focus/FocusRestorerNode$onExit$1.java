package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FocusRestorerNode$onExit$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FocusRestorerNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerNode$onExit$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.this$0 = focusRestorerNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m2655invoke3ESFkO8(((FocusDirection) obj).m2632unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m2655invoke3ESFkO8(int i8) {
        FocusRequesterModifierNodeKt.saveFocusedChild(this.this$0);
        return FocusRequester.Companion.getDefault();
    }
}

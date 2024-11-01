package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z8, long j8) {
        super(1);
        this.$isStartHandle = z8;
        this.$position = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        Handle handle;
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertyKey<SelectionHandleInfo> selectionHandleInfoKey = SelectionHandlesKt.getSelectionHandleInfoKey();
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        semantics.set(selectionHandleInfoKey, new SelectionHandleInfo(handle, this.$position, null));
    }
}

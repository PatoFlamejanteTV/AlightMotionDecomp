package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.$selectionRegistrar = selectionRegistrar;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SaverScope) obj, ((Number) obj2).longValue());
    }

    public final Long invoke(SaverScope Saver, long j8) {
        AbstractC3292y.i(Saver, "$this$Saver");
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, j8)) {
            return Long.valueOf(j8);
        }
        return null;
    }
}

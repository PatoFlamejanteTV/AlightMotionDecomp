package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SelectionController$onRemembered$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SelectionController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionController$onRemembered$1(SelectionController selectionController) {
        super(0);
        this.this$0 = selectionController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutCoordinates invoke() {
        StaticTextSelectionParams staticTextSelectionParams;
        staticTextSelectionParams = this.this$0.params;
        return staticTextSelectionParams.getLayoutCoordinates();
    }
}

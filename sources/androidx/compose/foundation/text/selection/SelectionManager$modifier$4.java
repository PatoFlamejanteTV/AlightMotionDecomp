package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionManager$modifier$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m1038invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m1038invokeZmokQxo(android.view.KeyEvent it) {
        boolean z8;
        AbstractC3292y.i(it, "it");
        if (SelectionManager_androidKt.m1043isCopyKeyEventZmokQxo(it)) {
            this.this$0.copy$foundation_release();
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}

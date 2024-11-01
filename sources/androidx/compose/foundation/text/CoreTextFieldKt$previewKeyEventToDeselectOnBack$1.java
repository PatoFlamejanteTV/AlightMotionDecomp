package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m853invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m853invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean z8;
        AbstractC3292y.i(keyEvent, "keyEvent");
        if (this.$state.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m855cancelsTextSelectionZmokQxo(keyEvent)) {
            z8 = true;
            TextFieldSelectionManager.m1055deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}

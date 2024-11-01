package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, FocusRequester focusRequester, boolean z8, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = focusRequester;
        this.$readOnly = z8;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m852invokek4lQ0M(((Offset) obj).m2722unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m852invokek4lQ0M(long j8) {
        CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
        if (this.$state.getHasFocus()) {
            if (this.$state.getHandleState() != HandleState.Selection) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion.m910setCursorOffsetULxng0E$foundation_release(j8, layoutResult, textFieldState.getProcessor(), this.$offsetMapping, textFieldState.getOnValueChange());
                    if (textFieldState.getTextDelegate().getText().length() > 0) {
                        textFieldState.setHandleState(HandleState.Cursor);
                        return;
                    }
                    return;
                }
                return;
            }
            this.$manager.m1058deselect_kEHs6E$foundation_release(Offset.m2701boximpl(j8));
        }
    }
}

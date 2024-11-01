package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, TextInputService textInputService, boolean z8, boolean z9, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, M m8, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = textInputService;
        this.$enabled = z8;
        this.$readOnly = z9;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = m8;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusState) obj);
        return I.f8786a;
    }

    public final void invoke(FocusState it) {
        TextLayoutResultProxy layoutResult;
        AbstractC3292y.i(it, "it");
        if (this.$state.getHasFocus() == it.isFocused()) {
            return;
        }
        this.$state.setHasFocus(it.isFocused());
        if (this.$textInputService != null) {
            if (!this.$state.getHasFocus() || !this.$enabled || this.$readOnly) {
                CoreTextFieldKt.endInputSession(this.$state);
            } else {
                CoreTextFieldKt.startInputSession(this.$textInputService, this.$state, this.$value, this.$imeOptions, this.$offsetMapping);
            }
            if (it.isFocused() && (layoutResult = this.$state.getLayoutResult()) != null) {
                AbstractC3462k.d(this.$coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, layoutResult, this.$offsetMapping, null), 3, null);
            }
        }
        if (it.isFocused()) {
            return;
        }
        TextFieldSelectionManager.m1055deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
    }
}

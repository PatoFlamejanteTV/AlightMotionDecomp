package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt$textFieldKeyInput$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ boolean $editable;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ UndoManager $undoManager;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends C3289v implements Function1 {
        AnonymousClass1(Object obj) {
            super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m918invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
        }

        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m918invokeZmokQxo(android.view.KeyEvent p02) {
            AbstractC3292y.i(p02, "p0");
            return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m915processZmokQxo(p02));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z8, boolean z9, OffsetMapping offsetMapping, UndoManager undoManager, Function1 function1, int i8) {
        super(3);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$editable = z8;
        this.$singleLine = z9;
        this.$offsetMapping = offsetMapping;
        this.$undoManager = undoManager;
        this.$onValueChange = function1;
        this.$imeAction = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(2057323757);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2057323757, i8, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:244)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TextPreparedSelectionState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DeadKeyCombiner();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AnonymousClass1(new TextFieldKeyInput(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, textPreparedSelectionState, this.$offsetMapping, this.$undoManager, (DeadKeyCombiner) rememberedValue2, null, this.$onValueChange, this.$imeAction, 512, null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onKeyEvent;
    }
}

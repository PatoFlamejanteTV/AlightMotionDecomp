package androidx.compose.foundation.text;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import c6.InterfaceC2073o;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ boolean $isPassword;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TransformedText $transformedText;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldState textFieldState) {
            super(1);
            this.$state = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<TextLayoutResult> it) {
            boolean z8;
            AbstractC3292y.i(it, "it");
            if (this.$state.getLayoutResult() != null) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                AbstractC3292y.f(layoutResult);
                it.add(layoutResult.getValue());
                z8 = true;
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends AbstractC3293z implements Function0 {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.paste$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z8, boolean z9, TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            super(1);
            this.$readOnly = z8;
            this.$enabled = z9;
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AnnotatedString text) {
            I i8;
            AbstractC3292y.i(text, "text");
            if (!this.$readOnly && this.$enabled) {
                TextInputSession inputSession = this.$state.getInputSession();
                if (inputSession != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(AbstractC1435t.p(new DeleteAllCommand(), new CommitTextCommand(text, 1)), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                    i8 = I.f8786a;
                } else {
                    i8 = null;
                }
                if (i8 == null) {
                    this.$state.getOnValueChange().invoke(new TextFieldValue(text.getText(), TextRangeKt.TextRange(text.getText().length()), (TextRange) null, 4, (AbstractC3284p) null));
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function1 {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(boolean z8, boolean z9, TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver, TextFieldValue textFieldValue) {
            super(1);
            this.$readOnly = z8;
            this.$enabled = z9;
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
            this.$value = textFieldValue;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AnnotatedString text) {
            I i8;
            AbstractC3292y.i(text, "text");
            if (!this.$readOnly && this.$enabled) {
                TextInputSession inputSession = this.$state.getInputSession();
                if (inputSession != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(AbstractC1435t.p(new FinishComposingTextCommand(), new CommitTextCommand(text, 1)), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                    i8 = I.f8786a;
                } else {
                    i8 = null;
                }
                if (i8 == null) {
                    TextFieldValue textFieldValue = this.$value;
                    this.$state.getOnValueChange().invoke(new TextFieldValue(n.m0(textFieldValue.getText(), TextRange.m4669getStartimpl(textFieldValue.m4906getSelectiond9O1mEE()), TextRange.m4664getEndimpl(textFieldValue.m4906getSelectiond9O1mEE()), text).toString(), TextRangeKt.TextRange(TextRange.m4669getStartimpl(textFieldValue.m4906getSelectiond9O1mEE()) + text.length()), (TextRange) null, 4, (AbstractC3284p) null));
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(OffsetMapping offsetMapping, boolean z8, TextFieldValue textFieldValue, TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState) {
            super(3);
            this.$offsetMapping = offsetMapping;
            this.$enabled = z8;
            this.$value = textFieldValue;
            this.$manager = textFieldSelectionManager;
            this.$state = textFieldState;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        }

        public final Boolean invoke(int i8, int i9, boolean z8) {
            if (!z8) {
                i8 = this.$offsetMapping.transformedToOriginal(i8);
            }
            if (!z8) {
                i9 = this.$offsetMapping.transformedToOriginal(i9);
            }
            boolean z9 = false;
            if (this.$enabled && (i8 != TextRange.m4669getStartimpl(this.$value.m4906getSelectiond9O1mEE()) || i9 != TextRange.m4664getEndimpl(this.$value.m4906getSelectiond9O1mEE()))) {
                if (m.g(i8, i9) >= 0 && m.d(i8, i9) <= this.$value.getAnnotatedString().length()) {
                    if (!z8 && i8 != i9) {
                        this.$manager.enterSelectionMode$foundation_release();
                    } else {
                        this.$manager.exitSelectionMode$foundation_release();
                    }
                    this.$state.getOnValueChange().invoke(new TextFieldValue(this.$value.getAnnotatedString(), TextRangeKt.TextRange(i8, i9), (TextRange) null, 4, (AbstractC3284p) null));
                    z9 = true;
                } else {
                    this.$manager.exitSelectionMode$foundation_release();
                }
            }
            return Boolean.valueOf(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends AbstractC3293z implements Function0 {
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(TextFieldState textFieldState, ImeOptions imeOptions) {
            super(0);
            this.$state = textFieldState;
            this.$imeOptions = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$state.getOnImeActionPerformed().invoke(ImeAction.m4829boximpl(this.$imeOptions.m4857getImeActioneUduSuo()));
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends AbstractC3293z implements Function0 {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(TextFieldState textFieldState, FocusRequester focusRequester, boolean z8) {
            super(0);
            this.$state = textFieldState;
            this.$focusRequester = focusRequester;
            this.$readOnly = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends AbstractC3293z implements Function0 {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.enterSelectionMode$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends AbstractC3293z implements Function0 {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            TextFieldSelectionManager.copy$foundation_release$default(this.$manager, false, 1, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends AbstractC3293z implements Function0 {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.cut$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(ImeOptions imeOptions, TransformedText transformedText, TextFieldValue textFieldValue, boolean z8, boolean z9, boolean z10, TextFieldState textFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$imeOptions = imeOptions;
        this.$transformedText = transformedText;
        this.$value = textFieldValue;
        this.$enabled = z8;
        this.$isPassword = z9;
        this.$readOnly = z10;
        this.$state = textFieldState;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.m4514setImeAction4L7nppU(semantics, this.$imeOptions.m4857getImeActioneUduSuo());
        SemanticsPropertiesKt.setEditableText(semantics, this.$transformedText.getText());
        SemanticsPropertiesKt.m4517setTextSelectionRangeFDrldGo(semantics, this.$value.m4906getSelectiond9O1mEE());
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.password(semantics);
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new AnonymousClass1(this.$state), 1, null);
        SemanticsPropertiesKt.setText$default(semantics, null, new AnonymousClass2(this.$readOnly, this.$enabled, this.$state, semantics), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default(semantics, null, new AnonymousClass3(this.$readOnly, this.$enabled, this.$state, semantics, this.$value), 1, null);
        SemanticsPropertiesKt.setSelection$default(semantics, null, new AnonymousClass4(this.$offsetMapping, this.$enabled, this.$value, this.$manager, this.$state), 1, null);
        SemanticsPropertiesKt.performImeAction$default(semantics, null, new AnonymousClass5(this.$state, this.$imeOptions), 1, null);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass6(this.$state, this.$focusRequester, this.$readOnly), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semantics, null, new AnonymousClass7(this.$manager), 1, null);
        if (!TextRange.m4663getCollapsedimpl(this.$value.m4906getSelectiond9O1mEE()) && !this.$isPassword) {
            SemanticsPropertiesKt.copyText$default(semantics, null, new AnonymousClass8(this.$manager), 1, null);
            if (this.$enabled && !this.$readOnly) {
                SemanticsPropertiesKt.cutText$default(semantics, null, new AnonymousClass9(this.$manager), 1, null);
            }
        }
        if (!this.$enabled || this.$readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semantics, null, new AnonymousClass10(this.$manager), 1, null);
    }
}

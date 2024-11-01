package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class OutlinedTextFieldKt$OutlinedTextField$5 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ InterfaceC2072n $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC2072n $supportingText;
    final /* synthetic */ InterfaceC2072n $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ InterfaceC2072n $label;
        final /* synthetic */ InterfaceC2072n $leadingIcon;
        final /* synthetic */ InterfaceC2072n $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ InterfaceC2072n $supportingText;
        final /* synthetic */ InterfaceC2072n $trailingIcon;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ TextFieldColors $colors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ boolean $isError;
            final /* synthetic */ Shape $shape;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i8, int i9) {
                super(2);
                this.$enabled = z8;
                this.$isError = z9;
                this.$interactionSource = mutableInteractionSource;
                this.$colors = textFieldColors;
                this.$shape = shape;
                this.$$dirty = i8;
                this.$$dirty1 = i9;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(119108444, i8, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                }
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                boolean z8 = this.$enabled;
                boolean z9 = this.$isError;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                TextFieldColors textFieldColors = this.$colors;
                Shape shape = this.$shape;
                int i9 = ((this.$$dirty >> 9) & 14) | 12582912;
                int i10 = this.$$dirty1;
                textFieldDefaults.m1827OutlinedBorderContainerBoxnbWgWpA(z8, z9, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, i9 | (i10 & 112) | ((i10 >> 15) & 896) | ((i10 >> 18) & 7168) | ((i10 >> 12) & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextFieldValue textFieldValue, boolean z8, boolean z9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z10, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, TextFieldColors textFieldColors, int i8, int i9, Shape shape) {
            super(3);
            this.$value = textFieldValue;
            this.$enabled = z8;
            this.$singleLine = z9;
            this.$visualTransformation = visualTransformation;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z10;
            this.$label = interfaceC2072n;
            this.$placeholder = interfaceC2072n2;
            this.$leadingIcon = interfaceC2072n3;
            this.$trailingIcon = interfaceC2072n4;
            this.$supportingText = interfaceC2072n5;
            this.$colors = textFieldColors;
            this.$$dirty = i8;
            this.$$dirty1 = i9;
            this.$shape = shape;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC2072n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(InterfaceC2072n innerTextField, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(innerTextField, "innerTextField");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342910148, i9, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String text = this.$value.getText();
            boolean z8 = this.$enabled;
            boolean z9 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z10 = this.$isError;
            InterfaceC2072n interfaceC2072n = this.$label;
            InterfaceC2072n interfaceC2072n2 = this.$placeholder;
            InterfaceC2072n interfaceC2072n3 = this.$leadingIcon;
            InterfaceC2072n interfaceC2072n4 = this.$trailingIcon;
            InterfaceC2072n interfaceC2072n5 = this.$supportingText;
            TextFieldColors textFieldColors = this.$colors;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 119108444, true, new AnonymousClass1(z8, z10, mutableInteractionSource, textFieldColors, this.$shape, this.$$dirty, this.$$dirty1));
            int i10 = this.$$dirty;
            int i11 = this.$$dirty1;
            textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z8, z9, visualTransformation, mutableInteractionSource, z10, interfaceC2072n, interfaceC2072n2, interfaceC2072n3, interfaceC2072n4, interfaceC2072n5, textFieldColors, null, composableLambda, composer, ((i9 << 3) & 112) | ((i10 >> 3) & 896) | ((i11 >> 6) & 7168) | ((i11 << 6) & 57344) | (458752 & (i11 >> 6)) | ((i11 << 15) & 3670016) | ((i10 << 3) & 29360128) | ((i10 << 3) & 234881024) | ((i10 << 3) & 1879048192), ((i10 >> 27) & 14) | 221184 | ((i11 << 3) & 112) | ((i11 >> 21) & 896), 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$5(InterfaceC2072n interfaceC2072n, Modifier modifier, TextFieldColors textFieldColors, boolean z8, int i8, TextFieldValue textFieldValue, Function1 function1, boolean z9, boolean z10, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i9, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i10, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, Shape shape) {
        super(2);
        this.$label = interfaceC2072n;
        this.$modifier = modifier;
        this.$colors = textFieldColors;
        this.$isError = z8;
        this.$$dirty1 = i8;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$enabled = z9;
        this.$readOnly = z10;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z11;
        this.$maxLines = i9;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i10;
        this.$placeholder = interfaceC2072n2;
        this.$leadingIcon = interfaceC2072n3;
        this.$trailingIcon = interfaceC2072n4;
        this.$supportingText = interfaceC2072n5;
        this.$shape = shape;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        Modifier modifier;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-719341509, i8, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
        }
        if (this.$label != null) {
            modifier = PaddingKt.m581paddingqDBjuR0$default(SemanticsModifierKt.semantics(this.$modifier, true, AnonymousClass1.INSTANCE), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
        } else {
            modifier = this.$modifier;
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        Modifier m608defaultMinSizeVpY3zN4 = SizeKt.m608defaultMinSizeVpY3zN4(modifier, textFieldDefaults.m1830getMinWidthD9Ej5fM(), textFieldDefaults.m1829getMinHeightD9Ej5fM());
        TextFieldColors textFieldColors = this.$colors;
        boolean z8 = this.$isError;
        int i9 = this.$$dirty1;
        SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z8, composer, ((i9 >> 24) & 112) | ((i9 >> 3) & 14)).getValue().m2958unboximpl(), null);
        TextFieldValue textFieldValue = this.$value;
        Function1 function1 = this.$onValueChange;
        boolean z9 = this.$enabled;
        boolean z10 = this.$readOnly;
        TextStyle textStyle = this.$mergedTextStyle;
        KeyboardOptions keyboardOptions = this.$keyboardOptions;
        KeyboardActions keyboardActions = this.$keyboardActions;
        boolean z11 = this.$singleLine;
        int i10 = this.$maxLines;
        VisualTransformation visualTransformation = this.$visualTransformation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 342910148, true, new AnonymousClass2(textFieldValue, z9, z11, visualTransformation, mutableInteractionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$colors, this.$$dirty, this.$$dirty1, this.$shape));
        int i11 = this.$$dirty & 64638;
        int i12 = this.$$dirty1;
        BasicTextFieldKt.BasicTextField(textFieldValue, function1, m608defaultMinSizeVpY3zN4, z9, z10, textStyle, keyboardOptions, keyboardActions, z11, i10, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, composableLambda, composer, i11 | ((i12 << 9) & 3670016) | (KeyboardActions.$stable << 21) | ((i12 << 9) & 29360128) | ((i12 << 9) & 234881024) | (1879048192 & (i12 << 9)), ((i12 >> 6) & 14) | 24576 | ((i12 >> 15) & 896), 2048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

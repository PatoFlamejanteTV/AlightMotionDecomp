package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2076r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3 extends AbstractC3293z implements InterfaceC2076r {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ InterfaceC2072n $border;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ InterfaceC2072n $placeholder;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC2072n $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, String str, boolean z8, int i8, TextFieldColors textFieldColors, boolean z9, InteractionSource interactionSource, int i9, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, TextFieldType textFieldType, InterfaceC2072n interfaceC2072n5, boolean z10, PaddingValues paddingValues, boolean z11, InterfaceC2072n interfaceC2072n6) {
        super(6);
        this.$label = interfaceC2072n;
        this.$placeholder = interfaceC2072n2;
        this.$transformedText = str;
        this.$isError = z8;
        this.$$dirty1 = i8;
        this.$colors = textFieldColors;
        this.$enabled = z9;
        this.$interactionSource = interactionSource;
        this.$$dirty = i9;
        this.$leadingIcon = interfaceC2072n3;
        this.$trailingIcon = interfaceC2072n4;
        this.$type = textFieldType;
        this.$innerTextField = interfaceC2072n5;
        this.$singleLine = z10;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z11;
        this.$border = interfaceC2072n6;
    }

    @Override // c6.InterfaceC2076r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m1382invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m2958unboximpl(), ((Color) obj3).m2958unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
        return I.f8786a;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-RIQooxk, reason: not valid java name */
    public final void m1382invokeRIQooxk(float f8, long j8, long j9, float f9, Composer composer, int i8) {
        int i9;
        ?? r14;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        long m2958unboximpl;
        ComposableLambda composableLambda3;
        long m2958unboximpl2;
        ComposableLambda composableLambda4;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i8 & 14) == 0) {
            if (composer.changed(f8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (composer.changed(j8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (composer.changed(j9)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (composer.changed(f9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((46811 & i14) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(341865432, i14, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
        }
        InterfaceC2072n interfaceC2072n = this.$label;
        if (interfaceC2072n != null) {
            r14 = 1;
            composableLambda = ComposableLambdaKt.composableLambda(composer, 362863774, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f8, j9, interfaceC2072n, i14, this.$shouldOverrideTextStyleColor, j8));
        } else {
            r14 = 1;
            composableLambda = null;
        }
        if (this.$placeholder != null && this.$transformedText.length() == 0 && f9 > 0.0f) {
            composableLambda2 = ComposableLambdaKt.composableLambda(composer, 1120552650, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f9, this.$colors, this.$enabled, this.$$dirty, this.$$dirty1, this.$placeholder));
        } else {
            composableLambda2 = null;
        }
        String m1328getString4foXLRw = Strings_androidKt.m1328getString4foXLRw(Strings.Companion.m1323getDefaultErrorMessageUdPEhr4(), composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object valueOf = Boolean.valueOf(this.$isError);
        boolean z8 = this.$isError;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(m1328getString4foXLRw);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z8, m1328getString4foXLRw);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r14, null);
        if (this.$colors instanceof TextFieldColorsWithIcons) {
            composer.startReplaceableGroup(-1083197701);
            TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) this.$colors;
            boolean z9 = this.$enabled;
            boolean z10 = this.$isError;
            InteractionSource interactionSource = this.$interactionSource;
            int i15 = (this.$$dirty >> 27) & 14;
            int i16 = this.$$dirty1;
            m2958unboximpl = textFieldColorsWithIcons.leadingIconColor(z9, z10, interactionSource, composer, ((i16 << 3) & 896) | i15 | ((i16 << 3) & 112)).getValue().m2958unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1083197605);
            TextFieldColors textFieldColors = this.$colors;
            boolean z11 = this.$enabled;
            boolean z12 = this.$isError;
            int i17 = (this.$$dirty >> 27) & 14;
            int i18 = this.$$dirty1;
            m2958unboximpl = textFieldColors.leadingIconColor(z11, z12, composer, i17 | ((i18 << 3) & 112) | ((i18 >> 3) & 896)).getValue().m2958unboximpl();
            composer.endReplaceableGroup();
        }
        InterfaceC2072n interfaceC2072n2 = this.$leadingIcon;
        if (interfaceC2072n2 != null) {
            composableLambda3 = ComposableLambdaKt.composableLambda(composer, 1505327088, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m2958unboximpl, interfaceC2072n2));
        } else {
            composableLambda3 = null;
        }
        if (this.$colors instanceof TextFieldColorsWithIcons) {
            composer.startReplaceableGroup(-1083197259);
            TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) this.$colors;
            boolean z13 = this.$enabled;
            boolean z14 = this.$isError;
            InteractionSource interactionSource2 = this.$interactionSource;
            int i19 = (this.$$dirty >> 27) & 14;
            int i20 = this.$$dirty1;
            m2958unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z13, z14, interactionSource2, composer, ((i20 << 3) & 896) | i19 | ((i20 << 3) & 112)).getValue().m2958unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1083197162);
            TextFieldColors textFieldColors2 = this.$colors;
            boolean z15 = this.$enabled;
            boolean z16 = this.$isError;
            int i21 = (this.$$dirty >> 27) & 14;
            int i22 = this.$$dirty1;
            m2958unboximpl2 = textFieldColors2.trailingIconColor(z15, z16, composer, i21 | ((i22 << 3) & 112) | ((i22 >> 3) & 896)).getValue().m2958unboximpl();
            composer.endReplaceableGroup();
        }
        InterfaceC2072n interfaceC2072n3 = this.$trailingIcon;
        if (interfaceC2072n3 != null) {
            composableLambda4 = ComposableLambdaKt.composableLambda(composer, -1894727196, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m2958unboximpl2, interfaceC2072n3));
        } else {
            composableLambda4 = null;
        }
        int i23 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
        if (i23 != r14) {
            if (i23 != 2) {
                composer.startReplaceableGroup(-1083194783);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1083196270);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2769boximpl(Size.Companion.m2790getZeroNHjbRc()), null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer, 139886979, r14, new TextFieldImplKt$CommonDecorationBox$3$drawBorder$1(mutableState, this.$contentPadding, this.$border, this.$$dirty1));
                InterfaceC2072n interfaceC2072n4 = this.$innerTextField;
                boolean z17 = this.$singleLine;
                Object valueOf2 = Float.valueOf(f8);
                composer.startReplaceableGroup(511388516);
                boolean changed2 = composer.changed(valueOf2) | composer.changed(mutableState);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = new TextFieldImplKt$CommonDecorationBox$3$1$1(f8, mutableState);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Function1 function1 = (Function1) rememberedValue3;
                PaddingValues paddingValues = this.$contentPadding;
                int i24 = this.$$dirty;
                ComposableLambda composableLambda6 = composableLambda2;
                ComposableLambda composableLambda7 = composableLambda;
                ComposableLambda composableLambda8 = composableLambda3;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, interfaceC2072n4, composableLambda6, composableLambda7, composableLambda8, composableLambda4, z17, f8, function1, composableLambda5, paddingValues, composer, ((i24 >> 6) & 3670016) | ((i24 >> 3) & 112) | 805306368 | ((i14 << 21) & 29360128), (this.$$dirty1 >> 6) & 14);
                composer.endReplaceableGroup();
            }
        } else {
            composer.startReplaceableGroup(-1083196826);
            InterfaceC2072n interfaceC2072n5 = this.$innerTextField;
            boolean z18 = this.$singleLine;
            PaddingValues paddingValues2 = this.$contentPadding;
            int i25 = this.$$dirty;
            TextFieldKt.TextFieldLayout(semantics$default, interfaceC2072n5, composableLambda, composableLambda2, composableLambda3, composableLambda4, z18, f8, paddingValues2, composer, ((i25 >> 6) & 3670016) | ((i25 >> 3) & 112) | ((i14 << 21) & 29360128) | ((this.$$dirty1 << 18) & 234881024));
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

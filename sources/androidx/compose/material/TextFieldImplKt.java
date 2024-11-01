package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m5155constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m5155constructorimpl(12);

    static {
        float f8 = 48;
        IconDefaultSizeModifier = SizeKt.m608defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(TextFieldType type, String value, InterfaceC2072n innerTextField, VisualTransformation visualTransformation, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, InterfaceC2072n interfaceC2072n5, Composer composer, int i8, int i9, int i10) {
        int i11;
        int i12;
        InputPhase inputPhase;
        Composer composer2;
        InterfaceC2072n interfaceC2072n6;
        InterfaceC2072n interfaceC2072n7;
        InterfaceC2072n interfaceC2072n8;
        boolean z11;
        boolean z12;
        boolean z13;
        InterfaceC2072n interfaceC2072n9;
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(innerTextField, "innerTextField");
        AbstractC3292y.i(visualTransformation, "visualTransformation");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(contentPadding, "contentPadding");
        AbstractC3292y.i(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        if ((i10 & 1) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (startRestartGroup.changed(type) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i8 & 896) == 0) {
            i11 |= startRestartGroup.changedInstance(innerTextField) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i11 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i10 & 16) != 0) {
            i11 |= 24576;
        } else if ((57344 & i8) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n) ? 16384 : 8192;
        }
        int i13 = i10 & 32;
        if (i13 != 0) {
            i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i8 & 458752) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n2) ? 131072 : 65536;
        }
        int i14 = i10 & 64;
        if (i14 != 0) {
            i11 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n3) ? 1048576 : 524288;
        }
        int i15 = i10 & 128;
        if (i15 != 0) {
            i11 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n4) ? 8388608 : 4194304;
        }
        int i16 = i10 & 256;
        if (i16 != 0) {
            i11 |= 100663296;
        } else if ((i8 & 234881024) == 0) {
            i11 |= startRestartGroup.changed(z8) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i17 = i10 & 512;
        if (i17 != 0) {
            i11 |= 805306368;
        } else if ((i8 & 1879048192) == 0) {
            i11 |= startRestartGroup.changed(z9) ? 536870912 : 268435456;
        }
        int i18 = i10 & 1024;
        if (i18 != 0) {
            i12 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i12 = i9 | (startRestartGroup.changed(z10) ? 4 : 2);
        } else {
            i12 = i9;
        }
        if ((i10 & 2048) != 0) {
            i12 |= 48;
        } else if ((i9 & 112) == 0) {
            i12 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i19 = i12;
        if ((i10 & 4096) != 0) {
            i19 |= 384;
        } else if ((i9 & 896) == 0) {
            i19 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i10 & 8192) != 0) {
            i19 |= 3072;
        } else if ((i9 & 7168) == 0) {
            i19 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i20 = i10 & 16384;
        if (i20 != 0) {
            i19 |= 24576;
        } else if ((i9 & 57344) == 0) {
            i19 |= startRestartGroup.changedInstance(interfaceC2072n5) ? 16384 : 8192;
        }
        if ((i11 & 1533916891) == 306783378 && (46811 & i19) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            interfaceC2072n6 = interfaceC2072n2;
            interfaceC2072n7 = interfaceC2072n3;
            interfaceC2072n8 = interfaceC2072n4;
            z11 = z8;
            z12 = z9;
            z13 = z10;
            interfaceC2072n9 = interfaceC2072n5;
            composer2 = startRestartGroup;
        } else {
            InterfaceC2072n interfaceC2072n10 = i13 != 0 ? null : interfaceC2072n2;
            InterfaceC2072n interfaceC2072n11 = i14 != 0 ? null : interfaceC2072n3;
            InterfaceC2072n interfaceC2072n12 = i15 != 0 ? null : interfaceC2072n4;
            boolean z14 = i16 != 0 ? false : z8;
            boolean z15 = i17 != 0 ? true : z9;
            boolean z16 = i18 != 0 ? false : z10;
            InterfaceC2072n interfaceC2072n13 = i20 != 0 ? null : interfaceC2072n5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712568069, i11, i19, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i19 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            int i21 = i11;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, z15, z16, interactionSource, i21, i19);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m4699getColor0d7_KjU = subtitle1.m4699getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z17 = (Color.m2949equalsimpl0(m4699getColor0d7_KjU, companion.m2984getUnspecified0d7_KjU()) && !Color.m2949equalsimpl0(caption.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU())) || (!Color.m2949equalsimpl0(subtitle1.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU()) && Color.m2949equalsimpl0(caption.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            long m4699getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, 6).getCaption().m4699getColor0d7_KjU();
            if (z17 && m4699getColor0d7_KjU2 == companion.m2984getUnspecified0d7_KjU()) {
                m4699getColor0d7_KjU2 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0)).m2958unboximpl();
            }
            long j8 = m4699getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(2129141197);
            long m4699getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, 6).getSubtitle1().m4699getColor0d7_KjU();
            if (z17 && m4699getColor0d7_KjU3 == companion.m2984getUnspecified0d7_KjU()) {
                m4699getColor0d7_KjU3 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, startRestartGroup, 0)).m2958unboximpl();
            }
            long j9 = m4699getColor0d7_KjU3;
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1389TransitionDTcfvLk(inputPhase2, j8, j9, textFieldImplKt$CommonDecorationBox$labelColor$1, interfaceC2072n != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new TextFieldImplKt$CommonDecorationBox$3(interfaceC2072n, interfaceC2072n10, text, z16, i19, colors, z15, interactionSource, i21, interfaceC2072n11, interfaceC2072n12, type, innerTextField, z14, contentPadding, z17, interfaceC2072n13)), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            interfaceC2072n6 = interfaceC2072n10;
            interfaceC2072n7 = interfaceC2072n11;
            interfaceC2072n8 = interfaceC2072n12;
            z11 = z14;
            z12 = z15;
            z13 = z16;
            interfaceC2072n9 = interfaceC2072n13;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldImplKt$CommonDecorationBox$4(type, value, innerTextField, visualTransformation, interfaceC2072n, interfaceC2072n6, interfaceC2072n7, interfaceC2072n8, z11, z12, z13, interactionSource, contentPadding, colors, interfaceC2072n9, i8, i9, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = 0)
    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1381DecorationeuL9pac(long r15, androidx.compose.ui.text.TextStyle r17, java.lang.Float r18, c6.InterfaceC2072n r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m1381DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
        AbstractC3292y.i(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}

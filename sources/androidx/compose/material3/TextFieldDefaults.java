package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5155constructorimpl(56);
    private static final float MinWidth = Dp.m5155constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5155constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5155constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1822indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, int i8, Object obj) {
        float f10;
        float f11;
        if ((i8 & 16) != 0) {
            f10 = FocusedBorderThickness;
        } else {
            f10 = f8;
        }
        if ((i8 & 32) != 0) {
            f11 = UnfocusedBorderThickness;
        } else {
            f11 = f9;
        }
        return textFieldDefaults.m1832indicatorLinegv0btCI(modifier, z8, z9, interactionSource, textFieldColors, f10, f11);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1823outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 2) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 4) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 8) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1834outlinedTextFieldPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1824supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 2) != 0) {
            f9 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i8 & 4) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        }
        return textFieldDefaults.m1835supportingTextPaddinga9UjIt4$material3_release(f8, f9, f10, f11);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1825textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 2) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 4) != 0) {
            f10 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i8 & 8) != 0) {
            f11 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1837textFieldWithLabelPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1826textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 2) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 4) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i8 & 8) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1838textFieldWithoutLabelPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:            if ((r27 & 16) != 0) goto L77;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void FilledContainerBox(boolean r20, boolean r21, androidx.compose.foundation.interaction.InteractionSource r22, androidx.compose.material3.TextFieldColors r23, androidx.compose.ui.graphics.Shape r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1827OutlinedBorderContainerBoxnbWgWpA(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m1827OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OutlinedTextFieldDecorationBox(java.lang.String r83, c6.InterfaceC2072n r84, boolean r85, boolean r86, androidx.compose.ui.text.input.VisualTransformation r87, androidx.compose.foundation.interaction.InteractionSource r88, boolean r89, c6.InterfaceC2072n r90, c6.InterfaceC2072n r91, c6.InterfaceC2072n r92, c6.InterfaceC2072n r93, c6.InterfaceC2072n r94, androidx.compose.material3.TextFieldColors r95, androidx.compose.foundation.layout.PaddingValues r96, c6.InterfaceC2072n r97, androidx.compose.runtime.Composer r98, int r99, int r100, int r101) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, c6.n, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, c6.n, c6.n, c6.n, c6.n, c6.n, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, c6.n, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x019e, code lost:            if (r7.changed(r89) == false) goto L134;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0258  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(java.lang.String r77, c6.InterfaceC2072n r78, boolean r79, boolean r80, androidx.compose.ui.text.input.VisualTransformation r81, androidx.compose.foundation.interaction.InteractionSource r82, boolean r83, c6.InterfaceC2072n r84, c6.InterfaceC2072n r85, c6.InterfaceC2072n r86, c6.InterfaceC2072n r87, c6.InterfaceC2072n r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.foundation.layout.PaddingValues r91, c6.InterfaceC2072n r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, c6.n, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, c6.n, c6.n, c6.n, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, c6.n, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i8) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i8, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:62)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1828getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1829getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1830getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i8, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:59)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1831getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1832indicatorLinegv0btCI(Modifier indicatorLine, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors colors, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(indicatorLine, "$this$indicatorLine");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(colors, "colors");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z8, z9, interactionSource, colors, f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(indicatorLine, noInspectorInfo, new TextFieldDefaults$indicatorLine$2(z8, z9, interactionSource, colors, f8, f9));
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m1833outlinedTextFieldColorsl59Burw(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(-1654658683);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j8;
        long m2947copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2983getTransparent0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j10;
        long color2 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j11;
        long color3 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i11 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i11 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j13;
        long color5 = (i11 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j14;
        long m2947copywmQWz5c$default2 = (i11 & 256) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color6 = (i11 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j16;
        long color7 = (i11 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j17;
        long color8 = (i11 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j18;
        long m2947copywmQWz5c$default3 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color9 = (i11 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j20;
        long color10 = (i11 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j21;
        long color11 = (32768 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j22;
        long m2947copywmQWz5c$default4 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color12 = (131072 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j24;
        long color13 = (262144 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j25;
        long color14 = (524288 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j26;
        long m2947copywmQWz5c$default5 = (1048576 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color15 = (2097152 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j28;
        long color16 = (4194304 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j29;
        long m2947copywmQWz5c$default6 = (8388608 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color17 = (16777216 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color18 = (33554432 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long m2947copywmQWz5c$default7 = (67108864 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color19 = (i11 & 134217728) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654658683, i8, i9, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:399)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, m2947copywmQWz5c$default, m2983getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, color6, m2947copywmQWz5c$default2, color7, color8, m2947copywmQWz5c$default3, color9, color10, color11, m2947copywmQWz5c$default4, color12, color13, color14, m2947copywmQWz5c$default5, color15, color16, m2947copywmQWz5c$default6, color17, color18, m2947copywmQWz5c$default7, color19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1834outlinedTextFieldPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }

    @ExperimentalMaterial3Api
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m1835supportingTextPaddinga9UjIt4$material3_release(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m1836textFieldColorsl59Burw(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(-128842621);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j8;
        long m2947copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j11;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i11 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i11 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j13;
        long color6 = (i11 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j14;
        long m2947copywmQWz5c$default2 = (i11 & 256) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color7 = (i11 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j16;
        long color8 = (i11 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j17;
        long color9 = (i11 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j18;
        long m2947copywmQWz5c$default3 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color10 = (i11 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j20;
        long color11 = (i11 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j21;
        long color12 = (32768 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j22;
        long m2947copywmQWz5c$default4 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color13 = (131072 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j24;
        long color14 = (262144 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j25;
        long color15 = (524288 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j26;
        long m2947copywmQWz5c$default5 = (1048576 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color16 = (2097152 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j28;
        long color17 = (4194304 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j29;
        long m2947copywmQWz5c$default6 = (8388608 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color18 = (16777216 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color19 = (33554432 & i11) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long m2947copywmQWz5c$default7 = (67108864 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color20 = (i11 & 134217728) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-128842621, i8, i9, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:292)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, m2947copywmQWz5c$default, color2, color3, color4, textSelectionColors2, color5, color6, color7, m2947copywmQWz5c$default2, color8, color9, m2947copywmQWz5c$default3, color10, color11, color12, m2947copywmQWz5c$default4, color13, color14, color15, m2947copywmQWz5c$default5, color16, color17, m2947copywmQWz5c$default6, color18, color19, m2947copywmQWz5c$default7, color20, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1837textFieldWithLabelPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f10, f9, f11);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1838textFieldWithoutLabelPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }
}

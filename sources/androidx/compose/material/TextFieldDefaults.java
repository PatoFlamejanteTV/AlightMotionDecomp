package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5155constructorimpl(56);
    private static final float MinWidth = Dp.m5155constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m5155constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m5155constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1364indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, int i8, Object obj) {
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
        return textFieldDefaults.m1373indicatorLinegv0btCI(modifier, z8, z9, interactionSource, textFieldColors, f10, f11);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1365outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
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
        return textFieldDefaults.m1375outlinedTextFieldPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1366textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
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
        return textFieldDefaults.m1377textFieldWithLabelPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1367textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f8, float f9, float f10, float f11, int i8, Object obj) {
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
        return textFieldDefaults.m1378textFieldWithoutLabelPaddinga9UjIt4(f8, f9, f10, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1368BorderBoxnbWgWpA(boolean r20, boolean r21, androidx.compose.foundation.interaction.InteractionSource r22, androidx.compose.material.TextFieldColors r23, androidx.compose.ui.graphics.Shape r24, float r25, float r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m1368BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:            if (r8.changed(r80) == false) goto L135;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0249  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OutlinedTextFieldDecorationBox(java.lang.String r68, c6.InterfaceC2072n r69, boolean r70, boolean r71, androidx.compose.ui.text.input.VisualTransformation r72, androidx.compose.foundation.interaction.InteractionSource r73, boolean r74, c6.InterfaceC2072n r75, c6.InterfaceC2072n r76, c6.InterfaceC2072n r77, c6.InterfaceC2072n r78, androidx.compose.material.TextFieldColors r79, androidx.compose.foundation.layout.PaddingValues r80, c6.InterfaceC2072n r81, androidx.compose.runtime.Composer r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, c6.n, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, c6.n, c6.n, c6.n, c6.n, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, c6.n, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0196, code lost:            if (r7.changed(r82) == false) goto L135;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(java.lang.String r70, c6.InterfaceC2072n r71, boolean r72, boolean r73, androidx.compose.ui.text.input.VisualTransformation r74, androidx.compose.foundation.interaction.InteractionSource r75, boolean r76, c6.InterfaceC2072n r77, c6.InterfaceC2072n r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, androidx.compose.material.TextFieldColors r81, androidx.compose.foundation.layout.PaddingValues r82, androidx.compose.runtime.Composer r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, c6.n, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, c6.n, c6.n, c6.n, c6.n, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1369getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1370getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1371getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i8, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i8, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1372getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterialApi
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1373indicatorLinegv0btCI(Modifier indicatorLine, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors colors, float f8, float f9) {
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
    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1374outlinedTextFieldColorsdx8h9Zs(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(1762667317);
        long m2947copywmQWz5c$default = (i11 & 1) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m2947copywmQWz5c$default2 = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2983getTransparent0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j10;
        long m1155getPrimary0d7_KjU = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU() : j11;
        long m1149getError0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j12;
        long m2947copywmQWz5c$default3 = (i11 & 32) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2947copywmQWz5c$default4 = (i11 & 64) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2947copywmQWz5c$default5 = (i11 & 128) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1149getError0d7_KjU2 = (i11 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j16;
        long m2947copywmQWz5c$default6 = (i11 & 512) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2947copywmQWz5c$default7 = (i11 & 1024) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long j29 = (i11 & 2048) != 0 ? m2947copywmQWz5c$default6 : j19;
        long m2947copywmQWz5c$default8 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m2947copywmQWz5c$default9 = (i11 & 8192) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m1149getError0d7_KjU3 = (i11 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j22;
        long m2947copywmQWz5c$default10 = (32768 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long m2947copywmQWz5c$default11 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2947copywmQWz5c$default12 = (131072 & i11) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m1149getError0d7_KjU4 = (262144 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j26;
        long m2947copywmQWz5c$default13 = (524288 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long m2947copywmQWz5c$default14 = (i11 & 1048576) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i8, i9, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m2947copywmQWz5c$default, m2947copywmQWz5c$default2, m1155getPrimary0d7_KjU, m1149getError0d7_KjU, m2947copywmQWz5c$default3, m2947copywmQWz5c$default4, m1149getError0d7_KjU2, m2947copywmQWz5c$default5, m2947copywmQWz5c$default6, m2947copywmQWz5c$default7, j29, m2947copywmQWz5c$default8, m2947copywmQWz5c$default9, m1149getError0d7_KjU3, m2983getTransparent0d7_KjU, m2947copywmQWz5c$default10, m2947copywmQWz5c$default11, m2947copywmQWz5c$default12, m1149getError0d7_KjU4, m2947copywmQWz5c$default13, m2947copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1375outlinedTextFieldPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }

    @Composable
    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1376textFieldColorsdx8h9Zs(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(231892599);
        long m2947copywmQWz5c$default = (i11 & 1) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m2947copywmQWz5c$default2 = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2947copywmQWz5c$default3 = (i11 & 4) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m1155getPrimary0d7_KjU = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU() : j11;
        long m1149getError0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j12;
        long m2947copywmQWz5c$default4 = (i11 & 32) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2947copywmQWz5c$default5 = (i11 & 64) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2947copywmQWz5c$default6 = (i11 & 128) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1149getError0d7_KjU2 = (i11 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j16;
        long m2947copywmQWz5c$default7 = (i11 & 512) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2947copywmQWz5c$default8 = (i11 & 1024) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long j29 = (i11 & 2048) != 0 ? m2947copywmQWz5c$default7 : j19;
        long m2947copywmQWz5c$default9 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m2947copywmQWz5c$default10 = (i11 & 8192) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m1149getError0d7_KjU3 = (i11 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j22;
        long m2947copywmQWz5c$default11 = (32768 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long m2947copywmQWz5c$default12 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2947copywmQWz5c$default13 = (131072 & i11) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m1149getError0d7_KjU4 = (262144 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j26;
        long m2947copywmQWz5c$default14 = (524288 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long m2947copywmQWz5c$default15 = (i11 & 1048576) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i8, i9, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m2947copywmQWz5c$default, m2947copywmQWz5c$default2, m1155getPrimary0d7_KjU, m1149getError0d7_KjU, m2947copywmQWz5c$default4, m2947copywmQWz5c$default5, m1149getError0d7_KjU2, m2947copywmQWz5c$default6, m2947copywmQWz5c$default7, m2947copywmQWz5c$default8, j29, m2947copywmQWz5c$default9, m2947copywmQWz5c$default10, m1149getError0d7_KjU3, m2947copywmQWz5c$default3, m2947copywmQWz5c$default11, m2947copywmQWz5c$default12, m2947copywmQWz5c$default13, m1149getError0d7_KjU4, m2947copywmQWz5c$default14, m2947copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1377textFieldWithLabelPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f10, f9, f11);
    }

    @ExperimentalMaterialApi
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1378textFieldWithoutLabelPaddinga9UjIt4(float f8, float f9, float f10, float f11) {
        return PaddingKt.m573PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }
}

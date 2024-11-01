package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m5155constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m5155constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m5155constructorimpl(4);

    static {
        float f8 = 48;
        IconDefaultSizeModifier = SizeKt.m608defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(androidx.compose.material3.TextFieldType r39, java.lang.String r40, c6.InterfaceC2072n r41, androidx.compose.ui.text.input.VisualTransformation r42, c6.InterfaceC2072n r43, c6.InterfaceC2072n r44, c6.InterfaceC2072n r45, c6.InterfaceC2072n r46, c6.InterfaceC2072n r47, boolean r48, boolean r49, boolean r50, androidx.compose.foundation.interaction.InteractionSource r51, androidx.compose.foundation.layout.PaddingValues r52, androidx.compose.material3.TextFieldColors r53, c6.InterfaceC2072n r54, androidx.compose.runtime.Composer r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, c6.n, androidx.compose.ui.text.input.VisualTransformation, c6.n, c6.n, c6.n, c6.n, c6.n, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, c6.n, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m1842DecorationKTwxG1Y(long j8, TextStyle textStyle, InterfaceC2072n content, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i14 = i9 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i10, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j8, content, i10));
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(1830466317);
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i10 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(1830466369);
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j8, textStyle2, content, i8, i9));
        }
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

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
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

package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float ContentEndPadding;
    private static final float LeadingContentEndPadding;
    private static final float ListItemHorizontalPadding;
    private static final float ListItemThreeLineVerticalPadding;
    private static final float ListItemVerticalPadding;
    private static final float TrailingHorizontalPadding;
    private static final float TwoLineListItemContainerHeight = Dp.m5155constructorimpl(72);
    private static final float ThreeLineListItemContainerHeight = Dp.m5155constructorimpl(88);

    static {
        float f8 = 8;
        ListItemVerticalPadding = Dp.m5155constructorimpl(f8);
        float f9 = 16;
        ListItemThreeLineVerticalPadding = Dp.m5155constructorimpl(f9);
        ListItemHorizontalPadding = Dp.m5155constructorimpl(f9);
        LeadingContentEndPadding = Dp.m5155constructorimpl(f9);
        ContentEndPadding = Dp.m5155constructorimpl(f8);
        TrailingHorizontalPadding = Dp.m5155constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0106  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1657ListItemHXNGIdc(c6.InterfaceC2072n r36, androidx.compose.ui.Modifier r37, c6.InterfaceC2072n r38, c6.InterfaceC2072n r39, c6.InterfaceC2072n r40, c6.InterfaceC2072n r41, androidx.compose.material3.ListItemColors r42, float r43, float r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1657ListItemHXNGIdc(c6.n, androidx.compose.ui.Modifier, c6.n, c6.n, c6.n, c6.n, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ListItem-xOgov6c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1658ListItemxOgov6c(androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, float r36, float r37, androidx.compose.foundation.layout.PaddingValues r38, c6.InterfaceC2073o r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1658ListItemxOgov6c(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, float, float, androidx.compose.foundation.layout.PaddingValues, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m1659ProvideTextStyleFromToken3JVO9M(long j8, TypographyKeyTokens typographyKeyTokens, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(typographyKeyTokens)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i9, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:489)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j8))}, ComposableLambdaKt.composableLambda(startRestartGroup, -514310925, true, new ListItemKt$ProvideTextStyleFromToken$1(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), typographyKeyTokens), interfaceC2072n, i9)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$ProvideTextStyleFromToken$2(j8, typographyKeyTokens, interfaceC2072n, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[_[androidx.compose.ui.UiComposable]:[_]]")
    /* renamed from: leadingContent-iJQMabo, reason: not valid java name */
    public static final InterfaceC2073o m1664leadingContentiJQMabo(InterfaceC2072n interfaceC2072n, long j8, boolean z8, Composer composer, int i8) {
        composer.startReplaceableGroup(292744125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292744125, i8, -1, "androidx.compose.material3.leadingContent (ListItem.kt:309)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1755598478, true, new ListItemKt$leadingContent$1(j8, z8, interfaceC2072n, i8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[_[androidx.compose.ui.UiComposable]:[_]]")
    /* renamed from: trailingContent-iJQMabo, reason: not valid java name */
    public static final InterfaceC2073o m1665trailingContentiJQMabo(InterfaceC2072n interfaceC2072n, long j8, boolean z8, Composer composer, int i8) {
        composer.startReplaceableGroup(2067138571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2067138571, i8, -1, "androidx.compose.material3.trailingContent (ListItem.kt:334)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1301939978, true, new ListItemKt$trailingContent$1(z8, j8, interfaceC2072n, i8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}

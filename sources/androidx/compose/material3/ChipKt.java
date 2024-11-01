package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl(8);
        HorizontalElementsPadding = m5155constructorimpl;
        AssistChipPadding = PaddingKt.m572PaddingValuesYgX7TsA$default(m5155constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m572PaddingValuesYgX7TsA$default(m5155constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m572PaddingValuesYgX7TsA$default(m5155constructorimpl, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AssistChip(kotlin.jvm.functions.Function0 r47, c6.InterfaceC2072n r48, androidx.compose.ui.Modifier r49, boolean r50, c6.InterfaceC2072n r51, c6.InterfaceC2072n r52, androidx.compose.ui.graphics.Shape r53, androidx.compose.material3.ChipColors r54, androidx.compose.material3.ChipElevation r55, androidx.compose.material3.ChipBorder r56, androidx.compose.foundation.interaction.MutableInteractionSource r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m1475ChipnkUnTEs(Modifier modifier, Function0 function0, boolean z8, InterfaceC2072n interfaceC2072n, TextStyle textStyle, long j8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f8, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1400504719);
        if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n) ? 2048 : 1024;
        }
        if ((i8 & 57344) == 0) {
            i10 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i8 & 458752) == 0) {
            i10 |= startRestartGroup.changed(j8) ? 131072 : 65536;
        }
        if ((i8 & 3670016) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n2) ? 1048576 : 524288;
        }
        if ((29360128 & i8) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n3) ? 8388608 : 4194304;
        }
        if ((i8 & 234881024) == 0) {
            i10 |= startRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 1879048192) == 0) {
            i10 |= startRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((i9 & 14) == 0) {
            i11 = (startRestartGroup.changed(chipElevation) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            i11 |= startRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i9 & 896) == 0) {
            i11 |= startRestartGroup.changed(f8) ? 256 : 128;
        }
        if ((i9 & 7168) == 0) {
            i11 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i9 & 57344) == 0) {
            i11 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((i10 & 1533916891) == 306783378 && (46811 & i11) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i10, i11, "androidx.compose.material3.Chip (Chip.kt:1308)");
            }
            int i12 = (i10 >> 6) & 14;
            long m2958unboximpl = chipColors.containerColor$material3_release(z8, startRestartGroup, ((i10 >> 24) & 112) | i12).getValue().m2958unboximpl();
            startRestartGroup.startReplaceableGroup(64019101);
            State<Dp> state = chipElevation == null ? null : chipElevation.tonalElevation$material3_release(z8, mutableInteractionSource, startRestartGroup, i12 | ((i11 >> 9) & 112) | ((i11 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            int i13 = i10;
            float m5169unboximpl = state != null ? state.getValue().m5169unboximpl() : Dp.m5155constructorimpl(0);
            State<Dp> shadowElevation$material3_release = chipElevation == null ? null : chipElevation.shadowElevation$material3_release(z8, mutableInteractionSource, startRestartGroup, i12 | ((i11 >> 9) & 112) | ((i11 << 6) & 896));
            int i14 = i11;
            composer2 = startRestartGroup;
            SurfaceKt.m1783Surfaceo_FOJdg(function0, modifier, z8, shape, m2958unboximpl, 0L, m5169unboximpl, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5169unboximpl() : Dp.m5155constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(startRestartGroup, -1985962652, true, new ChipKt$Chip$1(interfaceC2072n, textStyle, j8, interfaceC2072n2, interfaceC2072n3, chipColors, z8, i13, f8, paddingValues, i14)), composer2, ((i13 >> 3) & 14) | ((i13 << 3) & 112) | (i13 & 896) | ((i13 >> 15) & 7168) | ((i14 << 21) & 234881024) | ((i14 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChipKt$Chip$2(modifier, function0, z8, interfaceC2072n, textStyle, j8, interfaceC2072n2, interfaceC2072n3, shape, chipColors, chipElevation, borderStroke, f8, paddingValues, mutableInteractionSource, i8, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m1476ChipContentfe0OD_I(InterfaceC2072n interfaceC2072n, TextStyle textStyle, long j8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, long j9, long j10, float f8, PaddingValues paddingValues, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-782878228);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i9 = i19 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i9 |= i18;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(j8)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i9 |= i17;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i9 |= i16;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i9 |= i15;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n4)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i9 |= i14;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(j9)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i9 |= i13;
        }
        if ((29360128 & i8) == 0) {
            if (startRestartGroup.changed(j10)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i9 |= i12;
        }
        if ((i8 & 234881024) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i11 = 33554432;
            }
            i9 |= i11;
        }
        if ((i8 & 1879048192) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i9 |= i10;
        }
        if ((1533916891 & i9) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i9, -1, "androidx.compose.material3.ChipContent (Chip.kt:1402)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j8)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1748799148, true, new ChipKt$ChipContent$1(f8, paddingValues, interfaceC2072n3, i9, interfaceC2072n2, j9, interfaceC2072n, interfaceC2072n4, j10)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$ChipContent$2(interfaceC2072n, textStyle, j8, interfaceC2072n2, interfaceC2072n3, interfaceC2072n4, j9, j10, f8, paddingValues, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d2  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedAssistChip(kotlin.jvm.functions.Function0 r50, c6.InterfaceC2072n r51, androidx.compose.ui.Modifier r52, boolean r53, c6.InterfaceC2072n r54, c6.InterfaceC2072n r55, androidx.compose.ui.graphics.Shape r56, androidx.compose.material3.ChipColors r57, androidx.compose.material3.ChipElevation r58, androidx.compose.material3.ChipBorder r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01eb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedFilterChip(boolean r57, kotlin.jvm.functions.Function0 r58, c6.InterfaceC2072n r59, androidx.compose.ui.Modifier r60, boolean r61, c6.InterfaceC2072n r62, c6.InterfaceC2072n r63, androidx.compose.ui.graphics.Shape r64, androidx.compose.material3.SelectableChipColors r65, androidx.compose.material3.SelectableChipElevation r66, androidx.compose.material3.SelectableChipBorder r67, androidx.compose.foundation.interaction.MutableInteractionSource r68, androidx.compose.runtime.Composer r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedSuggestionChip(kotlin.jvm.functions.Function0 r42, c6.InterfaceC2072n r43, androidx.compose.ui.Modifier r44, boolean r45, c6.InterfaceC2072n r46, androidx.compose.ui.graphics.Shape r47, androidx.compose.material3.ChipColors r48, androidx.compose.material3.ChipElevation r49, androidx.compose.material3.ChipBorder r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0329  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilterChip(boolean r56, kotlin.jvm.functions.Function0 r57, c6.InterfaceC2072n r58, androidx.compose.ui.Modifier r59, boolean r60, c6.InterfaceC2072n r61, c6.InterfaceC2072n r62, androidx.compose.ui.graphics.Shape r63, androidx.compose.material3.SelectableChipColors r64, androidx.compose.material3.SelectableChipElevation r65, androidx.compose.material3.SelectableChipBorder r66, androidx.compose.foundation.interaction.MutableInteractionSource r67, androidx.compose.runtime.Composer r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InputChip(boolean r51, kotlin.jvm.functions.Function0 r52, c6.InterfaceC2072n r53, androidx.compose.ui.Modifier r54, boolean r55, c6.InterfaceC2072n r56, c6.InterfaceC2072n r57, c6.InterfaceC2072n r58, androidx.compose.ui.graphics.Shape r59, androidx.compose.material3.SelectableChipColors r60, androidx.compose.material3.SelectableChipElevation r61, androidx.compose.material3.SelectableChipBorder r62, androidx.compose.foundation.interaction.MutableInteractionSource r63, androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m1477SelectableChipu0RnIRE(boolean z8, Modifier modifier, Function0 function0, boolean z9, InterfaceC2072n interfaceC2072n, TextStyle textStyle, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f8, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(402951308);
        if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changed(z8) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changed(function0) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i10 |= startRestartGroup.changed(z9) ? 2048 : 1024;
        }
        if ((i8 & 57344) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n) ? 16384 : 8192;
        }
        if ((i8 & 458752) == 0) {
            i10 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i8 & 3670016) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n2) ? 1048576 : 524288;
        }
        if ((i8 & 29360128) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n3) ? 8388608 : 4194304;
        }
        if ((i8 & 234881024) == 0) {
            i10 |= startRestartGroup.changed(interfaceC2072n4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 1879048192) == 0) {
            i10 |= startRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i9 & 14) == 0) {
            i11 = (startRestartGroup.changed(selectableChipColors) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            i11 |= startRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i9 & 896) == 0) {
            i11 |= startRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i9 & 7168) == 0) {
            i11 |= startRestartGroup.changed(f8) ? 2048 : 1024;
        }
        if ((i9 & 57344) == 0) {
            i11 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i9 & 458752) == 0) {
            i11 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i10 & 1533916891) == 306783378 && (374491 & i11) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i10, i11, "androidx.compose.material3.SelectableChip (Chip.kt:1353)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$SelectableChip$1.INSTANCE, 1, null);
            int i12 = (i10 >> 9) & 14;
            long m2958unboximpl = selectableChipColors.containerColor$material3_release(z9, z8, startRestartGroup, ((i10 << 3) & 112) | i12 | ((i11 << 6) & 896)).getValue().m2958unboximpl();
            startRestartGroup.startReplaceableGroup(1036661290);
            State<Dp> state = selectableChipElevation == null ? null : selectableChipElevation.tonalElevation$material3_release(z9, mutableInteractionSource, startRestartGroup, ((i11 >> 12) & 112) | i12 | ((i11 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            float m5169unboximpl = state != null ? state.getValue().m5169unboximpl() : Dp.m5155constructorimpl(0);
            State<Dp> shadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z9, mutableInteractionSource, startRestartGroup, i12 | ((i11 >> 12) & 112) | ((i11 << 3) & 896));
            int i13 = i10;
            int i14 = i11;
            composer2 = startRestartGroup;
            SurfaceKt.m1781Surfaced85dljk(z8, function0, semantics$default, z9, shape, m2958unboximpl, 0L, m5169unboximpl, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5169unboximpl() : Dp.m5155constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(startRestartGroup, -577614814, true, new ChipKt$SelectableChip$2(selectableChipColors, z9, z8, i13, i14, interfaceC2072n, textStyle, interfaceC2072n2, interfaceC2072n3, interfaceC2072n4, f8, paddingValues)), startRestartGroup, (i13 & 14) | ((i13 >> 3) & 112) | (i13 & 7168) | ((i13 >> 15) & 57344) | ((i14 << 21) & 1879048192), ((i14 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChipKt$SelectableChip$3(z8, modifier, function0, z9, interfaceC2072n, textStyle, interfaceC2072n2, interfaceC2072n3, interfaceC2072n4, shape, selectableChipColors, selectableChipElevation, borderStroke, f8, paddingValues, mutableInteractionSource, i8, i9));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SuggestionChip(kotlin.jvm.functions.Function0 r41, c6.InterfaceC2072n r42, androidx.compose.ui.Modifier r43, boolean r44, c6.InterfaceC2072n r45, androidx.compose.ui.graphics.Shape r46, androidx.compose.material3.ChipColors r47, androidx.compose.material3.ChipElevation r48, androidx.compose.material3.ChipBorder r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(kotlin.jvm.functions.Function0, c6.n, androidx.compose.ui.Modifier, boolean, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final PaddingValues inputChipPadding(boolean z8, boolean z9, boolean z10) {
        float f8;
        float f9;
        if (!z8 && z9) {
            f8 = 8;
        } else {
            f8 = 4;
        }
        float m5155constructorimpl = Dp.m5155constructorimpl(f8);
        if (z10) {
            f9 = 8;
        } else {
            f9 = 4;
        }
        return PaddingKt.m574PaddingValuesa9UjIt4$default(m5155constructorimpl, 0.0f, Dp.m5155constructorimpl(f9), 0.0f, 10, null);
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z8, boolean z9, boolean z10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = false;
        }
        if ((i8 & 4) != 0) {
            z10 = false;
        }
        return inputChipPadding(z8, z9, z10);
    }
}

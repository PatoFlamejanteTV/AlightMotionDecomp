package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
    private static final float FabSpacing = Dp.m5155constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cf  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1730ScaffoldTvnljyQ(androidx.compose.ui.Modifier r29, c6.InterfaceC2072n r30, c6.InterfaceC2072n r31, c6.InterfaceC2072n r32, c6.InterfaceC2072n r33, int r34, long r35, long r37, androidx.compose.foundation.layout.WindowInsets r39, c6.InterfaceC2073o r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m1730ScaffoldTvnljyQ(androidx.compose.ui.Modifier, c6.n, c6.n, c6.n, c6.n, int, long, long, androidx.compose.foundation.layout.WindowInsets, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m1731ScaffoldLayoutFMILGgc(int i8, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, WindowInsets windowInsets, InterfaceC2072n interfaceC2072n4, Composer composer, int i9) {
        int i10;
        Composer composer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(i8)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2073o)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changed(interfaceC2072n3)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changed(windowInsets)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((3670016 & i9) == 0) {
            if (startRestartGroup.changed(interfaceC2072n4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 = i13 | i10;
        }
        if ((2995931 & i10) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i10, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:113)");
            }
            Object[] objArr = {interfaceC2072n, interfaceC2072n2, windowInsets, interfaceC2072n3, FabPosition.m1608boximpl(i8), interfaceC2072n4, interfaceC2073o};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i20 = 0;
            boolean z8 = false;
            for (int i21 = 7; i20 < i21; i21 = 7) {
                z8 |= startRestartGroup.changed(objArr[i20]);
                i20++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z8 && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                i11 = 1;
                i12 = 0;
            } else {
                composer2 = startRestartGroup;
                i11 = 1;
                i12 = 0;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = new ScaffoldKt$ScaffoldLayout$1$1(interfaceC2072n, interfaceC2072n2, interfaceC2072n3, i8, windowInsets, interfaceC2072n4, i10, interfaceC2073o);
                composer2.updateRememberedValue(scaffoldKt$ScaffoldLayout$1$1);
                rememberedValue = scaffoldKt$ScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (InterfaceC2072n) rememberedValue, composer2, i12, i11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(i8, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, windowInsets, interfaceC2072n4, i9));
        }
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}

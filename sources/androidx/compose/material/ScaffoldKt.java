package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
    private static final float FabSpacing = Dp.m5155constructorimpl(16);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:            if (r0.changed(r55) == false) goto L146;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1297Scaffold27mzLpw(androidx.compose.ui.Modifier r41, androidx.compose.material.ScaffoldState r42, c6.InterfaceC2072n r43, c6.InterfaceC2072n r44, c6.InterfaceC2073o r45, c6.InterfaceC2072n r46, int r47, boolean r48, c6.InterfaceC2073o r49, boolean r50, androidx.compose.ui.graphics.Shape r51, float r52, long r53, long r55, long r57, long r59, long r61, c6.InterfaceC2073o r63, androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1297Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, c6.n, c6.n, c6.o, c6.n, int, boolean, c6.o, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1298ScaffoldLayoutMDYNRJg(boolean z8, int i8, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, Composer composer, int i9) {
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
        Composer startRestartGroup = composer.startRestartGroup(-1401632215);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(i8)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((3670016 & i9) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n4)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 = i12 | i10;
        }
        if ((2995931 & i10) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401632215, i10, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {interfaceC2072n, interfaceC2072n2, interfaceC2072n3, FabPosition.m1226boximpl(i8), Boolean.valueOf(z8), interfaceC2072n4, interfaceC2073o};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i19 = 0;
            boolean z9 = false;
            for (int i20 = 7; i19 < i20; i20 = 7) {
                z9 |= startRestartGroup.changed(objArr[i19]);
                i19++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z9 && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                i11 = 1;
            } else {
                composer2 = startRestartGroup;
                i11 = 1;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = new ScaffoldKt$ScaffoldLayout$1$1(interfaceC2072n, interfaceC2072n2, interfaceC2072n3, i8, z8, interfaceC2072n4, i10, interfaceC2073o);
                composer2.updateRememberedValue(scaffoldKt$ScaffoldLayout$1$1);
                rememberedValue = scaffoldKt$ScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (InterfaceC2072n) rememberedValue, composer2, 0, i11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(z8, i8, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, interfaceC2072n4, i9));
        }
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1569641925);
        if ((i9 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i9 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i8, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}

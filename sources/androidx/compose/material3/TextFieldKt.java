package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import e6.AbstractC2829a;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m5155constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m5155constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m5155constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:103:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0293  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextField(java.lang.String r88, kotlin.jvm.functions.Function1 r89, androidx.compose.ui.Modifier r90, boolean r91, boolean r92, androidx.compose.ui.text.TextStyle r93, c6.InterfaceC2072n r94, c6.InterfaceC2072n r95, c6.InterfaceC2072n r96, c6.InterfaceC2072n r97, c6.InterfaceC2072n r98, boolean r99, androidx.compose.ui.text.input.VisualTransformation r100, androidx.compose.foundation.text.KeyboardOptions r101, androidx.compose.foundation.text.KeyboardActions r102, boolean r103, int r104, androidx.compose.foundation.interaction.MutableInteractionSource r105, androidx.compose.ui.graphics.Shape r106, androidx.compose.material3.TextFieldColors r107, androidx.compose.runtime.Composer r108, int r109, int r110, int r111) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(Modifier modifier, InterfaceC2072n textField, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, float f8, InterfaceC2072n container, InterfaceC2072n interfaceC2072n4, PaddingValues paddingValues, Composer composer, int i8, int i9) {
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
        int i20;
        int i21;
        int i22;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(textField, "textField");
        AbstractC3292y.i(container, "container");
        AbstractC3292y.i(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(1259241976);
        int i23 = 4;
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i10 = i22 | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(textField)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i10 |= i21;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i10 |= i20;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(interfaceC2073o)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i10 |= i19;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i10 |= i18;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i10 |= i17;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i10 |= i16;
        }
        if ((29360128 & i8) == 0) {
            if (startRestartGroup.changed(f8)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i10 |= i15;
        }
        if ((234881024 & i8) == 0) {
            if (startRestartGroup.changed(container)) {
                i14 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i14 = 33554432;
            }
            i10 |= i14;
        }
        if ((1879048192 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n4)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i10 |= i13;
        }
        if ((i9 & 14) == 0) {
            if (!startRestartGroup.changed(paddingValues)) {
                i23 = 2;
            }
            i11 = i9 | i23;
        } else {
            i11 = i9;
        }
        if ((i10 & 1533916891) == 306783378 && (i11 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1259241976, i10, i11, "androidx.compose.material3.TextFieldLayout (TextField.kt:371)");
            }
            Boolean valueOf = Boolean.valueOf(z8);
            Float valueOf2 = Float.valueOf(f8);
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z8, f8, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1036839073);
            container.invoke(startRestartGroup, Integer.valueOf((i10 >> 24) & 14));
            startRestartGroup.startReplaceableGroup(-95277174);
            if (interfaceC2072n2 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion.getConstructor();
                InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2473constructorimpl2 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, density2, companion.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1990589600);
                interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i10 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95276839);
            if (interfaceC2072n3 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion.getConstructor();
                InterfaceC2073o materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl3, density3, companion.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-305264439);
                interfaceC2072n3.invoke(startRestartGroup, Integer.valueOf((i10 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (interfaceC2072n2 != null) {
                i12 = 0;
                calculateStartPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5155constructorimpl(0)));
            } else {
                i12 = 0;
            }
            float f9 = calculateStartPadding;
            if (interfaceC2072n3 != null) {
                calculateEndPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5155constructorimpl(i12)));
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion2, f9, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-95275778);
            if (interfaceC2073o != null) {
                interfaceC2073o.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m581paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i10 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95275578);
            if (interfaceC2072n != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion2, "Label").then(m581paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor4 = companion.getConstructor();
                InterfaceC2073o materializerOf4 = LayoutKt.materializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2473constructorimpl4 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl4, density4, companion.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-2011394041);
                interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion2, "TextField").then(m581paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor5 = companion.getConstructor();
            InterfaceC2073o materializerOf5 = LayoutKt.materializerOf(then4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl5 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl5, density5, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf5.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-369728037);
            textField.invoke(startRestartGroup, Integer.valueOf((i10 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (interfaceC2072n4 != null) {
                Modifier padding = PaddingKt.padding(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldDefaults.m1824supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density6 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor6 = companion.getConstructor();
                InterfaceC2073o materializerOf6 = LayoutKt.materializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2473constructorimpl6 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl6, rememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl6, density6, companion.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl6, layoutDirection7, companion.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl6, viewConfiguration6, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf6.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(-716975194);
                interfaceC2072n4.invoke(startRestartGroup, Integer.valueOf((i10 >> 27) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, textField, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, z8, f8, container, interfaceC2072n4, paddingValues, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-jCXOeKk, reason: not valid java name */
    public static final int m1848calculateHeightjCXOeKk(int i8, boolean z8, int i9, int i10, int i11, int i12, int i13, long j8, float f8, PaddingValues paddingValues) {
        float f9;
        float f10 = TextFieldTopPadding * f8;
        float mo530calculateTopPaddingD9Ej5fM = paddingValues.mo530calculateTopPaddingD9Ej5fM() * f8;
        float mo527calculateBottomPaddingD9Ej5fM = paddingValues.mo527calculateBottomPaddingD9Ej5fM() * f8;
        int max = Math.max(i8, i12);
        if (z8) {
            f9 = i9 + f10 + max + mo527calculateBottomPaddingD9Ej5fM;
        } else {
            f9 = mo530calculateTopPaddingD9Ej5fM + max + mo527calculateBottomPaddingD9Ej5fM;
        }
        return Math.max(Constraints.m5124getMinHeightimpl(j8), Math.max(i10, Math.max(i11, AbstractC2829a.d(f9))) + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1849calculateWidthVsPV1Ek(int i8, int i9, int i10, int i11, int i12, long j8) {
        return Math.max(i8 + Math.max(i10, Math.max(i11, i12)) + i9, Constraints.m5125getMinWidthimpl(j8));
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, BorderStroke indicatorBorder) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(indicatorBorder, "indicatorBorder");
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(indicatorBorder.m285getWidthD9Ej5fM(), indicatorBorder));
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, boolean z8, int i10, int i11, float f8, float f9) {
        int d8;
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m5289getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i9 - TextFieldImplKt.heightOrZero(placeable7);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i8 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                d8 = AbstractC2829a.d(TextFieldImplKt.getTextFieldPadding() * f9);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), d8 - AbstractC2829a.d((d8 - i10) * f8), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i11, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i11, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, boolean z8, float f8, PaddingValues paddingValues) {
        int i10;
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, placeable5, IntOffset.Companion.m5289getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i9 - TextFieldImplKt.heightOrZero(placeable6);
        int d8 = AbstractC2829a.d(paddingValues.mo530calculateTopPaddingD9Ej5fM() * f8);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i8 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (z8) {
            i10 = Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero);
        } else {
            i10 = d8;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), i10, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), d8, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0293  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextField(androidx.compose.ui.text.input.TextFieldValue r88, kotlin.jvm.functions.Function1 r89, androidx.compose.ui.Modifier r90, boolean r91, boolean r92, androidx.compose.ui.text.TextStyle r93, c6.InterfaceC2072n r94, c6.InterfaceC2072n r95, c6.InterfaceC2072n r96, c6.InterfaceC2072n r97, c6.InterfaceC2072n r98, boolean r99, androidx.compose.ui.text.input.VisualTransformation r100, androidx.compose.foundation.text.KeyboardOptions r101, androidx.compose.foundation.text.KeyboardActions r102, boolean r103, int r104, androidx.compose.foundation.interaction.MutableInteractionSource r105, androidx.compose.ui.graphics.Shape r106, androidx.compose.material3.TextFieldColors r107, androidx.compose.runtime.Composer r108, int r109, int r110, int r111) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}

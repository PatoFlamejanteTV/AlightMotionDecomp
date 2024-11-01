package androidx.compose.material3;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m5155constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m5155constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:103:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x035b  */
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
    public static final void OutlinedTextField(java.lang.String r89, kotlin.jvm.functions.Function1 r90, androidx.compose.ui.Modifier r91, boolean r92, boolean r93, androidx.compose.ui.text.TextStyle r94, c6.InterfaceC2072n r95, c6.InterfaceC2072n r96, c6.InterfaceC2072n r97, c6.InterfaceC2072n r98, c6.InterfaceC2072n r99, boolean r100, androidx.compose.ui.text.input.VisualTransformation r101, androidx.compose.foundation.text.KeyboardOptions r102, androidx.compose.foundation.text.KeyboardActions r103, boolean r104, int r105, androidx.compose.foundation.interaction.MutableInteractionSource r106, androidx.compose.ui.graphics.Shape r107, androidx.compose.material3.TextFieldColors r108, androidx.compose.runtime.Composer r109, int r110, int r111, int r112) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(Modifier modifier, InterfaceC2072n textField, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, float f8, Function1 onLabelMeasured, InterfaceC2072n container, InterfaceC2072n interfaceC2072n4, PaddingValues paddingValues, Composer composer, int i8, int i9) {
        int i10;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(textField, "textField");
        AbstractC3292y.i(onLabelMeasured, "onLabelMeasured");
        AbstractC3292y.i(container, "container");
        AbstractC3292y.i(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-222199799);
        int i11 = (i8 & 14) == 0 ? i8 | (startRestartGroup.changed(modifier) ? 4 : 2) : i8;
        if ((i8 & 112) == 0) {
            i11 |= startRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i11 |= startRestartGroup.changed(interfaceC2073o) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i11 |= startRestartGroup.changed(interfaceC2072n) ? 2048 : 1024;
        }
        if ((57344 & i8) == 0) {
            i11 |= startRestartGroup.changed(interfaceC2072n2) ? 16384 : 8192;
        }
        if ((458752 & i8) == 0) {
            i11 |= startRestartGroup.changed(interfaceC2072n3) ? 131072 : 65536;
        }
        if ((3670016 & i8) == 0) {
            i11 |= startRestartGroup.changed(z8) ? 1048576 : 524288;
        }
        if ((29360128 & i8) == 0) {
            i11 |= startRestartGroup.changed(f8) ? 8388608 : 4194304;
        }
        if ((234881024 & i8) == 0) {
            i11 |= startRestartGroup.changed(onLabelMeasured) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i8) == 0) {
            i11 |= startRestartGroup.changed(container) ? 536870912 : 268435456;
        }
        int i12 = i11;
        int i13 = (i9 & 14) == 0 ? i9 | (startRestartGroup.changed(interfaceC2072n4) ? 4 : 2) : i9;
        if ((i9 & 112) == 0) {
            i13 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        int i14 = i13;
        if ((i12 & 1533916891) == 306783378 && (i14 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222199799, i12, i14, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:377)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z8), Float.valueOf(f8), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i15 = 0;
            boolean z9 = false;
            for (int i16 = 4; i15 < i16; i16 = 4) {
                z9 |= startRestartGroup.changed(objArr[i15]);
                i15++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z8, f8, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
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
            Updater.m2480setimpl(m2473constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-147819150);
            container.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1116449790);
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
                startRestartGroup.startReplaceableGroup(2127001777);
                interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116450075);
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
                startRestartGroup.startReplaceableGroup(-827051110);
                interfaceC2072n3.invoke(startRestartGroup, Integer.valueOf((i12 >> 15) & 14));
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
                i10 = 0;
                calculateStartPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5155constructorimpl(0)));
            } else {
                i10 = 0;
            }
            float f9 = calculateStartPadding;
            if (interfaceC2072n3 != null) {
                calculateEndPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5155constructorimpl(i10)));
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion2, f9, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1116451086);
            if (interfaceC2073o != null) {
                interfaceC2073o.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m581paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i12 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m581paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
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
            startRestartGroup.startReplaceableGroup(-475693524);
            textField.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116451412);
            if (interfaceC2072n != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor5 = companion.getConstructor();
                InterfaceC2073o materializerOf5 = LayoutKt.materializerOf(layoutId);
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
                startRestartGroup.startReplaceableGroup(-1527117480);
                interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i12 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
                startRestartGroup.startReplaceableGroup(270332983);
                interfaceC2072n4.invoke(startRestartGroup, Integer.valueOf(i14 & 14));
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
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, textField, interfaceC2073o, interfaceC2072n, interfaceC2072n2, interfaceC2072n3, z8, f8, onLabelMeasured, container, interfaceC2072n4, paddingValues, i8, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1712calculateHeightO3s9Psw(int i8, int i9, int i10, int i11, int i12, int i13, long j8, float f8, PaddingValues paddingValues) {
        return Math.max(Constraints.m5124getMinHeightimpl(j8), Math.max(i8, Math.max(i9, AbstractC2829a.d(Math.max(i10, i12) + (paddingValues.mo527calculateBottomPaddingD9Ej5fM() * f8) + Math.max(paddingValues.mo530calculateTopPaddingD9Ej5fM() * f8, i11 / 2.0f)))) + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1713calculateWidthO3s9Psw(int i8, int i9, int i10, int i11, int i12, boolean z8, long j8, float f8, PaddingValues paddingValues) {
        int i13;
        int i14 = 0;
        if (z8) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        int max = i8 + Math.max(i10, Math.max(i13, i12)) + i9;
        if (!z8) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            i14 = i11 + AbstractC2829a.d(Dp.m5155constructorimpl(paddingValues.mo528calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo529calculateRightPaddingu2uoSUM(layoutDirection)) * f8);
        }
        return Math.max(max, Math.max(i14, Constraints.m5125getMinWidthimpl(j8)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1714outlineCutout12SF9DM(Modifier outlineCutout, long j8, PaddingValues paddingValues) {
        AbstractC3292y.i(outlineCutout, "$this$outlineCutout");
        AbstractC3292y.i(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new OutlinedTextFieldKt$outlineCutout$1(j8, paddingValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, float f8, boolean z8, float f9, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int i10;
        int i11;
        float widthOrZero;
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m5289getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i8 - TextFieldImplKt.heightOrZero(placeable7);
        int d8 = AbstractC2829a.d(paddingValues.mo530calculateTopPaddingD9Ej5fM() * f9);
        int d9 = AbstractC2829a.d(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f9);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f9;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i9 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            if (z8) {
                i11 = Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero);
            } else {
                i11 = d8;
            }
            float f10 = 1 - f8;
            float height = (i11 * f10) - ((placeable4.getHeight() / 2) * f8);
            if (placeable == null) {
                widthOrZero = 0.0f;
            } else {
                widthOrZero = f10 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, AbstractC2829a.d(widthOrZero) + d9, AbstractC2829a.d(height), 0.0f, 4, null);
        }
        if (z8) {
            i10 = Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero);
        } else {
            i10 = d8;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(i10, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), d8, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x035b  */
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
    public static final void OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue r89, kotlin.jvm.functions.Function1 r90, androidx.compose.ui.Modifier r91, boolean r92, boolean r93, androidx.compose.ui.text.TextStyle r94, c6.InterfaceC2072n r95, c6.InterfaceC2072n r96, c6.InterfaceC2072n r97, c6.InterfaceC2072n r98, c6.InterfaceC2072n r99, boolean r100, androidx.compose.ui.text.input.VisualTransformation r101, androidx.compose.foundation.text.KeyboardOptions r102, androidx.compose.foundation.text.KeyboardActions r103, boolean r104, int r105, androidx.compose.foundation.interaction.MutableInteractionSource r106, androidx.compose.ui.graphics.Shape r107, androidx.compose.material3.TextFieldColors r108, androidx.compose.runtime.Composer r109, int r110, int r111, int r112) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}

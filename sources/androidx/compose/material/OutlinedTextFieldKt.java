package androidx.compose.material;

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
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
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
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m5155constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m5155constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(java.lang.String r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, c6.InterfaceC2072n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(Modifier modifier, InterfaceC2072n textField, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, float f8, Function1 onLabelMeasured, InterfaceC2072n border, PaddingValues paddingValues, Composer composer, int i8, int i9) {
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
        int i23;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(textField, "textField");
        AbstractC3292y.i(onLabelMeasured, "onLabelMeasured");
        AbstractC3292y.i(border, "border");
        AbstractC3292y.i(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i8 | i23;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(textField)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i10 |= i21;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i10 |= i20;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i10 |= i19;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n3)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i10 |= i18;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i10 |= i17;
        }
        if ((29360128 & i8) == 0) {
            if (startRestartGroup.changed(f8)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i10 |= i16;
        }
        if ((234881024 & i8) == 0) {
            if (startRestartGroup.changedInstance(onLabelMeasured)) {
                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i15 = 33554432;
            }
            i10 |= i15;
        }
        if ((1879048192 & i8) == 0) {
            if (startRestartGroup.changedInstance(border)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i10 |= i14;
        }
        int i24 = i10;
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i9 | i13;
        } else {
            i11 = i9;
        }
        if ((i24 & 1533916891) == 306783378 && (i11 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i24, i11, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:476)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z8), Float.valueOf(f8), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i25 = 0;
            boolean z9 = false;
            for (int i26 = 4; i25 < i26; i26 = 4) {
                z9 |= startRestartGroup.changed(objArr[i25]);
                i25++;
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
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            border.invoke(startRestartGroup, Integer.valueOf((i24 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169918076);
            if (interfaceC2072n2 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2473constructorimpl2 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i24 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169918361);
            if (interfaceC2072n3 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor3 = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                interfaceC2072n3.invoke(startRestartGroup, Integer.valueOf((i24 >> 15) & 14));
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
            startRestartGroup.startReplaceableGroup(1169919372);
            if (interfaceC2073o != null) {
                interfaceC2073o.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m581paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i24 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m581paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor4 = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl4 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl4.getInserting() || !AbstractC3292y.d(m2473constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m2473constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m2473constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            textField.invoke(startRestartGroup, Integer.valueOf((i24 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-614207951);
            if (interfaceC2072n != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor5 = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2473constructorimpl5 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl5.getInserting() || !AbstractC3292y.d(m2473constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m2473constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m2473constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i24 >> 9) & 14));
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
            endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, textField, interfaceC2073o, interfaceC2072n, interfaceC2072n2, interfaceC2072n3, z8, f8, onLabelMeasured, border, paddingValues, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1273calculateHeightO3s9Psw(int i8, int i9, int i10, int i11, int i12, float f8, long j8, float f9, PaddingValues paddingValues) {
        int max = Math.max(i10, Math.max(i12, MathHelpersKt.lerp(i11, 0, f8)));
        float mo530calculateTopPaddingD9Ej5fM = paddingValues.mo530calculateTopPaddingD9Ej5fM() * f9;
        return Math.max(Constraints.m5124getMinHeightimpl(j8), Math.max(i8, Math.max(i9, AbstractC2829a.d(MathHelpersKt.lerp(mo530calculateTopPaddingD9Ej5fM, Math.max(mo530calculateTopPaddingD9Ej5fM, i11 / 2.0f), f8) + max + (paddingValues.mo527calculateBottomPaddingD9Ej5fM() * f9)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1274calculateWidthO3s9Psw(int i8, int i9, int i10, int i11, int i12, float f8, long j8, float f9, PaddingValues paddingValues) {
        int max = i8 + Math.max(i10, Math.max(MathHelpersKt.lerp(i11, 0, f8), i12)) + i9;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(max, Math.max(AbstractC2829a.d((i11 + (Dp.m5155constructorimpl(paddingValues.mo528calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo529calculateRightPaddingu2uoSUM(layoutDirection)) * f9)) * f8), Constraints.m5125getMinWidthimpl(j8)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1275outlineCutout12SF9DM(Modifier outlineCutout, long j8, PaddingValues paddingValues) {
        AbstractC3292y.i(outlineCutout, "$this$outlineCutout");
        AbstractC3292y.i(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new OutlinedTextFieldKt$outlineCutout$1(j8, paddingValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f8, boolean z8, float f9, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int i10;
        int i11;
        float widthOrZero;
        int d8 = AbstractC2829a.d(paddingValues.mo530calculateTopPaddingD9Ej5fM() * f9);
        int d9 = AbstractC2829a.d(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f9);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f9;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i8), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i9 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i8), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            if (z8) {
                i11 = Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i8);
            } else {
                i11 = d8;
            }
            int lerp = MathHelpersKt.lerp(i11, -(placeable4.getHeight() / 2), f8);
            if (placeable == null) {
                widthOrZero = 0.0f;
            } else {
                widthOrZero = (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f8);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, AbstractC2829a.d(widthOrZero) + d9, lerp, 0.0f, 4, null);
        }
        if (z8) {
            i10 = Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i8);
        } else {
            i10 = d8;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(i10, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i8);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(d8, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m5289getZeronOccac(), 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(java.lang.String r72, kotlin.jvm.functions.Function1 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.TextStyle r77, c6.InterfaceC2072n r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, boolean r82, androidx.compose.ui.text.input.VisualTransformation r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0637  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, c6.InterfaceC2072n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, c6.InterfaceC2072n r77, c6.InterfaceC2072n r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}

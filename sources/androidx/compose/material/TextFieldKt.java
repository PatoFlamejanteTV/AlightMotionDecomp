package androidx.compose.material;

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

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
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
    /* JADX WARN: Removed duplicated region for block: B:99:0x0652  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextField(java.lang.String r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, c6.InterfaceC2072n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(Modifier modifier, InterfaceC2072n textField, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, float f8, PaddingValues paddingValues, Composer composer, int i8) {
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
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(textField, "textField");
        AbstractC3292y.i(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i9 = i19 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(textField)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i9 |= i18;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i9 |= i17;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i9 |= i16;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i9 |= i15;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i9 |= i14;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i9 |= i13;
        }
        if ((29360128 & i8) == 0) {
            if (startRestartGroup.changed(f8)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i9 |= i12;
        }
        if ((234881024 & i8) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i11 = 33554432;
            }
            i9 |= i11;
        }
        if ((191739611 & i9) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i9, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
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
            Updater.m2480setimpl(m2473constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(254819681);
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
                interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i9 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254819966);
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
                interfaceC2072n3.invoke(startRestartGroup, Integer.valueOf((i9 >> 15) & 14));
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
            startRestartGroup.startReplaceableGroup(254820977);
            if (interfaceC2073o != null) {
                interfaceC2073o.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m581paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i9 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254821106);
            if (interfaceC2072n != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion2, "Label").then(m581paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
                interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i9 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion2, "TextField").then(m581paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor5 = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(then4);
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
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            textField.invoke(startRestartGroup, Integer.valueOf((i9 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, textField, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, z8, f8, paddingValues, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1387calculateHeightO3s9Psw(int i8, boolean z8, int i9, int i10, int i11, int i12, long j8, float f8, PaddingValues paddingValues) {
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
        return Math.max(AbstractC2829a.d(f9), Math.max(Math.max(i10, i11), Constraints.m5124getMinHeightimpl(j8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1388calculateWidthVsPV1Ek(int i8, int i9, int i10, int i11, int i12, long j8) {
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
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z8, int i10, int i11, float f8, float f9) {
        int d8;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i9), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i8 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i9), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i9);
            } else {
                d8 = AbstractC2829a.d(TextFieldImplKt.getTextFieldPadding() * f9);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), d8 - AbstractC2829a.d((d8 - i10) * f8), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i11, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i11, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z8, float f8, PaddingValues paddingValues) {
        int i10;
        int d8 = AbstractC2829a.d(paddingValues.mo530calculateTopPaddingD9Ej5fM() * f8);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i9), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i8 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i9), 0.0f, 4, null);
        }
        if (z8) {
            i10 = Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i9);
        } else {
            i10 = d8;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), i10, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i9);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), d8, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04d1  */
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
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ed  */
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
    /* JADX WARN: Removed duplicated region for block: B:91:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void TextField(java.lang.String r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, c6.InterfaceC2072n r77, c6.InterfaceC2072n r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
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
    /* JADX WARN: Removed duplicated region for block: B:99:0x062c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextField(androidx.compose.ui.text.input.TextFieldValue r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, c6.InterfaceC2072n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final /* synthetic */ void TextField(androidx.compose.ui.text.input.TextFieldValue r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, c6.InterfaceC2072n r77, c6.InterfaceC2072n r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}

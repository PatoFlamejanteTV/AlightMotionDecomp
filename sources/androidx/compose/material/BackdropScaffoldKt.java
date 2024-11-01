package androidx.compose.material;

import Q5.I;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m5155constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackLayerTransition(BackdropValue backdropValue, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, Composer composer, int i8) {
        int i9;
        float f8;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(backdropValue)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        int i13 = i9;
        if ((i13 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i13, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            if (backdropValue == BackdropValue.Revealed) {
                f8 = 0.0f;
            } else {
                f8 = 2.0f;
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
            float mo425toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo425toPx0680j_4(AnimationSlideOffset);
            float f9 = 1;
            float j8 = m.j(BackLayerTransition$lambda$7(animateFloatAsState) - f9, 0.0f, 1.0f);
            float j9 = m.j(f9 - BackLayerTransition$lambda$7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m3108graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3108graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, j8), 0.0f, 0.0f, j8, 0.0f, (f9 - j8) * mo425toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m3108graphicsLayerAp8cVGQ$default);
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
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m3108graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3108graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, j9), 0.0f, 0.0f, j9, 0.0f, (f9 - j9) * (-mo425toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m3108graphicsLayerAp8cVGQ$default2);
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
            Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i13 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, interfaceC2072n, interfaceC2072n2, i8));
        }
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0249  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1089BackdropScaffoldBZszfkY(c6.InterfaceC2072n r49, c6.InterfaceC2072n r50, c6.InterfaceC2072n r51, androidx.compose.ui.Modifier r52, androidx.compose.material.BackdropScaffoldState r53, boolean r54, float r55, float r56, boolean r57, boolean r58, long r59, long r61, androidx.compose.ui.graphics.Shape r63, float r64, long r65, long r67, long r69, c6.InterfaceC2073o r71, androidx.compose.runtime.Composer r72, int r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m1089BackdropScaffoldBZszfkY(c6.n, c6.n, c6.n, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    public static final void BackdropStack(Modifier modifier, InterfaceC2072n interfaceC2072n, Function1 function1, InterfaceC2074p interfaceC2074p, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2074p)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i9, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed(interfaceC2072n) | startRestartGroup.changed(function1) | startRestartGroup.changed(interfaceC2074p);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropStack$1$1(interfaceC2072n, function1, interfaceC2074p, i9);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (InterfaceC2072n) rememberedValue, startRestartGroup, i9 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackdropStack$2(modifier, interfaceC2072n, function1, interfaceC2074p, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1090Scrim3JVO9M(long j8, Function0 function0, boolean z8, Composer composer, int i8) {
        int i9;
        float f8;
        Modifier modifier;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
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
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
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
                ComposerKt.traceEventStart(-92141505, i9, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
                if (z8) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(1010547004);
                if (z8) {
                    Modifier.Companion companion = Modifier.Companion;
                    I i13 = I.f8786a;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(function0);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SuspendingPointerInputFilterKt.pointerInput(companion, i13, (InterfaceC2072n) rememberedValue);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                Color m2938boximpl = Color.m2938boximpl(j8);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m2938boximpl) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new BackdropScaffoldKt$Scrim$1$1(j8, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$Scrim$2(j8, function0, z8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    public static final BackdropScaffoldState rememberBackdropScaffoldState(BackdropValue initialValue, AnimationSpec<Float> animationSpec, Function1 function1, SnackbarHostState snackbarHostState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        if ((i9 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i9 & 4) != 0) {
            function1 = BackdropScaffoldKt$rememberBackdropScaffoldState$1.INSTANCE;
        }
        if ((i9 & 8) != 0) {
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
            ComposerKt.traceEventStart(-862178912, i8, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m2560rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.Companion.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new BackdropScaffoldKt$rememberBackdropScaffoldState$3(initialValue, animationSpec, function1, snackbarHostState), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}

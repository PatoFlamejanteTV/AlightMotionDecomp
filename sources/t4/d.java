package t4;

import Q5.I;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
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
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f39576a = Dp.m5155constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f39577a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f39580d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39581e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39583g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f39584h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ PaddingValues f39585i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f39586j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, float f8, PaddingValues paddingValues, int i8) {
            super(2);
            this.f39577a = modifier;
            this.f39578b = interfaceC2072n;
            this.f39579c = interfaceC2072n2;
            this.f39580d = interfaceC2073o;
            this.f39581e = interfaceC2072n3;
            this.f39582f = interfaceC2072n4;
            this.f39583g = z8;
            this.f39584h = f8;
            this.f39585i = paddingValues;
            this.f39586j = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f39577a, this.f39578b, this.f39579c, this.f39580d, this.f39581e, this.f39582f, this.f39583g, this.f39584h, this.f39585i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39586j | 1));
        }
    }

    public static final void a(Modifier modifier, InterfaceC2072n textField, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, float f8, PaddingValues paddingValues, Composer composer, int i8) {
        int i9;
        int i10;
        boolean z9;
        int i11;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(textField, "textField");
        AbstractC3292y.i(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(2074181738);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2072n) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2073o) ? 2048 : 1024;
        }
        if ((57344 & i8) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2072n2) ? 16384 : 8192;
        }
        if ((458752 & i8) == 0) {
            i9 |= startRestartGroup.changedInstance(interfaceC2072n3) ? 131072 : 65536;
        }
        if ((i8 & 3670016) == 0) {
            i9 |= startRestartGroup.changed(z8) ? 1048576 : 524288;
        }
        if ((i8 & 29360128) == 0) {
            i9 |= startRestartGroup.changed(f8) ? 8388608 : 4194304;
        }
        if ((i8 & 234881024) == 0) {
            i9 |= startRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i9 & 191739611) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074181738, i9, -1, "com.stripe.android.uicore.elements.compat.TextFieldLayout (TextFieldLayout.kt:65)");
            }
            startRestartGroup.startReplaceableGroup(925993573);
            if ((i9 & 3670016) == 1048576) {
                i10 = 29360128;
                z9 = true;
            } else {
                i10 = 29360128;
                z9 = false;
            }
            boolean z10 = ((i10 & i9) == 8388608) | z9 | ((i9 & 234881024) == 67108864);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new e(z8, f8, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            e eVar = (e) rememberedValue;
            startRestartGroup.endReplaceableGroup();
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
            Updater.m2480setimpl(m2473constructorimpl, eVar, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1047033705);
            if (interfaceC2072n2 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(AbstractC4007a.b());
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
            startRestartGroup.startReplaceableGroup(1047042828);
            if (interfaceC2072n3 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(AbstractC4007a.b());
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
                i11 = 0;
                calculateStartPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateStartPadding - AbstractC4007a.a()), Dp.m5155constructorimpl(0)));
            } else {
                i11 = 0;
            }
            float f9 = calculateStartPadding;
            if (interfaceC2072n3 != null) {
                calculateEndPadding = Dp.m5155constructorimpl(m.c(Dp.m5155constructorimpl(calculateEndPadding - AbstractC4007a.a()), Dp.m5155constructorimpl(i11)));
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion2, f9, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1047075021);
            if (interfaceC2073o != null) {
                interfaceC2073o.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m581paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i9 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1047079141);
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
            endRestartGroup.updateScope(new a(modifier, textField, interfaceC2072n, interfaceC2073o, interfaceC2072n2, interfaceC2072n3, z8, f8, paddingValues, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i8, boolean z8, int i9, int i10, int i11, int i12, long j8, float f8, PaddingValues paddingValues) {
        float f9;
        float f10 = f39576a * f8;
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
    public static final int k(int i8, int i9, int i10, int i11, int i12, long j8) {
        return Math.max(i8 + Math.max(i10, Math.max(i11, i12)) + i9, Constraints.m5125getMinWidthimpl(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z8, int i10, int i11, float f8, float f9) {
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
                d8 = AbstractC2829a.d(AbstractC4007a.c() * f9);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, p(placeable4), d8 - AbstractC2829a.d((d8 - i10) * f8), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, p(placeable4), i11, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, p(placeable4), i11, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Placeable.PlacementScope placementScope, int i8, int i9, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z8, float f8, PaddingValues paddingValues) {
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
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, p(placeable3), i10, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z8) {
                d8 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i9);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, p(placeable3), d8, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}

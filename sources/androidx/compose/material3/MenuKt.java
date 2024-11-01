package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    private static final float MenuVerticalMargin = Dp.m5155constructorimpl(48);
    private static final float DropdownMenuItemHorizontalPadding = Dp.m5155constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = Dp.m5155constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m5155constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m5155constructorimpl(280);

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r21, androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r22, androidx.compose.ui.Modifier r23, c6.InterfaceC2073o r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: DropdownMenuContent$lambda-1 */
    public static final float m1667DropdownMenuContent$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: DropdownMenuContent$lambda-3 */
    public static final float m1668DropdownMenuContent$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(InterfaceC2072n text, Function0 onClick, Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, boolean z8, MenuItemColors colors, PaddingValues contentPadding, MutableInteractionSource interactionSource, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(colors, "colors");
        AbstractC3292y.i(contentPadding, "contentPadding");
        AbstractC3292y.i(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(text)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i9 = i18 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(onClick)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i9 |= i17;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i9 |= i16;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i9 |= i15;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i9 |= i14;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i9 |= i13;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changed(colors)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i9 |= i12;
        }
        if ((29360128 & i8) == 0) {
            if (startRestartGroup.changed(contentPadding)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i9 |= i11;
        }
        if ((234881024 & i8) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i10 = 33554432;
            }
            i9 |= i10;
        }
        int i19 = i9;
        if ((191739611 & i19) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i19, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m290clickableO2vRcR0$default(modifier, interactionSource, RippleKt.m1421rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z8, null, null, onClick, 24, null), 0.0f, 1, null);
            float f8 = DropdownMenuItemDefaultMinWidth;
            float f9 = DropdownMenuItemDefaultMaxWidth;
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            Modifier padding = PaddingKt.padding(SizeKt.m628sizeInqDBjuR0$default(fillMaxWidth$default, f8, menuTokens.m2192getListItemContainerHeightD9Ej5fM(), f9, 0.0f, 8, null), contentPadding);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(padding);
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-837672837);
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), menuTokens.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(interfaceC2072n, colors, z8, i19, interfaceC2072n2, rowScopeInstance, text)), composer2, 48);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MenuKt$DropdownMenuItemContent$2(text, onClick, modifier, interfaceC2072n, interfaceC2072n2, z8, colors, contentPadding, interactionSource, i8));
        }
    }

    public static final /* synthetic */ float access$getDropdownMenuItemHorizontalPadding$p() {
        return DropdownMenuItemHorizontalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L19
        L17:
            r0 = 0
            goto L54
        L19:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L26
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L54
        L26:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L2d
            goto L17
        L2d:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L54:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L60
        L5e:
            r2 = 0
            goto L9a
        L60:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L6b
            goto L9a
        L6b:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L72
            goto L5e
        L72:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L9a:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}

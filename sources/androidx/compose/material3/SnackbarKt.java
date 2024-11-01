package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i6.m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = Dp.m5155constructorimpl(600);
    private static final float HeightToFirstLine = Dp.m5155constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m5155constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m5155constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m5155constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m5155constructorimpl(12);

    static {
        float f8 = 8;
        HorizontalSpacingButtonSide = Dp.m5155constructorimpl(f8);
        TextEndExtraSpacing = Dp.m5155constructorimpl(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m1747NewLineButtonSnackbarkKq0p4A(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, TextStyle textStyle, long j8, long j9, Composer composer, int i8) {
        int i9;
        float m5155constructorimpl;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2072n3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(j8)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(j9)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i9, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:248)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m631widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m581paddingqDBjuR0$default);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-363148767);
            Modifier m465paddingFromBaselineVpY3zN4 = AlignmentLineKt.m465paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f8 = HorizontalSpacingButtonSide;
            Modifier m581paddingqDBjuR0$default2 = PaddingKt.m581paddingqDBjuR0$default(m465paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f8, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(m581paddingqDBjuR0$default2);
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
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, density2, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(74621659);
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            if (interfaceC2072n3 == null) {
                m5155constructorimpl = f8;
            } else {
                m5155constructorimpl = Dp.m5155constructorimpl(0);
            }
            Modifier m581paddingqDBjuR0$default3 = PaddingKt.m581paddingqDBjuR0$default(align, 0.0f, 0.0f, m5155constructorimpl, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC2073o materializerOf3 = LayoutKt.materializerOf(m581paddingqDBjuR0$default3);
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
            Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl3, density3, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(1640608516);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor4 = companion3.getConstructor();
            InterfaceC2073o materializerOf4 = LayoutKt.materializerOf(companion);
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
            Updater.m2480setimpl(m2473constructorimpl4, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl4, density4, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1595822816);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j8)), TextKt.getLocalTextStyle().provides(textStyle)}, interfaceC2072n2, startRestartGroup, (i9 & 112) | 8);
            if (interfaceC2072n3 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j9))}, interfaceC2072n3, startRestartGroup, ((i9 >> 3) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(interfaceC2072n, interfaceC2072n2, interfaceC2072n3, textStyle, j8, j9, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m1748OneRowSnackbarkKq0p4A(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, TextStyle textStyle, long j8, long j9, Composer composer, int i8) {
        int i9;
        float m5155constructorimpl;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-903235475);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(interfaceC2072n2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2072n3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(j8)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(j9)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i9, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:293)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = HorizontalSpacing;
            if (interfaceC2072n3 == null) {
                m5155constructorimpl = HorizontalSpacingButtonSide;
            } else {
                m5155constructorimpl = Dp.m5155constructorimpl(0);
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion, f8, 0.0f, m5155constructorimpl, 0.0f, 10, null);
            final String str = "action";
            final String str2 = "dismissAction";
            final String str3 = MimeTypes.BASE_TYPE_TEXT;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.a(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.b(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j10) {
                    float f9;
                    Placeable placeable;
                    Object obj;
                    Placeable placeable2;
                    Object obj2;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    boolean z8;
                    float f10;
                    int max;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    float f11;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j10);
                    f9 = SnackbarKt.ContainerMaxWidth;
                    int min = Math.min(m5123getMaxWidthimpl, Layout.mo419roundToPx0680j_4(f9));
                    List<? extends Measurable> list = measurables;
                    String str4 = str;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        placeable = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj), str4)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Measurable measurable = (Measurable) obj;
                    if (measurable != null) {
                        placeable2 = measurable.mo4108measureBRTryo0(j10);
                    } else {
                        placeable2 = null;
                    }
                    String str5 = str2;
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj2), str5)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) obj2;
                    if (measurable2 != null) {
                        placeable = measurable2.mo4108measureBRTryo0(j10);
                    }
                    Placeable placeable3 = placeable;
                    if (placeable2 != null) {
                        i16 = placeable2.getWidth();
                    } else {
                        i16 = 0;
                    }
                    if (placeable2 != null) {
                        i17 = placeable2.getHeight();
                    } else {
                        i17 = 0;
                    }
                    if (placeable3 != null) {
                        i18 = placeable3.getWidth();
                    } else {
                        i18 = 0;
                    }
                    if (placeable3 != null) {
                        i19 = placeable3.getHeight();
                    } else {
                        i19 = 0;
                    }
                    if (i18 == 0) {
                        f11 = SnackbarKt.TextEndExtraSpacing;
                        i20 = Layout.mo419roundToPx0680j_4(f11);
                    } else {
                        i20 = 0;
                    }
                    int d8 = m.d(((min - i16) - i18) - i20, Constraints.m5125getMinWidthimpl(j10));
                    String str6 = str3;
                    for (Measurable measurable3 : list) {
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable3), str6)) {
                            int i27 = i19;
                            Placeable mo4108measureBRTryo0 = measurable3.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j10, 0, d8, 0, 0, 9, null));
                            int i28 = mo4108measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                            if (i28 != Integer.MIN_VALUE) {
                                int i29 = mo4108measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                if (i29 != Integer.MIN_VALUE) {
                                    if (i28 == i29) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    int i30 = min - i18;
                                    int i31 = i30 - i16;
                                    if (!z8) {
                                        f10 = SnackbarKt.HeightToFirstLine;
                                        int mo419roundToPx0680j_4 = Layout.mo419roundToPx0680j_4(f10) - i28;
                                        max = Math.max(Layout.mo419roundToPx0680j_4(SnackbarTokens.INSTANCE.m2347getTwoLinesContainerHeightD9Ej5fM()), mo4108measureBRTryo0.getHeight() + mo419roundToPx0680j_4);
                                        if (placeable2 != null) {
                                            i21 = (max - placeable2.getHeight()) / 2;
                                        } else {
                                            i21 = 0;
                                        }
                                        i22 = mo419roundToPx0680j_4;
                                        i23 = i21;
                                    } else {
                                        int max2 = Math.max(Layout.mo419roundToPx0680j_4(SnackbarTokens.INSTANCE.m2346getSingleLineContainerHeightD9Ej5fM()), Math.max(i17, i27));
                                        int height = (max2 - mo4108measureBRTryo0.getHeight()) / 2;
                                        if (placeable2 != null && (i26 = placeable2.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) != Integer.MIN_VALUE) {
                                            i25 = (i28 + height) - i26;
                                        } else {
                                            i25 = 0;
                                        }
                                        i23 = i25;
                                        i22 = height;
                                        max = max2;
                                    }
                                    if (placeable3 != null) {
                                        i24 = (max - placeable3.getHeight()) / 2;
                                    } else {
                                        i24 = 0;
                                    }
                                    return MeasureScope.CC.q(Layout, min, max, null, new SnackbarKt$OneRowSnackbar$2$measure$4(mo4108measureBRTryo0, i22, placeable3, i30, i24, placeable2, i31, i23), 4, null);
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.c(this, intrinsicMeasureScope, list, i16);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i16) {
                    return g.d(this, intrinsicMeasureScope, list, i16);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m581paddingqDBjuR0$default);
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
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion2.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1961334364);
            Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, MimeTypes.BASE_TYPE_TEXT), 0.0f, SnackbarVerticalPadding, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion2.getConstructor();
            InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(m579paddingVpY3zN4$default);
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
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, density2, companion2.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-789862614);
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-167734710);
            if (interfaceC2072n2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                InterfaceC2073o materializerOf3 = LayoutKt.materializerOf(layoutId);
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
                Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl3, density3, companion2.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(801714373);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j8)), TextKt.getLocalTextStyle().provides(textStyle)}, interfaceC2072n2, startRestartGroup, (i9 & 112) | 8);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            if (interfaceC2072n3 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor4 = companion2.getConstructor();
                InterfaceC2073o materializerOf4 = LayoutKt.materializerOf(layoutId2);
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
                Updater.m2480setimpl(m2473constructorimpl4, rememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl4, density4, companion2.getSetDensity());
                Updater.m2480setimpl(m2473constructorimpl4, layoutDirection4, companion2.getSetLayoutDirection());
                Updater.m2480setimpl(m2473constructorimpl4, viewConfiguration4, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(88411260);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j9))}, interfaceC2072n3, startRestartGroup, ((i9 >> 3) & 112) | 8);
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
            endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(interfaceC2072n, interfaceC2072n2, interfaceC2072n3, textStyle, j8, j9, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1749SnackbareQBnUkQ(androidx.compose.ui.Modifier r25, c6.InterfaceC2072n r26, c6.InterfaceC2072n r27, boolean r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, long r34, long r36, c6.InterfaceC2072n r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m1749SnackbareQBnUkQ(androidx.compose.ui.Modifier, c6.n, c6.n, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1750SnackbarsDKtq54(androidx.compose.material3.SnackbarData r39, androidx.compose.ui.Modifier r40, boolean r41, androidx.compose.ui.graphics.Shape r42, long r43, long r45, long r47, long r49, long r51, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m1750SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }
}

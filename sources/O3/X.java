package O3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import j4.AbstractC3183h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* loaded from: classes4.dex */
public abstract class X {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7513d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Function0 function02, int i8) {
            super(2);
            this.f7510a = str;
            this.f7511b = function0;
            this.f7512c = function02;
            this.f7513d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            X.a(this.f7510a, this.f7511b, this.f7512c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7513d | 1));
        }
    }

    public static final void a(String merchantName, Function0 acknowledgedCallback, Function0 closeCallback, Composer composer, int i8) {
        int i9;
        Composer composer2;
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(acknowledgedCallback, "acknowledgedCallback");
        AbstractC3292y.i(closeCallback, "closeCallback");
        Composer startRestartGroup = composer.startRestartGroup(1158262956);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(merchantName) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= startRestartGroup.changedInstance(acknowledgedCallback) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= startRestartGroup.changedInstance(closeCallback) ? 256 : 128;
        }
        int i10 = i9;
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1158262956, i10, -1, "com.stripe.android.paymentsheet.ui.SepaMandateScreen (SepaMandateActivity.kt:83)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            Modifier m259backgroundbw27NRU$default = BackgroundKt.m259backgroundbw27NRU$default(companion, materialTheme.getColors(startRestartGroup, i11).m1159getSurface0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m259backgroundbw27NRU$default);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier testTag = TestTagKt.testTag(companion, "SEPA_MANDATE_CLOSE_BUTTON");
            C1360h c1360h = C1360h.f7558a;
            IconButtonKt.IconButton(closeCallback, testTag, false, null, c1360h.a(), startRestartGroup, ((i10 >> 6) & 14) | 24624, 12);
            float f8 = 16;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(PaddingKt.m579paddingVpY3zN4$default(companion, Dp.m5155constructorimpl(f8), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f8), 7, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default);
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
            Updater.m2480setimpl(m2473constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            AbstractC3183h0.a(StringResources_androidKt.stringResource(g4.n.f32419o0, startRestartGroup, 0), null, startRestartGroup, 0, 2);
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(g4.n.f32363B0, new Object[]{merchantName}, startRestartGroup, 64), PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(f8), 1, null), AbstractC3539m.n(materialTheme, startRestartGroup, i11).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getBody1(), startRestartGroup, 48, 0, 65528);
            composer2 = startRestartGroup;
            ButtonKt.Button(acknowledgedCallback, TestTagKt.testTag(SizeKt.m610height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(48)), "SEPA_MANDATE_CONTINUE_BUTTON"), false, null, null, null, null, null, null, c1360h.b(), startRestartGroup, ((i10 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2.endReplaceableGroup();
            composer2.endNode();
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
            endRestartGroup.updateScope(new a(merchantName, acknowledgedCallback, closeCallback, i8));
        }
    }
}

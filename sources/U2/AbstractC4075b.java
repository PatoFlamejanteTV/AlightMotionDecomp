package u2;

import Q5.I;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g4.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.s;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4075b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f40221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, int i8, int i9) {
            super(2);
            this.f40221a = modifier;
            this.f40222b = i8;
            this.f40223c = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4075b.a(this.f40221a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40222b | 1), this.f40223c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0899b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f40224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40225b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40226c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40227d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0899b(Modifier modifier, long j8, int i8, int i9) {
            super(2);
            this.f40224a = modifier;
            this.f40225b = j8;
            this.f40226c = i8;
            this.f40227d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4075b.b(this.f40224a, this.f40225b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40226c | 1), this.f40227d);
        }
    }

    public static final void a(Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1171193611);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171193611, i10, -1, "com.stripe.android.common.ui.BottomSheetLoadingIndicator (LoadingIndicator.kt:18)");
            }
            b(SizeKt.m610height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(s.f40539b, startRestartGroup, 0)), 0L, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(modifier, i8, i9));
        }
    }

    public static final void b(Modifier modifier, long j8, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        long j9;
        Modifier modifier3;
        Modifier modifier4;
        long j10;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1933914630);
        int i13 = i9 & 1;
        if (i13 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i8 | i11;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i9 & 2) == 0) {
                j9 = j8;
                if (startRestartGroup.changed(j9)) {
                    i12 = 32;
                    i10 |= i12;
                }
            } else {
                j9 = j8;
            }
            i12 = 16;
            i10 |= i12;
        } else {
            j9 = j8;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            j10 = j9;
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i9 & 2) != 0) {
                    i10 &= -113;
                }
                modifier4 = modifier2;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i9 & 2) != 0) {
                    j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1154getOnSurface0d7_KjU();
                    i10 &= -113;
                }
                modifier4 = modifier3;
            }
            long j11 = j9;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1933914630, i10, -1, "com.stripe.android.common.ui.LoadingIndicator (LoadingIndicator.kt:31)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f40540c, startRestartGroup, 0);
            float dimensionResource2 = PrimitiveResources_androidKt.dimensionResource(s.f40541d, startRestartGroup, 0);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            d.a(SizeKt.m624size3ABfNKs(Modifier.Companion, dimensionResource), j11, dimensionResource2, 0L, 0, startRestartGroup, i10 & 112, 24);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j10 = j11;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0899b(modifier4, j10, i8, i9));
        }
    }
}

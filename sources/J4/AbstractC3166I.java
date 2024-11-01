package j4;

import R5.AbstractC1435t;
import android.content.Intent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: j4.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3166I {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.I$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33824a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.heading(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.I$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3164G f33825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3164G c3164g) {
            super(1);
            this.f33825a = c3164g;
        }

        public final void a(Intent it) {
            AbstractC3292y.i(it, "it");
            K i8 = this.f33825a.v().i().z().i();
            CardScanSheetResult cardScanSheetResult = (CardScanSheetResult) it.getParcelableExtra("CardScanActivityResult");
            if (cardScanSheetResult == null) {
                cardScanSheetResult = (CardScanSheetResult) new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
            }
            i8.y(cardScanSheetResult);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.I$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3164G f33827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f33828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r4.G f33829d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33830e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, C3164G c3164g, Set set, r4.G g8, int i8) {
            super(2);
            this.f33826a = z8;
            this.f33827b = c3164g;
            this.f33828c = set;
            this.f33829d = g8;
            this.f33830e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3166I.a(this.f33826a, this.f33827b, this.f33828c, this.f33829d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33830e | 1));
        }
    }

    public static final void a(boolean z8, C3164G controller, Set hiddenIdentifiers, r4.G g8, Composer composer, int i8) {
        AbstractC3292y.i(controller, "controller");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-314260694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-314260694, i8, -1, "com.stripe.android.ui.core.elements.CardDetailsSectionElementUI (CardDetailsSectionElementUI.kt:29)");
        }
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        r4.F.a(StringResources_androidKt.stringResource(g4.n.f32372I, startRestartGroup, 0), SemanticsModifierKt.semantics(companion, true, a.f33824a), startRestartGroup, 0, 0);
        startRestartGroup.startReplaceableGroup(-1089014030);
        if (controller.w() && controller.x().invoke()) {
            E0.a(z8, new b(controller), startRestartGroup, i8 & 14);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        r4.i0.a(z8, new r4.h0(r4.G.Companion.a("credit_details"), AbstractC1435t.e(controller.v()), new r4.g0(null, AbstractC1435t.e(controller.v().f()))), hiddenIdentifiers, g8, 0, 0, startRestartGroup, (i8 & 14) | 512 | (r4.h0.f38431g << 3) | (r4.G.f37990d << 9) | (i8 & 7168), 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }
}

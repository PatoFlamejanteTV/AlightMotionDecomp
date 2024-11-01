package r4;

import R5.AbstractC1435t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* renamed from: r4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3905d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3899a f38339b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f38340c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f38341d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38342e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, C3899a c3899a, Set set, G g8, int i8) {
            super(2);
            this.f38338a = z8;
            this.f38339b = c3899a;
            this.f38340c = set;
            this.f38341d = g8;
            this.f38342e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3905d.a(this.f38338a, this.f38339b, this.f38340c, this.f38341d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38342e | 1));
        }
    }

    public static final void a(boolean z8, C3899a controller, Set hiddenIdentifiers, G g8, Composer composer, int i8) {
        AbstractC3292y.i(controller, "controller");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(1383545451);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1383545451, i8, -1, "com.stripe.android.uicore.elements.AddressElementUI (AddressElementUI.kt:22)");
        }
        List b9 = b(A4.f.a(controller.v(), startRestartGroup, 8));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b9) {
            if (!hiddenIdentifiers.contains(((k0) obj).a())) {
                arrayList.add(obj);
            }
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
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
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1145868076);
        int i9 = 0;
        for (Object obj2 : arrayList) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1435t.w();
            }
            int i11 = i9;
            l0.a(z8, (k0) obj2, null, hiddenIdentifiers, g8, 0, 0, startRestartGroup, (i8 & 14) | 4096 | ((i8 << 3) & 57344), 100);
            startRestartGroup.startReplaceableGroup(1145877083);
            if (i11 != AbstractC1435t.o(arrayList)) {
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i12 = MaterialTheme.$stable;
                DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, startRestartGroup, i12).c()), 0.0f, 2, null), AbstractC3539m.n(materialTheme, startRestartGroup, i12).f(), Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, startRestartGroup, i12).c()), 0.0f, startRestartGroup, 0, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = i10;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }

    private static final List b(State state) {
        return (List) state.getValue();
    }
}

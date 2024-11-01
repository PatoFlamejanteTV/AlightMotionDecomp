package g4;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.D;
import r4.G;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f32301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f32302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f32303c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f32304d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f32305e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32306f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f32307g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4, Modifier modifier, int i8, int i9) {
            super(2);
            this.f32301a = interfaceC3813L;
            this.f32302b = interfaceC3813L2;
            this.f32303c = interfaceC3813L3;
            this.f32304d = interfaceC3813L4;
            this.f32305e = modifier;
            this.f32306f = i8;
            this.f32307g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f32301a, this.f32302b, this.f32303c, this.f32304d, this.f32305e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32306f | 1), this.f32307g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f32308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32310c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f32311d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f32312e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32313f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f32314g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, boolean z8, List list, G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f32308a = set;
            this.f32309b = z8;
            this.f32310c = list;
            this.f32311d = g8;
            this.f32312e = modifier;
            this.f32313f = i8;
            this.f32314g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f32308a, this.f32309b, this.f32310c, this.f32311d, this.f32312e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32313f | 1), this.f32314g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f32315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f32317c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f32318d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32319e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D d8, boolean z8, Set set, G g8, int i8) {
            super(2);
            this.f32315a = d8;
            this.f32316b = z8;
            this.f32317c = set;
            this.f32318d = g8;
            this.f32319e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.g(this.f32315a, this.f32316b, this.f32317c, this.f32318d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32319e | 1));
        }
    }

    public static final void a(Set hiddenIdentifiers, boolean z8, List elements, G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3292y.i(elements, "elements");
        Composer startRestartGroup = composer.startRestartGroup(1527302195);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1527302195, i8, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:68)");
        }
        Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
        startRestartGroup.startReplaceableGroup(-483455358);
        int i10 = 0;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth);
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
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1230466951);
        for (Object obj : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1435t.w();
            }
            D d8 = (D) obj;
            startRestartGroup.startReplaceableGroup(-1230465628);
            if (!hiddenIdentifiers.contains(d8.a())) {
                g(d8, z8, hiddenIdentifiers, g8, startRestartGroup, (i8 & 112) | 520 | (G.f37990d << 9) | (i8 & 7168));
            }
            startRestartGroup.endReplaceableGroup();
            i10 = i11;
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
            endRestartGroup.updateScope(new b(hiddenIdentifiers, z8, elements, g8, modifier2, i8, i9));
        }
    }

    public static final void b(InterfaceC3813L hiddenIdentifiersFlow, InterfaceC3813L enabledFlow, InterfaceC3813L elementsFlow, InterfaceC3813L lastTextFieldIdentifierFlow, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3292y.i(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        AbstractC3292y.i(enabledFlow, "enabledFlow");
        AbstractC3292y.i(elementsFlow, "elementsFlow");
        AbstractC3292y.i(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        Composer startRestartGroup = composer.startRestartGroup(-1475980057);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1475980057, i8, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:45)");
        }
        State a9 = A4.f.a(hiddenIdentifiersFlow, startRestartGroup, 8);
        State a10 = A4.f.a(enabledFlow, startRestartGroup, 8);
        State a11 = A4.f.a(elementsFlow, startRestartGroup, 8);
        State a12 = A4.f.a(lastTextFieldIdentifierFlow, startRestartGroup, 8);
        a(c(a9), d(a10), e(a11), f(a12), modifier2, startRestartGroup, (G.f37990d << 9) | 520 | (57344 & i8), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, modifier2, i8, i9));
        }
    }

    private static final Set c(State state) {
        return (Set) state.getValue();
    }

    private static final boolean d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final List e(State state) {
        return (List) state.getValue();
    }

    private static final G f(State state) {
        return (G) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(r4.D r18, boolean r19, java.util.Set r20, r4.G r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i.g(r4.D, boolean, java.util.Set, r4.G, androidx.compose.runtime.Composer, int):void");
    }
}

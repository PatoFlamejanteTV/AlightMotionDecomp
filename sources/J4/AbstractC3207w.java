package j4;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* renamed from: j4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3207w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f34302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(State state) {
            super(2);
            this.f34302a = state;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(171510645, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:49)");
            }
            String c8 = AbstractC3207w.c(this.f34302a);
            if (c8 != null) {
                TextKt.m1391Text4IGK_g(c8, (Modifier) null, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3206v f34303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r4.G f34305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3206v c3206v, boolean z8, r4.G g8) {
            super(2);
            this.f34303a = c3206v;
            this.f34304b = z8;
            this.f34305c = g8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4847getNexteUduSuo;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750276790, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:38)");
            }
            r4.w0 i9 = this.f34303a.h().i();
            boolean z8 = this.f34304b;
            if (AbstractC3292y.d(this.f34305c, this.f34303a.a())) {
                m4847getNexteUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
            } else {
                m4847getNexteUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
            }
            r4.C0.c(i9, z8, m4847getNexteUduSuo, null, null, 0, 0, null, composer, 8, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34306a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3206v f34307b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r4.G f34308c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f34309d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, C3206v c3206v, r4.G g8, int i8) {
            super(2);
            this.f34306a = z8;
            this.f34307b = c3206v;
            this.f34308c = g8;
            this.f34309d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3207w.a(this.f34306a, this.f34307b, this.f34308c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34309d | 1));
        }
    }

    public static final void a(boolean z8, C3206v element, r4.G g8, Composer composer, int i8) {
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-1062029600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062029600, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI (BsbElementUI.kt:22)");
        }
        State a9 = A4.f.a(element.h().i().getError(), startRestartGroup, 8);
        State a10 = A4.f.a(element.g(), startRestartGroup, 8);
        r4.C b9 = b(a9);
        startRestartGroup.startReplaceableGroup(-505119412);
        String str = null;
        if (b9 != null) {
            Object[] b10 = b9.b();
            startRestartGroup.startReplaceableGroup(-505118554);
            if (b10 != null) {
                str = StringResources_androidKt.stringResource(b9.a(), Arrays.copyOf(b10, b10.length), startRestartGroup, 64);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-505118984);
            if (str == null) {
                str = StringResources_androidKt.stringResource(b9.a(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
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
        r4.p0.a(null, str, null, false, false, ComposableLambdaKt.composableLambda(startRestartGroup, 171510645, true, new a(a10)), ComposableLambdaKt.composableLambda(startRestartGroup, 750276790, true, new b(element, z8, g8)), startRestartGroup, 1769478, 28);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, element, g8, i8));
        }
    }

    private static final r4.C b(State state) {
        return (r4.C) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(State state) {
        return (String) state.getValue();
    }
}

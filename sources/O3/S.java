package O3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class S {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaddingValues f7258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f7259e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f7260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, boolean z9, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, InterfaceC2073o interfaceC2073o) {
            super(2);
            this.f7255a = z8;
            this.f7256b = z9;
            this.f7257c = function0;
            this.f7258d = paddingValues;
            this.f7259e = vertical;
            this.f7260f = interfaceC2073o;
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
                ComposerKt.traceEventStart(-1029411776, i8, -1, "com.stripe.android.paymentsheet.ui.RowButton.<anonymous> (RowButton.kt:36)");
            }
            Modifier padding = PaddingKt.padding(SelectableKt.m802selectableXHw0xAI$default(Modifier.Companion, this.f7255a, this.f7256b, null, this.f7257c, 4, null), this.f7258d);
            Arrangement.Vertical vertical = this.f7259e;
            InterfaceC2073o interfaceC2073o = this.f7260f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            interfaceC2073o.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7262b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7263c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7264d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PaddingValues f7265e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f7266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f7267g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f7268h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7269i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7270j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, boolean z10, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, Modifier modifier, InterfaceC2073o interfaceC2073o, int i8, int i9) {
            super(2);
            this.f7261a = z8;
            this.f7262b = z9;
            this.f7263c = z10;
            this.f7264d = function0;
            this.f7265e = paddingValues;
            this.f7266f = vertical;
            this.f7267g = modifier;
            this.f7268h = interfaceC2073o;
            this.f7269i = i8;
            this.f7270j = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            S.a(this.f7261a, this.f7262b, this.f7263c, this.f7264d, this.f7265e, this.f7266f, this.f7267g, this.f7268h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7269i | 1), this.f7270j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0 r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.ui.Modifier r35, c6.InterfaceC2073o r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.S.a(boolean, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }
}

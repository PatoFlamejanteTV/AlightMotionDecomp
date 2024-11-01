package Q3;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import x4.C4224g;

/* loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4224g f8611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, int i8, boolean z8, C4224g c4224g, Modifier modifier, int i9, int i10) {
            super(2);
            this.f8608a = list;
            this.f8609b = i8;
            this.f8610c = z8;
            this.f8611d = c4224g;
            this.f8612e = modifier;
            this.f8613f = i9;
            this.f8614g = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            l.a(this.f8608a, this.f8609b, this.f8610c, this.f8611d, this.f8612e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8613f | 1), this.f8614g);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, C4224g imageLoader, Modifier modifier, Composer composer, int i9, int i10) {
        Modifier modifier2;
        boolean z9;
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(-317174614);
        if ((i10 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-317174614, i9, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodVerticalLayoutUI (NewPaymentMethodVerticalLayoutUI.kt:19)");
        }
        Modifier testTag = TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI");
        Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m491spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        startRestartGroup.startReplaceableGroup(-1479332989);
        int i11 = 0;
        for (Object obj : paymentMethods) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1435t.w();
            }
            e eVar = (e) obj;
            if (i11 == i8) {
                z9 = true;
            } else {
                z9 = false;
            }
            k.b(z8, z9, eVar, imageLoader, null, startRestartGroup, ((i9 >> 6) & 14) | 512 | (C4224g.f41044g << 9) | (i9 & 7168), 16);
            i11 = i12;
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
            endRestartGroup.updateScope(new a(paymentMethods, i8, z8, imageLoader, modifier2, i9, i10));
        }
    }
}

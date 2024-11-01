package Q3;

import O3.AbstractC1353a;
import O3.Q;
import Q5.I;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8535a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState) {
            super(0);
            this.f8535a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m51invoke() {
            this.f8535a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8537b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4127g f8538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1, C4127g c4127g) {
            super(0);
            this.f8536a = mutableState;
            this.f8537b = function1;
            this.f8538c = c4127g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.f8536a.setValue(Boolean.FALSE);
            this.f8537b.invoke(this.f8538c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f8539a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            this.f8539a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C4127g c4127g, Function1 function1, int i8) {
            super(2);
            this.f8540a = c4127g;
            this.f8541b = function1;
            this.f8542c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f8540a, this.f8541b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8542c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8543a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, C4127g c4127g) {
            super(0);
            this.f8544a = function1;
            this.f8545b = c4127g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            this.f8544a.invoke(this.f8545b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8546a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8547b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C4127g c4127g, Function1 function1, int i8) {
            super(2);
            this.f8546a = c4127g;
            this.f8547b = function1;
            this.f8548c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            h.b(this.f8546a, this.f8547b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8548c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q3.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0177h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8549a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0177h(String str) {
            super(1);
            this.f8549a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f8549a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageVector f8551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8552c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8553d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8554e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8555f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j8, ImageVector imageVector, Function0 function0, String str, Modifier modifier, int i8) {
            super(2);
            this.f8550a = j8;
            this.f8551b = imageVector;
            this.f8552c = function0;
            this.f8553d = str;
            this.f8554e = modifier;
            this.f8555f = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            h.c(this.f8550a, this.f8551b, this.f8552c, this.f8553d, this.f8554e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8555f | 1));
        }
    }

    public static final void a(C4127g paymentMethod, Function1 deletePaymentMethod, Composer composer, int i8) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(deletePaymentMethod, "deletePaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(292197921);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292197921, i8, -1, "com.stripe.android.paymentsheet.verticalmode.DeleteIcon (ManageScreenIcons.kt:32)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f8543a, startRestartGroup, 3080, 6);
        String str = paymentMethod.d().f25631a;
        long m2982getRed0d7_KjU = Color.Companion.m2982getRed0d7_KjU();
        ImageVector close = CloseKt.getClose(Icons.Filled.INSTANCE);
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "manage_screen_delete_icon_" + str);
        String a9 = AbstractC1353a.a(AbstractC4246a.a(paymentMethod.e(), startRestartGroup, 8));
        startRestartGroup.startReplaceableGroup(1499725548);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        c(m2982getRed0d7_KjU, close, (Function0) rememberedValue, a9, testTag, startRestartGroup, 6);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            b bVar = new b(mutableState, deletePaymentMethod, paymentMethod);
            startRestartGroup.startReplaceableGroup(1499740045);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new c(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Q.a(paymentMethod, bVar, (Function0) rememberedValue2, startRestartGroup, 8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(paymentMethod, deletePaymentMethod, i8));
        }
    }

    public static final void b(C4127g paymentMethod, Function1 editPaymentMethod, Composer composer, int i8) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(editPaymentMethod, "editPaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(-38368896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-38368896, i8, -1, "com.stripe.android.paymentsheet.verticalmode.EditIcon (ManageScreenIcons.kt:63)");
        }
        String str = paymentMethod.d().f25631a;
        c(Color.Companion.m2978getGray0d7_KjU(), EditKt.getEdit(Icons.Filled.INSTANCE), new f(editPaymentMethod, paymentMethod), AbstractC1353a.a(AbstractC4246a.a(paymentMethod.c(), startRestartGroup, 8)), TestTagKt.testTag(Modifier.Companion, "manage_screen_edit_icon_" + str), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(paymentMethod, editPaymentMethod, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(long j8, ImageVector imageVector, Function0 function0, String str, Modifier modifier, Composer composer, int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1677263696);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i9 = i14 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(imageVector)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i9 |= i13;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i9 |= i12;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i9 |= i11;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i9 |= i10;
        }
        if ((46811 & i9) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677263696, i9, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingIcon (ManageScreenIcons.kt:85)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m292clickableXHw0xAI$default = ClickableKt.m292clickableXHw0xAI$default(BackgroundKt.m259backgroundbw27NRU$default(SizeKt.m624size3ABfNKs(ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape()), Dp.m5155constructorimpl(24)), j8, null, 2, null), false, null, null, function0, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m292clickableXHw0xAI$default);
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
            long m2985getWhite0d7_KjU = Color.Companion.m2985getWhite0d7_KjU();
            Modifier m624size3ABfNKs = SizeKt.m624size3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-1665294661);
            if ((i9 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0177h(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1244Iconww6aTOc(imageVector, (String) null, SemanticsModifierKt.semantics$default(m624size3ABfNKs, false, (Function1) rememberedValue, 1, null), m2985getWhite0d7_KjU, startRestartGroup, ((i9 >> 3) & 14) | 3120, 0);
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
            endRestartGroup.updateScope(new i(j8, imageVector, function0, str, modifier, i8));
        }
    }
}

package G3;

import D3.f;
import G3.f;
import G3.h;
import Q5.I;
import R5.a0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.w;
import j4.C0;
import j4.D0;
import j4.I0;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3269a;
import n2.AbstractC3394E;
import o4.AbstractC3539m;
import r4.AbstractC3905d;
import r4.C;
import r4.C3899a;
import r4.F;
import r4.G;
import r4.Q;
import r4.T;
import r4.d0;
import r4.e0;
import r4.f0;
import r4.p0;
import r4.w0;
import v3.w;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f2878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2880d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2881e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0054a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f2882a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0054a(MutableState mutableState) {
                super(0);
                this.f2882a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5invoke() {
                e.c(this.f2882a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, MutableState mutableState, int i8, String str, String str2) {
            super(2);
            this.f2877a = z8;
            this.f2878b = mutableState;
            this.f2879c = i8;
            this.f2880d = str;
            this.f2881e = str2;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988669001, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsForm.<anonymous>.<anonymous> (USBankAccountForm.kt:416)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(PaddingKt.m581paddingqDBjuR0$default(PaddingKt.m579paddingVpY3zN4$default(SizeKt.m612heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(56), 0.0f, 2, null), 0.0f, Dp.m5155constructorimpl(12), 1, null), Dp.m5155constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 11, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            boolean z8 = this.f2877a;
            MutableState mutableState = this.f2878b;
            int i9 = this.f2879c;
            String str = this.f2880d;
            String str2 = this.f2881e;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = arrangement.m491spacedBy0680j_4(Dp.m5155constructorimpl(f8));
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m491spacedBy0680j_4, centerVertically2, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            float f9 = 24;
            ImageKt.Image(PainterResources_androidKt.painterResource(i9, composer, 0), (String) null, SizeKt.m624size3ABfNKs(companion, Dp.m5155constructorimpl(f9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            TextKt.m1391Text4IGK_g(str + " •••• " + str2, AlphaKt.alpha(companion, z8 ? 0.5f : 1.0f), AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean z9 = !z8;
            Modifier m624size3ABfNKs = SizeKt.m624size3ABfNKs(companion, Dp.m5155constructorimpl(f9));
            composer.startReplaceableGroup(-224308683);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0054a(mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, m624size3ABfNKs, z9, null, G3.a.f2826a.a(), composer, 24624, 8);
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
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f2883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f2884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, MutableState mutableState) {
            super(0);
            this.f2883a = function0;
            this.f2884b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            e.c(this.f2884b, false);
            this.f2883a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f2885a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f2885a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            e.c(this.f2885a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2888c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2889d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0 f2890e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f2891f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2892g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, String str, String str2, C0 c02, Function0 function0, int i8) {
            super(2);
            this.f2886a = z8;
            this.f2887b = z9;
            this.f2888c = str;
            this.f2889d = str2;
            this.f2890e = c02;
            this.f2891f = function0;
            this.f2892g = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f2886a, this.f2887b, this.f2888c, this.f2889d, this.f2890e, this.f2891f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2892g | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0055e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0055e f2893a = new C0055e();

        C0055e() {
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
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F3.a f2894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2897d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f2898e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2899f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f2900g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f2901h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f2902i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Q f2903j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3899a f2904k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ G f2905l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ e0 f2906m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C0 f2907n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f2908o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f2909p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f2910q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(F3.a aVar, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 w0Var, w0 w0Var2, Q q8, C3899a c3899a, G g8, e0 e0Var, C0 c02, Function0 function0, int i8, int i9) {
            super(2);
            this.f2894a = aVar;
            this.f2895b = str;
            this.f2896c = str2;
            this.f2897d = z8;
            this.f2898e = z9;
            this.f2899f = z10;
            this.f2900g = z11;
            this.f2901h = w0Var;
            this.f2902i = w0Var2;
            this.f2903j = q8;
            this.f2904k = c3899a;
            this.f2905l = g8;
            this.f2906m = e0Var;
            this.f2907n = c02;
            this.f2908o = function0;
            this.f2909p = i8;
            this.f2910q = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.d(this.f2894a, this.f2895b, this.f2896c, this.f2897d, this.f2898e, this.f2899f, this.f2900g, this.f2901h, this.f2902i, this.f2903j, this.f2904k, this.f2905l, this.f2906m, this.f2907n, this.f2908o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2909p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f2910q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2911a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3899a f2912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f2913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, C3899a c3899a, G g8) {
            super(2);
            this.f2911a = z8;
            this.f2912b = c3899a;
            this.f2913c = g8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754596004, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:379)");
            }
            AbstractC3905d.a(!this.f2911a, this.f2912b, a0.f(), this.f2913c, composer, (C3899a.f38239c << 3) | 384 | (G.f37990d << 9));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3899a f2915b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f2916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f2917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C3899a c3899a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2914a = z8;
            this.f2915b = c3899a;
            this.f2916c = g8;
            this.f2917d = e0Var;
            this.f2918e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.e(this.f2914a, this.f2915b, this.f2916c, this.f2917d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2918e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F3.a f2919a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2920b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2921c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f2923e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f2924f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f2925g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3899a f2926h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f2927i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f2928j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f2929k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(F3.a aVar, boolean z8, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3899a c3899a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2919a = aVar;
            this.f2920b = z8;
            this.f2921c = z9;
            this.f2922d = z10;
            this.f2923e = w0Var;
            this.f2924f = w0Var2;
            this.f2925g = q8;
            this.f2926h = c3899a;
            this.f2927i = g8;
            this.f2928j = e0Var;
            this.f2929k = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.g(this.f2919a, this.f2920b, this.f2921c, this.f2922d, this.f2923e, this.f2924f, this.f2925g, this.f2926h, this.f2927i, this.f2928j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2929k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F3.a f2931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2933d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f2934e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f2935f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f2936g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3899a f2937h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ G f2938i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e0 f2939j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f2940k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z8, F3.a aVar, boolean z9, boolean z10, w0 w0Var, w0 w0Var2, Q q8, C3899a c3899a, G g8, e0 e0Var, int i8) {
            super(2);
            this.f2930a = z8;
            this.f2931b = aVar;
            this.f2932c = z9;
            this.f2933d = z10;
            this.f2934e = w0Var;
            this.f2935f = w0Var2;
            this.f2936g = q8;
            this.f2937h = c3899a;
            this.f2938i = g8;
            this.f2939j = e0Var;
            this.f2940k = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.h(this.f2930a, this.f2931b, this.f2932c, this.f2933d, this.f2934e, this.f2935f, this.f2936g, this.f2937h, this.f2938i, this.f2939j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2940k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f2942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z8, Q q8, int i8) {
            super(2);
            this.f2941a = z8;
            this.f2942b = q8;
            this.f2943c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278787130, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection.<anonymous>.<anonymous> (USBankAccountForm.kt:343)");
            }
            T.b(!this.f2941a, this.f2942b, null, null, false, false, null, null, this.f2943c, composer, Q.f38112s << 3, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f2945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Q q8, int i8, int i9) {
            super(2);
            this.f2944a = z8;
            this.f2945b = q8;
            this.f2946c = i8;
            this.f2947d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.i(this.f2944a, this.f2945b, this.f2946c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2947d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class m extends C3269a implements Function0 {
        m(Object obj) {
            super(0, obj, G3.h.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            G3.h.K((G3.h) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class n extends C3269a implements Function0 {
        n(Object obj) {
            super(0, obj, G3.h.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            G3.h.K((G3.h) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o extends C3269a implements Function0 {
        o(Object obj) {
            super(0, obj, G3.h.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
        }

        public final void a() {
            G3.h.K((G3.h) this.receiver, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F3.a f2948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G3.d f2949b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f2950c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2951d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2952e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(F3.a aVar, G3.d dVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f2948a = aVar;
            this.f2949b = dVar;
            this.f2950c = modifier;
            this.f2951d = i8;
            this.f2952e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.k(this.f2948a, this.f2949b, this.f2950c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2951d | 1), this.f2952e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G3.d f2953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F3.a f2954b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(G3.d dVar, F3.a aVar) {
            super(0);
            this.f2953a = dVar;
            this.f2954b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h.c invoke() {
            f.e.d dVar;
            boolean d8 = this.f2953a.d();
            String c8 = this.f2953a.c();
            boolean m8 = this.f2953a.m();
            boolean o8 = this.f2953a.o();
            boolean p8 = this.f2953a.p();
            String n8 = this.f2953a.n();
            String a9 = this.f2953a.a();
            String e8 = this.f2953a.e();
            D3.f b9 = this.f2953a.b();
            if (b9 instanceof f.e.d) {
                dVar = (f.e.d) b9;
            } else {
                dVar = null;
            }
            return new h.c(d8, this.f2954b, m8, o8, p8, n8, a9, e8, dVar, this.f2953a.l(), c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, boolean z9, String str, String str2, C0 c02, Function0 function0, Composer composer, int i8) {
        int i9;
        boolean z10;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(964687804);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z9)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(c02)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((i8 & 458752) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(964687804, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsForm (USBankAccountForm.kt:401)");
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) C0055e.f2893a, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(1846469047);
            if ((i9 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = Integer.valueOf(G3.b.f2829a.a(str));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f8), 7, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            int i16 = i9;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default);
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
            F.a(StringResources_androidKt.stringResource(AbstractC3394E.f35199J0, startRestartGroup, 0), PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(f8), 1, null), startRestartGroup, 48, 0);
            composer2 = startRestartGroup;
            p0.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1988669001, true, new a(z9, mutableState, intValue, str, str2)), composer2, 196614, 30);
            composer2.startReplaceableGroup(-670014273);
            if (z8) {
                D0.a(true, c02, PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 0.0f, 13, null), composer2, (C0.f33753g << 3) | 390 | ((i16 >> 9) & 112), 0);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (b(mutableState) && str2 != null) {
                boolean z11 = false;
                String stringResource = StringResources_androidKt.stringResource(w.f40599W, composer2, 0);
                String stringResource2 = StringResources_androidKt.stringResource(w.f40607c, new Object[]{str2}, composer2, 64);
                String stringResource3 = StringResources_androidKt.stringResource(AbstractC3394E.f35191F0, composer2, 0);
                String stringResource4 = StringResources_androidKt.stringResource(AbstractC3394E.f35215V, composer2, 0);
                composer2.startReplaceableGroup(1846556855);
                boolean changed = composer2.changed(mutableState);
                if ((i16 & 458752) == 131072) {
                    z11 = true;
                }
                boolean z12 = changed | z11;
                Object rememberedValue2 = composer2.rememberedValue();
                if (z12 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new b(function0, mutableState);
                    composer2.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1846560597);
                boolean changed2 = composer2.changed(mutableState);
                Object rememberedValue3 = composer2.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceableGroup();
                I0.a(stringResource, stringResource2, stringResource3, stringResource4, true, function02, (Function0) rememberedValue3, composer2, 24576, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, str, str2, c02, function0, i8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    public static final void d(F3.a formArgs, String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, w0 nameController, w0 emailController, Q phoneController, C3899a addressController, G g8, e0 e0Var, C0 saveForFutureUseElement, Function0 onRemoveAccount, Composer composer, int i8, int i9) {
        AbstractC3292y.i(formArgs, "formArgs");
        AbstractC3292y.i(nameController, "nameController");
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(phoneController, "phoneController");
        AbstractC3292y.i(addressController, "addressController");
        AbstractC3292y.i(saveForFutureUseElement, "saveForFutureUseElement");
        AbstractC3292y.i(onRemoveAccount, "onRemoveAccount");
        Composer startRestartGroup = composer.startRestartGroup(1342947065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1342947065, i8, i9, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountPreviewScreen (USBankAccountForm.kt:209)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
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
        int i10 = i8 >> 12;
        int i11 = i8 >> 9;
        int i12 = i9 << 21;
        h(z9, formArgs, z10, z11, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, (i10 & 14) | 294976 | (i11 & 896) | (i11 & 7168) | (Q.f38112s << 18) | (3670016 & i11) | (C3899a.f38239c << 21) | (29360128 & i12) | (G.f37990d << 24) | (234881024 & i12) | (e0.f38365f << 27) | (i12 & 1879048192));
        int i13 = i8 << 3;
        int i14 = (i10 & 112) | (i11 & 14) | (i13 & 896) | (i13 & 7168) | (C0.f33753g << 12);
        int i15 = i9 << 3;
        a(z8, z10, str, str2, saveForFutureUseElement, onRemoveAccount, startRestartGroup, i14 | (57344 & i15) | (i15 & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(formArgs, str, str2, z8, z9, z10, z11, nameController, emailController, phoneController, addressController, g8, e0Var, saveForFutureUseElement, onRemoveAccount, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z8, C3899a c3899a, G g8, e0 e0Var, Composer composer, int i8) {
        int i9;
        String stringResource;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1259934004);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(c3899a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(g8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(e0Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259934004, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection (USBankAccountForm.kt:359)");
            }
            C f8 = f(A4.f.a(c3899a.getError(), startRestartGroup, 8));
            startRestartGroup.startReplaceableGroup(543132857);
            if (f8 == null) {
                stringResource = null;
            } else {
                Object[] b9 = f8.b();
                startRestartGroup.startReplaceableGroup(543133715);
                if (b9 == null) {
                    stringResource = null;
                } else {
                    stringResource = StringResources_androidKt.stringResource(f8.a(), Arrays.copyOf(b9, b9.length), startRestartGroup, 64);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(543133285);
                if (stringResource == null) {
                    stringResource = StringResources_androidKt.stringResource(f8.a(), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(0));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2480setimpl(m2473constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            p0.a(Integer.valueOf(g4.n.f32408j), stringResource, null, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1754596004, true, new g(z8, c3899a, g8)), startRestartGroup, 1572864, 60);
            composer2.startReplaceableGroup(-433026909);
            if (e0Var != null) {
                f0.a(e0Var.i(), composer2, d0.f38343i);
            }
            composer2.endReplaceableGroup();
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
            endRestartGroup.updateScope(new h(z8, c3899a, g8, e0Var, i8));
        }
    }

    private static final C f(State state) {
        return (C) state.getValue();
    }

    public static final void g(F3.a formArgs, boolean z8, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3899a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        AbstractC3292y.i(formArgs, "formArgs");
        AbstractC3292y.i(nameController, "nameController");
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(phoneController, "phoneController");
        AbstractC3292y.i(addressController, "addressController");
        Composer startRestartGroup = composer.startRestartGroup(-304054933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304054933, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsCollectionScreen (USBankAccountForm.kt:175)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
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
        h(z8, formArgs, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, startRestartGroup, ((i8 >> 3) & 14) | 294976 | (i8 & 896) | (i8 & 7168) | (Q.f38112s << 18) | (3670016 & i8) | (C3899a.f38239c << 21) | (29360128 & i8) | (G.f37990d << 24) | (234881024 & i8) | (e0.f38365f << 27) | (1879048192 & i8));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(formArgs, z8, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, i8));
        }
    }

    public static final void h(boolean z8, F3.a formArgs, boolean z9, boolean z10, w0 nameController, w0 emailController, Q phoneController, C3899a addressController, G g8, e0 e0Var, Composer composer, int i8) {
        String stringResource;
        boolean z11;
        Object obj;
        Composer composer2;
        int m4847getNexteUduSuo;
        int m4847getNexteUduSuo2;
        AbstractC3292y.i(formArgs, "formArgs");
        AbstractC3292y.i(nameController, "nameController");
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(phoneController, "phoneController");
        AbstractC3292y.i(addressController, "addressController");
        Composer startRestartGroup = composer.startRestartGroup(-741145595);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-741145595, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsForm (USBankAccountForm.kt:246)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
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
        if (z10) {
            startRestartGroup.startReplaceableGroup(-1176798194);
            stringResource = StringResources_androidKt.stringResource(w.f40596T, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1176697134);
            stringResource = StringResources_androidKt.stringResource(w.f40608c0, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        F.a(stringResource, PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(8), 1, null), startRestartGroup, 48, 0);
        if (!z8 ? formArgs.c().s() != w.d.b.f27917b : formArgs.c().s() == w.d.b.f27918c) {
            z11 = true;
        } else {
            z11 = false;
        }
        startRestartGroup.startReplaceableGroup(100604713);
        if (z11) {
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(0));
            Alignment centerEnd = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
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
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            obj = null;
            r4.C0.e(null, nameController, ImeAction.Companion.m4847getNexteUduSuo(), !z9, false, null, null, startRestartGroup, 448, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            obj = null;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100619223);
        if (formArgs.c().p() != w.d.b.f27917b) {
            Modifier m577padding3ABfNKs2 = PaddingKt.m577padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), Dp.m5155constructorimpl(0));
            Alignment centerEnd2 = companion2.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (AbstractC3292y.d(g8, G.Companion.n())) {
                m4847getNexteUduSuo2 = ImeAction.Companion.m4845getDoneeUduSuo();
            } else {
                m4847getNexteUduSuo2 = ImeAction.Companion.m4847getNexteUduSuo();
            }
            r4.C0.e(null, emailController, m4847getNexteUduSuo2, !z9, false, null, null, startRestartGroup, 64, 113);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100640863);
        if (formArgs.c().u() == w.d.b.f27918c) {
            if (AbstractC3292y.d(g8, G.Companion.t())) {
                m4847getNexteUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
            } else {
                m4847getNexteUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
            }
            i(z9, phoneController, m4847getNexteUduSuo, startRestartGroup, ((i8 >> 6) & 14) | (Q.f38112s << 3) | ((i8 >> 15) & 112));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(100654761);
        if (formArgs.c().a() == w.d.a.f27913c) {
            int i9 = i8 >> 18;
            composer2 = startRestartGroup;
            e(z9, addressController, g8, e0Var, composer2, (G.f37990d << 6) | ((i8 >> 6) & 14) | (C3899a.f38239c << 3) | (i9 & 112) | (i9 & 896) | (e0.f38365f << 9) | (i9 & 7168));
        } else {
            composer2 = startRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(z8, formArgs, z9, z10, nameController, emailController, phoneController, addressController, g8, e0Var, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z8, Q q8, int i8, Composer composer, int i9) {
        int i10;
        String stringResource;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1862949300);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(q8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(i8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862949300, i10, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection (USBankAccountForm.kt:324)");
            }
            C j8 = j(A4.f.a(q8.getError(), startRestartGroup, 8));
            startRestartGroup.startReplaceableGroup(632028479);
            if (j8 == null) {
                stringResource = null;
            } else {
                Object[] b9 = j8.b();
                startRestartGroup.startReplaceableGroup(632029337);
                if (b9 == null) {
                    stringResource = null;
                } else {
                    stringResource = StringResources_androidKt.stringResource(j8.a(), Arrays.copyOf(b9, b9.length), startRestartGroup, 64);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(632028907);
                if (stringResource == null) {
                    stringResource = StringResources_androidKt.stringResource(j8.a(), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5155constructorimpl(0));
            Alignment centerEnd = Alignment.Companion.getCenterEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
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
            p0.a(null, stringResource, null, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1278787130, true, new k(z8, q8, i8)), startRestartGroup, 1572870, 60);
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
            endRestartGroup.updateScope(new l(z8, q8, i8, i9));
        }
    }

    private static final C j(State state) {
        return (C) state.getValue();
    }

    public static final void k(F3.a formArgs, G3.d usBankAccountFormArgs, Modifier modifier, Composer composer, int i8, int i9) {
        CreationExtras creationExtras;
        Composer composer2;
        Composer composer3;
        AbstractC3292y.i(formArgs, "formArgs");
        AbstractC3292y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
        Composer startRestartGroup = composer.startRestartGroup(336076536);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(336076536, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountForm (USBankAccountForm.kt:59)");
        }
        h.e eVar = new h.e(new q(usBankAccountFormArgs, formArgs));
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) G3.h.class, current, (String) null, eVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            G3.h hVar = (G3.h) viewModel;
            State a9 = A4.f.a(hVar.p(), startRestartGroup, 8);
            State a10 = A4.f.a(hVar.s(), startRestartGroup, 8);
            G3.c.a(hVar, usBankAccountFormArgs, startRestartGroup, 72);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
            G3.f l8 = l(a9);
            if (l8 instanceof f.a) {
                startRestartGroup.startReplaceableGroup(1472164715);
                g(formArgs, usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), hVar.t(), hVar.q(), hVar.u(), hVar.n().s(), m(a10), hVar.x(), startRestartGroup, (Q.f38112s << 18) | 294920 | (C3899a.f38239c << 21) | (G.f37990d << 24) | (e0.f38365f << 27));
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
            } else {
                if (l8 instanceof f.b) {
                    startRestartGroup.startReplaceableGroup(1472980449);
                    f.b bVar = (f.b) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, bVar.p(), bVar.s(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), hVar.t(), hVar.q(), hVar.u(), hVar.n().s(), m(a10), hVar.x(), hVar.z(), new m(hVar), composer3, (Q.f38112s << 27) | 150994952, C3899a.f38239c | (G.f37990d << 3) | (e0.f38365f << 6) | (C0.f33753g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.e) {
                    startRestartGroup.startReplaceableGroup(1474089443);
                    f.e eVar2 = (f.e) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, eVar2.s().getBankName(), eVar2.s().getLast4(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), hVar.t(), hVar.q(), hVar.u(), hVar.n().s(), m(a10), hVar.x(), hVar.z(), new n(hVar), composer3, (Q.f38112s << 27) | 150994952, C3899a.f38239c | (G.f37990d << 3) | (e0.f38365f << 6) | (C0.f33753g << 9));
                    composer3.endReplaceableGroup();
                } else if (l8 instanceof f.d) {
                    startRestartGroup.startReplaceableGroup(1475215425);
                    f.d dVar = (f.d) l8;
                    composer3 = startRestartGroup;
                    d(formArgs, dVar.p(), dVar.u(), usBankAccountFormArgs.m(), usBankAccountFormArgs.d(), l8.h(), usBankAccountFormArgs.p(), hVar.t(), hVar.q(), hVar.u(), hVar.n().s(), m(a10), hVar.x(), hVar.z(), new o(hVar), composer3, (Q.f38112s << 27) | 150994952, C3899a.f38239c | (G.f37990d << 3) | (e0.f38365f << 6) | (C0.f33753g << 9));
                    composer3.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceableGroup(1476229590);
                    composer2.endReplaceableGroup();
                }
                composer2 = composer3;
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new p(formArgs, usBankAccountFormArgs, modifier2, i8, i9));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final G3.f l(State state) {
        return (G3.f) state.getValue();
    }

    private static final G m(State state) {
        return (G) state.getValue();
    }
}

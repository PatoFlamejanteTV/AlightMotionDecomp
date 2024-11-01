package Y2;

import Q5.I;
import Q5.t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import n6.B0;
import n6.M;
import o4.AbstractC3539m;
import r4.C;
import r4.C0;
import r4.Q;
import r4.g0;
import r4.s0;
import r4.w0;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11967a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11968a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11970c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11971a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f11971a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8786a;
            }

            public final void invoke(Throwable th) {
                this.f11971a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusRequester focusRequester, U5.d dVar) {
            super(2, dVar);
            this.f11970c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f11970c, dVar);
            bVar.f11969b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f11968a == 0) {
                t.b(obj);
                B0.l(((M) this.f11969b).getCoroutineContext()).u(new a(this.f11970c));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f11973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Z2.a f11974c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11975d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11976e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11977f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f11978g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11979h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11980i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, w0 w0Var, Z2.a aVar, int i8, FocusRequester focusRequester, boolean z9, InterfaceC2072n interfaceC2072n, int i9, int i10) {
            super(2);
            this.f11972a = z8;
            this.f11973b = w0Var;
            this.f11974c = aVar;
            this.f11975d = i8;
            this.f11976e = focusRequester;
            this.f11977f = z9;
            this.f11978g = interfaceC2072n;
            this.f11979h = i9;
            this.f11980i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f11972a, this.f11973b, this.f11974c, this.f11975d, this.f11976e, this.f11977f, this.f11978g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11979h | 1), this.f11980i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11981a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "LinkLogoIcon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11982a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8) {
            super(2);
            this.f11982a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f11982a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f11984b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f11985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, U5.d dVar) {
            super(2, dVar);
            this.f11984b = function1;
            this.f11985c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f11984b, this.f11985c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f11983a == 0) {
                t.b(obj);
                this.f11984b.invoke(i.e(this.f11985c));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f11987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f11988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f11989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, U5.d dVar) {
            super(2, dVar);
            this.f11987b = focusManager;
            this.f11988c = textInputService;
            this.f11989d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f11987b, this.f11988c, this.f11989d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f11986a == 0) {
                t.b(obj);
                if (i.e(this.f11989d).f() == Z2.a.f13214a && i.e(this.f11989d).i() != null) {
                    this.f11987b.clearFocus(true);
                    TextInputService textInputService = this.f11988c;
                    if (textInputService != null) {
                        textInputService.hideSoftwareKeyboard();
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y2.c f11990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f11993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11994e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Y2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f11990a = cVar;
            this.f11991b = z8;
            this.f11992c = function1;
            this.f11993d = modifier;
            this.f11994e = i8;
            this.f11995f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.c(this.f11990a, this.f11991b, this.f11992c, this.f11993d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11994e | 1), this.f11995f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y2.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0268i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f11997b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f11998c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11999d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f12000e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusRequester f12001f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f12002g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0268i(BringIntoViewRequester bringIntoViewRequester, w0 w0Var, boolean z8, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f11997b = bringIntoViewRequester;
            this.f11998c = w0Var;
            this.f11999d = z8;
            this.f12000e = focusRequester;
            this.f12001f = focusRequester2;
            this.f12002g = focusRequester3;
            this.f12003h = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0268i(this.f11997b, this.f11998c, this.f11999d, this.f12000e, this.f12001f, this.f12002g, this.f12003h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Object e8 = V5.b.e();
            int i8 = this.f11996a;
            FocusRequester focusRequester = null;
            boolean z9 = true;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                BringIntoViewRequester bringIntoViewRequester = this.f11997b;
                this.f11996a = 1;
                if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                    return e8;
                }
            }
            String r8 = this.f11998c.r();
            if (r8 != null && !n.T(r8)) {
                z8 = false;
            } else {
                z8 = true;
            }
            String r9 = this.f11998c.r();
            if (r9 != null && !n.T(r9)) {
                z9 = false;
            }
            boolean z10 = this.f11999d;
            if (z10 && z8) {
                focusRequester = this.f12000e;
            } else if (!z10 && z9) {
                focusRequester = this.f12001f;
            } else {
                FocusRequester focusRequester2 = this.f12002g;
                if (this.f12003h) {
                    focusRequester = focusRequester2;
                }
            }
            if (focusRequester != null) {
                focusRequester.requestFocus();
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0268i) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f12004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState) {
            super(0);
            this.f12004a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m69invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69invoke() {
            i.h(this.f12004a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f12005a = new k();

        k() {
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
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f12006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f12007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f12008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f12009d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12010e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z2.a f12011f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f12012g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12013h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ X2.b f12014i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f12015j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12016k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12017l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, boolean z8, Z2.a aVar, boolean z9, boolean z10, X2.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f12006a = g0Var;
            this.f12007b = w0Var;
            this.f12008c = q8;
            this.f12009d = w0Var2;
            this.f12010e = z8;
            this.f12011f = aVar;
            this.f12012g = z9;
            this.f12013h = z10;
            this.f12014i = bVar;
            this.f12015j = modifier;
            this.f12016k = i8;
            this.f12017l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.d(this.f12006a, this.f12007b, this.f12008c, this.f12009d, this.f12010e, this.f12011f, this.f12012g, this.f12013h, this.f12014i, this.f12015j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12016k | 1), this.f12017l);
        }
    }

    public static final void a(boolean z8, w0 emailController, Z2.a signUpState, int i8, FocusRequester focusRequester, boolean z9, InterfaceC2072n interfaceC2072n, Composer composer, int i9, int i10) {
        FocusRequester focusRequester2;
        boolean z10;
        InterfaceC2072n interfaceC2072n2;
        U5.d dVar;
        boolean z11;
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(1243429650);
        if ((i10 & 16) != 0) {
            startRestartGroup.startReplaceableGroup(-1492093893);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester2 = (FocusRequester) rememberedValue;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if ((i10 & 64) != 0) {
            interfaceC2072n2 = null;
        } else {
            interfaceC2072n2 = interfaceC2072n;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243429650, i9, -1, "com.stripe.android.link.ui.inline.EmailCollection (LinkOptionalInlineSignup.kt:173)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
        C0.c(emailController, z8, i8, FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.e.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), focusRequester2), null, 0, 0, null, startRestartGroup, ((i9 << 3) & 112) | 8 | ((i9 >> 3) & 896), PsExtractor.VIDEO_STREAM_MASK);
        startRestartGroup.startReplaceableGroup(-1293866320);
        if (signUpState == Z2.a.f13215b) {
            float f8 = 8;
            z11 = true;
            dVar = null;
            g4.d.a(SemanticsModifierKt.semantics$default(PaddingKt.m580paddingqDBjuR0(SizeKt.m624size3ABfNKs(companion, Dp.m5155constructorimpl(32)), Dp.m5155constructorimpl(0), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(16), Dp.m5155constructorimpl(f8)), false, a.f11967a, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1155getPrimary0d7_KjU(), Dp.m5155constructorimpl(2), 0L, 0, startRestartGroup, 384, 24);
        } else {
            dVar = null;
            z11 = true;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1293851067);
        if (interfaceC2072n2 != null) {
            interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i9 >> 18) & 14));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (z10) {
            I i11 = I.f8786a;
            startRestartGroup.startReplaceableGroup(-1492059269);
            if ((((57344 & i9) ^ 24576) <= 16384 || !startRestartGroup.changed(focusRequester2)) && (i9 & 24576) != 16384) {
                z11 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(focusRequester2, dVar);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(i11, (InterfaceC2072n) rememberedValue2, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, emailController, signUpState, i8, focusRequester2, z10, interfaceC2072n2, i9, i10));
        }
    }

    public static final void b(Composer composer, int i8) {
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2039774832);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039774832, i8, -1, "com.stripe.android.link.ui.inline.LinkLogo (LinkOptionalInlineSignup.kt:213)");
            }
            if (AbstractC3539m.s(AbstractC3539m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d())) {
                i9 = P2.i.f8042b;
            } else {
                i9 = P2.i.f8043c;
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(i9, startRestartGroup, 0), StringResources_androidKt.stringResource(P2.j.f8045b, startRestartGroup, 0), SemanticsModifierKt.semantics$default(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m5155constructorimpl(16), 0.0f, 11, null), false, d.f11981a, 1, null), Color.Companion.m2984getUnspecified0d7_KjU(), startRestartGroup, 3080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8));
        }
    }

    public static final void c(Y2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3292y.i(viewModel, "viewModel");
        AbstractC3292y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(-1868616687);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868616687, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:61)");
        }
        State a9 = A4.f.a(viewModel.s(), startRestartGroup, 8);
        State a10 = A4.f.a(viewModel.m(), startRestartGroup, 8);
        Y2.e e8 = e(a9);
        startRestartGroup.startReplaceableGroup(-233533584);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(onStateChanged)) || (i8 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(a9);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(onStateChanged, a9, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(e8, (InterfaceC2072n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(e(a9).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a9, null), startRestartGroup, 64);
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        Z2.a f8 = e(a9).f();
        boolean l9 = e(a9).l();
        boolean p8 = viewModel.p();
        X2.b f9 = f(a10);
        int i10 = g0.f38415c;
        int i11 = s0.f38602x;
        d(q8, l8, o8, n8, l9, f8, z8, p8, f9, modifier2, startRestartGroup, i10 | (i11 << 3) | (Q.f38112s << 6) | (i11 << 9) | ((i8 << 15) & 3670016) | ((i8 << 18) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void d(g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, boolean z8, Z2.a signUpState, boolean z9, boolean z10, X2.b bVar, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        MutableState mutableState;
        Composer composer2;
        Integer num;
        AbstractC3292y.i(sectionController, "sectionController");
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(phoneNumberController, "phoneNumberController");
        AbstractC3292y.i(nameController, "nameController");
        AbstractC3292y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(-198300985);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198300985, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:107)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
        startRestartGroup.startReplaceableGroup(726211115);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726213411);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726215459);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        FocusRequester focusRequester2 = (FocusRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726217475);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        FocusRequester focusRequester3 = (FocusRequester) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) k.f12005a, startRestartGroup, 3080, 6);
        State a9 = A4.f.a(sectionController.getError(), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(726224087);
        if (signUpState == Z2.a.f13216c) {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
            EffectsKt.LaunchedEffect(signUpState, new C0268i(bringIntoViewRequester, emailController, z8, focusRequester, focusRequester2, focusRequester3, z10, null), composer2, ((i8 >> 15) & 14) | 64);
        } else {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
        }
        composer2.endReplaceableGroup();
        C i10 = i(a9);
        if (i10 != null) {
            num = Integer.valueOf(i10.a());
        } else {
            num = null;
        }
        boolean g8 = g(mutableState);
        composer2.startReplaceableGroup(726270241);
        MutableState mutableState3 = mutableState;
        boolean changed = composer2.changed(mutableState3);
        Object rememberedValue5 = composer2.rememberedValue();
        if (changed || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new j(mutableState3);
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer2.endReplaceableGroup();
        int i11 = i8 >> 3;
        Composer composer3 = composer2;
        Y2.g.a(num, emailController, phoneNumberController, nameController, signUpState, z9, z8, z10, bVar, g8, (Function0) rememberedValue5, null, focusRequester, focusRequester2, focusRequester3, composer3, (Q.f38112s << 6) | 4160 | (i8 & 896) | (57344 & i11) | (i11 & 458752) | ((i8 << 6) & 3670016) | (29360128 & i8) | (234881024 & i8), 28032, 2048);
        X2.g.a(true, z8, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester), TextAlign.Companion.m5064getStarte0LSkKk(), composer3, ((i8 >> 9) & 112) | 6, 0);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(sectionController, emailController, phoneNumberController, nameController, z8, signUpState, z9, z10, bVar, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y2.e e(State state) {
        return (Y2.e) state.getValue();
    }

    private static final X2.b f(State state) {
        return (X2.b) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final C i(State state) {
        return (C) state.getValue();
    }
}

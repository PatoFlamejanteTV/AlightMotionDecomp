package r4;

import R5.AbstractC1435t;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import o4.AbstractC3533g;
import z4.AbstractC4269a;

/* loaded from: classes4.dex */
public abstract class T {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f38153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38154b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q q8, boolean z8, int i8) {
            super(2);
            this.f38153a = q8;
            this.f38154b = z8;
            this.f38155c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.a(this.f38153a, this.f38154b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38155c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f38156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusManager focusManager) {
            super(1);
            this.f38156a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f38156a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f38157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusManager focusManager) {
            super(1);
            this.f38157a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f38157a.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2639getNextdhqQ8s());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38158a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f38160c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f38161a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f38161a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Q5.I.f8786a;
            }

            public final void invoke(Throwable th) {
                this.f38161a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FocusRequester focusRequester, U5.d dVar) {
            super(2, dVar);
            this.f38160c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f38160c, dVar);
            dVar2.f38159b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f38158a == 0) {
                Q5.t.b(obj);
                n6.B0.l(((n6.M) this.f38159b).getCoroutineContext()).u(new a(this.f38160c));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f38163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f38164c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38165d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38166e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38167f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f38168g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38169h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38170i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f38171j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38172k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, Q q8, Modifier modifier, InterfaceC2072n interfaceC2072n, boolean z9, boolean z10, FocusRequester focusRequester, InterfaceC2072n interfaceC2072n2, int i8, int i9, int i10) {
            super(2);
            this.f38162a = z8;
            this.f38163b = q8;
            this.f38164c = modifier;
            this.f38165d = interfaceC2072n;
            this.f38166e = z9;
            this.f38167f = z10;
            this.f38168g = focusRequester;
            this.f38169h = interfaceC2072n2;
            this.f38170i = i8;
            this.f38171j = i9;
            this.f38172k = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.b(this.f38162a, this.f38163b, this.f38164c, this.f38165d, this.f38166e, this.f38167f, this.f38168g, this.f38169h, this.f38170i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38171j | 1), this.f38172k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f38173a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Q q8, boolean z8) {
            super(2);
            this.f38173a = q8;
            this.f38174b = z8;
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
                ComposerKt.traceEventStart(2105213479, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:107)");
            }
            T.a(this.f38173a, this.f38174b, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f38176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f38177c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MutableState f38178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, State state, MutableState mutableState, U5.d dVar) {
            super(2, dVar);
            this.f38176b = focusManager;
            this.f38177c = state;
            this.f38178d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f38176b, this.f38177c, this.f38178d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f38175a == 0) {
                Q5.t.b(obj);
                if (T.h(this.f38177c) && T.e(this.f38178d)) {
                    this.f38176b.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2639getNextdhqQ8s());
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends C3289v implements Function1 {
        h(Object obj) {
            super(1, obj, Q.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3292y.i(p02, "p0");
            ((Q) this.receiver).E(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3289v implements Function1 {
        i(Object obj) {
            super(1, obj, Q.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3292y.i(p02, "p0");
            ((Q) this.receiver).E(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6.M f38179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f38180b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f38181a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BringIntoViewRequester f38182b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BringIntoViewRequester bringIntoViewRequester, U5.d dVar) {
                super(2, dVar);
                this.f38182b = bringIntoViewRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f38182b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38181a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    BringIntoViewRequester bringIntoViewRequester = this.f38182b;
                    this.f38181a = 1;
                    if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n6.M m8, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.f38179a = m8;
            this.f38180b = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(FocusState it) {
            AbstractC3292y.i(it, "it");
            if (it.isFocused()) {
                AbstractC3462k.d(this.f38179a, null, null, new a(this.f38180b, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f38183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f38184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Q q8, MutableState mutableState) {
            super(1);
            this.f38183a = q8;
            this.f38184b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(FocusState it) {
            AbstractC3292y.i(it, "it");
            if (T.e(this.f38184b) != it.isFocused()) {
                this.f38183a.h(it.isFocused());
            }
            T.f(this.f38184b, it.isFocused());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f38185a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f38186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Q q8, State state) {
            super(2);
            this.f38185a = q8;
            this.f38186b = state;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            String stringResource;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1058478728, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:160)");
            }
            if (this.f38185a.u()) {
                composer.startReplaceableGroup(-99929277);
                stringResource = StringResources_androidKt.stringResource(AbstractC3533g.f35952E, new Object[]{StringResources_androidKt.stringResource(T.j(this.f38186b), composer, 0)}, composer, 64);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-99744610);
                stringResource = StringResources_androidKt.stringResource(T.j(this.f38186b), composer, 0);
                composer.endReplaceableGroup();
            }
            E.a(stringResource, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f38187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(State state) {
            super(2);
            this.f38187a = state;
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
                ComposerKt.traceEventStart(573533479, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:172)");
            }
            TextKt.m1391Text4IGK_g(T.c(this.f38187a), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f38188a = new n();

        n() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Q q8, boolean z8, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1587728102);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1587728102, i8, -1, "com.stripe.android.uicore.elements.CountryDropdown (PhoneNumberElementUI.kt:206)");
        }
        AbstractC3926z.a(q8.y(), z8, PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, Dp.m5155constructorimpl(16), 0.0f, Dp.m5155constructorimpl(8), 0.0f, 10, null), false, startRestartGroup, (i8 & 112) | 392, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(q8, z8, i8));
        }
    }

    public static final void b(boolean z8, Q controller, Modifier modifier, InterfaceC2072n interfaceC2072n, boolean z9, boolean z10, FocusRequester focusRequester, InterfaceC2072n interfaceC2072n2, int i8, Composer composer, int i9, int i10) {
        Modifier modifier2;
        InterfaceC2072n interfaceC2072n3;
        boolean z11;
        boolean z12;
        FocusRequester focusRequester2;
        InterfaceC2072n interfaceC2072n4;
        int i11;
        boolean z13;
        boolean z14;
        AbstractC3292y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1282164908);
        if ((i10 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 8) != 0) {
            interfaceC2072n3 = ComposableLambdaKt.composableLambda(startRestartGroup, 2105213479, true, new f(controller, z8));
        } else {
            interfaceC2072n3 = interfaceC2072n;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 64) != 0) {
            startRestartGroup.startReplaceableGroup(304087845);
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
        if ((i10 & 128) != 0) {
            interfaceC2072n4 = null;
        } else {
            interfaceC2072n4 = interfaceC2072n2;
        }
        if ((i10 & 256) != 0) {
            i11 = ImeAction.Companion.m4845getDoneeUduSuo();
        } else {
            i11 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1282164908, i9, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI (PhoneNumberElementUI.kt:113)");
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(U5.h.f10149a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        n6.M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(304094669);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        State a9 = A4.f.a(controller.j(), startRestartGroup, 8);
        State a10 = A4.f.a(controller.t(), startRestartGroup, 8);
        State a11 = A4.f.a(controller.getError(), startRestartGroup, 8);
        State a12 = A4.f.a(controller.b(), startRestartGroup, 8);
        State a13 = A4.f.a(controller.C(), startRestartGroup, 8);
        State a14 = A4.f.a(controller.D(), startRestartGroup, 8);
        if (i(a11) != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        TextFieldColors d8 = C0.d(z13, startRestartGroup, 0, 0);
        MutableState mutableState = (MutableState) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) n.f38188a, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(304113619);
        if (z12) {
            z14 = z12;
            EffectsKt.LaunchedEffect(Boolean.valueOf(h(a10)), new g(focusManager, a10, mutableState, null), startRestartGroup, 64);
        } else {
            z14 = z12;
        }
        startRestartGroup.endReplaceableGroup();
        String g8 = g(a9);
        h hVar = new h(controller);
        boolean z15 = z11;
        FocusRequester focusRequester3 = focusRequester2;
        Modifier testTag = TestTagKt.testTag(FocusChangedModifierKt.onFocusChanged(FocusEventModifierKt.onFocusEvent(AbstractC4269a.a(FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), bringIntoViewRequester), focusRequester2), AbstractC1435t.e(AutofillType.PhoneNumberNational), new i(controller), startRestartGroup, 48), new j(coroutineScope, bringIntoViewRequester)), new k(controller, mutableState)), "PhoneNumberTextField");
        l lVar = new l(controller, a12);
        boolean z16 = true;
        TextFieldKt.TextField(g8, (Function1) hVar, testTag, z8, false, (TextStyle) null, (InterfaceC2072n) ComposableLambdaKt.composableLambda(startRestartGroup, 1058478728, true, lVar), (InterfaceC2072n) ComposableLambdaKt.composableLambda(startRestartGroup, 573533479, true, new m(a13)), interfaceC2072n3, interfaceC2072n4, false, d(a14), new KeyboardOptions(0, false, KeyboardType.Companion.m4898getPhonePjHm6EE(), i11, 3, null), new KeyboardActions(new b(focusManager), null, new c(focusManager), null, null, null, 58, null), true, 0, 0, (MutableInteractionSource) null, (Shape) null, d8, startRestartGroup, ((i9 << 9) & 7168) | 14155776 | ((i9 << 15) & 234881024) | ((i9 << 6) & 1879048192), 24576, 492592);
        if (z15) {
            Q5.I i12 = Q5.I.f8786a;
            startRestartGroup.startReplaceableGroup(304182117);
            if ((((3670016 & i9) ^ 1572864) <= 1048576 || !startRestartGroup.changed(focusRequester3)) && (i9 & 1572864) != 1048576) {
                z16 = false;
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z16 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new d(focusRequester3, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(i12, (InterfaceC2072n) rememberedValue4, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(z8, controller, modifier2, interfaceC2072n3, z15, z14, focusRequester3, interfaceC2072n4, i11, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(State state) {
        return (String) state.getValue();
    }

    private static final VisualTransformation d(State state) {
        return (VisualTransformation) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final String g(State state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final C i(State state) {
        return (C) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(State state) {
        return ((Number) state.getValue()).intValue();
    }
}

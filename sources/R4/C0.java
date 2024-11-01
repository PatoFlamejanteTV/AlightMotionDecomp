package r4;

import R5.AbstractC1435t;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import o4.AbstractC3533g;
import o4.AbstractC3539m;
import r4.A0;
import r4.x0;
import z4.AbstractC4269a;

/* loaded from: classes4.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f37866a = CompositionLocalKt.staticCompositionLocalOf(C3895e.f37904a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37867a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(MutableState mutableState) {
            super(0);
            this.f37867a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5565invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5565invoke() {
            C0.t(this.f37867a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.a f37868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f37870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(x0.a aVar, boolean z8, Function1 function1, int i8) {
            super(2);
            this.f37868a = aVar;
            this.f37869b = z8;
            this.f37870c = function1;
            this.f37871d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.r(this.f37868a, this.f37869b, this.f37870c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37871d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.c f37872a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37873b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f37874c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37875d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37876e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(x0.c cVar, boolean z8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f37872a = cVar;
            this.f37873b = z8;
            this.f37874c = modifier;
            this.f37875d = i8;
            this.f37876e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.u(this.f37872a, this.f37873b, this.f37874c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37875d | 1), this.f37876e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f37877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Function0 function0) {
            super(0);
            this.f37877a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5566invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5566invoke() {
            this.f37877a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f37878a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(String autofillType) {
            AbstractC3292y.i(autofillType, "autofillType");
            v2.d.f40434a.a(false).b("LocalAutofillEventReporter " + autofillType + " event not reported");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f37880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(w0 w0Var, Function1 function1) {
            super(1);
            this.f37879a = w0Var;
            this.f37880b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(String it) {
            AbstractC3292y.i(it, "it");
            AutofillType o8 = this.f37879a.o();
            if (o8 != null) {
                this.f37880b.invoke(o8.name());
            }
            this.f37879a.k(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37881a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f37882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(MutableState mutableState, w0 w0Var) {
            super(1);
            this.f37881a = mutableState;
            this.f37882b = w0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(FocusState it) {
            AbstractC3292y.i(it, "it");
            if (((Boolean) this.f37881a.getValue()).booleanValue() != it.isFocused()) {
                this.f37882b.h(it.isFocused());
            }
            this.f37881a.setValue(Boolean.valueOf(it.isFocused()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f37884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(String str, FocusManager focusManager, int i8) {
            super(1);
            this.f37883a = str;
            this.f37884b = focusManager;
            this.f37885c = i8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5567invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
        }

        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m5567invokeZmokQxo(android.view.KeyEvent event) {
            boolean z8;
            AbstractC3292y.i(event, "event");
            if (KeyEventType.m3869equalsimpl0(KeyEvent_androidKt.m3877getTypeZmokQxo(event), KeyEventType.Companion.m3873getKeyDownCS__XNY()) && event.getKeyCode() == 67 && this.f37883a.length() == 0) {
                this.f37884b.mo2644moveFocus3ESFkO8(this.f37885c);
                z8 = true;
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3891a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37888c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3891a(List list, boolean z8, int i8) {
            super(2);
            this.f37886a = list;
            this.f37887b = z8;
            this.f37888c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f37886a, this.f37887b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37888c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3892b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3892b(boolean z8) {
            super(3);
            this.f37889a = z8;
        }

        public final void a(x0.c it, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(it, "it");
            if ((i8 & 14) == 0) {
                if (composer.changed(it)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 |= i9;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089412202, i8, -1, "com.stripe.android.uicore.elements.AnimatedIcons.<anonymous> (TextFieldUI.kt:337)");
            }
            C0.u(it, this.f37889a, null, composer, i8 & 14, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((x0.c) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3893c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3893c(List list, boolean z8, int i8) {
            super(2);
            this.f37890a = list;
            this.f37891b = z8;
            this.f37892c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f37890a, this.f37891b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37892c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3894d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37893a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n6.M f37896d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f37897e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r4.C0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            Object f37898a;

            /* renamed from: b, reason: collision with root package name */
            Object f37899b;

            /* renamed from: c, reason: collision with root package name */
            Object f37900c;

            /* renamed from: d, reason: collision with root package name */
            int f37901d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f37902e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f37903f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, ProduceStateScope produceStateScope, U5.d dVar) {
                super(2, dVar);
                this.f37902e = list;
                this.f37903f = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f37902e, this.f37903f, dVar);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[LOOP:0: B:7:0x0032->B:9:0x0026, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = V5.b.e()
                    int r1 = r7.f37901d
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r7.f37900c
                    r4.x0$c r1 = (r4.x0.c) r1
                    java.lang.Object r3 = r7.f37899b
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r4 = r7.f37898a
                    androidx.compose.runtime.ProduceStateScope r4 = (androidx.compose.runtime.ProduceStateScope) r4
                    Q5.t.b(r8)
                    goto L50
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    Q5.t.b(r8)
                L26:
                    java.util.List r8 = r7.f37902e
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    androidx.compose.runtime.ProduceStateScope r1 = r7.f37903f
                    java.util.Iterator r8 = r8.iterator()
                    r3 = r8
                    r4 = r1
                L32:
                    boolean r8 = r3.hasNext()
                    if (r8 == 0) goto L26
                    java.lang.Object r8 = r3.next()
                    r1 = r8
                    r4.x0$c r1 = (r4.x0.c) r1
                    r7.f37898a = r4
                    r7.f37899b = r3
                    r7.f37900c = r1
                    r7.f37901d = r2
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = n6.X.b(r5, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    r4.setValue(r1)
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: r4.C0.C3894d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3894d(boolean z8, n6.M m8, List list, U5.d dVar) {
            super(2, dVar);
            this.f37895c = z8;
            this.f37896d = m8;
            this.f37897e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            C3894d c3894d = new C3894d(this.f37895c, this.f37896d, this.f37897e, dVar);
            c3894d.f37894b = obj;
            return c3894d;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(ProduceStateScope produceStateScope, U5.d dVar) {
            return ((C3894d) create(produceStateScope, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f37893a == 0) {
                Q5.t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f37894b;
                if (!this.f37895c) {
                    AbstractC3462k.d(this.f37896d, null, null, new a(this.f37897e, produceStateScope, null), 3, null);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: r4.C0$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    /* synthetic */ class C3895e extends C3289v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3895e f37904a = new C3895e();

        C3895e() {
            super(0, C0.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke() {
            return C0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3896f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37908d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37909e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37910f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37911g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FocusRequester f37912h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37913i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f37914j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3896f(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1, int i9, int i10, FocusRequester focusRequester, int i11, int i12) {
            super(2);
            this.f37905a = w0Var;
            this.f37906b = z8;
            this.f37907c = i8;
            this.f37908d = modifier;
            this.f37909e = function1;
            this.f37910f = i9;
            this.f37911g = i10;
            this.f37912h = focusRequester;
            this.f37913i = i11;
            this.f37914j = i12;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.c(this.f37905a, this.f37906b, this.f37907c, this.f37908d, this.f37909e, this.f37910f, this.f37911g, this.f37912h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37913i | 1), this.f37914j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3898h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37916a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f37917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f37918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37919d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f37920e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3898h(MutableState mutableState, FocusManager focusManager, int i8, State state, U5.d dVar) {
            super(2, dVar);
            this.f37917b = mutableState;
            this.f37918c = focusManager;
            this.f37919d = i8;
            this.f37920e = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C3898h(this.f37917b, this.f37918c, this.f37919d, this.f37920e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f37916a == 0) {
                Q5.t.b(obj);
                if (AbstractC3292y.d(C0.h(this.f37920e), A0.a.f37859a) && ((Boolean) this.f37917b.getValue()).booleanValue()) {
                    this.f37918c.mo2644moveFocus3ESFkO8(this.f37919d);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C3898h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3289v implements Function1 {
        i(Object obj) {
            super(1, obj, w0.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0);
        }

        public final void d(x0.a.C0871a p02) {
            AbstractC3292y.i(p02, "p0");
            ((w0) this.receiver).s(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((x0.a.C0871a) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f37921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state) {
            super(1);
            this.f37921a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, C0.p(this.f37921a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FocusManager focusManager) {
            super(1);
            this.f37922a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f37922a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37923a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(FocusManager focusManager, int i8) {
            super(1);
            this.f37923a = focusManager;
            this.f37924b = i8;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f37923a.mo2644moveFocus3ESFkO8(this.f37924b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f37926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f37927c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f37928d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f37929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(w0 w0Var, Function1 function1, State state, State state2, MutableState mutableState) {
            super(1);
            this.f37925a = w0Var;
            this.f37926b = function1;
            this.f37927c = state;
            this.f37928d = state2;
            this.f37929e = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(TextFieldValue newValue) {
            y0 k8;
            AbstractC3292y.i(newValue, "newValue");
            String text = newValue.getText();
            boolean a9 = B0.a(C0.h(this.f37927c), C0.l(this.f37928d), text);
            if (AbstractC3292y.d(text, C0.l(this.f37928d)) || a9) {
                C0.k(this.f37929e, TextRange.m4657boximpl(newValue.m4906getSelectiond9O1mEE()));
            }
            if (!a9 || (k8 = this.f37925a.k(text)) == null) {
                return;
            }
            this.f37926b.invoke(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f37930a = new n();

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37935d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37936e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1) {
            super(2);
            this.f37932a = w0Var;
            this.f37933b = z8;
            this.f37934c = i8;
            this.f37935d = modifier;
            this.f37936e = function1;
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
                ComposerKt.traceEventStart(-1798948745, i8, -1, "com.stripe.android.uicore.elements.TextFieldSection.<anonymous> (TextFieldUI.kt:109)");
            }
            C0.c(this.f37932a, this.f37933b, this.f37934c, this.f37935d, this.f37936e, 0, 0, null, composer, 0, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f37938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37940d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37941e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f37942f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f37943g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37944h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37945i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Modifier modifier, w0 w0Var, int i8, boolean z8, boolean z9, Integer num, Function1 function1, int i9, int i10) {
            super(2);
            this.f37937a = modifier;
            this.f37938b = w0Var;
            this.f37939c = i8;
            this.f37940d = z8;
            this.f37941e = z9;
            this.f37942f = num;
            this.f37943g = function1;
            this.f37944h = i9;
            this.f37945i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.e(this.f37937a, this.f37938b, this.f37939c, this.f37940d, this.f37941e, this.f37942f, this.f37943g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37944h | 1), this.f37945i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f37946a = new r();

        r() {
            super(1);
        }

        public final void invoke(TextFieldValue it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f37947a = new s();

        s() {
            super(1);
        }

        public final void a(x0.a.C0871a it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0871a) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37949b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z8, String str) {
            super(2);
            this.f37948a = z8;
            this.f37949b = str;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            String str;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560051860, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:258)");
            }
            composer.startReplaceableGroup(-771996200);
            if (this.f37948a) {
                str = StringResources_androidKt.stringResource(AbstractC3533g.f35952E, new Object[]{this.f37949b}, composer, 64);
            } else {
                str = this.f37949b;
            }
            String str2 = str;
            composer.endReplaceableGroup();
            r4.E.a(str2, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(2);
            this.f37950a = str;
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
                ComposerKt.traceEventStart(-1625019091, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:272)");
            }
            X.a(this.f37950a, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f37951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f37953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(x0 x0Var, boolean z8, Function1 function1) {
            super(2);
            this.f37951a = x0Var;
            this.f37952b = z8;
            this.f37953c = function1;
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
                ComposerKt.traceEventStart(-1001636886, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:277)");
            }
            x0 x0Var = this.f37951a;
            boolean z8 = this.f37952b;
            Function1 function1 = this.f37953c;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            if (x0Var instanceof x0.c) {
                composer.startReplaceableGroup(-292604158);
                C0.u((x0.c) x0Var, z8, null, composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (x0Var instanceof x0.b) {
                composer.startReplaceableGroup(-292455296);
                Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(companion, Dp.m5155constructorimpl(10));
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
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
                composer.startReplaceableGroup(-56271593);
                x0.b bVar = (x0.b) x0Var;
                Iterator it = bVar.b().iterator();
                while (it.hasNext()) {
                    C0.u((x0.c) it.next(), z8, null, composer, 0, 4);
                }
                composer.endReplaceableGroup();
                C0.a(bVar.a(), z8, composer, 8);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (x0Var instanceof x0.a) {
                composer.startReplaceableGroup(-292035680);
                C0.r((x0.a) x0Var, z8, function1, composer, 8);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-291749581);
                composer.endReplaceableGroup();
            }
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
    public static final class w extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f37954a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37955b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37956c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37957d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37958e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0 f37959f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f37960g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f37961h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f37962i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f37963j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f37964k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f37965l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f37966m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f37967n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f37968o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f37969p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f37970q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(TextFieldValue textFieldValue, boolean z8, boolean z9, String str, String str2, x0 x0Var, boolean z10, boolean z11, Modifier modifier, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function1 function1, Function1 function12, int i8, int i9, int i10) {
            super(2);
            this.f37954a = textFieldValue;
            this.f37955b = z8;
            this.f37956c = z9;
            this.f37957d = str;
            this.f37958e = str2;
            this.f37959f = x0Var;
            this.f37960g = z10;
            this.f37961h = z11;
            this.f37962i = modifier;
            this.f37963j = visualTransformation;
            this.f37964k = keyboardOptions;
            this.f37965l = keyboardActions;
            this.f37966m = function1;
            this.f37967n = function12;
            this.f37968o = i8;
            this.f37969p = i9;
            this.f37970q = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.g(this.f37954a, this.f37955b, this.f37956c, this.f37957d, this.f37958e, this.f37959f, this.f37960g, this.f37961h, this.f37962i, this.f37963j, this.f37964k, this.f37965l, this.f37966m, this.f37967n, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37968o | 1), RecomposeScopeImplKt.updateChangedFlags(this.f37969p), this.f37970q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f37971a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusProperties) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(FocusProperties focusProperties) {
            AbstractC3292y.i(focusProperties, "$this$focusProperties");
            focusProperties.setCanFocus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(MutableState mutableState) {
            super(0);
            this.f37972a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5568invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5568invoke() {
            C0.t(this.f37972a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f37973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f37974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Function1 function1, MutableState mutableState) {
            super(1);
            this.f37973a = function1;
            this.f37974b = mutableState;
        }

        public final void a(x0.a.C0871a item) {
            AbstractC3292y.i(item, "item");
            this.f37973a.invoke(item);
            C0.t(this.f37974b, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0871a) obj);
            return Q5.I.f8786a;
        }
    }

    public static final /* synthetic */ Function1 B() {
        return D();
    }

    private static final Modifier C(Modifier modifier, Function0 function0) {
        if (function0 != null) {
            return ClickableKt.m292clickableXHw0xAI$default(modifier, false, null, null, new D(function0), 7, null);
        }
        return modifier;
    }

    private static final Function1 D() {
        return E.f37878a;
    }

    public static final ProvidableCompositionLocal E() {
        return f37866a;
    }

    private static final Modifier F(Modifier modifier, w0 w0Var, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1079542001);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079542001, i8, -1, "com.stripe.android.uicore.elements.onAutofill (TextFieldUI.kt:485)");
        }
        Modifier a9 = AbstractC4269a.a(modifier, AbstractC1435t.q(w0Var.o()), new F(w0Var, function1), composer, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a9;
    }

    private static final Modifier G(Modifier modifier, w0 w0Var, MutableState mutableState) {
        return FocusChangedModifierKt.onFocusChanged(modifier, new G(mutableState, w0Var));
    }

    private static final Modifier H(Modifier modifier, String str, FocusManager focusManager, int i8) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new H(str, focusManager, i8));
    }

    public static final void a(List icons, boolean z8, Composer composer, int i8) {
        AbstractC3292y.i(icons, "icons");
        Composer startRestartGroup = composer.startRestartGroup(-2067380269);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2067380269, i8, -1, "com.stripe.android.uicore.elements.AnimatedIcons (TextFieldUI.kt:316)");
        }
        if (icons.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C3891a(icons, z8, i8));
                return;
            }
            return;
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(U5.h.f10149a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        n6.M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        CrossfadeKt.Crossfade(b(SnapshotStateKt.produceState(AbstractC1435t.m0(icons), new C3894d(((Boolean) startRestartGroup.consume(AbstractC3539m.j())).booleanValue(), coroutineScope, icons, null), startRestartGroup, 64)), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 2089412202, true, new C3892b(z8)), startRestartGroup, 24576, 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new C3893c(icons, z8, i8));
        }
    }

    private static final x0.c b(State state) {
        return (x0.c) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(r4.w0 r43, boolean r44, int r45, androidx.compose.ui.Modifier r46, kotlin.jvm.functions.Function1 r47, int r48, int r49, androidx.compose.ui.focus.FocusRequester r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C0.c(r4.w0, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, int, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TextFieldColors d(boolean z8, Composer composer, int i8, int i9) {
        boolean z9;
        long h8;
        composer.startReplaceableGroup(-1455690364);
        if ((i9 & 1) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1455690364, i8, -1, "com.stripe.android.uicore.elements.TextFieldColors (TextFieldUI.kt:345)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        if (z9) {
            composer.startReplaceableGroup(278291338);
            h8 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1149getError0d7_KjU();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(278339326);
            h8 = AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h();
            composer.endReplaceableGroup();
        }
        long j8 = h8;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long i11 = AbstractC3539m.n(materialTheme, composer, i10).i();
        long i12 = AbstractC3539m.n(materialTheme, composer, i10).i();
        long i13 = AbstractC3539m.n(materialTheme, composer, i10).i();
        long d8 = AbstractC3539m.n(materialTheme, composer, i10).d();
        Color.Companion companion = Color.Companion;
        long m2983getTransparent0d7_KjU = companion.m2983getTransparent0d7_KjU();
        long m2983getTransparent0d7_KjU2 = companion.m2983getTransparent0d7_KjU();
        TextFieldColors m1376textFieldColorsdx8h9Zs = textFieldDefaults.m1376textFieldColorsdx8h9Zs(j8, 0L, d8, AbstractC3539m.n(materialTheme, composer, i10).k(), 0L, m2983getTransparent0d7_KjU, companion.m2983getTransparent0d7_KjU(), m2983getTransparent0d7_KjU2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, i12, i11, 0L, 0L, i13, 0L, composer, 14352384, 0, 48, 1474322);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1376textFieldColorsdx8h9Zs;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.Modifier r23, r4.w0 r24, int r25, boolean r26, boolean r27, java.lang.Integer r28, kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C0.e(androidx.compose.ui.Modifier, r4.w0, int, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final r4.C f(State state) {
        return (r4.C) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(androidx.compose.ui.text.input.TextFieldValue r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, r4.x0 r40, boolean r41, boolean r42, androidx.compose.ui.Modifier r43, androidx.compose.ui.text.input.VisualTransformation r44, androidx.compose.foundation.text.KeyboardOptions r45, androidx.compose.foundation.text.KeyboardActions r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function1 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C0.g(androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, java.lang.String, java.lang.String, r4.x0, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 h(State state) {
        return (y0) state.getValue();
    }

    private static final Integer i(State state) {
        return (Integer) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final TextRange j(MutableState mutableState) {
        return (TextRange) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MutableState mutableState, TextRange textRange) {
        mutableState.setValue(textRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(State state) {
        return (String) state.getValue();
    }

    private static final x0 m(State state) {
        return (x0) state.getValue();
    }

    private static final boolean n(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean o(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(State state) {
        return (String) state.getValue();
    }

    private static final String q(State state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(x0.a aVar, boolean z8, Function1 function1, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-58118303);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-58118303, i8, -1, "com.stripe.android.uicore.elements.TrailingDropdown (TextFieldUI.kt:398)");
        }
        startRestartGroup.startReplaceableGroup(1538971242);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        boolean z9 = (z8 || aVar.b()) ? false : true;
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier focusProperties = FocusPropertiesKt.focusProperties(companion2, x.f37971a);
        startRestartGroup.startReplaceableGroup(1538978031);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new y(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m292clickableXHw0xAI$default(focusProperties, z9, null, null, (Function0) rememberedValue2, 6, null), "dropdown_menu_clickable");
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0 constructor = companion4.getConstructor();
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
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(companion2, Dp.m5155constructorimpl(10));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(4));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m491spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion4.getConstructor();
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
        Updater.m2480setimpl(m2473constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        u(new x0.c(aVar.a().getIcon().intValue(), null, false, null, 10, null), z8, null, startRestartGroup, i8 & 112, 4);
        startRestartGroup.startReplaceableGroup(-268256612);
        if (z9) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(AbstractC3539m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).i()))}, C3918q.f38587a.a(), startRestartGroup, 56);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean s8 = s(mutableState);
        C2.c d8 = aVar.d();
        x0.a.C0871a a9 = aVar.a();
        List c8 = aVar.c();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        long j8 = AbstractC3539m.n(materialTheme, startRestartGroup, i9).j();
        long h8 = AbstractC3539m.n(materialTheme, startRestartGroup, i9).h();
        startRestartGroup.startReplaceableGroup(-797513728);
        boolean z10 = (((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(function1)) || (i8 & 384) == 256;
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new z(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-797509717);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new A(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        u0.b(s8, d8, a9, c8, function12, j8, h8, (Function0) rememberedValue4, startRestartGroup, 12587584);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new B(aVar, z8, function1, i8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean s(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(r4.x0.c r16, boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C0.u(r4.x0$c, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.C0$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3897g extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3897g f37915a = new C3897g();

        C3897g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return Q5.I.f8786a;
        }

        public final void a(y0 y0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f37931a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return Q5.I.f8786a;
        }

        public final void a(y0 y0Var) {
        }
    }
}

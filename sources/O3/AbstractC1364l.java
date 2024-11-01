package O3;

import O3.C1367o;
import O3.InterfaceC1365m;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import j4.I0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n2.AbstractC3394E;
import o4.AbstractC3532f;
import o4.AbstractC3539m;
import r4.C0;
import r4.p0;
import r4.u0;
import u2.AbstractC4075b;
import u2.AbstractC4076c;
import y4.AbstractC4246a;

/* renamed from: O3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1364l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f7666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, MutableState mutableState) {
            super(0);
            this.f7665a = function1;
            this.f7666b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            if (AbstractC1364l.b(this.f7666b)) {
                return;
            }
            AbstractC1364l.c(this.f7666b, true);
            this.f7665a.invoke(InterfaceC1365m.c.f7710a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f7668b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, MutableState mutableState) {
            super(1);
            this.f7667a = function1;
            this.f7668b = mutableState;
        }

        public final void a(C1367o.a item) {
            AbstractC3292y.i(item, "item");
            AbstractC1364l.c(this.f7668b, false);
            this.f7667a.invoke(new InterfaceC1365m.a(item));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1367o.a) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f7670b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1 function1, MutableState mutableState) {
            super(0);
            this.f7669a = function1;
            this.f7670b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m38invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m38invoke() {
            AbstractC1364l.c(this.f7670b, false);
            this.f7669a.invoke(InterfaceC1365m.b.f7709a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1367o f7671a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f7672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1367o c1367o, Function1 function1, int i8) {
            super(2);
            this.f7671a = c1367o;
            this.f7672b = function1;
            this.f7673c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1364l.a(this.f7671a, this.f7672b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7673c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3289v implements Function1 {
        e(Object obj) {
            super(1, obj, InterfaceC1366n.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;)V", 0);
        }

        public final void d(InterfaceC1365m p02) {
            AbstractC3292y.i(p02, "p0");
            ((InterfaceC1366n) this.receiver).b(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((InterfaceC1365m) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1366n f7674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7675b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7676c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC1366n interfaceC1366n, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7674a = interfaceC1366n;
            this.f7675b = modifier;
            this.f7676c = i8;
            this.f7677d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1364l.d(this.f7674a, this.f7675b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7676c | 1), this.f7677d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1367o f7678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7680c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.l$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7681a = new a();

            a() {
                super(1);
            }

            public final void invoke(String it) {
                AbstractC3292y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.l$g$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f7682a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Modifier modifier) {
                super(2);
                this.f7682a = modifier;
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
                    ComposerKt.traceEventStart(1623512054, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:105)");
                }
                AbstractC1364l.g(StringResources_androidKt.stringResource(AbstractC3394E.f35220a, composer, 0), this.f7682a, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.l$g$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1367o f7683a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f7684b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1367o c1367o, Function1 function1) {
                super(2);
                this.f7683a = c1367o;
                this.f7684b = function1;
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
                    ComposerKt.traceEventStart(1857875321, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:111)");
                }
                AbstractC1364l.a(this.f7683a, this.f7684b, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1367o c1367o, Modifier modifier, Function1 function1) {
            super(2);
            this.f7678a = c1367o;
            this.f7679b = modifier;
            this.f7680c = function1;
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
                ComposerKt.traceEventStart(1330496850, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous> (EditPaymentMethod.kt:97)");
            }
            TextFieldColors d8 = C0.d(false, composer, 6, 0);
            TextFieldKt.TextField("•••• •••• •••• " + this.f7678a.g(), (Function1) a.f7681a, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), false, false, (TextStyle) null, (InterfaceC2072n) ComposableLambdaKt.composableLambda(composer, 1623512054, true, new b(this.f7679b)), (InterfaceC2072n) null, (InterfaceC2072n) null, (InterfaceC2072n) ComposableLambdaKt.composableLambda(composer, 1857875321, true, new c(this.f7678a, this.f7680c)), false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, d8, composer, 806882736, 0, 523696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1) {
            super(0);
            this.f7685a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
            this.f7685a.invoke(InterfaceC1365m.g.f7714a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f7686a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            this.f7686a.invoke(InterfaceC1365m.f.f7713a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1) {
            super(0);
            this.f7687a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            this.f7687a.invoke(InterfaceC1365m.e.f7712a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function1 function1) {
            super(0);
            this.f7688a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            this.f7688a.invoke(InterfaceC1365m.d.f7711a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$l, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0148l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1367o f7689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f7690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7693e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0148l(C1367o c1367o, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7689a = c1367o;
            this.f7690b = function1;
            this.f7691c = modifier;
            this.f7692d = i8;
            this.f7693e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1364l.f(this.f7689a, this.f7690b, this.f7691c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7692d | 1), this.f7693e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Modifier modifier, int i8) {
            super(2);
            this.f7694a = str;
            this.f7695b = modifier;
            this.f7696c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1364l.g(this.f7694a, this.f7695b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7696c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.l$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7699c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.l$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BoxScope f7700a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7701b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7702c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f7703d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BoxScope boxScope, boolean z8, boolean z9, Function0 function0) {
                super(2);
                this.f7700a = boxScope;
                this.f7701b = z8;
                this.f7702c = z9;
                this.f7703d = function0;
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
                    ComposerKt.traceEventStart(649323835, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:204)");
                }
                ButtonKt.TextButton(this.f7703d, this.f7700a.align(Modifier.Companion, Alignment.Companion.getCenter()), this.f7701b && !this.f7702c, null, null, AbstractC3539m.o(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).f(), null, null, null, C1358f.f7547a.a(), composer, 805306368, 472);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z8, boolean z9, Function0 function0) {
            super(2);
            this.f7697a = z8;
            this.f7698b = z9;
            this.f7699c = function0;
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
                ComposerKt.traceEventStart(934400577, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous> (EditPaymentMethod.kt:193)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m538offsetVpY3zN4$default = OffsetKt.m538offsetVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(companion, "PaymentSheetEditScreenRemoveButton"), 0.0f, 1, null), Dp.m5155constructorimpl(f8), 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 10, null), 0.0f, Dp.m5155constructorimpl(f8), 1, null);
            boolean z8 = this.f7697a;
            boolean z9 = this.f7698b;
            Function0 function0 = this.f7699c;
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m538offsetVpY3zN4$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement().provides(Boolean.FALSE)}, ComposableLambdaKt.composableLambda(composer, 649323835, true, new a(boxScopeInstance, z9, z8, function0)), composer, 56);
            composer.startReplaceableGroup(-245509255);
            if (z8) {
                AbstractC4075b.b(boxScopeInstance.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1149getError0d7_KjU(), composer, 0, 0);
            }
            composer.endReplaceableGroup();
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
    /* renamed from: O3.l$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7704a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7705b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7706c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7707d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z8, boolean z9, Function0 function0, int i8) {
            super(2);
            this.f7704a = z8;
            this.f7705b = z9;
            this.f7706c = function0;
            this.f7707d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1364l.h(this.f7704a, this.f7705b, this.f7706c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7707d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1367o c1367o, Function1 function1, Composer composer, int i8) {
        boolean z8;
        boolean z9;
        Composer startRestartGroup = composer.startRestartGroup(1943978362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943978362, i8, -1, "com.stripe.android.paymentsheet.ui.Dropdown (EditPaymentMethod.kt:232)");
        }
        startRestartGroup.startReplaceableGroup(-1126873801);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-1126870188);
        int i9 = (i8 & 112) ^ 48;
        boolean z10 = true;
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new a(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m292clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue2, 7, null), "dropdown_menu_clickable");
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
        ImageKt.Image(PainterResources_androidKt.painterResource(c1367o.h().getIcon().intValue(), startRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 124);
        IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3532f.f35945a, startRestartGroup, 0), (String) null, (Modifier) null, 0L, startRestartGroup, 56, 12);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean b9 = b(mutableState);
        C2.c a9 = C2.d.a(AbstractC3394E.f35217X);
        C1367o.a h8 = c1367o.h();
        List a10 = c1367o.a();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long j8 = AbstractC3539m.n(materialTheme, startRestartGroup, i10).j();
        long h9 = AbstractC3539m.n(materialTheme, startRestartGroup, i10).h();
        startRestartGroup.startReplaceableGroup(-533242456);
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new b(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-533235523);
        if ((i9 <= 32 || !startRestartGroup.changed(function1)) && (i8 & 48) != 32) {
            z10 = false;
        }
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new c(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        u0.b(b9, a9, h8, a10, function12, j8, h9, (Function0) rememberedValue4, startRestartGroup, 4160);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(c1367o, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    public static final void d(InterfaceC1366n interactor, Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(958707926);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(958707926, i10, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethod (EditPaymentMethod.kt:71)");
            }
            f(e(A4.f.a(interactor.a(), startRestartGroup, 8)), new e(interactor), modifier, startRestartGroup, ((i10 << 3) & 896) | 8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(interactor, modifier, i8, i9));
        }
    }

    private static final C1367o e(State state) {
        return (C1367o) state.getValue();
    }

    public static final void f(C1367o viewState, Function1 viewActionHandler, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3292y.i(viewState, "viewState");
        AbstractC3292y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(124818519);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(124818519, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi (EditPaymentMethod.kt:86)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(v3.s.f40542e, startRestartGroup, 0);
        boolean z8 = viewState.i() == C1367o.b.f7727a;
        Modifier testTag = TestTagKt.testTag(PaddingKt.m579paddingVpY3zN4$default(modifier2, dimensionResource, 0.0f, 2, null), "TEST_TAG_PAYMENT_SHEET_EDIT_SCREEN");
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
        boolean z9 = z8;
        Modifier modifier3 = modifier2;
        p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1330496850, true, new g(viewState, modifier2, viewActionHandler)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        Modifier.Companion companion2 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m613requiredHeight3ABfNKs(companion2, Dp.m5155constructorimpl(32)), startRestartGroup, 6);
        C2.c f8 = viewState.f();
        startRestartGroup.startReplaceableGroup(1368256471);
        if (f8 != null) {
            AbstractC1368p.a(AbstractC4246a.a(f8, startRestartGroup, 8), PaddingKt.m581paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(8), 7, null), startRestartGroup, 48, 0);
        }
        startRestartGroup.endReplaceableGroup();
        String stringResource = StringResources_androidKt.stringResource(AbstractC3394E.f35205M0, startRestartGroup, 0);
        boolean z10 = viewState.i() == C1367o.b.f7728b;
        boolean z11 = viewState.c() && z9;
        Modifier testTag2 = TestTagKt.testTag(companion2, "TEST_TAG_EDIT_SCREEN_UPDATE_BUTTON");
        startRestartGroup.startReplaceableGroup(1368271973);
        int i10 = (i8 & 112) ^ 48;
        boolean z12 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        AbstractC4076c.a(stringResource, z11, (Function0) rememberedValue, testTag2, z10, false, startRestartGroup, 3072, 32);
        startRestartGroup.startReplaceableGroup(1368276737);
        if (viewState.b()) {
            boolean z13 = viewState.i() == C1367o.b.f7729c;
            startRestartGroup.startReplaceableGroup(1368282974);
            boolean z14 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new i(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            h(z9, z13, (Function0) rememberedValue2, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (viewState.d()) {
            String stringResource2 = StringResources_androidKt.stringResource(v3.w.f40601Y, new Object[]{AbstractC4246a.a(viewState.e(), startRestartGroup, 8)}, startRestartGroup, 64);
            String stringResource3 = StringResources_androidKt.stringResource(AbstractC3394E.f35219Z, new Object[]{viewState.h().a().h(), viewState.g()}, startRestartGroup, 64);
            String stringResource4 = StringResources_androidKt.stringResource(AbstractC3394E.f35191F0, startRestartGroup, 0);
            String stringResource5 = StringResources_androidKt.stringResource(AbstractC3394E.f35215V, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(692289345);
            boolean z15 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z15 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new j(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(692291725);
            boolean z16 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (48 & i8) == 32;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z16 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new k(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            I0.a(stringResource2, stringResource3, stringResource4, stringResource5, true, function0, (Function0) rememberedValue4, startRestartGroup, 24576, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0148l(viewState, viewActionHandler, modifier3, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1417892261);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417892261, i12, -1, "com.stripe.android.paymentsheet.ui.Label (EditPaymentMethod.kt:173)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g(str, modifier, Color.m2947copywmQWz5c$default(AbstractC3539m.n(materialTheme, startRestartGroup, i13).i(), ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i13).getSubtitle1(), composer2, i12 & 126, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new m(str, modifier, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z8, boolean z9, Function0 function0, Composer composer, int i8) {
        int i9;
        float high;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-336781567);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336781567, i9, -1, "com.stripe.android.paymentsheet.ui.RemoveButton (EditPaymentMethod.kt:188)");
            }
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            if (z9) {
                startRestartGroup.startReplaceableGroup(701837750);
                high = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            } else {
                startRestartGroup.startReplaceableGroup(701838610);
                high = ContentAlpha.INSTANCE.getHigh(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(high)), RippleThemeKt.getLocalRippleTheme().provides(C1369q.f7736a)}, ComposableLambdaKt.composableLambda(startRestartGroup, 934400577, true, new n(z9, z8, function0)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new o(z8, z9, function0, i8));
        }
    }
}

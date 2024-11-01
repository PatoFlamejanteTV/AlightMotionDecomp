package J2;

import O3.AbstractC1368p;
import O3.AbstractC1370s;
import O3.AbstractC1374w;
import O3.F;
import O3.G;
import O3.U;
import Q5.I;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.google.android.material.internal.ViewUtils;
import com.stripe.android.customersheet.a;
import com.stripe.android.customersheet.c;
import com.stripe.android.paymentsheet.r;
import com.stripe.android.paymentsheet.t;
import j4.AbstractC3183h0;
import j4.I0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import m4.AbstractC3371b;
import n2.AbstractC3394E;
import u2.AbstractC4075b;
import u2.AbstractC4076c;
import v3.s;
import v3.w;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0072a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0072a(Function1 function1) {
            super(0);
            this.f4039a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            this.f4039a.invoke(a.h.f24794a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(0);
            this.f4040a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            this.f4040a.invoke(a.d.f24789a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f4041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4042b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J2.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0073a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f4043a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0073a(Function1 function1) {
                super(1);
                this.f4043a = function1;
            }

            public final void a(C2027g it) {
                AbstractC3292y.i(it, "it");
                this.f4043a.invoke(new a.b(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2027g) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f4044a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function1 function1) {
                super(1);
                this.f4044a = function1;
            }

            public final void a(B3.c cVar) {
                this.f4044a.invoke(new a.k(cVar));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B3.c) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c.a aVar, Function1 function1) {
            super(2);
            this.f4041a = aVar;
            this.f4042b = function1;
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
                ComposerKt.traceEventStart(778901608, i8, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod.<anonymous> (CustomerSheetScreen.kt:213)");
            }
            boolean k8 = this.f4041a.k();
            List u8 = this.f4041a.u();
            String q8 = this.f4041a.q();
            List n8 = this.f4041a.n();
            composer.startReplaceableGroup(936309203);
            boolean changed = composer.changed(this.f4042b);
            Function1 function1 = this.f4042b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0073a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
            F3.a m8 = this.f4041a.m();
            G3.d v8 = this.f4041a.v();
            composer.startReplaceableGroup(936318912);
            boolean changed2 = composer.changed(this.f4042b);
            Function1 function13 = this.f4042b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(function13);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            AbstractC1374w.b(k8, u8, q8, n8, function12, m8, v8, (Function1) rememberedValue2, null, null, composer, 2363456, ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(0);
            this.f4045a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            this.f4045a.invoke(a.o.f24803a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f4046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c.a aVar, Function1 function1, boolean z8, int i8) {
            super(2);
            this.f4046a = aVar;
            this.f4047b = function1;
            this.f4048c = z8;
            this.f4049d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f4046a, this.f4047b, this.f4048c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4049d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4050a = new f();

        f() {
            super(1);
        }

        public final void a(com.stripe.android.customersheet.a it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.customersheet.a) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.c f4051a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4052b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0074a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f4053a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0074a(Function1 function1) {
                super(0);
                this.f4053a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13invoke() {
                this.f4053a.invoke(a.i.f24795a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f4054a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function1 function1) {
                super(0);
                this.f4054a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m14invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m14invoke() {
                this.f4054a.invoke(a.c.f24788a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.customersheet.c cVar, Function1 function1) {
            super(2);
            this.f4051a = cVar;
            this.f4052b = function1;
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
                ComposerKt.traceEventStart(-751227532, i8, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:48)");
            }
            com.stripe.android.customersheet.c cVar = this.f4051a;
            composer.startReplaceableGroup(-1288187598);
            boolean changed = composer.changed(this.f4052b);
            Function1 function1 = this.f4052b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0074a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            G d8 = cVar.d((Function0) rememberedValue);
            boolean z8 = !this.f4051a.b();
            composer.startReplaceableGroup(-1288181568);
            boolean changed2 = composer.changed(this.f4052b);
            Function1 function12 = this.f4052b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(function12);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            F.b(d8, z8, (Function0) rememberedValue2, 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.c f4055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f4057c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4058d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.stripe.android.customersheet.c cVar, Function1 function1, Function1 function12, boolean z8) {
            super(2);
            this.f4055a = cVar;
            this.f4056b = function1;
            this.f4057c = function12;
            this.f4058d = z8;
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
                ComposerKt.traceEventStart(10653779, i8, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:61)");
            }
            Modifier animateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null);
            com.stripe.android.customersheet.c cVar = this.f4055a;
            Function1 function1 = this.f4056b;
            Function1 function12 = this.f4057c;
            boolean z8 = this.f4058d;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(animateContentSize$default);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (cVar instanceof c.C0461c) {
                composer.startReplaceableGroup(-387418812);
                AbstractC4075b.a(null, composer, 0, 1);
                composer.endReplaceableGroup();
            } else if (cVar instanceof c.d) {
                composer.startReplaceableGroup(-387264587);
                a.d((c.d) cVar, function1, function12, null, composer, 8, 8);
                P3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else if (cVar instanceof c.a) {
                composer.startReplaceableGroup(-386853775);
                a.a((c.a) cVar, function1, z8, composer, 8);
                P3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else if (cVar instanceof c.b) {
                composer.startReplaceableGroup(-386472723);
                a.c((c.b) cVar, null, composer, 0, 2);
                P3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-386266511);
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
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.c f4059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f4062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f4063e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4065g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.stripe.android.customersheet.c cVar, boolean z8, Modifier modifier, Function1 function1, Function1 function12, int i8, int i9) {
            super(2);
            this.f4059a = cVar;
            this.f4060b = z8;
            this.f4061c = modifier;
            this.f4062d = function1;
            this.f4063e = function12;
            this.f4064f = i8;
            this.f4065g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.b(this.f4059a, this.f4060b, this.f4061c, this.f4062d, this.f4063e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4064f | 1), this.f4065g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.b f4066a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f4067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4066a = bVar;
            this.f4067b = modifier;
            this.f4068c = i8;
            this.f4069d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.c(this.f4066a, this.f4067b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4068c | 1), this.f4069d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4070a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function1 function1) {
            super(0);
            this.f4070a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
            this.f4070a.invoke(a.C0459a.f24786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4071a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function1 function1) {
            super(1);
            this.f4071a = function1;
        }

        public final void a(D3.f fVar) {
            this.f4071a.invoke(new a.m(fVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D3.f) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1) {
            super(1);
            this.f4072a = function1;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            this.f4072a.invoke(new a.n(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4073a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1) {
            super(1);
            this.f4073a = function1;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            this.f4073a.invoke(new a.l(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1) {
            super(0);
            this.f4074a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            this.f4074a.invoke(a.o.f24803a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.d f4075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f4077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f4078d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4079e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4080f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(c.d dVar, Function1 function1, Function1 function12, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4075a = dVar;
            this.f4076b = function1;
            this.f4077c = function12;
            this.f4078d = modifier;
            this.f4079e = i8;
            this.f4080f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.d(this.f4075a, this.f4076b, this.f4077c, this.f4078d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4079e | 1), this.f4080f);
        }
    }

    public static final void a(c.a viewState, Function1 viewActionHandler, boolean z8, Composer composer, int i8) {
        Composer composer2;
        int i9;
        Modifier.Companion companion;
        AbstractC3292y.i(viewState, "viewState");
        AbstractC3292y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-1037362630);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1037362630, i8, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod (CustomerSheetScreen.kt:178)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f40542e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1183619589);
        if (viewState.i()) {
            String stringResource = StringResources_androidKt.stringResource(w.f40615g, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(w.f40613f, startRestartGroup, 0);
            String stringResource3 = StringResources_androidKt.stringResource(w.f40581E, startRestartGroup, 0);
            String stringResource4 = StringResources_androidKt.stringResource(AbstractC3394E.f35215V, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1183638390);
            int i10 = (i8 & 112) ^ 48;
            boolean z9 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0072a(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1183634488);
            boolean z10 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = 32;
            composer2 = startRestartGroup;
            I0.a(stringResource, stringResource2, stringResource3, stringResource4, true, function0, (Function0) rememberedValue2, startRestartGroup, 24576, 0);
        } else {
            composer2 = startRestartGroup;
            i9 = 32;
        }
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        String stringResource5 = StringResources_androidKt.stringResource(w.f40606b0, composer3, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        AbstractC3183h0.a(stringResource5, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(4), 7, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        composer3.startReplaceableGroup(1183652422);
        int i11 = (i8 & 112) ^ 48;
        boolean z11 = (i11 > i9 && composer3.changed(viewActionHandler)) || (i8 & 48) == i9;
        Object rememberedValue3 = composer3.rememberedValue();
        if (z11 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new J2.b(viewActionHandler);
            composer3.updateRememberedValue(rememberedValue3);
        }
        J2.b bVar = (J2.b) rememberedValue3;
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(1183656748);
        if (z8) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AbstractC3371b.a().provides(bVar)}, ComposableLambdaKt.composableLambda(composer3, 778901608, true, new c(viewState, viewActionHandler)), composer3, 56);
        }
        composer3.endReplaceableGroup();
        C2.c l8 = viewState.l();
        composer3.startReplaceableGroup(1183688001);
        if (l8 == null) {
            companion = companion2;
        } else {
            companion = companion2;
            AbstractC1368p.a(AbstractC4246a.a(l8, composer3, 8), PaddingKt.m579paddingVpY3zN4$default(companion, dimensionResource, 0.0f, 2, null), composer3, 0, 0);
            I i12 = I.f8786a;
        }
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(1183693482);
        if (viewState.t()) {
            C2.c p8 = viewState.p();
            composer3.startReplaceableGroup(1183696809);
            String a9 = p8 == null ? null : AbstractC4246a.a(p8, composer3, 8);
            composer3.endReplaceableGroup();
            AbstractC1370s.a(a9, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5155constructorimpl(8), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        }
        composer3.endReplaceableGroup();
        String a10 = AbstractC4246a.a(viewState.s(), composer3, 8);
        boolean r8 = viewState.r();
        boolean b9 = viewState.b();
        Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(TestTagKt.testTag(companion, "CustomerSheetSaveButton"), 0.0f, Dp.m5155constructorimpl(10), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null);
        composer3.startReplaceableGroup(1183710137);
        boolean z12 = (i11 > i9 && composer3.changed(viewActionHandler)) || (i8 & 48) == i9;
        Object rememberedValue4 = composer3.rememberedValue();
        if (z12 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new d(viewActionHandler);
            composer3.updateRememberedValue(rememberedValue4);
        }
        composer3.endReplaceableGroup();
        Modifier.Companion companion3 = companion;
        AbstractC4076c.a(a10, r8, (Function0) rememberedValue4, m579paddingVpY3zN4$default, b9, true, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
        if (!viewState.t()) {
            C2.c p9 = viewState.p();
            composer3.startReplaceableGroup(1183722537);
            String a11 = p9 == null ? null : AbstractC4246a.a(p9, composer3, 8);
            composer3.endReplaceableGroup();
            AbstractC1370s.a(a11, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, Dp.m5155constructorimpl(8), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(viewState, viewActionHandler, z8, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.stripe.android.customersheet.c r15, boolean r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.a.b(com.stripe.android.customersheet.c, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.stripe.android.customersheet.c.b r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.a.c(com.stripe.android.customersheet.c$b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(c.d viewState, Function1 viewActionHandler, Function1 paymentMethodNameProvider, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Modifier.Companion companion;
        Object obj;
        float f8;
        int i10;
        String a9;
        boolean z12;
        AbstractC3292y.i(viewState, "viewState");
        AbstractC3292y.i(viewActionHandler, "viewActionHandler");
        AbstractC3292y.i(paymentMethodNameProvider, "paymentMethodNameProvider");
        Composer startRestartGroup = composer.startRestartGroup(1248593812);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248593812, i8, -1, "com.stripe.android.customersheet.ui.SelectPaymentMethod (CustomerSheetScreen.kt:101)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f40542e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
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
        String m8 = viewState.m();
        startRestartGroup.startReplaceableGroup(2144018702);
        if (m8 == null) {
            m8 = StringResources_androidKt.stringResource(w.f40586J, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion3 = Modifier.Companion;
        float f9 = 20;
        AbstractC3183h0.a(m8, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f9), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
        v3.o a10 = t.f27676a.a(viewState.l(), viewState.p(), false, viewState.h(), paymentMethodNameProvider, viewState.e(), viewState.n());
        List a11 = a10.a();
        r b9 = a10.b();
        boolean o8 = viewState.o();
        boolean b10 = viewState.b();
        startRestartGroup.startReplaceableGroup(2144051855);
        int i11 = (i8 & 112) ^ 48;
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144054865);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new l(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144057871);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new m(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144060848);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z11 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new n(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        float f10 = 2;
        U.k(a11, b9, o8, b10, function0, function1, function12, (Function1) rememberedValue4, PaddingKt.m581paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f10), 7, null), null, startRestartGroup, 100663304, 512);
        String f11 = viewState.f();
        startRestartGroup.startReplaceableGroup(2144066303);
        if (f11 == null) {
            companion = companion3;
            obj = null;
            f8 = 0.0f;
        } else {
            companion = companion3;
            obj = null;
            f8 = 0.0f;
            AbstractC1368p.a(f11, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(f10), 1, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
            I i12 = I.f8786a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144074644);
        if (viewState.k()) {
            String a12 = AbstractC4246a.a(viewState.j(), startRestartGroup, 8);
            boolean i13 = viewState.i();
            boolean b11 = viewState.b();
            Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(TestTagKt.testTag(companion, "CustomerSheetConfirmButton"), 0.0f, Dp.m5155constructorimpl(f9), 0.0f, 0.0f, 13, null), dimensionResource, f8, 2, obj);
            startRestartGroup.startReplaceableGroup(2144082873);
            if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new o(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            i10 = 8;
            AbstractC4076c.a(a12, i13, (Function0) rememberedValue5, m579paddingVpY3zN4$default, b11, false, startRestartGroup, 0, 32);
        } else {
            i10 = 8;
        }
        startRestartGroup.endReplaceableGroup();
        C2.c g8 = viewState.g();
        startRestartGroup.startReplaceableGroup(2144095801);
        if (g8 == null) {
            a9 = null;
        } else {
            a9 = AbstractC4246a.a(g8, startRestartGroup, i10);
        }
        startRestartGroup.endReplaceableGroup();
        AbstractC1370s.a(a9, PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5155constructorimpl(i10), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p(viewState, viewActionHandler, paymentMethodNameProvider, modifier2, i8, i9));
        }
    }
}

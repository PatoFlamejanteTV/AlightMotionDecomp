package O3;

import R5.AbstractC1435t;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import x4.C4224g;
import y4.AbstractC4246a;

/* renamed from: O3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1373v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.v$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7767b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LazyListState f7768c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7769d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, LazyListState lazyListState, int i8, U5.d dVar) {
            super(2, dVar);
            this.f7767b = z8;
            this.f7768c = lazyListState;
            this.f7769d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f7767b, this.f7768c, this.f7769d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7766a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                if (this.f7767b) {
                    LazyListState lazyListState = this.f7768c;
                    int i9 = this.f7769d;
                    this.f7766a = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, i9, 0, this, 2, null) == e8) {
                        return e8;
                    }
                } else {
                    LazyListState lazyListState2 = this.f7768c;
                    int i10 = this.f7769d;
                    this.f7766a = 2;
                    if (LazyListState.animateScrollToItem$default(lazyListState2, i10, 0, this, 2, null) == e8) {
                        return e8;
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.v$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f7771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7772c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7773d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4224g f7774e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f7775f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.v$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f7776a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f7777b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f7778c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4224g f7779d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f7780e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f7781f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: O3.v$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0150a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f7782a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f7783b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f7784c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0150a(Function1 function1, List list, int i8) {
                    super(0);
                    this.f7782a = function1;
                    this.f7783b = list;
                    this.f7784c = i8;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m44invoke();
                    return Q5.I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m44invoke() {
                    this.f7782a.invoke(this.f7783b.get(this.f7784c));
                }
            }

            /* renamed from: O3.v$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0151b extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f7785a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0151b(List list) {
                    super(1);
                    this.f7785a = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    this.f7785a.get(i8);
                    return null;
                }
            }

            /* renamed from: O3.v$b$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements InterfaceC2074p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f7786a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f7787b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f7788c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C4224g f7789d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f7790e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function1 f7791f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ List f7792g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(List list, int i8, float f8, C4224g c4224g, boolean z8, Function1 function1, List list2) {
                    super(4);
                    this.f7786a = list;
                    this.f7787b = i8;
                    this.f7788c = f8;
                    this.f7789d = c4224g;
                    this.f7790e = z8;
                    this.f7791f = function1;
                    this.f7792g = list2;
                }

                @Override // c6.InterfaceC2074p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return Q5.I.f8786a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    String i11;
                    AbstractC3292y.i(items, "$this$items");
                    if ((i9 & 14) == 0) {
                        i10 = i9 | (composer.changed(items) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= composer.changed(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i10, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    C2027g c2027g = (C2027g) this.f7786a.get(i8);
                    composer.startReplaceableGroup(1249436630);
                    if (DarkThemeKt.isSystemInDarkTheme(composer, 0) && c2027g.e() != null) {
                        i11 = c2027g.e();
                    } else {
                        i11 = c2027g.i();
                    }
                    Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag" + c2027g.d());
                    AbstractC1372u.a(this.f7788c, c2027g.h(), i11, this.f7789d, AbstractC4246a.a(c2027g.f(), composer, 8), i8 == this.f7787b, this.f7790e, c2027g.g(), testTag, new C0150a(this.f7791f, this.f7792g, i8), composer, C4224g.f41044g << 9, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, int i8, float f8, C4224g c4224g, boolean z8, Function1 function1) {
                super(1);
                this.f7776a = list;
                this.f7777b = i8;
                this.f7778c = f8;
                this.f7779d = c4224g;
                this.f7780e = z8;
                this.f7781f = function1;
            }

            public final void a(LazyListScope LazyRow) {
                AbstractC3292y.i(LazyRow, "$this$LazyRow");
                List list = this.f7776a;
                LazyRow.items(list.size(), null, new C0151b(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new c(list, this.f7777b, this.f7778c, this.f7779d, this.f7780e, this.f7781f, list)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, LazyListState lazyListState, boolean z8, int i8, C4224g c4224g, Function1 function1) {
            super(3);
            this.f7770a = list;
            this.f7771b = lazyListState;
            this.f7772c = z8;
            this.f7773d = i8;
            this.f7774e = c4224g;
            this.f7775f = function1;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782109993, i9, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI.<anonymous> (NewPaymentMethodTabLayoutUI.kt:60)");
            }
            float e8 = AbstractC1373v.e(BoxWithConstraints.mo517getMaxWidthD9Ej5fM(), this.f7770a.size(), composer, 0);
            A a9 = A.f7142a;
            PaddingValues m572PaddingValuesYgX7TsA$default = PaddingKt.m572PaddingValuesYgX7TsA$default(a9.b(), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(a9.a());
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag");
            LazyListState lazyListState = this.f7771b;
            boolean z8 = this.f7772c;
            LazyDslKt.LazyRow(testTag, lazyListState, m572PaddingValuesYgX7TsA$default, false, m491spacedBy0680j_4, null, null, z8, new a(this.f7770a, this.f7773d, e8, this.f7774e, z8, this.f7775f), composer, 24966, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.v$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7796d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4224g f7797e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f7798f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LazyListState f7799g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7800h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7801i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, int i8, boolean z8, Function1 function1, C4224g c4224g, Modifier modifier, LazyListState lazyListState, int i9, int i10) {
            super(2);
            this.f7793a = list;
            this.f7794b = i8;
            this.f7795c = z8;
            this.f7796d = function1;
            this.f7797e = c4224g;
            this.f7798f = modifier;
            this.f7799g = lazyListState;
            this.f7800h = i9;
            this.f7801i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1373v.a(this.f7793a, this.f7794b, this.f7795c, this.f7796d, this.f7797e, this.f7798f, this.f7799g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7800h | 1), this.f7801i);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, Function1 onItemSelectedListener, C4224g imageLoader, Modifier modifier, LazyListState lazyListState, Composer composer, int i9, int i10) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i11;
        boolean z9;
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3292y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(994479443);
        if ((i10 & 32) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        boolean z10 = false;
        if ((i10 & 64) != 0) {
            i11 = i9 & (-3670017);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i11 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(994479443, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI (NewPaymentMethodTabLayoutUI.kt:43)");
        }
        boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        Integer valueOf = Integer.valueOf(i8);
        startRestartGroup.startReplaceableGroup(-132451049);
        boolean changed = startRestartGroup.changed(booleanValue);
        if ((((i9 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(lazyListState2)) || (i9 & 1572864) == 1048576) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = changed | z9;
        if ((((i9 & 112) ^ 48) > 32 && startRestartGroup.changed(i8)) || (i9 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z10 | z11;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(booleanValue, lazyListState2, i8, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf, (InterfaceC2072n) rememberedValue, startRestartGroup, ((i11 >> 3) & 14) | 64);
        LazyListState lazyListState3 = lazyListState2;
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(TestTagKt.testTag(modifier2, "PaymentMethodsUITestTag1"), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 782109993, true, new b(paymentMethods, lazyListState2, z8, i8, imageLoader, onItemSelectedListener)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(paymentMethods, i8, z8, onItemSelectedListener, imageLoader, modifier3, lazyListState3, i9, i10));
        }
    }

    public static final float c(float f8, int i8) {
        A a9 = A.f7142a;
        float m5155constructorimpl = Dp.m5155constructorimpl(f8 - Dp.m5155constructorimpl(a9.b() * 2));
        float m5155constructorimpl2 = Dp.m5155constructorimpl(90);
        float f9 = i8;
        float m5155constructorimpl3 = Dp.m5155constructorimpl(m5155constructorimpl2 * f9);
        float m5155constructorimpl4 = Dp.m5155constructorimpl(a9.a() * (i8 - 1));
        if (Dp.m5154compareTo0680j_4(Dp.m5155constructorimpl(m5155constructorimpl3 + m5155constructorimpl4), m5155constructorimpl) <= 0) {
            return Dp.m5155constructorimpl(Dp.m5155constructorimpl(m5155constructorimpl - m5155constructorimpl4) / f9);
        }
        Iterator it = AbstractC1435t.p(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
        if (it.hasNext()) {
            Dp m5153boximpl = Dp.m5153boximpl(d(m5155constructorimpl, m5155constructorimpl2, a9.a(), ((Number) it.next()).floatValue()));
            while (it.hasNext()) {
                Dp m5153boximpl2 = Dp.m5153boximpl(d(m5155constructorimpl, m5155constructorimpl2, A.f7142a.a(), ((Number) it.next()).floatValue()));
                if (m5153boximpl.compareTo(m5153boximpl2) > 0) {
                    m5153boximpl = m5153boximpl2;
                }
            }
            return m5153boximpl.m5169unboximpl();
        }
        throw new NoSuchElementException();
    }

    private static final float d(float f8, float f9, float f10, float f11) {
        return Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8 - Dp.m5155constructorimpl(f10 * ((int) (Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8 - f9) - Dp.m5155constructorimpl(f9 * f11)) / Dp.m5155constructorimpl(f9 + f10))))) / ((r3 + 1) + f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float f8, int i8, Composer composer, int i9) {
        boolean z8;
        composer.startReplaceableGroup(-709663121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709663121, i9, -1, "com.stripe.android.paymentsheet.ui.rememberViewWidth (NewPaymentMethodTabLayoutUI.kt:103)");
        }
        composer.startReplaceableGroup(1221348739);
        boolean z9 = false;
        if ((((i9 & 14) ^ 6) > 4 && composer.changed(f8)) || (i9 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((((i9 & 112) ^ 48) > 32 && composer.changed(i8)) || (i9 & 48) == 32) {
            z9 = true;
        }
        boolean z10 = z8 | z9;
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5153boximpl(c(f8, i8));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5169unboximpl = ((Dp) rememberedValue).m5169unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5169unboximpl;
    }
}

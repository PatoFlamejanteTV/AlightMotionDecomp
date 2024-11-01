package Y2;

import Q5.I;
import Q5.t;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import o4.AbstractC3539m;
import r4.C0;
import r4.Q;
import r4.T;
import r4.p0;
import r4.w0;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z2.a f11855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11856c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f11857d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11858e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f11859f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11860g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ X2.b f11861h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f11862i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f11863j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f11864k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w0 f11865l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11866m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Y2.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0264a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ X2.b f11867a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0264a(X2.b bVar) {
                super(3);
                this.f11867a = bVar;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                String a9;
                AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(556915907, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:83)");
                }
                X2.b bVar = this.f11867a;
                if (bVar == null) {
                    a9 = null;
                } else {
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    AbstractC3292y.h(resources, "getResources(...)");
                    a9 = bVar.a(resources);
                }
                if (a9 == null) {
                    a9 = "";
                }
                X2.d.a(a9, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f11868a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f11869b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f11870c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w0 f11871d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Z2.a f11872e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f11873f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11874g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Q f11875h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11876i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ w0 f11877j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11878k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ X2.b f11879l;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: Y2.g$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0265a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f11880a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f11881b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0265a(Function0 function0, U5.d dVar) {
                    super(2, dVar);
                    this.f11881b = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0265a(this.f11881b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f11880a == 0) {
                        t.b(obj);
                        this.f11881b.invoke();
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0265a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: Y2.g$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0266b extends AbstractC3293z implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ X2.b f11882a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0266b(X2.b bVar) {
                    super(3);
                    this.f11882a = bVar;
                }

                @Override // c6.InterfaceC2073o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return I.f8786a;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                    String a9;
                    AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-631105122, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:150)");
                    }
                    X2.b bVar = this.f11882a;
                    if (bVar == null) {
                        a9 = null;
                    } else {
                        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        AbstractC3292y.h(resources, "getResources(...)");
                        a9 = bVar.a(resources);
                    }
                    if (a9 == null) {
                        a9 = "";
                    }
                    X2.d.a(a9, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0, boolean z8, boolean z9, w0 w0Var, Z2.a aVar, boolean z10, FocusRequester focusRequester, Q q8, FocusRequester focusRequester2, w0 w0Var2, FocusRequester focusRequester3, X2.b bVar) {
                super(3);
                this.f11868a = function0;
                this.f11869b = z8;
                this.f11870c = z9;
                this.f11871d = w0Var;
                this.f11872e = aVar;
                this.f11873f = z10;
                this.f11874g = focusRequester;
                this.f11875h = q8;
                this.f11876i = focusRequester2;
                this.f11877j = w0Var2;
                this.f11878k = focusRequester3;
                this.f11879l = bVar;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                boolean z8;
                int m4845getDoneeUduSuo;
                ColumnScopeInstance columnScopeInstance;
                int i9;
                int m4845getDoneeUduSuo2;
                AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-333430484, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:92)");
                }
                I i10 = I.f8786a;
                composer.startReplaceableGroup(-1787610638);
                boolean changed = composer.changed(this.f11868a);
                Function0 function0 = this.f11868a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0265a(function0, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i10, (InterfaceC2072n) rememberedValue, composer, 70);
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z9 = this.f11869b;
                boolean z10 = this.f11870c;
                w0 w0Var = this.f11871d;
                Z2.a aVar = this.f11872e;
                boolean z11 = this.f11873f;
                FocusRequester focusRequester = this.f11874g;
                Q q8 = this.f11875h;
                FocusRequester focusRequester2 = this.f11876i;
                w0 w0Var2 = this.f11877j;
                FocusRequester focusRequester3 = this.f11878k;
                X2.b bVar = this.f11879l;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(companion, Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, composer, i11).c()), 0.0f, 2, null), AbstractC3539m.n(materialTheme, composer, i11).f(), Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, composer, i11).c()), 0.0f, composer, 0, 8);
                if (z9) {
                    composer.startReplaceableGroup(1068105420);
                    if (z11) {
                        m4845getDoneeUduSuo2 = ImeAction.Companion.m4847getNexteUduSuo();
                    } else {
                        m4845getDoneeUduSuo2 = ImeAction.Companion.m4845getDoneeUduSuo();
                    }
                    z8 = z10;
                    i.a(z10, w0Var, aVar, m4845getDoneeUduSuo2, focusRequester, false, null, composer, 64, 96);
                    composer.endReplaceableGroup();
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                } else {
                    z8 = z10;
                    composer.startReplaceableGroup(1068616455);
                    boolean z12 = q8.A().length() == 0;
                    if (z11) {
                        m4845getDoneeUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
                    } else {
                        m4845getDoneeUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
                    }
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                    T.b(z8, q8, null, null, z12, z11, focusRequester2, null, m4845getDoneeUduSuo, composer, Q.f38112s << 3, 140);
                    composer.endReplaceableGroup();
                }
                DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(companion, Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, composer, i9).c()), 0.0f, 2, null), AbstractC3539m.n(materialTheme, composer, i9).f(), Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, composer, i9).c()), 0.0f, composer, 0, 8);
                composer.startReplaceableGroup(588692827);
                if (z11) {
                    C0.c(w0Var2, z8, ImeAction.Companion.m4845getDoneeUduSuo(), null, null, 0, 0, focusRequester3, composer, 392, 120);
                }
                composer.endReplaceableGroup();
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, bVar != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -631105122, true, new C0266b(bVar)), composer, 1572870, 30);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, Z2.a aVar, boolean z9, Q q8, FocusRequester focusRequester, w0 w0Var, FocusRequester focusRequester2, X2.b bVar, boolean z10, Function0 function0, boolean z11, w0 w0Var2, FocusRequester focusRequester3) {
            super(2);
            this.f11854a = z8;
            this.f11855b = aVar;
            this.f11856c = z9;
            this.f11857d = q8;
            this.f11858e = focusRequester;
            this.f11859f = w0Var;
            this.f11860g = focusRequester2;
            this.f11861h = bVar;
            this.f11862i = z10;
            this.f11863j = function0;
            this.f11864k = z11;
            this.f11865l = w0Var2;
            this.f11866m = focusRequester3;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4845getDoneeUduSuo;
            int m4845getDoneeUduSuo2;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1115593573, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:52)");
            }
            if (this.f11854a) {
                composer.startReplaceableGroup(1694416591);
                if (this.f11855b == Z2.a.f13216c) {
                    m4845getDoneeUduSuo2 = ImeAction.Companion.m4847getNexteUduSuo();
                } else {
                    m4845getDoneeUduSuo2 = ImeAction.Companion.m4845getDoneeUduSuo();
                }
                T.b(this.f11856c, this.f11857d, null, null, false, true, this.f11858e, Y2.a.f11767a.a(), m4845getDoneeUduSuo2, composer, (Q.f38112s << 3) | 12779520, 28);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1694918078);
                boolean z8 = this.f11856c;
                w0 w0Var = this.f11859f;
                Z2.a aVar = this.f11855b;
                if (aVar == Z2.a.f13216c) {
                    m4845getDoneeUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
                } else {
                    m4845getDoneeUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
                }
                i.a(z8, w0Var, aVar, m4845getDoneeUduSuo, this.f11860g, false, Y2.a.f11767a.b(), composer, 1572928, 32);
                composer.endReplaceableGroup();
            }
            Z2.a aVar2 = this.f11855b;
            Z2.a aVar3 = Z2.a.f13216c;
            AnimatedVisibilityKt.AnimatedVisibility((aVar2 == aVar3 || this.f11861h == null) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 556915907, true, new C0264a(this.f11861h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            AnimatedVisibilityKt.AnimatedVisibility(this.f11862i || this.f11855b == aVar3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -333430484, true, new b(this.f11863j, this.f11854a, this.f11856c, this.f11859f, this.f11855b, this.f11864k, this.f11860g, this.f11857d, this.f11858e, this.f11865l, this.f11866m, this.f11861h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f11883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f11884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f11885c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f11886d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z2.a f11887e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11888f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11889g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f11890h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ X2.b f11891i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f11892j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f11893k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f11894l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11895m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11896n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11897o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f11898p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f11899q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f11900r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, w0 w0Var, Q q8, w0 w0Var2, Z2.a aVar, boolean z8, boolean z9, boolean z10, X2.b bVar, boolean z11, Function0 function0, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, int i8, int i9, int i10) {
            super(2);
            this.f11883a = num;
            this.f11884b = w0Var;
            this.f11885c = q8;
            this.f11886d = w0Var2;
            this.f11887e = aVar;
            this.f11888f = z8;
            this.f11889g = z9;
            this.f11890h = z10;
            this.f11891i = bVar;
            this.f11892j = z11;
            this.f11893k = function0;
            this.f11894l = modifier;
            this.f11895m = focusRequester;
            this.f11896n = focusRequester2;
            this.f11897o = focusRequester3;
            this.f11898p = i8;
            this.f11899q = i9;
            this.f11900r = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f11883a, this.f11884b, this.f11885c, this.f11886d, this.f11887e, this.f11888f, this.f11889g, this.f11890h, this.f11891i, this.f11892j, this.f11893k, this.f11894l, this.f11895m, this.f11896n, this.f11897o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11898p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f11899q), this.f11900r);
        }
    }

    public static final void a(Integer num, w0 emailController, Q phoneNumberController, w0 nameController, Z2.a signUpState, boolean z8, boolean z9, boolean z10, X2.b bVar, boolean z11, Function0 onShowingAllFields, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Composer composer, int i8, int i9, int i10) {
        FocusRequester focusRequester4;
        FocusRequester focusRequester5;
        FocusRequester focusRequester6;
        AbstractC3292y.i(emailController, "emailController");
        AbstractC3292y.i(phoneNumberController, "phoneNumberController");
        AbstractC3292y.i(nameController, "nameController");
        AbstractC3292y.i(signUpState, "signUpState");
        AbstractC3292y.i(onShowingAllFields, "onShowingAllFields");
        Composer startRestartGroup = composer.startRestartGroup(1600593703);
        Modifier modifier2 = (i10 & 2048) != 0 ? Modifier.Companion : modifier;
        if ((i10 & 4096) != 0) {
            startRestartGroup.startReplaceableGroup(-280055715);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester4 = (FocusRequester) rememberedValue;
        } else {
            focusRequester4 = focusRequester;
        }
        if ((i10 & 8192) != 0) {
            startRestartGroup.startReplaceableGroup(-280053379);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester5 = (FocusRequester) rememberedValue2;
        } else {
            focusRequester5 = focusRequester2;
        }
        if ((i10 & 16384) != 0) {
            startRestartGroup.startReplaceableGroup(-280051075);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester6 = (FocusRequester) rememberedValue3;
        } else {
            focusRequester6 = focusRequester3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1600593703, i8, i9, "com.stripe.android.link.ui.inline.LinkInlineSignupFields (LinkInlineSignupFields.kt:45)");
        }
        startRestartGroup.startReplaceableGroup(-280047878);
        String stringResource = num == null ? null : StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        p0.a(null, stringResource, modifier2, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1115593573, true, new a(z9, signUpState, z8, phoneNumberController, focusRequester5, emailController, focusRequester4, bVar, z11, onShowingAllFields, z10, nameController, focusRequester6)), startRestartGroup, ((i9 << 3) & 896) | 1597446, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(num, emailController, phoneNumberController, nameController, signUpState, z8, z9, z10, bVar, z11, onShowingAllFields, modifier2, focusRequester4, focusRequester5, focusRequester6, i8, i9, i10));
        }
    }
}

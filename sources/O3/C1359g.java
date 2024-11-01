package O3;

import N3.m;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: O3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1359g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1359g f7553a = new C1359g();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2074p f7554b = ComposableLambdaKt.composableLambdaInstance(2125430138, false, a.f7555a);

    /* renamed from: O3.g$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2074p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7555a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0143a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f7556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N3.m f7557b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0143a(N3.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f7557b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0143a(this.f7557b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f7556a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    this.f7556a = 1;
                    if (n6.X.b(1500L, this) == e8) {
                        return e8;
                    }
                }
                ((m.a) this.f7557b).a().invoke();
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0143a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        a() {
            super(4);
        }

        public final void a(AnimatedContentScope AnimatedContent, N3.m mVar, Composer composer, int i8) {
            boolean z8;
            AbstractC3292y.i(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125430138, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetScreenKt.lambda-1.<anonymous> (PaymentSheetScreen.kt:216)");
            }
            if (mVar instanceof m.c) {
                composer.startReplaceableGroup(1402856489);
                g4.d.a(SizeKt.m616requiredSize3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1154getOnSurface0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(v3.s.f40541d, composer, 0), 0L, 0, composer, 6, 24);
                composer.endReplaceableGroup();
            } else if (mVar instanceof m.a) {
                composer.startReplaceableGroup(1403175727);
                EffectsKt.LaunchedEffect(mVar, new C0143a(mVar, null), composer, ((i8 >> 3) & 14) | 64);
                IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(v3.t.f40564s, composer, 0), (String) null, SizeKt.m616requiredSize3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1154getOnSurface0d7_KjU(), composer, 440, 0);
                composer.endReplaceableGroup();
            } else {
                if (mVar == null) {
                    z8 = true;
                } else {
                    z8 = mVar instanceof m.b;
                }
                if (z8) {
                    composer.startReplaceableGroup(2123491671);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1403746127);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // c6.InterfaceC2074p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((AnimatedContentScope) obj, (N3.m) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Q5.I.f8786a;
        }
    }

    public final InterfaceC2074p a() {
        return f7554b;
    }
}

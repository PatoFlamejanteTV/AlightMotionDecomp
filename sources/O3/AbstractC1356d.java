package O3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* renamed from: O3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1356d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7540b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0142a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f7541a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0142a(boolean z8) {
                super(2);
                this.f7541a = z8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Q5.I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                int i9;
                int i10;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(782248533, i8, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous>.<anonymous> (AddressOptionsAppBar.kt:29)");
                }
                if (this.f7541a) {
                    i9 = v3.t.f40563r;
                } else {
                    i9 = v3.t.f40552g;
                }
                Painter painterResource = PainterResources_androidKt.painterResource(i9, composer, 0);
                if (this.f7541a) {
                    i10 = v3.w.f40581E;
                } else {
                    i10 = g4.n.f32394c;
                }
                IconKt.m1243Iconww6aTOc(painterResource, StringResources_androidKt.stringResource(i10, composer, 0), (Modifier) null, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).c(), composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, boolean z8) {
            super(3);
            this.f7539a = function0;
            this.f7540b = z8;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(RowScope TopAppBar, Composer composer, int i8) {
            AbstractC3292y.i(TopAppBar, "$this$TopAppBar");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663677113, i8, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:26)");
            }
            IconButtonKt.IconButton(this.f7539a, null, false, null, ComposableLambdaKt.composableLambda(composer, 782248533, true, new C0142a(this.f7540b)), composer, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f7542a = z8;
            this.f7543b = function0;
            this.f7544c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1356d.a(this.f7542a, this.f7543b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7544c | 1));
        }
    }

    public static final void a(boolean z8, Function0 onButtonClick, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        AbstractC3292y.i(onButtonClick, "onButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(-111772214);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(onButtonClick)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111772214, i9, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:20)");
            }
            AppBarKt.m1083TopAppBarHsRjFd4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1159getSurface0d7_KjU(), 0L, Dp.m5155constructorimpl(0), null, ComposableLambdaKt.composableLambda(startRestartGroup, 663677113, true, new a(onButtonClick, z8)), startRestartGroup, 199686, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, onButtonClick, i8));
        }
    }
}

package O3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import x4.C4224g;

/* renamed from: O3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1372u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.u$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4224g f7750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7753f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C4224g c4224g, boolean z8, String str2, boolean z9) {
            super(3);
            this.f7748a = i8;
            this.f7749b = str;
            this.f7750c = c4224g;
            this.f7751d = z8;
            this.f7752e = str2;
            this.f7753f = z9;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(ColumnScope RowButton, Composer composer, int i8) {
            AbstractC3292y.i(RowButton, "$this$RowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139491033, i8, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:48)");
            }
            Alignment centerStart = Alignment.Companion.getCenterStart();
            Modifier.Companion companion = Modifier.Companion;
            AbstractC1376y.a(this.f7748a, this.f7749b, this.f7750c, this.f7751d, SizeKt.m631widthInVpY3zN4$default(SizeKt.m610height3ABfNKs(companion, z.f7873a.b()), 0.0f, Dp.m5155constructorimpl(36), 1, null), centerStart, composer, 221184 | (C4224g.f41044g << 6), 0);
            r.a(null, this.f7752e, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, Dp.m5155constructorimpl(6), 0.0f, 0.0f, 13, null), this.f7753f, composer, 3072, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.u$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7755b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7756c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4224g f7757d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7758e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7759f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7760g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f7761h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f7762i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f7763j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7764k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f8, int i8, String str, C4224g c4224g, String str2, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, int i9, int i10) {
            super(2);
            this.f7754a = f8;
            this.f7755b = i8;
            this.f7756c = str;
            this.f7757d = c4224g;
            this.f7758e = str2;
            this.f7759f = z8;
            this.f7760g = z9;
            this.f7761h = z10;
            this.f7762i = modifier;
            this.f7763j = function0;
            this.f7764k = i9;
            this.f7765l = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1372u.a(this.f7754a, this.f7755b, this.f7756c, this.f7757d, this.f7758e, this.f7759f, this.f7760g, this.f7761h, this.f7762i, this.f7763j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7764k | 1), this.f7765l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r22, int r23, java.lang.String r24, x4.C4224g r25, java.lang.String r26, boolean r27, boolean r28, boolean r29, androidx.compose.ui.Modifier r30, kotlin.jvm.functions.Function0 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC1372u.a(float, int, java.lang.String, x4.g, java.lang.String, boolean, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}

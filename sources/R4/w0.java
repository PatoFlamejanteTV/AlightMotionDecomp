package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.x0;

/* loaded from: classes4.dex */
public interface w0 extends H, j0 {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: r4.w0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0870a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w0 f38684a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f38685b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f38686c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f38687d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f38688e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ G f38689f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f38690g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f38691h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f38692i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0870a(w0 w0Var, boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
                super(2);
                this.f38684a = w0Var;
                this.f38685b = z8;
                this.f38686c = k0Var;
                this.f38687d = modifier;
                this.f38688e = set;
                this.f38689f = g8;
                this.f38690g = i8;
                this.f38691h = i9;
                this.f38692i = i10;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Q5.I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                this.f38684a.f(this.f38685b, this.f38686c, this.f38687d, this.f38688e, this.f38689f, this.f38690g, this.f38691h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38692i | 1));
            }
        }

        public static void a(w0 w0Var, boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
            int i11;
            int m4847getNexteUduSuo;
            Composer composer2;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            AbstractC3292y.i(field, "field");
            AbstractC3292y.i(modifier, "modifier");
            AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
            Composer startRestartGroup = composer.startRestartGroup(-2028039881);
            if ((i10 & 14) == 0) {
                if (startRestartGroup.changed(z8)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i11 = i18 | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 112) == 0) {
                if (startRestartGroup.changed(field)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i11 |= i17;
            }
            if ((i10 & 896) == 0) {
                if (startRestartGroup.changed(modifier)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i11 |= i16;
            }
            if ((57344 & i10) == 0) {
                if (startRestartGroup.changed(g8)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i11 |= i15;
            }
            if ((i10 & 458752) == 0) {
                if (startRestartGroup.changed(i8)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i11 |= i14;
            }
            if ((i10 & 3670016) == 0) {
                if (startRestartGroup.changed(i9)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i11 |= i13;
            }
            if ((29360128 & i10) == 0) {
                if (startRestartGroup.changed(w0Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i11 |= i12;
            }
            if ((23962331 & i11) == 4792466 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2028039881, i11, -1, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:64)");
                }
                if (AbstractC3292y.d(g8, field.a())) {
                    m4847getNexteUduSuo = ImeAction.Companion.m4845getDoneeUduSuo();
                } else {
                    m4847getNexteUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
                }
                int i19 = i11 << 3;
                int i20 = m4847getNexteUduSuo;
                composer2 = startRestartGroup;
                C0.c(w0Var, z8, i20, modifier, null, i8, i9, null, startRestartGroup, (458752 & i11) | ((i11 >> 21) & 14) | (i19 & 112) | (i19 & 7168) | (i11 & 3670016), 144);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0870a(w0Var, z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
            }
        }

        public static boolean b(w0 w0Var) {
            return true;
        }

        public static InterfaceC3813L c(w0 w0Var) {
            return A4.g.n(null);
        }

        public static void d(w0 w0Var, x0.a.C0871a item) {
            AbstractC3292y.i(item, "item");
        }
    }

    InterfaceC3813L a();

    InterfaceC3813L b();

    InterfaceC3813L c();

    VisualTransformation d();

    InterfaceC3813L e();

    void f(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10);

    int g();

    InterfaceC3813L getContentDescription();

    void h(boolean z8);

    int i();

    InterfaceC3813L j();

    y0 k(String str);

    InterfaceC3813L m();

    InterfaceC3813L n();

    AutofillType o();

    boolean p();

    String r();

    void s(x0.a.C0871a c0871a);

    boolean u();
}

package O3;

import android.content.Context;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import o4.AbstractC3539m;
import o4.C3529c;
import o4.C3537k;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f7235a = new N();

    private N() {
    }

    private final K b(Composer composer, int i8) {
        long m2985getWhite0d7_KjU;
        long j8;
        long Color;
        composer.startReplaceableGroup(-1604949716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1604949716, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonColors (PrimaryButtonTheme.kt:67)");
        }
        C3529c b9 = C3537k.f35998a.b();
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        K k8 = (K) composer.consume(O.b());
        boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
        composer.startReplaceableGroup(197435245);
        boolean changed = composer.changed(b9) | composer.changed(context) | composer.changed(k8) | composer.changed(isSystemInDarkTheme);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            long a9 = k8.a();
            Color.Companion companion = Color.Companion;
            if (a9 == companion.m2984getUnspecified0d7_KjU()) {
                a9 = ColorKt.Color(AbstractC3539m.d(b9, context));
            }
            long j9 = a9;
            long c8 = k8.c();
            if (c8 == companion.m2984getUnspecified0d7_KjU()) {
                c8 = ColorKt.Color(AbstractC3539m.k(b9, context));
            }
            long j10 = c8;
            long e8 = k8.e();
            if (e8 == companion.m2984getUnspecified0d7_KjU()) {
                e8 = ColorKt.Color(ContextCompat.getColor(context, v3.r.f40535c));
            }
            long j11 = e8;
            long d8 = k8.d();
            if (d8 != companion.m2984getUnspecified0d7_KjU()) {
                j8 = d8;
            } else {
                if (isSystemInDarkTheme) {
                    m2985getWhite0d7_KjU = companion.m2974getBlack0d7_KjU();
                } else {
                    m2985getWhite0d7_KjU = companion.m2985getWhite0d7_KjU();
                }
                j8 = m2985getWhite0d7_KjU;
            }
            long b10 = k8.b();
            if (b10 != companion.m2984getUnspecified0d7_KjU()) {
                Color = b10;
            } else {
                Color = ColorKt.Color(AbstractC3539m.f(b9, context));
            }
            rememberedValue = new K(j9, j10, j11, j8, Color, null);
            composer.updateRememberedValue(rememberedValue);
        }
        K k9 = (K) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return k9;
    }

    private final M c(Composer composer, int i8) {
        composer.startReplaceableGroup(-1749410128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749410128, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonShape (PrimaryButtonTheme.kt:109)");
        }
        C3529c b9 = C3537k.f35998a.b();
        M m8 = (M) composer.consume(O.c());
        composer.startReplaceableGroup(-1244205581);
        boolean changed = composer.changed(b9) | composer.changed(m8);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            float b10 = m8.b();
            if (!(!Float.isNaN(b10))) {
                b10 = Dp.m5155constructorimpl(b9.d().b());
            }
            float a9 = m8.a();
            if (!(!Float.isNaN(a9))) {
                a9 = Dp.m5155constructorimpl(b9.d().a());
            }
            rememberedValue = new M(b10, a9, null);
            composer.updateRememberedValue(rememberedValue);
        }
        M m9 = (M) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m9;
    }

    private final P d(Composer composer, int i8) {
        composer.startReplaceableGroup(-1210649140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210649140, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonTypography (PrimaryButtonTheme.kt:126)");
        }
        C3529c b9 = C3537k.f35998a.b();
        P p8 = (P) composer.consume(O.d());
        composer.startReplaceableGroup(1018213818);
        boolean changed = composer.changed(b9) | composer.changed(p8);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            FontFamily a9 = p8.a();
            if (a9 == null) {
                Integer a10 = b9.e().a();
                if (a10 != null) {
                    a9 = FontFamilyKt.FontFamily(FontKt.m4762FontYpTlLL0$default(a10.intValue(), null, 0, 0, 14, null));
                } else {
                    a9 = null;
                }
            }
            long b10 = p8.b();
            if (!(true ^ TextUnitKt.m5360isUnspecifiedR2X_6o(b10))) {
                b10 = b9.e().b();
            }
            Object p9 = new P(a9, b10, null);
            composer.updateRememberedValue(p9);
            rememberedValue = p9;
        }
        P p10 = (P) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return p10;
    }

    public final K a(Composer composer, int i8) {
        composer.startReplaceableGroup(-214126613);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-214126613, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-colors> (PrimaryButtonTheme.kt:56)");
        }
        K b9 = b(composer, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return b9;
    }

    public final M e(Composer composer, int i8) {
        composer.startReplaceableGroup(-1656996728);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1656996728, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-shape> (PrimaryButtonTheme.kt:60)");
        }
        M c8 = c(composer, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c8;
    }

    public final P f(Composer composer, int i8) {
        composer.startReplaceableGroup(1153600138);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1153600138, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-typography> (PrimaryButtonTheme.kt:64)");
        }
        P d8 = d(composer, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return d8;
    }
}

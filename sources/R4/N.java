package r4;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3284p;
import o4.AbstractC3539m;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f38049a = new N();

    private N() {
    }

    public final TextStyle a(Composer composer, int i8) {
        composer.startReplaceableGroup(-1771981384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1771981384, i8, -1, "com.stripe.android.uicore.elements.OTPElementUI.defaultTextStyle (OTPElementUI.kt:284)");
        }
        SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
        FontWeight semiBold = FontWeight.Companion.getSemiBold();
        TextStyle textStyle = new TextStyle(AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), TextUnitKt.getSp(24), semiBold, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5052boximpl(TextAlign.Companion.m5059getCentere0LSkKk()), (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16744408, (AbstractC3284p) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }
}

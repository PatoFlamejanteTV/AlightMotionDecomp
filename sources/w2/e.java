package W2;

import androidx.compose.material.Typography;
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

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Typography f10767a;

    static {
        FontFamily.Companion companion = FontFamily.Companion;
        SystemFontFamily systemFontFamily = companion.getDefault();
        FontWeight.Companion companion2 = FontWeight.Companion;
        TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(24), companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null);
        SystemFontFamily systemFontFamily2 = companion.getDefault();
        TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(16), companion2.getSemiBold(), (FontStyle) null, (FontSynthesis) null, systemFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null);
        SystemFontFamily systemFontFamily3 = companion.getDefault();
        TextStyle textStyle3 = new TextStyle(0L, TextUnitKt.getSp(16), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null);
        SystemFontFamily systemFontFamily4 = companion.getDefault();
        TextStyle textStyle4 = new TextStyle(0L, TextUnitKt.getSp(14), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null);
        SystemFontFamily systemFontFamily5 = companion.getDefault();
        TextStyle textStyle5 = new TextStyle(0L, TextUnitKt.getSp(16), companion2.getMedium(), (FontStyle) null, (FontSynthesis) null, systemFontFamily5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null);
        SystemFontFamily systemFontFamily6 = companion.getDefault();
        f10767a = new Typography(null, null, textStyle, null, null, null, textStyle2, null, null, textStyle3, textStyle4, textStyle5, new TextStyle(0L, TextUnitKt.getSp(12), companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3284p) null), null, 8635, null);
    }

    public static final Typography a() {
        return f10767a;
    }
}

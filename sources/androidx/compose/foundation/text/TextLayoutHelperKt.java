package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m932canReuse7_7YC6M(TextLayoutResult canReuse, AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long j8) {
        AbstractC3292y.i(canReuse, "$this$canReuse");
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(placeholders, "placeholders");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = canReuse.getLayoutInput();
        if (canReuse.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !AbstractC3292y.d(layoutInput.getText(), text) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(style) || !AbstractC3292y.d(layoutInput.getPlaceholders(), placeholders) || layoutInput.getMaxLines() != i8 || layoutInput.getSoftWrap() != z8 || !TextOverflow.m5101equalsimpl0(layoutInput.m4638getOverflowgIe3tQ8(), i9) || !AbstractC3292y.d(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !AbstractC3292y.d(layoutInput.getFontFamilyResolver(), fontFamilyResolver) || Constraints.m5125getMinWidthimpl(j8) != Constraints.m5125getMinWidthimpl(layoutInput.m4637getConstraintsmsEJaDk())) {
            return false;
        }
        if (!z8 && !TextOverflow.m5101equalsimpl0(i9, TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) {
            return true;
        }
        if (Constraints.m5123getMaxWidthimpl(j8) != Constraints.m5123getMaxWidthimpl(layoutInput.m4637getConstraintsmsEJaDk()) || Constraints.m5122getMaxHeightimpl(j8) != Constraints.m5122getMaxHeightimpl(layoutInput.m4637getConstraintsmsEJaDk())) {
            return false;
        }
        return true;
    }
}

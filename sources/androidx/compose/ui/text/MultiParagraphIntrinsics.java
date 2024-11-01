package androidx.compose.ui.text;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final InterfaceC1416k maxIntrinsicWidth$delegate;
    private final InterfaceC1416k minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        List localPlaceholders;
        this.annotatedString = annotatedString;
        this.placeholders = list;
        o oVar = o.f8805c;
        this.minIntrinsicWidth$delegate = l.a(oVar, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.maxIntrinsicWidth$delegate = l.a(oVar, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i8);
            AnnotatedString substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle resolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = substringWithoutParagraphStyles.getText();
            TextStyle merge = textStyle.merge(resolveTextDirection);
            List<AnnotatedString.Range<SpanStyle>> spanStyles = substringWithoutParagraphStyles.getSpanStyles();
            localPlaceholders = MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, spanStyles, (List<AnnotatedString.Range<Placeholder>>) localPlaceholders, density, resolver), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        if (!TextDirection.m5069equalsimpl0(paragraphStyle.m4586getTextDirections_7Xco(), TextDirection.Companion.m5078getUnspecifieds_7Xco())) {
            return paragraphStyle;
        }
        return ParagraphStyle.m4568copyykzQM6k$default(paragraphStyle, 0, paragraphStyle2.m4586getTextDirections_7Xco(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (list.get(i8).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }
}

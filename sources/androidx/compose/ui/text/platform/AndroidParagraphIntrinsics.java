package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.SpanStyle>>, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density) {
        boolean hasEmojiCompat;
        boolean booleanValue;
        AnnotatedString.Range<SpanStyle> range;
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle);
        if (!hasEmojiCompat) {
            booleanValue = false;
        } else {
            booleanValue = EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        }
        this.emojiCompatProcessed = booleanValue;
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m4915resolveTextDirectionHeuristicsHklW4sA(textStyle.m4712getTextDirections_7Xco(), textStyle.getLocaleList());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), androidParagraphIntrinsics$resolveTypeface$1, density, !((Collection) list).isEmpty());
        if (applySpanStyle != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            for (int i8 = 0; i8 < size; i8++) {
                if (i8 == 0) {
                    range = new AnnotatedString.Range<>(applySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i8 - 1);
                }
                list.add(range);
            }
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, androidParagraphIntrinsics$resolveTypeface$1, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean z8;
        boolean hasEmojiCompat;
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null) {
            z8 = typefaceDirtyTrackerLinkedList.isStaleResolvedFont();
        } else {
            z8 = false;
        }
        if (!z8) {
            if (!this.emojiCompatProcessed) {
                hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style);
                if (!hasEmojiCompat || !EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }
}

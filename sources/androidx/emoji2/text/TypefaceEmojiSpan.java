package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {

    @Nullable
    private static Paint sDebugPaint;

    @Nullable
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    @Nullable
    private TextPaint applyCharacterSpanStyles(@Nullable CharSequence charSequence, int i8, int i9, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i8, i9, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.mWorkingPaint;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.mWorkingPaint = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        }
        if (!(paint instanceof TextPaint)) {
            return null;
        }
        return (TextPaint) paint;
    }

    @NonNull
    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, float f8, int i10, int i11, int i12, @NonNull Paint paint) {
        Paint paint2 = paint;
        TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i8, i9, paint2);
        if (applyCharacterSpanStyles != null && applyCharacterSpanStyles.bgColor != 0) {
            drawBackground(canvas, applyCharacterSpanStyles, f8, f8 + getWidth(), i10, i12);
        }
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f8, i10, f8 + getWidth(), i12, getDebugPaint());
        }
        TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f9 = i11;
        if (applyCharacterSpanStyles != null) {
            paint2 = applyCharacterSpanStyles;
        }
        typefaceRasterizer.draw(canvas, f8, f9, paint2);
    }

    void drawBackground(Canvas canvas, TextPaint textPaint, float f8, float f9, float f10, float f11) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f8, f10, f9, f11, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}

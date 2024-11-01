package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final ThreadLocal<StringBuilder> sStringBuilder = new ThreadLocal<>();
    private final TextPaint mTextPaint;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder getStringBuilder() {
        ThreadLocal<StringBuilder> threadLocal = sStringBuilder;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(@NonNull CharSequence charSequence, int i8, int i9, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 && i10 > i11) {
            return false;
        }
        StringBuilder stringBuilder = getStringBuilder();
        stringBuilder.setLength(0);
        while (i8 < i9) {
            stringBuilder.append(charSequence.charAt(i8));
            i8++;
        }
        return PaintCompat.hasGlyph(this.mTextPaint, stringBuilder.toString());
    }
}

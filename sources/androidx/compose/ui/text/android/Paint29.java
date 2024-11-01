package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes.dex */
final class Paint29 {
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    @DoNotInline
    public static final void getTextBounds(Paint paint, CharSequence charSequence, int i8, int i9, Rect rect) {
        paint.getTextBounds(charSequence, i8, i9, rect);
    }
}

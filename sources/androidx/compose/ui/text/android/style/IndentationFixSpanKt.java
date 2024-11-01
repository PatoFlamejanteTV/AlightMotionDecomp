package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.TextLayoutKt;

/* loaded from: classes.dex */
public final class IndentationFixSpanKt {
    private static final String EllipsisChar = "…";

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float getEllipsizedLeftPadding(Layout layout, int i8, Paint paint) {
        int i9;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i8);
        if (!TextLayoutKt.isLineEllipsized(layout, i8) || layout.getParagraphDirection(i8) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i8) + layout.getEllipsisStart(i8)) - lineLeft) + paint.measureText(EllipsisChar);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i8);
        if (paragraphAlignment == null) {
            i9 = -1;
        } else {
            i9 = WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i9 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float getEllipsizedLeftPadding$default(Layout layout, int i8, Paint paint, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedLeftPadding(layout, i8, paint);
    }

    public static final float getEllipsizedRightPadding(Layout layout, int i8, Paint paint) {
        float width;
        float width2;
        if (TextLayoutKt.isLineEllipsized(layout, i8)) {
            int i9 = -1;
            if (layout.getParagraphDirection(i8) == -1 && layout.getWidth() < layout.getLineRight(i8)) {
                float lineRight = (layout.getLineRight(i8) - layout.getPrimaryHorizontal(layout.getLineStart(i8) + layout.getEllipsisStart(i8))) + paint.measureText(EllipsisChar);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i8);
                if (paragraphAlignment != null) {
                    i9 = WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
                }
                if (i9 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i8);
                    width2 = (layout.getWidth() - lineRight) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i8);
                    width2 = layout.getWidth() - lineRight;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(Layout layout, int i8, Paint paint, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedRightPadding(layout, i8, paint);
    }
}

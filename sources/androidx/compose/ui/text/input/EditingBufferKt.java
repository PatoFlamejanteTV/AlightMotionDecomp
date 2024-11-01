package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4828updateRangeAfterDeletepWDy79M(long j8, long j9) {
        int m4665getLengthimpl;
        int m4667getMinimpl = TextRange.m4667getMinimpl(j8);
        int m4666getMaximpl = TextRange.m4666getMaximpl(j8);
        if (TextRange.m4671intersects5zctL8(j9, j8)) {
            if (TextRange.m4659contains5zctL8(j9, j8)) {
                m4667getMinimpl = TextRange.m4667getMinimpl(j9);
                m4666getMaximpl = m4667getMinimpl;
            } else {
                if (TextRange.m4659contains5zctL8(j8, j9)) {
                    m4665getLengthimpl = TextRange.m4665getLengthimpl(j9);
                } else if (TextRange.m4660containsimpl(j9, m4667getMinimpl)) {
                    m4667getMinimpl = TextRange.m4667getMinimpl(j9);
                    m4665getLengthimpl = TextRange.m4665getLengthimpl(j9);
                } else {
                    m4666getMaximpl = TextRange.m4667getMinimpl(j9);
                }
                m4666getMaximpl -= m4665getLengthimpl;
            }
        } else if (m4666getMaximpl > TextRange.m4667getMinimpl(j9)) {
            m4667getMinimpl -= TextRange.m4665getLengthimpl(j9);
            m4665getLengthimpl = TextRange.m4665getLengthimpl(j9);
            m4666getMaximpl -= m4665getLengthimpl;
        }
        return TextRangeKt.TextRange(m4667getMinimpl, m4666getMaximpl);
    }
}

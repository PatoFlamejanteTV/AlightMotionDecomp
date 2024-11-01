package androidx.compose.ui.text;

import androidx.annotation.IntRange;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes.dex */
public interface Paragraph {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo4518fillBoundingBoxes8ffj60Q(long j8, float[] fArr, @IntRange(from = 0) int i8);

    ResolvedTextDirection getBidiRunDirection(int i8);

    Rect getBoundingBox(int i8);

    Rect getCursorRect(int i8);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i8, boolean z8);

    float getLastBaseline();

    float getLineBottom(int i8);

    int getLineCount();

    int getLineEnd(int i8, boolean z8);

    int getLineForOffset(int i8);

    int getLineForVerticalPosition(float f8);

    float getLineHeight(int i8);

    float getLineLeft(int i8);

    float getLineRight(int i8);

    int getLineStart(int i8);

    float getLineTop(int i8);

    float getLineWidth(int i8);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo4520getOffsetForPositionk4lQ0M(long j8);

    ResolvedTextDirection getParagraphDirection(int i8);

    Path getPathForRange(int i8, int i9);

    List<Rect> getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo4521getWordBoundaryjx7JFs(int i8);

    boolean isLineEllipsized(int i8);

    /* renamed from: paint-LG529CI */
    void mo4522paintLG529CI(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8);

    /* renamed from: paint-RPmYEkk */
    void mo4523paintRPmYEkk(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo4524painthn5TExg(Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8);
}

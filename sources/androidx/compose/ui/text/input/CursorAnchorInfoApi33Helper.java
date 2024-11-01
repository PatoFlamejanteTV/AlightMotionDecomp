package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;

@RequiresApi(33)
/* loaded from: classes.dex */
final class CursorAnchorInfoApi33Helper {
    public static final CursorAnchorInfoApi33Helper INSTANCE = new CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    @DoNotInline
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(CursorAnchorInfo.Builder builder, Rect rect) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = e.a().setEditorBounds(RectHelper_androidKt.toAndroidRectF(rect));
        handwritingBounds = editorBounds.setHandwritingBounds(RectHelper_androidKt.toAndroidRectF(rect));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}

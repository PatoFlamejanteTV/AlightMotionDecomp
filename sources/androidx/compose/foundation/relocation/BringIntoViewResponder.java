package androidx.compose.foundation.relocation;

import U5.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    Object bringChildIntoView(Function0 function0, d dVar);

    @ExperimentalFoundationApi
    Rect calculateRectForParent(Rect rect);
}

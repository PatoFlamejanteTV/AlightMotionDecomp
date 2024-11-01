package androidx.leanback.widget;

import android.view.View;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
interface FocusHighlightHandler {
    void onInitializeView(View view);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void onItemFocused(View view, boolean z8);
}

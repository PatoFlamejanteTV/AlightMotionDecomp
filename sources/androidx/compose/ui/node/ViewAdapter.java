package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ViewAdapter {
    void didInsert(View view, ViewGroup viewGroup);

    void didUpdate(View view, ViewGroup viewGroup);

    int getId();

    void willInsert(View view, ViewGroup viewGroup);
}

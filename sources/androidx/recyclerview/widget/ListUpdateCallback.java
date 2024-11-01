package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ListUpdateCallback {
    void onChanged(int i8, int i9, @Nullable Object obj);

    void onInserted(int i8, int i9);

    void onMoved(int i8, int i9);

    void onRemoved(int i8, int i9);
}

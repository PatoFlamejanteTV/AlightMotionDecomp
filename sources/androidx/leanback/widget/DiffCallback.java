package androidx.leanback.widget;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class DiffCallback<Value> {
    public abstract boolean areContentsTheSame(@NonNull Value value, @NonNull Value value2);

    public abstract boolean areItemsTheSame(@NonNull Value value, @NonNull Value value2);

    public Object getChangePayload(@NonNull Value value, @NonNull Value value2) {
        return null;
    }
}

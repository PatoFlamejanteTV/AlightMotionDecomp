package androidx.compose.ui.node;

/* loaded from: classes.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i8, int i9);

    void insert(int i8);

    void remove(int i8, int i9);

    void same(int i8, int i9);
}

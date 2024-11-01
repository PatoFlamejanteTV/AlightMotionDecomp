package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes3.dex */
interface ThreadUtil<T> {

    /* loaded from: classes3.dex */
    public interface BackgroundCallback<T> {
        void loadTile(int i8, int i9);

        @SuppressLint({"UnknownNullness"})
        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i8);

        void updateRange(int i8, int i9, int i10, int i11, int i12);
    }

    /* loaded from: classes3.dex */
    public interface MainThreadCallback<T> {
        @SuppressLint({"UnknownNullness"})
        void addTile(int i8, TileList.Tile<T> tile);

        void removeTile(int i8, int i9);

        void updateItemCount(int i8, int i9);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}

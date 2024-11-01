package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes3.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @Deprecated
    public static boolean canScrollList(@NonNull ListView listView, int i8) {
        return listView.canScrollList(i8);
    }

    @Deprecated
    public static void scrollListBy(@NonNull ListView listView, int i8) {
        listView.scrollListBy(i8);
    }
}

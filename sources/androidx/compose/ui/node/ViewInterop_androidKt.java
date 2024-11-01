package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends ViewAdapter> T getOrAddAdapter(View view, int i8, Function0 function0) {
        T t8;
        ViewAdapter viewAdapter;
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i9 = 0;
        while (true) {
            t8 = null;
            if (i9 < size) {
                viewAdapter = adapters.get(i9);
                if (viewAdapter.getId() == i8) {
                    break;
                }
                i9++;
            } else {
                viewAdapter = null;
                break;
            }
        }
        if (viewAdapter instanceof ViewAdapter) {
            t8 = (T) viewAdapter;
        }
        if (t8 == null) {
            T t9 = (T) function0.invoke();
            viewAdapter2.getAdapters().add(t9);
            return t9;
        }
        return t8;
    }

    public static final MergedViewAdapter getViewAdapter(View view) {
        MergedViewAdapter mergedViewAdapter;
        int i8 = viewAdaptersKey;
        Object tag = view.getTag(i8);
        if (tag instanceof MergedViewAdapter) {
            mergedViewAdapter = (MergedViewAdapter) tag;
        } else {
            mergedViewAdapter = null;
        }
        if (mergedViewAdapter == null) {
            MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
            view.setTag(i8, mergedViewAdapter2);
            return mergedViewAdapter2;
        }
        return mergedViewAdapter;
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View view) {
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(String str) {
        return str.hashCode() | 50331648;
    }
}

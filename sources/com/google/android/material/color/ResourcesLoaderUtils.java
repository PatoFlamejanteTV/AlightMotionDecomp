package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import java.util.Map;

@RequiresApi(api = 30)
/* loaded from: classes3.dex */
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) {
        ResourcesLoader create = ColorResourcesLoaderCreator.create(context, map);
        if (create != null) {
            context.getResources().addLoaders(create);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isColorResource(int i8) {
        return 28 <= i8 && i8 <= 31;
    }
}

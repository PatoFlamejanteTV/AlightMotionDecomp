package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class LayoutIdKt {
    public static final Object getLayoutId(Measurable measurable) {
        LayoutIdParentData layoutIdParentData;
        Object parentData = measurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }

    @Stable
    public static final Modifier layoutId(Modifier modifier, Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }
}

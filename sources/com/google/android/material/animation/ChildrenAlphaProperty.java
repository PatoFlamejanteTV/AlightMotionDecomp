package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* loaded from: classes3.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @NonNull
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f8 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f8 != null ? f8 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f8) {
        float floatValue = f8.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f8);
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            viewGroup.getChildAt(i8).setAlpha(floatValue);
        }
    }
}

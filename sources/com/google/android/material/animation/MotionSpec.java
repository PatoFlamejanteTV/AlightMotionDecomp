package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final SimpleArrayMap<String, MotionTiming> timings = new SimpleArrayMap<>();
    private final SimpleArrayMap<String, PropertyValuesHolder[]> propertyValues = new SimpleArrayMap<>();

    private static void addInfoFromAnimator(@NonNull MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @NonNull
    private PropertyValuesHolder[] clonePropertyValuesHolder(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i8 = 0; i8 < propertyValuesHolderArr.length; i8++) {
            propertyValuesHolderArr2[i8] = propertyValuesHolderArr[i8].clone();
        }
        return propertyValuesHolderArr2;
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i8) {
        int resourceId;
        if (typedArray.hasValue(i8) && (resourceId = typedArray.getResourceId(i8, 0)) != 0) {
            return createFromResource(context, resourceId);
        }
        return null;
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context, @AnimatorRes int i8) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i8);
            if (loadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception e8) {
            Log.w(TAG, "Can't load animation resource ID #0x" + Integer.toHexString(i8), e8);
            return null;
        }
    }

    @NonNull
    private static MotionSpec createSpecFromAnimators(@NonNull List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            addInfoFromAnimator(motionSpec, list.get(i8));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionSpec)) {
            return false;
        }
        return this.timings.equals(((MotionSpec) obj).timings);
    }

    @NonNull
    public <T> ObjectAnimator getAnimator(@NonNull String str, @NonNull T t8, @NonNull Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t8, getPropertyValues(str));
        ofPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.timings.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            MotionTiming valueAt = this.timings.valueAt(i8);
            j8 = Math.max(j8, valueAt.getDelay() + valueAt.getDuration());
        }
        return j8;
    }

    public boolean hasPropertyValues(String str) {
        if (this.propertyValues.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean hasTiming(String str) {
        if (this.timings.get(str) != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @Nullable MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}

package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public abstract class ParallaxTarget {

    /* loaded from: classes3.dex */
    public static final class DirectPropertyTarget<T, V extends Number> extends ParallaxTarget {
        Object mObject;
        Property<T, V> mProperty;

        public DirectPropertyTarget(Object obj, Property<T, V> property) {
            this.mObject = obj;
            this.mProperty = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.leanback.widget.ParallaxTarget
        public void directUpdate(Number number) {
            this.mProperty.set(this.mObject, number);
        }

        @Override // androidx.leanback.widget.ParallaxTarget
        public boolean isDirectMapping() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PropertyValuesHolderTarget extends ParallaxTarget {
        private static final long PSEUDO_DURATION = 1000000;
        private final ObjectAnimator mAnimator;
        private float mFraction;

        public PropertyValuesHolderTarget(Object obj, PropertyValuesHolder propertyValuesHolder) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolder);
            this.mAnimator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            ofPropertyValuesHolder.setDuration(1000000L);
        }

        @Override // androidx.leanback.widget.ParallaxTarget
        public void update(float f8) {
            this.mFraction = f8;
            this.mAnimator.setCurrentPlayTime(f8 * 1000000.0f);
        }
    }

    public void directUpdate(Number number) {
    }

    public boolean isDirectMapping() {
        return false;
    }

    public void update(float f8) {
    }
}

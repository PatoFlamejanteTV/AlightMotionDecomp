package androidx.leanback.widget;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import androidx.annotation.RestrictTo;
import androidx.leanback.widget.Parallax;
import androidx.leanback.widget.ParallaxTarget;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ParallaxEffect {
    final List<Parallax.PropertyMarkerValue> mMarkerValues = new ArrayList(2);
    final List<Float> mWeights = new ArrayList(2);
    final List<Float> mTotalWeights = new ArrayList(2);
    final List<ParallaxTarget> mTargets = new ArrayList(4);

    /* loaded from: classes3.dex */
    static final class FloatEffect extends ParallaxEffect {
        @Override // androidx.leanback.widget.ParallaxEffect
        Number calculateDirectValue(Parallax parallax) {
            if (this.mMarkerValues.size() == 2) {
                if (this.mMarkerValues.get(0).getProperty() == this.mMarkerValues.get(1).getProperty()) {
                    float markerValue = ((Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(0)).getMarkerValue(parallax);
                    float markerValue2 = ((Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(1)).getMarkerValue(parallax);
                    if (markerValue > markerValue2) {
                        markerValue2 = markerValue;
                        markerValue = markerValue2;
                    }
                    Float f8 = ((Parallax.FloatProperty) this.mMarkerValues.get(0).getProperty()).get(parallax);
                    if (f8.floatValue() < markerValue) {
                        return Float.valueOf(markerValue);
                    }
                    if (f8.floatValue() > markerValue2) {
                        return Float.valueOf(markerValue2);
                    }
                    return f8;
                }
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            throw new RuntimeException("Must use two marker values for direct mapping");
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        float calculateFraction(Parallax parallax) {
            float maxValue;
            int i8 = 0;
            int i9 = 0;
            float f8 = 0.0f;
            float f9 = 0.0f;
            while (i8 < this.mMarkerValues.size()) {
                Parallax.FloatPropertyMarkerValue floatPropertyMarkerValue = (Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(i8);
                int index = floatPropertyMarkerValue.getProperty().getIndex();
                float markerValue = floatPropertyMarkerValue.getMarkerValue(parallax);
                float floatPropertyValue = parallax.getFloatPropertyValue(index);
                if (i8 == 0) {
                    if (floatPropertyValue >= markerValue) {
                        return 0.0f;
                    }
                } else {
                    if (i9 == index && f8 < markerValue) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (floatPropertyValue == Float.MAX_VALUE) {
                        return getFractionWithWeightAdjusted((f8 - f9) / parallax.getMaxValue(), i8);
                    }
                    if (floatPropertyValue >= markerValue) {
                        if (i9 != index) {
                            if (f9 != -3.4028235E38f) {
                                f8 += floatPropertyValue - f9;
                            } else {
                                maxValue = 1.0f - ((floatPropertyValue - markerValue) / parallax.getMaxValue());
                                return getFractionWithWeightAdjusted(maxValue, i8);
                            }
                        }
                        maxValue = (f8 - floatPropertyValue) / (f8 - markerValue);
                        return getFractionWithWeightAdjusted(maxValue, i8);
                    }
                }
                i8++;
                f8 = markerValue;
                i9 = index;
                f9 = floatPropertyValue;
            }
            return 1.0f;
        }
    }

    /* loaded from: classes3.dex */
    static final class IntEffect extends ParallaxEffect {
        @Override // androidx.leanback.widget.ParallaxEffect
        Number calculateDirectValue(Parallax parallax) {
            if (this.mMarkerValues.size() == 2) {
                if (this.mMarkerValues.get(0).getProperty() == this.mMarkerValues.get(1).getProperty()) {
                    int markerValue = ((Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(0)).getMarkerValue(parallax);
                    int markerValue2 = ((Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(1)).getMarkerValue(parallax);
                    if (markerValue > markerValue2) {
                        markerValue2 = markerValue;
                        markerValue = markerValue2;
                    }
                    Integer num = ((Parallax.IntProperty) this.mMarkerValues.get(0).getProperty()).get(parallax);
                    if (num.intValue() < markerValue) {
                        return Integer.valueOf(markerValue);
                    }
                    if (num.intValue() > markerValue2) {
                        return Integer.valueOf(markerValue2);
                    }
                    return num;
                }
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            throw new RuntimeException("Must use two marker values for direct mapping");
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        float calculateFraction(Parallax parallax) {
            float maxValue;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i8 < this.mMarkerValues.size()) {
                Parallax.IntPropertyMarkerValue intPropertyMarkerValue = (Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(i8);
                int index = intPropertyMarkerValue.getProperty().getIndex();
                int markerValue = intPropertyMarkerValue.getMarkerValue(parallax);
                int intPropertyValue = parallax.getIntPropertyValue(index);
                if (i8 == 0) {
                    if (intPropertyValue >= markerValue) {
                        return 0.0f;
                    }
                } else {
                    if (i9 == index && i10 < markerValue) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (intPropertyValue == Integer.MAX_VALUE) {
                        return getFractionWithWeightAdjusted((i10 - i11) / parallax.getMaxValue(), i8);
                    }
                    if (intPropertyValue >= markerValue) {
                        if (i9 != index) {
                            if (i11 != Integer.MIN_VALUE) {
                                i10 += intPropertyValue - i11;
                            } else {
                                maxValue = 1.0f - ((intPropertyValue - markerValue) / parallax.getMaxValue());
                                return getFractionWithWeightAdjusted(maxValue, i8);
                            }
                        }
                        maxValue = (i10 - intPropertyValue) / (i10 - markerValue);
                        return getFractionWithWeightAdjusted(maxValue, i8);
                    }
                }
                i8++;
                i10 = markerValue;
                i9 = index;
                i11 = intPropertyValue;
            }
            return 1.0f;
        }
    }

    ParallaxEffect() {
    }

    public final void addTarget(ParallaxTarget parallaxTarget) {
        this.mTargets.add(parallaxTarget);
    }

    abstract Number calculateDirectValue(Parallax parallax);

    abstract float calculateFraction(Parallax parallax);

    final float getFractionWithWeightAdjusted(float f8, int i8) {
        float size;
        float f9;
        float f10;
        if (this.mMarkerValues.size() >= 3) {
            if (this.mWeights.size() == this.mMarkerValues.size() - 1) {
                size = this.mTotalWeights.get(r0.size() - 1).floatValue();
                f9 = (f8 * this.mWeights.get(i8 - 1).floatValue()) / size;
                if (i8 >= 2) {
                    f10 = this.mTotalWeights.get(i8 - 2).floatValue();
                } else {
                    return f9;
                }
            } else {
                size = this.mMarkerValues.size() - 1;
                f9 = f8 / size;
                if (i8 >= 2) {
                    f10 = i8 - 1;
                } else {
                    return f9;
                }
            }
            return f9 + (f10 / size);
        }
        return f8;
    }

    public final List<Parallax.PropertyMarkerValue> getPropertyRanges() {
        return this.mMarkerValues;
    }

    public final List<ParallaxTarget> getTargets() {
        return this.mTargets;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final List<Float> getWeights() {
        return this.mWeights;
    }

    public final void performMapping(Parallax parallax) {
        if (this.mMarkerValues.size() < 2) {
            return;
        }
        if (this instanceof IntEffect) {
            parallax.verifyIntProperties();
        } else {
            parallax.verifyFloatProperties();
        }
        Number number = null;
        boolean z8 = false;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < this.mTargets.size(); i8++) {
            ParallaxTarget parallaxTarget = this.mTargets.get(i8);
            if (parallaxTarget.isDirectMapping()) {
                if (number == null) {
                    number = calculateDirectValue(parallax);
                }
                parallaxTarget.directUpdate(number);
            } else {
                if (!z8) {
                    f8 = calculateFraction(parallax);
                    z8 = true;
                }
                parallaxTarget.update(f8);
            }
        }
    }

    public final void removeTarget(ParallaxTarget parallaxTarget) {
        this.mTargets.remove(parallaxTarget);
    }

    public final void setPropertyRanges(Parallax.PropertyMarkerValue... propertyMarkerValueArr) {
        this.mMarkerValues.clear();
        for (Parallax.PropertyMarkerValue propertyMarkerValue : propertyMarkerValueArr) {
            this.mMarkerValues.add(propertyMarkerValue);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setWeights(float... fArr) {
        int length = fArr.length;
        int i8 = 0;
        while (true) {
            float f8 = 0.0f;
            if (i8 < length) {
                if (fArr[i8] > 0.0f) {
                    i8++;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                this.mWeights.clear();
                this.mTotalWeights.clear();
                for (float f9 : fArr) {
                    this.mWeights.add(Float.valueOf(f9));
                    f8 += f9;
                    this.mTotalWeights.add(Float.valueOf(f8));
                }
                return;
            }
        }
    }

    public final ParallaxEffect target(ParallaxTarget parallaxTarget) {
        this.mTargets.add(parallaxTarget);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final ParallaxEffect weights(float... fArr) {
        setWeights(fArr);
        return this;
    }

    public final ParallaxEffect target(Object obj, PropertyValuesHolder propertyValuesHolder) {
        this.mTargets.add(new ParallaxTarget.PropertyValuesHolderTarget(obj, propertyValuesHolder));
        return this;
    }

    public final <T, V extends Number> ParallaxEffect target(T t8, Property<T, V> property) {
        this.mTargets.add(new ParallaxTarget.DirectPropertyTarget(t8, property));
        return this;
    }
}

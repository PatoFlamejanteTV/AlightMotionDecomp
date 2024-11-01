package androidx.leanback.widget;

import android.util.Property;
import androidx.annotation.CallSuper;
import androidx.leanback.widget.ParallaxEffect;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Parallax<PropertyT extends Property> {
    private final List<ParallaxEffect> mEffects;
    private float[] mFloatValues;
    final List<PropertyT> mProperties;
    final List<PropertyT> mPropertiesReadOnly;
    private int[] mValues;

    /* loaded from: classes3.dex */
    public static class FloatProperty extends Property<Parallax, Float> {
        public static final float UNKNOWN_AFTER = Float.MAX_VALUE;
        public static final float UNKNOWN_BEFORE = -3.4028235E38f;
        private final int mIndex;

        public FloatProperty(String str, int i8) {
            super(Float.class, str);
            this.mIndex = i8;
        }

        public final PropertyMarkerValue at(float f8, float f9) {
            return new FloatPropertyMarkerValue(this, f8, f9);
        }

        public final PropertyMarkerValue atAbsolute(float f8) {
            return new FloatPropertyMarkerValue(this, f8, 0.0f);
        }

        public final PropertyMarkerValue atFraction(float f8) {
            return new FloatPropertyMarkerValue(this, 0.0f, f8);
        }

        public final PropertyMarkerValue atMax() {
            return new FloatPropertyMarkerValue(this, 0.0f, 1.0f);
        }

        public final PropertyMarkerValue atMin() {
            return new FloatPropertyMarkerValue(this, 0.0f);
        }

        public final int getIndex() {
            return this.mIndex;
        }

        public final float getValue(Parallax parallax) {
            return parallax.getFloatPropertyValue(this.mIndex);
        }

        public final void setValue(Parallax parallax, float f8) {
            parallax.setFloatPropertyValue(this.mIndex, f8);
        }

        @Override // android.util.Property
        public final Float get(Parallax parallax) {
            return Float.valueOf(parallax.getFloatPropertyValue(this.mIndex));
        }

        @Override // android.util.Property
        public final void set(Parallax parallax, Float f8) {
            parallax.setFloatPropertyValue(this.mIndex, f8.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    static class FloatPropertyMarkerValue extends PropertyMarkerValue<FloatProperty> {
        private final float mFactionOfMax;
        private final float mValue;

        FloatPropertyMarkerValue(FloatProperty floatProperty, float f8) {
            this(floatProperty, f8, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final float getMarkerValue(Parallax parallax) {
            if (this.mFactionOfMax == 0.0f) {
                return this.mValue;
            }
            return (parallax.getMaxValue() * this.mFactionOfMax) + this.mValue;
        }

        FloatPropertyMarkerValue(FloatProperty floatProperty, float f8, float f9) {
            super(floatProperty);
            this.mValue = f8;
            this.mFactionOfMax = f9;
        }
    }

    /* loaded from: classes3.dex */
    public static class IntProperty extends Property<Parallax, Integer> {
        public static final int UNKNOWN_AFTER = Integer.MAX_VALUE;
        public static final int UNKNOWN_BEFORE = Integer.MIN_VALUE;
        private final int mIndex;

        public IntProperty(String str, int i8) {
            super(Integer.class, str);
            this.mIndex = i8;
        }

        public final PropertyMarkerValue at(int i8, float f8) {
            return new IntPropertyMarkerValue(this, i8, f8);
        }

        public final PropertyMarkerValue atAbsolute(int i8) {
            return new IntPropertyMarkerValue(this, i8, 0.0f);
        }

        public final PropertyMarkerValue atFraction(float f8) {
            return new IntPropertyMarkerValue(this, 0, f8);
        }

        public final PropertyMarkerValue atMax() {
            return new IntPropertyMarkerValue(this, 0, 1.0f);
        }

        public final PropertyMarkerValue atMin() {
            return new IntPropertyMarkerValue(this, 0);
        }

        public final int getIndex() {
            return this.mIndex;
        }

        public final int getValue(Parallax parallax) {
            return parallax.getIntPropertyValue(this.mIndex);
        }

        public final void setValue(Parallax parallax, int i8) {
            parallax.setIntPropertyValue(this.mIndex, i8);
        }

        @Override // android.util.Property
        public final Integer get(Parallax parallax) {
            return Integer.valueOf(parallax.getIntPropertyValue(this.mIndex));
        }

        @Override // android.util.Property
        public final void set(Parallax parallax, Integer num) {
            parallax.setIntPropertyValue(this.mIndex, num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    static class IntPropertyMarkerValue extends PropertyMarkerValue<IntProperty> {
        private final float mFactionOfMax;
        private final int mValue;

        IntPropertyMarkerValue(IntProperty intProperty, int i8) {
            this(intProperty, i8, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int getMarkerValue(Parallax parallax) {
            if (this.mFactionOfMax == 0.0f) {
                return this.mValue;
            }
            return Math.round(parallax.getMaxValue() * this.mFactionOfMax) + this.mValue;
        }

        IntPropertyMarkerValue(IntProperty intProperty, int i8, float f8) {
            super(intProperty);
            this.mValue = i8;
            this.mFactionOfMax = f8;
        }
    }

    /* loaded from: classes3.dex */
    public static class PropertyMarkerValue<PropertyT> {
        private final PropertyT mProperty;

        public PropertyMarkerValue(PropertyT propertyt) {
            this.mProperty = propertyt;
        }

        public PropertyT getProperty() {
            return this.mProperty;
        }
    }

    public Parallax() {
        ArrayList arrayList = new ArrayList();
        this.mProperties = arrayList;
        this.mPropertiesReadOnly = DesugarCollections.unmodifiableList(arrayList);
        this.mValues = new int[4];
        this.mFloatValues = new float[4];
        this.mEffects = new ArrayList(4);
    }

    public ParallaxEffect addEffect(PropertyMarkerValue... propertyMarkerValueArr) {
        ParallaxEffect floatEffect;
        if (propertyMarkerValueArr[0].getProperty() instanceof IntProperty) {
            floatEffect = new ParallaxEffect.IntEffect();
        } else {
            floatEffect = new ParallaxEffect.FloatEffect();
        }
        floatEffect.setPropertyRanges(propertyMarkerValueArr);
        this.mEffects.add(floatEffect);
        return floatEffect;
    }

    public final PropertyT addProperty(String str) {
        int size = this.mProperties.size();
        PropertyT createProperty = createProperty(str, size);
        int i8 = 0;
        if (createProperty instanceof IntProperty) {
            int length = this.mValues.length;
            if (length == size) {
                int[] iArr = new int[length * 2];
                while (i8 < length) {
                    iArr[i8] = this.mValues[i8];
                    i8++;
                }
                this.mValues = iArr;
            }
            this.mValues[size] = Integer.MAX_VALUE;
        } else if (createProperty instanceof FloatProperty) {
            int length2 = this.mFloatValues.length;
            if (length2 == size) {
                float[] fArr = new float[length2 * 2];
                while (i8 < length2) {
                    fArr[i8] = this.mFloatValues[i8];
                    i8++;
                }
                this.mFloatValues = fArr;
            }
            this.mFloatValues[size] = Float.MAX_VALUE;
        } else {
            throw new IllegalArgumentException("Invalid Property type");
        }
        this.mProperties.add(createProperty);
        return createProperty;
    }

    public abstract PropertyT createProperty(String str, int i8);

    public List<ParallaxEffect> getEffects() {
        return this.mEffects;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float getFloatPropertyValue(int i8) {
        return this.mFloatValues[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getIntPropertyValue(int i8) {
        return this.mValues[i8];
    }

    public abstract float getMaxValue();

    public final List<PropertyT> getProperties() {
        return this.mPropertiesReadOnly;
    }

    public void removeAllEffects() {
        this.mEffects.clear();
    }

    public void removeEffect(ParallaxEffect parallaxEffect) {
        this.mEffects.remove(parallaxEffect);
    }

    final void setFloatPropertyValue(int i8, float f8) {
        if (i8 < this.mProperties.size()) {
            this.mFloatValues[i8] = f8;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIntPropertyValue(int i8, int i9) {
        if (i8 < this.mProperties.size()) {
            this.mValues[i8] = i9;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @CallSuper
    public void updateValues() {
        for (int i8 = 0; i8 < this.mEffects.size(); i8++) {
            this.mEffects.get(i8).performMapping(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void verifyFloatProperties() throws IllegalStateException {
        if (this.mProperties.size() < 2) {
            return;
        }
        float floatPropertyValue = getFloatPropertyValue(0);
        int i8 = 1;
        while (i8 < this.mProperties.size()) {
            float floatPropertyValue2 = getFloatPropertyValue(i8);
            if (floatPropertyValue2 >= floatPropertyValue) {
                if (floatPropertyValue == -3.4028235E38f && floatPropertyValue2 == Float.MAX_VALUE) {
                    int i9 = i8 - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i9), this.mProperties.get(i9).getName(), Integer.valueOf(i8), this.mProperties.get(i8).getName()));
                }
                i8++;
                floatPropertyValue = floatPropertyValue2;
            } else {
                Integer valueOf = Integer.valueOf(i8);
                String name = this.mProperties.get(i8).getName();
                int i10 = i8 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i10), this.mProperties.get(i10).getName()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void verifyIntProperties() throws IllegalStateException {
        if (this.mProperties.size() < 2) {
            return;
        }
        int intPropertyValue = getIntPropertyValue(0);
        int i8 = 1;
        while (i8 < this.mProperties.size()) {
            int intPropertyValue2 = getIntPropertyValue(i8);
            if (intPropertyValue2 >= intPropertyValue) {
                if (intPropertyValue == Integer.MIN_VALUE && intPropertyValue2 == Integer.MAX_VALUE) {
                    int i9 = i8 - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i9), this.mProperties.get(i9).getName(), Integer.valueOf(i8), this.mProperties.get(i8).getName()));
                }
                i8++;
                intPropertyValue = intPropertyValue2;
            } else {
                Integer valueOf = Integer.valueOf(i8);
                String name = this.mProperties.get(i8).getName();
                int i10 = i8 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i10), this.mProperties.get(i10).getName()));
            }
        }
    }
}

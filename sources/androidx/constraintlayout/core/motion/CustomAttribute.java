package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;

        static {
            int[] iArr = new int[AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    private static int clamp(int i8) {
        int i9 = (i8 & (~(i8 >> 31))) - 255;
        return (i9 & (i9 >> 31)) + 255;
    }

    public static int hsvToRgb(float f8, float f9, float f10) {
        float f11 = f8 * 6.0f;
        int i8 = (int) f11;
        float f12 = f11 - i8;
        float f13 = f10 * 255.0f;
        int i9 = (int) (((1.0f - f9) * f13) + 0.5f);
        int i10 = (int) (((1.0f - (f12 * f9)) * f13) + 0.5f);
        int i11 = (int) (((1.0f - ((1.0f - f12) * f9)) * f13) + 0.5f);
        int i12 = (int) (f13 + 0.5f);
        if (i8 == 0) {
            return ((i12 << 16) + (i11 << 8) + i9) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i8 == 1) {
            return ((i10 << 16) + (i12 << 8) + i9) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i8 == 2) {
            return ((i9 << 16) + (i12 << 8) + i11) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i8 == 3) {
            return ((i9 << 16) + (i10 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i8 == 4) {
            return ((i11 << 16) + (i9 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i8 != 5) {
            return 0;
        }
        return ((i12 << 16) + (i9 << 8) + i10) | ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.mIntegerValue != customAttribute.mIntegerValue) {
                    return false;
                }
                return true;
            case 2:
                if (this.mBooleanValue != customAttribute.mBooleanValue) {
                    return false;
                }
                return true;
            case 3:
                if (this.mIntegerValue != customAttribute.mIntegerValue) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                if (this.mColorValue != customAttribute.mColorValue) {
                    return false;
                }
                return true;
            case 7:
                if (this.mFloatValue != customAttribute.mFloatValue) {
                    return false;
                }
                return true;
            case 8:
                if (this.mFloatValue != customAttribute.mFloatValue) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 2:
                if (this.mBooleanValue) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.mIntegerValue;
            case 7:
                return this.mFloatValue;
            case 8:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f8;
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 2:
                if (this.mBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr[0] = f8;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i8 = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i8 / 255.0f;
                return;
            case 6:
                fArr[0] = this.mIntegerValue;
                return;
            case 7:
                fArr[0] = this.mFloatValue;
                return;
            case 8:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i8 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            return true;
        }
        return false;
    }

    public int numberOfInterpolatedValues() {
        int i8 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        if (i8 == 4 || i8 == 5) {
            return 4;
        }
        return 1;
    }

    public void setColorValue(int i8) {
        this.mColorValue = i8;
    }

    public void setFloatValue(float f8) {
        this.mFloatValue = f8;
    }

    public void setIntValue(int i8) {
        this.mIntegerValue = i8;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 2:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.mFloatValue = fArr[0];
                return;
            case 8:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z8) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z8;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case 2:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.mStringValue = (String) obj;
                return;
            case 4:
            case 5:
                this.mColorValue = ((Integer) obj).intValue();
                return;
            case 7:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case 8:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }
}

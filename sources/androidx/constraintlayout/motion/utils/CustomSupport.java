package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class CustomSupport {
    private static final String TAG = "CustomSupport";

    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int clamp(int i8) {
        int i9 = (i8 & (~(i8 >> 31))) - 255;
        return (i9 & (i9 >> 31)) + 255;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0038. Please report as an issue. */
    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        boolean z8;
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.getName();
        try {
            try {
                try {
                    switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[constraintAttribute.getType().ordinal()]) {
                        case 1:
                            cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                            return;
                        case 2:
                            cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                            return;
                        case 3:
                            Method method = cls.getMethod(str, Drawable.class);
                            int clamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                            ColorDrawable colorDrawable = new ColorDrawable();
                            colorDrawable.setColor(clamp);
                            method.invoke(view, colorDrawable);
                            return;
                        case 4:
                            try {
                                cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8)));
                                return;
                            } catch (IllegalAccessException e8) {
                                e = e8;
                                Log.e(TAG, "cannot access method " + str + " on View \"" + Debug.getName(view) + "\"");
                                e.printStackTrace();
                                return;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                Log.e(TAG, "no method " + str + " on View \"" + Debug.getName(view) + "\"");
                                e.printStackTrace();
                                return;
                            }
                        case 5:
                            throw new RuntimeException("unable to interpolate strings " + constraintAttribute.getName());
                        case 6:
                            Method method2 = cls.getMethod(str, Boolean.TYPE);
                            if (fArr[0] > 0.5f) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            method2.invoke(view, Boolean.valueOf(z8));
                            return;
                        case 7:
                            cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                            return;
                        default:
                            return;
                    }
                } catch (IllegalAccessException e10) {
                    e = e10;
                } catch (NoSuchMethodException e11) {
                    e = e11;
                }
            } catch (IllegalAccessException e12) {
                e = e12;
            } catch (NoSuchMethodException e13) {
                e = e13;
            }
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
        }
    }
}

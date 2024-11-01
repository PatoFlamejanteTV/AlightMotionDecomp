package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class MotionKey implements TypedValues {
    public static final String ALPHA = "alpha";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String ROTATION = "rotationZ";
    public static final String ROTATION_X = "rotationX";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public HashMap<String, CustomVariable> mCustom;
    public int mFramePosition;
    int mTargetId;
    String mTargetString;
    public int mType;

    public MotionKey() {
        int i8 = UNSET;
        this.mFramePosition = i8;
        this.mTargetId = i8;
        this.mTargetString = null;
    }

    public abstract void addValues(HashMap<String, SplineSet> hashMap);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey mo5417clone();

    public MotionKey copy(MotionKey motionKey) {
        this.mFramePosition = motionKey.mFramePosition;
        this.mTargetId = motionKey.mTargetId;
        this.mTargetString = motionKey.mTargetString;
        this.mType = motionKey.mType;
        return this;
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.mFramePosition;
    }

    boolean matches(String str) {
        String str2 = this.mTargetString;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void setCustomAttribute(String str, int i8, float f8) {
        this.mCustom.put(str, new CustomVariable(str, i8, f8));
    }

    public void setFramePosition(int i8) {
        this.mFramePosition = i8;
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        return false;
    }

    public MotionKey setViewId(int i8) {
        this.mTargetId = i8;
        return this;
    }

    boolean toBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float toFloat(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int toInt(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }

    public void setCustomAttribute(String str, int i8, int i9) {
        this.mCustom.put(str, new CustomVariable(str, i8, i9));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, boolean z8) {
        return false;
    }

    public void setCustomAttribute(String str, int i8, boolean z8) {
        this.mCustom.put(str, new CustomVariable(str, i8, z8));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        if (i8 != 100) {
            return false;
        }
        this.mFramePosition = i9;
        return true;
    }

    public void setCustomAttribute(String str, int i8, String str2) {
        this.mCustom.put(str, new CustomVariable(str, i8, str2));
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 != 101) {
            return false;
        }
        this.mTargetString = str;
        return true;
    }
}

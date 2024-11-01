package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Transition implements TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    HashMap<Integer, HashMap<String, KeyPosition>> keyPositions = new HashMap<>();
    private HashMap<String, WidgetState> state = new HashMap<>();
    TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = 400;
    private float mStagger = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class KeyPosition {
        int frame;
        String target;
        int type;

        /* renamed from: x, reason: collision with root package name */
        float f14542x;

        /* renamed from: y, reason: collision with root package name */
        float f14543y;

        public KeyPosition(String str, int i8, int i9, float f8, float f9) {
            this.target = str;
            this.frame = i8;
            this.type = i9;
            this.f14542x = f8;
            this.f14543y = f9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class WidgetState {
        Motion motionControl;
        KeyCache myKeyCache = new KeyCache();
        int myParentHeight = -1;
        int myParentWidth = -1;
        WidgetFrame start = new WidgetFrame();
        WidgetFrame end = new WidgetFrame();
        WidgetFrame interpolated = new WidgetFrame();
        MotionWidget motionWidgetStart = new MotionWidget(this.start);
        MotionWidget motionWidgetEnd = new MotionWidget(this.end);
        MotionWidget motionWidgetInterpolated = new MotionWidget(this.interpolated);

        public WidgetState() {
            Motion motion = new Motion(this.motionWidgetStart);
            this.motionControl = motion;
            motion.setStart(this.motionWidgetStart);
            this.motionControl.setEnd(this.motionWidgetEnd);
        }

        public WidgetFrame getFrame(int i8) {
            if (i8 == 0) {
                return this.start;
            }
            if (i8 == 1) {
                return this.end;
            }
            return this.interpolated;
        }

        public void interpolate(int i8, int i9, float f8, Transition transition) {
            this.myParentHeight = i9;
            this.myParentWidth = i8;
            this.motionControl.setup(i8, i9, 1.0f, System.nanoTime());
            WidgetFrame.interpolate(i8, i9, this.interpolated, this.start, this.end, transition, f8);
            this.interpolated.interpolatedPos = f8;
            this.motionControl.interpolate(this.motionWidgetInterpolated, f8, System.nanoTime(), this.myKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.motionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.motionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.motionControl.addKey(motionKeyPosition);
        }

        public void update(ConstraintWidget constraintWidget, int i8) {
            if (i8 == 0) {
                this.start.update(constraintWidget);
                this.motionControl.setStart(this.motionWidgetStart);
            } else if (i8 == 1) {
                this.end.update(constraintWidget);
                this.motionControl.setEnd(this.motionWidgetEnd);
            }
            this.myParentWidth = -1;
        }
    }

    public static Interpolator getInterpolator(int i8, final String str) {
        switch (i8) {
            case -1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.a
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$0;
                        lambda$getInterpolator$0 = Transition.lambda$getInterpolator$0(str, f8);
                        return lambda$getInterpolator$0;
                    }
                };
            case 0:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.b
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$1;
                        lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f8);
                        return lambda$getInterpolator$1;
                    }
                };
            case 1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.c
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$2;
                        lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f8);
                        return lambda$getInterpolator$2;
                    }
                };
            case 2:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.d
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$3;
                        lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f8);
                        return lambda$getInterpolator$3;
                    }
                };
            case 3:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.e
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$4;
                        lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f8);
                        return lambda$getInterpolator$4;
                    }
                };
            case 4:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.h
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$7;
                        lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f8);
                        return lambda$getInterpolator$7;
                    }
                };
            case 5:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.g
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$6;
                        lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f8);
                        return lambda$getInterpolator$6;
                    }
                };
            case 6:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.f
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$5;
                        lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f8);
                        return lambda$getInterpolator$5;
                    }
                };
            default:
                return null;
        }
    }

    private WidgetState getWidgetState(String str) {
        return this.state.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$0(String str, float f8) {
        return (float) Easing.getInterpolator(str).get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$1(float f8) {
        return (float) Easing.getInterpolator("standard").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$2(float f8) {
        return (float) Easing.getInterpolator("accelerate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$3(float f8) {
        return (float) Easing.getInterpolator("decelerate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$4(float f8) {
        return (float) Easing.getInterpolator("linear").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$5(float f8) {
        return (float) Easing.getInterpolator("anticipate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$6(float f8) {
        return (float) Easing.getInterpolator("overshoot").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$7(float f8) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f8);
    }

    public void addCustomColor(int i8, String str, String str2, int i9) {
        getWidgetState(str, null, i8).getFrame(i8).addCustomColor(str2, i9);
    }

    public void addCustomFloat(int i8, String str, String str2, float f8) {
        getWidgetState(str, null, i8).getFrame(i8).addCustomFloat(str2, f8);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void clear() {
        this.state.clear();
    }

    public boolean contains(String str) {
        return this.state.containsKey(str);
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        int i8 = 0;
        for (int i9 = 0; i9 <= 100; i9++) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i9));
            if (hashMap != null && (keyPosition = hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i8] = keyPosition.f14542x;
                fArr2[i8] = keyPosition.f14543y;
                fArr3[i8] = keyPosition.frame;
                i8++;
            }
        }
    }

    public KeyPosition findNextPosition(String str, int i8) {
        KeyPosition keyPosition;
        while (i8 <= 100) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i8));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i8++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i8) {
        KeyPosition keyPosition;
        while (i8 >= 0) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i8));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i8--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.end;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.interpolated;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.state.get(str).motionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).motionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i8 = 0;
        for (int i9 = 0; i9 <= 100; i9++) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i9));
            if (hashMap != null && hashMap.get(widgetFrame.widget.stringId) != null) {
                i8++;
            }
        }
        return i8;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.state.get(str).motionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.start;
    }

    public boolean hasPositionKeyframes() {
        if (this.keyPositions.size() > 0) {
            return true;
        }
        return false;
    }

    public void interpolate(int i8, int i9, float f8) {
        Easing easing = this.mEasing;
        if (easing != null) {
            f8 = (float) easing.get(f8);
        }
        Iterator<String> it = this.state.keySet().iterator();
        while (it.hasNext()) {
            this.state.get(it.next()).interpolate(i8, i9, f8, this);
        }
    }

    public boolean isEmpty() {
        return this.state.isEmpty();
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i8) {
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i9 = 0; i9 < size; i9++) {
            ConstraintWidget constraintWidget = children.get(i9);
            getWidgetState(constraintWidget.stringId, null, i8).update(constraintWidget, i8);
        }
    }

    private WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i8) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.motionControl);
            this.state.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i8);
            }
        }
        return widgetState;
    }

    public void addKeyPosition(String str, int i8, int i9, float f8, float f9) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i8);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, f8);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_Y, f9);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i8, i9, f8, f9);
        HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i8));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.keyPositions.put(Integer.valueOf(i8), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, boolean z8) {
        return false;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).end;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).interpolated;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).start;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        if (i8 != 706) {
            return false;
        }
        this.mStagger = f8;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = Easing.getInterpolator(str);
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }
}

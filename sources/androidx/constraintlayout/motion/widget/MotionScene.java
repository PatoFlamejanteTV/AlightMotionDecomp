package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "include";
    private static final String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    private static final String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private boolean mRtl;
    private MotionLayout.MotionTracker mVelocityTracker;
    final ViewTransitionController mViewTransitionController;
    StateSet mStateSet = null;
    Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private Transition mDefaultTransition = null;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private boolean DEBUG_DESKTOP = false;
    private int mDefaultDuration = 400;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    public MotionScene(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
    }

    private int getId(Context context, String str) {
        int i8;
        if (str.contains("/")) {
            i8 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.DEBUG_DESKTOP) {
                System.out.println("id getMap res = " + i8);
            }
        } else {
            i8 = -1;
        }
        if (i8 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e(TypedValues.MotionScene.NAME, "error in parsing id");
            return i8;
        }
        return i8;
    }

    private int getIndex(Transition transition) {
        int i8 = transition.mId;
        if (i8 != -1) {
            for (int i9 = 0; i9 < this.mTransitionList.size(); i9++) {
                if (this.mTransitionList.get(i9).mId == i8) {
                    return i9;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    static String getLine(Context context, int i8, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i8) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int getRealID(int i8) {
        int stateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i8, -1, -1)) != -1) {
            return stateGetConstraintID;
        }
        return i8;
    }

    private boolean hasCycleDependency(int i8) {
        int i9 = this.mDeriveMap.get(i8);
        int size = this.mDeriveMap.size();
        while (i9 > 0) {
            if (i9 == i8) {
                return true;
            }
            int i10 = size - 1;
            if (size < 0) {
                return true;
            }
            i9 = this.mDeriveMap.get(i9);
            size = i10;
        }
        return false;
    }

    private boolean isProcessingTouch() {
        if (this.mVelocityTracker != null) {
            return true;
        }
        return false;
    }

    private void load(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            int eventType = xml.getEventType();
            Transition transition = null;
            while (true) {
                char c8 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            if (this.DEBUG_DESKTOP) {
                                System.out.println("parsing = " + name);
                            }
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals(CONSTRAINTSET_TAG)) {
                                        c8 = 5;
                                        break;
                                    }
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        c8 = '\b';
                                        break;
                                    }
                                    break;
                                case -687739768:
                                    if (name.equals(INCLUDE_TAG_UC)) {
                                        c8 = 7;
                                        break;
                                    }
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c8 = '\t';
                                        break;
                                    }
                                    break;
                                case 269306229:
                                    if (name.equals(TRANSITION_TAG)) {
                                        break;
                                    }
                                    break;
                                case 312750793:
                                    if (name.equals(ONCLICK_TAG)) {
                                        c8 = 3;
                                        break;
                                    }
                                    break;
                                case 327855227:
                                    if (name.equals(ONSWIPE_TAG)) {
                                        c8 = 2;
                                        break;
                                    }
                                    break;
                                case 793277014:
                                    if (name.equals(TypedValues.MotionScene.NAME)) {
                                        c8 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals(STATESET_TAG)) {
                                        c8 = 4;
                                        break;
                                    }
                                    break;
                                case 1942574248:
                                    if (name.equals(INCLUDE_TAG)) {
                                        c8 = 6;
                                        break;
                                    }
                                    break;
                            }
                            c8 = 65535;
                            switch (c8) {
                                case 0:
                                    parseMotionSceneTags(context, xml);
                                    break;
                                case 1:
                                    ArrayList<Transition> arrayList = this.mTransitionList;
                                    transition = new Transition(this, context, xml);
                                    arrayList.add(transition);
                                    if (this.mCurrentTransition == null && !transition.mIsAbstract) {
                                        this.mCurrentTransition = transition;
                                        if (transition.mTouchResponse != null) {
                                            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
                                        }
                                    }
                                    if (!transition.mIsAbstract) {
                                        break;
                                    } else {
                                        if (transition.mConstraintSetEnd == -1) {
                                            this.mDefaultTransition = transition;
                                        } else {
                                            this.mAbstractTransitionList.add(transition);
                                        }
                                        this.mTransitionList.remove(transition);
                                        break;
                                    }
                                case 2:
                                    if (transition == null) {
                                        Log.v(TypedValues.MotionScene.NAME, " OnSwipe (" + context.getResources().getResourceEntryName(i8) + ".xml:" + xml.getLineNumber() + ")");
                                    }
                                    if (transition == null) {
                                        break;
                                    } else {
                                        transition.mTouchResponse = new TouchResponse(context, this.mMotionLayout, xml);
                                        break;
                                    }
                                case 3:
                                    if (transition == null) {
                                        break;
                                    } else {
                                        transition.addOnClick(context, xml);
                                        break;
                                    }
                                case 4:
                                    this.mStateSet = new StateSet(context, xml);
                                    break;
                                case 5:
                                    parseConstraintSet(context, xml);
                                    break;
                                case 6:
                                case 7:
                                    parseInclude(context, xml);
                                    break;
                                case '\b':
                                    KeyFrames keyFrames = new KeyFrames(context, xml);
                                    if (transition == null) {
                                        break;
                                    } else {
                                        transition.mKeyFramesList.add(keyFrames);
                                        break;
                                    }
                                case '\t':
                                    this.mViewTransitionController.add(new ViewTransition(context, xml));
                                    break;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00d1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0068. Please report as an issue. */
    private int parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        char c8;
        char c9;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (this.DEBUG_DESKTOP) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            c8 = 65535;
            switch (c8) {
                case 0:
                    i9 = getId(context, attributeValue);
                    break;
                case 1:
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (attributeValue.equals(TtmlNode.LEFT)) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (attributeValue.equals(TtmlNode.RIGHT)) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                        }
                        c9 = 65535;
                        switch (c9) {
                            case 0:
                                constraintSet.mRotate = 4;
                                break;
                            case 1:
                                constraintSet.mRotate = 2;
                                break;
                            case 2:
                                constraintSet.mRotate = 0;
                                break;
                            case 3:
                                constraintSet.mRotate = 1;
                                break;
                            case 4:
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i8 = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(i8));
                    constraintSet.mIdString = Debug.getName(context, i8);
                    break;
            }
        }
        if (i8 != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (i9 != -1) {
                this.mDeriveMap.put(i8, i9);
            }
            this.mConstraintSetMap.put(i8, constraintSet);
        }
        return i8;
    }

    private void parseInclude(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == R.styleable.include_constraintSet) {
                parseInclude(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i9 = obtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i9;
                if (i9 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void readConstraintChain(int i8, MotionLayout motionLayout) {
        ConstraintSet constraintSet = this.mConstraintSetMap.get(i8);
        constraintSet.derivedState = constraintSet.mIdString;
        int i9 = this.mDeriveMap.get(i8);
        if (i9 > 0) {
            readConstraintChain(i9, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i9);
            if (constraintSet2 == null) {
                Log.e(TypedValues.MotionScene.NAME, "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i9));
                return;
            }
            constraintSet.derivedState += "/" + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i8) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mOnClicks.size() > 0) {
                Iterator it2 = next.mOnClicks.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it3 = this.mAbstractTransitionList.iterator();
        while (it3.hasNext()) {
            Transition next2 = it3.next();
            if (next2.mOnClicks.size() > 0) {
                Iterator it4 = next2.mOnClicks.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it5 = this.mTransitionList.iterator();
        while (it5.hasNext()) {
            Transition next3 = it5.next();
            if (next3.mOnClicks.size() > 0) {
                Iterator it6 = next3.mOnClicks.iterator();
                while (it6.hasNext()) {
                    ((Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, i8, next3);
                }
            }
        }
        Iterator<Transition> it7 = this.mAbstractTransitionList.iterator();
        while (it7.hasNext()) {
            Transition next4 = it7.next();
            if (next4.mOnClicks.size() > 0) {
                Iterator it8 = next4.mOnClicks.iterator();
                while (it8.hasNext()) {
                    ((Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, i8, next4);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public boolean applyViewTransition(int i8, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(i8, motionController);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean autoTransition(MotionLayout motionLayout, int i8) {
        Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != next || !transition.isTransitionFlag(2))) {
                if (i8 == next.mConstraintSetStart && (next.mAutoTransition == 4 || next.mAutoTransition == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (i8 == next.mConstraintSetEnd && (next.mAutoTransition == 3 || next.mAutoTransition == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public Transition bestTransitionFor(int i8, float f8, float f9, MotionEvent motionEvent) {
        float f10;
        if (i8 != -1) {
            List<Transition> transitionsWithState = getTransitionsWithState(i8);
            RectF rectF = new RectF();
            float f11 = 0.0f;
            Transition transition = null;
            for (Transition transition2 : transitionsWithState) {
                if (!transition2.mDisable && transition2.mTouchResponse != null) {
                    transition2.mTouchResponse.setRTL(this.mRtl);
                    RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || motionEvent == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                        if (limitBoundsTo == null || motionEvent == null || limitBoundsTo.contains(motionEvent.getX(), motionEvent.getY())) {
                            float dot = transition2.mTouchResponse.dot(f8, f9);
                            if (transition2.mTouchResponse.mIsRotateMode && motionEvent != null) {
                                dot = ((float) (Math.atan2(f9 + r10, f8 + r9) - Math.atan2(motionEvent.getX() - transition2.mTouchResponse.mRotateCenterX, motionEvent.getY() - transition2.mTouchResponse.mRotateCenterY))) * 10.0f;
                            }
                            if (transition2.mConstraintSetEnd == i8) {
                                f10 = -1.0f;
                            } else {
                                f10 = 1.1f;
                            }
                            float f12 = dot * f10;
                            if (f12 > f11) {
                                transition = transition2;
                                f11 = f12;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.mCurrentTransition;
    }

    public void disableAutoTransition(boolean z8) {
        this.mDisableAutoTransition = z8;
    }

    public void enableViewTransition(int i8, boolean z8) {
        this.mViewTransitionController.enableViewTransition(i8, z8);
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAutoCompleteMode() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
        }
        return 0;
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            printStream.println("size " + this.mConstraintSetMap.size());
        }
        for (int i8 = 0; i8 < this.mConstraintSetMap.size(); i8++) {
            int keyAt = this.mConstraintSetMap.keyAt(i8);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.DEBUG_DESKTOP) {
                System.out.println("Id for <" + i8 + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.mConstraintSetMap.get(keyAt);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = this.mConstraintSetMap.keyAt(i8);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mConstraintSetEnd;
        }
        return -1;
    }

    public Interpolator getInterpolator() {
        int i8 = this.mCurrentTransition.mDefaultInterpolator;
        if (i8 != -2) {
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    if (i8 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            final Easing interpolator = Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f8) {
                    return (float) interpolator.get(f8);
                }
            };
        }
        return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Key getKeyFrame(Context context, int i8, int i9, int i10) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            KeyFrames keyFrames = (KeyFrames) it.next();
            for (Integer num : keyFrames.getKeys()) {
                if (i9 == num.intValue()) {
                    Iterator<Key> it2 = keyFrames.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        Key next = it2.next();
                        if (next.mFramePosition == i10 && next.mType == i8) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it = transition2.mKeyFramesList.iterator();
                while (it.hasNext()) {
                    ((KeyFrames) it.next()).addFrames(motionController);
                }
                return;
            }
            return;
        }
        Iterator it2 = transition.mKeyFramesList.iterator();
        while (it2.hasNext()) {
            ((KeyFrames) it2.next()).addFrames(motionController);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
        }
        return false;
    }

    public float getPathPercent(View view, int i8) {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getProgressDirection(float f8, float f9) {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getProgressDirection(f8, f9);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSpringBoundary() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getSpringDamping() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getSpringDamping();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getSpringMass() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getSpringMass();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getSpringStiffiness() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getSpringStopThreshold() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
        }
        return 0.0f;
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mConstraintSetStart;
        }
        return -1;
    }

    public Transition getTransitionById(int i8) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mId == i8) {
                return next;
            }
        }
        return null;
    }

    int getTransitionDirection(int i8) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == i8) {
                return 0;
            }
        }
        return 1;
    }

    public List<Transition> getTransitionsWithState(int i8) {
        int realID = getRealID(i8);
        ArrayList arrayList = new ArrayList();
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mConstraintSetStart == realID || next.mConstraintSetEnd == realID) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasKeyFramePosition(View view, int i8) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isViewTransitionEnabled(int i8) {
        return this.mViewTransitionController.isViewTransitionEnabled(i8);
    }

    public int lookUpConstraintId(String str) {
        Integer num = this.mConstraintSetIdMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i8) {
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i8) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processScrollMove(float f8, float f9) {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.scrollMove(f8, f9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processScrollUp(float f8, float f9) {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.scrollUp(f8, f9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent motionEvent, int i8, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (i8 != -1) {
            int action = motionEvent.getAction();
            boolean z8 = false;
            if (action != 0) {
                if (action == 2 && !this.mIgnoreTouch) {
                    float rawY = motionEvent.getRawY() - this.mLastTouchY;
                    float rawX = motionEvent.getRawX() - this.mLastTouchX;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.mLastTouchDown) == null) {
                        return;
                    }
                    Transition bestTransitionFor = bestTransitionFor(i8, rawX, rawY, motionEvent2);
                    if (bestTransitionFor != null) {
                        motionLayout.setTransition(bestTransitionFor);
                        RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion != null && !touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            z8 = true;
                        }
                        this.mMotionOutsideRegion = z8;
                        this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                    }
                }
            } else {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo != null && !limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mLastTouchDown = null;
                        this.mIgnoreTouch = true;
                        return;
                    }
                    RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mMotionOutsideRegion = true;
                    } else {
                        this.mMotionOutsideRegion = false;
                    }
                    this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                    return;
                }
                return;
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(motionEvent, this.mVelocityTracker, i8, this);
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (motionTracker = this.mVelocityTracker) != null) {
            motionTracker.recycle();
            this.mVelocityTracker = null;
            int i9 = motionLayout.mCurrentState;
            if (i9 != -1) {
                autoTransition(motionLayout, i9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void readFallback(MotionLayout motionLayout) {
        for (int i8 = 0; i8 < this.mConstraintSetMap.size(); i8++) {
            int keyAt = this.mConstraintSetMap.keyAt(i8);
            if (hasCycleDependency(keyAt)) {
                Log.e(TypedValues.MotionScene.NAME, "Cannot be derived from yourself");
                return;
            }
            readConstraintChain(keyAt, motionLayout);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    public void setConstraintSet(int i8, ConstraintSet constraintSet) {
        this.mConstraintSetMap.put(i8, constraintSet);
    }

    public void setDuration(int i8) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i8);
        } else {
            this.mDefaultDuration = i8;
        }
    }

    public void setKeyframe(View view, int i8, String str, Object obj) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == i8) {
                    if (obj != null) {
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void setRtl(boolean z8) {
        this.mRtl = z8;
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:            if (r2 != (-1)) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTransition(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.StateSet r0 = r6.mStateSet
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r6.mStateSet
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r3)
            if (r3 != r8) goto L2d
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r3)
            if (r3 != r7) goto L2d
            return
        L2d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mTransitionList
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r2) goto L4b
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 == r0) goto L57
        L4b:
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L33
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 != r7) goto L33
        L57:
            r6.mCurrentTransition = r4
            if (r4 == 0) goto L6c
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r7)
            boolean r8 = r6.mRtl
            r7.setRTL(r8)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mAbstractTransitionList
            java.util.Iterator r3 = r3.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L75
            r7 = r4
            goto L75
        L89:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r8, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r8, r2)
            if (r0 == r1) goto L9b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r7 = r6.mTransitionList
            r7.add(r8)
        L9b:
            r6.mCurrentTransition = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.setTransition(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.setupTouch();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean supportTouch() {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            return true;
        }
        return false;
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        if (motionLayout == this.mMotionLayout && motionLayout.mScene == this) {
            return true;
        }
        return false;
    }

    public void viewTransition(int i8, View... viewArr) {
        this.mViewTransitionController.viewTransition(i8, viewArr);
    }

    /* loaded from: classes.dex */
    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        Transition(MotionScene motionScene, Transition transition) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = typedArray.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (i9 == 3) {
                        String string = typedArray.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i10 = typedArray.getInt(index, this.mDuration);
                    this.mDuration = i10;
                    if (i10 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.mStagger = typedArray.getFloat(index, this.mStagger);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = typedArray.getInteger(index, this.mAutoTransition);
                } else if (index == R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.mDisable = typedArray.getBoolean(index, this.mDisable);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = typedArray.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = typedArray.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = typedArray.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            fill(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public void addOnClick(int i8, int i9) {
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (it.hasNext()) {
                TransitionOnClick next = it.next();
                if (next.mTargetId == i8) {
                    next.mMode = i9;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, i8, i9));
        }

        public String debugString(Context context) {
            String resourceEntryName;
            if (this.mConstraintSetStart == -1) {
                resourceEntryName = "null";
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.mConstraintSetStart);
            }
            if (this.mConstraintSetEnd == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getId() {
            return this.mId;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public boolean isTransitionFlag(int i8) {
            if ((i8 & this.mTransitionFlags) != 0) {
                return true;
            }
            return false;
        }

        public void removeOnClick(int i8) {
            TransitionOnClick transitionOnClick;
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (true) {
                if (it.hasNext()) {
                    transitionOnClick = it.next();
                    if (transitionOnClick.mTargetId == i8) {
                        break;
                    }
                } else {
                    transitionOnClick = null;
                    break;
                }
            }
            if (transitionOnClick != null) {
                this.mOnClicks.remove(transitionOnClick);
            }
        }

        public void setAutoTransition(int i8) {
            this.mAutoTransition = i8;
        }

        public void setDuration(int i8) {
            this.mDuration = Math.max(i8, 8);
        }

        public void setEnable(boolean z8) {
            setEnabled(z8);
        }

        public void setEnabled(boolean z8) {
            this.mDisable = !z8;
        }

        public void setInterpolatorInfo(int i8, String str, int i9) {
            this.mDefaultInterpolator = i8;
            this.mDefaultInterpolatorString = str;
            this.mDefaultInterpolatorID = i9;
        }

        public void setLayoutDuringTransition(int i8) {
            this.mLayoutDuringTransition = i8;
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            TouchResponse touchResponse;
            if (onSwipe == null) {
                touchResponse = null;
            } else {
                touchResponse = new TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
            }
            this.mTouchResponse = touchResponse;
        }

        public void setOnTouchUp(int i8) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i8);
            }
        }

        public void setPathMotionArc(int i8) {
            this.mPathMotionArc = i8;
        }

        public void setStagger(float f8) {
            this.mStagger = f8;
        }

        public void setTransitionFlag(int i8) {
            this.mTransitionFlags = i8;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        /* loaded from: classes.dex */
        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i8 = 0; i8 < indexCount; i8++) {
                    int index = obtainStyledAttributes.getIndex(i8);
                    if (index == R.styleable.OnClick_targetId) {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.mMode = obtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void addOnClickListeners(MotionLayout motionLayout, int i8, Transition transition) {
                boolean z8;
                boolean z9;
                boolean z10;
                boolean z11;
                int i9 = this.mTargetId;
                MotionLayout motionLayout2 = motionLayout;
                if (i9 != -1) {
                    motionLayout2 = motionLayout.findViewById(i9);
                }
                if (motionLayout2 != null) {
                    int i10 = transition.mConstraintSetStart;
                    int i11 = transition.mConstraintSetEnd;
                    if (i10 == -1) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    int i12 = this.mMode;
                    boolean z12 = false;
                    if ((i12 & 1) != 0 && i8 == i10) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((i12 & 256) != 0 && i8 == i10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z13 = z8 | z9;
                    if ((i12 & 1) != 0 && i8 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = z10 | z13;
                    if ((i12 & 16) != 0 && i8 == i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = z14 | z11;
                    if ((i12 & 4096) != 0 && i8 == i11) {
                        z12 = true;
                    }
                    if (z15 | z12) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e(TypedValues.MotionScene.NAME, "OnClick could not find id " + this.mTargetId);
            }

            boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.mTransition;
                if (transition2 != transition) {
                    int i8 = transition2.mConstraintSetEnd;
                    int i9 = this.mTransition.mConstraintSetStart;
                    if (i9 == -1) {
                        if (motionLayout.mCurrentState != i8) {
                            return true;
                        }
                        return false;
                    }
                    int i10 = motionLayout.mCurrentState;
                    if (i10 == i9 || i10 == i8) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z8;
                boolean z9;
                MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                if (!motionLayout.isInteractionEnabled()) {
                    return;
                }
                if (this.mTransition.mConstraintSetStart == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.mTransition.mConstraintSetEnd);
                        return;
                    }
                    Transition transition = new Transition(this.mTransition.mMotionScene, this.mTransition);
                    transition.mConstraintSetStart = currentState;
                    transition.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                    motionLayout.setTransition(transition);
                    motionLayout.transitionToEnd();
                    return;
                }
                Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                int i8 = this.mMode;
                boolean z10 = false;
                if ((i8 & 1) == 0 && (i8 & 256) == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if ((i8 & 16) == 0 && (i8 & 4096) == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z8 && z9) {
                    Transition transition3 = this.mTransition.mMotionScene.mCurrentTransition;
                    Transition transition4 = this.mTransition;
                    if (transition3 != transition4) {
                        motionLayout.setTransition(transition4);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z10 = z8;
                        z9 = false;
                    }
                } else {
                    z10 = z8;
                }
                if (isTransitionViable(transition2, motionLayout)) {
                    if (z10 && (this.mMode & 1) != 0) {
                        motionLayout.setTransition(this.mTransition);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    if (z9 && (this.mMode & 16) != 0) {
                        motionLayout.setTransition(this.mTransition);
                        motionLayout.transitionToStart();
                    } else if (z10 && (this.mMode & 256) != 0) {
                        motionLayout.setTransition(this.mTransition);
                        motionLayout.setProgress(1.0f);
                    } else if (z9 && (this.mMode & 4096) != 0) {
                        motionLayout.setTransition(this.mTransition);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i8 = this.mTargetId;
                if (i8 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i8);
                if (findViewById == null) {
                    Log.e(TypedValues.MotionScene.NAME, " (*)  could not find id " + this.mTargetId);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            public TransitionOnClick(Transition transition, int i8, int i9) {
                this.mTransition = transition;
                this.mTargetId = i8;
                this.mMode = i9;
            }
        }

        public Transition(int i8, MotionScene motionScene, int i9, int i10) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = i8;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i9;
            this.mConstraintSetEnd = i10;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int parseInclude(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e8) {
            e8.printStackTrace();
            return -1;
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintSet getConstraintSet(int i8) {
        return getConstraintSet(i8, -1, -1);
    }

    ConstraintSet getConstraintSet(int i8, int i9, int i10) {
        int stateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + i8);
            printStream.println("size " + this.mConstraintSetMap.size());
        }
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i8, i9, i10)) != -1) {
            i8 = stateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i8) == null) {
            Log.e(TypedValues.MotionScene.NAME, "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i8) + " In MotionScene");
            SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MotionScene(Context context, MotionLayout motionLayout, int i8) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
        load(context, i8);
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        int i9 = R.id.motion_base;
        sparseArray.put(i9, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(i9));
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }
}

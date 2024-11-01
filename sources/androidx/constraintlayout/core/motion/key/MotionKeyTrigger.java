package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class MotionKeyTrigger extends MotionKey {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    FloatRect mCollisionRect;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    FloatRect mTargetRect;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;
    private int mCurveFit = -1;
    private String mCross = null;

    public MotionKeyTrigger() {
        int i8 = MotionKey.UNSET;
        this.mTriggerReceiver = i8;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i8;
        this.mTriggerCollisionId = i8;
        this.mTriggerSlack = 0.1f;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mViewTransitionOnNegativeCross = i8;
        this.mViewTransitionOnPositiveCross = i8;
        this.mViewTransitionOnCross = i8;
        this.mCollisionRect = new FloatRect();
        this.mTargetRect = new FloatRect();
        this.mType = 5;
        this.mCustom = new HashMap<>();
    }

    private void fireCustom(String str, MotionWidget motionWidget) {
        boolean z8;
        if (str.length() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustom.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z8 || lowerCase.matches(str)) {
                CustomVariable customVariable = this.mCustom.get(str2);
                if (customVariable != null) {
                    customVariable.applyToWidget(motionWidget);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    public void conditionallyFire(float f8, MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        char c8;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        if (i8 == 307) {
            this.mTriggerCollisionId = i9;
            return true;
        }
        if (i8 == 308) {
            this.mTriggerID = toInt(Integer.valueOf(i9));
            return true;
        }
        if (i8 != 311) {
            switch (i8) {
                case 301:
                    this.mViewTransitionOnCross = i9;
                    return true;
                case 302:
                    this.mViewTransitionOnPositiveCross = i9;
                    return true;
                case 303:
                    this.mViewTransitionOnNegativeCross = i9;
                    return true;
                default:
                    return super.setValue(i8, i9);
            }
        }
        this.mTriggerReceiver = i9;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo5417clone() {
        return new MotionKeyTrigger().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTrigger copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.mCurveFit = motionKeyTrigger.mCurveFit;
        this.mCross = motionKeyTrigger.mCross;
        this.mTriggerReceiver = motionKeyTrigger.mTriggerReceiver;
        this.mNegativeCross = motionKeyTrigger.mNegativeCross;
        this.mPositiveCross = motionKeyTrigger.mPositiveCross;
        this.mTriggerID = motionKeyTrigger.mTriggerID;
        this.mTriggerCollisionId = motionKeyTrigger.mTriggerCollisionId;
        this.mTriggerSlack = motionKeyTrigger.mTriggerSlack;
        this.mFireCrossReset = motionKeyTrigger.mFireCrossReset;
        this.mFireNegativeReset = motionKeyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = motionKeyTrigger.mFirePositiveReset;
        this.mFireThreshold = motionKeyTrigger.mFireThreshold;
        this.mFireLastPos = motionKeyTrigger.mFireLastPos;
        this.mPostLayout = motionKeyTrigger.mPostLayout;
        this.mCollisionRect = motionKeyTrigger.mCollisionRect;
        this.mTargetRect = motionKeyTrigger.mTargetRect;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        if (i8 != 305) {
            return super.setValue(i8, f8);
        }
        this.mTriggerSlack = f8;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 == 309) {
            this.mPositiveCross = str;
            return true;
        }
        if (i8 == 310) {
            this.mNegativeCross = str;
            return true;
        }
        if (i8 != 312) {
            return super.setValue(i8, str);
        }
        this.mCross = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, boolean z8) {
        if (i8 != 304) {
            return super.setValue(i8, z8);
        }
        this.mPostLayout = z8;
        return true;
    }
}

package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;
    private int mDragDirection = 0;
    private int mTouchAnchorSide = 0;
    private int mTouchAnchorId = -1;
    private int mTouchRegionId = -1;
    private int mLimitBoundsTo = -1;
    private int mOnTouchUp = 0;
    private int mRotationCenterId = -1;
    private float mMaxVelocity = 4.0f;
    private float mMaxAcceleration = 1.2f;
    private boolean mMoveWhenScrollAtTop = true;
    private float mDragScale = 1.0f;
    private int mFlags = 0;
    private float mDragThreshold = 10.0f;
    private float mSpringDamping = Float.NaN;
    private float mSpringMass = 1.0f;
    private float mSpringStiffness = Float.NaN;
    private float mSpringStopThreshold = Float.NaN;
    private int mSpringBoundary = 0;
    private int mAutoCompleteMode = 0;

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    public int getDragDirection() {
        return this.mDragDirection;
    }

    public float getDragScale() {
        return this.mDragScale;
    }

    public float getDragThreshold() {
        return this.mDragThreshold;
    }

    public int getLimitBoundsTo() {
        return this.mLimitBoundsTo;
    }

    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public int getNestedScrollFlags() {
        return this.mFlags;
    }

    public int getOnTouchUp() {
        return this.mOnTouchUp;
    }

    public int getRotationCenterId() {
        return this.mRotationCenterId;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public int getTouchAnchorId() {
        return this.mTouchAnchorId;
    }

    public int getTouchAnchorSide() {
        return this.mTouchAnchorSide;
    }

    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    public void setAutoCompleteMode(int i8) {
        this.mAutoCompleteMode = i8;
    }

    public OnSwipe setDragDirection(int i8) {
        this.mDragDirection = i8;
        return this;
    }

    public OnSwipe setDragScale(int i8) {
        this.mDragScale = i8;
        return this;
    }

    public OnSwipe setDragThreshold(int i8) {
        this.mDragThreshold = i8;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int i8) {
        this.mLimitBoundsTo = i8;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i8) {
        this.mMaxAcceleration = i8;
        return this;
    }

    public OnSwipe setMaxVelocity(int i8) {
        this.mMaxVelocity = i8;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z8) {
        this.mMoveWhenScrollAtTop = z8;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int i8) {
        this.mFlags = i8;
        return this;
    }

    public OnSwipe setOnTouchUp(int i8) {
        this.mOnTouchUp = i8;
        return this;
    }

    public OnSwipe setRotateCenter(int i8) {
        this.mRotationCenterId = i8;
        return this;
    }

    public OnSwipe setSpringBoundary(int i8) {
        this.mSpringBoundary = i8;
        return this;
    }

    public OnSwipe setSpringDamping(float f8) {
        this.mSpringDamping = f8;
        return this;
    }

    public OnSwipe setSpringMass(float f8) {
        this.mSpringMass = f8;
        return this;
    }

    public OnSwipe setSpringStiffness(float f8) {
        this.mSpringStiffness = f8;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f8) {
        this.mSpringStopThreshold = f8;
        return this;
    }

    public OnSwipe setTouchAnchorId(int i8) {
        this.mTouchAnchorId = i8;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int i8) {
        this.mTouchAnchorSide = i8;
        return this;
    }

    public OnSwipe setTouchRegionId(int i8) {
        this.mTouchRegionId = i8;
        return this;
    }
}

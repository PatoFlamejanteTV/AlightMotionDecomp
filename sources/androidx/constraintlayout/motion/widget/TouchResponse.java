package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    public TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void fill(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = typedArray.getResourceId(index, this.mTouchAnchorId);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i9 = typedArray.getInt(index, this.mTouchAnchorSide);
                this.mTouchAnchorSide = i9;
                float[] fArr = TOUCH_SIDES[i9];
                this.mTouchAnchorX = fArr[0];
                this.mTouchAnchorY = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i10 = typedArray.getInt(index, this.mTouchSide);
                this.mTouchSide = i10;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (i10 < fArr2.length) {
                    float[] fArr3 = fArr2[i10];
                    this.mTouchDirectionX = fArr3[0];
                    this.mTouchDirectionY = fArr3[1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = typedArray.getFloat(index, this.mMaxVelocity);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = typedArray.getFloat(index, this.mMaxAcceleration);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(index, this.mMoveWhenScrollAtTop);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.mDragScale = typedArray.getFloat(index, this.mDragScale);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = typedArray.getFloat(index, this.mDragThreshold);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = typedArray.getResourceId(index, this.mTouchRegionId);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = typedArray.getInt(index, this.mOnTouchUp);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = typedArray.getResourceId(index, this.mRotationCenterId);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.mSpringDamping = typedArray.getFloat(index, this.mSpringDamping);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.mSpringMass = typedArray.getFloat(index, this.mSpringMass);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.mSpringStiffness = typedArray.getFloat(index, this.mSpringStiffness);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.mSpringStopThreshold = typedArray.getFloat(index, this.mSpringStopThreshold);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.mSpringBoundary = typedArray.getInt(index, this.mSpringBoundary);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = typedArray.getInt(index, this.mAutoCompleteMode);
            }
        }
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        fill(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float dot(float f8, float f9) {
        return (f8 * this.mTouchDirectionX) + (f9 * this.mTouchDirectionY);
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    public int getFlags() {
        return this.mFlags;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i8 = this.mLimitBoundsTo;
        if (i8 == -1 || (findViewById = viewGroup.findViewById(i8)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getProgressDirection(float f8, float f9) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f10 = this.mTouchDirectionX;
        if (f10 != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f8 * f10) / fArr[0];
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f9 * this.mTouchDirectionY) / fArr2[1];
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i8 = this.mTouchRegionId;
        if (i8 == -1 || (findViewById = viewGroup.findViewById(i8)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDragStarted() {
        return this.mDragStarted;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i8, MotionScene motionScene) {
        float f8;
        float f9;
        int i9;
        float f10;
        float f11;
        boolean z8;
        float f12;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i8, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.mLastTouchY;
                    float rawX = motionEvent.getRawX() - this.mLastTouchX;
                    if (Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > this.mDragThreshold || this.mDragStarted) {
                        float progress = this.mMotionLayout.getProgress();
                        if (!this.mDragStarted) {
                            this.mDragStarted = true;
                            this.mMotionLayout.setProgress(progress);
                        }
                        int i10 = this.mTouchAnchorId;
                        if (i10 != -1) {
                            this.mMotionLayout.getAnchorDpDt(i10, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                        } else {
                            float min = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                            float[] fArr = this.mAnchorDpDt;
                            fArr[1] = this.mTouchDirectionY * min;
                            fArr[0] = min * this.mTouchDirectionX;
                        }
                        float f13 = this.mTouchDirectionX;
                        float[] fArr2 = this.mAnchorDpDt;
                        if (Math.abs(((f13 * fArr2[0]) + (this.mTouchDirectionY * fArr2[1])) * this.mDragScale) < 0.01d) {
                            float[] fArr3 = this.mAnchorDpDt;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.mTouchDirectionX != 0.0f) {
                            f11 = rawX / this.mAnchorDpDt[0];
                        } else {
                            f11 = rawY / this.mAnchorDpDt[1];
                        }
                        float max = Math.max(Math.min(progress + f11, 1.0f), 0.0f);
                        if (this.mOnTouchUp == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.mOnTouchUp == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.mMotionLayout.getProgress();
                        if (max != progress2) {
                            if (progress2 == 0.0f || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.mMotionLayout;
                                if (progress2 == 0.0f) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                motionLayout.endTrigger(z8);
                            }
                            this.mMotionLayout.setProgress(max);
                            motionTracker.computeCurrentVelocity(1000);
                            float xVelocity = motionTracker.getXVelocity();
                            float yVelocity = motionTracker.getYVelocity();
                            if (this.mTouchDirectionX != 0.0f) {
                                f12 = xVelocity / this.mAnchorDpDt[0];
                            } else {
                                f12 = yVelocity / this.mAnchorDpDt[1];
                            }
                            this.mMotionLayout.mLastVelocity = f12;
                        } else {
                            this.mMotionLayout.mLastVelocity = 0.0f;
                        }
                        this.mLastTouchX = motionEvent.getRawX();
                        this.mLastTouchY = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.mDragStarted = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity2 = motionTracker.getXVelocity();
            float yVelocity2 = motionTracker.getYVelocity();
            float progress3 = this.mMotionLayout.getProgress();
            int i11 = this.mTouchAnchorId;
            if (i11 != -1) {
                this.mMotionLayout.getAnchorDpDt(i11, progress3, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float min2 = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr4 = this.mAnchorDpDt;
                fArr4[1] = this.mTouchDirectionY * min2;
                fArr4[0] = min2 * this.mTouchDirectionX;
            }
            float f14 = this.mTouchDirectionX;
            float[] fArr5 = this.mAnchorDpDt;
            float f15 = fArr5[0];
            float f16 = fArr5[1];
            if (f14 != 0.0f) {
                f8 = xVelocity2 / f15;
            } else {
                f8 = yVelocity2 / f16;
            }
            if (!Float.isNaN(f8)) {
                f9 = (f8 / 3.0f) + progress3;
            } else {
                f9 = progress3;
            }
            if (f9 != 0.0f && f9 != 1.0f && (i9 = this.mOnTouchUp) != 3) {
                if (f9 < 0.5d) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                if (i9 == 6) {
                    if (progress3 + f8 < 0.0f) {
                        f8 = Math.abs(f8);
                    }
                    f10 = 1.0f;
                }
                if (this.mOnTouchUp == 7) {
                    if (progress3 + f8 > 1.0f) {
                        f8 = -Math.abs(f8);
                    }
                    f10 = 0.0f;
                }
                this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f10, f8);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            if (0.0f >= f9 || 1.0f <= f9) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        this.mDragStarted = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void processTouchRotateEvent(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TouchResponse.processTouchRotateEvent(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scrollMove(float f8, float f9) {
        float f10;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f11 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (Math.abs((f11 * fArr[0]) + (this.mTouchDirectionY * fArr[1])) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f12 = this.mTouchDirectionX;
        if (f12 != 0.0f) {
            f10 = (f8 * f12) / this.mAnchorDpDt[0];
        } else {
            f10 = (f9 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float max = Math.max(Math.min(progress + f10, 1.0f), 0.0f);
        if (max != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(max);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scrollUp(float f8, float f9) {
        float f10;
        boolean z8;
        boolean z9 = false;
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f11 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f12 = fArr[0];
        float f13 = this.mTouchDirectionY;
        float f14 = fArr[1];
        float f15 = 0.0f;
        if (f11 != 0.0f) {
            f10 = (f8 * f11) / f12;
        } else {
            f10 = (f9 * f13) / f14;
        }
        if (!Float.isNaN(f10)) {
            progress += f10 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i8 = this.mOnTouchUp;
            if (i8 != 3) {
                z9 = true;
            }
            if (z9 & z8) {
                MotionLayout motionLayout = this.mMotionLayout;
                if (progress >= 0.5d) {
                    f15 = 1.0f;
                }
                motionLayout.touchAnimateTo(i8, f15, f10);
            }
        }
    }

    public void setAnchorId(int i8) {
        this.mTouchAnchorId = i8;
    }

    void setAutoCompleteMode(int i8) {
        this.mAutoCompleteMode = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDown(float f8, float f9) {
        this.mLastTouchX = f8;
        this.mLastTouchY = f9;
    }

    public void setMaxAcceleration(float f8) {
        this.mMaxAcceleration = f8;
    }

    public void setMaxVelocity(float f8) {
        this.mMaxVelocity = f8;
    }

    public void setRTL(boolean z8) {
        if (z8) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = TOUCH_SIDES[this.mTouchAnchorSide];
        this.mTouchAnchorX = fArr5[0];
        this.mTouchAnchorY = fArr5[1];
        int i8 = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (i8 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i8];
        this.mTouchDirectionX = fArr7[0];
        this.mTouchDirectionY = fArr7[1];
    }

    public void setTouchAnchorLocation(float f8, float f9) {
        this.mTouchAnchorX = f8;
        this.mTouchAnchorY = f9;
    }

    public void setTouchUpMode(int i8) {
        this.mOnTouchUp = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUpTouchEvent(float f8, float f9) {
        this.mLastTouchX = f8;
        this.mLastTouchY = f9;
        this.mDragStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setupTouch() {
        View view;
        int i8 = this.mTouchAnchorId;
        if (i8 != -1) {
            view = this.mMotionLayout.findViewById(i8);
            if (view == null) {
                Log.e(TAG, "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView2, int i9, int i10, int i11, int i12) {
                }
            });
        }
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return Key.ROTATION;
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public TouchResponse(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        this.mTouchAnchorId = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.mTouchAnchorSide = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = TOUCH_SIDES[touchAnchorSide];
            this.mTouchAnchorX = fArr[0];
            this.mTouchAnchorY = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.mTouchSide = dragDirection;
        float[][] fArr2 = TOUCH_DIRECTION;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this.mTouchDirectionX = fArr3[0];
            this.mTouchDirectionY = fArr3[1];
        } else {
            this.mTouchDirectionY = Float.NaN;
            this.mTouchDirectionX = Float.NaN;
            this.mIsRotateMode = true;
        }
        this.mMaxVelocity = onSwipe.getMaxVelocity();
        this.mMaxAcceleration = onSwipe.getMaxAcceleration();
        this.mMoveWhenScrollAtTop = onSwipe.getMoveWhenScrollAtTop();
        this.mDragScale = onSwipe.getDragScale();
        this.mDragThreshold = onSwipe.getDragThreshold();
        this.mTouchRegionId = onSwipe.getTouchRegionId();
        this.mOnTouchUp = onSwipe.getOnTouchUp();
        this.mFlags = onSwipe.getNestedScrollFlags();
        this.mLimitBoundsTo = onSwipe.getLimitBoundsTo();
        this.mRotationCenterId = onSwipe.getRotationCenterId();
        this.mSpringBoundary = onSwipe.getSpringBoundary();
        this.mSpringDamping = onSwipe.getSpringDamping();
        this.mSpringMass = onSwipe.getSpringMass();
        this.mSpringStiffness = onSwipe.getSpringStiffness();
        this.mSpringStopThreshold = onSwipe.getSpringStopThreshold();
        this.mAutoCompleteMode = onSwipe.getAutoCompleteMode();
    }
}

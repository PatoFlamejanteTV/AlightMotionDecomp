package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    public ReactiveGuide(Context context) {
        super(context);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(null);
    }

    private void changeValue(int i8, int i9, MotionLayout motionLayout, int i10) {
        ConstraintSet constraintSet = motionLayout.getConstraintSet(i10);
        constraintSet.setGuidelineEnd(i9, i8);
        motionLayout.updateState(i10, constraintSet);
    }

    private void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.mAttributeId = obtainStyledAttributes.getResourceId(index, this.mAttributeId);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.mAnimateChange = obtainStyledAttributes.getBoolean(index, this.mAnimateChange);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.mApplyToConstraintSetId = obtainStyledAttributes.getResourceId(index, this.mApplyToConstraintSetId);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.mApplyToAllConstraintSets = obtainStyledAttributes.getBoolean(index, this.mApplyToAllConstraintSets);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mAttributeId != -1) {
            ConstraintLayout.getSharedValues().addListener(this.mAttributeId, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.mApplyToConstraintSetId;
    }

    public int getAttributeId() {
        return this.mAttributeId;
    }

    public boolean isAnimatingChange() {
        return this.mAnimateChange;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i8, int i9, int i10) {
        setGuidelineBegin(i9);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i11 = this.mApplyToConstraintSetId;
            if (i11 != 0) {
                currentState = i11;
            }
            int i12 = 0;
            if (this.mAnimateChange) {
                if (this.mApplyToAllConstraintSets) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i12 < constraintSetIds.length) {
                        int i13 = constraintSetIds[i12];
                        if (i13 != currentState) {
                            changeValue(i9, id, motionLayout, i13);
                        }
                        i12++;
                    }
                }
                ConstraintSet cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                cloneConstraintSet.setGuidelineEnd(id, i9);
                motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
                return;
            }
            if (this.mApplyToAllConstraintSets) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i12 < constraintSetIds2.length) {
                    changeValue(i9, id, motionLayout, constraintSetIds2[i12]);
                    i12++;
                }
                return;
            }
            changeValue(i9, id, motionLayout, currentState);
        }
    }

    public void setAnimateChange(boolean z8) {
        this.mAnimateChange = z8;
    }

    public void setApplyToConstraintSetId(int i8) {
        this.mApplyToConstraintSetId = i8;
    }

    public void setAttributeId(int i8) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i9 = this.mAttributeId;
        if (i9 != -1) {
            sharedValues.removeListener(i9, this);
        }
        this.mAttributeId = i8;
        if (i8 != -1) {
            sharedValues.addListener(i8, this);
        }
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i8;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i8;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f8;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }
}

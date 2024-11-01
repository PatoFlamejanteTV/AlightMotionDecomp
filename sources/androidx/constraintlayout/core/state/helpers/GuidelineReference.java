package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes.dex */
public class GuidelineReference implements Facade, Reference {
    private Object key;
    private Guideline mGuidelineWidget;
    private int mOrientation;
    final State mState;
    private int mStart = -1;
    private int mEnd = -1;
    private float mPercent = 0.0f;

    public GuidelineReference(State state) {
        this.mState = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.mGuidelineWidget.setOrientation(this.mOrientation);
        int i8 = this.mStart;
        if (i8 != -1) {
            this.mGuidelineWidget.setGuideBegin(i8);
            return;
        }
        int i9 = this.mEnd;
        if (i9 != -1) {
            this.mGuidelineWidget.setGuideEnd(i9);
        } else {
            this.mGuidelineWidget.setGuidePercent(this.mPercent);
        }
    }

    public GuidelineReference end(Object obj) {
        this.mStart = -1;
        this.mEnd = this.mState.convertDimension(obj);
        this.mPercent = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.mGuidelineWidget == null) {
            this.mGuidelineWidget = new Guideline();
        }
        return this.mGuidelineWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.key;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public GuidelineReference percent(float f8) {
        this.mStart = -1;
        this.mEnd = -1;
        this.mPercent = f8;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.mGuidelineWidget = (Guideline) constraintWidget;
        } else {
            this.mGuidelineWidget = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public GuidelineReference start(Object obj) {
        this.mStart = this.mState.convertDimension(obj);
        this.mEnd = -1;
        this.mPercent = 0.0f;
        return this;
    }
}

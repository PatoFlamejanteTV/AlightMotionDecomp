package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class HorizontalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            ((HelperReference) this).mState.constraints(it.next()).clearHorizontal();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = ((HelperReference) this).mState.constraints(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj != null) {
                    constraints.startToStart(obj).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        constraints.startToEnd(obj2).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                    } else {
                        Object obj3 = this.mLeftToLeft;
                        if (obj3 != null) {
                            constraints.startToStart(obj3).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                        } else {
                            Object obj4 = this.mLeftToRight;
                            if (obj4 != null) {
                                constraints.startToEnd(obj4).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                            } else {
                                constraints.startToStart(State.PARENT);
                            }
                        }
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraints.getKey());
                constraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mEndToStart;
            if (obj5 != null) {
                constraintReference.endToStart(obj5).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else {
                Object obj6 = this.mEndToEnd;
                if (obj6 != null) {
                    constraintReference.endToEnd(obj6).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
                } else {
                    Object obj7 = this.mRightToLeft;
                    if (obj7 != null) {
                        constraintReference.endToStart(obj7).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                    } else {
                        Object obj8 = this.mRightToRight;
                        if (obj8 != null) {
                            constraintReference.endToEnd(obj8).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                        } else {
                            constraintReference.endToEnd(State.PARENT);
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f8 = this.mBias;
        if (f8 != 0.5f) {
            constraintReference2.horizontalBias(f8);
        }
        int i8 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    constraintReference2.setHorizontalChainStyle(2);
                    return;
                }
                return;
            }
            constraintReference2.setHorizontalChainStyle(1);
            return;
        }
        constraintReference2.setHorizontalChainStyle(0);
    }
}

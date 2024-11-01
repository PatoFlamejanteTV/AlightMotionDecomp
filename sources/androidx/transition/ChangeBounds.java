package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.Map;

/* loaded from: classes3.dex */
public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY;
    private static final Property<View, PointF> POSITION_PROPERTY;
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY;
    private boolean mResizeClip;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private static final RectEvaluator sRectEvaluator = new RectEvaluator();

    /* loaded from: classes3.dex */
    private static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        ClipListener(View view, Rect rect, boolean z8, Rect rect2, boolean z9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z8;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z9;
            this.mStartLeft = i8;
            this.mStartTop = i9;
            this.mStartRight = i10;
            this.mStartBottom = i11;
            this.mEndLeft = i12;
            this.mEndTop = i13;
            this.mEndRight = i14;
            this.mEndBottom = i15;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            Rect rect;
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            if (this.mEndClipIsNull) {
                rect = null;
            } else {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            View view = this.mView;
            int i8 = R.id.transition_clip;
            Rect rect = (Rect) view.getTag(i8);
            this.mView.setTag(i8, null);
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z8) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z8) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
            if (z8) {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
            } else {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z8) {
            int max = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int max2 = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            int i8 = z8 ? this.mEndLeft : this.mStartLeft;
            int i9 = z8 ? this.mEndTop : this.mStartTop;
            ViewUtils.setLeftTopRightBottom(this.mView, i8, i9, max + i8, max2 + i9);
            this.mView.setClipBounds(z8 ? this.mEndClip : this.mStartClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public /* synthetic */ void onTransitionEnd(Transition transition, boolean z8) {
            e.a(this, transition, z8);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public /* synthetic */ void onTransitionStart(Transition transition, boolean z8) {
            e.b(this, transition, z8);
        }
    }

    /* loaded from: classes3.dex */
    private static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean mCanceled = false;
        final ViewGroup mParent;

        SuppressLayoutListener(@NonNull ViewGroup viewGroup) {
            this.mParent = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
            this.mCanceled = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            if (!this.mCanceled) {
                ViewGroupUtils.suppressLayout(this.mParent, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final View mView;

        ViewBounds(View view) {
            this.mView = view;
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }

        void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            int i8 = this.mBottomRightCalls + 1;
            this.mBottomRightCalls = i8;
            if (this.mTopLeftCalls == i8) {
                setLeftTopRightBottom();
            }
        }

        void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            int i8 = this.mTopLeftCalls + 1;
            this.mTopLeftCalls = i8;
            if (i8 == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setTopLeft(pointF);
            }
        };
        String str2 = "bottomRight";
        BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setBottomRight(pointF);
            }
        };
        BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
        POSITION_PROPERTY = new Property<View, PointF>(cls, "position") { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                ViewUtils.setLeftTopRightBottom(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
            }
        };
    }

    public ChangeBounds() {
        this.mResizeClip = false;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
            if (this.mResizeClip) {
                transitionValues.values.put(PROPNAME_CLIP, view.getClipBounds());
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        Rect rect;
        captureValues(transitionValues);
        if (this.mResizeClip && (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) != null) {
            transitionValues.values.put(PROPNAME_CLIP, rect);
        }
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        ObjectAnimator ofPointF;
        boolean z8;
        int i12;
        boolean z9;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator mergeAnimators;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get(PROPNAME_PARENT);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(PROPNAME_PARENT);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = transitionValues2.view;
        Rect rect2 = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        Rect rect3 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        int i13 = rect2.left;
        int i14 = rect3.left;
        int i15 = rect2.top;
        int i16 = rect3.top;
        int i17 = rect2.right;
        int i18 = rect3.right;
        int i19 = rect2.bottom;
        int i20 = rect3.bottom;
        int i21 = i17 - i13;
        int i22 = i19 - i15;
        int i23 = i18 - i14;
        int i24 = i20 - i16;
        Rect rect4 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Rect rect5 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        if ((i21 != 0 && i22 != 0) || (i23 != 0 && i24 != 0)) {
            if (i13 == i14 && i15 == i16) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            if (i17 != i18 || i19 != i20) {
                i8++;
            }
        } else {
            i8 = 0;
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i8++;
        }
        if (i8 > 0) {
            if (!this.mResizeClip) {
                view = view2;
                ViewUtils.setLeftTopRightBottom(view, i13, i15, i17, i19);
                if (i8 == 2) {
                    if (i21 == i23 && i22 == i24) {
                        mergeAnimators = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i13, i15, i14, i16));
                    } else {
                        ViewBounds viewBounds = new ViewBounds(view);
                        ObjectAnimator ofPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath(i13, i15, i14, i16));
                        ObjectAnimator ofPointF3 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath(i17, i19, i18, i20));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofPointF2, ofPointF3);
                        animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                            private final ViewBounds mViewBounds;
                            final /* synthetic */ ViewBounds val$viewBounds;

                            {
                                this.val$viewBounds = viewBounds;
                                this.mViewBounds = viewBounds;
                            }
                        });
                        mergeAnimators = animatorSet;
                    }
                } else if (i13 == i14 && i15 == i16) {
                    mergeAnimators = ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath(i17, i19, i18, i20));
                } else {
                    mergeAnimators = ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath(i13, i15, i14, i16));
                }
            } else {
                view = view2;
                ViewUtils.setLeftTopRightBottom(view, i13, i15, Math.max(i21, i23) + i13, i15 + Math.max(i22, i24));
                if (i13 == i14 && i15 == i16) {
                    i9 = i18;
                    i10 = i17;
                    i11 = i15;
                    ofPointF = null;
                } else {
                    i9 = i18;
                    i10 = i17;
                    i11 = i15;
                    ofPointF = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i13, i15, i14, i16));
                }
                if (rect4 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i12 = 0;
                    rect4 = new Rect(0, 0, i21, i22);
                } else {
                    i12 = 0;
                }
                Rect rect6 = rect4;
                if (rect5 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    rect = new Rect(i12, i12, i23, i24);
                } else {
                    rect = rect5;
                }
                if (!rect6.equals(rect)) {
                    view.setClipBounds(rect6);
                    RectEvaluator rectEvaluator = sRectEvaluator;
                    Object[] objArr = new Object[2];
                    objArr[i12] = rect6;
                    objArr[1] = rect;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", rectEvaluator, objArr);
                    ClipListener clipListener = new ClipListener(view, rect6, z8, rect, z9, i13, i11, i10, i19, i14, i16, i9, i20);
                    objectAnimator.addListener(clipListener);
                    addListener(clipListener);
                } else {
                    objectAnimator = null;
                }
                mergeAnimators = TransitionUtils.mergeAnimators(ofPointF, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                ViewGroupUtils.suppressLayout(viewGroup4, true);
                getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
            }
            return mergeAnimators;
        }
        return null;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public void setResizeClip(boolean z8) {
        this.mResizeClip = z8;
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mResizeClip = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }
}

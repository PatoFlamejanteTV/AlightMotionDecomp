package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ChangeTransform extends Transition {
    private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final String PROPNAME_PARENT = "android:changeTransform:parent";
    private boolean mReparent;
    private Matrix mTempMatrix;
    boolean mUseOverlay;
    private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final String[] sTransitionProperties = {PROPNAME_MATRIX, PROPNAME_TRANSFORMS, PROPNAME_PARENT_MATRIX};
    private static final Property<PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        @Override // android.util.Property
        public float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            pathAnimatorMatrix.setValues(fArr);
        }
    };
    private static final Property<PathAnimatorMatrix, PointF> TRANSLATIONS_PROPERTY = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        public PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            pathAnimatorMatrix.setTranslation(pointF);
        }
    };
    private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class GhostListener extends TransitionListenerAdapter {
        private GhostView mGhostView;
        private View mView;

        GhostListener(View view, GhostView ghostView) {
            this.mView = view;
            this.mGhostView = ghostView;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
            GhostViewUtils.removeGhost(this.mView);
            this.mView.setTag(R.id.transition_transform, null);
            this.mView.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            this.mGhostView.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            this.mGhostView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Listener extends AnimatorListenerAdapter {
        private final Matrix mEndMatrix;
        private final boolean mHandleParentChange;
        private boolean mIsCanceled;
        private final PathAnimatorMatrix mPathAnimatorMatrix;
        private final Matrix mTempMatrix = new Matrix();
        private final Transforms mTransforms;
        private final boolean mUseOverlay;
        private final View mView;

        Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix, boolean z8, boolean z9) {
            this.mHandleParentChange = z8;
            this.mUseOverlay = z9;
            this.mView = view;
            this.mTransforms = transforms;
            this.mPathAnimatorMatrix = pathAnimatorMatrix;
            this.mEndMatrix = matrix;
        }

        private void setCurrentMatrix(Matrix matrix) {
            this.mTempMatrix.set(matrix);
            this.mView.setTag(R.id.transition_transform, this.mTempMatrix);
            this.mTransforms.restore(this.mView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mIsCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mIsCanceled) {
                if (this.mHandleParentChange && this.mUseOverlay) {
                    setCurrentMatrix(this.mEndMatrix);
                } else {
                    this.mView.setTag(R.id.transition_transform, null);
                    this.mView.setTag(R.id.parent_matrix, null);
                }
            }
            ViewUtils.setAnimationMatrix(this.mView, null);
            this.mTransforms.restore(this.mView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            setCurrentMatrix(this.mPathAnimatorMatrix.getMatrix());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.setIdentityTransforms(this.mView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PathAnimatorMatrix {
        private final Matrix mMatrix = new Matrix();
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final View mView;

        PathAnimatorMatrix(View view, float[] fArr) {
            this.mView = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.mValues = fArr2;
            this.mTranslationX = fArr2[2];
            this.mTranslationY = fArr2[5];
            setAnimationMatrix();
        }

        private void setAnimationMatrix() {
            float[] fArr = this.mValues;
            fArr[2] = this.mTranslationX;
            fArr[5] = this.mTranslationY;
            this.mMatrix.setValues(fArr);
            ViewUtils.setAnimationMatrix(this.mView, this.mMatrix);
        }

        Matrix getMatrix() {
            return this.mMatrix;
        }

        void setTranslation(PointF pointF) {
            this.mTranslationX = pointF.x;
            this.mTranslationY = pointF.y;
            setAnimationMatrix();
        }

        void setValues(float[] fArr) {
            System.arraycopy(fArr, 0, this.mValues, 0, fArr.length);
            setAnimationMatrix();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Transforms {
        final float mRotationX;
        final float mRotationY;
        final float mRotationZ;
        final float mScaleX;
        final float mScaleY;
        final float mTranslationX;
        final float mTranslationY;
        final float mTranslationZ;

        Transforms(View view) {
            this.mTranslationX = view.getTranslationX();
            this.mTranslationY = view.getTranslationY();
            this.mTranslationZ = ViewCompat.getTranslationZ(view);
            this.mScaleX = view.getScaleX();
            this.mScaleY = view.getScaleY();
            this.mRotationX = view.getRotationX();
            this.mRotationY = view.getRotationY();
            this.mRotationZ = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            if (transforms.mTranslationX != this.mTranslationX || transforms.mTranslationY != this.mTranslationY || transforms.mTranslationZ != this.mTranslationZ || transforms.mScaleX != this.mScaleX || transforms.mScaleY != this.mScaleY || transforms.mRotationX != this.mRotationX || transforms.mRotationY != this.mRotationY || transforms.mRotationZ != this.mRotationZ) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            float f8 = this.mTranslationX;
            int i15 = 0;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            } else {
                i8 = 0;
            }
            int i16 = i8 * 31;
            float f9 = this.mTranslationY;
            if (f9 != 0.0f) {
                i9 = Float.floatToIntBits(f9);
            } else {
                i9 = 0;
            }
            int i17 = (i16 + i9) * 31;
            float f10 = this.mTranslationZ;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i18 = (i17 + i10) * 31;
            float f11 = this.mScaleX;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 31;
            float f12 = this.mScaleY;
            if (f12 != 0.0f) {
                i12 = Float.floatToIntBits(f12);
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 31;
            float f13 = this.mRotationX;
            if (f13 != 0.0f) {
                i13 = Float.floatToIntBits(f13);
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 31;
            float f14 = this.mRotationY;
            if (f14 != 0.0f) {
                i14 = Float.floatToIntBits(f14);
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 31;
            float f15 = this.mRotationZ;
            if (f15 != 0.0f) {
                i15 = Float.floatToIntBits(f15);
            }
            return i22 + i15;
        }

        public void restore(View view) {
            ChangeTransform.setTransforms(view, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mScaleX, this.mScaleY, this.mRotationX, this.mRotationY, this.mRotationZ);
        }
    }

    public ChangeTransform() {
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
    }

    private void captureValues(TransitionValues transitionValues) {
        Matrix matrix;
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.values.put(PROPNAME_PARENT, view.getParent());
        transitionValues.values.put(PROPNAME_TRANSFORMS, new Transforms(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        transitionValues.values.put(PROPNAME_MATRIX, matrix);
        if (this.mReparent) {
            Matrix matrix3 = new Matrix();
            ViewUtils.transformMatrixToGlobal((ViewGroup) view.getParent(), matrix3);
            matrix3.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            transitionValues.values.put(PROPNAME_PARENT_MATRIX, matrix3);
            transitionValues.values.put(PROPNAME_INTERMEDIATE_MATRIX, view.getTag(R.id.transition_transform));
            transitionValues.values.put(PROPNAME_INTERMEDIATE_PARENT_MATRIX, view.getTag(R.id.parent_matrix));
        }
    }

    private void createGhostView(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.view;
        Matrix matrix = new Matrix((Matrix) transitionValues2.values.get(PROPNAME_PARENT_MATRIX));
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        GhostView addGhost = GhostViewUtils.addGhost(view, viewGroup, matrix);
        if (addGhost == null) {
            return;
        }
        addGhost.reserveEndViewTransition((ViewGroup) transitionValues.values.get(PROPNAME_PARENT), transitionValues.view);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.mParent;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.addListener(new GhostListener(view, addGhost));
        if (SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            View view2 = transitionValues.view;
            if (view2 != transitionValues2.view) {
                ViewUtils.setTransitionAlpha(view2, 0.0f);
            }
            ViewUtils.setTransitionAlpha(view, 1.0f);
        }
    }

    private ObjectAnimator createTransformAnimator(TransitionValues transitionValues, TransitionValues transitionValues2, boolean z8) {
        Matrix matrix = (Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        Matrix matrix2 = (Matrix) transitionValues2.values.get(PROPNAME_MATRIX);
        if (matrix == null) {
            matrix = MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.IDENTITY_MATRIX;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        Transforms transforms = (Transforms) transitionValues2.values.get(PROPNAME_TRANSFORMS);
        View view = transitionValues2.view;
        setIdentityTransforms(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, new FloatArrayEvaluator(new float[9]), fArr, fArr2), PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        Listener listener = new Listener(view, transforms, pathAnimatorMatrix, matrix3, z8, this.mUseOverlay);
        ofPropertyValuesHolder.addListener(listener);
        ofPropertyValuesHolder.addPauseListener(listener);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:            if (r4 == r5) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:            if (r5 == r4.view) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:            r1 = false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parentsMatch(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            androidx.transition.TransitionValues r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L20
            android.view.View r4 = r4.view
            if (r5 != r4) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r2 = r1
            goto L20
        L1d:
            if (r4 != r5) goto L1a
            goto L1b
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.parentsMatch(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void setIdentityTransforms(View view) {
        setTransforms(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void setMatricesForParent(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Matrix matrix = (Matrix) transitionValues2.values.get(PROPNAME_PARENT_MATRIX);
        transitionValues2.view.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.mTempMatrix;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            transitionValues.values.put(PROPNAME_MATRIX, matrix3);
        }
        matrix3.postConcat((Matrix) transitionValues.values.get(PROPNAME_PARENT_MATRIX));
        matrix3.postConcat(matrix2);
    }

    static void setTransforms(View view, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        view.setTranslationX(f8);
        view.setTranslationY(f9);
        ViewCompat.setTranslationZ(view, f10);
        view.setScaleX(f11);
        view.setScaleY(f12);
        view.setRotationX(f13);
        view.setRotationY(f14);
        view.setRotation(f15);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
        if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            ((ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
        }
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        boolean z8;
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.containsKey(PROPNAME_PARENT) && transitionValues2.values.containsKey(PROPNAME_PARENT)) {
            ViewGroup viewGroup2 = (ViewGroup) transitionValues.values.get(PROPNAME_PARENT);
            ViewGroup viewGroup3 = (ViewGroup) transitionValues2.values.get(PROPNAME_PARENT);
            if (this.mReparent && !parentsMatch(viewGroup2, viewGroup3)) {
                z8 = true;
            } else {
                z8 = false;
            }
            Matrix matrix = (Matrix) transitionValues.values.get(PROPNAME_INTERMEDIATE_MATRIX);
            if (matrix != null) {
                transitionValues.values.put(PROPNAME_MATRIX, matrix);
            }
            Matrix matrix2 = (Matrix) transitionValues.values.get(PROPNAME_INTERMEDIATE_PARENT_MATRIX);
            if (matrix2 != null) {
                transitionValues.values.put(PROPNAME_PARENT_MATRIX, matrix2);
            }
            if (z8) {
                setMatricesForParent(transitionValues, transitionValues2);
            }
            ObjectAnimator createTransformAnimator = createTransformAnimator(transitionValues, transitionValues2, z8);
            if (z8 && createTransformAnimator != null && this.mUseOverlay) {
                createGhostView(viewGroup, transitionValues, transitionValues2);
            } else if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
                viewGroup2.endViewTransition(transitionValues.view);
            }
            return createTransformAnimator;
        }
        return null;
    }

    public boolean getReparent() {
        return this.mReparent;
    }

    public boolean getReparentWithOverlay() {
        return this.mUseOverlay;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public void setReparent(boolean z8) {
        this.mReparent = z8;
    }

    public void setReparentWithOverlay(boolean z8) {
        this.mUseOverlay = z8;
    }

    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_TRANSFORM);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.mUseOverlay = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.mReparent = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}

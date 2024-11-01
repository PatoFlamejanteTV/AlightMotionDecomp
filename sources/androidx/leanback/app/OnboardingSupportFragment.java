package androidx.leanback.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.R;
import androidx.leanback.widget.PagingIndicator;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class OnboardingSupportFragment extends Fragment {
    private static final boolean DEBUG = false;
    private static final long DESCRIPTION_START_DELAY_MS = 33;
    private static final long HEADER_ANIMATION_DURATION_MS = 417;
    private static final long HEADER_APPEAR_DELAY_MS = 500;
    private static final TimeInterpolator HEADER_APPEAR_INTERPOLATOR = new DecelerateInterpolator();
    private static final TimeInterpolator HEADER_DISAPPEAR_INTERPOLATOR = new AccelerateInterpolator();
    private static final String KEY_CURRENT_PAGE_INDEX = "leanback.onboarding.current_page_index";
    private static final String KEY_ENTER_ANIMATION_FINISHED = "leanback.onboarding.enter_animation_finished";
    private static final String KEY_LOGO_ANIMATION_FINISHED = "leanback.onboarding.logo_animation_finished";
    private static final long LOGO_SPLASH_PAUSE_DURATION_MS = 1333;
    private static final int SLIDE_DISTANCE = 60;
    private static final String TAG = "OnboardingF";
    private static int sSlideDistance;
    private AnimatorSet mAnimator;
    private boolean mArrowBackgroundColorSet;
    private boolean mArrowColorSet;
    int mCurrentPageIndex;
    TextView mDescriptionView;
    private boolean mDescriptionViewTextColorSet;
    private boolean mDotBackgroundColorSet;
    boolean mEnterAnimationFinished;
    private int mIconResourceId;
    boolean mIsLtr;
    boolean mLogoAnimationFinished;
    private int mLogoResourceId;
    private ImageView mLogoView;
    private ImageView mMainIconView;
    PagingIndicator mPageIndicator;
    View mStartButton;
    private CharSequence mStartButtonText;
    private boolean mStartButtonTextSet;
    private ContextThemeWrapper mThemeWrapper;
    TextView mTitleView;
    private boolean mTitleViewTextColorSet;

    @ColorInt
    private int mTitleViewTextColor = 0;

    @ColorInt
    private int mDescriptionViewTextColor = 0;

    @ColorInt
    private int mDotBackgroundColor = 0;

    @ColorInt
    private int mArrowColor = 0;

    @ColorInt
    private int mArrowBackgroundColor = 0;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: androidx.leanback.app.OnboardingSupportFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnboardingSupportFragment onboardingSupportFragment = OnboardingSupportFragment.this;
            if (!onboardingSupportFragment.mLogoAnimationFinished) {
                return;
            }
            if (onboardingSupportFragment.mCurrentPageIndex == onboardingSupportFragment.getPageCount() - 1) {
                OnboardingSupportFragment.this.onFinishFragment();
            } else {
                OnboardingSupportFragment.this.moveToNextPage();
            }
        }
    };
    private final View.OnKeyListener mOnKeyListener = new View.OnKeyListener() { // from class: androidx.leanback.app.OnboardingSupportFragment.2
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (!OnboardingSupportFragment.this.mLogoAnimationFinished) {
                if (i8 == 4) {
                    return false;
                }
                return true;
            }
            if (keyEvent.getAction() == 0) {
                return false;
            }
            if (i8 != 4) {
                if (i8 != 21) {
                    if (i8 != 22) {
                        return false;
                    }
                    OnboardingSupportFragment onboardingSupportFragment = OnboardingSupportFragment.this;
                    if (onboardingSupportFragment.mIsLtr) {
                        onboardingSupportFragment.moveToNextPage();
                    } else {
                        onboardingSupportFragment.moveToPreviousPage();
                    }
                    return true;
                }
                OnboardingSupportFragment onboardingSupportFragment2 = OnboardingSupportFragment.this;
                if (onboardingSupportFragment2.mIsLtr) {
                    onboardingSupportFragment2.moveToPreviousPage();
                } else {
                    onboardingSupportFragment2.moveToNextPage();
                }
                return true;
            }
            OnboardingSupportFragment onboardingSupportFragment3 = OnboardingSupportFragment.this;
            if (onboardingSupportFragment3.mCurrentPageIndex == 0) {
                return false;
            }
            onboardingSupportFragment3.moveToPreviousPage();
            return true;
        }
    };

    private Animator createAnimator(View view, boolean z8, int i8, long j8) {
        boolean z9;
        boolean z10;
        ObjectAnimator ofFloat;
        int i9;
        ObjectAnimator ofFloat2;
        int i10;
        if (getView().getLayoutDirection() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((z9 && i8 == 8388613) || ((!z9 && i8 == 8388611) || i8 == 5)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8) {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            Property property = View.TRANSLATION_X;
            if (z10) {
                i10 = sSlideDistance;
            } else {
                i10 = -sSlideDistance;
            }
            ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, i10, 0.0f);
            TimeInterpolator timeInterpolator = HEADER_APPEAR_INTERPOLATOR;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat2.setInterpolator(timeInterpolator);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            Property property2 = View.TRANSLATION_X;
            if (z10) {
                i9 = sSlideDistance;
            } else {
                i9 = -sSlideDistance;
            }
            ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 0.0f, i9);
            TimeInterpolator timeInterpolator2 = HEADER_DISAPPEAR_INTERPOLATOR;
            ofFloat.setInterpolator(timeInterpolator2);
            ofFloat2.setInterpolator(timeInterpolator2);
        }
        ofFloat.setDuration(HEADER_ANIMATION_DURATION_MS);
        ofFloat.setTarget(view);
        ofFloat2.setDuration(HEADER_ANIMATION_DURATION_MS);
        ofFloat2.setTarget(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (j8 > 0) {
            animatorSet.setStartDelay(j8);
        }
        return animatorSet;
    }

    private LayoutInflater getThemeInflater(LayoutInflater layoutInflater) {
        ContextThemeWrapper contextThemeWrapper = this.mThemeWrapper;
        if (contextThemeWrapper != null) {
            return layoutInflater.cloneInContext(contextThemeWrapper);
        }
        return layoutInflater;
    }

    private void onPageChangedInternal(int i8) {
        Animator createAnimator;
        AnimatorSet animatorSet = this.mAnimator;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.mPageIndicator.onPageSelected(this.mCurrentPageIndex, true);
        ArrayList arrayList = new ArrayList();
        if (i8 < getCurrentPageIndex()) {
            arrayList.add(createAnimator(this.mTitleView, false, GravityCompat.START, 0L));
            createAnimator = createAnimator(this.mDescriptionView, false, GravityCompat.START, DESCRIPTION_START_DELAY_MS);
            arrayList.add(createAnimator);
            arrayList.add(createAnimator(this.mTitleView, true, GravityCompat.END, HEADER_APPEAR_DELAY_MS));
            arrayList.add(createAnimator(this.mDescriptionView, true, GravityCompat.END, 533L));
        } else {
            arrayList.add(createAnimator(this.mTitleView, false, GravityCompat.END, 0L));
            createAnimator = createAnimator(this.mDescriptionView, false, GravityCompat.END, DESCRIPTION_START_DELAY_MS);
            arrayList.add(createAnimator);
            arrayList.add(createAnimator(this.mTitleView, true, GravityCompat.START, HEADER_APPEAR_DELAY_MS));
            arrayList.add(createAnimator(this.mDescriptionView, true, GravityCompat.START, 533L));
        }
        final int currentPageIndex = getCurrentPageIndex();
        createAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.app.OnboardingSupportFragment.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                OnboardingSupportFragment onboardingSupportFragment = OnboardingSupportFragment.this;
                onboardingSupportFragment.mTitleView.setText(onboardingSupportFragment.getPageTitle(currentPageIndex));
                OnboardingSupportFragment onboardingSupportFragment2 = OnboardingSupportFragment.this;
                onboardingSupportFragment2.mDescriptionView.setText(onboardingSupportFragment2.getPageDescription(currentPageIndex));
            }
        });
        Context context = getContext();
        if (getCurrentPageIndex() == getPageCount() - 1) {
            this.mStartButton.setVisibility(0);
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_page_indicator_fade_out);
            loadAnimator.setTarget(this.mPageIndicator);
            loadAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.app.OnboardingSupportFragment.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    OnboardingSupportFragment.this.mPageIndicator.setVisibility(8);
                }
            });
            arrayList.add(loadAnimator);
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_start_button_fade_in);
            loadAnimator2.setTarget(this.mStartButton);
            arrayList.add(loadAnimator2);
        } else if (i8 == getPageCount() - 1) {
            this.mPageIndicator.setVisibility(0);
            Animator loadAnimator3 = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_page_indicator_fade_in);
            loadAnimator3.setTarget(this.mPageIndicator);
            arrayList.add(loadAnimator3);
            Animator loadAnimator4 = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_start_button_fade_out);
            loadAnimator4.setTarget(this.mStartButton);
            loadAnimator4.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.app.OnboardingSupportFragment.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    OnboardingSupportFragment.this.mStartButton.setVisibility(8);
                }
            });
            arrayList.add(loadAnimator4);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.mAnimator = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.mAnimator.start();
        onPageChanged(this.mCurrentPageIndex, i8);
    }

    private void resolveTheme() {
        Context context = getContext();
        int onProvideTheme = onProvideTheme();
        if (onProvideTheme == -1) {
            int i8 = R.attr.onboardingTheme;
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
                this.mThemeWrapper = new ContextThemeWrapper(context, typedValue.resourceId);
                return;
            }
            return;
        }
        this.mThemeWrapper = new ContextThemeWrapper(context, onProvideTheme);
    }

    @ColorInt
    public final int getArrowBackgroundColor() {
        return this.mArrowBackgroundColor;
    }

    @ColorInt
    public final int getArrowColor() {
        return this.mArrowColor;
    }

    protected final int getCurrentPageIndex() {
        return this.mCurrentPageIndex;
    }

    @ColorInt
    public final int getDescriptionViewTextColor() {
        return this.mDescriptionViewTextColor;
    }

    @ColorInt
    public final int getDotBackgroundColor() {
        return this.mDotBackgroundColor;
    }

    public final int getIconResourceId() {
        return this.mIconResourceId;
    }

    public final int getLogoResourceId() {
        return this.mLogoResourceId;
    }

    protected abstract int getPageCount();

    protected abstract CharSequence getPageDescription(int i8);

    protected abstract CharSequence getPageTitle(int i8);

    public final CharSequence getStartButtonText() {
        return this.mStartButtonText;
    }

    @ColorInt
    public final int getTitleViewTextColor() {
        return this.mTitleViewTextColor;
    }

    void hideLogoView() {
        this.mLogoView.setVisibility(8);
        int i8 = this.mIconResourceId;
        if (i8 != 0) {
            this.mMainIconView.setImageResource(i8);
            this.mMainIconView.setVisibility(0);
        }
        View view = getView();
        LayoutInflater themeInflater = getThemeInflater(LayoutInflater.from(getContext()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.background_container);
        View onCreateBackgroundView = onCreateBackgroundView(themeInflater, viewGroup);
        if (onCreateBackgroundView != null) {
            viewGroup.setVisibility(0);
            viewGroup.addView(onCreateBackgroundView);
        }
        int i9 = R.id.content_container;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(i9);
        View onCreateContentView = onCreateContentView(themeInflater, viewGroup2);
        if (onCreateContentView != null) {
            viewGroup2.setVisibility(0);
            viewGroup2.addView(onCreateContentView);
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.foreground_container);
        View onCreateForegroundView = onCreateForegroundView(themeInflater, viewGroup3);
        if (onCreateForegroundView != null) {
            viewGroup3.setVisibility(0);
            viewGroup3.addView(onCreateForegroundView);
        }
        view.findViewById(R.id.page_container).setVisibility(0);
        view.findViewById(i9).setVisibility(0);
        if (getPageCount() > 1) {
            this.mPageIndicator.setPageCount(getPageCount());
            this.mPageIndicator.onPageSelected(this.mCurrentPageIndex, false);
        }
        if (this.mCurrentPageIndex == getPageCount() - 1) {
            this.mStartButton.setVisibility(0);
        } else {
            this.mPageIndicator.setVisibility(0);
        }
        this.mTitleView.setText(getPageTitle(this.mCurrentPageIndex));
        this.mDescriptionView.setText(getPageDescription(this.mCurrentPageIndex));
    }

    protected final boolean isLogoAnimationFinished() {
        return this.mLogoAnimationFinished;
    }

    protected void moveToNextPage() {
        if (this.mLogoAnimationFinished && this.mCurrentPageIndex < getPageCount() - 1) {
            int i8 = this.mCurrentPageIndex;
            this.mCurrentPageIndex = i8 + 1;
            onPageChangedInternal(i8);
        }
    }

    protected void moveToPreviousPage() {
        int i8;
        if (this.mLogoAnimationFinished && (i8 = this.mCurrentPageIndex) > 0) {
            this.mCurrentPageIndex = i8 - 1;
            onPageChangedInternal(i8);
        }
    }

    @Nullable
    protected abstract View onCreateBackgroundView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Nullable
    protected abstract View onCreateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    protected Animator onCreateDescriptionAnimator() {
        return AnimatorInflater.loadAnimator(getContext(), R.animator.lb_onboarding_description_enter);
    }

    @Nullable
    protected Animator onCreateEnterAnimation() {
        return null;
    }

    @Nullable
    protected abstract View onCreateForegroundView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Nullable
    protected Animator onCreateLogoAnimation() {
        return null;
    }

    protected Animator onCreateTitleAnimator() {
        return AnimatorInflater.loadAnimator(getContext(), R.animator.lb_onboarding_title_enter);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        resolveTheme();
        boolean z8 = false;
        ViewGroup viewGroup2 = (ViewGroup) getThemeInflater(layoutInflater).inflate(R.layout.lb_onboarding_fragment, viewGroup, false);
        if (getResources().getConfiguration().getLayoutDirection() == 0) {
            z8 = true;
        }
        this.mIsLtr = z8;
        PagingIndicator pagingIndicator = (PagingIndicator) viewGroup2.findViewById(R.id.page_indicator);
        this.mPageIndicator = pagingIndicator;
        pagingIndicator.setOnClickListener(this.mOnClickListener);
        this.mPageIndicator.setOnKeyListener(this.mOnKeyListener);
        View findViewById = viewGroup2.findViewById(R.id.button_start);
        this.mStartButton = findViewById;
        findViewById.setOnClickListener(this.mOnClickListener);
        this.mStartButton.setOnKeyListener(this.mOnKeyListener);
        this.mMainIconView = (ImageView) viewGroup2.findViewById(R.id.main_icon);
        this.mLogoView = (ImageView) viewGroup2.findViewById(R.id.logo);
        this.mTitleView = (TextView) viewGroup2.findViewById(R.id.title);
        this.mDescriptionView = (TextView) viewGroup2.findViewById(R.id.description);
        if (this.mTitleViewTextColorSet) {
            this.mTitleView.setTextColor(this.mTitleViewTextColor);
        }
        if (this.mDescriptionViewTextColorSet) {
            this.mDescriptionView.setTextColor(this.mDescriptionViewTextColor);
        }
        if (this.mDotBackgroundColorSet) {
            this.mPageIndicator.setDotBackgroundColor(this.mDotBackgroundColor);
        }
        if (this.mArrowColorSet) {
            this.mPageIndicator.setArrowColor(this.mArrowColor);
        }
        if (this.mArrowBackgroundColorSet) {
            this.mPageIndicator.setDotBackgroundColor(this.mArrowBackgroundColor);
        }
        if (this.mStartButtonTextSet) {
            ((Button) this.mStartButton).setText(this.mStartButtonText);
        }
        Context context = getContext();
        if (sSlideDistance == 0) {
            sSlideDistance = (int) (context.getResources().getDisplayMetrics().scaledDensity * 60.0f);
        }
        viewGroup2.requestFocus();
        return viewGroup2;
    }

    protected void onFinishFragment() {
    }

    protected void onLogoAnimationFinished() {
        startEnterAnimation(false);
    }

    protected void onPageChanged(int i8, int i9) {
    }

    public int onProvideTheme() {
        return -1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(KEY_CURRENT_PAGE_INDEX, this.mCurrentPageIndex);
        bundle.putBoolean(KEY_LOGO_ANIMATION_FINISHED, this.mLogoAnimationFinished);
        bundle.putBoolean(KEY_ENTER_ANIMATION_FINISHED, this.mEnterAnimationFinished);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            this.mCurrentPageIndex = 0;
            this.mLogoAnimationFinished = false;
            this.mEnterAnimationFinished = false;
            this.mPageIndicator.onPageSelected(0, false);
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.leanback.app.OnboardingSupportFragment.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    OnboardingSupportFragment.this.getView().getViewTreeObserver().removeOnPreDrawListener(this);
                    if (!OnboardingSupportFragment.this.startLogoAnimation()) {
                        OnboardingSupportFragment onboardingSupportFragment = OnboardingSupportFragment.this;
                        onboardingSupportFragment.mLogoAnimationFinished = true;
                        onboardingSupportFragment.onLogoAnimationFinished();
                    }
                    return true;
                }
            });
            return;
        }
        this.mCurrentPageIndex = bundle.getInt(KEY_CURRENT_PAGE_INDEX);
        this.mLogoAnimationFinished = bundle.getBoolean(KEY_LOGO_ANIMATION_FINISHED);
        this.mEnterAnimationFinished = bundle.getBoolean(KEY_ENTER_ANIMATION_FINISHED);
        if (!this.mLogoAnimationFinished) {
            if (!startLogoAnimation()) {
                this.mLogoAnimationFinished = true;
                onLogoAnimationFinished();
                return;
            }
            return;
        }
        onLogoAnimationFinished();
    }

    public void setArrowBackgroundColor(@ColorInt int i8) {
        this.mArrowBackgroundColor = i8;
        this.mArrowBackgroundColorSet = true;
        PagingIndicator pagingIndicator = this.mPageIndicator;
        if (pagingIndicator != null) {
            pagingIndicator.setArrowBackgroundColor(i8);
        }
    }

    public void setArrowColor(@ColorInt int i8) {
        this.mArrowColor = i8;
        this.mArrowColorSet = true;
        PagingIndicator pagingIndicator = this.mPageIndicator;
        if (pagingIndicator != null) {
            pagingIndicator.setArrowColor(i8);
        }
    }

    public void setDescriptionViewTextColor(@ColorInt int i8) {
        this.mDescriptionViewTextColor = i8;
        this.mDescriptionViewTextColorSet = true;
        TextView textView = this.mDescriptionView;
        if (textView != null) {
            textView.setTextColor(i8);
        }
    }

    public void setDotBackgroundColor(@ColorInt int i8) {
        this.mDotBackgroundColor = i8;
        this.mDotBackgroundColorSet = true;
        PagingIndicator pagingIndicator = this.mPageIndicator;
        if (pagingIndicator != null) {
            pagingIndicator.setDotBackgroundColor(i8);
        }
    }

    public final void setIconResouceId(int i8) {
        this.mIconResourceId = i8;
        ImageView imageView = this.mMainIconView;
        if (imageView != null) {
            imageView.setImageResource(i8);
            this.mMainIconView.setVisibility(0);
        }
    }

    public final void setLogoResourceId(int i8) {
        this.mLogoResourceId = i8;
    }

    public void setStartButtonText(CharSequence charSequence) {
        this.mStartButtonText = charSequence;
        this.mStartButtonTextSet = true;
        View view = this.mStartButton;
        if (view != null) {
            ((Button) view).setText(charSequence);
        }
    }

    public void setTitleViewTextColor(@ColorInt int i8) {
        this.mTitleViewTextColor = i8;
        this.mTitleViewTextColorSet = true;
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setTextColor(i8);
        }
    }

    protected final void startEnterAnimation(boolean z8) {
        Object obj;
        Context context = getContext();
        if (context == null) {
            return;
        }
        hideLogoView();
        if (this.mEnterAnimationFinished && !z8) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_page_indicator_enter);
        if (getPageCount() <= 1) {
            obj = this.mStartButton;
        } else {
            obj = this.mPageIndicator;
        }
        loadAnimator.setTarget(obj);
        arrayList.add(loadAnimator);
        Animator onCreateTitleAnimator = onCreateTitleAnimator();
        if (onCreateTitleAnimator != null) {
            onCreateTitleAnimator.setTarget(this.mTitleView);
            arrayList.add(onCreateTitleAnimator);
        }
        Animator onCreateDescriptionAnimator = onCreateDescriptionAnimator();
        if (onCreateDescriptionAnimator != null) {
            onCreateDescriptionAnimator.setTarget(this.mDescriptionView);
            arrayList.add(onCreateDescriptionAnimator);
        }
        Animator onCreateEnterAnimation = onCreateEnterAnimation();
        if (onCreateEnterAnimation != null) {
            arrayList.add(onCreateEnterAnimation);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimator = animatorSet;
        animatorSet.playTogether(arrayList);
        this.mAnimator.start();
        this.mAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.app.OnboardingSupportFragment.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                OnboardingSupportFragment.this.mEnterAnimationFinished = true;
            }
        });
        getView().requestFocus();
    }

    boolean startLogoAnimation() {
        Animator animator;
        final Context context = getContext();
        if (context == null) {
            return false;
        }
        if (this.mLogoResourceId != 0) {
            this.mLogoView.setVisibility(0);
            this.mLogoView.setImageResource(this.mLogoResourceId);
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_logo_enter);
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.lb_onboarding_logo_exit);
            loadAnimator2.setStartDelay(LOGO_SPLASH_PAUSE_DURATION_MS);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(loadAnimator, loadAnimator2);
            animatorSet.setTarget(this.mLogoView);
            animator = animatorSet;
        } else {
            animator = onCreateLogoAnimation();
        }
        if (animator == null) {
            return false;
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.app.OnboardingSupportFragment.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                if (context != null) {
                    OnboardingSupportFragment onboardingSupportFragment = OnboardingSupportFragment.this;
                    onboardingSupportFragment.mLogoAnimationFinished = true;
                    onboardingSupportFragment.onLogoAnimationFinished();
                }
            }
        });
        animator.start();
        return true;
    }
}

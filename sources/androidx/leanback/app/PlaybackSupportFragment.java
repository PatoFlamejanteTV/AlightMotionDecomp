package androidx.leanback.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.leanback.R;
import androidx.leanback.animation.LogAccelerateInterpolator;
import androidx.leanback.animation.LogDecelerateInterpolator;
import androidx.leanback.media.PlaybackGlueHost;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.BaseGridView;
import androidx.leanback.widget.BaseOnItemViewClickedListener;
import androidx.leanback.widget.BaseOnItemViewSelectedListener;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.FacetProvider;
import androidx.leanback.widget.ItemAlignmentFacet;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.PlaybackSeekDataProvider;
import androidx.leanback.widget.PlaybackSeekUi;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class PlaybackSupportFragment extends Fragment {
    private static final int ANIMATING = 1;
    private static final int ANIMATION_MULTIPLIER = 1;
    public static final int BG_DARK = 1;
    public static final int BG_LIGHT = 2;
    public static final int BG_NONE = 0;
    static final String BUNDLE_CONTROL_VISIBLE_ON_CREATEVIEW = "controlvisible_oncreateview";
    private static final boolean DEBUG = false;
    private static final int IDLE = 0;
    private static final int START_FADE_OUT = 1;
    private static final String TAG = "PlaybackSupportFragment";
    ObjectAdapter mAdapter;
    int mAnimationTranslateY;
    int mAutohideTimerAfterPlayingInMs;
    int mAutohideTimerAfterTickleInMs;
    View mBackgroundView;
    int mBgAlpha;
    int mBgDarkColor;
    ValueAnimator mBgFadeInAnimator;
    ValueAnimator mBgFadeOutAnimator;
    int mBgLightColor;
    ValueAnimator mControlRowFadeInAnimator;
    ValueAnimator mControlRowFadeOutAnimator;
    BaseOnItemViewClickedListener mExternalItemClickedListener;
    BaseOnItemViewSelectedListener mExternalItemSelectedListener;
    OnFadeCompleteListener mFadeCompleteListener;
    PlaybackGlueHost.HostCallback mHostCallback;
    boolean mInSeek;
    View.OnKeyListener mInputEventHandler;
    int mMajorFadeTranslateY;
    int mMinorFadeTranslateY;
    ValueAnimator mOtherRowFadeInAnimator;
    ValueAnimator mOtherRowFadeOutAnimator;
    int mOtherRowsCenterToBottom;
    int mPaddingBottom;
    BaseOnItemViewClickedListener mPlaybackItemClickedListener;
    PlaybackRowPresenter mPresenter;
    View mRootView;
    Row mRow;
    RowsSupportFragment mRowsSupportFragment;
    PlaybackSeekUi.Client mSeekUiClient;
    ProgressBarManager mProgressBarManager = new ProgressBarManager();
    private final BaseOnItemViewClickedListener mOnItemViewClickedListener = new BaseOnItemViewClickedListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.1
        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Object obj2) {
            BaseOnItemViewClickedListener baseOnItemViewClickedListener = PlaybackSupportFragment.this.mPlaybackItemClickedListener;
            if (baseOnItemViewClickedListener != null && (viewHolder2 instanceof PlaybackRowPresenter.ViewHolder)) {
                baseOnItemViewClickedListener.onItemClicked(viewHolder, obj, viewHolder2, obj2);
            }
            BaseOnItemViewClickedListener baseOnItemViewClickedListener2 = PlaybackSupportFragment.this.mExternalItemClickedListener;
            if (baseOnItemViewClickedListener2 != null) {
                baseOnItemViewClickedListener2.onItemClicked(viewHolder, obj, viewHolder2, obj2);
            }
        }
    };
    private final BaseOnItemViewSelectedListener mOnItemViewSelectedListener = new BaseOnItemViewSelectedListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.2
        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Object obj2) {
            BaseOnItemViewSelectedListener baseOnItemViewSelectedListener = PlaybackSupportFragment.this.mExternalItemSelectedListener;
            if (baseOnItemViewSelectedListener != null) {
                baseOnItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, obj2);
            }
        }
    };
    private final SetSelectionRunnable mSetSelectionRunnable = new SetSelectionRunnable();
    int mBackgroundType = 1;
    boolean mFadingEnabled = true;
    boolean mControlVisibleBeforeOnCreateView = true;
    boolean mControlVisible = true;
    private final Animator.AnimatorListener mFadeListener = new Animator.AnimatorListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.3
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ItemBridgeAdapter.ViewHolder viewHolder;
            PlaybackSupportFragment playbackSupportFragment = PlaybackSupportFragment.this;
            if (playbackSupportFragment.mBgAlpha > 0) {
                playbackSupportFragment.enableVerticalGridAnimations(true);
                OnFadeCompleteListener onFadeCompleteListener = PlaybackSupportFragment.this.mFadeCompleteListener;
                if (onFadeCompleteListener != null) {
                    onFadeCompleteListener.onFadeInComplete();
                    return;
                }
                return;
            }
            VerticalGridView verticalGridView = playbackSupportFragment.getVerticalGridView();
            if (verticalGridView != null && verticalGridView.getSelectedPosition() == 0 && (viewHolder = (ItemBridgeAdapter.ViewHolder) verticalGridView.findViewHolderForAdapterPosition(0)) != null && (viewHolder.getPresenter() instanceof PlaybackRowPresenter)) {
                ((PlaybackRowPresenter) viewHolder.getPresenter()).onReappear((RowPresenter.ViewHolder) viewHolder.getViewHolder());
            }
            OnFadeCompleteListener onFadeCompleteListener2 = PlaybackSupportFragment.this.mFadeCompleteListener;
            if (onFadeCompleteListener2 != null) {
                onFadeCompleteListener2.onFadeOutComplete();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            PlaybackSupportFragment.this.enableVerticalGridAnimations(false);
        }
    };
    private final Handler mHandler = new Handler() { // from class: androidx.leanback.app.PlaybackSupportFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                PlaybackSupportFragment playbackSupportFragment = PlaybackSupportFragment.this;
                if (playbackSupportFragment.mFadingEnabled) {
                    playbackSupportFragment.hideControlsOverlay(true);
                }
            }
        }
    };
    private final BaseGridView.OnTouchInterceptListener mOnTouchInterceptListener = new BaseGridView.OnTouchInterceptListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.5
        @Override // androidx.leanback.widget.BaseGridView.OnTouchInterceptListener
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return PlaybackSupportFragment.this.onInterceptInputEvent(motionEvent);
        }
    };
    private final BaseGridView.OnKeyInterceptListener mOnKeyInterceptListener = new BaseGridView.OnKeyInterceptListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.6
        @Override // androidx.leanback.widget.BaseGridView.OnKeyInterceptListener
        public boolean onInterceptKeyEvent(KeyEvent keyEvent) {
            return PlaybackSupportFragment.this.onInterceptInputEvent(keyEvent);
        }
    };
    private TimeInterpolator mLogDecelerateInterpolator = new LogDecelerateInterpolator(100, 0);
    private TimeInterpolator mLogAccelerateInterpolator = new LogAccelerateInterpolator(100, 0);
    private final ItemBridgeAdapter.AdapterListener mAdapterListener = new ItemBridgeAdapter.AdapterListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.10
        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onAttachedToWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            if (!PlaybackSupportFragment.this.mControlVisible) {
                viewHolder.getViewHolder().view.setAlpha(0.0f);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onBind(ItemBridgeAdapter.ViewHolder viewHolder) {
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onCreate(ItemBridgeAdapter.ViewHolder viewHolder) {
            FacetProvider viewHolder2 = viewHolder.getViewHolder();
            if (viewHolder2 instanceof PlaybackSeekUi) {
                ((PlaybackSeekUi) viewHolder2).setPlaybackSeekUiClient(PlaybackSupportFragment.this.mChainedClient);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onDetachedFromWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            viewHolder.getViewHolder().view.setAlpha(1.0f);
            viewHolder.getViewHolder().view.setTranslationY(0.0f);
            viewHolder.getViewHolder().view.setAlpha(1.0f);
        }
    };
    final PlaybackSeekUi.Client mChainedClient = new PlaybackSeekUi.Client() { // from class: androidx.leanback.app.PlaybackSupportFragment.11
        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public PlaybackSeekDataProvider getPlaybackSeekDataProvider() {
            PlaybackSeekUi.Client client = PlaybackSupportFragment.this.mSeekUiClient;
            if (client == null) {
                return null;
            }
            return client.getPlaybackSeekDataProvider();
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public boolean isSeekEnabled() {
            PlaybackSeekUi.Client client = PlaybackSupportFragment.this.mSeekUiClient;
            if (client == null) {
                return false;
            }
            return client.isSeekEnabled();
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekFinished(boolean z8) {
            PlaybackSeekUi.Client client = PlaybackSupportFragment.this.mSeekUiClient;
            if (client != null) {
                client.onSeekFinished(z8);
            }
            PlaybackSupportFragment.this.setSeekMode(false);
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekPositionChanged(long j8) {
            PlaybackSeekUi.Client client = PlaybackSupportFragment.this.mSeekUiClient;
            if (client != null) {
                client.onSeekPositionChanged(j8);
            }
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi.Client
        public void onSeekStarted() {
            PlaybackSeekUi.Client client = PlaybackSupportFragment.this.mSeekUiClient;
            if (client != null) {
                client.onSeekStarted();
            }
            PlaybackSupportFragment.this.setSeekMode(true);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public static class OnFadeCompleteListener {
        public void onFadeInComplete() {
        }

        public void onFadeOutComplete() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class SetSelectionRunnable implements Runnable {
        int mPosition;
        boolean mSmooth = true;

        SetSelectionRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RowsSupportFragment rowsSupportFragment = PlaybackSupportFragment.this.mRowsSupportFragment;
            if (rowsSupportFragment == null) {
                return;
            }
            rowsSupportFragment.setSelectedPosition(this.mPosition, this.mSmooth);
        }
    }

    public PlaybackSupportFragment() {
        this.mProgressBarManager.setInitialDelay(500L);
    }

    static void endAll(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        if (valueAnimator.isStarted()) {
            valueAnimator.end();
        } else if (valueAnimator2.isStarted()) {
            valueAnimator2.end();
        }
    }

    private static ValueAnimator loadAnimator(Context context, int i8) {
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, i8);
        valueAnimator.setDuration(valueAnimator.getDuration());
        return valueAnimator;
    }

    private void loadBgAnimator() {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlaybackSupportFragment.this.setBgAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        Context context = getContext();
        ValueAnimator loadAnimator = loadAnimator(context, R.animator.lb_playback_bg_fade_in);
        this.mBgFadeInAnimator = loadAnimator;
        loadAnimator.addUpdateListener(animatorUpdateListener);
        this.mBgFadeInAnimator.addListener(this.mFadeListener);
        ValueAnimator loadAnimator2 = loadAnimator(context, R.animator.lb_playback_bg_fade_out);
        this.mBgFadeOutAnimator = loadAnimator2;
        loadAnimator2.addUpdateListener(animatorUpdateListener);
        this.mBgFadeOutAnimator.addListener(this.mFadeListener);
    }

    private void loadControlRowAnimator() {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition;
                View view;
                if (PlaybackSupportFragment.this.getVerticalGridView() != null && (findViewHolderForAdapterPosition = PlaybackSupportFragment.this.getVerticalGridView().findViewHolderForAdapterPosition(0)) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    view.setAlpha(floatValue);
                    view.setTranslationY(PlaybackSupportFragment.this.mAnimationTranslateY * (1.0f - floatValue));
                }
            }
        };
        Context context = getContext();
        ValueAnimator loadAnimator = loadAnimator(context, R.animator.lb_playback_controls_fade_in);
        this.mControlRowFadeInAnimator = loadAnimator;
        loadAnimator.addUpdateListener(animatorUpdateListener);
        this.mControlRowFadeInAnimator.setInterpolator(this.mLogDecelerateInterpolator);
        ValueAnimator loadAnimator2 = loadAnimator(context, R.animator.lb_playback_controls_fade_out);
        this.mControlRowFadeOutAnimator = loadAnimator2;
        loadAnimator2.addUpdateListener(animatorUpdateListener);
        this.mControlRowFadeOutAnimator.setInterpolator(this.mLogAccelerateInterpolator);
    }

    private void loadOtherRowAnimator() {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.app.PlaybackSupportFragment.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PlaybackSupportFragment.this.getVerticalGridView() == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = PlaybackSupportFragment.this.getVerticalGridView().getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = PlaybackSupportFragment.this.getVerticalGridView().getChildAt(i8);
                    if (PlaybackSupportFragment.this.getVerticalGridView().getChildAdapterPosition(childAt) > 0) {
                        childAt.setAlpha(floatValue);
                        childAt.setTranslationY(PlaybackSupportFragment.this.mAnimationTranslateY * (1.0f - floatValue));
                    }
                }
            }
        };
        Context context = getContext();
        ValueAnimator loadAnimator = loadAnimator(context, R.animator.lb_playback_controls_fade_in);
        this.mOtherRowFadeInAnimator = loadAnimator;
        loadAnimator.addUpdateListener(animatorUpdateListener);
        this.mOtherRowFadeInAnimator.setInterpolator(this.mLogDecelerateInterpolator);
        ValueAnimator loadAnimator2 = loadAnimator(context, R.animator.lb_playback_controls_fade_out);
        this.mOtherRowFadeOutAnimator = loadAnimator2;
        loadAnimator2.addUpdateListener(animatorUpdateListener);
        this.mOtherRowFadeOutAnimator.setInterpolator(new AccelerateInterpolator());
    }

    static void reverseFirstOrStartSecond(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, boolean z8) {
        if (valueAnimator.isStarted()) {
            valueAnimator.reverse();
            if (!z8) {
                valueAnimator.end();
                return;
            }
            return;
        }
        valueAnimator2.start();
        if (!z8) {
            valueAnimator2.end();
        }
    }

    private void setupChildFragmentLayout() {
        setVerticalGridViewLayout(this.mRowsSupportFragment.getVerticalGridView());
    }

    private void setupPresenter() {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter != null && this.mRow != null && this.mPresenter != null) {
            PresenterSelector presenterSelector = objectAdapter.getPresenterSelector();
            if (presenterSelector == null) {
                ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
                classPresenterSelector.addClassPresenter(this.mRow.getClass(), this.mPresenter);
                this.mAdapter.setPresenterSelector(classPresenterSelector);
            } else if (presenterSelector instanceof ClassPresenterSelector) {
                ((ClassPresenterSelector) presenterSelector).addClassPresenter(this.mRow.getClass(), this.mPresenter);
            }
        }
    }

    private void setupRow() {
        Row row;
        ObjectAdapter objectAdapter = this.mAdapter;
        if ((objectAdapter instanceof ArrayObjectAdapter) && this.mRow != null) {
            ArrayObjectAdapter arrayObjectAdapter = (ArrayObjectAdapter) objectAdapter;
            if (arrayObjectAdapter.size() == 0) {
                arrayObjectAdapter.add(this.mRow);
                return;
            } else {
                arrayObjectAdapter.replace(0, this.mRow);
                return;
            }
        }
        if ((objectAdapter instanceof SparseArrayObjectAdapter) && (row = this.mRow) != null) {
            ((SparseArrayObjectAdapter) objectAdapter).set(0, row);
        }
    }

    private void startFadeTimer(int i8) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(1);
            this.mHandler.sendEmptyMessageDelayed(1, i8);
        }
    }

    private void stopFadeTimer() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    private void updateBackground() {
        View view = this.mBackgroundView;
        if (view != null) {
            int i8 = this.mBgDarkColor;
            int i9 = this.mBackgroundType;
            if (i9 != 0) {
                if (i9 == 2) {
                    i8 = this.mBgLightColor;
                }
            } else {
                i8 = 0;
            }
            view.setBackground(new ColorDrawable(i8));
            setBgAlpha(this.mBgAlpha);
        }
    }

    void enableVerticalGridAnimations(boolean z8) {
        if (getVerticalGridView() != null) {
            getVerticalGridView().setAnimateChildLayout(z8);
        }
    }

    @Deprecated
    public void fadeOut() {
        showControlsOverlay(false, false);
    }

    public ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getBackgroundType() {
        return this.mBackgroundType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OnFadeCompleteListener getFadeCompleteListener() {
        return this.mFadeCompleteListener;
    }

    public ProgressBarManager getProgressBarManager() {
        return this.mProgressBarManager;
    }

    VerticalGridView getVerticalGridView() {
        RowsSupportFragment rowsSupportFragment = this.mRowsSupportFragment;
        if (rowsSupportFragment == null) {
            return null;
        }
        return rowsSupportFragment.getVerticalGridView();
    }

    public void hideControlsOverlay(boolean z8) {
        showControlsOverlay(false, z8);
    }

    public boolean isControlsOverlayAutoHideEnabled() {
        return this.mFadingEnabled;
    }

    public boolean isControlsOverlayVisible() {
        return this.mControlVisible;
    }

    @Deprecated
    public boolean isFadingEnabled() {
        return isControlsOverlayAutoHideEnabled();
    }

    public void notifyPlaybackRowChanged() {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null) {
            return;
        }
        objectAdapter.notifyItemRangeChanged(0, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBufferingStateChanged(boolean z8) {
        ProgressBarManager progressBarManager = getProgressBarManager();
        if (progressBarManager != null) {
            if (z8) {
                progressBarManager.show();
            } else {
                progressBarManager.hide();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mOtherRowsCenterToBottom = getResources().getDimensionPixelSize(R.dimen.lb_playback_other_rows_center_to_bottom);
        this.mPaddingBottom = getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_padding_bottom);
        this.mBgDarkColor = getResources().getColor(R.color.lb_playback_controls_background_dark);
        this.mBgLightColor = getResources().getColor(R.color.lb_playback_controls_background_light);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTimeout, typedValue, true);
        this.mAutohideTimerAfterPlayingInMs = typedValue.data;
        getContext().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTickleTimeout, typedValue, true);
        this.mAutohideTimerAfterTickleInMs = typedValue.data;
        this.mMajorFadeTranslateY = getResources().getDimensionPixelSize(R.dimen.lb_playback_major_fade_translate_y);
        this.mMinorFadeTranslateY = getResources().getDimensionPixelSize(R.dimen.lb_playback_minor_fade_translate_y);
        loadBgAnimator();
        loadControlRowAnimator();
        loadOtherRowAnimator();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_playback_fragment, viewGroup, false);
        this.mRootView = inflate;
        this.mBackgroundView = inflate.findViewById(R.id.playback_fragment_background);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.playback_controls_dock;
        RowsSupportFragment rowsSupportFragment = (RowsSupportFragment) childFragmentManager.findFragmentById(i8);
        this.mRowsSupportFragment = rowsSupportFragment;
        if (rowsSupportFragment == null) {
            this.mRowsSupportFragment = new RowsSupportFragment();
            getChildFragmentManager().beginTransaction().replace(i8, this.mRowsSupportFragment).commit();
        }
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null) {
            setAdapter(new ArrayObjectAdapter(new ClassPresenterSelector()));
        } else {
            this.mRowsSupportFragment.setAdapter(objectAdapter);
        }
        this.mRowsSupportFragment.setOnItemViewSelectedListener(this.mOnItemViewSelectedListener);
        this.mRowsSupportFragment.setOnItemViewClickedListener(this.mOnItemViewClickedListener);
        this.mBgAlpha = 255;
        updateBackground();
        this.mRowsSupportFragment.setExternalAdapterListener(this.mAdapterListener);
        ProgressBarManager progressBarManager = getProgressBarManager();
        if (progressBarManager != null) {
            progressBarManager.setRootView((ViewGroup) this.mRootView);
        }
        return this.mRootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        PlaybackGlueHost.HostCallback hostCallback = this.mHostCallback;
        if (hostCallback != null) {
            hostCallback.onHostDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mRootView = null;
        this.mBackgroundView = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onError(int i8, CharSequence charSequence) {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    boolean onInterceptInputEvent(InputEvent inputEvent) {
        boolean z8;
        int i8;
        int i9;
        boolean z9 = true;
        boolean z10 = !this.mControlVisible;
        if (inputEvent instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) inputEvent;
            i8 = keyEvent.getKeyCode();
            i9 = keyEvent.getAction();
            View.OnKeyListener onKeyListener = this.mInputEventHandler;
            if (onKeyListener != null) {
                z8 = onKeyListener.onKey(getView(), i8, keyEvent);
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
            i8 = 0;
            i9 = 0;
        }
        if (i8 != 4 && i8 != 111) {
            switch (i8) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (!z10) {
                        z9 = z8;
                    }
                    if (i9 == 0) {
                        tickle();
                        return z9;
                    }
                    return z9;
                default:
                    if (z8 && i9 == 0) {
                        tickle();
                        break;
                    }
                    break;
            }
        } else {
            if (this.mInSeek) {
                return false;
            }
            if (!z10) {
                if (((KeyEvent) inputEvent).getAction() != 1) {
                    return true;
                }
                hideControlsOverlay(true);
                return true;
            }
        }
        return z8;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        PlaybackGlueHost.HostCallback hostCallback = this.mHostCallback;
        if (hostCallback != null) {
            hostCallback.onHostPause();
        }
        if (this.mHandler.hasMessages(1)) {
            this.mHandler.removeMessages(1);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mControlVisible && this.mFadingEnabled) {
            startFadeTimer(this.mAutohideTimerAfterPlayingInMs);
        }
        getVerticalGridView().setOnTouchInterceptListener(this.mOnTouchInterceptListener);
        getVerticalGridView().setOnKeyInterceptListener(this.mOnKeyInterceptListener);
        PlaybackGlueHost.HostCallback hostCallback = this.mHostCallback;
        if (hostCallback != null) {
            hostCallback.onHostResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setupChildFragmentLayout();
        this.mRowsSupportFragment.setAdapter(this.mAdapter);
        PlaybackGlueHost.HostCallback hostCallback = this.mHostCallback;
        if (hostCallback != null) {
            hostCallback.onHostStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        PlaybackGlueHost.HostCallback hostCallback = this.mHostCallback;
        if (hostCallback != null) {
            hostCallback.onHostStop();
        }
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onVideoSizeChanged(int i8, int i9) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mControlVisible = true;
        if (!this.mControlVisibleBeforeOnCreateView) {
            showControlsOverlay(false, false);
            this.mControlVisibleBeforeOnCreateView = true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void resetFocus() {
        ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) getVerticalGridView().findViewHolderForAdapterPosition(0);
        if (viewHolder != null && (viewHolder.getPresenter() instanceof PlaybackRowPresenter)) {
            ((PlaybackRowPresenter) viewHolder.getPresenter()).onReappear((RowPresenter.ViewHolder) viewHolder.getViewHolder());
        }
    }

    public void setAdapter(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        setupRow();
        setupPresenter();
        setPlaybackRowPresenterAlignment();
        RowsSupportFragment rowsSupportFragment = this.mRowsSupportFragment;
        if (rowsSupportFragment != null) {
            rowsSupportFragment.setAdapter(objectAdapter);
        }
    }

    public void setBackgroundType(int i8) {
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("Invalid background type");
        }
        if (i8 != this.mBackgroundType) {
            this.mBackgroundType = i8;
            updateBackground();
        }
    }

    void setBgAlpha(int i8) {
        this.mBgAlpha = i8;
        View view = this.mBackgroundView;
        if (view != null) {
            view.getBackground().setAlpha(i8);
        }
    }

    public void setControlsOverlayAutoHideEnabled(boolean z8) {
        if (z8 != this.mFadingEnabled) {
            this.mFadingEnabled = z8;
            if (isResumed() && getView().hasFocus()) {
                showControlsOverlay(true);
                if (z8) {
                    startFadeTimer(this.mAutohideTimerAfterPlayingInMs);
                } else {
                    stopFadeTimer();
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setFadeCompleteListener(OnFadeCompleteListener onFadeCompleteListener) {
        this.mFadeCompleteListener = onFadeCompleteListener;
    }

    @Deprecated
    public void setFadingEnabled(boolean z8) {
        setControlsOverlayAutoHideEnabled(z8);
    }

    public void setHostCallback(PlaybackGlueHost.HostCallback hostCallback) {
        this.mHostCallback = hostCallback;
    }

    public void setOnItemViewClickedListener(BaseOnItemViewClickedListener baseOnItemViewClickedListener) {
        this.mExternalItemClickedListener = baseOnItemViewClickedListener;
    }

    public void setOnItemViewSelectedListener(BaseOnItemViewSelectedListener baseOnItemViewSelectedListener) {
        this.mExternalItemSelectedListener = baseOnItemViewSelectedListener;
    }

    public final void setOnKeyInterceptListener(View.OnKeyListener onKeyListener) {
        this.mInputEventHandler = onKeyListener;
    }

    public void setOnPlaybackItemViewClickedListener(BaseOnItemViewClickedListener baseOnItemViewClickedListener) {
        this.mPlaybackItemClickedListener = baseOnItemViewClickedListener;
    }

    public void setPlaybackRow(Row row) {
        this.mRow = row;
        setupRow();
        setupPresenter();
    }

    public void setPlaybackRowPresenter(PlaybackRowPresenter playbackRowPresenter) {
        this.mPresenter = playbackRowPresenter;
        setupPresenter();
        setPlaybackRowPresenterAlignment();
    }

    void setPlaybackRowPresenterAlignment() {
        Presenter[] presenters;
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter != null && objectAdapter.getPresenterSelector() != null && (presenters = this.mAdapter.getPresenterSelector().getPresenters()) != null) {
            for (int i8 = 0; i8 < presenters.length; i8++) {
                Presenter presenter = presenters[i8];
                if ((presenter instanceof PlaybackRowPresenter) && presenter.getFacet(ItemAlignmentFacet.class) == null) {
                    ItemAlignmentFacet itemAlignmentFacet = new ItemAlignmentFacet();
                    ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef = new ItemAlignmentFacet.ItemAlignmentDef();
                    itemAlignmentDef.setItemAlignmentOffset(0);
                    itemAlignmentDef.setItemAlignmentOffsetPercent(100.0f);
                    itemAlignmentFacet.setAlignmentDefs(new ItemAlignmentFacet.ItemAlignmentDef[]{itemAlignmentDef});
                    presenters[i8].setFacet(ItemAlignmentFacet.class, itemAlignmentFacet);
                }
            }
        }
    }

    public void setPlaybackSeekUiClient(PlaybackSeekUi.Client client) {
        this.mSeekUiClient = client;
    }

    void setSeekMode(boolean z8) {
        int i8;
        if (this.mInSeek == z8) {
            return;
        }
        this.mInSeek = z8;
        getVerticalGridView().setSelectedPosition(0);
        if (this.mInSeek) {
            stopFadeTimer();
        }
        showControlsOverlay(true);
        int childCount = getVerticalGridView().getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getVerticalGridView().getChildAt(i9);
            if (getVerticalGridView().getChildAdapterPosition(childAt) > 0) {
                if (this.mInSeek) {
                    i8 = 4;
                } else {
                    i8 = 0;
                }
                childAt.setVisibility(i8);
            }
        }
    }

    public void setSelectedPosition(int i8) {
        setSelectedPosition(i8, true);
    }

    void setVerticalGridViewLayout(VerticalGridView verticalGridView) {
        if (verticalGridView == null) {
            return;
        }
        verticalGridView.setWindowAlignmentOffset(-this.mPaddingBottom);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setItemAlignmentOffset(this.mOtherRowsCenterToBottom - this.mPaddingBottom);
        verticalGridView.setItemAlignmentOffsetPercent(50.0f);
        verticalGridView.setPadding(verticalGridView.getPaddingLeft(), verticalGridView.getPaddingTop(), verticalGridView.getPaddingRight(), this.mPaddingBottom);
        verticalGridView.setWindowAlignment(2);
    }

    public void showControlsOverlay(boolean z8) {
        showControlsOverlay(true, z8);
    }

    public void tickle() {
        stopFadeTimer();
        showControlsOverlay(true);
        int i8 = this.mAutohideTimerAfterTickleInMs;
        if (i8 > 0 && this.mFadingEnabled) {
            startFadeTimer(i8);
        }
    }

    public void setSelectedPosition(int i8, boolean z8) {
        SetSelectionRunnable setSelectionRunnable = this.mSetSelectionRunnable;
        setSelectionRunnable.mPosition = i8;
        setSelectionRunnable.mSmooth = z8;
        if (getView() == null || getView().getHandler() == null) {
            return;
        }
        getView().getHandler().post(this.mSetSelectionRunnable);
    }

    void showControlsOverlay(boolean z8, boolean z9) {
        if (getView() == null) {
            this.mControlVisibleBeforeOnCreateView = z8;
            return;
        }
        if (!isResumed()) {
            z9 = false;
        }
        if (z8 == this.mControlVisible) {
            if (z9) {
                return;
            }
            endAll(this.mBgFadeInAnimator, this.mBgFadeOutAnimator);
            endAll(this.mControlRowFadeInAnimator, this.mControlRowFadeOutAnimator);
            endAll(this.mOtherRowFadeInAnimator, this.mOtherRowFadeOutAnimator);
            return;
        }
        this.mControlVisible = z8;
        if (!z8) {
            stopFadeTimer();
        }
        this.mAnimationTranslateY = (getVerticalGridView() == null || getVerticalGridView().getSelectedPosition() == 0) ? this.mMajorFadeTranslateY : this.mMinorFadeTranslateY;
        if (z8) {
            reverseFirstOrStartSecond(this.mBgFadeOutAnimator, this.mBgFadeInAnimator, z9);
            reverseFirstOrStartSecond(this.mControlRowFadeOutAnimator, this.mControlRowFadeInAnimator, z9);
            reverseFirstOrStartSecond(this.mOtherRowFadeOutAnimator, this.mOtherRowFadeInAnimator, z9);
        } else {
            reverseFirstOrStartSecond(this.mBgFadeInAnimator, this.mBgFadeOutAnimator, z9);
            reverseFirstOrStartSecond(this.mControlRowFadeInAnimator, this.mControlRowFadeOutAnimator, z9);
            reverseFirstOrStartSecond(this.mOtherRowFadeInAnimator, this.mOtherRowFadeOutAnimator, z9);
        }
        if (z9) {
            getView().announceForAccessibility(getString(z8 ? R.string.lb_playback_controls_shown : R.string.lb_playback_controls_hidden));
        }
    }
}

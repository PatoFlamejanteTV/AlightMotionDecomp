package androidx.leanback.widget;

import android.content.Context;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.leanback.R;
import androidx.leanback.widget.ControlBarPresenter;
import androidx.leanback.widget.PlaybackControlsPresenter;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackControlsRowView;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;

/* loaded from: classes3.dex */
public class PlaybackControlsRowPresenter extends PlaybackRowPresenter {
    static float sShadowZ;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private Presenter mDescriptionPresenter;
    OnActionClickedListener mOnActionClickedListener;
    private final ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    private final ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;
    PlaybackControlsPresenter mPlaybackControlsPresenter;
    private int mProgressColor;
    private boolean mProgressColorSet;
    private boolean mSecondaryActionsHidden;
    private ControlBarPresenter mSecondaryControlsPresenter;

    /* loaded from: classes3.dex */
    static class BoundData extends PlaybackControlsPresenter.BoundData {
        ViewHolder mRowViewHolder;

        BoundData() {
        }
    }

    /* loaded from: classes3.dex */
    public class ViewHolder extends PlaybackRowPresenter.ViewHolder {
        View mBgView;
        final View mBottomSpacer;
        final ViewGroup mCard;
        final ViewGroup mCardRightPanel;
        BoundData mControlsBoundData;
        final ViewGroup mControlsDock;
        int mControlsDockMarginEnd;
        int mControlsDockMarginStart;
        PlaybackControlsPresenter.ViewHolder mControlsVh;
        final ViewGroup mDescriptionDock;
        public final Presenter.ViewHolder mDescriptionViewHolder;
        final ImageView mImageView;
        final PlaybackControlsRow.OnPlaybackProgressCallback mListener;
        BoundData mSecondaryBoundData;
        final ViewGroup mSecondaryControlsDock;
        Presenter.ViewHolder mSecondaryControlsVh;
        Object mSelectedItem;
        Presenter.ViewHolder mSelectedViewHolder;
        final View mSpacer;

        ViewHolder(View view, Presenter presenter) {
            super(view);
            Presenter.ViewHolder onCreateViewHolder;
            this.mControlsBoundData = new BoundData();
            this.mSecondaryBoundData = new BoundData();
            this.mListener = new PlaybackControlsRow.OnPlaybackProgressCallback() { // from class: androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder.1
                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onBufferedPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder viewHolder = ViewHolder.this;
                    PlaybackControlsRowPresenter.this.mPlaybackControlsPresenter.setSecondaryProgressLong(viewHolder.mControlsVh, j8);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onCurrentPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder viewHolder = ViewHolder.this;
                    PlaybackControlsRowPresenter.this.mPlaybackControlsPresenter.setCurrentTimeLong(viewHolder.mControlsVh, j8);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onDurationChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder viewHolder = ViewHolder.this;
                    PlaybackControlsRowPresenter.this.mPlaybackControlsPresenter.setTotalTimeLong(viewHolder.mControlsVh, j8);
                }
            };
            this.mCard = (ViewGroup) view.findViewById(R.id.controls_card);
            this.mCardRightPanel = (ViewGroup) view.findViewById(R.id.controls_card_right_panel);
            this.mImageView = (ImageView) view.findViewById(R.id.image);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.description_dock);
            this.mDescriptionDock = viewGroup;
            this.mControlsDock = (ViewGroup) view.findViewById(R.id.controls_dock);
            this.mSecondaryControlsDock = (ViewGroup) view.findViewById(R.id.secondary_controls_dock);
            this.mSpacer = view.findViewById(R.id.spacer);
            this.mBottomSpacer = view.findViewById(R.id.bottom_spacer);
            if (presenter == null) {
                onCreateViewHolder = null;
            } else {
                onCreateViewHolder = presenter.onCreateViewHolder(viewGroup);
            }
            this.mDescriptionViewHolder = onCreateViewHolder;
            if (onCreateViewHolder != null) {
                viewGroup.addView(onCreateViewHolder.view);
            }
        }

        void dispatchItemSelection() {
            if (!isSelected()) {
                return;
            }
            if (this.mSelectedViewHolder == null) {
                if (getOnItemViewSelectedListener() != null) {
                    getOnItemViewSelectedListener().onItemSelected(null, null, this, getRow());
                }
            } else if (getOnItemViewSelectedListener() != null) {
                getOnItemViewSelectedListener().onItemSelected(this.mSelectedViewHolder, this.mSelectedItem, this, getRow());
            }
        }

        Presenter getPresenter(boolean z8) {
            ObjectAdapter secondaryActionsAdapter;
            if (z8) {
                secondaryActionsAdapter = ((PlaybackControlsRow) getRow()).getPrimaryActionsAdapter();
            } else {
                secondaryActionsAdapter = ((PlaybackControlsRow) getRow()).getSecondaryActionsAdapter();
            }
            Object obj = null;
            if (secondaryActionsAdapter == null) {
                return null;
            }
            if (secondaryActionsAdapter.getPresenterSelector() instanceof ControlButtonPresenterSelector) {
                ControlButtonPresenterSelector controlButtonPresenterSelector = (ControlButtonPresenterSelector) secondaryActionsAdapter.getPresenterSelector();
                if (z8) {
                    return controlButtonPresenterSelector.getPrimaryPresenter();
                }
                return controlButtonPresenterSelector.getSecondaryPresenter();
            }
            if (secondaryActionsAdapter.size() > 0) {
                obj = secondaryActionsAdapter.get(0);
            }
            return secondaryActionsAdapter.getPresenter(obj);
        }

        void setOutline(View view) {
            View view2 = this.mBgView;
            if (view2 != null) {
                RoundedRectHelper.setClipToRoundedOutline(view2, false);
                ViewCompat.setZ(this.mBgView, 0.0f);
            }
            this.mBgView = view;
            RoundedRectHelper.setClipToRoundedOutline(view, true);
            if (PlaybackControlsRowPresenter.sShadowZ == 0.0f) {
                PlaybackControlsRowPresenter.sShadowZ = view.getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_z);
            }
            ViewCompat.setZ(view, PlaybackControlsRowPresenter.sShadowZ);
        }
    }

    public PlaybackControlsRowPresenter(Presenter presenter) {
        this.mBackgroundColor = 0;
        this.mProgressColor = 0;
        ControlBarPresenter.OnControlSelectedListener onControlSelectedListener = new ControlBarPresenter.OnControlSelectedListener() { // from class: androidx.leanback.widget.PlaybackControlsRowPresenter.1
            @Override // androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener
            public void onControlSelected(Presenter.ViewHolder viewHolder, Object obj, ControlBarPresenter.BoundData boundData) {
                ViewHolder viewHolder2 = ((BoundData) boundData).mRowViewHolder;
                if (viewHolder2.mSelectedViewHolder != viewHolder || viewHolder2.mSelectedItem != obj) {
                    viewHolder2.mSelectedViewHolder = viewHolder;
                    viewHolder2.mSelectedItem = obj;
                    viewHolder2.dispatchItemSelection();
                }
            }
        };
        this.mOnControlSelectedListener = onControlSelectedListener;
        ControlBarPresenter.OnControlClickedListener onControlClickedListener = new ControlBarPresenter.OnControlClickedListener() { // from class: androidx.leanback.widget.PlaybackControlsRowPresenter.2
            @Override // androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener
            public void onControlClicked(Presenter.ViewHolder viewHolder, Object obj, ControlBarPresenter.BoundData boundData) {
                RowPresenter.ViewHolder viewHolder2 = ((BoundData) boundData).mRowViewHolder;
                if (viewHolder2.getOnItemViewClickedListener() != null) {
                    viewHolder2.getOnItemViewClickedListener().onItemClicked(viewHolder, obj, viewHolder2, viewHolder2.getRow());
                }
                OnActionClickedListener onActionClickedListener = PlaybackControlsRowPresenter.this.mOnActionClickedListener;
                if (onActionClickedListener != null && (obj instanceof Action)) {
                    onActionClickedListener.onActionClicked((Action) obj);
                }
            }
        };
        this.mOnControlClickedListener = onControlClickedListener;
        setHeaderPresenter(null);
        setSelectEffectEnabled(false);
        this.mDescriptionPresenter = presenter;
        this.mPlaybackControlsPresenter = new PlaybackControlsPresenter(R.layout.lb_playback_controls);
        this.mSecondaryControlsPresenter = new ControlBarPresenter(R.layout.lb_control_bar);
        this.mPlaybackControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mSecondaryControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mPlaybackControlsPresenter.setOnControlClickedListener(onControlClickedListener);
        this.mSecondaryControlsPresenter.setOnControlClickedListener(onControlClickedListener);
    }

    private int getDefaultBackgroundColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.defaultBrandColor, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_default_brand_color);
    }

    private int getDefaultProgressColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.playbackProgressPrimaryColor, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_playback_progress_color_no_theme);
    }

    private void initRow(final ViewHolder viewHolder) {
        int defaultProgressColor;
        int defaultBackgroundColor;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.mControlsDock.getLayoutParams();
        viewHolder.mControlsDockMarginStart = marginLayoutParams.getMarginStart();
        viewHolder.mControlsDockMarginEnd = marginLayoutParams.getMarginEnd();
        PlaybackControlsPresenter.ViewHolder viewHolder2 = (PlaybackControlsPresenter.ViewHolder) this.mPlaybackControlsPresenter.onCreateViewHolder(viewHolder.mControlsDock);
        viewHolder.mControlsVh = viewHolder2;
        PlaybackControlsPresenter playbackControlsPresenter = this.mPlaybackControlsPresenter;
        if (this.mProgressColorSet) {
            defaultProgressColor = this.mProgressColor;
        } else {
            defaultProgressColor = getDefaultProgressColor(viewHolder.mControlsDock.getContext());
        }
        playbackControlsPresenter.setProgressColor(viewHolder2, defaultProgressColor);
        PlaybackControlsPresenter playbackControlsPresenter2 = this.mPlaybackControlsPresenter;
        PlaybackControlsPresenter.ViewHolder viewHolder3 = viewHolder.mControlsVh;
        if (this.mBackgroundColorSet) {
            defaultBackgroundColor = this.mBackgroundColor;
        } else {
            defaultBackgroundColor = getDefaultBackgroundColor(viewHolder.view.getContext());
        }
        playbackControlsPresenter2.setBackgroundColor(viewHolder3, defaultBackgroundColor);
        viewHolder.mControlsDock.addView(viewHolder.mControlsVh.view);
        Presenter.ViewHolder onCreateViewHolder = this.mSecondaryControlsPresenter.onCreateViewHolder(viewHolder.mSecondaryControlsDock);
        viewHolder.mSecondaryControlsVh = onCreateViewHolder;
        if (!this.mSecondaryActionsHidden) {
            viewHolder.mSecondaryControlsDock.addView(onCreateViewHolder.view);
        }
        ((PlaybackControlsRowView) viewHolder.view).setOnUnhandledKeyListener(new PlaybackControlsRowView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.PlaybackControlsRowPresenter.3
            @Override // androidx.leanback.widget.PlaybackControlsRowView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder.getOnKeyListener() != null && viewHolder.getOnKeyListener().onKey(viewHolder.view, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return false;
            }
        });
    }

    private void updateCardLayout(ViewHolder viewHolder, int i8) {
        int defaultBackgroundColor;
        ViewGroup.LayoutParams layoutParams = viewHolder.mCardRightPanel.getLayoutParams();
        layoutParams.height = i8;
        viewHolder.mCardRightPanel.setLayoutParams(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.mControlsDock.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewHolder.mDescriptionDock.getLayoutParams();
        if (i8 == -2) {
            layoutParams2.height = -2;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            viewHolder.mCard.setBackground(null);
            viewHolder.setOutline(viewHolder.mControlsDock);
            this.mPlaybackControlsPresenter.enableTimeMargins(viewHolder.mControlsVh, true);
        } else {
            layoutParams2.height = 0;
            layoutParams2.weight = 1.0f;
            marginLayoutParams.setMarginStart(viewHolder.mControlsDockMarginStart);
            marginLayoutParams.setMarginEnd(viewHolder.mControlsDockMarginEnd);
            ViewGroup viewGroup = viewHolder.mCard;
            if (this.mBackgroundColorSet) {
                defaultBackgroundColor = this.mBackgroundColor;
            } else {
                defaultBackgroundColor = getDefaultBackgroundColor(viewGroup.getContext());
            }
            viewGroup.setBackgroundColor(defaultBackgroundColor);
            viewHolder.setOutline(viewHolder.mCard);
            this.mPlaybackControlsPresenter.enableTimeMargins(viewHolder.mControlsVh, false);
        }
        viewHolder.mDescriptionDock.setLayoutParams(layoutParams2);
        viewHolder.mControlsDock.setLayoutParams(marginLayoutParams);
    }

    public boolean areSecondaryActionsHidden() {
        return this.mSecondaryActionsHidden;
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_playback_controls_row, viewGroup, false), this.mDescriptionPresenter);
        initRow(viewHolder);
        return viewHolder;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public OnActionClickedListener getOnActionClickedListener() {
        return this.mOnActionClickedListener;
    }

    @ColorInt
    public int getProgressColor() {
        return this.mProgressColor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        PlaybackControlsRow playbackControlsRow = (PlaybackControlsRow) viewHolder2.getRow();
        this.mPlaybackControlsPresenter.enableSecondaryActions(this.mSecondaryActionsHidden);
        if (playbackControlsRow.getItem() == null) {
            viewHolder2.mDescriptionDock.setVisibility(8);
            viewHolder2.mSpacer.setVisibility(8);
        } else {
            viewHolder2.mDescriptionDock.setVisibility(0);
            Presenter.ViewHolder viewHolder3 = viewHolder2.mDescriptionViewHolder;
            if (viewHolder3 != null) {
                this.mDescriptionPresenter.onBindViewHolder(viewHolder3, playbackControlsRow.getItem());
            }
            viewHolder2.mSpacer.setVisibility(0);
        }
        if (playbackControlsRow.getImageDrawable() != null && playbackControlsRow.getItem() != null) {
            viewHolder2.mImageView.setImageDrawable(playbackControlsRow.getImageDrawable());
            updateCardLayout(viewHolder2, viewHolder2.mImageView.getLayoutParams().height);
        } else {
            viewHolder2.mImageView.setImageDrawable(null);
            updateCardLayout(viewHolder2, -2);
        }
        viewHolder2.mControlsBoundData.adapter = playbackControlsRow.getPrimaryActionsAdapter();
        viewHolder2.mControlsBoundData.secondaryActionsAdapter = playbackControlsRow.getSecondaryActionsAdapter();
        viewHolder2.mControlsBoundData.presenter = viewHolder2.getPresenter(true);
        BoundData boundData = viewHolder2.mControlsBoundData;
        boundData.mRowViewHolder = viewHolder2;
        this.mPlaybackControlsPresenter.onBindViewHolder(viewHolder2.mControlsVh, boundData);
        viewHolder2.mSecondaryBoundData.adapter = playbackControlsRow.getSecondaryActionsAdapter();
        viewHolder2.mSecondaryBoundData.presenter = viewHolder2.getPresenter(false);
        BoundData boundData2 = viewHolder2.mSecondaryBoundData;
        boundData2.mRowViewHolder = viewHolder2;
        this.mSecondaryControlsPresenter.onBindViewHolder(viewHolder2.mSecondaryControlsVh, boundData2);
        this.mPlaybackControlsPresenter.setTotalTime(viewHolder2.mControlsVh, playbackControlsRow.getTotalTime());
        this.mPlaybackControlsPresenter.setCurrentTime(viewHolder2.mControlsVh, playbackControlsRow.getCurrentTime());
        this.mPlaybackControlsPresenter.setSecondaryProgress(viewHolder2.mControlsVh, playbackControlsRow.getBufferedProgress());
        playbackControlsRow.setOnPlaybackProgressChangedListener(viewHolder2.mListener);
    }

    @Override // androidx.leanback.widget.PlaybackRowPresenter
    public void onReappear(RowPresenter.ViewHolder viewHolder) {
        showPrimaryActions((ViewHolder) viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewAttachedToWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewAttachedToWindow(viewHolder);
        Presenter presenter = this.mDescriptionPresenter;
        if (presenter != null) {
            presenter.onViewAttachedToWindow(((ViewHolder) viewHolder).mDescriptionViewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewDetachedFromWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewDetachedFromWindow(viewHolder);
        Presenter presenter = this.mDescriptionPresenter;
        if (presenter != null) {
            presenter.onViewDetachedFromWindow(((ViewHolder) viewHolder).mDescriptionViewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewSelected(RowPresenter.ViewHolder viewHolder, boolean z8) {
        super.onRowViewSelected(viewHolder, z8);
        if (z8) {
            ((ViewHolder) viewHolder).dispatchItemSelection();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        PlaybackControlsRow playbackControlsRow = (PlaybackControlsRow) viewHolder2.getRow();
        Presenter.ViewHolder viewHolder3 = viewHolder2.mDescriptionViewHolder;
        if (viewHolder3 != null) {
            this.mDescriptionPresenter.onUnbindViewHolder(viewHolder3);
        }
        this.mPlaybackControlsPresenter.onUnbindViewHolder(viewHolder2.mControlsVh);
        this.mSecondaryControlsPresenter.onUnbindViewHolder(viewHolder2.mSecondaryControlsVh);
        playbackControlsRow.setOnPlaybackProgressChangedListener(null);
        super.onUnbindRowViewHolder(viewHolder);
    }

    public void setBackgroundColor(@ColorInt int i8) {
        this.mBackgroundColor = i8;
        this.mBackgroundColorSet = true;
    }

    public void setOnActionClickedListener(OnActionClickedListener onActionClickedListener) {
        this.mOnActionClickedListener = onActionClickedListener;
    }

    public void setProgressColor(@ColorInt int i8) {
        this.mProgressColor = i8;
        this.mProgressColorSet = true;
    }

    public void setSecondaryActionsHidden(boolean z8) {
        this.mSecondaryActionsHidden = z8;
    }

    public void showBottomSpace(ViewHolder viewHolder, boolean z8) {
        int i8;
        View view = viewHolder.mBottomSpacer;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        view.setVisibility(i8);
    }

    public void showPrimaryActions(ViewHolder viewHolder) {
        this.mPlaybackControlsPresenter.showPrimaryActions(viewHolder.mControlsVh);
        if (viewHolder.view.hasFocus()) {
            this.mPlaybackControlsPresenter.resetFocus(viewHolder.mControlsVh);
        }
    }

    public PlaybackControlsRowPresenter() {
        this(null);
    }
}

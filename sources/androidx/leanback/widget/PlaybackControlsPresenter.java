package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.leanback.R;
import androidx.leanback.util.MathUtil;
import androidx.leanback.widget.ControlBarPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.Presenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PlaybackControlsPresenter extends ControlBarPresenter {
    private static int sChildMarginBigger;
    private static int sChildMarginBiggest;
    private boolean mMoreActionsEnabled;

    /* loaded from: classes3.dex */
    static class BoundData extends ControlBarPresenter.BoundData {
        ObjectAdapter secondaryActionsAdapter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ViewHolder extends ControlBarPresenter.ViewHolder {
        final TextView mCurrentTime;
        long mCurrentTimeInMs;
        int mCurrentTimeMarginStart;
        StringBuilder mCurrentTimeStringBuilder;
        ObjectAdapter mMoreActionsAdapter;
        final FrameLayout mMoreActionsDock;
        ObjectAdapter.DataObserver mMoreActionsObserver;
        boolean mMoreActionsShowing;
        Presenter.ViewHolder mMoreActionsViewHolder;
        final ProgressBar mProgressBar;
        long mSecondaryProgressInMs;
        final TextView mTotalTime;
        long mTotalTimeInMs;
        int mTotalTimeMarginEnd;
        StringBuilder mTotalTimeStringBuilder;

        ViewHolder(View view) {
            super(view);
            this.mCurrentTimeInMs = -1L;
            this.mTotalTimeInMs = -1L;
            this.mSecondaryProgressInMs = -1L;
            this.mTotalTimeStringBuilder = new StringBuilder();
            this.mCurrentTimeStringBuilder = new StringBuilder();
            this.mMoreActionsDock = (FrameLayout) view.findViewById(R.id.more_actions_dock);
            TextView textView = (TextView) view.findViewById(R.id.current_time);
            this.mCurrentTime = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.total_time);
            this.mTotalTime = textView2;
            this.mProgressBar = (ProgressBar) view.findViewById(R.id.playback_progress);
            this.mMoreActionsObserver = new ObjectAdapter.DataObserver() { // from class: androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder.1
                @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                public void onChanged() {
                    ViewHolder viewHolder = ViewHolder.this;
                    if (viewHolder.mMoreActionsShowing) {
                        viewHolder.showControls(viewHolder.mPresenter);
                    }
                }

                @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                public void onItemRangeChanged(int i8, int i9) {
                    if (ViewHolder.this.mMoreActionsShowing) {
                        for (int i10 = 0; i10 < i9; i10++) {
                            ViewHolder viewHolder = ViewHolder.this;
                            viewHolder.bindControlToAction(i8 + i10, viewHolder.mPresenter);
                        }
                    }
                }
            };
            this.mCurrentTimeMarginStart = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).getMarginStart();
            this.mTotalTimeMarginEnd = ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).getMarginEnd();
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        int getChildMarginFromCenter(Context context, int i8) {
            int childMarginDefault;
            int controlIconWidth = PlaybackControlsPresenter.this.getControlIconWidth(context);
            if (i8 < 4) {
                childMarginDefault = PlaybackControlsPresenter.this.getChildMarginBiggest(context);
            } else if (i8 < 6) {
                childMarginDefault = PlaybackControlsPresenter.this.getChildMarginBigger(context);
            } else {
                childMarginDefault = PlaybackControlsPresenter.this.getChildMarginDefault(context);
            }
            return controlIconWidth + childMarginDefault;
        }

        long getCurrentTime() {
            return this.mTotalTimeInMs;
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        ObjectAdapter getDisplayedAdapter() {
            if (this.mMoreActionsShowing) {
                return this.mMoreActionsAdapter;
            }
            return this.mAdapter;
        }

        long getSecondaryProgress() {
            return this.mSecondaryProgressInMs;
        }

        long getTotalTime() {
            return this.mTotalTimeInMs;
        }

        void setCurrentTime(long j8) {
            long j9 = j8 / 1000;
            if (j8 != this.mCurrentTimeInMs) {
                this.mCurrentTimeInMs = j8;
                PlaybackControlsPresenter.formatTime(j9, this.mCurrentTimeStringBuilder);
                this.mCurrentTime.setText(this.mCurrentTimeStringBuilder.toString());
            }
            this.mProgressBar.setProgress((int) ((this.mCurrentTimeInMs / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        void setSecondaryProgress(long j8) {
            this.mSecondaryProgressInMs = j8;
            this.mProgressBar.setSecondaryProgress((int) ((j8 / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        void setTotalTime(long j8) {
            if (j8 <= 0) {
                this.mTotalTime.setVisibility(8);
                this.mProgressBar.setVisibility(8);
                return;
            }
            this.mTotalTime.setVisibility(0);
            this.mProgressBar.setVisibility(0);
            this.mTotalTimeInMs = j8;
            PlaybackControlsPresenter.formatTime(j8 / 1000, this.mTotalTimeStringBuilder);
            this.mTotalTime.setText(this.mTotalTimeStringBuilder.toString());
            this.mProgressBar.setMax(Integer.MAX_VALUE);
        }

        void showMoreActions(boolean z8) {
            if (z8) {
                if (this.mMoreActionsViewHolder == null) {
                    PlaybackControlsRow.MoreActions moreActions = new PlaybackControlsRow.MoreActions(this.mMoreActionsDock.getContext());
                    Presenter.ViewHolder onCreateViewHolder = this.mPresenter.onCreateViewHolder(this.mMoreActionsDock);
                    this.mMoreActionsViewHolder = onCreateViewHolder;
                    this.mPresenter.onBindViewHolder(onCreateViewHolder, moreActions);
                    this.mPresenter.setOnClickListener(this.mMoreActionsViewHolder, new View.OnClickListener() { // from class: androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ViewHolder.this.toggleMoreActions();
                        }
                    });
                }
                if (this.mMoreActionsViewHolder.view.getParent() == null) {
                    this.mMoreActionsDock.addView(this.mMoreActionsViewHolder.view);
                    return;
                }
                return;
            }
            Presenter.ViewHolder viewHolder = this.mMoreActionsViewHolder;
            if (viewHolder != null && viewHolder.view.getParent() != null) {
                this.mMoreActionsDock.removeView(this.mMoreActionsViewHolder.view);
            }
        }

        void toggleMoreActions() {
            this.mMoreActionsShowing = !this.mMoreActionsShowing;
            showControls(this.mPresenter);
        }
    }

    public PlaybackControlsPresenter(int i8) {
        super(i8);
        this.mMoreActionsEnabled = true;
    }

    static void formatTime(long j8, StringBuilder sb) {
        long j9 = j8 / 60;
        long j10 = j9 / 60;
        long j11 = j8 - (j9 * 60);
        long j12 = j9 - (60 * j10);
        sb.setLength(0);
        if (j10 > 0) {
            sb.append(j10);
            sb.append(':');
            if (j12 < 10) {
                sb.append('0');
            }
        }
        sb.append(j12);
        sb.append(':');
        if (j11 < 10) {
            sb.append('0');
        }
        sb.append(j11);
    }

    public boolean areMoreActionsEnabled() {
        return this.mMoreActionsEnabled;
    }

    public void enableSecondaryActions(boolean z8) {
        this.mMoreActionsEnabled = z8;
    }

    public void enableTimeMargins(ViewHolder viewHolder, boolean z8) {
        int i8;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.mCurrentTime.getLayoutParams();
        int i9 = 0;
        if (z8) {
            i8 = viewHolder.mCurrentTimeMarginStart;
        } else {
            i8 = 0;
        }
        marginLayoutParams.setMarginStart(i8);
        viewHolder.mCurrentTime.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewHolder.mTotalTime.getLayoutParams();
        if (z8) {
            i9 = viewHolder.mTotalTimeMarginEnd;
        }
        marginLayoutParams2.setMarginEnd(i9);
        viewHolder.mTotalTime.setLayoutParams(marginLayoutParams2);
    }

    int getChildMarginBigger(Context context) {
        if (sChildMarginBigger == 0) {
            sChildMarginBigger = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_child_margin_bigger);
        }
        return sChildMarginBigger;
    }

    int getChildMarginBiggest(Context context) {
        if (sChildMarginBiggest == 0) {
            sChildMarginBiggest = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_child_margin_biggest);
        }
        return sChildMarginBiggest;
    }

    public int getCurrentTime(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getCurrentTimeLong(viewHolder));
    }

    public long getCurrentTimeLong(ViewHolder viewHolder) {
        return viewHolder.getCurrentTime();
    }

    public int getSecondaryProgress(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getSecondaryProgressLong(viewHolder));
    }

    public long getSecondaryProgressLong(ViewHolder viewHolder) {
        return viewHolder.getSecondaryProgress();
    }

    public int getTotalTime(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getTotalTimeLong(viewHolder));
    }

    public long getTotalTimeLong(ViewHolder viewHolder) {
        return viewHolder.getTotalTime();
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ObjectAdapter objectAdapter = viewHolder2.mMoreActionsAdapter;
        ObjectAdapter objectAdapter2 = ((BoundData) obj).secondaryActionsAdapter;
        if (objectAdapter != objectAdapter2) {
            viewHolder2.mMoreActionsAdapter = objectAdapter2;
            objectAdapter2.registerObserver(viewHolder2.mMoreActionsObserver);
            viewHolder2.mMoreActionsShowing = false;
        }
        super.onBindViewHolder(viewHolder, obj);
        viewHolder2.showMoreActions(this.mMoreActionsEnabled);
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutResourceId(), viewGroup, false));
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        super.onUnbindViewHolder(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ObjectAdapter objectAdapter = viewHolder2.mMoreActionsAdapter;
        if (objectAdapter != null) {
            objectAdapter.unregisterObserver(viewHolder2.mMoreActionsObserver);
            viewHolder2.mMoreActionsAdapter = null;
        }
    }

    public void resetFocus(ViewHolder viewHolder) {
        viewHolder.mControlBar.requestFocus();
    }

    public void setCurrentTime(ViewHolder viewHolder, int i8) {
        setCurrentTimeLong(viewHolder, i8);
    }

    public void setCurrentTimeLong(ViewHolder viewHolder, long j8) {
        viewHolder.setCurrentTime(j8);
    }

    public void setProgressColor(ViewHolder viewHolder, @ColorInt int i8) {
        ((LayerDrawable) viewHolder.mProgressBar.getProgressDrawable()).setDrawableByLayerId(android.R.id.progress, new ClipDrawable(new ColorDrawable(i8), 3, 1));
    }

    public void setSecondaryProgress(ViewHolder viewHolder, int i8) {
        setSecondaryProgressLong(viewHolder, i8);
    }

    public void setSecondaryProgressLong(ViewHolder viewHolder, long j8) {
        viewHolder.setSecondaryProgress(j8);
    }

    public void setTotalTime(ViewHolder viewHolder, int i8) {
        setTotalTimeLong(viewHolder, i8);
    }

    public void setTotalTimeLong(ViewHolder viewHolder, long j8) {
        viewHolder.setTotalTime(j8);
    }

    public void showPrimaryActions(ViewHolder viewHolder) {
        if (viewHolder.mMoreActionsShowing) {
            viewHolder.toggleMoreActions();
        }
    }
}

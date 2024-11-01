package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.leanback.R;
import androidx.leanback.widget.ControlBarPresenter;
import androidx.leanback.widget.PlaybackControlsPresenter;
import androidx.leanback.widget.PlaybackControlsRow;
import androidx.leanback.widget.PlaybackRowPresenter;
import androidx.leanback.widget.PlaybackSeekDataProvider;
import androidx.leanback.widget.PlaybackSeekUi;
import androidx.leanback.widget.PlaybackTransportRowView;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SeekBar;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PlaybackTransportRowPresenter extends PlaybackRowPresenter {
    Presenter mDescriptionPresenter;
    OnActionClickedListener mOnActionClickedListener;
    private final ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    private final ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;
    ControlBarPresenter mPlaybackControlsPresenter;
    boolean mProgressColorSet;
    ControlBarPresenter mSecondaryControlsPresenter;
    boolean mSecondaryProgressColorSet;
    float mDefaultSeekIncrement = 0.01f;
    int mProgressColor = 0;
    int mSecondaryProgressColor = 0;

    /* loaded from: classes3.dex */
    static class BoundData extends PlaybackControlsPresenter.BoundData {
        ViewHolder mRowViewHolder;

        BoundData() {
        }
    }

    /* loaded from: classes3.dex */
    public class ViewHolder extends PlaybackRowPresenter.ViewHolder implements PlaybackSeekUi {
        BoundData mControlsBoundData;
        final ViewGroup mControlsDock;
        ControlBarPresenter.ViewHolder mControlsVh;
        final TextView mCurrentTime;
        long mCurrentTimeInMs;
        final ViewGroup mDescriptionDock;
        final Presenter.ViewHolder mDescriptionViewHolder;
        final ImageView mImageView;
        boolean mInSeek;
        final PlaybackControlsRow.OnPlaybackProgressCallback mListener;
        PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
        long[] mPositions;
        int mPositionsLength;
        final SeekBar mProgressBar;
        BoundData mSecondaryBoundData;
        final ViewGroup mSecondaryControlsDock;
        ControlBarPresenter.ViewHolder mSecondaryControlsVh;
        long mSecondaryProgressInMs;
        PlaybackSeekUi.Client mSeekClient;
        PlaybackSeekDataProvider mSeekDataProvider;
        Object mSelectedItem;
        Presenter.ViewHolder mSelectedViewHolder;
        final StringBuilder mTempBuilder;
        int mThumbHeroIndex;
        PlaybackSeekDataProvider.ResultCallback mThumbResult;
        final ThumbsBar mThumbsBar;
        final TextView mTotalTime;
        long mTotalTimeInMs;

        public ViewHolder(View view, Presenter presenter) {
            super(view);
            Presenter.ViewHolder onCreateViewHolder;
            this.mTotalTimeInMs = Long.MIN_VALUE;
            this.mCurrentTimeInMs = Long.MIN_VALUE;
            this.mTempBuilder = new StringBuilder();
            this.mControlsBoundData = new BoundData();
            this.mSecondaryBoundData = new BoundData();
            this.mThumbHeroIndex = -1;
            this.mListener = new PlaybackControlsRow.OnPlaybackProgressCallback() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.1
                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onBufferedPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder.this.setBufferedPosition(j8);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onCurrentPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder.this.setCurrentPosition(j8);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onDurationChanged(PlaybackControlsRow playbackControlsRow, long j8) {
                    ViewHolder.this.setTotalTime(j8);
                }
            };
            this.mThumbResult = new PlaybackSeekDataProvider.ResultCallback() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.2
                @Override // androidx.leanback.widget.PlaybackSeekDataProvider.ResultCallback
                public void onThumbnailLoaded(Bitmap bitmap, int i8) {
                    ViewHolder viewHolder = ViewHolder.this;
                    int childCount = i8 - (viewHolder.mThumbHeroIndex - (viewHolder.mThumbsBar.getChildCount() / 2));
                    if (childCount >= 0 && childCount < ViewHolder.this.mThumbsBar.getChildCount()) {
                        ViewHolder.this.mThumbsBar.setThumbBitmap(childCount, bitmap);
                    }
                }
            };
            this.mImageView = (ImageView) view.findViewById(R.id.image);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.description_dock);
            this.mDescriptionDock = viewGroup;
            this.mCurrentTime = (TextView) view.findViewById(R.id.current_time);
            this.mTotalTime = (TextView) view.findViewById(R.id.total_time);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.playback_progress);
            this.mProgressBar = seekBar;
            seekBar.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ViewHolder viewHolder = ViewHolder.this;
                    PlaybackTransportRowPresenter.this.onProgressBarClicked(viewHolder);
                }
            });
            seekBar.setOnKeyListener(new View.OnKeyListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.4
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i8, KeyEvent keyEvent) {
                    if (i8 != 4) {
                        if (i8 != 66) {
                            if (i8 != 69) {
                                if (i8 != 81) {
                                    if (i8 != 111) {
                                        if (i8 != 89) {
                                            if (i8 != 90) {
                                                switch (i8) {
                                                    case 19:
                                                    case 20:
                                                        return ViewHolder.this.mInSeek;
                                                    case 21:
                                                        break;
                                                    case 22:
                                                        break;
                                                    case 23:
                                                        break;
                                                    default:
                                                        return false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (keyEvent.getAction() == 0) {
                                    ViewHolder.this.onForward();
                                }
                                return true;
                            }
                            if (keyEvent.getAction() == 0) {
                                ViewHolder.this.onBackward();
                            }
                            return true;
                        }
                        if (!ViewHolder.this.mInSeek) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1) {
                            ViewHolder.this.stopSeek(false);
                        }
                        return true;
                    }
                    if (!ViewHolder.this.mInSeek) {
                        return false;
                    }
                    if (keyEvent.getAction() == 1) {
                        ViewHolder.this.stopSeek(!r3.mProgressBar.isAccessibilityFocused());
                    }
                    return true;
                }
            });
            seekBar.setAccessibilitySeekListener(new SeekBar.AccessibilitySeekListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.5
                @Override // androidx.leanback.widget.SeekBar.AccessibilitySeekListener
                public boolean onAccessibilitySeekBackward() {
                    return ViewHolder.this.onBackward();
                }

                @Override // androidx.leanback.widget.SeekBar.AccessibilitySeekListener
                public boolean onAccessibilitySeekForward() {
                    return ViewHolder.this.onForward();
                }
            });
            seekBar.setMax(Integer.MAX_VALUE);
            this.mControlsDock = (ViewGroup) view.findViewById(R.id.controls_dock);
            this.mSecondaryControlsDock = (ViewGroup) view.findViewById(R.id.secondary_controls_dock);
            if (presenter == null) {
                onCreateViewHolder = null;
            } else {
                onCreateViewHolder = presenter.onCreateViewHolder(viewGroup);
            }
            this.mDescriptionViewHolder = onCreateViewHolder;
            if (onCreateViewHolder != null) {
                viewGroup.addView(onCreateViewHolder.view);
            }
            this.mThumbsBar = (ThumbsBar) view.findViewById(R.id.thumbs_row);
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

        public final TextView getCurrentPositionView() {
            return this.mCurrentTime;
        }

        public final Presenter.ViewHolder getDescriptionViewHolder() {
            return this.mDescriptionViewHolder;
        }

        public final TextView getDurationView() {
            return this.mTotalTime;
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
                return ((ControlButtonPresenterSelector) secondaryActionsAdapter.getPresenterSelector()).getSecondaryPresenter();
            }
            if (secondaryActionsAdapter.size() > 0) {
                obj = secondaryActionsAdapter.get(0);
            }
            return secondaryActionsAdapter.getPresenter(obj);
        }

        boolean onBackward() {
            if (!startSeek()) {
                return false;
            }
            updateProgressInSeek(false);
            return true;
        }

        boolean onForward() {
            if (!startSeek()) {
                return false;
            }
            updateProgressInSeek(true);
            return true;
        }

        protected void onSetCurrentPositionLabel(long j8) {
            if (this.mCurrentTime != null) {
                PlaybackTransportRowPresenter.formatTime(j8, this.mTempBuilder);
                this.mCurrentTime.setText(this.mTempBuilder.toString());
            }
        }

        protected void onSetDurationLabel(long j8) {
            if (this.mTotalTime != null) {
                PlaybackTransportRowPresenter.formatTime(j8, this.mTempBuilder);
                this.mTotalTime.setText(this.mTempBuilder.toString());
            }
        }

        void setBufferedPosition(long j8) {
            this.mSecondaryProgressInMs = j8;
            this.mProgressBar.setSecondaryProgress((int) ((j8 / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        void setCurrentPosition(long j8) {
            int i8;
            if (j8 != this.mCurrentTimeInMs) {
                this.mCurrentTimeInMs = j8;
                onSetCurrentPositionLabel(j8);
            }
            if (!this.mInSeek) {
                long j9 = this.mTotalTimeInMs;
                if (j9 > 0) {
                    i8 = (int) ((this.mCurrentTimeInMs / j9) * 2.147483647E9d);
                } else {
                    i8 = 0;
                }
                this.mProgressBar.setProgress(i8);
            }
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi
        public void setPlaybackSeekUiClient(PlaybackSeekUi.Client client) {
            this.mSeekClient = client;
        }

        void setTotalTime(long j8) {
            if (this.mTotalTimeInMs != j8) {
                this.mTotalTimeInMs = j8;
                onSetDurationLabel(j8);
            }
        }

        boolean startSeek() {
            long[] jArr;
            if (this.mInSeek) {
                return true;
            }
            PlaybackSeekUi.Client client = this.mSeekClient;
            if (client == null || !client.isSeekEnabled() || this.mTotalTimeInMs <= 0) {
                return false;
            }
            this.mInSeek = true;
            this.mSeekClient.onSeekStarted();
            PlaybackSeekDataProvider playbackSeekDataProvider = this.mSeekClient.getPlaybackSeekDataProvider();
            this.mSeekDataProvider = playbackSeekDataProvider;
            if (playbackSeekDataProvider != null) {
                jArr = playbackSeekDataProvider.getSeekPositions();
            } else {
                jArr = null;
            }
            this.mPositions = jArr;
            if (jArr != null) {
                int binarySearch = Arrays.binarySearch(jArr, this.mTotalTimeInMs);
                if (binarySearch >= 0) {
                    this.mPositionsLength = binarySearch + 1;
                } else {
                    this.mPositionsLength = (-1) - binarySearch;
                }
            } else {
                this.mPositionsLength = 0;
            }
            this.mControlsVh.view.setVisibility(8);
            this.mSecondaryControlsVh.view.setVisibility(4);
            this.mDescriptionViewHolder.view.setVisibility(4);
            this.mThumbsBar.setVisibility(0);
            return true;
        }

        void stopSeek(boolean z8) {
            if (!this.mInSeek) {
                return;
            }
            this.mInSeek = false;
            this.mSeekClient.onSeekFinished(z8);
            PlaybackSeekDataProvider playbackSeekDataProvider = this.mSeekDataProvider;
            if (playbackSeekDataProvider != null) {
                playbackSeekDataProvider.reset();
            }
            this.mThumbHeroIndex = -1;
            this.mThumbsBar.clearThumbBitmaps();
            this.mSeekDataProvider = null;
            this.mPositions = null;
            this.mPositionsLength = 0;
            this.mControlsVh.view.setVisibility(0);
            this.mSecondaryControlsVh.view.setVisibility(0);
            this.mDescriptionViewHolder.view.setVisibility(0);
            this.mThumbsBar.setVisibility(4);
        }

        void updateProgressInSeek(boolean z8) {
            long j8;
            long j9 = this.mCurrentTimeInMs;
            int i8 = this.mPositionsLength;
            long j10 = 0;
            if (i8 > 0) {
                int i9 = 0;
                int binarySearch = Arrays.binarySearch(this.mPositions, 0, i8, j9);
                if (z8) {
                    if (binarySearch >= 0) {
                        if (binarySearch < this.mPositionsLength - 1) {
                            i9 = binarySearch + 1;
                            j10 = this.mPositions[i9];
                        } else {
                            j10 = this.mTotalTimeInMs;
                            i9 = binarySearch;
                        }
                    } else {
                        int i10 = (-1) - binarySearch;
                        if (i10 <= this.mPositionsLength - 1) {
                            j8 = this.mPositions[i10];
                            i9 = i10;
                        } else {
                            j8 = this.mTotalTimeInMs;
                            if (i10 > 0) {
                                i9 = (-2) - binarySearch;
                            }
                        }
                        j10 = j8;
                    }
                } else if (binarySearch >= 0) {
                    if (binarySearch > 0) {
                        i9 = binarySearch - 1;
                        j10 = this.mPositions[i9];
                    }
                } else if ((-1) - binarySearch > 0) {
                    i9 = (-2) - binarySearch;
                    j10 = this.mPositions[i9];
                }
                updateThumbsInSeek(i9, z8);
            } else {
                long defaultSeekIncrement = ((float) this.mTotalTimeInMs) * PlaybackTransportRowPresenter.this.getDefaultSeekIncrement();
                if (!z8) {
                    defaultSeekIncrement = -defaultSeekIncrement;
                }
                long j11 = j9 + defaultSeekIncrement;
                long j12 = this.mTotalTimeInMs;
                if (j11 > j12) {
                    j10 = j12;
                } else if (j11 >= 0) {
                    j10 = j11;
                }
            }
            this.mProgressBar.setProgress((int) ((j10 / this.mTotalTimeInMs) * 2.147483647E9d));
            this.mSeekClient.onSeekPositionChanged(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[ADDED_TO_REGION, LOOP:0: B:15:0x0084->B:16:0x0086, LOOP_START, PHI: r7
  0x0084: PHI (r7v13 int) = (r7v12 int), (r7v14 int) binds: [B:14:0x0082, B:16:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[LOOP:1: B:19:0x009c->B:21:0x00a4, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[EDGE_INSN: B:22:0x00ac->B:23:0x00ac BREAK  A[LOOP:1: B:19:0x009c->B:21:0x00a4], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[LOOP:2: B:24:0x00af->B:25:0x00b1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[ADDED_TO_REGION, LOOP:3: B:28:0x0090->B:29:0x0092, LOOP_START, PHI: r5
  0x0090: PHI (r5v9 int) = (r5v8 int), (r5v10 int) binds: [B:14:0x0082, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void updateThumbsInSeek(int r12, boolean r13) {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.updateThumbsInSeek(int, boolean):void");
        }
    }

    public PlaybackTransportRowPresenter() {
        ControlBarPresenter.OnControlSelectedListener onControlSelectedListener = new ControlBarPresenter.OnControlSelectedListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.1
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
        ControlBarPresenter.OnControlClickedListener onControlClickedListener = new ControlBarPresenter.OnControlClickedListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.2
            @Override // androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener
            public void onControlClicked(Presenter.ViewHolder viewHolder, Object obj, ControlBarPresenter.BoundData boundData) {
                RowPresenter.ViewHolder viewHolder2 = ((BoundData) boundData).mRowViewHolder;
                if (viewHolder2.getOnItemViewClickedListener() != null) {
                    viewHolder2.getOnItemViewClickedListener().onItemClicked(viewHolder, obj, viewHolder2, viewHolder2.getRow());
                }
                OnActionClickedListener onActionClickedListener = PlaybackTransportRowPresenter.this.mOnActionClickedListener;
                if (onActionClickedListener != null && (obj instanceof Action)) {
                    onActionClickedListener.onActionClicked((Action) obj);
                }
            }
        };
        this.mOnControlClickedListener = onControlClickedListener;
        setHeaderPresenter(null);
        setSelectEffectEnabled(false);
        int i8 = R.layout.lb_control_bar;
        ControlBarPresenter controlBarPresenter = new ControlBarPresenter(i8);
        this.mPlaybackControlsPresenter = controlBarPresenter;
        controlBarPresenter.setDefaultFocusToMiddle(false);
        ControlBarPresenter controlBarPresenter2 = new ControlBarPresenter(i8);
        this.mSecondaryControlsPresenter = controlBarPresenter2;
        controlBarPresenter2.setDefaultFocusToMiddle(false);
        this.mPlaybackControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mSecondaryControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mPlaybackControlsPresenter.setOnControlClickedListener(onControlClickedListener);
        this.mSecondaryControlsPresenter.setOnControlClickedListener(onControlClickedListener);
    }

    static void formatTime(long j8, StringBuilder sb) {
        sb.setLength(0);
        if (j8 < 0) {
            sb.append("--");
            return;
        }
        long j9 = j8 / 1000;
        long j10 = j9 / 60;
        long j11 = j10 / 60;
        long j12 = j9 - (j10 * 60);
        long j13 = j10 - (60 * j11);
        if (j11 > 0) {
            sb.append(j11);
            sb.append(':');
            if (j13 < 10) {
                sb.append('0');
            }
        }
        sb.append(j13);
        sb.append(':');
        if (j12 < 10) {
            sb.append('0');
        }
        sb.append(j12);
    }

    private static int getDefaultProgressColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.playbackProgressPrimaryColor, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_playback_progress_color_no_theme);
    }

    private static int getDefaultSecondaryProgressColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.playbackProgressSecondaryColor, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_playback_progress_secondary_color_no_theme);
    }

    private void initRow(final ViewHolder viewHolder) {
        int defaultProgressColor;
        int defaultSecondaryProgressColor;
        viewHolder.mControlsVh = (ControlBarPresenter.ViewHolder) this.mPlaybackControlsPresenter.onCreateViewHolder(viewHolder.mControlsDock);
        SeekBar seekBar = viewHolder.mProgressBar;
        if (this.mProgressColorSet) {
            defaultProgressColor = this.mProgressColor;
        } else {
            defaultProgressColor = getDefaultProgressColor(viewHolder.mControlsDock.getContext());
        }
        seekBar.setProgressColor(defaultProgressColor);
        SeekBar seekBar2 = viewHolder.mProgressBar;
        if (this.mSecondaryProgressColorSet) {
            defaultSecondaryProgressColor = this.mSecondaryProgressColor;
        } else {
            defaultSecondaryProgressColor = getDefaultSecondaryProgressColor(viewHolder.mControlsDock.getContext());
        }
        seekBar2.setSecondaryProgressColor(defaultSecondaryProgressColor);
        viewHolder.mControlsDock.addView(viewHolder.mControlsVh.view);
        ControlBarPresenter.ViewHolder viewHolder2 = (ControlBarPresenter.ViewHolder) this.mSecondaryControlsPresenter.onCreateViewHolder(viewHolder.mSecondaryControlsDock);
        viewHolder.mSecondaryControlsVh = viewHolder2;
        viewHolder.mSecondaryControlsDock.addView(viewHolder2.view);
        ((PlaybackTransportRowView) viewHolder.view.findViewById(R.id.transport_row)).setOnUnhandledKeyListener(new PlaybackTransportRowView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.3
            @Override // androidx.leanback.widget.PlaybackTransportRowView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder.getOnKeyListener() != null && viewHolder.getOnKeyListener().onKey(viewHolder.view, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_playback_transport_controls_row, viewGroup, false), this.mDescriptionPresenter);
        initRow(viewHolder);
        return viewHolder;
    }

    public float getDefaultSeekIncrement() {
        return this.mDefaultSeekIncrement;
    }

    public OnActionClickedListener getOnActionClickedListener() {
        return this.mOnActionClickedListener;
    }

    @ColorInt
    public int getProgressColor() {
        return this.mProgressColor;
    }

    @ColorInt
    public int getSecondaryProgressColor() {
        return this.mSecondaryProgressColor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        PlaybackControlsRow playbackControlsRow = (PlaybackControlsRow) viewHolder2.getRow();
        if (playbackControlsRow.getItem() == null) {
            viewHolder2.mDescriptionDock.setVisibility(8);
        } else {
            viewHolder2.mDescriptionDock.setVisibility(0);
            Presenter.ViewHolder viewHolder3 = viewHolder2.mDescriptionViewHolder;
            if (viewHolder3 != null) {
                this.mDescriptionPresenter.onBindViewHolder(viewHolder3, playbackControlsRow.getItem());
            }
        }
        if (playbackControlsRow.getImageDrawable() == null) {
            viewHolder2.mImageView.setVisibility(8);
        } else {
            viewHolder2.mImageView.setVisibility(0);
        }
        viewHolder2.mImageView.setImageDrawable(playbackControlsRow.getImageDrawable());
        viewHolder2.mControlsBoundData.adapter = playbackControlsRow.getPrimaryActionsAdapter();
        viewHolder2.mControlsBoundData.presenter = viewHolder2.getPresenter(true);
        BoundData boundData = viewHolder2.mControlsBoundData;
        boundData.mRowViewHolder = viewHolder2;
        this.mPlaybackControlsPresenter.onBindViewHolder(viewHolder2.mControlsVh, boundData);
        viewHolder2.mSecondaryBoundData.adapter = playbackControlsRow.getSecondaryActionsAdapter();
        viewHolder2.mSecondaryBoundData.presenter = viewHolder2.getPresenter(false);
        BoundData boundData2 = viewHolder2.mSecondaryBoundData;
        boundData2.mRowViewHolder = viewHolder2;
        this.mSecondaryControlsPresenter.onBindViewHolder(viewHolder2.mSecondaryControlsVh, boundData2);
        viewHolder2.setTotalTime(playbackControlsRow.getDuration());
        viewHolder2.setCurrentPosition(playbackControlsRow.getCurrentPosition());
        viewHolder2.setBufferedPosition(playbackControlsRow.getBufferedPosition());
        playbackControlsRow.setOnPlaybackProgressChangedListener(viewHolder2.mListener);
    }

    protected void onProgressBarClicked(ViewHolder viewHolder) {
        if (viewHolder != null) {
            if (viewHolder.mPlayPauseAction == null) {
                viewHolder.mPlayPauseAction = new PlaybackControlsRow.PlayPauseAction(viewHolder.view.getContext());
            }
            if (viewHolder.getOnItemViewClickedListener() != null) {
                viewHolder.getOnItemViewClickedListener().onItemClicked(viewHolder, viewHolder.mPlayPauseAction, viewHolder, viewHolder.getRow());
            }
            OnActionClickedListener onActionClickedListener = this.mOnActionClickedListener;
            if (onActionClickedListener != null) {
                onActionClickedListener.onActionClicked(viewHolder.mPlayPauseAction);
            }
        }
    }

    @Override // androidx.leanback.widget.PlaybackRowPresenter
    public void onReappear(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (viewHolder2.view.hasFocus()) {
            viewHolder2.mProgressBar.requestFocus();
        }
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

    public void setDefaultSeekIncrement(float f8) {
        this.mDefaultSeekIncrement = f8;
    }

    public void setDescriptionPresenter(Presenter presenter) {
        this.mDescriptionPresenter = presenter;
    }

    public void setOnActionClickedListener(OnActionClickedListener onActionClickedListener) {
        this.mOnActionClickedListener = onActionClickedListener;
    }

    public void setProgressColor(@ColorInt int i8) {
        this.mProgressColor = i8;
        this.mProgressColorSet = true;
    }

    public void setSecondaryProgressColor(@ColorInt int i8) {
        this.mSecondaryProgressColor = i8;
        this.mSecondaryProgressColorSet = true;
    }
}

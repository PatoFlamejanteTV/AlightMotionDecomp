package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.leanback.R;
import androidx.leanback.util.MathUtil;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
public class PlaybackControlsRow extends Row {
    private long mBufferedProgressMs;
    private long mCurrentTimeMs;
    private Drawable mImageDrawable;
    private Object mItem;
    private OnPlaybackProgressCallback mListener;
    private ObjectAdapter mPrimaryActionsAdapter;
    private ObjectAdapter mSecondaryActionsAdapter;
    private long mTotalTimeMs;

    /* loaded from: classes3.dex */
    public static class ClosedCaptioningAction extends MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @Deprecated
        public static final int OFF = 0;

        @Deprecated
        public static final int ON = 1;

        public ClosedCaptioningAction(Context context) {
            this(context, PlaybackControlsRow.getIconHighlightColor(context));
        }

        public ClosedCaptioningAction(Context context, int i8) {
            super(R.id.lb_control_closed_captioning);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_closed_captioning);
            setDrawables(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), PlaybackControlsRow.createBitmap(bitmapDrawable.getBitmap(), i8))});
            setLabels(new String[]{context.getString(R.string.lb_playback_controls_closed_captioning_enable), context.getString(R.string.lb_playback_controls_closed_captioning_disable)});
        }
    }

    /* loaded from: classes3.dex */
    public static class FastForwardAction extends MultiAction {
        public FastForwardAction(Context context) {
            this(context, 1);
        }

        public FastForwardAction(Context context, int i8) {
            super(R.id.lb_control_fast_forward);
            if (i8 >= 1) {
                Drawable[] drawableArr = new Drawable[i8 + 1];
                drawableArr[0] = PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_fast_forward);
                setDrawables(drawableArr);
                String[] strArr = new String[getActionCount()];
                strArr[0] = context.getString(R.string.lb_playback_controls_fast_forward);
                String[] strArr2 = new String[getActionCount()];
                strArr2[0] = strArr[0];
                int i9 = 1;
                while (i9 <= i8) {
                    int i10 = i9 + 1;
                    strArr[i9] = context.getResources().getString(R.string.lb_control_display_fast_forward_multiplier, Integer.valueOf(i10));
                    strArr2[i9] = context.getResources().getString(R.string.lb_playback_controls_fast_forward_multiplier, Integer.valueOf(i10));
                    i9 = i10;
                }
                setLabels(strArr);
                setSecondaryLabels(strArr2);
                addKeyCode(90);
                return;
            }
            throw new IllegalArgumentException("numSpeeds must be > 0");
        }
    }

    /* loaded from: classes3.dex */
    public static class HighQualityAction extends MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @Deprecated
        public static final int OFF = 0;

        @Deprecated
        public static final int ON = 1;

        public HighQualityAction(Context context) {
            this(context, PlaybackControlsRow.getIconHighlightColor(context));
        }

        public HighQualityAction(Context context, int i8) {
            super(R.id.lb_control_high_quality);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_high_quality);
            setDrawables(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), PlaybackControlsRow.createBitmap(bitmapDrawable.getBitmap(), i8))});
            setLabels(new String[]{context.getString(R.string.lb_playback_controls_high_quality_enable), context.getString(R.string.lb_playback_controls_high_quality_disable)});
        }
    }

    /* loaded from: classes3.dex */
    public static class MoreActions extends Action {
        public MoreActions(Context context) {
            super(R.id.lb_control_more_actions);
            setIcon(context.getResources().getDrawable(R.drawable.lb_ic_more));
            setLabel1(context.getString(R.string.lb_playback_controls_more_actions));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class MultiAction extends Action {
        private Drawable[] mDrawables;
        private int mIndex;
        private String[] mLabels;
        private String[] mLabels2;

        public MultiAction(int i8) {
            super(i8);
        }

        public int getActionCount() {
            Drawable[] drawableArr = this.mDrawables;
            if (drawableArr != null) {
                return drawableArr.length;
            }
            String[] strArr = this.mLabels;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }

        public Drawable getDrawable(int i8) {
            Drawable[] drawableArr = this.mDrawables;
            if (drawableArr == null) {
                return null;
            }
            return drawableArr[i8];
        }

        public int getIndex() {
            return this.mIndex;
        }

        public String getLabel(int i8) {
            String[] strArr = this.mLabels;
            if (strArr == null) {
                return null;
            }
            return strArr[i8];
        }

        public String getSecondaryLabel(int i8) {
            String[] strArr = this.mLabels2;
            if (strArr == null) {
                return null;
            }
            return strArr[i8];
        }

        public void nextIndex() {
            int i8;
            if (this.mIndex < getActionCount() - 1) {
                i8 = this.mIndex + 1;
            } else {
                i8 = 0;
            }
            setIndex(i8);
        }

        public void setDrawables(Drawable[] drawableArr) {
            this.mDrawables = drawableArr;
            setIndex(0);
        }

        public void setIndex(int i8) {
            this.mIndex = i8;
            Drawable[] drawableArr = this.mDrawables;
            if (drawableArr != null) {
                setIcon(drawableArr[i8]);
            }
            String[] strArr = this.mLabels;
            if (strArr != null) {
                setLabel1(strArr[this.mIndex]);
            }
            String[] strArr2 = this.mLabels2;
            if (strArr2 != null) {
                setLabel2(strArr2[this.mIndex]);
            }
        }

        public void setLabels(String[] strArr) {
            this.mLabels = strArr;
            setIndex(0);
        }

        public void setSecondaryLabels(String[] strArr) {
            this.mLabels2 = strArr;
            setIndex(0);
        }
    }

    /* loaded from: classes3.dex */
    public static class OnPlaybackProgressCallback {
        public void onBufferedPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
        }

        public void onCurrentPositionChanged(PlaybackControlsRow playbackControlsRow, long j8) {
        }

        public void onDurationChanged(PlaybackControlsRow playbackControlsRow, long j8) {
        }
    }

    /* loaded from: classes3.dex */
    public static class PictureInPictureAction extends Action {
        public PictureInPictureAction(Context context) {
            super(R.id.lb_control_picture_in_picture);
            setIcon(PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_picture_in_picture));
            setLabel1(context.getString(R.string.lb_playback_controls_picture_in_picture));
            addKeyCode(171);
        }
    }

    /* loaded from: classes3.dex */
    public static class PlayPauseAction extends MultiAction {
        public static final int INDEX_PAUSE = 1;
        public static final int INDEX_PLAY = 0;

        @Deprecated
        public static final int PAUSE = 1;

        @Deprecated
        public static final int PLAY = 0;

        public PlayPauseAction(Context context) {
            super(R.id.lb_control_play_pause);
            setDrawables(new Drawable[]{PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_play), PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_pause)});
            setLabels(new String[]{context.getString(R.string.lb_playback_controls_play), context.getString(R.string.lb_playback_controls_pause)});
            addKeyCode(85);
            addKeyCode(126);
            addKeyCode(ModuleDescriptor.MODULE_VERSION);
        }
    }

    /* loaded from: classes3.dex */
    public static class RepeatAction extends MultiAction {

        @Deprecated
        public static final int ALL = 1;
        public static final int INDEX_ALL = 1;
        public static final int INDEX_NONE = 0;
        public static final int INDEX_ONE = 2;

        @Deprecated
        public static final int NONE = 0;

        @Deprecated
        public static final int ONE = 2;

        public RepeatAction(Context context) {
            this(context, PlaybackControlsRow.getIconHighlightColor(context));
        }

        public RepeatAction(Context context, int i8) {
            this(context, i8, i8);
        }

        public RepeatAction(Context context, int i8, int i9) {
            super(R.id.lb_control_repeat);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_repeat);
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_repeat_one);
            setDrawables(new Drawable[]{bitmapDrawable, bitmapDrawable == null ? null : new BitmapDrawable(context.getResources(), PlaybackControlsRow.createBitmap(bitmapDrawable.getBitmap(), i8)), bitmapDrawable2 != null ? new BitmapDrawable(context.getResources(), PlaybackControlsRow.createBitmap(bitmapDrawable2.getBitmap(), i9)) : null});
            setLabels(new String[]{context.getString(R.string.lb_playback_controls_repeat_all), context.getString(R.string.lb_playback_controls_repeat_one), context.getString(R.string.lb_playback_controls_repeat_none)});
        }
    }

    /* loaded from: classes3.dex */
    public static class RewindAction extends MultiAction {
        public RewindAction(Context context) {
            this(context, 1);
        }

        public RewindAction(Context context, int i8) {
            super(R.id.lb_control_fast_rewind);
            if (i8 >= 1) {
                Drawable[] drawableArr = new Drawable[i8 + 1];
                drawableArr[0] = PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_rewind);
                setDrawables(drawableArr);
                String[] strArr = new String[getActionCount()];
                strArr[0] = context.getString(R.string.lb_playback_controls_rewind);
                String[] strArr2 = new String[getActionCount()];
                strArr2[0] = strArr[0];
                int i9 = 1;
                while (i9 <= i8) {
                    int i10 = i9 + 1;
                    String string = context.getResources().getString(R.string.lb_control_display_rewind_multiplier, Integer.valueOf(i10));
                    strArr[i9] = string;
                    strArr[i9] = string;
                    strArr2[i9] = context.getResources().getString(R.string.lb_playback_controls_rewind_multiplier, Integer.valueOf(i10));
                    i9 = i10;
                }
                setLabels(strArr);
                setSecondaryLabels(strArr2);
                addKeyCode(89);
                return;
            }
            throw new IllegalArgumentException("numSpeeds must be > 0");
        }
    }

    /* loaded from: classes3.dex */
    public static class ShuffleAction extends MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @Deprecated
        public static final int OFF = 0;

        @Deprecated
        public static final int ON = 1;

        public ShuffleAction(Context context) {
            this(context, PlaybackControlsRow.getIconHighlightColor(context));
        }

        public ShuffleAction(Context context, int i8) {
            super(R.id.lb_control_shuffle);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_shuffle);
            setDrawables(new Drawable[]{bitmapDrawable, new BitmapDrawable(context.getResources(), PlaybackControlsRow.createBitmap(bitmapDrawable.getBitmap(), i8))});
            setLabels(new String[]{context.getString(R.string.lb_playback_controls_shuffle_enable), context.getString(R.string.lb_playback_controls_shuffle_disable)});
        }
    }

    /* loaded from: classes3.dex */
    public static class SkipNextAction extends Action {
        public SkipNextAction(Context context) {
            super(R.id.lb_control_skip_next);
            setIcon(PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_skip_next));
            setLabel1(context.getString(R.string.lb_playback_controls_skip_next));
            addKeyCode(87);
        }
    }

    /* loaded from: classes3.dex */
    public static class SkipPreviousAction extends Action {
        public SkipPreviousAction(Context context) {
            super(R.id.lb_control_skip_previous);
            setIcon(PlaybackControlsRow.getStyledDrawable(context, R.styleable.lbPlaybackControlsActionIcons_skip_previous));
            setLabel1(context.getString(R.string.lb_playback_controls_skip_previous));
            addKeyCode(88);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ThumbsAction extends MultiAction {
        public static final int INDEX_OUTLINE = 1;
        public static final int INDEX_SOLID = 0;

        @Deprecated
        public static final int OUTLINE = 1;

        @Deprecated
        public static final int SOLID = 0;

        public ThumbsAction(int i8, Context context, int i9, int i10) {
            super(i8);
            setDrawables(new Drawable[]{PlaybackControlsRow.getStyledDrawable(context, i9), PlaybackControlsRow.getStyledDrawable(context, i10)});
        }
    }

    /* loaded from: classes3.dex */
    public static class ThumbsDownAction extends ThumbsAction {
        public ThumbsDownAction(Context context) {
            super(R.id.lb_control_thumbs_down, context, R.styleable.lbPlaybackControlsActionIcons_thumb_down, R.styleable.lbPlaybackControlsActionIcons_thumb_down_outline);
            String[] strArr = new String[getActionCount()];
            strArr[0] = context.getString(R.string.lb_playback_controls_thumb_down);
            strArr[1] = context.getString(R.string.lb_playback_controls_thumb_down_outline);
            setLabels(strArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class ThumbsUpAction extends ThumbsAction {
        public ThumbsUpAction(Context context) {
            super(R.id.lb_control_thumbs_up, context, R.styleable.lbPlaybackControlsActionIcons_thumb_up, R.styleable.lbPlaybackControlsActionIcons_thumb_up_outline);
            String[] strArr = new String[getActionCount()];
            strArr[0] = context.getString(R.string.lb_playback_controls_thumb_up);
            strArr[1] = context.getString(R.string.lb_playback_controls_thumb_up_outline);
            setLabels(strArr);
        }
    }

    public PlaybackControlsRow(Object obj) {
        this.mItem = obj;
    }

    static Bitmap createBitmap(Bitmap bitmap, int i8) {
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Canvas canvas = new Canvas(copy);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return copy;
    }

    static int getIconHighlightColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.playbackControlsIconHighlightColor, typedValue, true)) {
            return typedValue.data;
        }
        return context.getResources().getColor(R.color.lb_playback_icon_highlight_no_theme);
    }

    static Drawable getStyledDrawable(Context context, int i8) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.playbackControlsActionIcons, typedValue, false)) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.data, R.styleable.lbPlaybackControlsActionIcons);
        Drawable drawable = obtainStyledAttributes.getDrawable(i8);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public Action getActionForKeyCode(int i8) {
        Action actionForKeyCode = getActionForKeyCode(getPrimaryActionsAdapter(), i8);
        return actionForKeyCode != null ? actionForKeyCode : getActionForKeyCode(getSecondaryActionsAdapter(), i8);
    }

    public long getBufferedPosition() {
        return this.mBufferedProgressMs;
    }

    @Deprecated
    public int getBufferedProgress() {
        return MathUtil.safeLongToInt(getBufferedPosition());
    }

    @Deprecated
    public long getBufferedProgressLong() {
        return this.mBufferedProgressMs;
    }

    public long getCurrentPosition() {
        return this.mCurrentTimeMs;
    }

    @Deprecated
    public int getCurrentTime() {
        return MathUtil.safeLongToInt(getCurrentTimeLong());
    }

    @Deprecated
    public long getCurrentTimeLong() {
        return this.mCurrentTimeMs;
    }

    public long getDuration() {
        return this.mTotalTimeMs;
    }

    public final Drawable getImageDrawable() {
        return this.mImageDrawable;
    }

    public final Object getItem() {
        return this.mItem;
    }

    public final ObjectAdapter getPrimaryActionsAdapter() {
        return this.mPrimaryActionsAdapter;
    }

    public final ObjectAdapter getSecondaryActionsAdapter() {
        return this.mSecondaryActionsAdapter;
    }

    @Deprecated
    public int getTotalTime() {
        return MathUtil.safeLongToInt(getTotalTimeLong());
    }

    @Deprecated
    public long getTotalTimeLong() {
        return this.mTotalTimeMs;
    }

    public void setBufferedPosition(long j8) {
        if (this.mBufferedProgressMs != j8) {
            this.mBufferedProgressMs = j8;
            OnPlaybackProgressCallback onPlaybackProgressCallback = this.mListener;
            if (onPlaybackProgressCallback != null) {
                onPlaybackProgressCallback.onBufferedPositionChanged(this, j8);
            }
        }
    }

    @Deprecated
    public void setBufferedProgress(int i8) {
        setBufferedPosition(i8);
    }

    @Deprecated
    public void setBufferedProgressLong(long j8) {
        setBufferedPosition(j8);
    }

    public void setCurrentPosition(long j8) {
        if (this.mCurrentTimeMs != j8) {
            this.mCurrentTimeMs = j8;
            OnPlaybackProgressCallback onPlaybackProgressCallback = this.mListener;
            if (onPlaybackProgressCallback != null) {
                onPlaybackProgressCallback.onCurrentPositionChanged(this, j8);
            }
        }
    }

    @Deprecated
    public void setCurrentTime(int i8) {
        setCurrentTimeLong(i8);
    }

    @Deprecated
    public void setCurrentTimeLong(long j8) {
        setCurrentPosition(j8);
    }

    public void setDuration(long j8) {
        if (this.mTotalTimeMs != j8) {
            this.mTotalTimeMs = j8;
            OnPlaybackProgressCallback onPlaybackProgressCallback = this.mListener;
            if (onPlaybackProgressCallback != null) {
                onPlaybackProgressCallback.onDurationChanged(this, j8);
            }
        }
    }

    public final void setImageBitmap(Context context, Bitmap bitmap) {
        this.mImageDrawable = new BitmapDrawable(context.getResources(), bitmap);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.mImageDrawable = drawable;
    }

    public void setOnPlaybackProgressChangedListener(OnPlaybackProgressCallback onPlaybackProgressCallback) {
        this.mListener = onPlaybackProgressCallback;
    }

    public final void setPrimaryActionsAdapter(ObjectAdapter objectAdapter) {
        this.mPrimaryActionsAdapter = objectAdapter;
    }

    public final void setSecondaryActionsAdapter(ObjectAdapter objectAdapter) {
        this.mSecondaryActionsAdapter = objectAdapter;
    }

    @Deprecated
    public void setTotalTime(int i8) {
        setDuration(i8);
    }

    @Deprecated
    public void setTotalTimeLong(long j8) {
        setDuration(j8);
    }

    public PlaybackControlsRow() {
    }

    public Action getActionForKeyCode(ObjectAdapter objectAdapter, int i8) {
        if (objectAdapter != this.mPrimaryActionsAdapter && objectAdapter != this.mSecondaryActionsAdapter) {
            throw new IllegalArgumentException("Invalid adapter");
        }
        for (int i9 = 0; i9 < objectAdapter.size(); i9++) {
            Action action = (Action) objectAdapter.get(i9);
            if (action.respondsToKeyCode(i8)) {
                return action;
            }
        }
        return null;
    }
}

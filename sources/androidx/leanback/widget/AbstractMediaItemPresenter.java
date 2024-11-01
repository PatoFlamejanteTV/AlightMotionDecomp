package androidx.leanback.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.core.view.ViewCompat;
import androidx.leanback.R;
import androidx.leanback.widget.MultiActionsProvider;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AbstractMediaItemPresenter extends RowPresenter {
    public static final int PLAY_STATE_INITIAL = 0;
    public static final int PLAY_STATE_PAUSED = 1;
    public static final int PLAY_STATE_PLAYING = 2;
    static final Rect sTempRect = new Rect();
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private Presenter mMediaItemActionPresenter;
    private boolean mMediaRowSeparator;
    private int mThemeId;

    /* loaded from: classes3.dex */
    public static class ViewHolder extends RowPresenter.ViewHolder {
        private final List<Presenter.ViewHolder> mActionViewHolders;
        ValueAnimator mFocusViewAnimator;
        private final ViewGroup mMediaItemActionsContainer;
        private final View mMediaItemDetailsView;
        private final TextView mMediaItemDurationView;
        private final TextView mMediaItemNameView;
        final TextView mMediaItemNumberView;
        final ViewFlipper mMediaItemNumberViewFlipper;
        final View mMediaItemPausedView;
        final View mMediaItemPlayingView;
        MultiActionsProvider.MultiAction[] mMediaItemRowActions;
        private final View mMediaItemRowSeparator;
        final View mMediaRowView;
        AbstractMediaItemPresenter mRowPresenter;
        final View mSelectorView;

        public ViewHolder(View view) {
            super(view);
            int i8;
            this.mSelectorView = view.findViewById(R.id.mediaRowSelector);
            this.mMediaRowView = view.findViewById(R.id.mediaItemRow);
            this.mMediaItemDetailsView = view.findViewById(R.id.mediaItemDetails);
            this.mMediaItemNameView = (TextView) view.findViewById(R.id.mediaItemName);
            this.mMediaItemDurationView = (TextView) view.findViewById(R.id.mediaItemDuration);
            this.mMediaItemRowSeparator = view.findViewById(R.id.mediaRowSeparator);
            this.mMediaItemActionsContainer = (ViewGroup) view.findViewById(R.id.mediaItemActionsContainer);
            this.mActionViewHolders = new ArrayList();
            getMediaItemDetailsView().setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ViewHolder.this.getOnItemViewClickedListener() != null) {
                        BaseOnItemViewClickedListener onItemViewClickedListener = ViewHolder.this.getOnItemViewClickedListener();
                        ViewHolder viewHolder = ViewHolder.this;
                        onItemViewClickedListener.onItemClicked(null, null, viewHolder, viewHolder.getRowObject());
                    }
                }
            });
            getMediaItemDetailsView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z8) {
                    ViewHolder viewHolder = ViewHolder.this;
                    viewHolder.mFocusViewAnimator = AbstractMediaItemPresenter.updateSelector(viewHolder.mSelectorView, view2, viewHolder.mFocusViewAnimator, true);
                }
            });
            ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.mediaItemNumberViewFlipper);
            this.mMediaItemNumberViewFlipper = viewFlipper;
            TypedValue typedValue = new TypedValue();
            boolean resolveAttribute = view.getContext().getTheme().resolveAttribute(R.attr.playbackMediaItemNumberViewFlipperLayout, typedValue, true);
            LayoutInflater from = LayoutInflater.from(view.getContext());
            if (resolveAttribute) {
                i8 = typedValue.resourceId;
            } else {
                i8 = R.layout.lb_media_item_number_view_flipper;
            }
            View inflate = from.inflate(i8, (ViewGroup) viewFlipper, true);
            this.mMediaItemNumberView = (TextView) inflate.findViewById(R.id.initial);
            this.mMediaItemPausedView = inflate.findViewById(R.id.paused);
            this.mMediaItemPlayingView = inflate.findViewById(R.id.playing);
        }

        int findActionIndex(MultiActionsProvider.MultiAction multiAction) {
            if (this.mMediaItemRowActions != null) {
                int i8 = 0;
                while (true) {
                    MultiActionsProvider.MultiAction[] multiActionArr = this.mMediaItemRowActions;
                    if (i8 < multiActionArr.length) {
                        if (multiActionArr[i8] == multiAction) {
                            return i8;
                        }
                        i8++;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }

        public ViewGroup getMediaItemActionsContainer() {
            return this.mMediaItemActionsContainer;
        }

        public View getMediaItemDetailsView() {
            return this.mMediaItemDetailsView;
        }

        public TextView getMediaItemDurationView() {
            return this.mMediaItemDurationView;
        }

        public TextView getMediaItemNameView() {
            return this.mMediaItemNameView;
        }

        public TextView getMediaItemNumberView() {
            return this.mMediaItemNumberView;
        }

        public ViewFlipper getMediaItemNumberViewFlipper() {
            return this.mMediaItemNumberViewFlipper;
        }

        public View getMediaItemPausedView() {
            return this.mMediaItemPausedView;
        }

        public View getMediaItemPlayingView() {
            return this.mMediaItemPlayingView;
        }

        public MultiActionsProvider.MultiAction[] getMediaItemRowActions() {
            return this.mMediaItemRowActions;
        }

        public View getMediaItemRowSeparator() {
            return this.mMediaItemRowSeparator;
        }

        public View getSelectorView() {
            return this.mSelectorView;
        }

        public void notifyActionChanged(MultiActionsProvider.MultiAction multiAction) {
            int findActionIndex;
            Presenter actionPresenter = this.mRowPresenter.getActionPresenter();
            if (actionPresenter != null && (findActionIndex = findActionIndex(multiAction)) >= 0) {
                Presenter.ViewHolder viewHolder = this.mActionViewHolders.get(findActionIndex);
                actionPresenter.onUnbindViewHolder(viewHolder);
                actionPresenter.onBindViewHolder(viewHolder, multiAction);
            }
        }

        public void notifyDetailsChanged() {
            this.mRowPresenter.onUnbindMediaDetails(this);
            this.mRowPresenter.onBindMediaDetails(this, getRowObject());
        }

        public void notifyPlayStateChanged() {
            this.mRowPresenter.onBindMediaPlayState(this);
        }

        public void onBindRowActions() {
            int childCount = getMediaItemActionsContainer().getChildCount();
            while (true) {
                childCount--;
                if (childCount < this.mActionViewHolders.size()) {
                    break;
                }
                getMediaItemActionsContainer().removeViewAt(childCount);
                this.mActionViewHolders.remove(childCount);
            }
            this.mMediaItemRowActions = null;
            Object rowObject = getRowObject();
            if (rowObject instanceof MultiActionsProvider) {
                MultiActionsProvider.MultiAction[] actions = ((MultiActionsProvider) rowObject).getActions();
                Presenter actionPresenter = this.mRowPresenter.getActionPresenter();
                if (actionPresenter == null) {
                    return;
                }
                this.mMediaItemRowActions = actions;
                for (final int size = this.mActionViewHolders.size(); size < actions.length; size++) {
                    final Presenter.ViewHolder onCreateViewHolder = actionPresenter.onCreateViewHolder(getMediaItemActionsContainer());
                    getMediaItemActionsContainer().addView(onCreateViewHolder.view);
                    this.mActionViewHolders.add(onCreateViewHolder);
                    onCreateViewHolder.view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder.3
                        @Override // android.view.View.OnFocusChangeListener
                        public void onFocusChange(View view, boolean z8) {
                            ViewHolder viewHolder = ViewHolder.this;
                            viewHolder.mFocusViewAnimator = AbstractMediaItemPresenter.updateSelector(viewHolder.mSelectorView, view, viewHolder.mFocusViewAnimator, false);
                        }
                    });
                    onCreateViewHolder.view.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.AbstractMediaItemPresenter.ViewHolder.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ViewHolder.this.getOnItemViewClickedListener() != null) {
                                BaseOnItemViewClickedListener onItemViewClickedListener = ViewHolder.this.getOnItemViewClickedListener();
                                Presenter.ViewHolder viewHolder = onCreateViewHolder;
                                ViewHolder viewHolder2 = ViewHolder.this;
                                onItemViewClickedListener.onItemClicked(viewHolder, viewHolder2.mMediaItemRowActions[size], viewHolder2, viewHolder2.getRowObject());
                            }
                        }
                    });
                }
                if (this.mMediaItemActionsContainer != null) {
                    for (int i8 = 0; i8 < actions.length; i8++) {
                        Presenter.ViewHolder viewHolder = this.mActionViewHolders.get(i8);
                        actionPresenter.onUnbindViewHolder(viewHolder);
                        actionPresenter.onBindViewHolder(viewHolder, this.mMediaItemRowActions[i8]);
                    }
                }
            }
        }

        public void setSelectedMediaItemNumberView(int i8) {
            if (i8 >= 0 && i8 < this.mMediaItemNumberViewFlipper.getChildCount()) {
                this.mMediaItemNumberViewFlipper.setDisplayedChild(i8);
            }
        }
    }

    public AbstractMediaItemPresenter() {
        this(0);
    }

    static int calculateMediaItemNumberFlipperIndex(ViewHolder viewHolder) {
        View view;
        int mediaPlayState = viewHolder.mRowPresenter.getMediaPlayState(viewHolder.getRowObject());
        if (mediaPlayState != 0) {
            if (mediaPlayState != 1) {
                if (mediaPlayState != 2 || (view = viewHolder.mMediaItemPlayingView) == null) {
                    return -1;
                }
                return viewHolder.mMediaItemNumberViewFlipper.indexOfChild(view);
            }
            View view2 = viewHolder.mMediaItemPausedView;
            if (view2 == null) {
                return -1;
            }
            return viewHolder.mMediaItemNumberViewFlipper.indexOfChild(view2);
        }
        TextView textView = viewHolder.mMediaItemNumberView;
        if (textView == null) {
            return -1;
        }
        return viewHolder.mMediaItemNumberViewFlipper.indexOfChild(textView);
    }

    static ValueAnimator updateSelector(final View view, View view2, ValueAnimator valueAnimator, boolean z8) {
        ValueAnimator valueAnimator2;
        int integer = view2.getContext().getResources().getInteger(android.R.integer.config_shortAnimTime);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        int layoutDirection = ViewCompat.getLayoutDirection(view);
        if (!view2.hasFocus()) {
            view.animate().cancel();
            view.animate().alpha(0.0f).setDuration(integer).setInterpolator(decelerateInterpolator).start();
            return valueAnimator;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator2 = null;
        } else {
            valueAnimator2 = valueAnimator;
        }
        float alpha = view.getAlpha();
        long j8 = integer;
        view.animate().alpha(1.0f).setDuration(j8).setInterpolator(decelerateInterpolator).start();
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        Rect rect = sTempRect;
        rect.set(0, 0, view2.getWidth(), view2.getHeight());
        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
        if (z8) {
            if (layoutDirection == 1) {
                rect.right += viewGroup.getHeight();
                rect.left -= viewGroup.getHeight() / 2;
            } else {
                rect.left -= viewGroup.getHeight();
                rect.right += viewGroup.getHeight() / 2;
            }
        }
        final int i8 = rect.left;
        final int width = rect.width();
        final float f8 = marginLayoutParams.width - width;
        final float f9 = marginLayoutParams.leftMargin - i8;
        if (f9 != 0.0f || f8 != 0.0f) {
            if (alpha == 0.0f) {
                marginLayoutParams.width = width;
                marginLayoutParams.leftMargin = i8;
                view.requestLayout();
                return valueAnimator2;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(j8);
            ofFloat.setInterpolator(decelerateInterpolator);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.widget.AbstractMediaItemPresenter.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    float animatedFraction = 1.0f - valueAnimator3.getAnimatedFraction();
                    marginLayoutParams.leftMargin = Math.round(i8 + (f9 * animatedFraction));
                    marginLayoutParams.width = Math.round(width + (f8 * animatedFraction));
                    view.requestLayout();
                }
            });
            ofFloat.start();
            return ofFloat;
        }
        return valueAnimator2;
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.mThemeId != 0) {
            context = new ContextThemeWrapper(context, this.mThemeId);
        }
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(context).inflate(R.layout.lb_row_media_item, viewGroup, false));
        viewHolder.mRowPresenter = this;
        if (this.mBackgroundColorSet) {
            viewHolder.mMediaRowView.setBackgroundColor(this.mBackgroundColor);
        }
        return viewHolder;
    }

    public Presenter getActionPresenter() {
        return this.mMediaItemActionPresenter;
    }

    protected int getMediaPlayState(Object obj) {
        return 0;
    }

    public int getThemeId() {
        return this.mThemeId;
    }

    public boolean hasMediaRowSeparator() {
        return this.mMediaRowSeparator;
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected boolean isClippingChildren() {
        return true;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public boolean isUsingDefaultSelectEffect() {
        return false;
    }

    protected abstract void onBindMediaDetails(ViewHolder viewHolder, Object obj);

    public void onBindMediaPlayState(ViewHolder viewHolder) {
        int calculateMediaItemNumberFlipperIndex = calculateMediaItemNumberFlipperIndex(viewHolder);
        if (calculateMediaItemNumberFlipperIndex != -1 && viewHolder.mMediaItemNumberViewFlipper.getDisplayedChild() != calculateMediaItemNumberFlipperIndex) {
            viewHolder.mMediaItemNumberViewFlipper.setDisplayedChild(calculateMediaItemNumberFlipperIndex);
        }
    }

    protected void onBindRowActions(ViewHolder viewHolder) {
        viewHolder.onBindRowActions();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        int i8;
        super.onBindRowViewHolder(viewHolder, obj);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        onBindRowActions(viewHolder2);
        View mediaItemRowSeparator = viewHolder2.getMediaItemRowSeparator();
        if (hasMediaRowSeparator()) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        mediaItemRowSeparator.setVisibility(i8);
        onBindMediaPlayState(viewHolder2);
        onBindMediaDetails(viewHolder2, obj);
    }

    protected void onUnbindMediaDetails(ViewHolder viewHolder) {
    }

    public void onUnbindMediaPlayState(ViewHolder viewHolder) {
    }

    public void setActionPresenter(Presenter presenter) {
        this.mMediaItemActionPresenter = presenter;
    }

    public void setBackgroundColor(int i8) {
        this.mBackgroundColorSet = true;
        this.mBackgroundColor = i8;
    }

    public void setHasMediaRowSeparator(boolean z8) {
        this.mMediaRowSeparator = z8;
    }

    public void setThemeId(int i8) {
        this.mThemeId = i8;
    }

    public AbstractMediaItemPresenter(int i8) {
        this.mBackgroundColor = 0;
        this.mMediaItemActionPresenter = new MediaItemActionPresenter();
        this.mThemeId = i8;
        setHeaderPresenter(null);
    }
}

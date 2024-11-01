package androidx.leanback.widget;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;
import androidx.leanback.widget.ControlBar;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.Presenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ControlBarPresenter extends Presenter {
    static final int MAX_CONTROLS = 7;
    private static int sChildMarginDefault;
    private static int sControlIconWidth;
    boolean mDefaultFocusToMiddle = true;
    private int mLayoutResourceId;
    OnControlClickedListener mOnControlClickedListener;
    OnControlSelectedListener mOnControlSelectedListener;

    /* loaded from: classes3.dex */
    static class BoundData {
        ObjectAdapter adapter;
        Presenter presenter;
    }

    /* loaded from: classes3.dex */
    interface OnControlClickedListener {
        void onControlClicked(Presenter.ViewHolder viewHolder, Object obj, BoundData boundData);
    }

    /* loaded from: classes3.dex */
    interface OnControlSelectedListener {
        void onControlSelected(Presenter.ViewHolder viewHolder, Object obj, BoundData boundData);
    }

    /* loaded from: classes3.dex */
    class ViewHolder extends Presenter.ViewHolder {
        ObjectAdapter mAdapter;
        ControlBar mControlBar;
        View mControlsContainer;
        BoundData mData;
        ObjectAdapter.DataObserver mDataObserver;
        Presenter mPresenter;
        SparseArray<Presenter.ViewHolder> mViewHolders;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ViewHolder(View view) {
            super(view);
            this.mViewHolders = new SparseArray<>();
            this.mControlsContainer = view.findViewById(R.id.controls_container);
            ControlBar controlBar = (ControlBar) view.findViewById(R.id.control_bar);
            this.mControlBar = controlBar;
            if (controlBar != null) {
                controlBar.setDefaultFocusToMiddle(ControlBarPresenter.this.mDefaultFocusToMiddle);
                this.mControlBar.setOnChildFocusedListener(new ControlBar.OnChildFocusedListener() { // from class: androidx.leanback.widget.ControlBarPresenter.ViewHolder.1
                    @Override // androidx.leanback.widget.ControlBar.OnChildFocusedListener
                    public void onChildFocusedListener(View view2, View view3) {
                        if (ControlBarPresenter.this.mOnControlSelectedListener == null) {
                            return;
                        }
                        for (int i8 = 0; i8 < ViewHolder.this.mViewHolders.size(); i8++) {
                            if (ViewHolder.this.mViewHolders.get(i8).view == view2) {
                                ViewHolder viewHolder = ViewHolder.this;
                                ControlBarPresenter.this.mOnControlSelectedListener.onControlSelected(viewHolder.mViewHolders.get(i8), ViewHolder.this.getDisplayedAdapter().get(i8), ViewHolder.this.mData);
                                return;
                            }
                        }
                    }
                });
                this.mDataObserver = new ObjectAdapter.DataObserver() { // from class: androidx.leanback.widget.ControlBarPresenter.ViewHolder.2
                    @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                    public void onChanged() {
                        ViewHolder viewHolder = ViewHolder.this;
                        if (viewHolder.mAdapter == viewHolder.getDisplayedAdapter()) {
                            ViewHolder viewHolder2 = ViewHolder.this;
                            viewHolder2.showControls(viewHolder2.mPresenter);
                        }
                    }

                    @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                    public void onItemRangeChanged(int i8, int i9) {
                        ViewHolder viewHolder = ViewHolder.this;
                        if (viewHolder.mAdapter == viewHolder.getDisplayedAdapter()) {
                            for (int i10 = 0; i10 < i9; i10++) {
                                ViewHolder viewHolder2 = ViewHolder.this;
                                viewHolder2.bindControlToAction(i8 + i10, viewHolder2.mPresenter);
                            }
                        }
                    }
                };
                return;
            }
            throw new IllegalStateException("Couldn't find control_bar");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void bindControlToAction(int i8, Presenter presenter) {
            bindControlToAction(i8, getDisplayedAdapter(), presenter);
        }

        int getChildMarginFromCenter(Context context, int i8) {
            return ControlBarPresenter.this.getChildMarginDefault(context) + ControlBarPresenter.this.getControlIconWidth(context);
        }

        ObjectAdapter getDisplayedAdapter() {
            return this.mAdapter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void showControls(Presenter presenter) {
            int size;
            ObjectAdapter displayedAdapter = getDisplayedAdapter();
            if (displayedAdapter == null) {
                size = 0;
            } else {
                size = displayedAdapter.size();
            }
            View focusedChild = this.mControlBar.getFocusedChild();
            if (focusedChild != null && size > 0 && this.mControlBar.indexOfChild(focusedChild) >= size) {
                this.mControlBar.getChildAt(displayedAdapter.size() - 1).requestFocus();
            }
            for (int childCount = this.mControlBar.getChildCount() - 1; childCount >= size; childCount--) {
                this.mControlBar.removeViewAt(childCount);
            }
            for (int i8 = 0; i8 < size && i8 < 7; i8++) {
                bindControlToAction(i8, displayedAdapter, presenter);
            }
            ControlBar controlBar = this.mControlBar;
            controlBar.setChildMarginFromCenter(getChildMarginFromCenter(controlBar.getContext(), size));
        }

        private void bindControlToAction(final int i8, ObjectAdapter objectAdapter, Presenter presenter) {
            final Presenter.ViewHolder viewHolder = this.mViewHolders.get(i8);
            Object obj = objectAdapter.get(i8);
            if (viewHolder == null) {
                viewHolder = presenter.onCreateViewHolder(this.mControlBar);
                this.mViewHolders.put(i8, viewHolder);
                presenter.setOnClickListener(viewHolder, new View.OnClickListener() { // from class: androidx.leanback.widget.ControlBarPresenter.ViewHolder.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object obj2 = ViewHolder.this.getDisplayedAdapter().get(i8);
                        ViewHolder viewHolder2 = ViewHolder.this;
                        OnControlClickedListener onControlClickedListener = ControlBarPresenter.this.mOnControlClickedListener;
                        if (onControlClickedListener != null) {
                            onControlClickedListener.onControlClicked(viewHolder, obj2, viewHolder2.mData);
                        }
                    }
                });
            }
            if (viewHolder.view.getParent() == null) {
                this.mControlBar.addView(viewHolder.view);
            }
            presenter.onBindViewHolder(viewHolder, obj);
        }
    }

    public ControlBarPresenter(int i8) {
        this.mLayoutResourceId = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getChildMarginDefault(Context context) {
        if (sChildMarginDefault == 0) {
            sChildMarginDefault = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_child_margin_default);
        }
        return sChildMarginDefault;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getControlIconWidth(Context context) {
        if (sControlIconWidth == 0) {
            sControlIconWidth = context.getResources().getDimensionPixelSize(R.dimen.lb_control_icon_width);
        }
        return sControlIconWidth;
    }

    public int getLayoutResourceId() {
        return this.mLayoutResourceId;
    }

    public OnControlSelectedListener getOnItemControlListener() {
        return this.mOnControlSelectedListener;
    }

    public OnControlClickedListener getOnItemViewClickedListener() {
        return this.mOnControlClickedListener;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        BoundData boundData = (BoundData) obj;
        ObjectAdapter objectAdapter = viewHolder2.mAdapter;
        ObjectAdapter objectAdapter2 = boundData.adapter;
        if (objectAdapter != objectAdapter2) {
            viewHolder2.mAdapter = objectAdapter2;
            if (objectAdapter2 != null) {
                objectAdapter2.registerObserver(viewHolder2.mDataObserver);
            }
        }
        Presenter presenter = boundData.presenter;
        viewHolder2.mPresenter = presenter;
        viewHolder2.mData = boundData;
        viewHolder2.showControls(presenter);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutResourceId(), viewGroup, false));
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ObjectAdapter objectAdapter = viewHolder2.mAdapter;
        if (objectAdapter != null) {
            objectAdapter.unregisterObserver(viewHolder2.mDataObserver);
            viewHolder2.mAdapter = null;
        }
        viewHolder2.mData = null;
    }

    public void setBackgroundColor(ViewHolder viewHolder, int i8) {
        viewHolder.mControlsContainer.setBackgroundColor(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultFocusToMiddle(boolean z8) {
        this.mDefaultFocusToMiddle = z8;
    }

    public void setOnControlClickedListener(OnControlClickedListener onControlClickedListener) {
        this.mOnControlClickedListener = onControlClickedListener;
    }

    public void setOnControlSelectedListener(OnControlSelectedListener onControlSelectedListener) {
        this.mOnControlSelectedListener = onControlSelectedListener;
    }
}

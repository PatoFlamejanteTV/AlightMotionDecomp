package androidx.leanback.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnChildViewHolderSelectedListener;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes3.dex */
public abstract class BaseRowFragment extends Fragment {
    private static final String CURRENT_SELECTED_POSITION = "currentSelectedPosition";
    private ObjectAdapter mAdapter;
    private boolean mPendingTransitionPrepare;
    private PresenterSelector mPresenterSelector;
    VerticalGridView mVerticalGridView;
    final ItemBridgeAdapter mBridgeAdapter = new ItemBridgeAdapter();
    int mSelectedPosition = -1;
    LateSelectionObserver mLateSelectionObserver = new LateSelectionObserver();
    private final OnChildViewHolderSelectedListener mRowSelectedListener = new OnChildViewHolderSelectedListener() { // from class: androidx.leanback.app.BaseRowFragment.1
        @Override // androidx.leanback.widget.OnChildViewHolderSelectedListener
        public void onChildViewHolderSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
            BaseRowFragment baseRowFragment = BaseRowFragment.this;
            if (!baseRowFragment.mLateSelectionObserver.mIsLateSelection) {
                baseRowFragment.mSelectedPosition = i8;
                baseRowFragment.onRowSelected(recyclerView, viewHolder, i8, i9);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class LateSelectionObserver extends RecyclerView.AdapterDataObserver {
        boolean mIsLateSelection = false;

        LateSelectionObserver() {
        }

        void clear() {
            if (this.mIsLateSelection) {
                this.mIsLateSelection = false;
                BaseRowFragment.this.mBridgeAdapter.unregisterAdapterDataObserver(this);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            performLateSelection();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            performLateSelection();
        }

        void performLateSelection() {
            clear();
            BaseRowFragment baseRowFragment = BaseRowFragment.this;
            VerticalGridView verticalGridView = baseRowFragment.mVerticalGridView;
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(baseRowFragment.mSelectedPosition);
            }
        }

        void startLateSelection() {
            this.mIsLateSelection = true;
            BaseRowFragment.this.mBridgeAdapter.registerAdapterDataObserver(this);
        }
    }

    VerticalGridView findGridViewFromRoot(View view) {
        return (VerticalGridView) view;
    }

    public final ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    public final ItemBridgeAdapter getBridgeAdapter() {
        return this.mBridgeAdapter;
    }

    Object getItem(Row row, int i8) {
        if (row instanceof ListRow) {
            return ((ListRow) row).getAdapter().get(i8);
        }
        return null;
    }

    abstract int getLayoutResourceId();

    public final PresenterSelector getPresenterSelector() {
        return this.mPresenterSelector;
    }

    public int getSelectedPosition() {
        return this.mSelectedPosition;
    }

    public final VerticalGridView getVerticalGridView() {
        return this.mVerticalGridView;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutResourceId(), viewGroup, false);
        this.mVerticalGridView = findGridViewFromRoot(inflate);
        if (this.mPendingTransitionPrepare) {
            this.mPendingTransitionPrepare = false;
            onTransitionPrepare();
        }
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mLateSelectionObserver.clear();
        this.mVerticalGridView = null;
    }

    void onRowSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(CURRENT_SELECTED_POSITION, this.mSelectedPosition);
    }

    public void onTransitionEnd() {
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView != null) {
            verticalGridView.setLayoutFrozen(false);
            this.mVerticalGridView.setAnimateChildLayout(true);
            this.mVerticalGridView.setPruneChild(true);
            this.mVerticalGridView.setFocusSearchDisabled(false);
            this.mVerticalGridView.setScrollEnabled(true);
        }
    }

    public boolean onTransitionPrepare() {
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView != null) {
            verticalGridView.setAnimateChildLayout(false);
            this.mVerticalGridView.setScrollEnabled(false);
            return true;
        }
        this.mPendingTransitionPrepare = true;
        return false;
    }

    public void onTransitionStart() {
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView != null) {
            verticalGridView.setPruneChild(false);
            this.mVerticalGridView.setLayoutFrozen(true);
            this.mVerticalGridView.setFocusSearchDisabled(true);
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (bundle != null) {
            this.mSelectedPosition = bundle.getInt(CURRENT_SELECTED_POSITION, -1);
        }
        setAdapterAndSelection();
        this.mVerticalGridView.setOnChildViewHolderSelectedListener(this.mRowSelectedListener);
    }

    public final void setAdapter(ObjectAdapter objectAdapter) {
        if (this.mAdapter != objectAdapter) {
            this.mAdapter = objectAdapter;
            updateAdapter();
        }
    }

    void setAdapterAndSelection() {
        if (this.mAdapter == null) {
            return;
        }
        RecyclerView.Adapter adapter = this.mVerticalGridView.getAdapter();
        ItemBridgeAdapter itemBridgeAdapter = this.mBridgeAdapter;
        if (adapter != itemBridgeAdapter) {
            this.mVerticalGridView.setAdapter(itemBridgeAdapter);
        }
        if (this.mBridgeAdapter.getItemCount() == 0 && this.mSelectedPosition >= 0) {
            this.mLateSelectionObserver.startLateSelection();
            return;
        }
        int i8 = this.mSelectedPosition;
        if (i8 >= 0) {
            this.mVerticalGridView.setSelectedPosition(i8);
        }
    }

    public void setAlignment(int i8) {
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            this.mVerticalGridView.setItemAlignmentOffsetPercent(-1.0f);
            this.mVerticalGridView.setWindowAlignmentOffset(i8);
            this.mVerticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            this.mVerticalGridView.setWindowAlignment(0);
        }
    }

    public final void setPresenterSelector(PresenterSelector presenterSelector) {
        if (this.mPresenterSelector != presenterSelector) {
            this.mPresenterSelector = presenterSelector;
            updateAdapter();
        }
    }

    public void setSelectedPosition(int i8) {
        setSelectedPosition(i8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateAdapter() {
        this.mBridgeAdapter.setAdapter(this.mAdapter);
        this.mBridgeAdapter.setPresenter(this.mPresenterSelector);
        if (this.mVerticalGridView != null) {
            setAdapterAndSelection();
        }
    }

    public void setSelectedPosition(int i8, boolean z8) {
        if (this.mSelectedPosition == i8) {
            return;
        }
        this.mSelectedPosition = i8;
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView == null || this.mLateSelectionObserver.mIsLateSelection) {
            return;
        }
        if (z8) {
            verticalGridView.setSelectedPositionSmooth(i8);
        } else {
            verticalGridView.setSelectedPosition(i8);
        }
    }
}

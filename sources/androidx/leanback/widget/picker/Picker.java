package androidx.leanback.widget.picker;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.R;
import androidx.leanback.widget.OnChildViewHolderSelectedListener;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class Picker extends FrameLayout {
    private Interpolator mAccelerateInterpolator;
    private int mAlphaAnimDuration;
    private final OnChildViewHolderSelectedListener mColumnChangeListener;
    final List<VerticalGridView> mColumnViews;
    ArrayList<PickerColumn> mColumns;
    private Interpolator mDecelerateInterpolator;
    private float mFocusedAlpha;
    private float mInvisibleColumnAlpha;
    private ArrayList<PickerValueListener> mListeners;
    private int mPickerItemLayoutId;
    private int mPickerItemTextViewId;
    private ViewGroup mPickerView;
    private ViewGroup mRootView;
    private int mSelectedColumn;
    private List<CharSequence> mSeparators;
    private float mUnfocusedAlpha;
    private float mVisibleColumnAlpha;
    private float mVisibleItems;
    private float mVisibleItemsActivated;

    /* loaded from: classes3.dex */
    class PickerScrollArrayAdapter extends RecyclerView.Adapter<ViewHolder> {
        private final int mColIndex;
        private PickerColumn mData;
        private final int mResource;
        private final int mTextViewResourceId;

        PickerScrollArrayAdapter(Context context, int i8, int i9, int i10) {
            this.mResource = i8;
            this.mColIndex = i10;
            this.mTextViewResourceId = i9;
            this.mData = Picker.this.mColumns.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PickerColumn pickerColumn = this.mData;
            if (pickerColumn == null) {
                return 0;
            }
            return pickerColumn.getCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(ViewHolder viewHolder, int i8) {
            PickerColumn pickerColumn;
            TextView textView = viewHolder.textView;
            if (textView != null && (pickerColumn = this.mData) != null) {
                textView.setText(pickerColumn.getLabelFor(pickerColumn.getMinValue() + i8));
            }
            Picker picker = Picker.this;
            picker.setOrAnimateAlpha(viewHolder.itemView, picker.mColumnViews.get(this.mColIndex).getSelectedPosition() == i8, this.mColIndex, false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
            TextView textView;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.mResource, viewGroup, false);
            int i9 = this.mTextViewResourceId;
            if (i9 != 0) {
                textView = (TextView) inflate.findViewById(i9);
            } else {
                textView = (TextView) inflate;
            }
            return new ViewHolder(inflate, textView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(ViewHolder viewHolder) {
            viewHolder.itemView.setFocusable(Picker.this.isActivated());
        }
    }

    /* loaded from: classes3.dex */
    public interface PickerValueListener {
        void onValueChanged(Picker picker, int i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;

        ViewHolder(View view, TextView textView) {
            super(view);
            this.textView = textView;
        }
    }

    public Picker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mColumnViews = new ArrayList();
        this.mVisibleItemsActivated = 3.0f;
        this.mVisibleItems = 1.0f;
        this.mSelectedColumn = 0;
        this.mSeparators = new ArrayList();
        this.mPickerItemLayoutId = R.layout.lb_picker_item;
        this.mPickerItemTextViewId = 0;
        this.mColumnChangeListener = new OnChildViewHolderSelectedListener() { // from class: androidx.leanback.widget.picker.Picker.1
            @Override // androidx.leanback.widget.OnChildViewHolderSelectedListener
            public void onChildViewHolderSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i9, int i10) {
                int indexOf = Picker.this.mColumnViews.indexOf(recyclerView);
                Picker.this.updateColumnAlpha(indexOf, true);
                if (viewHolder != null) {
                    Picker.this.onColumnValueChanged(indexOf, Picker.this.mColumns.get(indexOf).getMinValue() + i9);
                }
            }
        };
        setEnabled(true);
        setDescendantFocusability(262144);
        this.mFocusedAlpha = 1.0f;
        this.mUnfocusedAlpha = 1.0f;
        this.mVisibleColumnAlpha = 0.5f;
        this.mInvisibleColumnAlpha = 0.0f;
        this.mAlphaAnimDuration = 200;
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.5f);
        this.mAccelerateInterpolator = new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true);
        this.mRootView = viewGroup;
        this.mPickerView = (ViewGroup) viewGroup.findViewById(R.id.picker);
    }

    private float getFloat(int i8) {
        TypedValue typedValue = new TypedValue();
        getContext().getResources().getValue(i8, typedValue, true);
        return typedValue.getFloat();
    }

    private void notifyValueChanged(int i8) {
        ArrayList<PickerValueListener> arrayList = this.mListeners;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onValueChanged(this, i8);
            }
        }
    }

    private void updateColumnSize() {
        for (int i8 = 0; i8 < getColumnsCount(); i8++) {
            updateColumnSize(this.mColumnViews.get(i8));
        }
    }

    private void updateItemFocusable() {
        boolean isActivated = isActivated();
        for (int i8 = 0; i8 < getColumnsCount(); i8++) {
            VerticalGridView verticalGridView = this.mColumnViews.get(i8);
            for (int i9 = 0; i9 < verticalGridView.getChildCount(); i9++) {
                verticalGridView.getChildAt(i9).setFocusable(isActivated);
            }
        }
    }

    public void addOnValueChangedListener(PickerValueListener pickerValueListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(pickerValueListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isActivated()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 23 && keyCode != 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                performClick();
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public float getActivatedVisibleItemCount() {
        return this.mVisibleItemsActivated;
    }

    public PickerColumn getColumnAt(int i8) {
        ArrayList<PickerColumn> arrayList = this.mColumns;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i8);
    }

    public int getColumnsCount() {
        ArrayList<PickerColumn> arrayList = this.mColumns;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    protected int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.mPickerItemLayoutId;
    }

    public final int getPickerItemTextViewId() {
        return this.mPickerItemTextViewId;
    }

    public int getSelectedColumn() {
        return this.mSelectedColumn;
    }

    public final CharSequence getSeparator() {
        return this.mSeparators.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.mSeparators;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    public void onColumnValueChanged(int i8, int i9) {
        PickerColumn pickerColumn = this.mColumns.get(i8);
        if (pickerColumn.getCurrentValue() != i9) {
            pickerColumn.setCurrentValue(i9);
            notifyValueChanged(i8);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.mColumnViews.size()) {
            return this.mColumnViews.get(selectedColumn).requestFocus(i8, rect);
        }
        return false;
    }

    public void removeOnValueChangedListener(PickerValueListener pickerValueListener) {
        ArrayList<PickerValueListener> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(pickerValueListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i8 = 0; i8 < this.mColumnViews.size(); i8++) {
            if (this.mColumnViews.get(i8).hasFocus()) {
                setSelectedColumn(i8);
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z8) {
        if (z8 == isActivated()) {
            super.setActivated(z8);
            return;
        }
        super.setActivated(z8);
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z8 && hasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i8 = 0; i8 < getColumnsCount(); i8++) {
            this.mColumnViews.get(i8).setFocusable(z8);
        }
        updateColumnSize();
        updateItemFocusable();
        if (z8 && hasFocus && selectedColumn >= 0) {
            this.mColumnViews.get(selectedColumn).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f8) {
        if (f8 > 0.0f) {
            if (this.mVisibleItemsActivated != f8) {
                this.mVisibleItemsActivated = f8;
                if (isActivated()) {
                    updateColumnSize();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setColumnAt(int i8, PickerColumn pickerColumn) {
        this.mColumns.set(i8, pickerColumn);
        VerticalGridView verticalGridView = this.mColumnViews.get(i8);
        PickerScrollArrayAdapter pickerScrollArrayAdapter = (PickerScrollArrayAdapter) verticalGridView.getAdapter();
        if (pickerScrollArrayAdapter != null) {
            pickerScrollArrayAdapter.notifyDataSetChanged();
        }
        verticalGridView.setSelectedPosition(pickerColumn.getCurrentValue() - pickerColumn.getMinValue());
    }

    public void setColumnValue(int i8, int i9, boolean z8) {
        PickerColumn pickerColumn = this.mColumns.get(i8);
        if (pickerColumn.getCurrentValue() != i9) {
            pickerColumn.setCurrentValue(i9);
            notifyValueChanged(i8);
            VerticalGridView verticalGridView = this.mColumnViews.get(i8);
            if (verticalGridView != null) {
                int minValue = i9 - this.mColumns.get(i8).getMinValue();
                if (z8) {
                    verticalGridView.setSelectedPositionSmooth(minValue);
                } else {
                    verticalGridView.setSelectedPosition(minValue);
                }
            }
        }
    }

    public void setColumns(List<PickerColumn> list) {
        if (this.mSeparators.size() != 0) {
            if (this.mSeparators.size() == 1) {
                CharSequence charSequence = this.mSeparators.get(0);
                this.mSeparators.clear();
                this.mSeparators.add("");
                for (int i8 = 0; i8 < list.size() - 1; i8++) {
                    this.mSeparators.add(charSequence);
                }
                this.mSeparators.add("");
            } else if (this.mSeparators.size() != list.size() + 1) {
                throw new IllegalStateException("Separators size: " + this.mSeparators.size() + " mustequal the size of columns: " + list.size() + " + 1");
            }
            this.mColumnViews.clear();
            this.mPickerView.removeAllViews();
            ArrayList<PickerColumn> arrayList = new ArrayList<>(list);
            this.mColumns = arrayList;
            if (this.mSelectedColumn > arrayList.size() - 1) {
                this.mSelectedColumn = this.mColumns.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty(this.mSeparators.get(0))) {
                TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, this.mPickerView, false);
                textView.setText(this.mSeparators.get(0));
                this.mPickerView.addView(textView);
            }
            int i9 = 0;
            while (i9 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(R.layout.lb_picker_column, this.mPickerView, false);
                updateColumnSize(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                this.mColumnViews.add(verticalGridView);
                this.mPickerView.addView(verticalGridView);
                int i10 = i9 + 1;
                if (!TextUtils.isEmpty(this.mSeparators.get(i10))) {
                    TextView textView2 = (TextView) from.inflate(R.layout.lb_picker_separator, this.mPickerView, false);
                    textView2.setText(this.mSeparators.get(i10));
                    this.mPickerView.addView(textView2);
                }
                verticalGridView.setAdapter(new PickerScrollArrayAdapter(getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i9));
                verticalGridView.setOnChildViewHolderSelectedListener(this.mColumnChangeListener);
                i9 = i10;
            }
            return;
        }
        throw new IllegalStateException("Separators size is: " + this.mSeparators.size() + ". At least one separator must be provided");
    }

    void setOrAnimateAlpha(View view, boolean z8, int i8, boolean z9) {
        boolean z10 = i8 == this.mSelectedColumn || !hasFocus();
        if (z8) {
            if (z10) {
                setOrAnimateAlpha(view, z9, this.mFocusedAlpha, -1.0f, this.mDecelerateInterpolator);
                return;
            } else {
                setOrAnimateAlpha(view, z9, this.mUnfocusedAlpha, -1.0f, this.mDecelerateInterpolator);
                return;
            }
        }
        if (z10) {
            setOrAnimateAlpha(view, z9, this.mVisibleColumnAlpha, -1.0f, this.mDecelerateInterpolator);
        } else {
            setOrAnimateAlpha(view, z9, this.mInvisibleColumnAlpha, -1.0f, this.mDecelerateInterpolator);
        }
    }

    public final void setPickerItemTextViewId(int i8) {
        this.mPickerItemTextViewId = i8;
    }

    public void setSelectedColumn(int i8) {
        if (this.mSelectedColumn != i8) {
            this.mSelectedColumn = i8;
            for (int i9 = 0; i9 < this.mColumnViews.size(); i9++) {
                updateColumnAlpha(i9, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.mSeparators.clear();
        this.mSeparators.addAll(list);
    }

    public void setVisibleItemCount(float f8) {
        if (f8 > 0.0f) {
            if (this.mVisibleItems != f8) {
                this.mVisibleItems = f8;
                if (!isActivated()) {
                    updateColumnSize();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    void updateColumnAlpha(int i8, boolean z8) {
        boolean z9;
        VerticalGridView verticalGridView = this.mColumnViews.get(i8);
        int selectedPosition = verticalGridView.getSelectedPosition();
        for (int i9 = 0; i9 < verticalGridView.getAdapter().getItemCount(); i9++) {
            View findViewByPosition = verticalGridView.getLayoutManager().findViewByPosition(i9);
            if (findViewByPosition != null) {
                if (selectedPosition == i9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                setOrAnimateAlpha(findViewByPosition, z9, i8, z8);
            }
        }
    }

    private void updateColumnSize(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((getPickerItemHeightPixels() * activatedVisibleItemCount) + (verticalGridView.getVerticalSpacing() * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    private void setOrAnimateAlpha(View view, boolean z8, float f8, float f9, Interpolator interpolator) {
        view.animate().cancel();
        if (!z8) {
            view.setAlpha(f8);
            return;
        }
        if (f9 >= 0.0f) {
            view.setAlpha(f9);
        }
        view.animate().alpha(f8).setDuration(this.mAlphaAnimDuration).setInterpolator(interpolator).start();
    }
}

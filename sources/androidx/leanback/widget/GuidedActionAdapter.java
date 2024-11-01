package androidx.leanback.widget;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.leanback.widget.GuidedActionAutofillSupport;
import androidx.leanback.widget.GuidedActionsStylist;
import androidx.leanback.widget.ImeKeyMonitor;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class GuidedActionAdapter extends RecyclerView.Adapter {
    static final boolean DEBUG = false;
    static final boolean DEBUG_EDIT = false;
    static final String TAG = "GuidedActionAdapter";
    static final String TAG_EDIT = "EditableAction";
    private final ActionAutofillListener mActionAutofillListener;
    private final ActionEditListener mActionEditListener;
    private final ActionOnFocusListener mActionOnFocusListener;
    private final ActionOnKeyListener mActionOnKeyListener;
    final List<GuidedAction> mActions;
    private ClickListener mClickListener;
    DiffCallback<GuidedAction> mDiffCallback;
    GuidedActionAdapterGroup mGroup;
    private final boolean mIsSubAdapter;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: androidx.leanback.widget.GuidedActionAdapter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != null && view.getWindowToken() != null && GuidedActionAdapter.this.getRecyclerView() != null) {
                GuidedActionsStylist.ViewHolder viewHolder = (GuidedActionsStylist.ViewHolder) GuidedActionAdapter.this.getRecyclerView().getChildViewHolder(view);
                GuidedAction action = viewHolder.getAction();
                if (action.hasTextEditable()) {
                    GuidedActionAdapter guidedActionAdapter = GuidedActionAdapter.this;
                    guidedActionAdapter.mGroup.openIme(guidedActionAdapter, viewHolder);
                } else {
                    if (action.hasEditableActivatorView()) {
                        GuidedActionAdapter.this.performOnActionClick(viewHolder);
                        return;
                    }
                    GuidedActionAdapter.this.handleCheckedActions(viewHolder);
                    if (action.isEnabled() && !action.infoOnly()) {
                        GuidedActionAdapter.this.performOnActionClick(viewHolder);
                    }
                }
            }
        }
    };
    final GuidedActionsStylist mStylist;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ActionAutofillListener implements GuidedActionAutofillSupport.OnAutofillListener {
        ActionAutofillListener() {
        }

        @Override // androidx.leanback.widget.GuidedActionAutofillSupport.OnAutofillListener
        public void onAutofill(View view) {
            GuidedActionAdapter guidedActionAdapter = GuidedActionAdapter.this;
            guidedActionAdapter.mGroup.fillAndGoNext(guidedActionAdapter, (EditText) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ActionEditListener implements TextView.OnEditorActionListener, ImeKeyMonitor.ImeKeyListener {
        ActionEditListener() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 != 5 && i8 != 6) {
                if (i8 == 1) {
                    GuidedActionAdapter guidedActionAdapter = GuidedActionAdapter.this;
                    guidedActionAdapter.mGroup.fillAndStay(guidedActionAdapter, textView);
                    return true;
                }
                return false;
            }
            GuidedActionAdapter guidedActionAdapter2 = GuidedActionAdapter.this;
            guidedActionAdapter2.mGroup.fillAndGoNext(guidedActionAdapter2, textView);
            return true;
        }

        @Override // androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener
        public boolean onKeyPreIme(EditText editText, int i8, KeyEvent keyEvent) {
            if (i8 == 4 && keyEvent.getAction() == 1) {
                GuidedActionAdapter guidedActionAdapter = GuidedActionAdapter.this;
                guidedActionAdapter.mGroup.fillAndStay(guidedActionAdapter, editText);
                return true;
            }
            if (i8 == 66 && keyEvent.getAction() == 1) {
                GuidedActionAdapter guidedActionAdapter2 = GuidedActionAdapter.this;
                guidedActionAdapter2.mGroup.fillAndGoNext(guidedActionAdapter2, editText);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ActionOnFocusListener implements View.OnFocusChangeListener {
        private FocusListener mFocusListener;
        private View mSelectedView;

        ActionOnFocusListener(FocusListener focusListener) {
            this.mFocusListener = focusListener;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z8) {
            if (GuidedActionAdapter.this.getRecyclerView() == null) {
                return;
            }
            GuidedActionsStylist.ViewHolder viewHolder = (GuidedActionsStylist.ViewHolder) GuidedActionAdapter.this.getRecyclerView().getChildViewHolder(view);
            if (z8) {
                this.mSelectedView = view;
                FocusListener focusListener = this.mFocusListener;
                if (focusListener != null) {
                    focusListener.onGuidedActionFocused(viewHolder.getAction());
                }
            } else if (this.mSelectedView == view) {
                GuidedActionAdapter.this.mStylist.onAnimateItemPressedCancelled(viewHolder);
                this.mSelectedView = null;
            }
            GuidedActionAdapter.this.mStylist.onAnimateItemFocused(viewHolder, z8);
        }

        public void setFocusListener(FocusListener focusListener) {
            this.mFocusListener = focusListener;
        }

        public void unFocus() {
            if (this.mSelectedView != null && GuidedActionAdapter.this.getRecyclerView() != null) {
                RecyclerView.ViewHolder childViewHolder = GuidedActionAdapter.this.getRecyclerView().getChildViewHolder(this.mSelectedView);
                if (childViewHolder != null) {
                    GuidedActionAdapter.this.mStylist.onAnimateItemFocused((GuidedActionsStylist.ViewHolder) childViewHolder, false);
                } else {
                    Log.w(GuidedActionAdapter.TAG, "RecyclerView returned null view holder", new Throwable());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    private class ActionOnKeyListener implements View.OnKeyListener {
        private boolean mKeyPressed = false;

        ActionOnKeyListener() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (view == null || keyEvent == null || GuidedActionAdapter.this.getRecyclerView() == null) {
                return false;
            }
            if (i8 == 23 || i8 == 66 || i8 == 160 || i8 == 99 || i8 == 100) {
                GuidedActionsStylist.ViewHolder viewHolder = (GuidedActionsStylist.ViewHolder) GuidedActionAdapter.this.getRecyclerView().getChildViewHolder(view);
                GuidedAction action = viewHolder.getAction();
                if (action.isEnabled() && !action.infoOnly()) {
                    int action2 = keyEvent.getAction();
                    if (action2 != 0) {
                        if (action2 == 1 && this.mKeyPressed) {
                            this.mKeyPressed = false;
                            GuidedActionAdapter.this.mStylist.onAnimateItemPressed(viewHolder, false);
                        }
                    } else if (!this.mKeyPressed) {
                        this.mKeyPressed = true;
                        GuidedActionAdapter.this.mStylist.onAnimateItemPressed(viewHolder, true);
                    }
                } else {
                    keyEvent.getAction();
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface ClickListener {
        void onGuidedActionClicked(GuidedAction guidedAction);
    }

    /* loaded from: classes3.dex */
    public interface EditListener {
        void onGuidedActionEditCanceled(GuidedAction guidedAction);

        long onGuidedActionEditedAndProceed(GuidedAction guidedAction);

        void onImeClose();

        void onImeOpen();
    }

    /* loaded from: classes3.dex */
    public interface FocusListener {
        void onGuidedActionFocused(GuidedAction guidedAction);
    }

    public GuidedActionAdapter(List<GuidedAction> list, ClickListener clickListener, FocusListener focusListener, GuidedActionsStylist guidedActionsStylist, boolean z8) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list);
        }
        this.mActions = arrayList;
        this.mClickListener = clickListener;
        this.mStylist = guidedActionsStylist;
        this.mActionOnKeyListener = new ActionOnKeyListener();
        this.mActionOnFocusListener = new ActionOnFocusListener(focusListener);
        this.mActionEditListener = new ActionEditListener();
        this.mActionAutofillListener = new ActionAutofillListener();
        this.mIsSubAdapter = z8;
        if (!z8) {
            this.mDiffCallback = GuidedActionDiffCallback.getInstance();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupListeners(EditText editText) {
        if (editText != 0) {
            editText.setPrivateImeOptions("escapeNorth");
            editText.setOnEditorActionListener(this.mActionEditListener);
            if (editText instanceof ImeKeyMonitor) {
                ((ImeKeyMonitor) editText).setImeKeyListener(this.mActionEditListener);
            }
            if (editText instanceof GuidedActionAutofillSupport) {
                ((GuidedActionAutofillSupport) editText).setOnAutofillListener(this.mActionAutofillListener);
            }
        }
    }

    public GuidedActionsStylist.ViewHolder findSubChildViewHolder(View view) {
        if (getRecyclerView() == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        while (parent != getRecyclerView() && parent != null) {
            view = parent;
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return (GuidedActionsStylist.ViewHolder) getRecyclerView().getChildViewHolder(view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<GuidedAction> getActions() {
        return new ArrayList(this.mActions);
    }

    public int getCount() {
        return this.mActions.size();
    }

    public GuidedActionsStylist getGuidedActionsStylist() {
        return this.mStylist;
    }

    public GuidedAction getItem(int i8) {
        return this.mActions.get(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mActions.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return this.mStylist.getItemViewType(this.mActions.get(i8));
    }

    RecyclerView getRecyclerView() {
        if (this.mIsSubAdapter) {
            return this.mStylist.getSubActionsGridView();
        }
        return this.mStylist.getActionsGridView();
    }

    public void handleCheckedActions(GuidedActionsStylist.ViewHolder viewHolder) {
        GuidedAction action = viewHolder.getAction();
        int checkSetId = action.getCheckSetId();
        if (getRecyclerView() != null && checkSetId != 0) {
            if (checkSetId != -1) {
                int size = this.mActions.size();
                for (int i8 = 0; i8 < size; i8++) {
                    GuidedAction guidedAction = this.mActions.get(i8);
                    if (guidedAction != action && guidedAction.getCheckSetId() == checkSetId && guidedAction.isChecked()) {
                        guidedAction.setChecked(false);
                        GuidedActionsStylist.ViewHolder viewHolder2 = (GuidedActionsStylist.ViewHolder) getRecyclerView().findViewHolderForPosition(i8);
                        if (viewHolder2 != null) {
                            this.mStylist.onAnimateItemChecked(viewHolder2, false);
                        }
                    }
                }
            }
            if (!action.isChecked()) {
                action.setChecked(true);
                this.mStylist.onAnimateItemChecked(viewHolder, true);
            } else if (checkSetId == -1) {
                action.setChecked(false);
                this.mStylist.onAnimateItemChecked(viewHolder, false);
            }
        }
    }

    public int indexOf(GuidedAction guidedAction) {
        return this.mActions.indexOf(guidedAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        if (i8 >= this.mActions.size()) {
            return;
        }
        GuidedAction guidedAction = this.mActions.get(i8);
        this.mStylist.onBindViewHolder((GuidedActionsStylist.ViewHolder) viewHolder, guidedAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        GuidedActionsStylist.ViewHolder onCreateViewHolder = this.mStylist.onCreateViewHolder(viewGroup, i8);
        View view = onCreateViewHolder.itemView;
        view.setOnKeyListener(this.mActionOnKeyListener);
        view.setOnClickListener(this.mOnClickListener);
        view.setOnFocusChangeListener(this.mActionOnFocusListener);
        setupListeners(onCreateViewHolder.getEditableTitleView());
        setupListeners(onCreateViewHolder.getEditableDescriptionView());
        return onCreateViewHolder;
    }

    public void performOnActionClick(GuidedActionsStylist.ViewHolder viewHolder) {
        ClickListener clickListener = this.mClickListener;
        if (clickListener != null) {
            clickListener.onGuidedActionClicked(viewHolder.getAction());
        }
    }

    public void setActions(List<GuidedAction> list) {
        if (!this.mIsSubAdapter) {
            this.mStylist.collapseAction(false);
        }
        this.mActionOnFocusListener.unFocus();
        if (this.mDiffCallback != null) {
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.mActions);
            this.mActions.clear();
            this.mActions.addAll(list);
            DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.leanback.widget.GuidedActionAdapter.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i8, int i9) {
                    return GuidedActionAdapter.this.mDiffCallback.areContentsTheSame(arrayList.get(i8), GuidedActionAdapter.this.mActions.get(i9));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i8, int i9) {
                    return GuidedActionAdapter.this.mDiffCallback.areItemsTheSame(arrayList.get(i8), GuidedActionAdapter.this.mActions.get(i9));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                @Nullable
                public Object getChangePayload(int i8, int i9) {
                    return GuidedActionAdapter.this.mDiffCallback.getChangePayload(arrayList.get(i8), GuidedActionAdapter.this.mActions.get(i9));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return GuidedActionAdapter.this.mActions.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return arrayList.size();
                }
            }).dispatchUpdatesTo(this);
            return;
        }
        this.mActions.clear();
        this.mActions.addAll(list);
        notifyDataSetChanged();
    }

    public void setClickListener(ClickListener clickListener) {
        this.mClickListener = clickListener;
    }

    public void setDiffCallback(DiffCallback<GuidedAction> diffCallback) {
        this.mDiffCallback = diffCallback;
    }

    public void setFocusListener(FocusListener focusListener) {
        this.mActionOnFocusListener.setFocusListener(focusListener);
    }
}

package androidx.leanback.widget;

import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.leanback.widget.GuidedActionAdapter;
import androidx.leanback.widget.GuidedActionsStylist;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class GuidedActionAdapterGroup {
    private static final boolean DEBUG_EDIT = false;
    private static final String TAG_EDIT = "EditableAction";
    ArrayList<Pair<GuidedActionAdapter, GuidedActionAdapter>> mAdapters = new ArrayList<>();
    private GuidedActionAdapter.EditListener mEditListener;
    private boolean mImeOpened;

    private void updateTextIntoAction(GuidedActionsStylist.ViewHolder viewHolder, TextView textView) {
        GuidedAction action = viewHolder.getAction();
        if (textView == viewHolder.getDescriptionView()) {
            if (action.getEditDescription() != null) {
                action.setEditDescription(textView.getText());
                return;
            } else {
                action.setDescription(textView.getText());
                return;
            }
        }
        if (textView == viewHolder.getTitleView()) {
            if (action.getEditTitle() != null) {
                action.setEditTitle(textView.getText());
            } else {
                action.setTitle(textView.getText());
            }
        }
    }

    public void addAdpter(GuidedActionAdapter guidedActionAdapter, GuidedActionAdapter guidedActionAdapter2) {
        this.mAdapters.add(new Pair<>(guidedActionAdapter, guidedActionAdapter2));
        if (guidedActionAdapter != null) {
            guidedActionAdapter.mGroup = this;
        }
        if (guidedActionAdapter2 != null) {
            guidedActionAdapter2.mGroup = this;
        }
    }

    public void closeIme(View view) {
        if (this.mImeOpened) {
            this.mImeOpened = false;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.mEditListener.onImeClose();
        }
    }

    public void fillAndGoNext(GuidedActionAdapter guidedActionAdapter, TextView textView) {
        GuidedActionsStylist.ViewHolder findSubChildViewHolder = guidedActionAdapter.findSubChildViewHolder(textView);
        updateTextIntoAction(findSubChildViewHolder, textView);
        guidedActionAdapter.performOnActionClick(findSubChildViewHolder);
        long onGuidedActionEditedAndProceed = this.mEditListener.onGuidedActionEditedAndProceed(findSubChildViewHolder.getAction());
        boolean z8 = false;
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(findSubChildViewHolder, false);
        if (onGuidedActionEditedAndProceed != -3 && onGuidedActionEditedAndProceed != findSubChildViewHolder.getAction().getId()) {
            z8 = focusToNextAction(guidedActionAdapter, findSubChildViewHolder.getAction(), onGuidedActionEditedAndProceed);
        }
        if (!z8) {
            closeIme(textView);
            findSubChildViewHolder.itemView.requestFocus();
        }
    }

    public void fillAndStay(GuidedActionAdapter guidedActionAdapter, TextView textView) {
        GuidedActionsStylist.ViewHolder findSubChildViewHolder = guidedActionAdapter.findSubChildViewHolder(textView);
        updateTextIntoAction(findSubChildViewHolder, textView);
        this.mEditListener.onGuidedActionEditCanceled(findSubChildViewHolder.getAction());
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(findSubChildViewHolder, false);
        closeIme(textView);
        findSubChildViewHolder.itemView.requestFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0012, code lost:            r9 = 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean focusToNextAction(androidx.leanback.widget.GuidedActionAdapter r8, androidx.leanback.widget.GuidedAction r9, long r10) {
        /*
            r7 = this;
            r0 = -2
            r2 = 1
            r3 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 != 0) goto L11
            int r9 = r8.indexOf(r9)
            if (r9 >= 0) goto Lf
            return r3
        Lf:
            int r9 = r9 + r2
            goto L12
        L11:
            r9 = 0
        L12:
            int r0 = r8.getCount()
            if (r4 != 0) goto L27
        L18:
            if (r9 >= r0) goto L38
            androidx.leanback.widget.GuidedAction r1 = r8.getItem(r9)
            boolean r1 = r1.isFocusable()
            if (r1 != 0) goto L38
            int r9 = r9 + 1
            goto L18
        L27:
            if (r9 >= r0) goto L38
            androidx.leanback.widget.GuidedAction r1 = r8.getItem(r9)
            long r5 = r1.getId()
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r1 == 0) goto L38
            int r9 = r9 + 1
            goto L27
        L38:
            if (r9 >= r0) goto L64
            androidx.leanback.widget.GuidedActionsStylist r10 = r8.getGuidedActionsStylist()
            androidx.leanback.widget.VerticalGridView r10 = r10.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r10.findViewHolderForPosition(r9)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r9 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r9
            if (r9 == 0) goto L63
            androidx.leanback.widget.GuidedAction r10 = r9.getAction()
            boolean r10 = r10.hasTextEditable()
            if (r10 == 0) goto L58
            r7.openIme(r8, r9)
            goto L62
        L58:
            android.view.View r8 = r9.itemView
            r7.closeIme(r8)
            android.view.View r8 = r9.itemView
            r8.requestFocus()
        L62:
            return r2
        L63:
            return r3
        L64:
            androidx.leanback.widget.GuidedActionAdapter r8 = r7.getNextAdapter(r8)
            if (r8 != 0) goto L11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GuidedActionAdapterGroup.focusToNextAction(androidx.leanback.widget.GuidedActionAdapter, androidx.leanback.widget.GuidedAction, long):boolean");
    }

    public GuidedActionAdapter getNextAdapter(GuidedActionAdapter guidedActionAdapter) {
        for (int i8 = 0; i8 < this.mAdapters.size(); i8++) {
            Pair<GuidedActionAdapter, GuidedActionAdapter> pair = this.mAdapters.get(i8);
            if (pair.first == guidedActionAdapter) {
                return (GuidedActionAdapter) pair.second;
            }
        }
        return null;
    }

    public void openIme(GuidedActionAdapter guidedActionAdapter, GuidedActionsStylist.ViewHolder viewHolder) {
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(viewHolder, true);
        View editingView = viewHolder.getEditingView();
        if (editingView != null && viewHolder.isInEditingText()) {
            InputMethodManager inputMethodManager = (InputMethodManager) editingView.getContext().getSystemService("input_method");
            editingView.setFocusable(true);
            editingView.requestFocus();
            inputMethodManager.showSoftInput(editingView, 0);
            if (!this.mImeOpened) {
                this.mImeOpened = true;
                this.mEditListener.onImeOpen();
            }
        }
    }

    public void setEditListener(GuidedActionAdapter.EditListener editListener) {
        this.mEditListener = editListener;
    }
}

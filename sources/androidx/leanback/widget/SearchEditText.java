package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.leanback.R;
import java.util.List;

/* loaded from: classes3.dex */
public class SearchEditText extends StreamingTextView {
    private static final boolean DEBUG = false;
    private static final String TAG = "SearchEditText";
    private OnKeyboardDismissListener mKeyboardDismissListener;

    /* loaded from: classes3.dex */
    public interface OnKeyboardDismissListener {
        void onKeyboardDismiss();
    }

    public SearchEditText(Context context) {
        this(context, null);
    }

    @Override // androidx.leanback.widget.StreamingTextView, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            OnKeyboardDismissListener onKeyboardDismissListener = this.mKeyboardDismissListener;
            if (onKeyboardDismissListener != null) {
                onKeyboardDismissListener.onKeyboardDismiss();
                return false;
            }
            return false;
        }
        return super.onKeyPreIme(i8, keyEvent);
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // androidx.leanback.widget.StreamingTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(OnKeyboardDismissListener onKeyboardDismissListener) {
        this.mKeyboardDismissListener = onKeyboardDismissListener;
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void updateRecognizedText(String str, String str2) {
        super.updateRecognizedText(str, str2);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.TextAppearance_Leanback_SearchTextEdit);
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void updateRecognizedText(String str, List list) {
        super.updateRecognizedText(str, (List<Float>) list);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}

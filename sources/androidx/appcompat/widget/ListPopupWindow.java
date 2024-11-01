package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.PointerIconCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static int getMaxAvailableHeight(PopupWindow popupWindow, View view, int i8, boolean z8) {
            return popupWindow.getMaxAvailableHeight(view, i8, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void setEpicenterBounds(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        static void setIsClippedToScreen(PopupWindow popupWindow, boolean z8) {
            popupWindow.setIsClippedToScreen(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ListSelectorHider implements Runnable {
        ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    /* loaded from: classes.dex */
    private class PopupDataSetObserver extends DataSetObserver {
        PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (i8 == 1 && !ListPopupWindow.this.isInputMethodNotNeeded() && ListPopupWindow.this.mPopup.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.mHandler.removeCallbacks(listPopupWindow.mResizePopupRunnable);
                ListPopupWindow.this.mResizePopupRunnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.mPopup) != null && popupWindow.isShowing() && x8 >= 0 && x8 < ListPopupWindow.this.mPopup.getWidth() && y8 >= 0 && y8 < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.mHandler.postDelayed(listPopupWindow.mResizePopupRunnable, 250L);
                return false;
            }
            if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.mHandler.removeCallbacks(listPopupWindow2.mResizePopupRunnable);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ResizePopupRunnable implements Runnable {
        ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.mDropDownList;
            if (dropDownListView != null && dropDownListView.isAttachedToWindow() && ListPopupWindow.this.mDropDownList.getCount() > ListPopupWindow.this.mDropDownList.getChildCount()) {
                int childCount = ListPopupWindow.this.mDropDownList.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.mListItemExpandMaximum) {
                    listPopupWindow.mPopup.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(TAG, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(TAG, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                sGetMaxAvailableHeightMethod = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i(TAG, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    private int buildDropDown() {
        int i8;
        int i9;
        int makeMeasureSpec;
        int i10;
        boolean z8 = true;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View anchorView = ListPopupWindow.this.getAnchorView();
                    if (anchorView != null && anchorView.getWindowToken() != null) {
                        ListPopupWindow.this.show();
                    }
                }
            };
            DropDownListView createDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = createDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                createDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j8) {
                    DropDownListView dropDownListView;
                    if (i11 != -1 && (dropDownListView = ListPopupWindow.this.mDropDownList) != null) {
                        dropDownListView.setListSelectionHidden(false);
                    }
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.mDropDownList;
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i11 = this.mPromptPosition;
                if (i11 != 0) {
                    if (i11 != 1) {
                        Log.e(TAG, "Invalid hint position " + this.mPromptPosition);
                    } else {
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                    }
                } else {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                }
                int i12 = this.mDropDownWidth;
                if (i12 >= 0) {
                    i10 = Integer.MIN_VALUE;
                } else {
                    i12 = 0;
                    i10 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i12, i10), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i8 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i8 = 0;
            }
            this.mPopup.setContentView(view);
        } else {
            View view3 = this.mPromptView;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i8 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i8 = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            int i13 = rect.top;
            i9 = rect.bottom + i13;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -i13;
            }
        } else {
            this.mTempRect.setEmpty();
            i9 = 0;
        }
        if (this.mPopup.getInputMethodMode() != 2) {
            z8 = false;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, z8);
        if (!this.mDropDownAlwaysVisible && this.mDropDownHeight != -1) {
            int i14 = this.mDropDownWidth;
            if (i14 != -2) {
                if (i14 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else {
                    int i15 = this.mContext.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.mTempRect;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i16 = this.mContext.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.mTempRect;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int measureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(makeMeasureSpec, 0, -1, maxAvailableHeight - i8, -1);
            if (measureHeightOfChildrenCompat > 0) {
                i8 += i9 + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
            }
            return measureHeightOfChildrenCompat + i8;
        }
        return maxAvailableHeight + i9;
    }

    private int getMaxAvailableHeight(View view, int i8, boolean z8) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = sGetMaxAvailableHeightMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.mPopup, view, Integer.valueOf(i8), Boolean.valueOf(z8))).intValue();
                } catch (Exception unused) {
                    Log.i(TAG, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.mPopup.getMaxAvailableHeight(view, i8);
        }
        return Api24Impl.getMaxAvailableHeight(this.mPopup, view, i8, z8);
    }

    private static boolean isConfirmKey(int i8) {
        return i8 == 66 || i8 == 23;
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean z8) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetClipToWindowEnabledMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, Boolean.valueOf(z8));
                    return;
                } catch (Exception unused) {
                    Log.i(TAG, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        Api29Impl.setIsClippedToScreen(this.mPopup, z8);
    }

    public void clearListSelection() {
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new ForwardingListener(view) { // from class: androidx.appcompat.widget.ListPopupWindow.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public ListPopupWindow getPopup() {
                return ListPopupWindow.this;
            }
        };
    }

    @NonNull
    DropDownListView createDropDownListView(Context context, boolean z8) {
        return new DropDownListView(context, z8);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    @Nullable
    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    @StyleRes
    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    @Nullable
    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    @Nullable
    public Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView getListView() {
        return this.mDropDownList;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    @Nullable
    public Object getSelectedItem() {
        if (!isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedItem();
    }

    public long getSelectedItemId() {
        if (!isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.mDropDownList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        if (!isShowing()) {
            return -1;
        }
        return this.mDropDownList.getSelectedItemPosition();
    }

    @Nullable
    public View getSelectedView() {
        if (!isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedView();
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (!this.mDropDownVerticalOffsetSet) {
            return 0;
        }
        return this.mDropDownVerticalOffset;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public boolean isInputMethodNotNeeded() {
        if (this.mPopup.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean isModal() {
        return this.mModal;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean onKeyDown(int i8, @NonNull KeyEvent keyEvent) {
        int i9;
        int i10;
        if (isShowing() && i8 != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i8))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean z8 = !this.mPopup.isAboveAnchor();
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i9 = 0;
                } else {
                    i9 = this.mDropDownList.lookForSelectablePosition(0, true);
                }
                if (areAllItemsEnabled) {
                    i10 = listAdapter.getCount() - 1;
                } else {
                    i10 = this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
            } else {
                i9 = Integer.MAX_VALUE;
                i10 = Integer.MIN_VALUE;
            }
            if ((z8 && i8 == 19 && selectedItemPosition <= i9) || (!z8 && i8 == 20 && selectedItemPosition >= i10)) {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            if (this.mDropDownList.onKeyDown(i8, keyEvent)) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                show();
                if (i8 == 19 || i8 == 20 || i8 == 23 || i8 == 66) {
                    return true;
                }
            } else if (z8 && i8 == 20) {
                if (selectedItemPosition == i10) {
                    return true;
                }
            } else if (!z8 && i8 == 19 && selectedItemPosition == i9) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i8, @NonNull KeyEvent keyEvent) {
        if (i8 == 4 && isShowing()) {
            View view = this.mDropDownAnchorView;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean onKeyUp(int i8, @NonNull KeyEvent keyEvent) {
        if (isShowing() && this.mDropDownList.getSelectedItemPosition() >= 0) {
            boolean onKeyUp = this.mDropDownList.onKeyUp(i8, keyEvent);
            if (onKeyUp && isConfirmKey(i8)) {
                dismiss();
            }
            return onKeyUp;
        }
        return false;
    }

    public boolean performItemClick(int i8) {
        if (isShowing()) {
            if (this.mItemClickListener != null) {
                DropDownListView dropDownListView = this.mDropDownList;
                this.mItemClickListener.onItemClick(dropDownListView, dropDownListView.getChildAt(i8 - dropDownListView.getFirstVisiblePosition()), i8, dropDownListView.getAdapter().getItemId(i8));
                return true;
            }
            return true;
        }
        return false;
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    public void setAdapter(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.mAdapter);
        }
    }

    public void setAnchorView(@Nullable View view) {
        this.mDropDownAnchorView = view;
    }

    public void setAnimationStyle(@StyleRes int i8) {
        this.mPopup.setAnimationStyle(i8);
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i8) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            this.mDropDownWidth = rect.left + rect.right + i8;
            return;
        }
        setWidth(i8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z8) {
        this.mDropDownAlwaysVisible = z8;
    }

    public void setDropDownGravity(int i8) {
        this.mDropDownGravity = i8;
    }

    public void setEpicenterBounds(@Nullable Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.mEpicenterBounds = rect2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z8) {
        this.mForceIgnoreOutsideTouch = z8;
    }

    public void setHeight(int i8) {
        if (i8 < 0 && -2 != i8 && -1 != i8) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = i8;
    }

    public void setHorizontalOffset(int i8) {
        this.mDropDownHorizontalOffset = i8;
    }

    public void setInputMethodMode(int i8) {
        this.mPopup.setInputMethodMode(i8);
    }

    void setListItemExpandMax(int i8) {
        this.mListItemExpandMaximum = i8;
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public void setModal(boolean z8) {
        this.mModal = z8;
        this.mPopup.setFocusable(z8);
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z8) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z8;
    }

    public void setPromptPosition(int i8) {
        this.mPromptPosition = i8;
    }

    public void setPromptView(@Nullable View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (isShowing) {
            show();
        }
    }

    public void setSelection(int i8) {
        DropDownListView dropDownListView = this.mDropDownList;
        if (isShowing() && dropDownListView != null) {
            dropDownListView.setListSelectionHidden(false);
            dropDownListView.setSelection(i8);
            if (dropDownListView.getChoiceMode() != 0) {
                dropDownListView.setItemChecked(i8, true);
            }
        }
    }

    public void setSoftInputMode(int i8) {
        this.mPopup.setSoftInputMode(i8);
    }

    public void setVerticalOffset(int i8) {
        this.mDropDownVerticalOffset = i8;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i8) {
        this.mDropDownWidth = i8;
    }

    public void setWindowLayoutType(int i8) {
        this.mDropDownWindowLayoutType = i8;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int buildDropDown = buildDropDown();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(this.mPopup, this.mDropDownWindowLayoutType);
        boolean z9 = true;
        if (this.mPopup.isShowing()) {
            if (!getAnchorView().isAttachedToWindow()) {
                return;
            }
            int i12 = this.mDropDownWidth;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = getAnchorView().getWidth();
            }
            int i13 = this.mDropDownHeight;
            if (i13 == -1) {
                if (!isInputMethodNotNeeded) {
                    buildDropDown = -1;
                }
                if (isInputMethodNotNeeded) {
                    PopupWindow popupWindow = this.mPopup;
                    if (this.mDropDownWidth == -1) {
                        i11 = -1;
                    } else {
                        i11 = 0;
                    }
                    popupWindow.setWidth(i11);
                    this.mPopup.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.mPopup;
                    if (this.mDropDownWidth == -1) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    popupWindow2.setWidth(i10);
                    this.mPopup.setHeight(-1);
                }
            } else if (i13 != -2) {
                buildDropDown = i13;
            }
            PopupWindow popupWindow3 = this.mPopup;
            if (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) {
                z9 = false;
            }
            popupWindow3.setOutsideTouchable(z9);
            PopupWindow popupWindow4 = this.mPopup;
            View anchorView = getAnchorView();
            int i14 = this.mDropDownHorizontalOffset;
            int i15 = this.mDropDownVerticalOffset;
            if (i12 < 0) {
                i8 = -1;
            } else {
                i8 = i12;
            }
            if (buildDropDown < 0) {
                i9 = -1;
            } else {
                i9 = buildDropDown;
            }
            popupWindow4.update(anchorView, i14, i15, i8, i9);
            return;
        }
        int i16 = this.mDropDownWidth;
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = getAnchorView().getWidth();
        }
        int i17 = this.mDropDownHeight;
        if (i17 == -1) {
            buildDropDown = -1;
        } else if (i17 != -2) {
            buildDropDown = i17;
        }
        this.mPopup.setWidth(i16);
        this.mPopup.setHeight(buildDropDown);
        setPopupClipToScreenEnabled(true);
        PopupWindow popupWindow5 = this.mPopup;
        if (!this.mForceIgnoreOutsideTouch && !this.mDropDownAlwaysVisible) {
            z8 = true;
        } else {
            z8 = false;
        }
        popupWindow5.setOutsideTouchable(z8);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            PopupWindowCompat.setOverlapAnchor(this.mPopup, this.mOverlapAnchor);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (Exception e8) {
                    Log.e(TAG, "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            Api29Impl.setEpicenterBounds(this.mPopup, this.mEpicenterBounds);
        }
        PopupWindowCompat.showAsDropDown(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (!this.mModal) {
            this.mHandler.post(this.mHideSelector);
        }
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8) {
        this(context, attributeSet, i8, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = PointerIconCompat.TYPE_HAND;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable();
        this.mTouchInterceptor = new PopupTouchInterceptor();
        this.mScrollListener = new PopupScrollListener();
        this.mHideSelector = new ListSelectorHider();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i8, i9);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i8, i9);
        this.mPopup = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}

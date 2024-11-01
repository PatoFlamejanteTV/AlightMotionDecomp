package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.leanback.R;
import androidx.leanback.transition.TransitionEpicenterCallback;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.transition.TransitionListener;
import androidx.leanback.widget.GuidedActionAdapter;
import androidx.leanback.widget.GuidedActionsRelativeLayout;
import androidx.leanback.widget.ItemAlignmentFacet;
import androidx.leanback.widget.picker.DatePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class GuidedActionsStylist implements FragmentAnimationProvider {
    private static final String TAG = "GuidedActionsStylist";
    public static final int VIEW_TYPE_DATE_PICKER = 1;
    public static final int VIEW_TYPE_DEFAULT = 0;
    static final ItemAlignmentFacet sGuidedActionItemAlignFacet;
    private VerticalGridView mActionsGridView;
    private View mBgView;
    private boolean mButtonActions;
    private View mContentView;
    private int mDescriptionMinLines;
    private float mDisabledChevronAlpha;
    private float mDisabledDescriptionAlpha;
    private float mDisabledTextAlpha;
    private int mDisplayHeight;
    private GuidedActionAdapter.EditListener mEditListener;
    private float mEnabledChevronAlpha;
    private float mEnabledDescriptionAlpha;
    private float mEnabledTextAlpha;
    Object mExpandTransition;
    private float mKeyLinePercent;
    ViewGroup mMainView;
    private View mSubActionsBackground;
    VerticalGridView mSubActionsGridView;
    private int mTitleMaxLines;
    private int mTitleMinLines;
    private int mVerticalPadding;
    GuidedAction mExpandedAction = null;
    private boolean mBackToCollapseSubActions = true;
    private boolean mBackToCollapseActivatorView = true;

    /* loaded from: classes3.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder implements FacetProvider {
        GuidedAction mAction;
        View mActivatorView;
        ImageView mCheckmarkView;
        ImageView mChevronView;
        private View mContentView;
        final View.AccessibilityDelegate mDelegate;
        TextView mDescriptionView;
        int mEditingMode;
        ImageView mIconView;
        private final boolean mIsSubAction;
        Animator mPressAnimator;
        TextView mTitleView;

        public ViewHolder(View view) {
            this(view, false);
        }

        public GuidedAction getAction() {
            return this.mAction;
        }

        public ImageView getCheckmarkView() {
            return this.mCheckmarkView;
        }

        public ImageView getChevronView() {
            return this.mChevronView;
        }

        public View getContentView() {
            return this.mContentView;
        }

        public TextView getDescriptionView() {
            return this.mDescriptionView;
        }

        public EditText getEditableDescriptionView() {
            TextView textView = this.mDescriptionView;
            if (textView instanceof EditText) {
                return (EditText) textView;
            }
            return null;
        }

        public EditText getEditableTitleView() {
            TextView textView = this.mTitleView;
            if (textView instanceof EditText) {
                return (EditText) textView;
            }
            return null;
        }

        public View getEditingView() {
            int i8 = this.mEditingMode;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        return null;
                    }
                    return this.mActivatorView;
                }
                return this.mDescriptionView;
            }
            return this.mTitleView;
        }

        @Override // androidx.leanback.widget.FacetProvider
        public Object getFacet(Class<?> cls) {
            if (cls == ItemAlignmentFacet.class) {
                return GuidedActionsStylist.sGuidedActionItemAlignFacet;
            }
            return null;
        }

        public ImageView getIconView() {
            return this.mIconView;
        }

        public TextView getTitleView() {
            return this.mTitleView;
        }

        public boolean isInEditing() {
            if (this.mEditingMode != 0) {
                return true;
            }
            return false;
        }

        public boolean isInEditingActivatorView() {
            if (this.mEditingMode == 3) {
                return true;
            }
            return false;
        }

        public boolean isInEditingDescription() {
            if (this.mEditingMode == 2) {
                return true;
            }
            return false;
        }

        public boolean isInEditingText() {
            int i8 = this.mEditingMode;
            if (i8 == 1 || i8 == 2) {
                return true;
            }
            return false;
        }

        public boolean isInEditingTitle() {
            if (this.mEditingMode == 1) {
                return true;
            }
            return false;
        }

        public boolean isSubAction() {
            return this.mIsSubAction;
        }

        void press(boolean z8) {
            int i8;
            Animator animator = this.mPressAnimator;
            if (animator != null) {
                animator.cancel();
                this.mPressAnimator = null;
            }
            if (z8) {
                i8 = R.attr.guidedActionPressedAnimation;
            } else {
                i8 = R.attr.guidedActionUnpressedAnimation;
            }
            Context context = this.itemView.getContext();
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, typedValue.resourceId);
                this.mPressAnimator = loadAnimator;
                loadAnimator.setTarget(this.itemView);
                this.mPressAnimator.addListener(new AnimatorListenerAdapter() { // from class: androidx.leanback.widget.GuidedActionsStylist.ViewHolder.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        ViewHolder.this.mPressAnimator = null;
                    }
                });
                this.mPressAnimator.start();
            }
        }

        void setActivated(boolean z8) {
            this.mActivatorView.setActivated(z8);
            View view = this.itemView;
            if (view instanceof GuidedActionItemContainer) {
                ((GuidedActionItemContainer) view).setFocusOutAllowed(!z8);
            }
        }

        public ViewHolder(View view, boolean z8) {
            super(view);
            this.mEditingMode = 0;
            View.AccessibilityDelegate accessibilityDelegate = new View.AccessibilityDelegate() { // from class: androidx.leanback.widget.GuidedActionsStylist.ViewHolder.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
                    boolean z9;
                    super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
                    GuidedAction guidedAction = ViewHolder.this.mAction;
                    if (guidedAction != null && guidedAction.isChecked()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    accessibilityEvent.setChecked(z9);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfo accessibilityNodeInfo) {
                    boolean z9;
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                    GuidedAction guidedAction = ViewHolder.this.mAction;
                    boolean z10 = false;
                    if (guidedAction != null && guidedAction.getCheckSetId() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    accessibilityNodeInfo.setCheckable(z9);
                    GuidedAction guidedAction2 = ViewHolder.this.mAction;
                    if (guidedAction2 != null && guidedAction2.isChecked()) {
                        z10 = true;
                    }
                    accessibilityNodeInfo.setChecked(z10);
                }
            };
            this.mDelegate = accessibilityDelegate;
            this.mContentView = view.findViewById(R.id.guidedactions_item_content);
            this.mTitleView = (TextView) view.findViewById(R.id.guidedactions_item_title);
            this.mActivatorView = view.findViewById(R.id.guidedactions_activator_item);
            this.mDescriptionView = (TextView) view.findViewById(R.id.guidedactions_item_description);
            this.mIconView = (ImageView) view.findViewById(R.id.guidedactions_item_icon);
            this.mCheckmarkView = (ImageView) view.findViewById(R.id.guidedactions_item_checkmark);
            this.mChevronView = (ImageView) view.findViewById(R.id.guidedactions_item_chevron);
            this.mIsSubAction = z8;
            view.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    static {
        ItemAlignmentFacet itemAlignmentFacet = new ItemAlignmentFacet();
        sGuidedActionItemAlignFacet = itemAlignmentFacet;
        ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef = new ItemAlignmentFacet.ItemAlignmentDef();
        itemAlignmentDef.setItemAlignmentViewId(R.id.guidedactions_item_title);
        itemAlignmentDef.setAlignedToTextViewBaseline(true);
        itemAlignmentDef.setItemAlignmentOffset(0);
        itemAlignmentDef.setItemAlignmentOffsetWithPadding(true);
        itemAlignmentDef.setItemAlignmentOffsetPercent(0.0f);
        itemAlignmentFacet.setAlignmentDefs(new ItemAlignmentFacet.ItemAlignmentDef[]{itemAlignmentDef});
    }

    private int getDescriptionMaxHeight(Context context, TextView textView) {
        return (this.mDisplayHeight - (this.mVerticalPadding * 2)) - ((this.mTitleMaxLines * 2) * textView.getLineHeight());
    }

    private static int getDimension(Context context, TypedValue typedValue, int i8) {
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return context.getResources().getDimensionPixelSize(typedValue.resourceId);
    }

    private static float getFloat(Context context, TypedValue typedValue, int i8) {
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.getFloat();
    }

    private static float getFloatValue(Resources resources, TypedValue typedValue, int i8) {
        resources.getValue(i8, typedValue, true);
        return typedValue.getFloat();
    }

    private static int getInteger(Context context, TypedValue typedValue, int i8) {
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return context.getResources().getInteger(typedValue.resourceId);
    }

    private boolean setIcon(ImageView imageView, GuidedAction guidedAction) {
        Drawable drawable;
        if (imageView != null) {
            drawable = guidedAction.getIcon();
            if (drawable != null) {
                imageView.setImageLevel(drawable.getLevel());
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            drawable = null;
        }
        if (drawable == null) {
            return false;
        }
        return true;
    }

    private static void setMaxLines(TextView textView, int i8) {
        if (i8 == 1) {
            textView.setSingleLine(true);
        } else {
            textView.setSingleLine(false);
            textView.setMaxLines(i8);
        }
    }

    private void setupNextImeOptions(EditText editText) {
        if (editText != null) {
            editText.setImeOptions(5);
        }
    }

    private void updateChevronAndVisibility(ViewHolder viewHolder) {
        if (!viewHolder.isSubAction()) {
            if (this.mExpandedAction == null) {
                viewHolder.itemView.setVisibility(0);
                viewHolder.itemView.setTranslationY(0.0f);
                if (viewHolder.mActivatorView != null) {
                    viewHolder.setActivated(false);
                }
            } else if (viewHolder.getAction() == this.mExpandedAction) {
                viewHolder.itemView.setVisibility(0);
                if (viewHolder.getAction().hasSubActions()) {
                    viewHolder.itemView.setTranslationY(getKeyLine() - viewHolder.itemView.getBottom());
                } else if (viewHolder.mActivatorView != null) {
                    viewHolder.itemView.setTranslationY(0.0f);
                    viewHolder.setActivated(true);
                }
            } else {
                viewHolder.itemView.setVisibility(4);
                viewHolder.itemView.setTranslationY(0.0f);
            }
        }
        if (viewHolder.mChevronView != null) {
            onBindChevronView(viewHolder, viewHolder.getAction());
        }
    }

    public void collapseAction(boolean z8) {
        boolean z9;
        if (!isInExpandTransition() && this.mExpandedAction != null) {
            if (isExpandTransitionSupported() && z8) {
                z9 = true;
            } else {
                z9 = false;
            }
            int indexOf = ((GuidedActionAdapter) getActionsGridView().getAdapter()).indexOf(this.mExpandedAction);
            if (indexOf < 0) {
                return;
            }
            if (this.mExpandedAction.hasEditableActivatorView()) {
                setEditingMode((ViewHolder) getActionsGridView().findViewHolderForPosition(indexOf), false, z9);
            } else {
                startExpanded(null, z9);
            }
        }
    }

    public void expandAction(GuidedAction guidedAction, boolean z8) {
        int indexOf;
        if (isInExpandTransition() || this.mExpandedAction != null || (indexOf = ((GuidedActionAdapter) getActionsGridView().getAdapter()).indexOf(guidedAction)) < 0) {
            return;
        }
        if (isExpandTransitionSupported() && z8) {
            getActionsGridView().setSelectedPosition(indexOf, new ViewHolderTask() { // from class: androidx.leanback.widget.GuidedActionsStylist.5
                @Override // androidx.leanback.widget.ViewHolderTask
                public void run(RecyclerView.ViewHolder viewHolder) {
                    ViewHolder viewHolder2 = (ViewHolder) viewHolder;
                    if (viewHolder2.getAction().hasEditableActivatorView()) {
                        GuidedActionsStylist.this.setEditingMode(viewHolder2, true, true);
                    } else {
                        GuidedActionsStylist.this.startExpanded(viewHolder2, true);
                    }
                }
            });
            return;
        }
        getActionsGridView().setSelectedPosition(indexOf, new ViewHolderTask() { // from class: androidx.leanback.widget.GuidedActionsStylist.4
            @Override // androidx.leanback.widget.ViewHolderTask
            public void run(RecyclerView.ViewHolder viewHolder) {
                ViewHolder viewHolder2 = (ViewHolder) viewHolder;
                if (viewHolder2.getAction().hasEditableActivatorView()) {
                    GuidedActionsStylist.this.setEditingMode(viewHolder2, true, false);
                } else {
                    GuidedActionsStylist.this.onUpdateExpandedViewHolder(viewHolder2);
                }
            }
        });
        if (guidedAction.hasSubActions()) {
            onUpdateSubActionsGridView(guidedAction, true);
        }
    }

    public VerticalGridView getActionsGridView() {
        return this.mActionsGridView;
    }

    public GuidedAction getExpandedAction() {
        return this.mExpandedAction;
    }

    public int getItemViewType(GuidedAction guidedAction) {
        if (guidedAction instanceof GuidedDatePickerAction) {
            return 1;
        }
        return 0;
    }

    int getKeyLine() {
        return (int) ((this.mKeyLinePercent * this.mActionsGridView.getHeight()) / 100.0f);
    }

    public VerticalGridView getSubActionsGridView() {
        return this.mSubActionsGridView;
    }

    public final boolean isBackKeyToCollapseActivatorView() {
        return this.mBackToCollapseActivatorView;
    }

    public final boolean isBackKeyToCollapseSubActions() {
        return this.mBackToCollapseSubActions;
    }

    public boolean isButtonActions() {
        return this.mButtonActions;
    }

    public boolean isExpandTransitionSupported() {
        return true;
    }

    public boolean isExpanded() {
        if (this.mExpandedAction != null) {
            return true;
        }
        return false;
    }

    public boolean isInExpandTransition() {
        if (this.mExpandTransition != null) {
            return true;
        }
        return false;
    }

    public boolean isSubActionsExpanded() {
        GuidedAction guidedAction = this.mExpandedAction;
        if (guidedAction != null && guidedAction.hasSubActions()) {
            return true;
        }
        return false;
    }

    public void onAnimateItemChecked(ViewHolder viewHolder, boolean z8) {
        KeyEvent.Callback callback = viewHolder.mCheckmarkView;
        if (callback instanceof Checkable) {
            ((Checkable) callback).setChecked(z8);
        }
    }

    public void onAnimateItemFocused(ViewHolder viewHolder, boolean z8) {
    }

    public void onAnimateItemPressed(ViewHolder viewHolder, boolean z8) {
        viewHolder.press(z8);
    }

    public void onAnimateItemPressedCancelled(ViewHolder viewHolder) {
        viewHolder.press(false);
    }

    public void onBindActivatorView(ViewHolder viewHolder, GuidedAction guidedAction) {
        if (guidedAction instanceof GuidedDatePickerAction) {
            GuidedDatePickerAction guidedDatePickerAction = (GuidedDatePickerAction) guidedAction;
            DatePicker datePicker = (DatePicker) viewHolder.mActivatorView;
            datePicker.setDatePickerFormat(guidedDatePickerAction.getDatePickerFormat());
            if (guidedDatePickerAction.getMinDate() != Long.MIN_VALUE) {
                datePicker.setMinDate(guidedDatePickerAction.getMinDate());
            }
            if (guidedDatePickerAction.getMaxDate() != Long.MAX_VALUE) {
                datePicker.setMaxDate(guidedDatePickerAction.getMaxDate());
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(guidedDatePickerAction.getDate());
            datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5), false);
        }
    }

    public void onBindCheckMarkView(ViewHolder viewHolder, GuidedAction guidedAction) {
        int i8;
        Drawable drawable;
        if (guidedAction.getCheckSetId() != 0) {
            viewHolder.mCheckmarkView.setVisibility(0);
            if (guidedAction.getCheckSetId() == -1) {
                i8 = android.R.attr.listChoiceIndicatorMultiple;
            } else {
                i8 = android.R.attr.listChoiceIndicatorSingle;
            }
            Context context = viewHolder.mCheckmarkView.getContext();
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
                drawable = ContextCompat.getDrawable(context, typedValue.resourceId);
            } else {
                drawable = null;
            }
            viewHolder.mCheckmarkView.setImageDrawable(drawable);
            KeyEvent.Callback callback = viewHolder.mCheckmarkView;
            if (callback instanceof Checkable) {
                ((Checkable) callback).setChecked(guidedAction.isChecked());
                return;
            }
            return;
        }
        viewHolder.mCheckmarkView.setVisibility(8);
    }

    public void onBindChevronView(ViewHolder viewHolder, GuidedAction guidedAction) {
        float f8;
        float f9;
        boolean hasNext = guidedAction.hasNext();
        boolean hasSubActions = guidedAction.hasSubActions();
        if (!hasNext && !hasSubActions) {
            viewHolder.mChevronView.setVisibility(8);
            return;
        }
        viewHolder.mChevronView.setVisibility(0);
        ImageView imageView = viewHolder.mChevronView;
        if (guidedAction.isEnabled()) {
            f8 = this.mEnabledChevronAlpha;
        } else {
            f8 = this.mDisabledChevronAlpha;
        }
        imageView.setAlpha(f8);
        if (hasNext) {
            ViewGroup viewGroup = this.mMainView;
            if (viewGroup != null && viewGroup.getLayoutDirection() == 1) {
                f9 = 180.0f;
            } else {
                f9 = 0.0f;
            }
            viewHolder.mChevronView.setRotation(f9);
            return;
        }
        if (guidedAction == this.mExpandedAction) {
            viewHolder.mChevronView.setRotation(270.0f);
        } else {
            viewHolder.mChevronView.setRotation(90.0f);
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, GuidedAction guidedAction) {
        int i8;
        float f8;
        float f9;
        viewHolder.mAction = guidedAction;
        TextView textView = viewHolder.mTitleView;
        if (textView != null) {
            textView.setInputType(guidedAction.getInputType());
            viewHolder.mTitleView.setText(guidedAction.getTitle());
            TextView textView2 = viewHolder.mTitleView;
            if (guidedAction.isEnabled()) {
                f9 = this.mEnabledTextAlpha;
            } else {
                f9 = this.mDisabledTextAlpha;
            }
            textView2.setAlpha(f9);
            viewHolder.mTitleView.setFocusable(false);
            viewHolder.mTitleView.setClickable(false);
            viewHolder.mTitleView.setLongClickable(false);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                if (guidedAction.isEditable()) {
                    viewHolder.mTitleView.setAutofillHints(guidedAction.getAutofillHints());
                } else {
                    viewHolder.mTitleView.setAutofillHints(null);
                }
            } else if (i9 >= 26) {
                viewHolder.mTitleView.setImportantForAutofill(2);
            }
        }
        TextView textView3 = viewHolder.mDescriptionView;
        if (textView3 != null) {
            textView3.setInputType(guidedAction.getDescriptionInputType());
            viewHolder.mDescriptionView.setText(guidedAction.getDescription());
            TextView textView4 = viewHolder.mDescriptionView;
            if (TextUtils.isEmpty(guidedAction.getDescription())) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            textView4.setVisibility(i8);
            TextView textView5 = viewHolder.mDescriptionView;
            if (guidedAction.isEnabled()) {
                f8 = this.mEnabledDescriptionAlpha;
            } else {
                f8 = this.mDisabledDescriptionAlpha;
            }
            textView5.setAlpha(f8);
            viewHolder.mDescriptionView.setFocusable(false);
            viewHolder.mDescriptionView.setClickable(false);
            viewHolder.mDescriptionView.setLongClickable(false);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                if (guidedAction.isDescriptionEditable()) {
                    viewHolder.mDescriptionView.setAutofillHints(guidedAction.getAutofillHints());
                } else {
                    viewHolder.mDescriptionView.setAutofillHints(null);
                }
            } else if (i10 >= 26) {
                viewHolder.mTitleView.setImportantForAutofill(2);
            }
        }
        if (viewHolder.mCheckmarkView != null) {
            onBindCheckMarkView(viewHolder, guidedAction);
        }
        setIcon(viewHolder.mIconView, guidedAction);
        if (guidedAction.hasMultilineDescription()) {
            TextView textView6 = viewHolder.mTitleView;
            if (textView6 != null) {
                setMaxLines(textView6, this.mTitleMaxLines);
                TextView textView7 = viewHolder.mTitleView;
                textView7.setInputType(textView7.getInputType() | 131072);
                TextView textView8 = viewHolder.mDescriptionView;
                if (textView8 != null) {
                    textView8.setInputType(textView8.getInputType() | 131072);
                    viewHolder.mDescriptionView.setMaxHeight(getDescriptionMaxHeight(viewHolder.itemView.getContext(), viewHolder.mTitleView));
                }
            }
        } else {
            TextView textView9 = viewHolder.mTitleView;
            if (textView9 != null) {
                setMaxLines(textView9, this.mTitleMinLines);
            }
            TextView textView10 = viewHolder.mDescriptionView;
            if (textView10 != null) {
                setMaxLines(textView10, this.mDescriptionMinLines);
            }
        }
        if (viewHolder.mActivatorView != null) {
            onBindActivatorView(viewHolder, guidedAction);
        }
        setEditingMode(viewHolder, false, false);
        if (guidedAction.isFocusable()) {
            viewHolder.itemView.setFocusable(true);
            ((ViewGroup) viewHolder.itemView).setDescendantFocusability(131072);
        } else {
            viewHolder.itemView.setFocusable(false);
            ((ViewGroup) viewHolder.itemView).setDescendantFocusability(393216);
        }
        setupImeOptions(viewHolder, guidedAction);
        updateChevronAndVisibility(viewHolder);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i8;
        int i9;
        int i10;
        float f8 = layoutInflater.getContext().getTheme().obtainStyledAttributes(R.styleable.LeanbackGuidedStepTheme).getFloat(R.styleable.LeanbackGuidedStepTheme_guidedStepKeyline, 40.0f);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(onProvideLayoutId(), viewGroup, false);
        this.mMainView = viewGroup2;
        if (this.mButtonActions) {
            i8 = R.id.guidedactions_content2;
        } else {
            i8 = R.id.guidedactions_content;
        }
        this.mContentView = viewGroup2.findViewById(i8);
        ViewGroup viewGroup3 = this.mMainView;
        if (this.mButtonActions) {
            i9 = R.id.guidedactions_list_background2;
        } else {
            i9 = R.id.guidedactions_list_background;
        }
        this.mBgView = viewGroup3.findViewById(i9);
        ViewGroup viewGroup4 = this.mMainView;
        if (viewGroup4 instanceof VerticalGridView) {
            this.mActionsGridView = (VerticalGridView) viewGroup4;
        } else {
            if (this.mButtonActions) {
                i10 = R.id.guidedactions_list2;
            } else {
                i10 = R.id.guidedactions_list;
            }
            VerticalGridView verticalGridView = (VerticalGridView) viewGroup4.findViewById(i10);
            this.mActionsGridView = verticalGridView;
            if (verticalGridView != null) {
                verticalGridView.setWindowAlignmentOffsetPercent(f8);
                this.mActionsGridView.setWindowAlignment(0);
                if (!this.mButtonActions) {
                    this.mSubActionsGridView = (VerticalGridView) this.mMainView.findViewById(R.id.guidedactions_sub_list);
                    this.mSubActionsBackground = this.mMainView.findViewById(R.id.guidedactions_sub_list_background);
                }
            } else {
                throw new IllegalStateException("No ListView exists.");
            }
        }
        this.mActionsGridView.setFocusable(false);
        this.mActionsGridView.setFocusableInTouchMode(false);
        Context context = this.mMainView.getContext();
        TypedValue typedValue = new TypedValue();
        this.mEnabledChevronAlpha = getFloat(context, typedValue, R.attr.guidedActionEnabledChevronAlpha);
        this.mDisabledChevronAlpha = getFloat(context, typedValue, R.attr.guidedActionDisabledChevronAlpha);
        this.mTitleMinLines = getInteger(context, typedValue, R.attr.guidedActionTitleMinLines);
        this.mTitleMaxLines = getInteger(context, typedValue, R.attr.guidedActionTitleMaxLines);
        this.mDescriptionMinLines = getInteger(context, typedValue, R.attr.guidedActionDescriptionMinLines);
        this.mVerticalPadding = getDimension(context, typedValue, R.attr.guidedActionVerticalPadding);
        this.mDisplayHeight = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        this.mEnabledTextAlpha = getFloatValue(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_unselected_text_alpha);
        this.mDisabledTextAlpha = getFloatValue(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_disabled_text_alpha);
        this.mEnabledDescriptionAlpha = getFloatValue(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_unselected_description_text_alpha);
        this.mDisabledDescriptionAlpha = getFloatValue(context.getResources(), typedValue, R.dimen.lb_guidedactions_item_disabled_description_text_alpha);
        this.mKeyLinePercent = GuidanceStylingRelativeLayout.getKeyLinePercent(context);
        View view = this.mContentView;
        if (view instanceof GuidedActionsRelativeLayout) {
            ((GuidedActionsRelativeLayout) view).setInterceptKeyEventListener(new GuidedActionsRelativeLayout.InterceptKeyEventListener() { // from class: androidx.leanback.widget.GuidedActionsStylist.1
                @Override // androidx.leanback.widget.GuidedActionsRelativeLayout.InterceptKeyEventListener
                public boolean onInterceptKeyEvent(KeyEvent keyEvent) {
                    GuidedAction guidedAction;
                    if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (guidedAction = GuidedActionsStylist.this.mExpandedAction) != null) {
                        if ((guidedAction.hasSubActions() && GuidedActionsStylist.this.isBackKeyToCollapseSubActions()) || (GuidedActionsStylist.this.mExpandedAction.hasEditableActivatorView() && GuidedActionsStylist.this.isBackKeyToCollapseActivatorView())) {
                            GuidedActionsStylist.this.collapseAction(true);
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            });
        }
        return this.mMainView;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(onProvideItemLayoutId(), viewGroup, false), viewGroup == this.mSubActionsGridView);
    }

    public void onDestroyView() {
        this.mExpandedAction = null;
        this.mExpandTransition = null;
        this.mActionsGridView = null;
        this.mSubActionsGridView = null;
        this.mSubActionsBackground = null;
        this.mContentView = null;
        this.mBgView = null;
        this.mMainView = null;
    }

    void onEditActivatorView(final ViewHolder viewHolder, boolean z8, boolean z9) {
        GuidedActionAdapter.EditListener editListener;
        if (z8) {
            startExpanded(viewHolder, z9);
            viewHolder.itemView.setFocusable(false);
            viewHolder.mActivatorView.requestFocus();
            viewHolder.mActivatorView.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.GuidedActionsStylist.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!GuidedActionsStylist.this.isInExpandTransition()) {
                        ((GuidedActionAdapter) GuidedActionsStylist.this.getActionsGridView().getAdapter()).performOnActionClick(viewHolder);
                    }
                }
            });
            return;
        }
        if (onUpdateActivatorView(viewHolder, viewHolder.getAction()) && (editListener = this.mEditListener) != null) {
            editListener.onGuidedActionEditedAndProceed(viewHolder.getAction());
        }
        viewHolder.itemView.setFocusable(true);
        viewHolder.itemView.requestFocus();
        startExpanded(null, z9);
        viewHolder.mActivatorView.setOnClickListener(null);
        viewHolder.mActivatorView.setClickable(false);
    }

    @Deprecated
    protected void onEditingModeChange(ViewHolder viewHolder, GuidedAction guidedAction, boolean z8) {
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeAppearing(@NonNull List<Animator> list) {
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeDisappearing(@NonNull List<Animator> list) {
    }

    public int onProvideItemLayoutId() {
        return R.layout.lb_guidedactions_item;
    }

    public int onProvideLayoutId() {
        if (this.mButtonActions) {
            return R.layout.lb_guidedbuttonactions;
        }
        return R.layout.lb_guidedactions;
    }

    public boolean onUpdateActivatorView(ViewHolder viewHolder, GuidedAction guidedAction) {
        if (guidedAction instanceof GuidedDatePickerAction) {
            GuidedDatePickerAction guidedDatePickerAction = (GuidedDatePickerAction) guidedAction;
            DatePicker datePicker = (DatePicker) viewHolder.mActivatorView;
            if (guidedDatePickerAction.getDate() != datePicker.getDate()) {
                guidedDatePickerAction.setDate(datePicker.getDate());
                return true;
            }
            return false;
        }
        return false;
    }

    public void onUpdateExpandedViewHolder(ViewHolder viewHolder) {
        if (viewHolder == null) {
            this.mExpandedAction = null;
            this.mActionsGridView.setPruneChild(true);
        } else if (viewHolder.getAction() != this.mExpandedAction) {
            this.mExpandedAction = viewHolder.getAction();
            this.mActionsGridView.setPruneChild(false);
        }
        this.mActionsGridView.setAnimateChildLayout(false);
        int childCount = this.mActionsGridView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            VerticalGridView verticalGridView = this.mActionsGridView;
            updateChevronAndVisibility((ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8)));
        }
    }

    void onUpdateSubActionsGridView(GuidedAction guidedAction, boolean z8) {
        VerticalGridView verticalGridView = this.mSubActionsGridView;
        if (verticalGridView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) verticalGridView.getLayoutParams();
            GuidedActionAdapter guidedActionAdapter = (GuidedActionAdapter) this.mSubActionsGridView.getAdapter();
            if (z8) {
                marginLayoutParams.topMargin = -2;
                marginLayoutParams.height = -1;
                this.mSubActionsGridView.setLayoutParams(marginLayoutParams);
                this.mSubActionsGridView.setVisibility(0);
                this.mSubActionsBackground.setVisibility(0);
                this.mSubActionsGridView.requestFocus();
                guidedActionAdapter.setActions(guidedAction.getSubActions());
                return;
            }
            marginLayoutParams.topMargin = this.mActionsGridView.getLayoutManager().findViewByPosition(((GuidedActionAdapter) this.mActionsGridView.getAdapter()).indexOf(guidedAction)).getBottom();
            marginLayoutParams.height = 0;
            this.mSubActionsGridView.setVisibility(4);
            this.mSubActionsBackground.setVisibility(4);
            this.mSubActionsGridView.setLayoutParams(marginLayoutParams);
            guidedActionAdapter.setActions(Collections.emptyList());
            this.mActionsGridView.requestFocus();
        }
    }

    public void openInEditMode(GuidedAction guidedAction) {
        final GuidedActionAdapter guidedActionAdapter = (GuidedActionAdapter) getActionsGridView().getAdapter();
        int indexOf = guidedActionAdapter.getActions().indexOf(guidedAction);
        if (indexOf >= 0 && guidedAction.isEditable()) {
            getActionsGridView().setSelectedPosition(indexOf, new ViewHolderTask() { // from class: androidx.leanback.widget.GuidedActionsStylist.2
                @Override // androidx.leanback.widget.ViewHolderTask
                public void run(RecyclerView.ViewHolder viewHolder) {
                    GuidedActionAdapter guidedActionAdapter2 = guidedActionAdapter;
                    guidedActionAdapter2.mGroup.openIme(guidedActionAdapter2, (ViewHolder) viewHolder);
                }
            });
        }
    }

    public void setAsButtonActions() {
        if (this.mMainView == null) {
            this.mButtonActions = true;
            return;
        }
        throw new IllegalStateException("setAsButtonActions() must be called before creating views");
    }

    public final void setBackKeyToCollapseActivatorView(boolean z8) {
        this.mBackToCollapseActivatorView = z8;
    }

    public final void setBackKeyToCollapseSubActions(boolean z8) {
        this.mBackToCollapseSubActions = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEditListener(GuidedActionAdapter.EditListener editListener) {
        this.mEditListener = editListener;
    }

    @Deprecated
    public void setEditingMode(ViewHolder viewHolder, GuidedAction guidedAction, boolean z8) {
        if (z8 == viewHolder.isInEditing() || !isInExpandTransition()) {
            return;
        }
        onEditingModeChange(viewHolder, guidedAction, z8);
    }

    @Deprecated
    public void setExpandedViewHolder(ViewHolder viewHolder) {
        GuidedAction action;
        if (viewHolder == null) {
            action = null;
        } else {
            action = viewHolder.getAction();
        }
        expandAction(action, isExpandTransitionSupported());
    }

    protected void setupImeOptions(ViewHolder viewHolder, GuidedAction guidedAction) {
        setupNextImeOptions(viewHolder.getEditableTitleView());
        setupNextImeOptions(viewHolder.getEditableDescriptionView());
    }

    void startExpanded(ViewHolder viewHolder, boolean z8) {
        ViewHolder viewHolder2;
        boolean z9;
        float height;
        int childCount = this.mActionsGridView.getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 < childCount) {
                VerticalGridView verticalGridView = this.mActionsGridView;
                viewHolder2 = (ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8));
                if ((viewHolder == null && viewHolder2.itemView.getVisibility() == 0) || (viewHolder != null && viewHolder2.getAction() == viewHolder.getAction())) {
                    break;
                } else {
                    i8++;
                }
            } else {
                viewHolder2 = null;
                break;
            }
        }
        if (viewHolder2 == null) {
            return;
        }
        if (viewHolder != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean hasSubActions = viewHolder2.getAction().hasSubActions();
        if (z8) {
            Object createTransitionSet = TransitionHelper.createTransitionSet(false);
            View view = viewHolder2.itemView;
            if (hasSubActions) {
                height = view.getHeight();
            } else {
                height = view.getHeight() * 0.5f;
            }
            Object createFadeAndShortSlide = TransitionHelper.createFadeAndShortSlide(112, height);
            TransitionHelper.setEpicenterCallback(createFadeAndShortSlide, new TransitionEpicenterCallback() { // from class: androidx.leanback.widget.GuidedActionsStylist.6
                Rect mRect = new Rect();

                @Override // androidx.leanback.transition.TransitionEpicenterCallback
                public Rect onGetEpicenter(Object obj) {
                    int keyLine = GuidedActionsStylist.this.getKeyLine();
                    this.mRect.set(0, keyLine, 0, keyLine);
                    return this.mRect;
                }
            });
            Object createChangeTransform = TransitionHelper.createChangeTransform();
            Object createChangeBounds = TransitionHelper.createChangeBounds(false);
            Object createFadeTransition = TransitionHelper.createFadeTransition(3);
            Object createChangeBounds2 = TransitionHelper.createChangeBounds(false);
            if (viewHolder == null) {
                TransitionHelper.setStartDelay(createFadeAndShortSlide, 150L);
                TransitionHelper.setStartDelay(createChangeTransform, 100L);
                TransitionHelper.setStartDelay(createChangeBounds, 100L);
                TransitionHelper.setStartDelay(createChangeBounds2, 100L);
            } else {
                TransitionHelper.setStartDelay(createFadeTransition, 100L);
                TransitionHelper.setStartDelay(createChangeBounds2, 50L);
                TransitionHelper.setStartDelay(createChangeTransform, 50L);
                TransitionHelper.setStartDelay(createChangeBounds, 50L);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                VerticalGridView verticalGridView2 = this.mActionsGridView;
                ViewHolder viewHolder3 = (ViewHolder) verticalGridView2.getChildViewHolder(verticalGridView2.getChildAt(i9));
                if (viewHolder3 == viewHolder2) {
                    if (hasSubActions) {
                        TransitionHelper.include(createChangeTransform, viewHolder3.itemView);
                        TransitionHelper.include(createChangeBounds, viewHolder3.itemView);
                    }
                } else {
                    TransitionHelper.include(createFadeAndShortSlide, viewHolder3.itemView);
                    TransitionHelper.exclude(createFadeTransition, viewHolder3.itemView, true);
                }
            }
            TransitionHelper.include(createChangeBounds2, this.mSubActionsGridView);
            TransitionHelper.include(createChangeBounds2, this.mSubActionsBackground);
            TransitionHelper.addTransition(createTransitionSet, createFadeAndShortSlide);
            if (hasSubActions) {
                TransitionHelper.addTransition(createTransitionSet, createChangeTransform);
                TransitionHelper.addTransition(createTransitionSet, createChangeBounds);
            }
            TransitionHelper.addTransition(createTransitionSet, createFadeTransition);
            TransitionHelper.addTransition(createTransitionSet, createChangeBounds2);
            this.mExpandTransition = createTransitionSet;
            TransitionHelper.addTransitionListener(createTransitionSet, new TransitionListener() { // from class: androidx.leanback.widget.GuidedActionsStylist.7
                @Override // androidx.leanback.transition.TransitionListener
                public void onTransitionEnd(Object obj) {
                    GuidedActionsStylist.this.mExpandTransition = null;
                }
            });
            if (z9 && hasSubActions) {
                int bottom = viewHolder.itemView.getBottom();
                VerticalGridView verticalGridView3 = this.mSubActionsGridView;
                verticalGridView3.offsetTopAndBottom(bottom - verticalGridView3.getTop());
                View view2 = this.mSubActionsBackground;
                view2.offsetTopAndBottom(bottom - view2.getTop());
            }
            TransitionHelper.beginDelayedTransition(this.mMainView, this.mExpandTransition);
        }
        onUpdateExpandedViewHolder(viewHolder);
        if (hasSubActions) {
            onUpdateSubActionsGridView(viewHolder2.getAction(), z9);
        }
    }

    @Deprecated
    public void startExpandedTransition(ViewHolder viewHolder) {
        GuidedAction action;
        if (viewHolder == null) {
            action = null;
        } else {
            action = viewHolder.getAction();
        }
        expandAction(action, isExpandTransitionSupported());
    }

    @CallSuper
    protected void onEditingModeChange(ViewHolder viewHolder, boolean z8, boolean z9) {
        GuidedAction action = viewHolder.getAction();
        TextView titleView = viewHolder.getTitleView();
        TextView descriptionView = viewHolder.getDescriptionView();
        if (z8) {
            CharSequence editTitle = action.getEditTitle();
            if (titleView != null && editTitle != null) {
                titleView.setText(editTitle);
            }
            CharSequence editDescription = action.getEditDescription();
            if (descriptionView != null && editDescription != null) {
                descriptionView.setText(editDescription);
            }
            if (action.isDescriptionEditable()) {
                if (descriptionView != null) {
                    descriptionView.setVisibility(0);
                    descriptionView.setInputType(action.getDescriptionEditInputType());
                }
                viewHolder.mEditingMode = 2;
            } else if (action.isEditable()) {
                if (titleView != null) {
                    titleView.setInputType(action.getEditInputType());
                }
                viewHolder.mEditingMode = 1;
            } else if (viewHolder.mActivatorView != null) {
                onEditActivatorView(viewHolder, z8, z9);
                viewHolder.mEditingMode = 3;
            }
        } else {
            if (titleView != null) {
                titleView.setText(action.getTitle());
            }
            if (descriptionView != null) {
                descriptionView.setText(action.getDescription());
            }
            int i8 = viewHolder.mEditingMode;
            if (i8 == 2) {
                if (descriptionView != null) {
                    descriptionView.setVisibility(TextUtils.isEmpty(action.getDescription()) ? 8 : 0);
                    descriptionView.setInputType(action.getDescriptionInputType());
                }
            } else if (i8 == 1) {
                if (titleView != null) {
                    titleView.setInputType(action.getInputType());
                }
            } else if (i8 == 3 && viewHolder.mActivatorView != null) {
                onEditActivatorView(viewHolder, z8, z9);
            }
            viewHolder.mEditingMode = 0;
        }
        onEditingModeChange(viewHolder, action, z8);
    }

    public int onProvideItemLayoutId(int i8) {
        if (i8 == 0) {
            return onProvideItemLayoutId();
        }
        if (i8 == 1) {
            return R.layout.lb_guidedactions_datepicker_item;
        }
        throw new RuntimeException("ViewType " + i8 + " not supported in GuidedActionsStylist");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEditingMode(ViewHolder viewHolder, boolean z8) {
        setEditingMode(viewHolder, z8, true);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        if (i8 == 0) {
            return onCreateViewHolder(viewGroup);
        }
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(onProvideItemLayoutId(i8), viewGroup, false), viewGroup == this.mSubActionsGridView);
    }

    void setEditingMode(ViewHolder viewHolder, boolean z8, boolean z9) {
        if (z8 == viewHolder.isInEditing() || isInExpandTransition()) {
            return;
        }
        onEditingModeChange(viewHolder, z8, z9);
    }
}

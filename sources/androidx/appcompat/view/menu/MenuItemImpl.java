package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final String TAG = "MenuItemImpl";
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private Intent mIntent;
    private Runnable mItemCallback;
    MenuBuilder mMenu;
    private ContextMenu.ContextMenuInfo mMenuInfo;
    private MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private CharSequence mTooltipText;
    private int mShortcutNumericModifiers = 4096;
    private int mShortcutAlphabeticModifiers = 4096;
    private int mIconResId = 0;
    private ColorStateList mIconTintList = null;
    private PorterDuff.Mode mIconTintMode = null;
    private boolean mHasIconTint = false;
    private boolean mHasIconTintMode = false;
    private boolean mNeedToApplyIconTint = false;
    private int mFlags = 16;
    private boolean mIsActionViewExpanded = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemImpl(MenuBuilder menuBuilder, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.mMenu = menuBuilder;
        this.mId = i9;
        this.mGroup = i8;
        this.mCategoryOrder = i10;
        this.mOrdering = i11;
        this.mTitle = charSequence;
        this.mShowAsAction = i12;
    }

    private static void appendModifier(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    private Drawable applyIconTintIfNecessary(Drawable drawable) {
        if (drawable != null && this.mNeedToApplyIconTint && (this.mHasIconTint || this.mHasIconTintMode)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.mHasIconTint) {
                DrawableCompat.setTintList(drawable, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                DrawableCompat.setTintMode(drawable, this.mIconTintMode);
            }
            this.mNeedToApplyIconTint = false;
        }
        return drawable;
    }

    public void actionFormatChanged() {
        this.mMenu.onItemActionRequestChanged(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.mMenu.collapseItemActionView(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.mMenu.expandItemActionView(this);
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.mActionView;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.mActionProvider;
        if (actionProvider != null) {
            View onCreateActionView = actionProvider.onCreateActionView(this);
            this.mActionView = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    Runnable getCallback() {
        return this.mItemCallback;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mGroup;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.mIconDrawable;
        if (drawable != null) {
            return applyIconTintIfNecessary(drawable);
        }
        if (this.mIconResId != 0) {
            Drawable drawable2 = AppCompatResources.getDrawable(this.mMenu.getContext(), this.mIconResId);
            this.mIconResId = 0;
            this.mIconDrawable = drawable2;
            return applyIconTintIfNecessary(drawable2);
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.mIconTintList;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.mIntent;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.mCategoryOrder;
    }

    public int getOrdering() {
        return this.mOrdering;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char getShortcut() {
        if (this.mMenu.isQwertyMode()) {
            return this.mShortcutAlphabeticChar;
        }
        return this.mShortcutNumericChar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getShortcutLabel() {
        int i8;
        char shortcut = getShortcut();
        if (shortcut == 0) {
            return "";
        }
        Resources resources = this.mMenu.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.mMenu.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        if (this.mMenu.isQwertyMode()) {
            i8 = this.mShortcutAlphabeticModifiers;
        } else {
            i8 = this.mShortcutNumericModifiers;
        }
        appendModifier(sb, i8, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        appendModifier(sb, i8, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        appendModifier(sb, i8, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        appendModifier(sb, i8, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        appendModifier(sb, i8, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        appendModifier(sb, i8, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (shortcut != '\b') {
            if (shortcut != '\n') {
                if (shortcut != ' ') {
                    sb.append(shortcut);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
            } else {
                sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
            }
        } else {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.mTitleCondensed;
        if (charSequence == null) {
            return this.mTitle;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getTitleForItemView(MenuView.ItemView itemView) {
        if (itemView != null && itemView.prefersCondensedTitle()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.mTooltipText;
    }

    public boolean hasCollapsibleActionView() {
        ActionProvider actionProvider;
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null && (actionProvider = this.mActionProvider) != null) {
            this.mActionView = actionProvider.onCreateActionView(this);
        }
        if (this.mActionView == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.mSubMenu != null) {
            return true;
        }
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.mClickListener;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder.dispatchMenuItemSelected(menuBuilder, this)) {
            return true;
        }
        Runnable runnable = this.mItemCallback;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.mIntent != null) {
            try {
                this.mMenu.getContext().startActivity(this.mIntent);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e(TAG, "Can't find activity to handle intent; ignoring", e8);
            }
        }
        ActionProvider actionProvider = this.mActionProvider;
        if (actionProvider != null && actionProvider.onPerformDefaultAction()) {
            return true;
        }
        return false;
    }

    public boolean isActionButton() {
        if ((this.mFlags & 32) == 32) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.mFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.mFlags & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isExclusiveCheckable() {
        if ((this.mFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.mActionProvider;
        if (actionProvider != null && actionProvider.overridesItemVisibility()) {
            if ((this.mFlags & 8) != 0 || !this.mActionProvider.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.mFlags & 8) != 0) {
            return false;
        }
        return true;
    }

    public boolean requestsActionButton() {
        if ((this.mShowAsAction & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        if ((this.mShowAsAction & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        if (!requiresActionButton() && !requestsActionButton()) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public void setActionViewExpanded(boolean z8) {
        this.mIsActionViewExpanded = z8;
        this.mMenu.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.mShortcutAlphabeticChar == c8) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c8);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.mItemCallback = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        int i8 = this.mFlags;
        int i9 = (z8 ? 1 : 0) | (i8 & (-2));
        this.mFlags = i9;
        if (i8 != i9) {
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        if ((this.mFlags & 4) != 0) {
            this.mMenu.setExclusiveItemChecked(this);
        } else {
            setCheckedInt(z8);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCheckedInt(boolean z8) {
        int i8;
        int i9 = this.mFlags;
        int i10 = i9 & (-3);
        if (z8) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int i11 = i8 | i10;
        this.mFlags = i11;
        if (i9 != i11) {
            this.mMenu.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.mFlags |= 16;
        } else {
            this.mFlags &= -17;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z8) {
        int i8;
        int i9 = this.mFlags & (-5);
        if (z8) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        this.mFlags = i8 | i9;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.mIconTintMode = mode;
        this.mHasIconTintMode = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    public void setIsActionButton(boolean z8) {
        if (z8) {
            this.mFlags |= 32;
        } else {
            this.mFlags &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        if (this.mShortcutNumericChar == c8) {
            return this;
        }
        this.mShortcutNumericChar = c8;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.mShortcutNumericChar = c8;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c9);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.mShowAsAction = i8;
        this.mMenu.onItemActionRequestChanged(this);
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.mActionProvider;
        if (actionProvider2 != null) {
            actionProvider2.reset();
        }
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        ActionProvider actionProvider3 = this.mActionProvider;
        if (actionProvider3 != null) {
            actionProvider3.setVisibilityListener(new ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z8) {
                    MenuItemImpl menuItemImpl = MenuItemImpl.this;
                    menuItemImpl.mMenu.onItemVisibleChanged(menuItemImpl);
                }
            });
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mMenu.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder = this.mSubMenu;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        if (setVisibleInt(z8)) {
            this.mMenu.onItemVisibleChanged(this);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setVisibleInt(boolean z8) {
        int i8;
        int i9 = this.mFlags;
        int i10 = i9 & (-9);
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        int i11 = i8 | i10;
        this.mFlags = i11;
        if (i9 == i11) {
            return false;
        }
        return true;
    }

    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldShowShortcut() {
        if (this.mMenu.isShortcutsVisible() && getShortcut() != 0) {
            return true;
        }
        return false;
    }

    public boolean showsTextAsAction() {
        if ((this.mShowAsAction & 4) == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        CharSequence charSequence = this.mTitle;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.mContentDescription = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.mTooltipText = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(View view) {
        int i8;
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && (i8 = this.mId) > 0) {
            view.setId(i8);
        }
        this.mMenu.onItemActionRequestChanged(this);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        if (this.mShortcutAlphabeticChar == c8 && this.mShortcutAlphabeticModifiers == i8) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c8);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i8);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c8, int i8) {
        if (this.mShortcutNumericChar == c8 && this.mShortcutNumericModifiers == i8) {
            return this;
        }
        this.mShortcutNumericChar = c8;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i8);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.mShortcutNumericChar = c8;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i8);
        this.mShortcutAlphabeticChar = Character.toLowerCase(c9);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i9);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.mIconDrawable = null;
        this.mIconResId = i8;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        return setTitle(this.mMenu.getContext().getString(i8));
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setActionView(int i8) {
        Context context = this.mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i8, (ViewGroup) new LinearLayout(context), false));
        return this;
    }
}

package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ToolbarActionBar extends ActionBar {
    final DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    final AppCompatDelegateImpl.ActionBarMenuCallback mMenuCallback;
    private boolean mMenuCallbackSet;
    private final Toolbar.OnMenuItemClickListener mMenuClicker;
    boolean mToolbarMenuPrepared;
    final Window.Callback mWindowCallback;
    private ArrayList<ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners = new ArrayList<>();
    private final Runnable mMenuInvalidator = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public void run() {
            ToolbarActionBar.this.populateOptionsMenu();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        private boolean mClosingActionMenu;

        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z8) {
            if (this.mClosingActionMenu) {
                return;
            }
            this.mClosingActionMenu = true;
            ToolbarActionBar.this.mDecorToolbar.dismissPopupMenus();
            ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, menuBuilder);
            this.mClosingActionMenu = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            if (ToolbarActionBar.this.mDecorToolbar.isOverflowMenuShowing()) {
                ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, menuBuilder);
            } else if (ToolbarActionBar.this.mWindowCallback.onPreparePanel(0, null, menuBuilder)) {
                ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, menuBuilder);
            }
        }
    }

    /* loaded from: classes.dex */
    private class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public View onCreatePanelView(int i8) {
            if (i8 == 0) {
                return new View(ToolbarActionBar.this.mDecorToolbar.getContext());
            }
            return null;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public boolean onPreparePanel(int i8) {
            if (i8 == 0) {
                ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
                if (!toolbarActionBar.mToolbarMenuPrepared) {
                    toolbarActionBar.mDecorToolbar.setMenuPrepared();
                    ToolbarActionBar.this.mToolbarMenuPrepared = true;
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ToolbarActionBar(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.mWindowCallback.onMenuItemSelected(0, menuItem);
            }
        };
        this.mMenuClicker = onMenuItemClickListener;
        Preconditions.checkNotNull(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.mDecorToolbar = toolbarWidgetWrapper;
        this.mWindowCallback = (Window.Callback) Preconditions.checkNotNull(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.mMenuCallback = new ToolbarMenuCallback();
    }

    private Menu getMenu() {
        if (!this.mMenuCallbackSet) {
            this.mDecorToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.mMenuCallbackSet = true;
        }
        return this.mDecorToolbar.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean closeOptionsMenu() {
        return this.mDecorToolbar.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        if (this.mDecorToolbar.hasExpandedActionView()) {
            this.mDecorToolbar.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z8) {
        if (z8 == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = z8;
        int size = this.mMenuVisibilityListeners.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mMenuVisibilityListeners.get(i8).onMenuVisibilityChanged(z8);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.mDecorToolbar.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return ViewCompat.getElevation(this.mDecorToolbar.getViewGroup());
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.mDecorToolbar.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.mDecorToolbar.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getTabAt(int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        return this.mDecorToolbar.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.mDecorToolbar.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        this.mDecorToolbar.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean invalidateOptionsMenu() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
        ViewCompat.postOnAnimation(this.mDecorToolbar.getViewGroup(), this.mMenuInvalidator);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        if (this.mDecorToolbar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.ActionBar
    public void onDestroy() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i8, KeyEvent keyEvent) {
        int i9;
        Menu menu = getMenu();
        if (menu == null) {
            return false;
        }
        if (keyEvent != null) {
            i9 = keyEvent.getDeviceId();
        } else {
            i9 = -1;
        }
        boolean z8 = true;
        if (KeyCharacterMap.load(i9).getKeyboardType() == 1) {
            z8 = false;
        }
        menu.setQwertyMode(z8);
        return menu.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean openOptionsMenu() {
        return this.mDecorToolbar.showOverflowMenu();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void populateOptionsMenu() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.getMenu()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuBuilder
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.MenuBuilder r1 = (androidx.appcompat.view.menu.MenuBuilder) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.stopDispatchingItemsChanged()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.mWindowCallback     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.mWindowCallback     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.startDispatchingItemsChanged()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.startDispatchingItemsChanged()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.ToolbarActionBar.populateOptionsMenu():void");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
        ViewGroup viewGroup = this.mDecorToolbar.getViewGroup();
        if (viewGroup != null && !viewGroup.hasFocus()) {
            viewGroup.requestFocus();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.mDecorToolbar.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        setCustomView(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        setDisplayOptions(i8, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void setDisplayOptions(int i8) {
        setDisplayOptions(i8, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 16;
        } else {
            i8 = 0;
        }
        setDisplayOptions(i8, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        setDisplayOptions(i8, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        setDisplayOptions(i8, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z8) {
        setDisplayOptions(z8 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f8) {
        ViewCompat.setElevation(this.mDecorToolbar.getViewGroup(), f8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.mDecorToolbar.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.mDecorToolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i8) {
        this.mDecorToolbar.setIcon(i8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.OnNavigationListener onNavigationListener) {
        this.mDecorToolbar.setDropdownParams(spinnerAdapter, new NavItemSelectedListener(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i8) {
        this.mDecorToolbar.setLogo(i8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i8) {
        if (i8 != 2) {
            this.mDecorToolbar.setNavigationMode(i8);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i8) {
        if (this.mDecorToolbar.getNavigationMode() == 1) {
            this.mDecorToolbar.setDropdownSelectedPosition(i8);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z8) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.mDecorToolbar.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        this.mDecorToolbar.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, boolean z8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i8, int i9) {
        this.mDecorToolbar.setDisplayOptions((i8 & i9) | ((~i9) & this.mDecorToolbar.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i8) {
        this.mDecorToolbar.setNavigationContentDescription(i8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i8) {
        this.mDecorToolbar.setNavigationIcon(i8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.mDecorToolbar.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i8) {
        DecorToolbar decorToolbar = this.mDecorToolbar;
        decorToolbar.setSubtitle(i8 != 0 ? decorToolbar.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i8) {
        DecorToolbar decorToolbar = this.mDecorToolbar;
        decorToolbar.setTitle(i8 != 0 ? decorToolbar.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i8, boolean z8) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i8) {
        setCustomView(LayoutInflater.from(this.mDecorToolbar.getContext()).inflate(i8, this.mDecorToolbar.getViewGroup(), false));
    }
}

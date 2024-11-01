package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private Callback mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<MenuItemImpl> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<MenuItemImpl> mItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<MenuItemImpl> mActionItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface Callback {
        boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);

        void onMenuModeChange(@NonNull MenuBuilder menuBuilder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private MenuItemImpl createNewMenuItem(int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        return new MenuItemImpl(this, i8, i9, i10, i11, charSequence, i12);
    }

    private void dispatchPresenterUpdate(boolean z8) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                menuPresenter.updateMenuView(z8);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray != null && !this.mPresenters.isEmpty()) {
            Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(next);
                } else {
                    int id = menuPresenter.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        menuPresenter.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (onSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder subMenuBuilder, MenuPresenter menuPresenter) {
        boolean z8 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        if (menuPresenter != null) {
            z8 = menuPresenter.onSubMenuSelected(subMenuBuilder);
        }
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter2 = next.get();
            if (menuPresenter2 == null) {
                this.mPresenters.remove(next);
            } else if (!z8) {
                z8 = menuPresenter2.onSubMenuSelected(subMenuBuilder);
            }
        }
        return z8;
    }

    private static int findInsertIndex(ArrayList<MenuItemImpl> arrayList, int i8) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i8) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i8) {
        int i9 = ((-65536) & i8) >> 16;
        if (i9 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i9 < iArr.length) {
                return (i8 & 65535) | (iArr[i9] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i8, boolean z8) {
        if (i8 >= 0 && i8 < this.mItems.size()) {
            this.mItems.remove(i8);
            if (z8) {
                onItemsChanged(true);
            }
        }
    }

    private void setHeaderInternal(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i8 > 0) {
                this.mHeaderTitle = resources.getText(i8);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i9 > 0) {
                this.mHeaderIcon = ContextCompat.getDrawable(getContext(), i9);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:            if (androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration.get(r2.mContext), r2.mContext) != false) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setShortcutsVisibleInner(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.setShortcutsVisibleInner(boolean):void");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        Intent intent2;
        int i13;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i12 = queryIntentActivityOptions.size();
        } else {
            i12 = 0;
        }
        if ((i11 & 1) == 0) {
            removeGroup(i8);
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            if (i15 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i15];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i8, i9, i10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = intent4;
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuItem addInternal(int i8, int i9, int i10, CharSequence charSequence) {
        int ordering = getOrdering(i10);
        MenuItemImpl createNewMenuItem = createNewMenuItem(i8, i9, i10, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.setMenuInfo(contextMenuInfo);
        }
        ArrayList<MenuItemImpl> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.mExpandedItem;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z8) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                menuPresenter.onCloseMenu(this, z8);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        boolean z8 = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == menuItemImpl) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(next);
                } else {
                    z8 = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (z8) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z8) {
                this.mExpandedItem = null;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dispatchMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        Callback callback = this.mCallback;
        if (callback != null && callback.onMenuItemSelected(menuBuilder, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        boolean z8 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                z8 = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (z8) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z8) {
            this.mExpandedItem = menuItemImpl;
        }
        return z8;
    }

    public int findGroupIndex(int i8) {
        return findGroupIndex(i8, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        MenuItem findItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i9);
            if (menuItemImpl.getItemId() == i8) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i8)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.mItems.get(i9).getItemId() == i8) {
                return i9;
            }
        }
        return -1;
    }

    MenuItemImpl findItemWithShortcutForKey(int i8, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<MenuItemImpl> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = arrayList.get(i9);
            if (isQwertyMode) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && numericShortcut == '\b' && i8 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    void findItemsWithShortcutForKey(List<MenuItemImpl> list, int i8, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i8 != 67) {
            return;
        }
        int size = this.mItems.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i9);
            if (menuItemImpl.hasSubMenu()) {
                ((MenuBuilder) menuItemImpl.getSubMenu()).findItemsWithShortcutForKey(list, i8, keyEvent);
            }
            if (isQwertyMode) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            if (isQwertyMode) {
                numericModifiers = menuItemImpl.getAlphabeticModifiers();
            } else {
                numericModifiers = menuItemImpl.getNumericModifiers();
            }
            if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == (numericModifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (isQwertyMode && numericShortcut == '\b' && i8 == 67)) && menuItemImpl.isEnabled()) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems = getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                z8 |= menuPresenter.flagActionItems();
            }
        }
        if (z8) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            int size = visibleItems.size();
            for (int i8 = 0; i8 < size; i8++) {
                MenuItemImpl menuItemImpl = visibleItems.get(i8);
                if (menuItemImpl.isActionButton()) {
                    this.mActionItems.add(menuItemImpl);
                } else {
                    this.mNonActionItems.add(menuItemImpl);
                }
            }
        } else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll(getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }

    public ArrayList<MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return this.mItems.get(i8);
    }

    public ArrayList<MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    Resources getResources() {
        return this.mResources;
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    @NonNull
    public ArrayList<MenuItemImpl> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i8);
            if (menuItemImpl.isVisible()) {
                this.mVisibleItems.add(menuItemImpl);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.mItems.get(i8).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        if (findItemWithShortcutForKey(i8, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z8) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z8) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(z8);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z8) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return performItemAction(findItem(i8), i9);
    }

    public boolean performItemAction(MenuItem menuItem, int i8) {
        return performItemAction(menuItem, null, i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        boolean z8;
        MenuItemImpl findItemWithShortcutForKey = findItemWithShortcutForKey(i8, keyEvent);
        if (findItemWithShortcutForKey != null) {
            z8 = performItemAction(findItemWithShortcutForKey, i9);
        } else {
            z8 = false;
        }
        if ((i9 & 2) != 0) {
            close(true);
        }
        return z8;
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        int findGroupIndex = findGroupIndex(i8);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= size || this.mItems.get(findGroupIndex).getGroupId() != i8) {
                    break;
                }
                removeItemAtInt(findGroupIndex, false);
                i9 = i10;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        removeItemAtInt(findItemIndex(i8), true);
    }

    public void removeItemAt(int i8) {
        removeItemAtInt(i8, true);
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter2 = next.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i9 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i9 > 0 && (findItem = findItem(i9)) != null) {
            findItem.expandActionView();
        }
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public MenuBuilder setDefaultShowAsAction(int i8) {
        this.mDefaultShowAsAction = i8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExclusiveItemChecked(MenuItem menuItem) {
        boolean z8;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i8);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                if (menuItemImpl == menuItem) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                menuItemImpl.setCheckedInt(z8);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z8, boolean z9) {
        int size = this.mItems.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i9);
            if (menuItemImpl.getGroupId() == i8) {
                menuItemImpl.setExclusiveCheckable(z9);
                menuItemImpl.setCheckable(z8);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.mGroupDividerEnabled = z8;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z8) {
        int size = this.mItems.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i9);
            if (menuItemImpl.getGroupId() == i8) {
                menuItemImpl.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z8) {
        int size = this.mItems.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i9);
            if (menuItemImpl.getGroupId() == i8 && menuItemImpl.setVisibleInt(z8)) {
                z9 = true;
            }
        }
        if (z9) {
            onItemsChanged(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z8) {
        this.mOptionalIconsVisible = z8;
    }

    public void setOverrideVisibleItems(boolean z8) {
        this.mOverrideVisibleItems = z8;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.mQwertyMode = z8;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z8) {
        if (this.mShortcutsVisible == z8) {
            return;
        }
        setShortcutsVisibleInner(z8);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return addInternal(0, 0, 0, this.mResources.getString(i8));
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.mPresenters.add(new WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i8));
    }

    public int findGroupIndex(int i8, int i9) {
        int size = size();
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < size) {
            if (this.mItems.get(i9).getGroupId() == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i8) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean invoke = menuItemImpl.invoke();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z8 = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.hasCollapsibleActionView()) {
            invoke |= menuItemImpl.expandActionView();
            if (invoke) {
                close(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z8) {
            if ((i8 & 4) == 0) {
                close(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.setSubMenu(new SubMenuBuilder(getContext(), this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z8) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            invoke |= dispatchSubMenuSelected(subMenuBuilder, menuPresenter);
            if (!invoke) {
                close(true);
            }
        } else if ((i8 & 1) == 0) {
            close(true);
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderIconInt(int i8) {
        setHeaderInternal(0, null, i8, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderTitleInt(int i8) {
        setHeaderInternal(i8, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return addInternal(i8, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i8, i9, i10, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return addInternal(i8, i9, i10, this.mResources.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, this.mResources.getString(i11));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}

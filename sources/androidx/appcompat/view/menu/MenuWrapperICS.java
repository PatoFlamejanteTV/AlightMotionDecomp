package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {
    private final SupportMenu mWrappedObject;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu != null) {
            this.mWrappedObject = supportMenu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.mWrappedObject.addIntentOptions(i8, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = getMenuItemWrapper(menuItemArr2[i12]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        internalClear();
        this.mWrappedObject.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.mWrappedObject.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        return getMenuItemWrapper(this.mWrappedObject.findItem(i8));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return getMenuItemWrapper(this.mWrappedObject.getItem(i8));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.mWrappedObject.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return this.mWrappedObject.isShortcutKey(i8, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return this.mWrappedObject.performIdentifierAction(i8, i9);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        return this.mWrappedObject.performShortcut(i8, keyEvent, i9);
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        internalRemoveGroup(i8);
        this.mWrappedObject.removeGroup(i8);
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        internalRemoveItem(i8);
        this.mWrappedObject.removeItem(i8);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z8, boolean z9) {
        this.mWrappedObject.setGroupCheckable(i8, z8, z9);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z8) {
        this.mWrappedObject.setGroupEnabled(i8, z8);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z8) {
        this.mWrappedObject.setGroupVisible(i8, z8);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.mWrappedObject.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mWrappedObject.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return getMenuItemWrapper(this.mWrappedObject.add(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i8));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(i8, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i8, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return getMenuItemWrapper(this.mWrappedObject.add(i8, i9, i10, i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i8, i9, i10, i11));
    }
}

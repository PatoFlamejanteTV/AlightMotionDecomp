package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {
    MenuBuilder mAdapterMenu;
    private int mExpandedIndex = -1;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z8, int i8) {
        this.mOverflowOnly = z8;
        this.mInflater = layoutInflater;
        this.mAdapterMenu = menuBuilder;
        this.mItemLayoutRes = i8;
        findExpandedIndex();
    }

    void findExpandedIndex() {
        MenuItemImpl expandedItem = this.mAdapterMenu.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = this.mAdapterMenu.getNonActionItems();
            int size = nonActionItems.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (nonActionItems.get(i8) == expandedItem) {
                    this.mExpandedIndex = i8;
                    return;
                }
            }
        }
        this.mExpandedIndex = -1;
    }

    public MenuBuilder getAdapterMenu() {
        return this.mAdapterMenu;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> visibleItems;
        if (this.mOverflowOnly) {
            visibleItems = this.mAdapterMenu.getNonActionItems();
        } else {
            visibleItems = this.mAdapterMenu.getVisibleItems();
        }
        if (this.mExpandedIndex < 0) {
            return visibleItems.size();
        }
        return visibleItems.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        int i9;
        boolean z8;
        if (view == null) {
            view = this.mInflater.inflate(this.mItemLayoutRes, viewGroup, false);
        }
        int groupId = getItem(i8).getGroupId();
        int i10 = i8 - 1;
        if (i10 >= 0) {
            i9 = getItem(i10).getGroupId();
        } else {
            i9 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.mAdapterMenu.isGroupDividerEnabled() && groupId != i9) {
            z8 = true;
        } else {
            z8 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.mForceShowIcon) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i8), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z8) {
        this.mForceShowIcon = z8;
    }

    @Override // android.widget.Adapter
    public MenuItemImpl getItem(int i8) {
        ArrayList<MenuItemImpl> nonActionItems = this.mOverflowOnly ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
        int i9 = this.mExpandedIndex;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return nonActionItems.get(i8);
    }
}

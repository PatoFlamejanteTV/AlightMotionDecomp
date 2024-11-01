package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final Function0 onActionModeDestroy;
    private Function0 onCopyRequested;
    private Function0 onCutRequested;
    private Function0 onPasteRequested;
    private Function0 onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, Function0 function0) {
        if (function0 != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else if (function0 == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final Function0 getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final Function0 getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final Function0 getOnCutRequested() {
        return this.onCutRequested;
    }

    public final Function0 getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final Function0 getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        AbstractC3292y.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0 function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0 function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0 function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            Function0 function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Copy);
                }
                if (this.onPasteRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Paste);
                }
                if (this.onCutRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Cut);
                }
                if (this.onSelectAllRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final void onDestroyActionMode() {
        Function0 function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            updateMenuItems$ui_release(menu);
            return true;
        }
        return false;
    }

    public final void setOnCopyRequested(Function0 function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(Function0 function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(Function0 function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(Function0 function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
    }

    public /* synthetic */ TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : function0, (i8 & 2) != 0 ? Rect.Companion.getZero() : rect, (i8 & 4) != 0 ? null : function02, (i8 & 8) != 0 ? null : function03, (i8 & 16) != 0 ? null : function04, (i8 & 32) != 0 ? null : function05);
    }
}

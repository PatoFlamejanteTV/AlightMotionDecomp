package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public GroupSourceInformation(int i8, String str) {
        this.key = i8;
        this.sourceInformation = str;
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(obj);
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            if (AbstractC3292y.d(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor))) {
                return true;
            }
        }
        return false;
    }

    private final GroupSourceInformation openInformation() {
        Object obj;
        GroupSourceInformation openInformation;
        ArrayList<Object> arrayList = this.groups;
        GroupSourceInformation groupSourceInformation = null;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
        }
        obj = null;
        if (obj instanceof GroupSourceInformation) {
            groupSourceInformation = (GroupSourceInformation) obj;
        }
        if (groupSourceInformation == null || (openInformation = groupSourceInformation.openInformation()) == null) {
            return this;
        }
        return openInformation;
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i8, int i9) {
        Anchor tryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i10 = 0;
        if (i8 >= 0 && (tryAnchor$runtime_release = slotWriter.tryAnchor$runtime_release(i8)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    if (AbstractC3292y.d(obj, tryAnchor$runtime_release) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(tryAnchor$runtime_release))) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        arrayList.add(i10, slotWriter.anchor(i9));
    }

    public final void close() {
        this.closed = true;
    }

    public final void endGrouplessCall() {
        openInformation().close();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (AbstractC3292y.d(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(SlotWriter slotWriter, int i8) {
        openInformation().add(slotWriter.anchor(i8));
    }

    public final void setClosed(boolean z8) {
        this.closed = z8;
    }

    public final void setGroups(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i8, String str) {
        openInformation().add(new GroupSourceInformation(i8, str));
    }

    public final void reportGroup(SlotTable slotTable, int i8) {
        openInformation().add(slotTable.anchor(i8));
    }
}

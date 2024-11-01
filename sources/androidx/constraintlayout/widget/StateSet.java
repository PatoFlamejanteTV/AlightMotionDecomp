package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    ConstraintSet mDefaultConstraintSet;
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f8, float f9) {
            for (int i8 = 0; i8 < this.mVariants.size(); i8++) {
                if (this.mVariants.get(i8).match(f8, f9)) {
                    return i8;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean match(float f8, float f9) {
            if (!Float.isNaN(this.mMinWidth) && f8 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f9 < this.mMinHeight) {
                return false;
            }
            if (!Float.isNaN(this.mMaxWidth) && f8 > this.mMaxWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMaxHeight) && f9 > this.mMaxHeight) {
                return false;
            }
            return true;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        load(context, xmlPullParser);
    }

    private void load(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == R.styleable.StateSet_defaultState) {
                this.mDefaultState = obtainStyledAttributes.getResourceId(index, this.mDefaultState);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            State state = null;
            while (true) {
                char c8 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c8 = 2;
                                        break;
                                    }
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c8 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c8 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c8 = 65535;
                            if (c8 != 2) {
                                if (c8 == 3) {
                                    Variant variant = new Variant(context, xmlPullParser);
                                    if (state != null) {
                                        state.add(variant);
                                    }
                                }
                            } else {
                                state = new State(context, xmlPullParser);
                                this.mStateList.put(state.mId, state);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    public int convertToConstraintSet(int i8, int i9, float f8, float f9) {
        State state = this.mStateList.get(i9);
        if (state == null) {
            return i9;
        }
        if (f8 != -1.0f && f9 != -1.0f) {
            Iterator<Variant> it = state.mVariants.iterator();
            Variant variant = null;
            while (it.hasNext()) {
                Variant next = it.next();
                if (next.match(f8, f9)) {
                    if (i8 == next.mConstraintID) {
                        return i8;
                    }
                    variant = next;
                }
            }
            if (variant != null) {
                return variant.mConstraintID;
            }
            return state.mConstraintID;
        }
        if (state.mConstraintID == i8) {
            return i8;
        }
        Iterator<Variant> it2 = state.mVariants.iterator();
        while (it2.hasNext()) {
            if (i8 == it2.next().mConstraintID) {
                return i8;
            }
        }
        return state.mConstraintID;
    }

    public boolean needsToChange(int i8, float f8, float f9) {
        State state;
        int i9 = this.mCurrentStateId;
        if (i9 != i8) {
            return true;
        }
        if (i8 == -1) {
            state = this.mStateList.valueAt(0);
        } else {
            state = this.mStateList.get(i9);
        }
        State state2 = state;
        int i10 = this.mCurrentConstraintNumber;
        if ((i10 == -1 || !state2.mVariants.get(i10).match(f8, f9)) && this.mCurrentConstraintNumber != state2.findMatch(f8, f9)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i8, int i9, int i10) {
        return updateConstraints(-1, i8, i9, i10);
    }

    public int updateConstraints(int i8, int i9, float f8, float f9) {
        State state;
        if (i8 == i9) {
            if (i9 == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(this.mCurrentStateId);
            }
            if (state == null) {
                return -1;
            }
            if (this.mCurrentConstraintNumber != -1 && state.mVariants.get(i8).match(f8, f9)) {
                return i8;
            }
            int findMatch = state.findMatch(f8, f9);
            if (i8 == findMatch) {
                return i8;
            }
            if (findMatch == -1) {
                return state.mConstraintID;
            }
            return state.mVariants.get(findMatch).mConstraintID;
        }
        State state2 = this.mStateList.get(i9);
        if (state2 == null) {
            return -1;
        }
        int findMatch2 = state2.findMatch(f8, f9);
        if (findMatch2 == -1) {
            return state2.mConstraintID;
        }
        return state2.mVariants.get(findMatch2).mConstraintID;
    }
}
